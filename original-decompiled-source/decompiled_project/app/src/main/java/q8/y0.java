package q8;

import x0.s3;

/* loaded from: classes.dex */
public final class y0 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f22497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f22498b;

    public y0(f1.b bVar, float f10) {
        this.f22497a = bVar;
        this.f22498b = f10;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(BackgroundBox) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            this.f22497a.b(BackgroundBox, jVar2, Integer.valueOf(iIntValue & 14));
            s3 s3Var = j2.j2.f14779h;
            f3.d dVar = (f3.d) jVar2.f(s3Var);
            float f10 = this.f22498b;
            float fN0 = dVar.N0(24 + f10);
            float fN02 = ((f3.d) jVar2.f(s3Var)).N0(f10 - 16);
            androidx.compose.ui.d infinityFade = BackgroundBox.e();
            long j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25768n;
            kotlin.jvm.internal.r.e(infinityFade, "$this$infinityFade");
            z.g.a(androidx.compose.ui.draw.a.b(infinityFade, new a1(fN0, true, j10, fN02)), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
