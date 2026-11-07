package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sy1 extends me {

    /* renamed from: t, reason: collision with root package name */
    public static final sy1 f9051t = new sy1(9);

    @Override // com.google.android.gms.internal.ads.me
    public final Class b() {
        int i6 = ot1.f7861a;
        try {
            return vx1.f9959b.a();
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final Object j(ih1 ih1Var, Class cls) {
        return vx1.f9959b.b(ih1Var, cls);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final Object n(eu euVar) throws GeneralSecurityException {
        Class cls = (Class) euVar.s;
        int i6 = ot1.f7861a;
        HashMap map = ((ky1) vx1.f9959b.f9960a.get()).f6524b;
        if (!map.containsKey(ys1.class)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(ys1.class.toString()));
        }
        ny1 ny1Var = (ny1) map.get(ys1.class);
        if (cls.equals(ny1Var.zza()) && ny1Var.zza().equals(cls)) {
            return ny1Var.a(euVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
