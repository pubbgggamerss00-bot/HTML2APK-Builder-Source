package c9;

import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;

/* loaded from: classes.dex */
public final class c implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfEditorActivity f5073a;

    public c(PdfEditorActivity pdfEditorActivity) {
        this.f5073a = pdfEditorActivity;
    }

    @Override // d.b
    public final void a(b.k kVar) {
        PdfEditorActivity pdfEditorActivity = this.f5073a;
        if (pdfEditorActivity.f5079d) {
            return;
        }
        pdfEditorActivity.f5079d = true;
        ((i) pdfEditorActivity.generatedComponent()).f(pdfEditorActivity);
    }
}
