package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.g0 f3878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3879b;

    public /* synthetic */ i(PdfPreviewActivity pdfPreviewActivity, m9.g0 g0Var) {
        this.f3878a = g0Var;
        this.f3879b = pdfPreviewActivity;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = PdfPreviewActivity.f5788v;
        if (!this.f3878a.d()) {
            this.f3879b.finish();
        }
        return pg.f0.f21461a;
    }
}
