package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uy1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9663a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9664b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9665c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9666d;

    public uy1() {
        this.f9663a = new HashMap();
        this.f9664b = new HashMap();
        this.f9665c = new HashMap();
        this.f9666d = new HashMap();
    }

    public final void a(bx1 bx1Var) throws GeneralSecurityException {
        bx1Var.getClass();
        vy1 vy1Var = new vy1(oy1.class, bx1Var.f3323a);
        HashMap map = this.f9664b;
        if (!map.containsKey(vy1Var)) {
            map.put(vy1Var, bx1Var);
            return;
        }
        bx1 bx1Var2 = (bx1) map.get(vy1Var);
        if (!bx1Var2.equals(bx1Var) || !bx1Var.equals(bx1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vy1Var.toString()));
        }
    }

    public final void b(ex1 ex1Var) throws GeneralSecurityException {
        wy1 wy1Var = new wy1(ex1Var.f4419a, oy1.class);
        HashMap map = this.f9663a;
        if (!map.containsKey(wy1Var)) {
            map.put(wy1Var, ex1Var);
            return;
        }
        ex1 ex1Var2 = (ex1) map.get(wy1Var);
        if (!ex1Var2.equals(ex1Var) || !ex1Var.equals(ex1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(wy1Var.toString()));
        }
    }

    public final void c(ay1 ay1Var) throws GeneralSecurityException {
        ay1Var.getClass();
        vy1 vy1Var = new vy1(py1.class, ay1Var.f2874a);
        HashMap map = this.f9666d;
        if (!map.containsKey(vy1Var)) {
            map.put(vy1Var, ay1Var);
            return;
        }
        ay1 ay1Var2 = (ay1) map.get(vy1Var);
        if (!ay1Var2.equals(ay1Var) || !ay1Var.equals(ay1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(vy1Var.toString()));
        }
    }

    public final void d(dy1 dy1Var) throws GeneralSecurityException {
        wy1 wy1Var = new wy1(dy1Var.f4060a, py1.class);
        HashMap map = this.f9665c;
        if (!map.containsKey(wy1Var)) {
            map.put(wy1Var, dy1Var);
            return;
        }
        dy1 dy1Var2 = (dy1) map.get(wy1Var);
        if (!dy1Var2.equals(dy1Var) || !dy1Var.equals(dy1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(wy1Var.toString()));
        }
    }

    public uy1(xy1 xy1Var) {
        this.f9663a = new HashMap(xy1Var.f10748a);
        this.f9664b = new HashMap(xy1Var.f10749b);
        this.f9665c = new HashMap(xy1Var.f10750c);
        this.f9666d = new HashMap(xy1Var.f10751d);
    }
}
