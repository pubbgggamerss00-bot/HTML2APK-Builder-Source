package j9;

import j9.x1;
import java.util.List;
import x0.r3;

/* loaded from: classes.dex */
public final class i1 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<x1.a> f15434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f15435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.x f15439f;

    public i1(List list, x1 x1Var, x0.n1 n1Var, q8.d0 d0Var, long j10, p5.x xVar) {
        this.f15434a = list;
        this.f15435b = x1Var;
        this.f15436c = n1Var;
        this.f15437d = d0Var;
        this.f15438e = j10;
        this.f15439f = xVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        z.f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            q8.i.a(null, null, f1.c.b(-21216062, new h1(padding, this.f15434a, this.f15435b, this.f15436c, this.f15437d, this.f15438e, this.f15439f), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
