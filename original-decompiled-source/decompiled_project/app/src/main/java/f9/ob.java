package f9;

import android.net.Uri;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class ob implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f10194b;

    public /* synthetic */ ob(androidx.lifecycle.w0 w0Var, int i10) {
        this.f10193a = i10;
        this.f10194b = w0Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10193a) {
            case 0:
                fg fgVar = (fg) this.f10194b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.f9587r0;
                z0Var.getClass();
                z0Var.j(null, bool);
                break;
            default:
                g9.y yVar = (g9.y) this.f10194b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ph.l2 l2Var = yVar.f11833g;
                    if (l2Var != null) {
                        l2Var.cancel((CancellationException) null);
                    }
                    yVar.f11833g = ph.h.c(androidx.lifecycle.x0.a(yVar), null, null, new g9.d0(yVar, uri, null), 3);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
