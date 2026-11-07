package x0;

import h1.h;

/* loaded from: classes.dex */
public final class g0<T> extends h1.j0 implements h0<T> {

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<T> f31684b;

    /* renamed from: c, reason: collision with root package name */
    public final i3<T> f31685c;

    /* renamed from: d, reason: collision with root package name */
    public a<T> f31686d = new a<>(h1.n.k().g());

    public static final class a<T> extends h1.k0 {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f31687h = new Object();

        /* renamed from: c, reason: collision with root package name */
        public long f31688c;

        /* renamed from: d, reason: collision with root package name */
        public int f31689d;

        /* renamed from: e, reason: collision with root package name */
        public p.f0 f31690e;

        /* renamed from: f, reason: collision with root package name */
        public Object f31691f;

        /* renamed from: g, reason: collision with root package name */
        public int f31692g;

        public a(long j10) {
            super(j10);
            p.f0<Object> f0Var = p.p0.f20701a;
            kotlin.jvm.internal.r.c(f0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f31690e = f0Var;
            this.f31691f = f31687h;
        }

        @Override // h1.k0
        public final void a(h1.k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) k0Var;
            this.f31690e = aVar.f31690e;
            this.f31691f = aVar.f31691f;
            this.f31692g = aVar.f31692g;
        }

        @Override // h1.k0
        public final h1.k0 b() {
            return new a(h1.n.k().g());
        }

        @Override // h1.k0
        public final h1.k0 c(long j10) {
            return new a(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean d(g0 g0Var, h1.h hVar) {
            boolean z10;
            boolean z11;
            Object obj = h1.n.f12160c;
            synchronized (obj) {
                z10 = true;
                if (this.f31688c == hVar.g()) {
                    z11 = this.f31689d != hVar.h();
                }
            }
            if (this.f31691f == f31687h || (z11 && this.f31692g != e(g0Var, hVar))) {
                z10 = false;
            }
            if (!z10 || !z11) {
                return z10;
            }
            synchronized (obj) {
                this.f31688c = hVar.g();
                this.f31689d = hVar.h();
                pg.f0 f0Var = pg.f0.f21461a;
            }
            return z10;
        }

        public final int e(g0 g0Var, h1.h hVar) throws Throwable {
            p.f0 f0Var;
            int iIdentityHashCode;
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            int i12;
            h1.k0 k0VarP;
            synchronized (h1.n.f12160c) {
                f0Var = this.f31690e;
            }
            int i13 = 7;
            if (f0Var.f20619e == 0) {
                return 7;
            }
            z0.b bVarC = bg.b.c();
            T[] tArr = bVarC.f34700a;
            int i14 = bVarC.f34702c;
            for (int i15 = 0; i15 < i14; i15++) {
                ((i0) tArr[i15]).start();
            }
            try {
                Object[] objArr = f0Var.f20616b;
                int[] iArr = f0Var.f20617c;
                long[] jArr3 = f0Var.f20615a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i16 = 0;
                    while (true) {
                        long j10 = jArr3[i16];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j10 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    Object obj = objArr[i20];
                                    i11 = i13;
                                    int i21 = iArr[i20];
                                    i12 = i17;
                                    h1.i0 i0Var = (h1.i0) obj;
                                    if (i21 != 1) {
                                        jArr2 = jArr3;
                                    } else {
                                        if (i0Var instanceof g0) {
                                            try {
                                                g0 g0Var2 = (g0) i0Var;
                                                k0VarP = g0Var2.p((a) h1.n.j(g0Var2.f31686d, hVar), hVar, false, g0Var2.f31684b);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                T[] tArr2 = bVarC.f34700a;
                                                int i22 = bVarC.f34702c;
                                                for (int i23 = 0; i23 < i22; i23++) {
                                                    ((i0) tArr2[i23]).done();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            k0VarP = h1.n.j(i0Var.c(), hVar);
                                        }
                                        jArr2 = jArr3;
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(k0VarP)) * 31) + Long.hashCode(k0VarP.f12133a);
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i11 = i13;
                                    i12 = i17;
                                }
                                j10 >>= i12;
                                i19++;
                                i13 = i11;
                                jArr3 = jArr2;
                                i17 = i12;
                            }
                            jArr = jArr3;
                            i10 = i13;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i10 = i13;
                        }
                        if (i16 == length) {
                            i13 = iIdentityHashCode;
                            break;
                        }
                        i16++;
                        i13 = i10;
                        jArr3 = jArr;
                    }
                }
                iIdentityHashCode = i13;
                pg.f0 f0Var2 = pg.f0.f21461a;
                T[] tArr3 = bVarC.f34700a;
                int i24 = bVarC.f34702c;
                for (int i25 = 0; i25 < i24; i25++) {
                    ((i0) tArr3[i25]).done();
                }
                return iIdentityHashCode;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0<T> f31693a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1.d f31694b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p.f0<h1.i0> f31695c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f31696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0<T> g0Var, f1.d dVar, p.f0<h1.i0> f0Var, int i10) {
            super(1);
            this.f31693a = g0Var;
            this.f31694b = dVar;
            this.f31695c = f0Var;
            this.f31696d = i10;
        }

        @Override // eh.l
        public final pg.f0 invoke(Object obj) {
            if (obj == this.f31693a) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof h1.i0) {
                int i10 = this.f31694b.f8789a - this.f31696d;
                p.f0<h1.i0> f0Var = this.f31695c;
                int iD = f0Var.d(obj);
                f0Var.h(Math.min(i10, iD >= 0 ? f0Var.f20617c[iD] : Integer.MAX_VALUE), obj);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(eh.a<? extends T> aVar, i3<T> i3Var) {
        this.f31684b = aVar;
        this.f31685c = i3Var;
    }

    @Override // x0.h0
    public final i3<T> a() {
        return this.f31685c;
    }

    @Override // h1.i0
    public final h1.k0 c() {
        return this.f31686d;
    }

    @Override // x0.r3
    public final T getValue() {
        eh.l<Object, pg.f0> lVarE = h1.n.k().e();
        if (lVarE != null) {
            lVarE.invoke(this);
        }
        h1.h hVarK = h1.n.k();
        return (T) p((a) h1.n.j(this.f31686d, hVarK), hVarK, true, this.f31684b).f31691f;
    }

    @Override // h1.i0
    public final void k(h1.k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f31686d = (a) k0Var;
    }

    @Override // x0.h0
    public final a l() {
        h1.h hVarK = h1.n.k();
        return p((a) h1.n.j(this.f31686d, hVarK), hVarK, false, this.f31684b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a<T> p(a<T> aVar, h1.h hVar, boolean z10, eh.a<? extends T> aVar2) {
        int i10;
        i3<T> i3Var;
        int i11;
        a<T> aVar3 = aVar;
        int i12 = 0;
        if (aVar3.d(this, hVar)) {
            if (z10) {
                z0.b bVarC = bg.b.c();
                T[] tArr = bVarC.f34700a;
                int i13 = bVarC.f34702c;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((i0) tArr[i14]).start();
                }
                try {
                    p.f0 f0Var = aVar3.f31690e;
                    f1.i<f1.d> iVar = j3.f31726a;
                    f1.d dVarA = iVar.a();
                    if (dVarA == null) {
                        dVarA = new f1.d(0);
                        iVar.b(dVarA);
                    }
                    int i15 = dVarA.f8789a;
                    Object[] objArr = f0Var.f20616b;
                    int[] iArr = f0Var.f20617c;
                    long[] jArr = f0Var.f20615a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j10 = jArr[i16];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8;
                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                while (i12 < i18) {
                                    if ((j10 & 255) < 128) {
                                        int i19 = (i16 << 3) + i12;
                                        i11 = i17;
                                        h1.i0 i0Var = (h1.i0) objArr[i19];
                                        dVarA.f8789a = i15 + iArr[i19];
                                        eh.l<Object, pg.f0> lVarE = hVar.e();
                                        if (lVarE != null) {
                                            lVarE.invoke(i0Var);
                                        }
                                    } else {
                                        i11 = i17;
                                    }
                                    j10 >>= i11;
                                    i12++;
                                    i17 = i11;
                                }
                                if (i18 != i17) {
                                    break;
                                }
                                if (i16 == length) {
                                    break;
                                }
                                i16++;
                                i12 = 0;
                            }
                        }
                    }
                    dVarA.f8789a = i15;
                    pg.f0 f0Var2 = pg.f0.f21461a;
                    T[] tArr2 = bVarC.f34700a;
                    int i20 = bVarC.f34702c;
                    for (int i21 = 0; i21 < i20; i21++) {
                        ((i0) tArr2[i21]).done();
                    }
                } catch (Throwable th2) {
                    T[] tArr3 = bVarC.f34700a;
                    int i22 = bVarC.f34702c;
                    for (int i23 = 0; i23 < i22; i23++) {
                        ((i0) tArr3[i23]).done();
                    }
                    throw th2;
                }
            }
            return aVar3;
        }
        p.f0 f0Var3 = new p.f0((Object) null);
        f1.i<f1.d> iVar2 = j3.f31726a;
        f1.d dVarA2 = iVar2.a();
        if (dVarA2 == null) {
            i10 = 0;
            dVarA2 = new f1.d(0);
            iVar2.b(dVarA2);
        } else {
            i10 = 0;
        }
        int i24 = dVarA2.f8789a;
        z0.b bVarC2 = bg.b.c();
        T[] tArr4 = bVarC2.f34700a;
        int i25 = bVarC2.f34702c;
        for (int i26 = i10; i26 < i25; i26++) {
            ((i0) tArr4[i26]).start();
        }
        try {
            dVarA2.f8789a = i24 + 1;
            Object objC = h.a.c(aVar2, new b(this, dVarA2, f0Var3, i24));
            dVarA2.f8789a = i24;
            T[] tArr5 = bVarC2.f34700a;
            int i27 = bVarC2.f34702c;
            while (i10 < i27) {
                ((i0) tArr5[i10]).done();
                i10++;
            }
            Object obj = h1.n.f12160c;
            synchronized (obj) {
                try {
                    h1.h hVarK = h1.n.k();
                    Object obj2 = aVar3.f31691f;
                    if (obj2 == a.f31687h || (i3Var = this.f31685c) == 0 || !i3Var.a(objC, obj2)) {
                        a<T> aVar4 = this.f31686d;
                        synchronized (obj) {
                            h1.k0 k0VarM = h1.n.m(aVar4, this);
                            k0VarM.a(aVar4);
                            k0VarM.f12133a = hVarK.g();
                            aVar3 = (a) k0VarM;
                            aVar3.f31690e = f0Var3;
                            aVar3.f31692g = aVar3.e(this, hVarK);
                            aVar3.f31691f = objC;
                        }
                        return aVar3;
                    }
                    aVar3.f31690e = f0Var3;
                    aVar3.f31692g = aVar3.e(this, hVarK);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            f1.d dVarA3 = j3.f31726a.a();
            if (dVarA3 == null || dVarA3.f8789a != 0) {
                return aVar3;
            }
            h1.n.k().m();
            synchronized (obj) {
                h1.h hVarK2 = h1.n.k();
                aVar3.f31688c = hVarK2.g();
                aVar3.f31689d = hVarK2.h();
                pg.f0 f0Var4 = pg.f0.f21461a;
                return aVar3;
            }
        } catch (Throwable th4) {
            T[] tArr6 = bVarC2.f34700a;
            int i28 = bVarC2.f34702c;
            for (int i29 = i10; i29 < i28; i29++) {
                ((i0) tArr6[i29]).done();
            }
            throw th4;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) h1.n.i(this.f31686d);
        sb.append(aVar.d(this, h1.n.k()) ? String.valueOf(aVar.f31691f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
