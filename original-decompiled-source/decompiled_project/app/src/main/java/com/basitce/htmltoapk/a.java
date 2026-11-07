package com.basitce.htmltoapk;

import android.net.Uri;
import d9.z;
import eh.l;
import eh.p;
import kotlin.jvm.internal.r;
import pg.f0;
import s8.b2;
import s8.e2;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class a implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f5657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<Integer> f5658c;

    public a(MainActivity mainActivity, r3<Boolean> r3Var, r3<Integer> r3Var2) {
        this.f5656a = mainActivity;
        this.f5657b = r3Var;
        this.f5658c = r3Var2;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            String str = (r.a(this.f5657b.getValue(), Boolean.TRUE) ? e2.j.f24640c : e2.o.f24645c).f24627a;
            r3<Integer> r3Var = this.f5658c;
            boolean z10 = r3Var.getValue().intValue() > 0 && r3Var.getValue().intValue() % 10 == 0;
            final MainActivity mainActivity = this.f5656a;
            String debugIntentRoute = mainActivity.getDebugIntentRoute();
            String pendingRoute = mainActivity.getPendingRoute();
            jVar2.L(769023425);
            boolean zL = jVar2.l(mainActivity);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new z(mainActivity, 2);
                jVar2.C(objG);
            }
            eh.a aVar = (eh.a) objG;
            jVar2.B();
            Uri incomingHtml = mainActivity.getIncomingHtml();
            jVar2.L(769027713);
            boolean zL2 = jVar2.l(mainActivity);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == obj) {
                objG2 = new f8.p(mainActivity, 0);
                jVar2.C(objG2);
            }
            eh.a aVar2 = (eh.a) objG2;
            jVar2.B();
            boolean showLaunchPremium = mainActivity.getShowLaunchPremium();
            jVar2.L(769032615);
            boolean zL3 = jVar2.l(mainActivity);
            Object objG3 = jVar2.g();
            if (zL3 || objG3 == obj) {
                objG3 = new eh.a() { // from class: f8.q
                    @Override // eh.a
                    public final Object invoke() {
                        mainActivity.setShowLaunchPremium(false);
                        return f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            eh.a aVar3 = (eh.a) objG3;
            jVar2.B();
            jVar2.L(769035205);
            boolean zL4 = jVar2.l(mainActivity);
            Object objG4 = jVar2.g();
            if (zL4 || objG4 == obj) {
                objG4 = new f8.r(mainActivity, 0);
                jVar2.C(objG4);
            }
            jVar2.B();
            b2.a(str, z10, debugIntentRoute, pendingRoute, aVar, incomingHtml, aVar2, showLaunchPremium, aVar3, (l) objG4, jVar2, 0);
        }
        return f0.f21461a;
    }
}
