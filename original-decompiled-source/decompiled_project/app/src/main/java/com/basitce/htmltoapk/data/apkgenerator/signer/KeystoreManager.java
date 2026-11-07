package com.basitce.htmltoapk.data.apkgenerator.signer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.r;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import pg.f0;

/* loaded from: classes.dex */
public final class KeystoreManager {
    public static final int $stable = 0;
    public static final KeystoreManager INSTANCE = new KeystoreManager();

    private KeystoreManager() {
    }

    private final X509Certificate generateSelfSignedCertificate(KeyPair keyPair, String str, Date date, Date date2) throws CertificateException {
        X509Certificate certificate = new JcaX509CertificateConverter().getCertificate(new JcaX509v3CertificateBuilder(new X500Principal("CN=HTMLToAPK"), BigInteger.valueOf(System.currentTimeMillis()), date, date2, new X500Principal("CN=HTMLToAPK"), keyPair.getPublic()).build(new JcaContentSignerBuilder(r.a(str, "ECDSA") ? "SHA256withECDSA" : "SHA256withRSA").build(keyPair.getPrivate())));
        r.d(certificate, "getCertificate(...)");
        return certificate;
    }

    public final void createKeystore(File keystoreFile, String password, String alias, String keyPassword, int i10, String algorithm) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        r.e(keystoreFile, "keystoreFile");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(keyPassword, "keyPassword");
        r.e(algorithm, "algorithm");
        KeystoreHelper.INSTANCE.validateValidityYears(i10);
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(null, null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        keyPairGenerator.initialize(2048);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, i10);
        Date time2 = calendar2.getTime();
        r.b(keyPairGenerateKeyPair);
        r.b(time);
        r.b(time2);
        X509Certificate x509CertificateGenerateSelfSignedCertificate = generateSelfSignedCertificate(keyPairGenerateKeyPair, algorithm, time, time2);
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        char[] charArray = keyPassword.toCharArray();
        r.d(charArray, "toCharArray(...)");
        keyStore.setKeyEntry(alias, privateKey, charArray, new Certificate[]{x509CertificateGenerateSelfSignedCertificate});
        FileOutputStream fileOutputStream = new FileOutputStream(keystoreFile);
        try {
            char[] charArray2 = password.toCharArray();
            r.d(charArray2, "toCharArray(...)");
            keyStore.store(fileOutputStream, charArray2);
            f0 f0Var = f0.f21461a;
            fileOutputStream.close();
        } finally {
        }
    }
}
