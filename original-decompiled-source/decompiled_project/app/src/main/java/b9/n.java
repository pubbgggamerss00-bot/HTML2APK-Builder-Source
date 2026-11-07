package b9;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3949b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f3948a = i10;
        this.f3949b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f3948a;
        Object obj = this.f3949b;
        switch (i10) {
            case 0:
                int i11 = PdfPreviewActivity.f5788v;
                break;
            case 1:
                sh.z0 z0Var = ((f9.g) obj).f9646e;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                break;
            default:
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
