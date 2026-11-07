package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vx1 {

    /* renamed from: b, reason: collision with root package name */
    public static final vx1 f9959b = new vx1();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f9960a = new AtomicReference(new ky1(new hy1()));

    public final Class a() throws GeneralSecurityException {
        HashMap map = ((ky1) this.f9960a.get()).f6524b;
        if (map.containsKey(ys1.class)) {
            return ((ny1) map.get(ys1.class)).zza();
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No input primitive class for ", ys1.class.toString(), " available"));
    }

    public final Object b(ih1 ih1Var, Class cls) throws GeneralSecurityException {
        ky1 ky1Var = (ky1) this.f9960a.get();
        ky1Var.getClass();
        iy1 iy1Var = new iy1(ih1Var.getClass(), cls);
        HashMap map = ky1Var.f6523a;
        if (map.containsKey(iy1Var)) {
            return ((gy1) map.get(iy1Var)).a(ih1Var);
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No PrimitiveConstructor for ", iy1Var.toString(), " available"));
    }

    public final synchronized void c(gy1 gy1Var) {
        hy1 hy1Var = new hy1((ky1) this.f9960a.get());
        hy1Var.a(gy1Var);
        this.f9960a.set(new ky1(hy1Var));
    }

    public final synchronized void d(ny1 ny1Var) {
        hy1 hy1Var = new hy1((ky1) this.f9960a.get());
        HashMap map = hy1Var.f5515b;
        Class clsZzb = ny1Var.zzb();
        if (map.containsKey(clsZzb)) {
            ny1 ny1Var2 = (ny1) map.get(clsZzb);
            if (!ny1Var2.equals(ny1Var) || !ny1Var.equals(ny1Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            map.put(clsZzb, ny1Var);
        }
        this.f9960a.set(new ky1(hy1Var));
    }
}
