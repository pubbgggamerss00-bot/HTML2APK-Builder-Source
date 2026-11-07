package f9;

import com.basitce.htmltoapk.domain.model.WebViewSettings;

/* loaded from: classes.dex */
public final /* synthetic */ class qc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10315b;

    public /* synthetic */ qc(Object obj, int i10) {
        this.f10314a = i10;
        this.f10315b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f10314a;
        Object obj2 = this.f10315b;
        switch (i10) {
            case 0:
                WebViewSettings it = (WebViewSettings) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = ((fg) obj2).W0;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                kotlin.jvm.internal.r.e((g2.v) obj, "it");
                boolean z10 = x8.g5.f32665a;
                ((x0.n1) obj2).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
