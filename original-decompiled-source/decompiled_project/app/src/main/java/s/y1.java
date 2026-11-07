package s;

import com.yalantis.ucrop.view.CropImageView;
import s.z0;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class y1<S> {

    /* renamed from: a, reason: collision with root package name */
    public final c2.g0 f24001a;

    /* renamed from: b, reason: collision with root package name */
    public final y1<?> f24002b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24003c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f24004d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f24005e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.w1 f24006f;

    /* renamed from: g, reason: collision with root package name */
    public final x0.w1 f24007g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.x1 f24008h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.u<y1<S>.d<?, ?>> f24009i;

    /* renamed from: j, reason: collision with root package name */
    public final h1.u<y1<?>> f24010j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f24011k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.g0 f24012l;

    public final class a<T, V extends s> {

        /* renamed from: a, reason: collision with root package name */
        public final n2<T, V> f24013a;

        /* renamed from: b, reason: collision with root package name */
        public final x0.x1 f24014b = bg.b.h(null);

        /* renamed from: s.y1$a$a, reason: collision with other inner class name */
        public final class C0268a<T, V extends s> implements r3<T> {

            /* renamed from: a, reason: collision with root package name */
            public final y1<S>.d<T, V> f24016a;

            /* renamed from: b, reason: collision with root package name */
            public eh.l<? super b<S>, ? extends e0<T>> f24017b;

            /* renamed from: c, reason: collision with root package name */
            public kotlin.jvm.internal.s f24018c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0268a(y1<S>.d<T, V> dVar, eh.l<? super b<S>, ? extends e0<T>> lVar, eh.l<? super S, ? extends T> lVar2) {
                this.f24016a = dVar;
                this.f24017b = lVar;
                this.f24018c = (kotlin.jvm.internal.s) lVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [eh.l, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r1v5, types: [eh.l, kotlin.jvm.internal.s] */
            public final void c(b<S> bVar) {
                Object objInvoke = this.f24018c.invoke(bVar.e());
                boolean zG = y1.this.g();
                y1<S>.d<T, V> dVar = this.f24016a;
                if (zG) {
                    dVar.o(this.f24018c.invoke(bVar.c()), objInvoke, this.f24017b.invoke(bVar));
                } else {
                    dVar.p(objInvoke, this.f24017b.invoke(bVar));
                }
            }

            @Override // x0.r3
            public final T getValue() {
                c(y1.this.f());
                return this.f24016a.f24031k.getValue();
            }
        }

        public a(n2<T, V> n2Var, String str) {
            this.f24013a = n2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C0268a a(eh.l lVar, eh.l lVar2) {
            x0.x1 x1Var = this.f24014b;
            C0268a c0268a = (C0268a) x1Var.getValue();
            y1<S> y1Var = y1.this;
            if (c0268a == null) {
                Object objInvoke = lVar2.invoke(y1Var.f24001a.V());
                Object objInvoke2 = lVar2.invoke(y1Var.f24001a.V());
                n2<T, V> n2Var = this.f24013a;
                s sVar = (s) n2Var.a().invoke(objInvoke2);
                sVar.d();
                y1<S>.d<?, ?> dVar = y1Var.new d<>(objInvoke, sVar, n2Var);
                c0268a = new C0268a(dVar, lVar, lVar2);
                x1Var.setValue(c0268a);
                y1Var.f24009i.add(dVar);
            }
            c0268a.f24018c = (kotlin.jvm.internal.s) lVar2;
            c0268a.f24017b = lVar;
            c0268a.c(y1Var.f());
            return c0268a;
        }
    }

    public interface b<S> {
        S c();

        default boolean d(S s10, S s11) {
            return s10.equals(c()) && s11.equals(e());
        }

        S e();
    }

    public static final class c<S> implements b<S> {

        /* renamed from: a, reason: collision with root package name */
        public final S f24020a;

        /* renamed from: b, reason: collision with root package name */
        public final S f24021b;

        public c(S s10, S s11) {
            this.f24020a = s10;
            this.f24021b = s11;
        }

        @Override // s.y1.b
        public final S c() {
            return this.f24020a;
        }

        @Override // s.y1.b
        public final S e() {
            return this.f24021b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f24020a, bVar.c()) && kotlin.jvm.internal.r.a(this.f24021b, bVar.e());
        }

        public final int hashCode() {
            S s10 = this.f24020a;
            int iHashCode = (s10 != null ? s10.hashCode() : 0) * 31;
            S s11 = this.f24021b;
            return iHashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    public final class d<T, V extends s> implements r3<T> {

        /* renamed from: a, reason: collision with root package name */
        public final n2<T, V> f24022a;

        /* renamed from: b, reason: collision with root package name */
        public final x0.x1 f24023b;

        /* renamed from: c, reason: collision with root package name */
        public final x0.x1 f24024c;

        /* renamed from: d, reason: collision with root package name */
        public final x0.x1 f24025d;

        /* renamed from: e, reason: collision with root package name */
        public z0.a f24026e;

        /* renamed from: f, reason: collision with root package name */
        public x1<T, V> f24027f;

        /* renamed from: g, reason: collision with root package name */
        public final x0.x1 f24028g;

        /* renamed from: h, reason: collision with root package name */
        public final x0.u1 f24029h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f24030j;

        /* renamed from: k, reason: collision with root package name */
        public final x0.x1 f24031k;

        /* renamed from: l, reason: collision with root package name */
        public V f24032l;

        /* renamed from: m, reason: collision with root package name */
        public final x0.w1 f24033m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f24034n;

        /* renamed from: p, reason: collision with root package name */
        public final l1 f24035p;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
        public d(Object obj, s sVar, n2 n2Var) {
            this.f24022a = n2Var;
            x0.x1 x1VarH = bg.b.h(obj);
            this.f24023b = x1VarH;
            T tInvoke = null;
            x0.x1 x1VarH2 = bg.b.h(m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7));
            this.f24024c = x1VarH2;
            this.f24025d = bg.b.h(new x1((e0) x1VarH2.getValue(), n2Var, obj, x1VarH.getValue(), sVar));
            this.f24028g = bg.b.h(Boolean.TRUE);
            this.f24029h = new x0.u1(-1.0f);
            this.f24031k = bg.b.h(obj);
            this.f24032l = sVar;
            this.f24033m = new x0.w1(c().b());
            Float f10 = (Float) d3.f23710a.get(n2Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = n2Var.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    vInvoke.e(fFloatValue, i10);
                }
                tInvoke = this.f24022a.b().invoke(vInvoke);
            }
            this.f24035p = m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, tInvoke, 3);
        }

        public final x1<T, V> c() {
            return (x1) this.f24025d.getValue();
        }

        @Override // x0.r3
        public final T getValue() {
            return this.f24031k.getValue();
        }

        public final void k(long j10) {
            if (this.f24029h.getFloatValue() == -1.0f) {
                this.f24034n = true;
                if (kotlin.jvm.internal.r.a(c().f23987c, c().f23988d)) {
                    m(c().f23987c);
                } else {
                    m(c().f(j10));
                    this.f24032l = (V) c().d(j10);
                }
            }
        }

        public final void m(T t3) {
            this.f24031k.setValue(t3);
        }

        public final void n(T t3, boolean z10) {
            x1<T, V> x1Var = this.f24027f;
            T t10 = x1Var != null ? x1Var.f23987c : null;
            x0.x1 x1Var2 = this.f24023b;
            boolean zA = kotlin.jvm.internal.r.a(t10, x1Var2.getValue());
            x0.w1 w1Var = this.f24033m;
            x0.x1 x1Var3 = this.f24025d;
            if (zA) {
                x1Var3.setValue(new x1(this.f24035p, this.f24022a, t3, t3, this.f24032l.c()));
                this.f24030j = true;
                w1Var.h(c().b());
                return;
            }
            x0.x1 x1Var4 = this.f24024c;
            e0 e0Var = (!z10 || this.f24034n || (((e0) x1Var4.getValue()) instanceof l1)) ? (e0) x1Var4.getValue() : this.f24035p;
            y1<S> y1Var = y1.this;
            long jE = y1Var.e();
            x0.x1 x1Var5 = y1Var.f24008h;
            x1Var3.setValue(new x1(jE <= 0 ? e0Var : new m1(e0Var, y1Var.e()), this.f24022a, t3, x1Var2.getValue(), this.f24032l));
            w1Var.h(c().b());
            this.f24030j = false;
            x1Var5.setValue(Boolean.TRUE);
            if (y1Var.g()) {
                h1.u<y1<S>.d<?, ?>> uVar = y1Var.f24009i;
                int size = uVar.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    y1<S>.d<?, ?> dVar = uVar.get(i10);
                    jMax = Math.max(jMax, dVar.f24033m.b());
                    dVar.k(0L);
                }
                x1Var5.setValue(Boolean.FALSE);
            }
        }

        public final void o(T t3, T t10, e0<T> e0Var) {
            this.f24023b.setValue(t10);
            this.f24024c.setValue(e0Var);
            if (kotlin.jvm.internal.r.a(c().f23988d, t3) && kotlin.jvm.internal.r.a(c().f23987c, t10)) {
                return;
            }
            n(t3, false);
        }

        public final void p(T t3, e0<T> e0Var) {
            if (this.f24030j) {
                x1<T, V> x1Var = this.f24027f;
                if (kotlin.jvm.internal.r.a(t3, x1Var != null ? x1Var.f23987c : null)) {
                    return;
                }
            }
            x0.x1 x1Var2 = this.f24023b;
            boolean zA = kotlin.jvm.internal.r.a(x1Var2.getValue(), t3);
            x0.u1 u1Var = this.f24029h;
            if (zA && u1Var.getFloatValue() == -1.0f) {
                return;
            }
            x1Var2.setValue(t3);
            this.f24024c.setValue(e0Var);
            T value = u1Var.getFloatValue() == -3.0f ? t3 : this.f24031k.getValue();
            x0.x1 x1Var3 = this.f24028g;
            n(value, !((Boolean) x1Var3.getValue()).booleanValue());
            x1Var3.setValue(Boolean.valueOf(u1Var.getFloatValue() == -3.0f));
            if (u1Var.getFloatValue() >= CropImageView.DEFAULT_ASPECT_RATIO) {
                m(c().f((long) (u1Var.getFloatValue() * c().b())));
            } else if (u1Var.getFloatValue() == -3.0f) {
                m(t3);
            }
            this.f24030j = false;
            u1Var.e(-1.0f);
        }

        public final String toString() {
            return "current value: " + this.f24031k.getValue() + ", target: " + this.f24023b.getValue() + ", spec: " + ((e0) this.f24024c.getValue());
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f24037a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f24038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ph.i0 i0Var, y1<Object> y1Var) {
            super(1);
            this.f24037a = i0Var;
            this.f24038b = y1Var;
        }

        @Override // eh.l
        public final x0.k0 invoke(x0.l0 l0Var) {
            ph.h.c(this.f24037a, null, ph.k0.f21556d, new z1(this.f24038b, null), 1);
            return new a2();
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f24039a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f24040b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y1<Object> y1Var, Object obj, int i10) {
            super(2);
            this.f24039a = y1Var;
            this.f24040b = obj;
            this.f24041c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f24041c | 1);
            this.f24039a.a(iN, this.f24040b, jVar);
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<Object> f24042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y1<Object> y1Var) {
            super(0);
            this.f24042a = y1Var;
        }

        @Override // eh.a
        public final Long invoke() {
            return Long.valueOf(this.f24042a.b());
        }
    }

    public y1() {
        throw null;
    }

    public y1(c2.g0 g0Var, y1<?> y1Var, String str) {
        this.f24001a = g0Var;
        this.f24002b = y1Var;
        this.f24003c = str;
        this.f24004d = bg.b.h(g0Var.V());
        this.f24005e = bg.b.h(new c(g0Var.V(), g0Var.V()));
        this.f24006f = new x0.w1(0L);
        this.f24007g = new x0.w1(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f24008h = bg.b.h(bool);
        this.f24009i = new h1.u<>();
        this.f24010j = new h1.u<>();
        this.f24011k = bg.b.h(bool);
        this.f24012l = bg.b.d(new g(this));
        g0Var.a0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, Object obj, x0.j jVar) {
        int i11;
        x0.k kVarP = jVar.p(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(obj) : kVarP.l(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(this) ? 32 : 16;
        }
        if (!kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            kVarP.v();
        } else if (g()) {
            kVarP.L(1824284987);
            kVarP.T(false);
        } else {
            kVarP.L(1822801203);
            p(obj);
            if (kotlin.jvm.internal.r.a(obj, this.f24001a.V())) {
                if (!(this.f24007g.b() != Long.MIN_VALUE) && !((Boolean) this.f24008h.getValue()).booleanValue()) {
                    kVarP.L(1824275067);
                    kVarP.T(false);
                }
                kVarP.T(false);
            } else {
                kVarP.L(1823032494);
                Object objG = kVarP.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    x0.l0 l0Var = x0.o0.f31834a;
                    x0.w2 w2Var = new x0.w2(kVarP.x());
                    kVarP.C(w2Var);
                    objG = w2Var;
                }
                ph.i0 i0Var = (ph.i0) objG;
                boolean zL = kVarP.l(i0Var) | ((i11 & 112) == 32);
                Object objG2 = kVarP.g();
                if (zL || objG2 == c0321a) {
                    objG2 = new e(i0Var, this);
                    kVarP.C(objG2);
                }
                x0.o0.b(i0Var, this, (eh.l) objG2, kVarP);
                kVarP.T(false);
                kVarP.T(false);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f(this, obj, i10);
        }
    }

    public final long b() {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, uVar.get(i10).f24033m.b());
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, uVar2.get(i11).b());
        }
        return jMax;
    }

    public final void c() {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1<S>.d<?, ?> dVar = uVar.get(i10);
            dVar.f24027f = null;
            dVar.f24026e = null;
            dVar.f24030j = false;
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            uVar2.get(i11).c();
        }
    }

    public final boolean d() {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (uVar.get(i10).f24026e != null) {
                return true;
            }
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (uVar2.get(i11).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        y1<?> y1Var = this.f24002b;
        return y1Var != null ? y1Var.e() : this.f24006f.b();
    }

    public final b<S> f() {
        return (b) this.f24005e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f24011k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [V extends s.s, s.s] */
    public final void h(long j10, boolean z10) {
        x0.w1 w1Var = this.f24007g;
        long jB = w1Var.b();
        c2.g0 g0Var = this.f24001a;
        if (jB == Long.MIN_VALUE) {
            w1Var.h(j10);
            ((x0.x1) g0Var.f4646a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((x0.x1) g0Var.f4646a).getValue()).booleanValue()) {
            ((x0.x1) g0Var.f4646a).setValue(Boolean.TRUE);
        }
        this.f24008h.setValue(Boolean.FALSE);
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            y1<S>.d<?, ?> dVar = uVar.get(i10);
            x0.x1 x1Var = dVar.f24028g;
            x0.x1 x1Var2 = dVar.f24028g;
            if (!((Boolean) x1Var.getValue()).booleanValue()) {
                long jB2 = z10 ? dVar.c().b() : j10;
                dVar.m(dVar.c().f(jB2));
                dVar.f24032l = dVar.c().d(jB2);
                if (dVar.c().e(jB2)) {
                    x1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) x1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y1<?> y1Var = uVar2.get(i11);
            x0.x1 x1Var3 = y1Var.f24004d;
            c2.g0 g0Var2 = y1Var.f24001a;
            if (!kotlin.jvm.internal.r.a(x1Var3.getValue(), g0Var2.V())) {
                y1Var.h(j10, z10);
            }
            if (!kotlin.jvm.internal.r.a(y1Var.f24004d.getValue(), g0Var2.V())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.f24007g.h(Long.MIN_VALUE);
        c2.g0 g0Var = this.f24001a;
        if (g0Var instanceof s0) {
            g0Var.Z(this.f24004d.getValue());
        }
        n(0L);
        ((x0.x1) g0Var.f4646a).setValue(Boolean.FALSE);
        h1.u<y1<?>> uVar = this.f24010j;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            uVar.get(i10).i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f10) {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1<S>.d<?, ?> dVar = uVar.get(i10);
            dVar.getClass();
            if (f10 == -4.0f || f10 == -5.0f) {
                x1<?, V> x1Var = dVar.f24027f;
                if (x1Var != 0) {
                    dVar.c().h(x1Var.f23987c);
                    dVar.f24026e = null;
                    dVar.f24027f = null;
                }
                Object obj = f10 == -4.0f ? dVar.c().f23988d : dVar.c().f23987c;
                dVar.c().h(obj);
                dVar.c().i(obj);
                dVar.m(obj);
                dVar.f24033m.h(dVar.c().b());
            } else {
                dVar.f24029h.e(f10);
            }
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            uVar2.get(i11).j(f10);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f24007g.h(Long.MIN_VALUE);
        c2.g0 g0Var = this.f24001a;
        ((x0.x1) g0Var.f4646a).setValue(Boolean.FALSE);
        boolean zG = g();
        x0.x1 x1Var = this.f24004d;
        if (!zG || !kotlin.jvm.internal.r.a(g0Var.V(), obj) || !kotlin.jvm.internal.r.a(x1Var.getValue(), obj2)) {
            if (!kotlin.jvm.internal.r.a(g0Var.V(), obj) && (g0Var instanceof s0)) {
                g0Var.Z(obj);
            }
            x1Var.setValue(obj2);
            this.f24011k.setValue(Boolean.TRUE);
            this.f24005e.setValue(new c(obj, obj2));
        }
        h1.u<y1<?>> uVar = this.f24010j;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1<?> y1Var = uVar.get(i10);
            kotlin.jvm.internal.r.c(y1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (y1Var.g()) {
                y1Var.k(y1Var.f24001a.V(), y1Var.f24004d.getValue());
            }
        }
        h1.u<y1<S>.d<?, ?>> uVar2 = this.f24009i;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            uVar2.get(i11).k(0L);
        }
    }

    public final void l(long j10) {
        x0.w1 w1Var = this.f24007g;
        if (w1Var.b() == Long.MIN_VALUE) {
            w1Var.h(j10);
        }
        n(j10);
        this.f24008h.setValue(Boolean.FALSE);
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            uVar.get(i10).k(j10);
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y1<?> y1Var = uVar2.get(i11);
            if (!kotlin.jvm.internal.r.a(y1Var.f24004d.getValue(), y1Var.f24001a.V())) {
                y1Var.l(j10);
            }
        }
    }

    public final void m(z0.a aVar) {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1<S>.d<?, ?> dVar = uVar.get(i10);
            x0.x1 x1Var = dVar.f24031k;
            if (!kotlin.jvm.internal.r.a(dVar.c().f23987c, dVar.c().f23988d)) {
                dVar.f24027f = dVar.c();
                dVar.f24026e = aVar;
            }
            dVar.f24025d.setValue(new x1(dVar.f24035p, dVar.f24022a, x1Var.getValue(), x1Var.getValue(), dVar.f24032l.c()));
            dVar.f24033m.h(dVar.c().b());
            dVar.f24030j = true;
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            uVar2.get(i11).m(aVar);
        }
    }

    public final void n(long j10) {
        if (this.f24002b == null) {
            this.f24006f.h(j10);
        }
    }

    public final void o() {
        h hVar;
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1<S>.d<?, ?> dVar = uVar.get(i10);
            z0.a aVar = dVar.f24026e;
            if (aVar != null && (hVar = dVar.f24027f) != null) {
                long jC = gh.a.c(aVar.f24070g * aVar.f24067d);
                Object objF = hVar.f(jC);
                if (dVar.f24030j) {
                    dVar.c().i(objF);
                }
                dVar.c().h(objF);
                dVar.f24033m.h(dVar.c().b());
                if (dVar.f24029h.getFloatValue() == -2.0f || dVar.f24030j) {
                    dVar.m(objF);
                } else {
                    dVar.k(y1.this.e());
                }
                if (jC >= aVar.f24070g) {
                    dVar.f24026e = null;
                    dVar.f24027f = null;
                } else {
                    aVar.f24066c = false;
                }
            }
        }
        h1.u<y1<?>> uVar2 = this.f24010j;
        int size2 = uVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            uVar2.get(i11).o();
        }
    }

    public final void p(S s10) {
        x0.x1 x1Var = this.f24004d;
        if (kotlin.jvm.internal.r.a(x1Var.getValue(), s10)) {
            return;
        }
        this.f24005e.setValue(new c(x1Var.getValue(), s10));
        c2.g0 g0Var = this.f24001a;
        if (!kotlin.jvm.internal.r.a(g0Var.V(), x1Var.getValue())) {
            g0Var.Z(x1Var.getValue());
        }
        x1Var.setValue(s10);
        if (this.f24007g.b() == Long.MIN_VALUE) {
            this.f24008h.setValue(Boolean.TRUE);
        }
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            uVar.get(i10).f24029h.e(-2.0f);
        }
    }

    public final String toString() {
        h1.u<y1<S>.d<?, ?>> uVar = this.f24009i;
        int size = uVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + uVar.get(i10) + ", ";
        }
        return str;
    }
}
