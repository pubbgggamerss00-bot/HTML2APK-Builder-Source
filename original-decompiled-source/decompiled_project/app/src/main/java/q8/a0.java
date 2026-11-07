package q8;

import com.basitce.htmltoapk.R;
import t0.ff;
import t0.t4;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.b f22090a = new f1.b(-1338708360, false, a.f22092a);

    /* renamed from: b, reason: collision with root package name */
    public static final f1.b f22091b = new f1.b(-764837387, false, b.f22093a);

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22092a = new a();

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(p0.t1.a(), f3.q.c(R.string.rating_close, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, jVar2, 0, 4);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22093a = new b();

        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 Button = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Button, "$this$Button");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.c(R.string.rating_feedback_thanks_rate_btn, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }
}
