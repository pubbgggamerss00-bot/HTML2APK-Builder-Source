package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oc extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7702a;

    public /* synthetic */ oc(int i6) {
        this.f7702a = i6;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f7702a) {
            case 0:
                return ByteBuffer.allocate(32);
            default:
                try {
                    Cipher cipher = (Cipher) j32.f5926b.f5928a.zza("AES/GCM-SIV/NoPadding");
                    if (uw1.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
        }
    }
}
