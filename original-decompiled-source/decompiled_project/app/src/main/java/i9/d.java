package i9;

import androidx.compose.ui.d;
import c2.n0;
import com.basitce.htmltoapk.R;
import t0.ff;
import t0.nf;
import t0.of;
import t2.l0;
import z.n1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f14298a = new f1.b(1614609874, false, a.f14300a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f14299b = new f1.b(-1121923609, false, b.f14301a);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14300a = new a();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                String strC = f3.q.c(R.string.support_cats_interactive_hint, jVar2);
                l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26552o;
                ff.b(strC, androidx.compose.foundation.layout.f.i(d.a.f1143b, 12, 6), n0.c(4294956800L), 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 197040, 0, 65496);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14301a = new b();

        @Override // eh.q
        public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
            n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.support_success_button, jVar2), null, 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65502);
            }
            return pg.f0.f21461a;
        }
    }
}
