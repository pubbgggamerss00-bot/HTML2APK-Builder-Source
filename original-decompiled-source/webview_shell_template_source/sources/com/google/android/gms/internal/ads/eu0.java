package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eu0 implements be1 {

    /* renamed from: t, reason: collision with root package name */
    public final zt0 f4398t;

    /* renamed from: u, reason: collision with root package name */
    public final i3.a f4399u;
    public final HashMap s = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f4400v = new HashMap();

    public eu0(zt0 zt0Var, Set set, i3.a aVar) {
        this.f4398t = zt0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            du0 du0Var = (du0) it.next();
            HashMap map = this.f4400v;
            du0Var.getClass();
            map.put(yd1.f10929w, du0Var);
        }
        this.f4399u = aVar;
    }

    public final void a(yd1 yd1Var, boolean z6) {
        du0 du0Var = (du0) this.f4400v.get(yd1Var);
        if (du0Var == null) {
            return;
        }
        String str = true != z6 ? "f." : "s.";
        yd1 yd1Var2 = du0Var.f4030b;
        HashMap map = this.s;
        if (map.containsKey(yd1Var2)) {
            long jB = this.f4399u.b() - ((Long) map.get(yd1Var2)).longValue();
            this.f4398t.f11575a.put("label.".concat(du0Var.f4029a), str + jB);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void c(yd1 yd1Var, String str, Throwable th) {
        HashMap map = this.s;
        if (map.containsKey(yd1Var)) {
            long jB = this.f4399u.b() - ((Long) map.get(yd1Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f4398t.f11575a.put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f4400v.containsKey(yd1Var)) {
            a(yd1Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void j(yd1 yd1Var, String str) {
        HashMap map = this.s;
        if (map.containsKey(yd1Var)) {
            long jB = this.f4399u.b() - ((Long) map.get(yd1Var)).longValue();
            String strValueOf = String.valueOf(str);
            this.f4398t.f11575a.put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f4400v.containsKey(yd1Var)) {
            a(yd1Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void n(yd1 yd1Var, String str) {
        this.s.put(yd1Var, Long.valueOf(this.f4399u.b()));
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void f(String str) {
    }
}
