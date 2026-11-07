package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4099b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f4098a = i10;
        this.f4099b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4098a;
        Object obj = this.f4099b;
        switch (i10) {
            case 0:
                ((PdfPreviewActivity) obj).f5800r.f4159c.setValue(Boolean.TRUE);
                break;
            default:
                List<String> list = f9.d1.f9265a;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
