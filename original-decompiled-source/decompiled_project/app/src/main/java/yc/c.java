package yc;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import gd.t;
import gd.y;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import sc.l;

/* loaded from: classes2.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f34381b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public KeyStore f34382a;

    public c() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f34382a = keyStore;
        } catch (IOException | GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean c(String str) throws GeneralSecurityException {
        c cVar = new c();
        synchronized (f34381b) {
            try {
                if (cVar.e(str)) {
                    return false;
                }
                d(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str) throws GeneralSecurityException {
        String strB = y.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @Override // sc.l
    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    @Override // sc.l
    public final synchronized b b(String str) throws GeneralSecurityException {
        b bVar;
        bVar = new b(y.b(str), this.f34382a);
        byte[] bArrA = t.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, bVar.decrypt(bVar.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean e(String str) throws GeneralSecurityException {
        String strB;
        strB = y.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f34382a = keyStore;
                keyStore.load(null);
                return this.f34382a.containsAlias(strB);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f34382a.containsAlias(strB);
    }
}
