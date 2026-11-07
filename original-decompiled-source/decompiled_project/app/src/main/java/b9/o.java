package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3956b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f3955a = i10;
        this.f3956b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3955a;
        Object obj = this.f3956b;
        switch (i10) {
            case 0:
                m9.g0 g0Var = (m9.g0) obj;
                int i11 = PdfPreviewActivity.f5788v;
                g0Var.f17785k.o0(1.0f, r0.getWidth() / 2.0f, r0.getHeight() / 2.0f);
                g0Var.l();
                break;
            default:
                ((x0.n1) obj).setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
