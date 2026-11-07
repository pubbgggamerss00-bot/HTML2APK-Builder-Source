package b9;

import android.os.Handler;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3837b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f3836a = i10;
        this.f3837b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        Object objA;
        int i10 = this.f3836a;
        Object obj2 = this.f3837b;
        switch (i10) {
            case 0:
                PdfPreviewActivity pdfPreviewActivity = (PdfPreviewActivity) obj2;
                File file = (File) obj;
                int i11 = PdfPreviewActivity.f5788v;
                kotlin.jvm.internal.r.e(file, "file");
                pdfPreviewActivity.f5796m = file;
                try {
                    e.c<String> cVar = pdfPreviewActivity.f5802t;
                    Handler handler = m9.r0.f17892a;
                    cVar.a(m9.r0.a(pdfPreviewActivity.f5800r.b()));
                    objA = pg.f0.f21461a;
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (pg.p.a(objA) != null) {
                    pdfPreviewActivity.f5796m = null;
                }
                break;
            default:
                x0.n1 n1Var = (x0.n1) obj2;
                String value = (String) obj;
                kotlin.jvm.internal.r.e(value, "value");
                StringBuilder sb = new StringBuilder();
                int length = value.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = value.charAt(i12);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String strB0 = mh.y.b0(9, sb.toString());
                List<String> list = f9.d1.f9265a;
                n1Var.setValue(strB0);
                break;
        }
        return pg.f0.f21461a;
    }
}
