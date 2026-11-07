package d0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import d0.k;
import g2.g;
import g2.g1;

/* loaded from: classes.dex */
public final class l extends d.c implements h2.f, g2.g, i2.b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final a f7178t = new a();

    /* renamed from: q, reason: collision with root package name */
    public m f7179q;

    /* renamed from: r, reason: collision with root package name */
    public k f7180r;

    /* renamed from: s, reason: collision with root package name */
    public v.t0 f7181s;

    public static final class a implements g.a {
        @Override // g2.g.a
        public final boolean a() {
            return false;
        }
    }

    public static final class b implements g.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<k.a> f7183b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7184c;

        public b(kotlin.jvm.internal.g0<k.a> g0Var, int i10) {
            this.f7183b = g0Var;
            this.f7184c = i10;
        }

        @Override // g2.g.a
        public final boolean a() {
            return l.this.T1(this.f7183b.f16327a, this.f7184c);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f7185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g2.g1 g1Var) {
            super(1);
            this.f7185a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f7185a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    @Override // h2.f
    public final c5.p E0() {
        h2.i<g2.g> iVar = g2.h.f11388a;
        h2.j jVar = new h2.j(iVar);
        if (iVar != jVar.f12229a) {
            f2.a.b("Check failed.");
        }
        jVar.f12230b.setValue(this);
        return jVar;
    }

    public final boolean T1(k.a aVar, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.f7181s == v.t0.f30084b) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.f7181s == v.t0.f30083a) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (U1(i10)) {
            if (aVar.f7171b >= this.f7179q.getItemCount() - 1) {
                return false;
            }
        } else if (aVar.f7170a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean U1(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int iOrdinal = i2.k.f(this).C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new pg.l();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = i2.k.f(this).C.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new pg.l();
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new c(g1VarP));
    }

    @Override // g2.g
    public final <T> T m1(int i10, eh.l<? super g.a, ? extends T> lVar) {
        if (this.f7179q.getItemCount() <= 0 || !this.f7179q.c() || !this.f1157p) {
            return lVar.invoke(f7178t);
        }
        int iA = U1(i10) ? this.f7179q.a() : this.f7179q.d();
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        k kVar = this.f7180r;
        kVar.getClass();
        T t3 = (T) new k.a(iA, iA);
        kVar.f7169a.b(t3);
        g0Var.f16327a = t3;
        int iB = this.f7179q.b() * 2;
        int itemCount = this.f7179q.getItemCount();
        if (iB > itemCount) {
            iB = itemCount;
        }
        T tInvoke = null;
        int i11 = 0;
        while (tInvoke == null && T1((k.a) g0Var.f16327a, i10) && i11 < iB) {
            k.a aVar = (k.a) g0Var.f16327a;
            int i12 = aVar.f7170a;
            int i13 = aVar.f7171b;
            if (U1(i10)) {
                i13++;
            } else {
                i12--;
            }
            k kVar2 = this.f7180r;
            kVar2.getClass();
            T t10 = (T) new k.a(i12, i13);
            kVar2.f7169a.b(t10);
            this.f7180r.f7169a.j((k.a) g0Var.f16327a);
            g0Var.f16327a = t10;
            i11++;
            i2.k.f(this).h();
            tInvoke = lVar.invoke(new b(g0Var, i10));
        }
        this.f7180r.f7169a.j((k.a) g0Var.f16327a);
        i2.k.f(this).h();
        return tInvoke;
    }
}
