package j9;

import android.content.Context;
import j9.x1;
import x0.r3;

/* loaded from: classes.dex */
public final class t0 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1.a f15534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f15536c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f15537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f15538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f15540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15541h;

    public t0(x1.a aVar, boolean z10, p5.x xVar, x1 x1Var, Context context, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3) {
        this.f15534a = aVar;
        this.f15535b = z10;
        this.f15536c = xVar;
        this.f15537d = x1Var;
        this.f15538e = context;
        this.f15539f = n1Var;
        this.f15540g = n1Var2;
        this.f15541h = n1Var3;
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
            q8.i.a(null, null, f1.c.b(646051382, new s0(padding, this.f15534a, this.f15535b, this.f15536c, this.f15537d, this.f15538e, this.f15539f, this.f15540g, this.f15541h), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
