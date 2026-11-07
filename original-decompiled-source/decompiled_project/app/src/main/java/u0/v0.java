package u0;

import t0.ff;
import t0.p2;
import x0.f2;
import x0.h2;

/* loaded from: classes.dex */
public final class v0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f29162a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t2.l0 f29163b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29164c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, int i10) {
            super(2);
            this.f29162a = j10;
            this.f29163b = l0Var;
            this.f29164c = pVar;
            this.f29165d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            v0.a(this.f29162a, this.f29163b, this.f29164c, jVar, f3.i.n(this.f29165d | 1));
            return pg.f0.f21461a;
        }
    }

    public static final void a(long j10, t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.m0 m0Var = ff.f25892a;
            x0.y.b(new f2[]{com.android.aapt.a.b(j10, p2.f26666a), m0Var.a(((t2.l0) kVarP.f(m0Var)).d(l0Var))}, pVar, kVarP, ((i11 >> 3) & 112) | 8);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(j10, l0Var, pVar, i10);
        }
    }
}
