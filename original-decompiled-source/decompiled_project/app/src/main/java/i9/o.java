package i9;

import android.content.Context;
import java.util.Map;
import x0.n1;
import x0.r3;
import z.f1;

/* loaded from: classes.dex */
public final class o implements eh.q<f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f14369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f14370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r3<Map<String, d8.k>> f14371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1 f14372g;

    public o(boolean z10, boolean z11, Context context, r rVar, n1 n1Var, n1 n1Var2, n1 n1Var3) {
        this.f14366a = z10;
        this.f14367b = z11;
        this.f14368c = context;
        this.f14369d = rVar;
        this.f14370e = n1Var;
        this.f14371f = n1Var2;
        this.f14372g = n1Var3;
    }

    @Override // eh.q
    public final pg.f0 b(f1 f1Var, x0.j jVar, Integer num) {
        f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            p9.d.a(padding.c(), f1.c.b(-491382428, new n(padding, this.f14366a, this.f14367b, this.f14368c, this.f14369d, this.f14370e, this.f14371f, this.f14372g), jVar2), jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
