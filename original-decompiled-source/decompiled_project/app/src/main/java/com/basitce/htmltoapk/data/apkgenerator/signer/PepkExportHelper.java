package com.basitce.htmltoapk.data.apkgenerator.signer;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import c2.u;
import g8.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;
import pg.f0;

/* loaded from: classes.dex */
public final class PepkExportHelper {
    public static final int $stable = 0;
    public static final PepkExportHelper INSTANCE = new PepkExportHelper();

    private PepkExportHelper() {
    }

    private final String certificateToPem(X509Certificate x509Certificate) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JcaPEMWriter jcaPEMWriter = new JcaPEMWriter(stringWriter);
        try {
            jcaPEMWriter.writeObject(x509Certificate);
            f0 f0Var = f0.f21461a;
            jcaPEMWriter.close();
            String string = stringWriter.toString();
            r.d(string, "toString(...)");
            return string;
        } finally {
        }
    }

    private final byte[] encryptPrivateKeyRsaAes(RSAPublicKey rSAPublicKey, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AESWrapPad");
        cipher.init(3, secretKeySpec);
        byte[] bArrWrap = cipher.wrap(new SecretKeySpec(bArr, "AES"));
        Cipher cipher2 = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
        cipher2.init(1, rSAPublicKey);
        byte[] bArrDoFinal = cipher2.doFinal(bArr2);
        r.b(bArrDoFinal);
        r.b(bArrWrap);
        int length = bArrDoFinal.length;
        int length2 = bArrWrap.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, length + length2);
        System.arraycopy(bArrWrap, 0, bArrCopyOf, length, length2);
        r.b(bArrCopyOf);
        return bArrCopyOf;
    }

    private final byte[] hexToBytes(String input) {
        Pattern patternCompile = Pattern.compile("[^0-9a-fA-F]");
        r.d(patternCompile, "compile(...)");
        r.e(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        r.d(strReplaceAll, "replaceAll(...)");
        if (strReplaceAll.length() % 2 != 0) {
            throw new IllegalArgumentException("Hex string must have even length");
        }
        int length = strReplaceAll.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            String strSubstring = strReplaceAll.substring(i11, i11 + 2);
            r.d(strSubstring, "substring(...)");
            w.h(16);
            bArr[i10] = (byte) Integer.parseInt(strSubstring, 16);
        }
        return bArr;
    }

    private final KeyStore loadKeyStore(File file, String str) throws IOException, KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            char[] charArray = str.toCharArray();
            r.d(charArray, "toCharArray(...)");
            keyStore.load(fileInputStream, charArray);
            f0 f0Var = f0.f21461a;
            fileInputStream.close();
            return keyStore;
        } finally {
        }
    }

    private final RSAPublicKey parseRsaPublicKeyFromPem(String str) throws InvalidKeySpecException {
        String strN = t.n(t.n(t.n(t.n(str, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), "-----BEGIN RSA PUBLIC KEY-----", ""), "-----END RSA PUBLIC KEY-----", "");
        Pattern patternCompile = Pattern.compile("\\s+");
        r.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strN).replaceAll("");
        r.d(strReplaceAll, "replaceAll(...)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(strReplaceAll, 0)));
        r.c(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
        return (RSAPublicKey) publicKeyGeneratePublic;
    }

    private final String privateKeyToPem(Key key) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PemWriter pemWriter = new PemWriter(stringWriter);
        try {
            pemWriter.writeObject(new PemObject(PEMParser.TYPE_PRIVATE_KEY, key.getEncoded()));
            f0 f0Var = f0.f21461a;
            pemWriter.close();
            String string = stringWriter.toString();
            r.d(string, "toString(...)");
            return string;
        } finally {
        }
    }

    private final File writePepkZip(Context context, byte[] bArr, X509Certificate x509Certificate) throws IOException {
        File file = new File(context.getCacheDir(), u.a("pepk_export_", ".zip", System.currentTimeMillis()));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
        try {
            zipOutputStream.putNextEntry(new ZipEntry("encryptedPrivateKey"));
            zipOutputStream.write(bArr);
            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("certificate.pem"));
            String strCertificateToPem = INSTANCE.certificateToPem(x509Certificate);
            Charset UTF_8 = StandardCharsets.UTF_8;
            r.d(UTF_8, "UTF_8");
            byte[] bytes = strCertificateToPem.getBytes(UTF_8);
            r.d(bytes, "getBytes(...)");
            zipOutputStream.write(bytes);
            zipOutputStream.closeEntry();
            f0 f0Var = f0.f21461a;
            zipOutputStream.close();
            return file;
        } finally {
        }
    }

    public final File exportWithHexKey(Context context, File keystoreFile, String password, String alias, String hexPublicKey) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        r.e(context, "context");
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(hexPublicKey, "hexPublicKey");
        try {
            KeyStore keyStoreLoadKeyStore = loadKeyStore(keystoreFile, password);
            char[] charArray = password.toCharArray();
            r.d(charArray, "toCharArray(...)");
            Key key = keyStoreLoadKeyStore.getKey(alias, charArray);
            if (key == null) {
                throw new IllegalArgumentException("No private key for alias ".concat(alias));
            }
            Certificate certificate = keyStoreLoadKeyStore.getCertificate(alias);
            X509Certificate x509Certificate = certificate instanceof X509Certificate ? (X509Certificate) certificate : null;
            if (x509Certificate == null) {
                throw new IllegalArgumentException("No certificate for alias ".concat(alias));
            }
            pe.a aVar = new pe.a(hexToBytes(x.W(hexPublicKey).toString()));
            String strPrivateKeyToPem = privateKeyToPem(key);
            Charset US_ASCII = StandardCharsets.US_ASCII;
            r.d(US_ASCII, "US_ASCII");
            byte[] bytes = strPrivateKeyToPem.getBytes(US_ASCII);
            r.d(bytes, "getBytes(...)");
            byte[] bArrA = aVar.a(bytes);
            r.b(bArrA);
            return writePepkZip(context, bArrA, x509Certificate);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final File exportWithRsaAesPem(Context context, File keystoreFile, String password, String alias, Uri publicKeyPemUri) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException {
        r.e(context, "context");
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(publicKeyPemUri, "publicKeyPemUri");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(publicKeyPemUri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalArgumentException("Cannot read public key PEM");
            }
            try {
                String str = new String(ah.b.b(inputStreamOpenInputStream), mh.a.f18238b);
                inputStreamOpenInputStream.close();
                RSAPublicKey rsaPublicKeyFromPem = parseRsaPublicKeyFromPem(str);
                KeyStore keyStoreLoadKeyStore = loadKeyStore(keystoreFile, password);
                char[] charArray = password.toCharArray();
                r.d(charArray, "toCharArray(...)");
                Key key = keyStoreLoadKeyStore.getKey(alias, charArray);
                if (key == null) {
                    throw new IllegalArgumentException("No private key for alias ".concat(alias));
                }
                Certificate certificate = keyStoreLoadKeyStore.getCertificate(alias);
                X509Certificate x509Certificate = certificate instanceof X509Certificate ? (X509Certificate) certificate : null;
                if (x509Certificate == null) {
                    throw new IllegalArgumentException("No certificate for alias ".concat(alias));
                }
                byte[] encoded = key.getEncoded();
                r.d(encoded, "getEncoded(...)");
                return writePepkZip(context, encryptPrivateKeyRsaAes(rsaPublicKeyFromPem, encoded), x509Certificate);
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
