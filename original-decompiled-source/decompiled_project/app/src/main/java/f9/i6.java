package f9;

import android.net.Uri;
import h8.v;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9792b;

    public /* synthetic */ i6(Object obj, int i10) {
        this.f9791a = i10;
        this.f9792b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9791a) {
            case 0:
                fg fgVar = (fg) this.f9792b;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ph.l2 l2Var = fgVar.f9575l0;
                    if (l2Var != null) {
                        l2Var.cancel((CancellationException) null);
                    }
                    fgVar.f9575l0 = ph.h.c(androidx.lifecycle.x0.a(fgVar), null, null, new wg(fgVar, uri, null), 3);
                }
                return pg.f0.f21461a;
            default:
                v.e eVar = (v.e) ((h8.v) this.f9792b);
                return t8.y3.a((t8.y3) obj, null, null, null, null, null, null, false, null, null, null, null, 0, null, eVar.f12483a, eVar.f12484b, 3407871);
        }
    }
}
