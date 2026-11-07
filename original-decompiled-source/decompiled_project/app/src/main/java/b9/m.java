package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3936c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f3934a = i10;
        this.f3935b = obj;
        this.f3936c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3934a;
        Object obj = this.f3936c;
        Object obj2 = this.f3935b;
        switch (i10) {
            case 0:
                m9.g0 g0Var = (m9.g0) obj2;
                int i11 = PdfPreviewActivity.f5788v;
                g0Var.setNight(!g0Var.S);
                ((PdfPreviewActivity) obj).f5800r.f4163g.setValue(Boolean.valueOf(g0Var.S));
                break;
            default:
                sh.z0 z0Var = ((f9.g) obj2).f9646e;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                p5.x.c(e2.r.f24648c.f24627a, (p5.s0) obj);
                break;
        }
        return pg.f0.f21461a;
    }
}
