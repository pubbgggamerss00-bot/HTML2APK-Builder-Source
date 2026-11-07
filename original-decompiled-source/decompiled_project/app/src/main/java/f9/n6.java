package f9;

import android.net.Uri;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10108b;

    public /* synthetic */ n6(Object obj, int i10) {
        this.f10107a = i10;
        this.f10108b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10107a) {
            case 0:
                fg fgVar = (fg) this.f10108b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ph.l2 l2Var = fgVar.f9571j0;
                    if (l2Var != null) {
                        l2Var.cancel((CancellationException) null);
                    }
                    fgVar.f9571j0 = ph.h.c(androidx.lifecycle.x0.a(fgVar), null, null, new ug(fgVar, uri, null), 3);
                }
                break;
            default:
                ((eh.l) this.f10108b).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                break;
        }
        return pg.f0.f21461a;
    }
}
