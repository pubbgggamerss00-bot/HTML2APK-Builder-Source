package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class of0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7742c;

    public /* synthetic */ of0(int i6, Object obj, Object obj2) {
        this.f7740a = i6;
        this.f7741b = obj;
        this.f7742c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f7740a) {
            case 0:
                vf0 vf0Var = (vf0) this.f7741b;
                String str = (String) this.f7742c;
                vf0Var.f9848e.w(new as1(4, vf0Var, (Throwable) obj));
                return bs1.m(str);
            case 1:
                fj0 fj0Var = (fj0) this.f7741b;
                r30 r30Var = (r30) obj;
                r30Var.A = (cd1) this.f7742c;
                ox0 ox0Var = fj0Var.h;
                return ox0Var.a(r30Var, new l2(10, ox0Var.f7883b), new xj1(15, ox0Var), new ow0(r30Var, 1));
            default:
                ac1 ac1Var = (ac1) obj;
                ((ed1) this.f7741b).f4235b = ac1Var;
                Iterator it = ((List) ac1Var.f2648b.s).iterator();
                boolean z6 = false;
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((tb1) it.next()).f9171a.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).contains("FirstPartyRenderer")) {
                                z6 = true;
                            }
                        }
                    } else if (z6) {
                        return ((fj0) this.f7742c).a(bs1.m(ac1Var));
                    }
                }
                return ds1.f4001t;
        }
    }
}
