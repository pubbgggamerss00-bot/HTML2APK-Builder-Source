package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qy1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8481a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        Provider provider;
        Provider provider2;
        SecureRandom secureRandom;
        switch (this.f8481a) {
            case 0:
                String[] strArr = bq.G;
                int i6 = 0;
                while (true) {
                    provider = null;
                    if (i6 < 3) {
                        provider2 = Security.getProvider(strArr[i6]);
                        if (provider2 == null) {
                            i6++;
                        }
                    } else {
                        provider2 = null;
                    }
                }
                if (provider2 != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider2);
                    } catch (GeneralSecurityException unused) {
                    }
                } else {
                    try {
                        provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
                    }
                    if (provider != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                        } catch (GeneralSecurityException unused3) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 1:
                try {
                    return (Cipher) j32.f5926b.f5928a.zza("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            default:
                return 0L;
        }
    }
}
