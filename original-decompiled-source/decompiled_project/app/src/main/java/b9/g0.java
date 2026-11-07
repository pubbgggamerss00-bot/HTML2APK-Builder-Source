package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.p implements eh.a<a3> {
    @Override // eh.a
    public final a3 invoke() {
        File documentFile;
        PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) this.receiver;
        a3 a3Var = pdfPreviewActivity.f5794k;
        if (a3Var != null) {
            return a3Var;
        }
        m9.g0 g0Var = pdfPreviewActivity.f5792h;
        if (g0Var == null || (documentFile = g0Var.getDocumentFile()) == null) {
            return null;
        }
        a3 a3Var2 = new a3(documentFile);
        pdfPreviewActivity.f5794k = a3Var2;
        return a3Var2;
    }
}
