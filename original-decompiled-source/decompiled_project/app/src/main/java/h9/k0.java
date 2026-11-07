package h9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import x0.j;

/* loaded from: classes.dex */
public final class k0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12694a;

    public k0(Context context) {
        this.f12694a = context;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            p1.d.b(androidx.compose.foundation.layout.g.f(d.a.f1143b, 4), jVar2);
            jVar2.L(-2140046221);
            final Context context = this.f12694a;
            boolean zL = jVar2.l(context) | jVar2.K(z.s.f34624a);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: h9.j0
                    @Override // eh.a
                    public final Object invoke() {
                        Context context2 = context;
                        try {
                            context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context2.getString(R.string.privacy_policy_url))));
                            pg.f0 f0Var = pg.f0.f21461a;
                        } catch (Throwable th2) {
                            pg.q.a(th2);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.c((eh.a) objG, null, false, null, null, null, null, b.f12521c, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
