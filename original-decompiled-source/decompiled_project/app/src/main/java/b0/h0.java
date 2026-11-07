package b0;

import g2.g1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h0 implements d0.v0<g0> {

    /* renamed from: a, reason: collision with root package name */
    public final o f3363a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.q0 f3364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3365c;

    public h0(long j10, boolean z10, o oVar, d0.q0 q0Var) {
        this.f3363a = oVar;
        this.f3364b = q0Var;
        this.f3365c = f3.c.b(z10 ? f3.b.i(j10) : Integer.MAX_VALUE, z10 ? Integer.MAX_VALUE : f3.b.h(j10), 5);
    }

    public static g0 c(w wVar, int i10) {
        long j10 = wVar.f3365c;
        o oVar = wVar.f3363a;
        return wVar.b(i10, oVar.d(i10), oVar.e(i10), wVar.f3364b.C0(i10, j10), j10);
    }

    @Override // d0.v0
    public final d0.s0 a(int i10, int i11, int i12, long j10) {
        o oVar = this.f3363a;
        return b(i10, oVar.d(i10), oVar.e(i10), this.f3364b.C0(i10, j10), j10);
    }

    public abstract g0 b(int i10, Object obj, Object obj2, List<? extends g1> list, long j10);
}
