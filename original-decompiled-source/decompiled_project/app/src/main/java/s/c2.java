package s;

import s.y1;
import s.y1.a;
import s.z0;
import x0.j;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23679a = b.f23682a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23680b = e9.w0.a(pg.k.f21467b, a.f23681a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<h1.z> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23681a = new a(0);

        @Override // eh.a
        public final h1.z invoke() {
            h1.z zVar = new h1.z(b2.f23675a);
            zVar.e();
            return zVar;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<z0<?>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23682a = new b(1);

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pg.j] */
        @Override // eh.l
        public final pg.f0 invoke(z0<?> z0Var) {
            z0<?> z0Var2 = z0Var;
            long j10 = z0Var2.f24052f;
            ((h1.z) c2.f23680b.getValue()).d(z0Var2, c2.f23679a, z0Var2.f24053g);
            long j11 = z0Var2.f24052f;
            if (j10 != j11) {
                z0.a aVar = z0Var2.f24060p;
                if (aVar != null) {
                    if (aVar.f24064a > j11) {
                        z0Var2.i0();
                    } else {
                        aVar.f24070g = j11;
                        if (aVar.f24065b == null) {
                            aVar.f24071h = gh.a.c((1.0d - aVar.f24068e.a(0)) * z0Var2.f24052f);
                        }
                    }
                } else if (j11 != 0) {
                    z0Var2.k0();
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<S> f23683a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1<S>.d<T, V> f23684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f23685c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T f23686d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e0<T> f23687e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f23688f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y1<S> y1Var, y1<S>.d<T, V> dVar, T t3, T t10, e0<T> e0Var, int i10) {
            super(2);
            this.f23683a = y1Var;
            this.f23684b = dVar;
            this.f23685c = t3;
            this.f23686d = t10;
            this.f23687e = e0Var;
            this.f23688f = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            c2.a(this.f23683a, this.f23684b, this.f23685c, this.f23686d, this.f23687e, jVar, f3.i.n(this.f23688f | 1));
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<S> f23689a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1<S>.a<T, V> f23690b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y1<S> y1Var, y1<S>.a<T, V> aVar) {
            super(1);
            this.f23689a = y1Var;
            this.f23690b = aVar;
        }

        @Override // eh.l
        public final x0.k0 invoke(x0.l0 l0Var) {
            return new f2(this.f23689a, this.f23690b);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1<T> f23691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y1<T> y1Var) {
            super(1);
            this.f23691a = y1Var;
        }

        @Override // eh.l
        public final x0.k0 invoke(x0.l0 l0Var) {
            return new l2(this.f23691a);
        }
    }

    public static final <S, T, V extends s> void a(y1<S> y1Var, y1<S>.d<T, V> dVar, T t3, T t10, e0<T> e0Var, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(867041821);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(y1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? kVarP.K(t3) : kVarP.l(t3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? kVarP.K(t10) : kVarP.l(t10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? kVarP.K(e0Var) : kVarP.l(e0Var) ? 16384 : 8192;
        }
        if (!kVarP.A(i11 & 1, (i11 & 9363) != 9362)) {
            kVarP.v();
        } else if (y1Var.g()) {
            dVar.o(t3, t10, e0Var);
        } else {
            dVar.p(t10, e0Var);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(y1Var, dVar, t3, t10, e0Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [eh.l, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eh.l, kotlin.jvm.internal.s] */
    public static final <S, T, V extends s> y1<S>.a<T, V> b(y1<S> y1Var, n2<T, V> n2Var, String str, x0.j jVar, int i10, int i11) {
        y1.a.C0268a c0268a;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zK = jVar.K(y1Var);
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (zK || objG == obj) {
            objG = y1Var.new a(n2Var, str);
            jVar.C(objG);
        }
        y1<S>.a<T, V> aVar = (y1.a) objG;
        boolean zK2 = jVar.K(y1Var) | jVar.l(aVar);
        Object objG2 = jVar.g();
        if (zK2 || objG2 == obj) {
            objG2 = new d(y1Var, aVar);
            jVar.C(objG2);
        }
        x0.o0.a(aVar, (eh.l) objG2, jVar);
        if (y1Var.g() && (c0268a = (y1.a.C0268a) aVar.f24014b.getValue()) != null) {
            y1<S> y1Var2 = y1.this;
            c0268a.f24016a.o(c0268a.f24018c.invoke(y1Var2.f().c()), c0268a.f24018c.invoke(y1Var2.f().e()), c0268a.f24017b.invoke(y1Var2.f()));
        }
        return aVar;
    }

    public static final y1.d c(y1 y1Var, Object obj, Object obj2, e0 e0Var, n2 n2Var, x0.j jVar, int i10) {
        boolean zK = jVar.K(y1Var);
        Object objG = jVar.g();
        Object obj3 = j.a.f31715a;
        if (zK || objG == obj3) {
            s sVar = (s) n2Var.a().invoke(obj2);
            sVar.d();
            objG = new y1.d(obj, sVar, n2Var);
            jVar.C(objG);
        }
        y1.d dVar = (y1.d) objG;
        a(y1Var, dVar, obj, obj2, e0Var, jVar, 0);
        boolean zK2 = jVar.K(y1Var) | jVar.K(dVar);
        Object objG2 = jVar.g();
        if (zK2 || objG2 == obj3) {
            objG2 = new h2(y1Var, dVar);
            jVar.C(objG2);
        }
        x0.o0.a(dVar, (eh.l) objG2, jVar);
        return dVar;
    }

    public static final y1 d(c2.g0 g0Var, String str, x0.j jVar, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && jVar.K(g0Var)) || (i10 & 6) == 4;
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (z11 || objG == obj) {
            objG = new y1(g0Var, null, str);
            jVar.C(objG);
        }
        y1 y1Var = (y1) objG;
        if (g0Var instanceof z0) {
            jVar.L(1030829284);
            z0 z0Var = (z0) g0Var;
            T value = z0Var.f24049c.getValue();
            T value2 = z0Var.f24048b.getValue();
            if ((i11 <= 4 || !jVar.K(g0Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objG2 = jVar.g();
            if (z10 || objG2 == obj) {
                objG2 = new i2(g0Var, null);
                jVar.C(objG2);
            }
            x0.o0.e(value, value2, (eh.p) objG2, jVar);
            jVar.B();
        } else {
            jVar.L(1031290843);
            y1Var.a(0, g0Var.X(), jVar);
            jVar.B();
        }
        boolean zK = jVar.K(y1Var);
        Object objG3 = jVar.g();
        if (zK || objG3 == obj) {
            objG3 = new k2(y1Var);
            jVar.C(objG3);
        }
        x0.o0.a(y1Var, (eh.l) objG3, jVar);
        return y1Var;
    }

    public static final <T> y1<T> e(T t3, String str, x0.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new y1(new s0(t3), null, str);
            jVar.C(objG);
        }
        y1<T> y1Var = (y1) objG;
        y1Var.a((i10 & 8) | 48 | (i10 & 14), t3, jVar);
        Object objG2 = jVar.g();
        if (objG2 == c0321a) {
            objG2 = new e(y1Var);
            jVar.C(objG2);
        }
        x0.o0.a(y1Var, (eh.l) objG2, jVar);
        return y1Var;
    }
}
