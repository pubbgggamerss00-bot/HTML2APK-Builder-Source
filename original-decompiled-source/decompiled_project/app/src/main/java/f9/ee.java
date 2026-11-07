package f9;

import android.graphics.Color;
import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class ee implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9502a;

    public ee(x0.n1<String> n1Var) {
        this.f9502a = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        long jB;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            try {
                jB = c2.n0.b(Color.parseColor("#" + this.f9502a.getValue()));
            } catch (Exception unused) {
                jB = q1.b1.f21653g;
            }
            float f10 = 6;
            z.g.a(t.o.a(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(d.a.f1143b, 24), h0.f.a(f10)), jB, q1.y1.f21750a), 1, ((t0.e2) jVar2.f(t0.f2.f25858a)).B, h0.f.a(f10)), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
