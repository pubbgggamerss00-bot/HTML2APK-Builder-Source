package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fw1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4814a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Cipher cipher;
        switch (this.f4814a) {
            case 0:
                try {
                    cipher = (Cipher) j32.f5926b.f5928a.zza("ChaCha20-Poly1305");
                } catch (GeneralSecurityException unused) {
                }
                if (gw1.a(cipher)) {
                    return cipher;
                }
                return null;
            default:
                try {
                    return (Cipher) j32.f5926b.f5928a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
        }
    }
}
