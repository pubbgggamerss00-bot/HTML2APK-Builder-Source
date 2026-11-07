package c9;

import android.net.Uri;
import com.basitce.htmltoapk.R;
import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f5093b;

    public /* synthetic */ f0(androidx.lifecycle.w0 w0Var, int i10) {
        this.f5092a = i10;
        this.f5093b = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5092a;
        androidx.lifecycle.w0 w0Var = this.f5093b;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) w0Var;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    s1Var.getClass();
                    if (((Integer) s1Var.f5275g.getValue()) == null) {
                        s1Var.p(Integer.valueOf(R.string.pdf_edit_adding_pdf));
                        ph.h.c(androidx.lifecycle.x0.a(s1Var), null, null, new o1(s1Var, uri, null), 3);
                    }
                }
                break;
            default:
                fg fgVar = (fg) w0Var;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                sh.z0 z0Var = fgVar.f9603z0;
                z0Var.getClass();
                z0Var.j(null, bool);
                if (zBooleanValue) {
                    mh.k kVar = l9.a.f16766a;
                    if (!l9.a.d((String) fgVar.A0.getValue())) {
                        sh.z0 z0Var2 = fgVar.J0;
                        Boolean bool2 = Boolean.TRUE;
                        z0Var2.getClass();
                        z0Var2.j(null, bool2);
                    }
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
