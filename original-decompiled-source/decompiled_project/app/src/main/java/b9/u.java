package b9;

import android.net.Uri;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4111b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f4110a = i10;
        this.f4111b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f4110a) {
            case 0:
                ((PdfPreviewActivity) this.f4111b).f5800r.f4160d.f(((Integer) obj).intValue());
                return pg.f0.f21461a;
            case 1:
                fg fgVar = (fg) this.f4111b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.f9593u0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            case 2:
                eh.l lVar = (eh.l) this.f4111b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    lVar.invoke(uri);
                }
                return pg.f0.f21461a;
            default:
                String str = (String) this.f4111b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return mh.x.A(it) ? it.length() < str.length() ? str : it : k3.a.a(str, it);
        }
    }
}
