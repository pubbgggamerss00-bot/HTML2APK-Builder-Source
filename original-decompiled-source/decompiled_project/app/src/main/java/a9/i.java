package a9;

import f9.fg;
import f9.ig;
import java.util.List;
import java.util.concurrent.CancellationException;
import ph.l2;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f237b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f236a = i10;
        this.f237b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f236a;
        Object obj = this.f237b;
        switch (i10) {
            case 0:
                j8.a aVar = ((v) obj).f332b;
                aVar.f15265d.clear();
                aVar.f15262a.g();
                break;
            case 1:
                List<String> list = f9.d1.f9265a;
                ((x0.l1) obj).f(1);
                break;
            default:
                fg fgVar = (fg) obj;
                l2 l2Var = fgVar.f9575l0;
                if (l2Var != null) {
                    l2Var.cancel((CancellationException) null);
                }
                fgVar.f9575l0 = null;
                fgVar.L.setValue(null);
                sh.z0 z0Var = fgVar.K;
                z0Var.getClass();
                z0Var.j(null, "");
                ph.h.c(androidx.lifecycle.x0.a(fgVar), null, null, new ig(fgVar, null), 3);
                break;
        }
        return pg.f0.f21461a;
    }
}
