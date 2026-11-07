package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9.g0 f3925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3926b;

    public /* synthetic */ l(PdfPreviewActivity pdfPreviewActivity, m9.g0 g0Var) {
        this.f3925a = g0Var;
        this.f3926b = pdfPreviewActivity;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int i10 = PdfPreviewActivity.f5788v;
        this.f3925a.n(iIntValue);
        y2 y2Var = this.f3926b.f5800r;
        int iG = y2Var.f4161e.g() - 1;
        if (iG < 0) {
            iG = 0;
        }
        y2Var.f4160d.f(jh.j.m(iIntValue, 0, iG));
        return pg.f0.f21461a;
    }
}
