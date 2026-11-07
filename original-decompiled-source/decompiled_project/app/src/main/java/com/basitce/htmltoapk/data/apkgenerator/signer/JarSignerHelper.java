package com.basitce.htmltoapk.data.apkgenerator.signer;

import b.o;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import i8.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.r;
import lh.l;
import mh.t;
import org.bouncycastle.cert.jcajce.JcaCertStore;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.encoders.Base64;
import pg.f0;
import qg.q;
import qg.x;
import r.e2;

/* loaded from: classes.dex */
public final class JarSignerHelper {
    public static final int $stable = 0;
    public static final JarSignerHelper INSTANCE = new JarSignerHelper();

    public static final class EntryInfo {
        private final long crc;
        private final File dataFile;
        private final String digest;
        private final String name;
        private final long size;

        public EntryInfo(String name, File dataFile, long j10, long j11, String digest) {
            r.e(name, "name");
            r.e(dataFile, "dataFile");
            r.e(digest, "digest");
            this.name = name;
            this.dataFile = dataFile;
            this.size = j10;
            this.crc = j11;
            this.digest = digest;
        }

        public static /* synthetic */ EntryInfo copy$default(EntryInfo entryInfo, String str, File file, long j10, long j11, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = entryInfo.name;
            }
            if ((i10 & 2) != 0) {
                file = entryInfo.dataFile;
            }
            if ((i10 & 4) != 0) {
                j10 = entryInfo.size;
            }
            if ((i10 & 8) != 0) {
                j11 = entryInfo.crc;
            }
            if ((i10 & 16) != 0) {
                str2 = entryInfo.digest;
            }
            String str3 = str2;
            long j12 = j11;
            return entryInfo.copy(str, file, j10, j12, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final File component2() {
            return this.dataFile;
        }

        public final long component3() {
            return this.size;
        }

        public final long component4() {
            return this.crc;
        }

        public final String component5() {
            return this.digest;
        }

        public final EntryInfo copy(String name, File dataFile, long j10, long j11, String digest) {
            r.e(name, "name");
            r.e(dataFile, "dataFile");
            r.e(digest, "digest");
            return new EntryInfo(name, dataFile, j10, j11, digest);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntryInfo)) {
                return false;
            }
            EntryInfo entryInfo = (EntryInfo) obj;
            return r.a(this.name, entryInfo.name) && r.a(this.dataFile, entryInfo.dataFile) && this.size == entryInfo.size && this.crc == entryInfo.crc && r.a(this.digest, entryInfo.digest);
        }

        public final long getCrc() {
            return this.crc;
        }

        public final File getDataFile() {
            return this.dataFile;
        }

        public final String getDigest() {
            return this.digest;
        }

        public final String getName() {
            return this.name;
        }

        public final long getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.digest.hashCode() + e2.a(e2.a((this.dataFile.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.size), 31, this.crc);
        }

        public String toString() {
            String str = this.name;
            File file = this.dataFile;
            long j10 = this.size;
            long j11 = this.crc;
            String str2 = this.digest;
            StringBuilder sb = new StringBuilder("EntryInfo(name=");
            sb.append(str);
            sb.append(", dataFile=");
            sb.append(file);
            sb.append(", size=");
            sb.append(j10);
            sb.append(", crc=");
            sb.append(j11);
            sb.append(", digest=");
            return o.a(sb, str2, ")");
        }
    }

    private JarSignerHelper() {
    }

    private final String base64Encode(byte[] bArr) {
        String base64String = Base64.toBase64String(bArr);
        r.d(base64String, "toBase64String(...)");
        return base64String;
    }

    private final byte[] buildPkcs7Signature(byte[] bArr, PrivateKey privateKey, List<? extends X509Certificate> list) throws CMSException, OperatorCreationException, IOException {
        CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
        cMSSignedDataGenerator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().setProvider(new BouncyCastleProvider()).build()).build(new JcaContentSignerBuilder("SHA256withRSA").build(privateKey), (X509Certificate) x.B(list)));
        cMSSignedDataGenerator.addCertificates(new JcaCertStore(list));
        byte[] encoded = cMSSignedDataGenerator.generate(new CMSProcessableByteArray(bArr), true).getEncoded();
        r.d(encoded, "getEncoded(...)");
        return encoded;
    }

    private final byte[] buildSignatureFile(byte[] bArr, SortedMap<String, EntryInfo> sortedMap) throws NoSuchAlgorithmException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = mh.a.f18238b;
        byte[] bytes = "Signature-Version: 1.0\r\n".getBytes(charset);
        r.d(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
        byte[] bytes2 = "Created-By: HTML to APK Builder\r\n".getBytes(charset);
        r.d(bytes2, "getBytes(...)");
        byteArrayOutputStream.write(bytes2);
        byte[] bytes3 = ("SHA-256-Digest-Manifest: " + sha256Base64(bArr) + "\r\n").getBytes(charset);
        r.d(bytes3, "getBytes(...)");
        byteArrayOutputStream.write(bytes3);
        byte[] bytes4 = "\r\n".getBytes(charset);
        r.d(bytes4, "getBytes(...)");
        byteArrayOutputStream.write(bytes4);
        for (Map.Entry<String, EntryInfo> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            EntryInfo value = entry.getValue();
            String strD = n.d("Name: ", key, "\r\n");
            Charset charset2 = mh.a.f18238b;
            byte[] bytes5 = strD.getBytes(charset2);
            r.d(bytes5, "getBytes(...)");
            byteArrayOutputStream.write(bytes5);
            byte[] bytes6 = ("SHA-256-Digest: " + value.getDigest() + "\r\n").getBytes(charset2);
            r.d(bytes6, "getBytes(...)");
            byteArrayOutputStream.write(bytes6);
            byte[] bytes7 = "\r\n".getBytes(charset2);
            r.d(bytes7, "getBytes(...)");
            byteArrayOutputStream.write(bytes7);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        r.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private final File createTempDirectory(String str) {
        String property = System.getProperty("java.io.tmpdir");
        if (property == null) {
            property = "/tmp";
        }
        File file = new File(property, str + System.nanoTime());
        file.mkdirs();
        return file;
    }

    private final String sanitizeEntryFileName(String str) {
        String strM = t.m(t.m(str, '/', '_'), '\\', '_');
        if (mh.x.A(strM)) {
            strM = null;
        }
        return strM == null ? "entry" : strM;
    }

    private final String sha256Base64(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        r.d(bArrDigest, "digest(...)");
        return base64Encode(bArrDigest);
    }

    private final void writeContentEntry(ZipOutputStream zipOutputStream, EntryInfo entryInfo) throws IOException {
        ZipEntry zipEntry = new ZipEntry(entryInfo.getName());
        zipEntry.setMethod(8);
        zipOutputStream.putNextEntry(zipEntry);
        FileInputStream fileInputStream = new FileInputStream(entryInfo.getDataFile());
        try {
            ah.b.a(fileInputStream, zipOutputStream, 8192);
            fileInputStream.close();
            zipOutputStream.closeEntry();
        } finally {
        }
    }

    private final void writeStoredEntry(ZipOutputStream zipOutputStream, String str, byte[] bArr) throws IOException {
        ZipEntry zipEntry = new ZipEntry(str);
        zipEntry.setMethod(0);
        zipEntry.setSize(bArr.length);
        zipEntry.setCompressedSize(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        zipEntry.setCrc(crc32.getValue());
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
    }

    /* JADX WARN: Finally extract failed */
    public final void signJar(File inputJar, File outputJar, File keystoreFile, String keystorePassword, String keyAlias, String keyPassword, String keystoreType) throws Throwable {
        Throwable th2;
        Iterator it;
        r.e(inputJar, "inputJar");
        r.e(outputJar, "outputJar");
        r.e(keystoreFile, "keystoreFile");
        r.e(keystorePassword, "keystorePassword");
        r.e(keyAlias, "keyAlias");
        r.e(keyPassword, "keyPassword");
        r.e(keystoreType, "keystoreType");
        boolean z10 = false;
        BuildLogger.INSTANCE.detail(R.string.build_log_aab_jar_started, new Object[0]);
        KeyStore keyStore = keystoreType.equalsIgnoreCase("PKCS12") ? KeyStore.getInstance("PKCS12", new BouncyCastleProvider()) : KeyStore.getInstance(keystoreType);
        FileInputStream fileInputStream = new FileInputStream(keystoreFile);
        try {
            char[] charArray = keystorePassword.toCharArray();
            r.d(charArray, "toCharArray(...)");
            keyStore.load(fileInputStream, charArray);
            f0 f0Var = f0.f21461a;
            fileInputStream.close();
            char[] charArray2 = keyPassword.toCharArray();
            r.d(charArray2, "toCharArray(...)");
            Key key = keyStore.getKey(keyAlias, charArray2);
            r.c(key, "null cannot be cast to non-null type java.security.PrivateKey");
            PrivateKey privateKey = (PrivateKey) key;
            Certificate[] certificateChain = keyStore.getCertificateChain(keyAlias);
            r.d(certificateChain, "getCertificateChain(...)");
            ArrayList arrayList = new ArrayList(certificateChain.length);
            for (Certificate certificate : certificateChain) {
                r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            File fileCreateTempDirectory = createTempDirectory("jar_sign_");
            TreeMap treeMap = new TreeMap();
            try {
                try {
                    ZipFile zipFile = new ZipFile(inputJar);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        r.d(enumerationEntries, "entries(...)");
                        Iterator it2 = ((lh.a) l.g(new q(enumerationEntries))).iterator();
                        while (it2.hasNext()) {
                            ZipEntry zipEntry = (ZipEntry) it2.next();
                            String name = zipEntry.getName();
                            r.d(name, "getName(...)");
                            if (t.p(name, "META-INF/", z10)) {
                                it = it2;
                                keystoreFile = fileCreateTempDirectory;
                            } else {
                                JarSignerHelper jarSignerHelper = INSTANCE;
                                String name2 = zipEntry.getName();
                                r.d(name2, "getName(...)");
                                File file = new File(fileCreateTempDirectory, jarSignerHelper.sanitizeEntryFileName(name2));
                                File parentFile = file.getParentFile();
                                if (parentFile != null) {
                                    try {
                                        parentFile.mkdirs();
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        keystoreFile = fileCreateTempDirectory;
                                        try {
                                            throw th2;
                                        } catch (Throwable th4) {
                                            ah.c.a(zipFile, th2);
                                            throw th4;
                                        }
                                    }
                                }
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                CRC32 crc32 = new CRC32();
                                InputStream inputStream = zipFile.getInputStream(zipEntry);
                                it = it2;
                                try {
                                    keystoreFile = fileCreateTempDirectory;
                                    try {
                                        CheckedInputStream checkedInputStream = new CheckedInputStream(new DigestInputStream(inputStream, messageDigest), crc32);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            ah.b.a(checkedInputStream, fileOutputStream, 8192);
                                            fileOutputStream.close();
                                            try {
                                                ah.c.a(inputStream, null);
                                                String name3 = zipEntry.getName();
                                                String name4 = zipEntry.getName();
                                                r.d(name4, "getName(...)");
                                                long length = file.length();
                                                long value = crc32.getValue();
                                                byte[] bArrDigest = messageDigest.digest();
                                                r.d(bArrDigest, "digest(...)");
                                                treeMap.put(name3, new EntryInfo(name4, file, length, value, jarSignerHelper.base64Encode(bArrDigest)));
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th2 = th;
                                                throw th2;
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        Throwable th7 = th;
                                        try {
                                            throw th7;
                                        } catch (Throwable th8) {
                                            ah.c.a(inputStream, th7);
                                            throw th8;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    keystoreFile = fileCreateTempDirectory;
                                }
                            }
                            it2 = it;
                            fileCreateTempDirectory = keystoreFile;
                            z10 = false;
                        }
                        keystoreFile = fileCreateTempDirectory;
                        f0 f0Var2 = f0.f21461a;
                        zipFile.close();
                        Manifest manifest = new Manifest();
                        Attributes mainAttributes = manifest.getMainAttributes();
                        r.d(mainAttributes, "getMainAttributes(...)");
                        mainAttributes.put(Attributes.Name.MANIFEST_VERSION, "1.0");
                        Attributes mainAttributes2 = manifest.getMainAttributes();
                        r.d(mainAttributes2, "getMainAttributes(...)");
                        mainAttributes2.put(new Attributes.Name("Created-By"), "HTML to APK Builder");
                        for (Map.Entry entry : treeMap.entrySet()) {
                            String str = (String) entry.getKey();
                            EntryInfo entryInfo = (EntryInfo) entry.getValue();
                            Map<String, Attributes> entries = manifest.getEntries();
                            r.d(entries, "getEntries(...)");
                            Attributes attributes = new Attributes();
                            attributes.put(new Attributes.Name("SHA-256-Digest"), entryInfo.getDigest());
                            entries.put(str, attributes);
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        manifest.write(byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        r.b(byteArray);
                        byte[] bArrBuildSignatureFile = buildSignatureFile(byteArray, treeMap);
                        byte[] bArrBuildPkcs7Signature = buildPkcs7Signature(bArrBuildSignatureFile, privateKey, arrayList);
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(outputJar));
                        try {
                            JarSignerHelper jarSignerHelper2 = INSTANCE;
                            jarSignerHelper2.writeStoredEntry(zipOutputStream, "META-INF/MANIFEST.MF", byteArray);
                            jarSignerHelper2.writeStoredEntry(zipOutputStream, "META-INF/CERT.SF", bArrBuildSignatureFile);
                            jarSignerHelper2.writeStoredEntry(zipOutputStream, "META-INF/CERT.RSA", bArrBuildPkcs7Signature);
                            Iterator it3 = treeMap.entrySet().iterator();
                            while (it3.hasNext()) {
                                INSTANCE.writeContentEntry(zipOutputStream, (EntryInfo) ((Map.Entry) it3.next()).getValue());
                            }
                            f0 f0Var3 = f0.f21461a;
                            zipOutputStream.close();
                            BuildLogger.INSTANCE.detail(R.string.build_log_aab_jar_written, Long.valueOf(outputJar.length()));
                            ah.l.f(keystoreFile);
                        } catch (Throwable th10) {
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                ah.c.a(zipOutputStream, th10);
                                throw th11;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        keystoreFile = fileCreateTempDirectory;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    ah.l.f(keystoreFile);
                    throw th;
                }
            } catch (Throwable th14) {
                th = th14;
                keystoreFile = fileCreateTempDirectory;
                ah.l.f(keystoreFile);
                throw th;
            }
        } finally {
        }
    }
}
