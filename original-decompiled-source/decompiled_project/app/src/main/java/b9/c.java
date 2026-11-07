package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final class c implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f3764a;

    public c(PdfPreviewActivity pdfPreviewActivity) {
        this.f3764a = pdfPreviewActivity;
    }

    @Override // d.b
    public final void a(b.k kVar) {
        PdfPreviewActivity pdfPreviewActivity = this.f3764a;
        if (pdfPreviewActivity.f3783d) {
            return;
        }
        pdfPreviewActivity.f3783d = true;
        ((i0) pdfPreviewActivity.generatedComponent()).e(pdfPreviewActivity);
    }
}
