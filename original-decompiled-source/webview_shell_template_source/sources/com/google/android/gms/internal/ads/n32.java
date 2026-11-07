package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n32 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o32 f7313a;

    public n32(o32 o32Var) {
        this.f7313a = o32Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        o32 o32Var = this.f7313a;
        try {
            j32 j32Var = j32.f5927c;
            Mac mac = (Mac) j32Var.f5928a.zza(o32Var.f7590b);
            mac.init(o32Var.f7591c);
            return mac;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
