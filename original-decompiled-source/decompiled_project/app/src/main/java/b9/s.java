package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import x8.j6;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4086b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f4085a = i10;
        this.f4086b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4085a;
        Object obj = this.f4086b;
        switch (i10) {
            case 0:
                PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) obj;
                int i11 = PdfPreviewActivity.f5788v;
                pdfPreviewActivity.n(new c0(pdfPreviewActivity, pdfPreviewActivity.j(), null));
                break;
            default:
                ((j6) obj).f32798y.setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
