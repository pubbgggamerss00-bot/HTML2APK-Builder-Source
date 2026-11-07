package b9;

import android.net.Uri;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3893b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f3892a = i10;
        this.f3893b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3892a;
        Object obj = this.f3893b;
        switch (i10) {
            case 0:
                PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) obj;
                int i11 = PdfPreviewActivity.f5788v;
                Uri data = pdfPreviewActivity.getIntent().getData();
                if (data != null) {
                    pdfPreviewActivity.n(new b0(pdfPreviewActivity, data, null, null));
                }
                break;
            default:
                ((eh.l) obj).invoke("html_blank");
                break;
        }
        return pg.f0.f21461a;
    }
}
