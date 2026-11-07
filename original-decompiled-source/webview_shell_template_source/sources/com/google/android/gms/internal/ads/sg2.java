package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class sg2 implements qh2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8928a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8929b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final sh2 f8930c = new sh2(new CopyOnWriteArrayList(), null);

    /* renamed from: d, reason: collision with root package name */
    public final cf2 f8931d = new cf2(new CopyOnWriteArrayList(), null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f8932e;

    /* renamed from: f, reason: collision with root package name */
    public zy f8933f;

    /* renamed from: g, reason: collision with root package name */
    public hd2 f8934g;

    @Override // com.google.android.gms.internal.ads.qh2
    public final void a(ph2 ph2Var) {
        ArrayList arrayList = this.f8928a;
        arrayList.remove(ph2Var);
        if (!arrayList.isEmpty()) {
            d(ph2Var);
            return;
        }
        this.f8932e = null;
        this.f8933f = null;
        this.f8934g = null;
        this.f8929b.clear();
        q();
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void d(ph2 ph2Var) {
        HashSet hashSet = this.f8929b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ph2Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        m();
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void f(ph2 ph2Var, o52 o52Var, hd2 hd2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8932e;
        boolean z6 = true;
        if (looper != null && looper != looperMyLooper) {
            z6 = false;
        }
        y5.n(z6);
        this.f8934g = hd2Var;
        zy zyVar = this.f8933f;
        this.f8928a.add(ph2Var);
        if (this.f8932e == null) {
            this.f8932e = looperMyLooper;
            this.f8929b.add(ph2Var);
            o(o52Var);
        } else if (zyVar != null) {
            i(ph2Var);
            ph2Var.a(this, zyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void h(th2 th2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8930c.f8939b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            rh2 rh2Var = (rh2) it.next();
            if (rh2Var.f8638b == th2Var) {
                copyOnWriteArrayList.remove(rh2Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void i(ph2 ph2Var) {
        this.f8932e.getClass();
        HashSet hashSet = this.f8929b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ph2Var);
        if (zIsEmpty) {
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void j(Handler handler, df2 df2Var) {
        cf2 cf2Var = this.f8931d;
        cf2Var.getClass();
        cf2Var.f3560b.add(new af2(df2Var));
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void k(df2 df2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8931d.f3560b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            af2 af2Var = (af2) it.next();
            if (af2Var.f2747a == df2Var) {
                copyOnWriteArrayList.remove(af2Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void l(Handler handler, th2 th2Var) {
        sh2 sh2Var = this.f8930c;
        sh2Var.getClass();
        sh2Var.f8939b.add(new rh2(handler, th2Var));
    }

    public abstract void o(o52 o52Var);

    public final void p(zy zyVar) {
        this.f8933f = zyVar;
        ArrayList arrayList = this.f8928a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((ph2) arrayList.get(i6)).a(this, zyVar);
        }
    }

    public abstract void q();

    public void m() {
    }

    public void n() {
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public /* synthetic */ void zzM() {
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public /* synthetic */ void zzv() {
    }
}
