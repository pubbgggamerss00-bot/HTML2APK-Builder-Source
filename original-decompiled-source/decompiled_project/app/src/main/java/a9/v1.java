package a9;

import android.content.Context;
import x0.r3;

/* loaded from: classes.dex */
public final class v1 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r3<g8.x> f355h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f356j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f357k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f358l;

    public v1(p5.x xVar, Context context, b2 b2Var, x0.n1 n1Var, x0.n1 n1Var2, String str, String str2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6) {
        this.f348a = xVar;
        this.f349b = context;
        this.f350c = b2Var;
        this.f351d = n1Var;
        this.f352e = n1Var2;
        this.f353f = str;
        this.f354g = str2;
        this.f355h = n1Var3;
        this.f356j = n1Var4;
        this.f357k = n1Var5;
        this.f358l = n1Var6;
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
            p9.d.a(padding.c(), f1.c.b(1531324876, new u1(this.f348a, padding, this.f349b, this.f350c, this.f351d, this.f352e, this.f353f, this.f354g, this.f355h, this.f356j, this.f357k, this.f358l), jVar2), jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
