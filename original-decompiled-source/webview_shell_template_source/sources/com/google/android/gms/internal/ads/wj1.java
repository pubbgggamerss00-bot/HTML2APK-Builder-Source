package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class wj1 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10207a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10208b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f10209c;

    /* renamed from: d, reason: collision with root package name */
    public os1 f10210d;

    public wj1(boolean z6) {
        this.f10207a = z6;
    }

    public final void a(int i6) {
        os1 os1Var = this.f10210d;
        int i7 = j31.f5914a;
        for (int i8 = 0; i8 < this.f10209c; i8++) {
            ((o52) this.f10208b.get(i8)).o(os1Var, this.f10207a, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
        o52Var.getClass();
        ArrayList arrayList = this.f10208b;
        if (arrayList.contains(o52Var)) {
            return;
        }
        arrayList.add(o52Var);
        this.f10209c++;
    }

    public final void k() {
        os1 os1Var = this.f10210d;
        int i6 = j31.f5914a;
        for (int i7 = 0; i7 < this.f10209c; i7++) {
            ((o52) this.f10208b.get(i7)).d(os1Var, this.f10207a);
        }
        this.f10210d = null;
    }

    public final void l(os1 os1Var) {
        for (int i6 = 0; i6 < this.f10209c; i6++) {
            ((o52) this.f10208b.get(i6)).getClass();
        }
    }

    public final void m(os1 os1Var) {
        this.f10210d = os1Var;
        for (int i6 = 0; i6 < this.f10209c; i6++) {
            ((o52) this.f10208b.get(i6)).f(this, os1Var, this.f10207a);
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }
}
