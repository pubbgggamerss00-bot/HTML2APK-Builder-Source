package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import x0.j;

/* loaded from: classes.dex */
public final class h4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f32713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32714d;

    public h4(Context context, x0.n1 n1Var, x0.n1 n1Var2, j6 j6Var) {
        this.f32711a = n1Var;
        this.f32712b = j6Var;
        this.f32713c = context;
        this.f32714d = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1423700367);
            final x0.n1<Boolean> n1Var = this.f32711a;
            boolean zK = jVar2.K(n1Var);
            final j6 j6Var = this.f32712b;
            boolean zL = zK | jVar2.l(j6Var);
            final Context context = this.f32713c;
            boolean zL2 = zL | jVar2.l(context);
            Object objG = jVar2.g();
            if (zL2 || objG == j.a.f31715a) {
                final x0.n1<ProjectEntity> n1Var2 = this.f32714d;
                objG = new eh.a() { // from class: x8.g4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        boolean z10 = g5.f32665a;
                        n1Var.setValue(Boolean.FALSE);
                        x0.n1 n1Var3 = n1Var2;
                        ProjectEntity projectEntity = (ProjectEntity) n1Var3.getValue();
                        j6 j6Var2 = j6Var;
                        Context context2 = context;
                        if (projectEntity != null) {
                            kotlin.jvm.internal.r.e(context2, "context");
                            ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new a7(context2, projectEntity, null, j6Var2, true), 3);
                        } else {
                            kotlin.jvm.internal.r.e(context2, "context");
                            ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new y6(j6Var2, context2, true, null), 3);
                        }
                        n1Var3.setValue(null);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG, null, false, null, null, null, c.f32365w, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
