package c0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 implements d0.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f4338a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.q0 f4339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.q0 f4341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f4342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4345h;

    public a0(p pVar, d0.q0 q0Var, int i10, w0 w0Var, int i11, int i12, long j10) {
        this.f4341d = q0Var;
        this.f4342e = w0Var;
        this.f4343f = i11;
        this.f4344g = i12;
        this.f4345h = j10;
        this.f4338a = pVar;
        this.f4339b = q0Var;
        this.f4340c = i10;
    }

    @Override // d0.v0
    public final d0.s0 a(int i10, int i11, int i12, long j10) {
        return b(i10, i11, i12, this.f4340c, j10);
    }

    public final m0 b(int i10, int i11, int i12, int i13, long j10) {
        int iJ;
        p pVar = this.f4338a;
        Object objD = pVar.d(i10);
        Object objE = pVar.e(i10);
        List<g2.g1> listC0 = this.f4339b.C0(i10, j10);
        if (f3.b.g(j10)) {
            iJ = f3.b.k(j10);
        } else {
            if (!f3.b.f(j10)) {
                y.c.a("does not have fixed height");
            }
            iJ = f3.b.j(j10);
        }
        int i14 = iJ;
        f3.r layoutDirection = this.f4341d.getLayoutDirection();
        LazyLayoutItemAnimator<m0> lazyLayoutItemAnimator = this.f4342e.f4517m;
        return new m0(i10, objD, i14, i13, layoutDirection, this.f4343f, this.f4344g, listC0, this.f4345h, objE, lazyLayoutItemAnimator, j10, i11, i12);
    }
}
