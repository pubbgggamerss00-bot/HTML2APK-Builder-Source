package f9;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import mh.i;

/* loaded from: classes.dex */
public final /* synthetic */ class nb implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10136b;

    public /* synthetic */ nb(Object obj, int i10) {
        this.f10135a = i10;
        this.f10136b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10135a) {
            case 0:
                fg fgVar = (fg) this.f10136b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.f9585q0;
                z0Var.getClass();
                z0Var.j(null, it);
                return pg.f0.f21461a;
            case 1:
                g9.y yVar = (g9.y) this.f10136b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ph.l2 l2Var = yVar.f11833g;
                    if (l2Var != null) {
                        l2Var.cancel((CancellationException) null);
                    }
                    yVar.f11833g = ph.h.c(androidx.lifecycle.x0.a(yVar), null, null, new g9.c0(yVar, uri, null), 3);
                }
                return pg.f0.f21461a;
            default:
                return ((i.b) this.f10136b).e(((Integer) obj).intValue());
        }
    }
}
