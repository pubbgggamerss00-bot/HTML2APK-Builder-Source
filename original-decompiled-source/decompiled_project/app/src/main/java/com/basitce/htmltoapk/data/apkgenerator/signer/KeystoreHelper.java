package com.basitce.htmltoapk.data.apkgenerator.signer;

import android.content.Context;
import c1.x;
import c2.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.encoders.Base64;
import pg.f0;
import pg.n;
import pg.t;
import qg.o;

/* loaded from: classes.dex */
public final class KeystoreHelper {
    public static final int $stable = 0;
    private static final String DEFAULT_KEYSTORE_FILE = "default_keystore.p12";
    private static final String DEFAULT_KEYSTORE_PASSWORD_PREF = "default_keystore_password";
    public static final KeystoreHelper INSTANCE = new KeystoreHelper();
    private static final String KEY_ALIAS = "htmltoapk";
    public static final int MAX_VALIDITY_YEARS = 100;
    public static final int MIN_VALIDITY_YEARS = 1;

    private KeystoreHelper() {
    }

    private final n<Date, Date> calculateValidityDates(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, i10);
        return new n<>(time, calendar2.getTime());
    }

    public static /* synthetic */ File createCustomKeystore$default(KeystoreHelper keystoreHelper, Context context, String str, String str2, String str3, int i10, String str4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = str2;
        }
        if ((i11 & 16) != 0) {
            i10 = 25;
        }
        if ((i11 & 32) != 0) {
            str4 = u.a("keystore_", KeystoreStorage.FILE_EXTENSION, System.currentTimeMillis());
        }
        return keystoreHelper.createCustomKeystore(context, str, str2, str3, i10, str4);
    }

    public static /* synthetic */ File createDefaultKeystore$default(KeystoreHelper keystoreHelper, File file, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = KEY_ALIAS;
        }
        if ((i11 & 8) != 0) {
            i10 = 25;
        }
        return keystoreHelper.createDefaultKeystore(file, str, str2, i10);
    }

    private final void ensureBouncyCastleProvider() {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    private final String fingerprintHex(byte[] bArr, String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            r.d(bArrDigest, "digest(...)");
            return o.y(bArrDigest, ":", new a(0), 30);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence fingerprintHex$lambda$14(byte b10) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
    }

    private final String getDefaultPassword(KeystorePasswordStorage keystorePasswordStorage) {
        return keystorePasswordStorage.getString(DEFAULT_KEYSTORE_PASSWORD_PREF);
    }

    private final void saveDefaultPassword(KeystorePasswordStorage keystorePasswordStorage, String str) {
        keystorePasswordStorage.putString(DEFAULT_KEYSTORE_PASSWORD_PREF, str);
    }

    public static /* synthetic */ boolean verifyKeystore$default(KeystoreHelper keystoreHelper, File file, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = str;
        }
        return keystoreHelper.verifyKeystore(file, str, str2, str3);
    }

    public final File createCustomKeystore(Context context, String alias, String password, String keyPassword, int i10, String fileName) throws NoSuchAlgorithmException, OperatorCreationException, IOException, CertificateException, KeyStoreException {
        r.e(context, "context");
        r.e(alias, "alias");
        r.e(password, "password");
        r.e(keyPassword, "keyPassword");
        r.e(fileName, "fileName");
        validateValidityYears(i10);
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", bouncyCastleProvider);
        keyPairGenerator.initialize(2048);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        X500Name x500Name = new X500Name("CN=".concat(alias));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(System.currentTimeMillis());
        n<Date, Date> nVarCalculateValidityDates = calculateValidityDates(i10);
        X509Certificate certificate = new JcaX509CertificateConverter().setProvider(bouncyCastleProvider).getCertificate(new X509v3CertificateBuilder(x500Name, bigIntegerValueOf, nVarCalculateValidityDates.f21469a, nVarCalculateValidityDates.f21470b, x500Name, SubjectPublicKeyInfo.getInstance(keyPairGenerateKeyPair.getPublic().getEncoded())).build(new JcaContentSignerBuilder("SHA256withRSA").setProvider(bouncyCastleProvider).build(keyPairGenerateKeyPair.getPrivate())));
        KeyStore keyStore = KeyStore.getInstance("PKCS12", bouncyCastleProvider);
        keyStore.load(null, null);
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        char[] charArray = keyPassword.toCharArray();
        r.d(charArray, "toCharArray(...)");
        keyStore.setKeyEntry(alias, privateKey, charArray, new X509Certificate[]{certificate});
        File file = new File(context.getFilesDir(), fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            char[] charArray2 = password.toCharArray();
            r.d(charArray2, "toCharArray(...)");
            keyStore.store(fileOutputStream, charArray2);
            f0 f0Var = f0.f21461a;
            fileOutputStream.close();
            return file;
        } finally {
        }
    }

    public final File createDefaultKeystore(File keystoreFile, String password, String alias, int i10) throws NoSuchAlgorithmException, OperatorCreationException, IOException, CertificateException, KeyStoreException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        validateValidityYears(i10);
        if (keystoreFile.exists()) {
            keystoreFile.delete();
        }
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
        BouncyCastleProvider bouncyCastleProvider = new BouncyCastleProvider();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", bouncyCastleProvider);
        keyPairGenerator.initialize(2048);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        X500Name x500Name = new X500Name("CN=HTML to APK Builder");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(System.currentTimeMillis());
        n<Date, Date> nVarCalculateValidityDates = calculateValidityDates(i10);
        X509Certificate certificate = new JcaX509CertificateConverter().setProvider(bouncyCastleProvider).getCertificate(new X509v3CertificateBuilder(x500Name, bigIntegerValueOf, nVarCalculateValidityDates.f21469a, nVarCalculateValidityDates.f21470b, x500Name, SubjectPublicKeyInfo.getInstance(keyPairGenerateKeyPair.getPublic().getEncoded())).build(new JcaContentSignerBuilder("SHA256withRSA").setProvider(bouncyCastleProvider).build(keyPairGenerateKeyPair.getPrivate())));
        KeyStore keyStore = KeyStore.getInstance("PKCS12", bouncyCastleProvider);
        keyStore.load(null, null);
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        char[] charArray = password.toCharArray();
        r.d(charArray, "toCharArray(...)");
        keyStore.setKeyEntry(alias, privateKey, charArray, new X509Certificate[]{certificate});
        FileOutputStream fileOutputStream = new FileOutputStream(keystoreFile);
        try {
            char[] charArray2 = password.toCharArray();
            r.d(charArray2, "toCharArray(...)");
            keyStore.store(fileOutputStream, charArray2);
            f0 f0Var = f0.f21461a;
            fileOutputStream.close();
            return keystoreFile;
        } finally {
        }
    }

    public final String exportCertificateAsPem(File keystoreFile, String password, String alias) throws IOException, KeyStoreException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        ensureBouncyCastleProvider();
        KeyStore keyStore = KeyStore.getInstance("PKCS12", new BouncyCastleProvider());
        FileInputStream fileInputStream = new FileInputStream(keystoreFile);
        try {
            char[] charArray = password.toCharArray();
            r.d(charArray, "toCharArray(...)");
            keyStore.load(fileInputStream, charArray);
            f0 f0Var = f0.f21461a;
            fileInputStream.close();
            Certificate certificate = keyStore.getCertificate(alias);
            if (certificate == null) {
                throw new IllegalArgumentException("Certificate not found for alias: ".concat(alias));
            }
            String base64String = Base64.toBase64String(certificate.getEncoded());
            r.b(base64String);
            x.d(64, 64);
            int length = base64String.length();
            int i10 = 0;
            ArrayList arrayList = new ArrayList((length / 64) + (length % 64 == 0 ? 0 : 1));
            while (i10 >= 0 && i10 < length) {
                int i11 = i10 + 64;
                CharSequence it = base64String.subSequence(i10, (i11 < 0 || i11 > length) ? length : i11);
                r.e(it, "it");
                arrayList.add(it.toString());
                i10 = i11;
            }
            return i8.n.d("-----BEGIN CERTIFICATE-----\n", qg.x.I(arrayList, "\n", null, null, null, 62), "\n-----END CERTIFICATE-----\n");
        } finally {
        }
    }

    public final String exportCertificatePem(File keystoreFile, String password, String alias) throws IOException, KeyStoreException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream fileInputStream = new FileInputStream(keystoreFile);
            try {
                char[] charArray = password.toCharArray();
                r.d(charArray, "toCharArray(...)");
                keyStore.load(fileInputStream, charArray);
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                Certificate certificate = keyStore.getCertificate(alias);
                X509Certificate x509Certificate = certificate instanceof X509Certificate ? (X509Certificate) certificate : null;
                if (x509Certificate == null) {
                    return null;
                }
                StringWriter stringWriter = new StringWriter();
                JcaPEMWriter jcaPEMWriter = new JcaPEMWriter(stringWriter);
                try {
                    jcaPEMWriter.writeObject(x509Certificate);
                    jcaPEMWriter.close();
                    return stringWriter.toString();
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getCertificateFingerprint(File keystoreFile, String password, String alias) throws NoSuchAlgorithmException, IOException, KeyStoreException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream fileInputStream = new FileInputStream(keystoreFile);
            try {
                char[] charArray = password.toCharArray();
                r.d(charArray, "toCharArray(...)");
                keyStore.load(fileInputStream, charArray);
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                Certificate certificate = keyStore.getCertificate(alias);
                if (certificate == null) {
                    return null;
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(certificate.getEncoded());
                return android.util.Base64.encodeToString(messageDigest.digest(), 2);
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final n<String, String> getCertificateFingerprints(File keystoreFile, String password, String alias) throws IOException, KeyStoreException, CertificateEncodingException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream fileInputStream = new FileInputStream(keystoreFile);
            try {
                char[] charArray = password.toCharArray();
                r.d(charArray, "toCharArray(...)");
                keyStore.load(fileInputStream, charArray);
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                Certificate certificate = keyStore.getCertificate(alias);
                if (certificate == null) {
                    return null;
                }
                byte[] encoded = certificate.getEncoded();
                r.d(encoded, "getEncoded(...)");
                String strFingerprintHex = fingerprintHex(encoded, McElieceCCA2KeyGenParameterSpec.SHA1);
                byte[] encoded2 = certificate.getEncoded();
                r.d(encoded2, "getEncoded(...)");
                return new n<>(strFingerprintHex, fingerprintHex(encoded2, "SHA-256"));
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getDefaultKeyAlias() {
        return KEY_ALIAS;
    }

    public final String getDefaultKeyPassword(Context context) {
        r.e(context, "context");
        return getDefaultKeystorePassword(context);
    }

    public final String getDefaultKeystorePassword(Context context) throws IOException, KeyStoreException {
        r.e(context, "context");
        KeystorePasswordStorage keystorePasswordStorage = new KeystorePasswordStorage(context);
        String defaultPassword = getDefaultPassword(keystorePasswordStorage);
        if (defaultPassword != null) {
            return defaultPassword;
        }
        getOrCreateDefaultKeystore(context);
        String defaultPassword2 = getDefaultPassword(keystorePasswordStorage);
        r.b(defaultPassword2);
        return defaultPassword2;
    }

    public final t<File, String, String> getOrCreateAppKeystore(Context context, String packageName) {
        r.e(context, "context");
        r.e(packageName, "packageName");
        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9._-]");
        r.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(packageName).replaceAll("_");
        r.d(strReplaceAll, "replaceAll(...)");
        File file = new File(context.getFilesDir(), "app_keystores/".concat(strReplaceAll));
        file.mkdirs();
        File file2 = new File(file, "keystore.p12");
        if (file2.exists()) {
            String appKeystorePassword = new KeystorePasswordStorage(context).getAppKeystorePassword(packageName);
            if (appKeystorePassword != null && verifyKeystore$default(this, file2, appKeystorePassword, KEY_ALIAS, null, 8, null)) {
                return new t<>(file2, appKeystorePassword, KEY_ALIAS);
            }
            file2.delete();
        }
        KeystorePasswordStorage keystorePasswordStorage = new KeystorePasswordStorage(context);
        String strGenerateRandomPassword = keystorePasswordStorage.generateRandomPassword();
        keystorePasswordStorage.saveAppKeystorePassword(packageName, strGenerateRandomPassword);
        createDefaultKeystore$default(this, file2, strGenerateRandomPassword, KEY_ALIAS, 0, 8, null);
        return new t<>(file2, strGenerateRandomPassword, KEY_ALIAS);
    }

    public final File getOrCreateDefaultKeystore(Context context) throws IOException, KeyStoreException {
        r.e(context, "context");
        File file = new File(context.getFilesDir(), DEFAULT_KEYSTORE_FILE);
        KeystorePasswordStorage keystorePasswordStorage = new KeystorePasswordStorage(context);
        String defaultPassword = getDefaultPassword(keystorePasswordStorage);
        if (defaultPassword == null) {
            defaultPassword = keystorePasswordStorage.generateRandomPassword();
            saveDefaultPassword(keystorePasswordStorage, defaultPassword);
        }
        String str = defaultPassword;
        if (file.exists()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("PKCS12");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    char[] charArray = str.toCharArray();
                    r.d(charArray, "toCharArray(...)");
                    keyStore.load(fileInputStream, charArray);
                    f0 f0Var = f0.f21461a;
                    fileInputStream.close();
                    return file;
                } finally {
                }
            } catch (Exception unused) {
                file.delete();
            }
        }
        createDefaultKeystore$default(this, file, str, null, 0, 12, null);
        return file;
    }

    public final void migrateFromLegacyDefaultPassword(Context context) {
        r.e(context, "context");
        File file = new File(context.getFilesDir(), DEFAULT_KEYSTORE_FILE);
        if (!file.exists()) {
            return;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                char[] charArray = "htmltoapk123".toCharArray();
                r.d(charArray, "toCharArray(...)");
                keyStore.load(fileInputStream, charArray);
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                file.delete();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final void validateValidityYears(int i10) {
        if (1 > i10 || i10 >= 101) {
            throw new IllegalArgumentException("Validity must be between 1 and 100 years");
        }
    }

    public final boolean verifyKeystore(File keystoreFile, String password, String alias, String keyPassword) throws IOException, KeyStoreException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(keyPassword, "keyPassword");
        try {
            ensureBouncyCastleProvider();
            KeyStore keyStore = KeyStore.getInstance("PKCS12", new BouncyCastleProvider());
            FileInputStream fileInputStream = new FileInputStream(keystoreFile);
            try {
                char[] charArray = password.toCharArray();
                r.d(charArray, "toCharArray(...)");
                keyStore.load(fileInputStream, charArray);
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                if (keyStore.containsAlias(alias)) {
                    char[] charArray2 = keyPassword.toCharArray();
                    r.d(charArray2, "toCharArray(...)");
                    if (keyStore.getKey(alias, charArray2) != null) {
                        return true;
                    }
                }
                return false;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
