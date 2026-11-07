package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;
import x8.j6;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4073b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f4072a = i10;
        this.f4073b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        eh.l<File, pg.f0> onSave;
        int i10 = this.f4072a;
        Object obj = this.f4073b;
        switch (i10) {
            case 0:
                m9.g0 g0Var = (m9.g0) obj;
                int i11 = PdfPreviewActivity.f5788v;
                File documentFile = g0Var.getDocumentFile();
                if (documentFile != null && (onSave = g0Var.getOnSave()) != null) {
                    onSave.invoke(documentFile);
                }
                break;
            default:
                ((j6) obj).f32796w.setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
