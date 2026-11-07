package com.basitce.htmltoapk.data.apkgenerator.signer;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import qg.m;

/* loaded from: classes.dex */
public final class KeystorePasswordStorage {
    private static final String KEY_BIOMETRIC_REQUIRED = "biometric_required";
    private static final String PREFS_NAME = "keystore_password_prefs";
    private final String androidKeyStore;
    private final Context appContext;
    private final int ivSizeBytes;
    private final String keyAlias;
    private final SharedPreferences prefs;
    private final int tagSizeBits;
    private final String transformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public KeystorePasswordStorage(Context context) {
        r.e(context, "context");
        this.androidKeyStore = "AndroidKeyStore";
        this.keyAlias = "keystore_password_master_key";
        this.transformation = "AES/GCM/NoPadding";
        this.ivSizeBytes = 12;
        this.tagSizeBits = 128;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.prefs = applicationContext.getSharedPreferences(PREFS_NAME, 0);
        try {
            createKeyIfNeeded();
        } catch (Exception e10) {
            Log.e("KeystorePasswordStorage", "Failed to initialize AndroidKeyStore master key", e10);
        }
    }

    private final String appKeystorePasswordKey(String input) {
        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9._-]");
        r.d(patternCompile, "compile(...)");
        r.e(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
        r.d(strReplaceAll, "replaceAll(...)");
        return "app_keystore_password_".concat(strReplaceAll);
    }

    private final void createKeyIfNeeded() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance(this.androidKeyStore);
        keyStore.load(null);
        if (keyStore.containsAlias(this.keyAlias)) {
            return;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", this.androidKeyStore);
        KeyGenParameterSpec.Builder randomizedEncryptionRequired = new KeyGenParameterSpec.Builder(this.keyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(true);
        r.d(randomizedEncryptionRequired, "setRandomizedEncryptionRequired(...)");
        if (isBiometricRequired()) {
            randomizedEncryptionRequired.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(30);
        }
        keyGenerator.init(randomizedEncryptionRequired.build());
        keyGenerator.generateKey();
    }

    private final SecretKey getKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, UnrecoverableEntryException {
        KeyStore keyStore = KeyStore.getInstance(this.androidKeyStore);
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(this.keyAlias, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry == null) {
            throw new IllegalStateException("Keystore master key not found");
        }
        SecretKey secretKey = secretKeyEntry.getSecretKey();
        r.d(secretKey, "getSecretKey(...)");
        return secretKey;
    }

    private final void recreateKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyStore keyStore = KeyStore.getInstance(this.androidKeyStore);
        keyStore.load(null);
        if (keyStore.containsAlias(this.keyAlias)) {
            keyStore.deleteEntry(this.keyAlias);
        }
        createKeyIfNeeded();
    }

    public final String decrypt(String encrypted) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        r.e(encrypted, "encrypted");
        byte[] bArrDecode = Base64.decode(encrypted, 2);
        int length = bArrDecode.length;
        int i10 = this.ivSizeBytes;
        if (length < i10) {
            throw new IllegalArgumentException("Invalid encrypted password");
        }
        byte[] bArrJ = m.j(bArrDecode, 0, i10);
        byte[] bArrJ2 = m.j(bArrDecode, this.ivSizeBytes, bArrDecode.length);
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(2, getKey(), new GCMParameterSpec(this.tagSizeBits, bArrJ));
        byte[] bArrDoFinal = cipher.doFinal(bArrJ2);
        r.d(bArrDoFinal, "doFinal(...)");
        return new String(bArrDoFinal, mh.a.f18238b);
    }

    public final String encrypt(String plainText) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        r.e(plainText, "plainText");
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(1, getKey());
        byte[] iv = cipher.getIV();
        byte[] bytes = plainText.getBytes(mh.a.f18238b);
        r.d(bytes, "getBytes(...)");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        r.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final String generateRandomPassword() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        r.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final String getAppKeystorePassword(String packageName) {
        r.e(packageName, "packageName");
        String string = this.prefs.getString(appKeystorePasswordKey(packageName), null);
        if (string == null) {
            return null;
        }
        try {
            return decrypt(string);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getString(String key) {
        r.e(key, "key");
        return this.prefs.getString(key, null);
    }

    public final boolean isBiometricRequired() {
        return this.prefs.getBoolean(KEY_BIOMETRIC_REQUIRED, false);
    }

    public final void putString(String key, String value) {
        r.e(key, "key");
        r.e(value, "value");
        this.prefs.edit().putString(key, value).apply();
    }

    public final void saveAppKeystorePassword(String packageName, String password) {
        r.e(packageName, "packageName");
        r.e(password, "password");
        this.prefs.edit().putString(appKeystorePasswordKey(packageName), encrypt(password)).apply();
    }

    public final void setBiometricRequired(boolean z10) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        this.prefs.edit().putBoolean(KEY_BIOMETRIC_REQUIRED, z10).apply();
        recreateKey();
    }
}
