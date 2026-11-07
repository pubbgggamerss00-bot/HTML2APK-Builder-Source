package f9;

import com.basitce.htmltoapk.domain.model.ProjectKind;
import j7.i;

/* loaded from: classes.dex */
public final /* synthetic */ class pa implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10245b;

    public /* synthetic */ pa(Object obj, int i10) {
        this.f10244a = i10;
        this.f10245b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10244a) {
            case 0:
                ((eh.l) this.f10245b).invoke(ProjectKind.APK);
                return pg.f0.f21461a;
            case 1:
                return c0.g0.c((i.a) this.f10245b);
            default:
                x8.j6 j6Var = (x8.j6) this.f10245b;
                j6Var.f32793t = true;
                sh.z0 z0Var = j6Var.f32794u;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new x8.k7(j6Var, null), 3);
                return pg.f0.f21461a;
        }
    }
}
