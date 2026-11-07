package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import x0.j;

/* loaded from: classes.dex */
public final class t3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33193c;

    public t3(ProjectEntity projectEntity, j6 j6Var, x0.n1<Long> n1Var) {
        this.f33191a = projectEntity;
        this.f33192b = j6Var;
        this.f33193c = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1423485299);
            final ProjectEntity projectEntity = this.f33191a;
            boolean zK = jVar2.K(projectEntity);
            final j6 j6Var = this.f33192b;
            boolean zL = zK | jVar2.l(j6Var);
            final x0.n1<Long> n1Var = this.f33193c;
            boolean zK2 = zL | jVar2.K(n1Var);
            Object objG = jVar2.g();
            if (zK2 || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: x8.s3
                    @Override // eh.a
                    public final Object invoke() {
                        j6 j6Var2 = j6Var;
                        l5.a aVarA = androidx.lifecycle.x0.a(j6Var2);
                        wh.c cVar = ph.z0.f21632a;
                        ph.h.c(aVarA, wh.b.f31563c, null, new s6(j6Var2, projectEntity, null), 2);
                        boolean z10 = g5.f32665a;
                        n1Var.setValue(null);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c.f32354l, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
