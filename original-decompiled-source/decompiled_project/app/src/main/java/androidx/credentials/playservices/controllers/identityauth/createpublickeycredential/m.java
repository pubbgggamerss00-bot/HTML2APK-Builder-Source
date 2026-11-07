package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;
import m9.g0;
import pg.f0;
import x0.n1;
import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1528b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f1527a = i10;
        this.f1528b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        eh.l<File, f0> onPrint;
        int i10 = this.f1527a;
        Object obj = this.f1528b;
        switch (i10) {
            case 0:
                break;
            case 1:
                g0 g0Var = (g0) obj;
                int i11 = PdfPreviewActivity.f5788v;
                File documentFile = g0Var.getDocumentFile();
                if (documentFile != null && (onPrint = g0Var.getOnPrint()) != null) {
                    onPrint.invoke(documentFile);
                }
                break;
            default:
                g5.l((n1) obj, false);
                break;
        }
        return f0.f21461a;
    }
}
