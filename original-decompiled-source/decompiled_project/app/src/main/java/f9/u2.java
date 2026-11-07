package f9;

import com.basitce.htmltoapk.R;
import java.util.List;

/* loaded from: classes.dex */
public final class u2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10666c;

    public u2(long j10, boolean z10, x0.n1<Boolean> n1Var) {
        this.f10664a = j10;
        this.f10665b = z10;
        this.f10666c = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            w1.d dVarA = r0.p0.a();
            String strC = f3.q.c(R.string.editor_html_find, jVar2);
            jVar2.L(-182437335);
            List<String> list = d1.f9265a;
            long j10 = this.f10666c.getValue().booleanValue() ? this.f10664a : ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s;
            jVar2.B();
            t0.t4.b(dVarA, strC, null, q1.b1.c(this.f10665b ? 1.0f : 0.38f, j10), jVar2, 0, 4);
        }
        return pg.f0.f21461a;
    }
}
