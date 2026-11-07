package f9;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9210b;

    public /* synthetic */ c3(Object obj, int i10) {
        this.f9209a = i10;
        this.f9210b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f9209a;
        Object obj = this.f9210b;
        switch (i10) {
            case 0:
                List<String> list = d1.f9265a;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
            case 1:
                fg fgVar = (fg) obj;
                sh.z0 z0Var = fgVar.f9563f0;
                z0Var.j(null, qg.x.x(qg.x.O(((Map) fgVar.f9565g0.getValue()).keySet(), (Collection) z0Var.getValue())));
                break;
            default:
                sh.z0 z0Var2 = ((g9.y) obj).f11837k;
                z0Var2.getClass();
                z0Var2.j(null, "LOCAL");
                break;
        }
        return pg.f0.f21461a;
    }
}
