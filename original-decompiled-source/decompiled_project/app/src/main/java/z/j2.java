package z;

import androidx.compose.ui.d;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class j2 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public w f34560q;

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.s f34561r;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34563b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34564c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f34565d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34566e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, g2.g1 g1Var, int i11, g2.o0 o0Var) {
            super(1);
            this.f34563b = i10;
            this.f34564c = g1Var;
            this.f34565d = i11;
            this.f34566e = o0Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [eh.p, kotlin.jvm.internal.s] */
        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            ?? r02 = j2.this.f34561r;
            g1.a.f(aVar, this.f34564c, ((f3.m) r02.invoke(new f3.p(((this.f34563b - r1.f11382a) << 32) | ((this.f34565d - r1.f11383b) & BodyPartID.bodyIdMax)), this.f34566e.getLayoutDirection())).f8820a);
            return pg.f0.f21461a;
        }
    }

    public j2() {
        throw null;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(f3.c.a(this.f34560q != w.f34654a ? 0 : f3.b.k(j10), f3.b.i(j10), this.f34560q == w.f34655b ? f3.b.j(j10) : 0, f3.b.h(j10)));
        int iM = jh.j.m(g1VarP.f11382a, f3.b.k(j10), f3.b.i(j10));
        int iM2 = jh.j.m(g1VarP.f11383b, f3.b.j(j10), f3.b.h(j10));
        return o0Var.i0(iM, iM2, qg.a0.f22708a, new a(iM, g1VarP, iM2, o0Var));
    }
}
