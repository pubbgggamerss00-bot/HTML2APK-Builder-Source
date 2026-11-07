package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wx1 {

    /* renamed from: b, reason: collision with root package name */
    public static final wx1 f10304b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10305a = new AtomicReference(new xy1(new uy1()));

    static {
        try {
            wx1 wx1Var = new wx1();
            wx1Var.f(new cx1(hx1.class, new rj1(13)));
            f10304b = wx1Var;
        } catch (Exception e6) {
            throw new yy1(e6);
        }
    }

    public final ih1 a(oy1 oy1Var) {
        xy1 xy1Var = (xy1) this.f10305a.get();
        xy1Var.getClass();
        vy1 vy1Var = new vy1(oy1.class, oy1Var.f7886b);
        HashMap map = xy1Var.f10749b;
        if (map.containsKey(vy1Var)) {
            return ((bx1) map.get(vy1Var)).a(oy1Var);
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No Key Parser for requested key type ", vy1Var.toString(), " available"));
    }

    public final lt1 b(py1 py1Var) {
        xy1 xy1Var = (xy1) this.f10305a.get();
        xy1Var.getClass();
        vy1 vy1Var = new vy1(py1.class, py1Var.f8180a);
        HashMap map = xy1Var.f10751d;
        if (map.containsKey(vy1Var)) {
            return ((ay1) map.get(vy1Var)).a(py1Var);
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No Parameters Parser for requested key type ", vy1Var.toString(), " available"));
    }

    public final ty1 c(ih1 ih1Var) throws GeneralSecurityException {
        xy1 xy1Var = (xy1) this.f10305a.get();
        xy1Var.getClass();
        wy1 wy1Var = new wy1(ih1Var.getClass(), oy1.class);
        HashMap map = xy1Var.f10748a;
        if (map.containsKey(wy1Var)) {
            return ((ex1) map.get(wy1Var)).a(ih1Var);
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No Key serializer for ", wy1Var.toString(), " available"));
    }

    public final ty1 d(lt1 lt1Var) throws GeneralSecurityException {
        xy1 xy1Var = (xy1) this.f10305a.get();
        xy1Var.getClass();
        wy1 wy1Var = new wy1(lt1Var.getClass(), py1.class);
        HashMap map = xy1Var.f10750c;
        if (map.containsKey(wy1Var)) {
            return ((dy1) map.get(wy1Var)).a(lt1Var);
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("No Key Format serializer for ", wy1Var.toString(), " available"));
    }

    public final synchronized void e(bx1 bx1Var) {
        uy1 uy1Var = new uy1((xy1) this.f10305a.get());
        uy1Var.a(bx1Var);
        this.f10305a.set(new xy1(uy1Var));
    }

    public final synchronized void f(ex1 ex1Var) {
        uy1 uy1Var = new uy1((xy1) this.f10305a.get());
        uy1Var.b(ex1Var);
        this.f10305a.set(new xy1(uy1Var));
    }

    public final synchronized void g(ay1 ay1Var) {
        uy1 uy1Var = new uy1((xy1) this.f10305a.get());
        uy1Var.c(ay1Var);
        this.f10305a.set(new xy1(uy1Var));
    }

    public final synchronized void h(dy1 dy1Var) {
        uy1 uy1Var = new uy1((xy1) this.f10305a.get());
        uy1Var.d(dy1Var);
        this.f10305a.set(new xy1(uy1Var));
    }
}
