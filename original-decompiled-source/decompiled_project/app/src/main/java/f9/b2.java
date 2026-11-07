package f9;

import android.content.Context;
import android.view.View;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class b2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f8996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f8997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg f8998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f8999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9000h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9001j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9002k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f9003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9004m;

    public b2(Context context, View view, eh.a aVar, fg fgVar, ph.i0 i0Var, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, boolean z10) {
        this.f8993a = n1Var;
        this.f8994b = n1Var2;
        this.f8995c = z10;
        this.f8996d = i0Var;
        this.f8997e = context;
        this.f8998f = fgVar;
        this.f8999g = view;
        this.f9000h = aVar;
        this.f9001j = n1Var3;
        this.f9002k = n1Var4;
        this.f9003l = n1Var5;
        this.f9004m = n1Var6;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(294422770);
            final x0.n1<Boolean> n1Var = this.f8993a;
            boolean zK = jVar2.K(n1Var);
            final x0.n1 n1Var2 = this.f8994b;
            boolean zK2 = zK | jVar2.K(n1Var2) | jVar2.c(this.f8995c) | jVar2.l(this.f8996d) | jVar2.l(this.f8997e) | jVar2.l(this.f8998f) | jVar2.l(this.f8999g) | jVar2.K(this.f9000h);
            Object objG = jVar2.g();
            if (zK2 || objG == j.a.f31715a) {
                final Context context = this.f8997e;
                final View view = this.f8999g;
                final eh.a<pg.f0> aVar = this.f9000h;
                final fg fgVar = this.f8998f;
                final ph.i0 i0Var = this.f8996d;
                final x0.n1<Boolean> n1Var3 = this.f9001j;
                final x0.n1<Boolean> n1Var4 = this.f9002k;
                final x0.n1<y2.c0> n1Var5 = this.f9003l;
                final x0.n1<String> n1Var6 = this.f9004m;
                final boolean z10 = this.f8995c;
                eh.a aVar2 = new eh.a() { // from class: f9.z1
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        n1Var.setValue(Boolean.FALSE);
                        final fg fgVar2 = fgVar;
                        final eh.a aVar3 = aVar;
                        final x0.n1 n1Var7 = n1Var3;
                        final Context context2 = context;
                        final View view2 = view;
                        d1.q(z10, i0Var, n1Var2, n1Var4, n1Var5, fgVar2, context2, n1Var6, new eh.a() { // from class: f9.a2
                            @Override // eh.a
                            public final Object invoke() {
                                d1.j(fgVar2, aVar3, n1Var7, context2, view2);
                                return pg.f0.f21461a;
                            }
                        });
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar2);
                objG = aVar2;
            }
            jVar2.B();
            t0.x0.b((eh.a) objG, null, false, null, null, null, null, c.f9140a, jVar2, 805306368, 510);
        }
        return pg.f0.f21461a;
    }
}
