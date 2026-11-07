package com.basitce.htmltoapk.data.apkgenerator.signer;

import c0.g0;
import com.android.apksig.ApkSigner;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.File;
import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import pg.f0;

/* loaded from: classes.dex */
public final class ApkSignerHelper {
    public static final int $stable = 0;
    public static final ApkSignerHelper INSTANCE = new ApkSignerHelper();

    private ApkSignerHelper() {
    }

    public final void signApk(File inputApk, File outputApk, File keystoreFile, String keystorePassword, String keyAlias, String keyPassword, String keystoreType) throws Throwable {
        r.e(inputApk, "inputApk");
        r.e(outputApk, "outputApk");
        r.e(keystoreFile, "keystoreFile");
        r.e(keystorePassword, "keystorePassword");
        r.e(keyAlias, "keyAlias");
        r.e(keyPassword, "keyPassword");
        r.e(keystoreType, "keystoreType");
        BuildLogger.INSTANCE.detail(R.string.build_log_apk_sign_started, new Object[0]);
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
            ApkSigner apkSignerBuild = new ApkSigner.Builder((List<ApkSigner.SignerConfig>) g0.c(new ApkSigner.SignerConfig.Builder("CERT", privateKey, arrayList).build())).setInputApk(inputApk).setOutputApk(outputApk).setMinSdkVersion(24).setV1SigningEnabled(true).setV2SigningEnabled(true).build();
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            buildLogger.detail(R.string.build_log_apk_sign_v1v2, new Object[0]);
            apkSignerBuild.sign();
            buildLogger.detail(R.string.build_log_apk_signed, new Object[0]);
        } finally {
        }
    }
}
