package c9;

import android.content.Intent;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;
import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5104b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f5103a = i10;
        this.f5104b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5103a) {
            case 0:
                PdfEditorActivity pdfEditorActivity = (PdfEditorActivity) this.f5104b;
                int[] map = (int[]) obj;
                kotlin.jvm.internal.r.e(map, "map");
                pdfEditorActivity.setResult(-1, new Intent().putExtra("pdf_edit_page_map", map));
                pdfEditorActivity.finish();
                break;
            default:
                fg fgVar = (fg) this.f5104b;
                if (!((Boolean) obj).booleanValue()) {
                    sh.z0 z0Var = fgVar.f9602z;
                    z0Var.setValue(fg.p((String) z0Var.getValue()));
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
