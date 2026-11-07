package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d32 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3748a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f3748a) {
            case 0:
                try {
                    return (Cipher) j32.f5926b.f5928a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 1:
                try {
                    return (Cipher) j32.f5926b.f5928a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            default:
                return Boolean.FALSE;
        }
    }
}
