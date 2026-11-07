package m0;

import m0.a2;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.s implements eh.a<p1.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<f3.p> f17309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(r1 r1Var, x0.n1<f3.p> n1Var) {
        super(0);
        this.f17308a = r1Var;
        this.f17309b = n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1.c invoke() {
        long jB;
        long j10 = this.f17309b.getValue().f8826a;
        r1 r1Var = this.f17308a;
        z zVarE = r1Var.e();
        if (zVarE != null) {
            i0.u1 u1VarD = r1Var.d();
            int i10 = u1VarD == null ? -1 : a2.a.f17256a[u1VarD.ordinal()];
            if (i10 == -1) {
                jB = 9205357640488583168L;
            } else if (i10 == 1) {
                jB = a2.b(r1Var, j10, zVarE.f17593a);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new pg.l();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor");
                }
                jB = a2.b(r1Var, j10, zVarE.f17594b);
            }
        }
        return new p1.c(jB);
    }
}
