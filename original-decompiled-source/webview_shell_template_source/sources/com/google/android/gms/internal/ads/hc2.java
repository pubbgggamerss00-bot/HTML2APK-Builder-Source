package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hc2 {

    /* renamed from: a, reason: collision with root package name */
    public final hd2 f5328a;

    /* renamed from: e, reason: collision with root package name */
    public final ob2 f5332e;
    public final wc2 h;

    /* renamed from: i, reason: collision with root package name */
    public final xo0 f5335i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5336j;

    /* renamed from: k, reason: collision with root package name */
    public o52 f5337k;

    /* renamed from: l, reason: collision with root package name */
    public oi2 f5338l = new oi2();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f5330c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5331d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5329b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5333f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f5334g = new HashSet();

    public hc2(ob2 ob2Var, wc2 wc2Var, xo0 xo0Var, hd2 hd2Var) {
        this.f5328a = hd2Var;
        this.f5332e = ob2Var;
        this.h = wc2Var;
        this.f5335i = xo0Var;
    }

    public final zy a() {
        ArrayList arrayList = this.f5329b;
        if (arrayList.isEmpty()) {
            return zy.f11601a;
        }
        int iC = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            fc2 fc2Var = (fc2) arrayList.get(i6);
            fc2Var.f4610d = iC;
            iC += fc2Var.f4607a.f6419o.f3938b.c();
        }
        return new oc2(arrayList, this.f5338l);
    }

    public final zy b(List list, int i6, int i7) {
        ArrayList arrayList = this.f5329b;
        y5.n(i6 >= 0 && i6 <= i7 && i7 <= arrayList.size());
        y5.n(list.size() == i7 - i6);
        for (int i8 = i6; i8 < i7; i8++) {
            ((fc2) arrayList.get(i8)).f4607a.c((tc) list.get(i8 - i6));
        }
        return a();
    }

    public final void c(o52 o52Var) {
        y5.r(!this.f5336j);
        this.f5337k = o52Var;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f5329b;
            if (i6 >= arrayList.size()) {
                this.f5336j = true;
                return;
            }
            fc2 fc2Var = (fc2) arrayList.get(i6);
            m(fc2Var);
            this.f5334g.add(fc2Var);
            i6++;
        }
    }

    public final void d(nh2 nh2Var) {
        IdentityHashMap identityHashMap = this.f5330c;
        fc2 fc2Var = (fc2) identityHashMap.remove(nh2Var);
        fc2Var.getClass();
        fc2Var.f4607a.b(nh2Var);
        fc2Var.f4609c.remove(((gh2) nh2Var).s);
        if (!identityHashMap.isEmpty()) {
            k();
        }
        l(fc2Var);
    }

    public final boolean e() {
        return this.f5336j;
    }

    public final zy f(int i6, List list, oi2 oi2Var) {
        if (!list.isEmpty()) {
            this.f5338l = oi2Var;
            for (int i7 = i6; i7 < list.size() + i6; i7++) {
                fc2 fc2Var = (fc2) list.get(i7 - i6);
                ArrayList arrayList = this.f5329b;
                if (i7 > 0) {
                    fc2 fc2Var2 = (fc2) arrayList.get(i7 - 1);
                    fc2Var.f4610d = fc2Var2.f4607a.f6419o.f3938b.c() + fc2Var2.f4610d;
                    fc2Var.f4611e = false;
                    fc2Var.f4609c.clear();
                } else {
                    fc2Var.f4610d = 0;
                    fc2Var.f4611e = false;
                    fc2Var.f4609c.clear();
                }
                int iC = fc2Var.f4607a.f6419o.f3938b.c();
                for (int i8 = i7; i8 < arrayList.size(); i8++) {
                    ((fc2) arrayList.get(i8)).f4610d += iC;
                }
                arrayList.add(i7, fc2Var);
                this.f5331d.put(fc2Var.f4608b, fc2Var);
                if (this.f5336j) {
                    m(fc2Var);
                    if (this.f5330c.isEmpty()) {
                        this.f5334g.add(fc2Var);
                    } else {
                        ec2 ec2Var = (ec2) this.f5333f.get(fc2Var);
                        if (ec2Var != null) {
                            ec2Var.f4224a.d(ec2Var.f4225b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final zy g() {
        y5.n(this.f5329b.size() >= 0);
        this.f5338l = null;
        return a();
    }

    public final zy h(int i6, int i7, oi2 oi2Var) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= i7 && i7 <= this.f5329b.size()) {
            z6 = true;
        }
        y5.n(z6);
        this.f5338l = oi2Var;
        n(i6, i7);
        return a();
    }

    public final zy i(List list, oi2 oi2Var) {
        ArrayList arrayList = this.f5329b;
        n(0, arrayList.size());
        return f(arrayList.size(), list, oi2Var);
    }

    public final zy j(oi2 oi2Var) {
        int size = this.f5329b.size();
        if (oi2Var.f7781b.length != size) {
            oi2Var = new oi2(new Random(oi2Var.f7780a.nextLong())).a(size);
        }
        this.f5338l = oi2Var;
        return a();
    }

    public final void k() {
        Iterator it = this.f5334g.iterator();
        while (it.hasNext()) {
            fc2 fc2Var = (fc2) it.next();
            if (fc2Var.f4609c.isEmpty()) {
                ec2 ec2Var = (ec2) this.f5333f.get(fc2Var);
                if (ec2Var != null) {
                    ec2Var.f4224a.d(ec2Var.f4225b);
                }
                it.remove();
            }
        }
    }

    public final void l(fc2 fc2Var) {
        if (fc2Var.f4611e && fc2Var.f4609c.isEmpty()) {
            ec2 ec2Var = (ec2) this.f5333f.remove(fc2Var);
            ec2Var.getClass();
            dc2 dc2Var = ec2Var.f4226c;
            qh2 qh2Var = ec2Var.f4224a;
            qh2Var.a(ec2Var.f4225b);
            qh2Var.h(dc2Var);
            qh2Var.k(dc2Var);
            this.f5334g.remove(fc2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ph2, com.google.android.gms.internal.ads.zb2] */
    public final void m(fc2 fc2Var) {
        kh2 kh2Var = fc2Var.f4607a;
        ?? r12 = new ph2() { // from class: com.google.android.gms.internal.ads.zb2
            @Override // com.google.android.gms.internal.ads.ph2
            public final void a(sg2 sg2Var, zy zyVar) {
                xo0 xo0Var = this.f11251a.f5332e.f7701z;
                xo0Var.b(2);
                xo0Var.h(22);
            }
        };
        dc2 dc2Var = new dc2(this, fc2Var);
        this.f5333f.put(fc2Var, new ec2(kh2Var, r12, dc2Var));
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        kh2Var.l(new Handler(looperMyLooper, null), dc2Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        kh2Var.j(new Handler(looperMyLooper2, null), dc2Var);
        kh2Var.f(r12, this.f5337k, this.f5328a);
    }

    public final void n(int i6, int i7) {
        while (true) {
            i7--;
            if (i7 < i6) {
                return;
            }
            ArrayList arrayList = this.f5329b;
            fc2 fc2Var = (fc2) arrayList.remove(i7);
            this.f5331d.remove(fc2Var.f4608b);
            int i8 = -fc2Var.f4607a.f6419o.f3938b.c();
            for (int i9 = i7; i9 < arrayList.size(); i9++) {
                ((fc2) arrayList.get(i9)).f4610d += i8;
            }
            fc2Var.f4611e = true;
            if (this.f5336j) {
                l(fc2Var);
            }
        }
    }
}
