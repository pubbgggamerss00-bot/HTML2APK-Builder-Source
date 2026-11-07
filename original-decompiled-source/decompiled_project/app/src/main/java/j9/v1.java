package j9;

import j9.x1;
import java.util.List;
import x0.r3;

/* loaded from: classes.dex */
public final class v1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<List<x1.a>> f15565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.x f15568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1 f15569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15570h;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(z.f1 f1Var, float f10, r3<? extends List<x1.a>> r3Var, q8.d0 d0Var, long j10, p5.x xVar, x1 x1Var, r3<Boolean> r3Var2) {
        this.f15563a = f1Var;
        this.f15564b = f10;
        this.f15565c = r3Var;
        this.f15566d = d0Var;
        this.f15567e = j10;
        this.f15568f = xVar;
        this.f15569g = x1Var;
        this.f15570h = r3Var2;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            z.m.a(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, this.f15563a), null, f1.c.b(230127761, new u1(this.f15564b, this.f15567e, this.f15569g, this.f15568f, this.f15566d, this.f15565c, this.f15570h), jVar2), jVar2, 3072, 6);
        }
        return pg.f0.f21461a;
    }
}
