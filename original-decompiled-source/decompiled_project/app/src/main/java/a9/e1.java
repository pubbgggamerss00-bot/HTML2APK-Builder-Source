package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import i8.a;
import j1.d;

/* loaded from: classes.dex */
public final class e1 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8.a f190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f195g;

    public e1(String str, i8.a aVar, boolean z10, boolean z11, eh.a<pg.f0> aVar2, String str2, eh.a<pg.f0> aVar3) {
        this.f189a = str;
        this.f190b = aVar;
        this.f191c = z10;
        this.f192d = z11;
        this.f193e = aVar2;
        this.f194f = str2;
        this.f195g = aVar3;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
        z.q qVarA = z.o.a(z.b.h(12), d.a.f14614m, jVar2, 6);
        int iD = jVar2.D();
        x0.a2 a2VarY = jVar2.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, jVar2);
        i2.g.f13861o.getClass();
        e0.a aVar = g.a.f13863b;
        if (jVar2.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar2.r();
        if (jVar2.m()) {
            jVar2.w(aVar);
        } else {
            jVar2.z();
        }
        ph.v1.j(g.a.f13867f, qVarA, jVar2);
        ph.v1.j(g.a.f13866e, a2VarY, jVar2);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar2, iD, c0128a);
        }
        ph.v1.j(g.a.f13865d, dVarC, jVar2);
        String strC = f3.q.c(R.string.common_pro, jVar2);
        String strC2 = f3.q.c(R.string.premium_price_label_one_time, jVar2);
        i8.a aVar2 = this.f190b;
        boolean z14 = aVar2 instanceof a.b;
        boolean z15 = this.f191c;
        if (z14 || ((aVar2 instanceof a.C0133a) && z15)) {
            z10 = z15;
            z11 = true;
        } else {
            z10 = z15;
            z11 = false;
        }
        String strC3 = f3.q.c(R.string.premium_badge_best_value, jVar2);
        boolean z16 = this.f192d;
        long jC = c2.n0.c(z16 ? 4294956800L : 4292441862L);
        String strC4 = f3.q.c(R.string.premium_purchase_one_time, jVar2);
        boolean z17 = aVar2 instanceof a.C0133a;
        String str = this.f189a;
        if (!z17 || mh.x.A(str)) {
            z12 = z14;
            z13 = false;
        } else {
            z12 = z14;
            z13 = true;
        }
        boolean z18 = z10;
        boolean z19 = z12;
        v0.i(strC, strC2, str, z11, null, strC3, jC, strC4, false, z13, this.f193e, jVar2, 0, 0, 1136);
        String strC5 = f3.q.c(R.string.premium_subscription_title, jVar2);
        String strC6 = f3.q.c(R.string.premium_price_label_subscription, jVar2);
        boolean z20 = z19 || (z17 && z18);
        String strC7 = f3.q.c(R.string.premium_subscription_period_monthly, jVar2);
        String strC8 = f3.q.c(R.string.premium_badge_flexible, jVar2);
        long jC2 = c2.n0.c(z16 ? 4284790262L : 4278356177L);
        String strC9 = f3.q.c(R.string.premium_purchase_subscription, jVar2);
        String str2 = this.f194f;
        v0.i(strC5, strC6, str2, z20, strC7, strC8, jC2, strC9, true, z17 && !mh.x.A(str2), this.f195g, jVar2, 0, 6, 96);
        jVar2.H();
        return pg.f0.f21461a;
    }
}
