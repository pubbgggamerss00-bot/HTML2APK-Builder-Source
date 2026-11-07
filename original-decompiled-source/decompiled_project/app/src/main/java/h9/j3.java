package h9;

import android.content.Context;

/* loaded from: classes.dex */
public final class j3 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f12677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f12678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f12679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f12680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f12682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12684h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b4 f12685j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12686k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f12687l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.r3<k9.a> f12688m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f12689n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12690p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Long> f12691q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12692r;

    public j3(float f10, f1.b bVar, f1.b bVar2, p5.x xVar, x0.n1 n1Var, Context context, x0.n1 n1Var2, x0.n1 n1Var3, b4 b4Var, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, x0.n1 n1Var9, x0.n1 n1Var10) {
        this.f12677a = f10;
        this.f12678b = bVar;
        this.f12679c = bVar2;
        this.f12680d = xVar;
        this.f12681e = n1Var;
        this.f12682f = context;
        this.f12683g = n1Var2;
        this.f12684h = n1Var3;
        this.f12685j = b4Var;
        this.f12686k = n1Var4;
        this.f12687l = n1Var5;
        this.f12688m = n1Var6;
        this.f12689n = n1Var7;
        this.f12690p = n1Var8;
        this.f12691q = n1Var9;
        this.f12692r = n1Var10;
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
            q8.i.a(null, null, f1.c.b(-155563028, new i3(padding, this.f12677a, this.f12678b, this.f12679c, this.f12680d, this.f12681e, this.f12682f, this.f12683g, this.f12684h, this.f12685j, this.f12686k, this.f12687l, this.f12688m, this.f12689n, this.f12690p, this.f12691q, this.f12692r), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
