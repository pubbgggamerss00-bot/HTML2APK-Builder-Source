package a9;

import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class x1 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f365a;

    public x1(String str) {
        this.f365a = str;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            ff.b(this.f365a, null, q1.b1.f21648b, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196992, 0, 65498);
        }
        return pg.f0.f21461a;
    }
}
