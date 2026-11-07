package b9;

import android.content.Context;
import android.content.Intent;
import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3917b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f3916a = i10;
        this.f3917b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3916a;
        Object obj = this.f3917b;
        switch (i10) {
            case 0:
                PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) obj;
                int i11 = PdfPreviewActivity.f5788v;
                pdfPreviewActivity.startActivity(new Intent(pdfPreviewActivity, (Class<?>) MainActivity.class).putExtra(MainActivity.EXTRA_OPEN_ROUTE, e2.r.f24648c.f24627a).addFlags(603979776));
                pdfPreviewActivity.finish();
                return pg.f0.f21461a;
            case 1:
                f9.d1.o((x0.n1) obj, false);
                return pg.f0.f21461a;
            default:
                return q5.v.a((Context) obj);
        }
    }
}
