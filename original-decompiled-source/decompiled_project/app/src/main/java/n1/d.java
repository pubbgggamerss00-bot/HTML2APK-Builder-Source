package n1;

import androidx.compose.ui.d;
import f3.r;
import i2.h0;
import i2.o1;
import i2.p1;
import kotlin.jvm.internal.s;
import q1.k1;

/* loaded from: classes.dex */
public final class d extends d.c implements c, o1, b {

    /* renamed from: q, reason: collision with root package name */
    public final g f18302q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18303r;

    /* renamed from: s, reason: collision with root package name */
    public o f18304s;

    /* renamed from: t, reason: collision with root package name */
    public eh.l<? super g, k> f18305t;

    public static final class a extends s implements eh.a<k1> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final k1 invoke() {
            d dVar = d.this;
            o oVar = dVar.f18304s;
            if (oVar == null) {
                oVar = new o();
                dVar.f18304s = oVar;
            }
            if (oVar.f18326b == null) {
                k1 graphicsContext = i2.k.g(dVar).getGraphicsContext();
                oVar.c();
                oVar.f18326b = graphicsContext;
            }
            return oVar;
        }
    }

    public d(g gVar, eh.l<? super g, k> lVar) {
        this.f18302q = gVar;
        this.f18305t = lVar;
        gVar.f18310a = this;
        new a();
    }

    @Override // i2.j
    public final void B0() {
        P();
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        o oVar = this.f18304s;
        if (oVar != null) {
            oVar.c();
        }
    }

    @Override // n1.c
    public final void P() {
        o oVar = this.f18304s;
        if (oVar != null) {
            oVar.c();
        }
        this.f18303r = false;
        this.f18302q.f18311b = null;
        i2.s.a(this);
    }

    @Override // i2.o1
    public final void V0() {
        P();
    }

    @Override // n1.b
    public final f3.d getDensity() {
        return i2.k.f(this).B;
    }

    @Override // n1.b
    public final r getLayoutDirection() {
        return i2.k.f(this).C;
    }

    @Override // n1.b
    public final long i() {
        return f3.q.e(i2.k.d(this, 128).f11384c);
    }

    @Override // i2.r
    public final void w0() {
        P();
    }

    @Override // i2.j, i2.i2
    public final void x() {
        P();
    }

    @Override // i2.r
    public final void z(h0 h0Var) {
        boolean z10 = this.f18303r;
        g gVar = this.f18302q;
        if (!z10) {
            gVar.f18311b = null;
            p1.a(this, new e(this, gVar));
            if (gVar.f18311b == null) {
                throw k1.a.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f18303r = true;
        }
        k kVar = gVar.f18311b;
        kotlin.jvm.internal.r.b(kVar);
        kVar.f18313a.invoke(h0Var);
    }
}
