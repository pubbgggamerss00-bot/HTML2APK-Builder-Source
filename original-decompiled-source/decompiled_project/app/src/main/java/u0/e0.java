package u0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e0<T> extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public a0<T> f28977q;

    /* renamed from: r, reason: collision with root package name */
    public eh.p<? super f3.p, ? super f3.b, ? extends pg.n<? extends c0<T>, ? extends T>> f28978r;

    /* renamed from: s, reason: collision with root package name */
    public v.t0 f28979s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28980t;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f28981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0<T> f28982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f28983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.o0 o0Var, e0<T> e0Var, g2.g1 g1Var) {
            super(1);
            this.f28981a = o0Var;
            this.f28982b = e0Var;
            this.f28983c = g1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            boolean zI0 = this.f28981a.I0();
            e0<T> e0Var = this.f28982b;
            float fD = zI0 ? e0Var.f28977q.e().d(e0Var.f28977q.f28948h.getValue()) : e0Var.f28977q.g();
            v.t0 t0Var = e0Var.f28979s;
            float f10 = t0Var == v.t0.f30084b ? fD : 0.0f;
            if (t0Var != v.t0.f30083a) {
                fD = 0.0f;
            }
            aVar2.d(this.f28983c, gh.a.b(f10), gh.a.b(fD), CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    public e0() {
        throw null;
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        this.f28980t = false;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        if (!o0Var.I0() || !this.f28980t) {
            pg.n<? extends c0<T>, ? extends T> nVarInvoke = this.f28978r.invoke(new f3.p((g1VarP.f11383b & BodyPartID.bodyIdMax) | (g1VarP.f11382a << 32)), new f3.b(j10));
            a0 a0Var = (a0<T>) this.f28977q;
            c0 c0Var = (c0) nVarInvoke.f21469a;
            B b10 = nVarInvoke.f21470b;
            if (!kotlin.jvm.internal.r.a(a0Var.e(), c0Var)) {
                a0Var.f28953m.setValue(c0Var);
                i0 i0Var = a0Var.f28945e;
                z zVar = new z(a0Var, b10);
                yh.c cVar = i0Var.f29026b;
                boolean zE = cVar.e();
                if (zE) {
                    try {
                        zVar.invoke();
                    } finally {
                        cVar.l(null);
                    }
                }
                if (!zE) {
                    a0Var.i(b10);
                }
            }
        }
        this.f28980t = o0Var.I0() || this.f28980t;
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(o0Var, this, g1VarP));
    }
}
