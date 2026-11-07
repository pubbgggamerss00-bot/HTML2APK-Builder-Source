package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hy1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5514a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5515b;

    public /* synthetic */ hy1() {
        this.f5514a = new HashMap();
        this.f5515b = new HashMap();
    }

    public final void a(gy1 gy1Var) throws GeneralSecurityException {
        if (gy1Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        iy1 iy1Var = new iy1(gy1Var.f5189a, gy1Var.f5190b);
        HashMap map = this.f5514a;
        if (!map.containsKey(iy1Var)) {
            map.put(iy1Var, gy1Var);
            return;
        }
        gy1 gy1Var2 = (gy1) map.get(iy1Var);
        if (!gy1Var2.equals(gy1Var) || !gy1Var.equals(gy1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(iy1Var.toString()));
        }
    }

    public /* synthetic */ hy1(ky1 ky1Var) {
        this.f5514a = new HashMap(ky1Var.f6523a);
        this.f5515b = new HashMap(ky1Var.f6524b);
    }
}
