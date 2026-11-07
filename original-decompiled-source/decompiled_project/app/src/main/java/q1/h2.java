package q1;

import androidx.compose.ui.d;
import g2.g1;

/* loaded from: classes.dex */
public final class h2 extends d.c implements i2.b0 {
    public long A;
    public long B;
    public g2 C;

    /* renamed from: q, reason: collision with root package name */
    public float f21698q;

    /* renamed from: r, reason: collision with root package name */
    public float f21699r;

    /* renamed from: s, reason: collision with root package name */
    public float f21700s;

    /* renamed from: t, reason: collision with root package name */
    public float f21701t;

    /* renamed from: v, reason: collision with root package name */
    public float f21702v;

    /* renamed from: w, reason: collision with root package name */
    public float f21703w;

    /* renamed from: x, reason: collision with root package name */
    public long f21704x;

    /* renamed from: y, reason: collision with root package name */
    public f2 f21705y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21706z;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f21707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f21708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, h2 h2Var) {
            super(1);
            this.f21707a = g1Var;
            this.f21708b = h2Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.k(aVar, this.f21707a, 0, 0, this.f21708b.C, 4);
            return pg.f0.f21461a;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f21698q);
        sb.append(", scaleY=");
        sb.append(this.f21699r);
        sb.append(", alpha = ");
        sb.append(this.f21700s);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f21701t);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f21702v);
        sb.append(", cameraDistance=");
        sb.append(this.f21703w);
        sb.append(", transformOrigin=");
        sb.append((Object) l2.d(this.f21704x));
        sb.append(", shape=");
        sb.append(this.f21705y);
        sb.append(", clip=");
        sb.append(this.f21706z);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ad.f.c(this.A, ", spotShadowColor=", sb);
        sb.append((Object) b1.j(this.B));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
