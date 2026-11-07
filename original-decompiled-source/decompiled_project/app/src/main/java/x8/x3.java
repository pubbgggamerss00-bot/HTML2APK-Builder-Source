package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import x0.j;

/* loaded from: classes.dex */
public final class x3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33351d;

    public x3(ProjectEntity projectEntity, j6 j6Var, x0.n1<String> n1Var, x0.n1<Long> n1Var2) {
        this.f33348a = projectEntity;
        this.f33349b = j6Var;
        this.f33350c = n1Var;
        this.f33351d = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1423524907);
            final ProjectEntity projectEntity = this.f33348a;
            boolean zK = jVar2.K(projectEntity);
            final j6 j6Var = this.f33349b;
            boolean zL = zK | jVar2.l(j6Var);
            final x0.n1<String> n1Var = this.f33350c;
            boolean zK2 = zL | jVar2.K(n1Var);
            final x0.n1<Long> n1Var2 = this.f33351d;
            boolean zK3 = zK2 | jVar2.K(n1Var2);
            Object objG = jVar2.g();
            if (zK3 || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: x8.w3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        boolean z10 = g5.f32665a;
                        String newName = (String) n1Var.getValue();
                        kotlin.jvm.internal.r.e(newName, "newName");
                        j6 j6Var2 = j6Var;
                        ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new p7(j6Var2, projectEntity, newName, null), 3);
                        n1Var2.setValue(null);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, !mh.x.A(n1Var.getValue()), null, null, null, c.f32358p, jVar2, 805306368, 506);
        }
        return pg.f0.f21461a;
    }
}
