package h1;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12158a = a.f12169a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1.i<h> f12159b = new f1.i<>();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12160c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static l f12161d;

    /* renamed from: e, reason: collision with root package name */
    public static long f12162e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f12163f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0<i0> f12164g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f12165h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f12166i;

    /* renamed from: j, reason: collision with root package name */
    public static final h1.b f12167j;

    /* renamed from: k, reason: collision with root package name */
    public static final f1.a f12168k;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<l, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12169a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(l lVar) {
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<Object, pg.f0> f12170a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Object, pg.f0> f12171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2) {
            super(1);
            this.f12170a = lVar;
            this.f12171b = lVar2;
        }

        @Override // eh.l
        public final pg.f0 invoke(Object obj) {
            this.f12170a.invoke(obj);
            this.f12171b.invoke(obj);
            return pg.f0.f21461a;
        }
    }

    static {
        l lVar = l.f12135e;
        f12161d = lVar;
        f12162e = 1 + 1;
        j jVar = new j();
        jVar.f12127b = new long[16];
        jVar.f12128c = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        jVar.f12129d = iArr;
        f12163f = jVar;
        b0<i0> b0Var = new b0<>();
        b0Var.f12090b = new int[16];
        b0Var.f12091c = new f1.n[16];
        f12164g = b0Var;
        qg.z zVar = qg.z.f22752a;
        f12165h = zVar;
        f12166i = zVar;
        long j10 = f12162e;
        f12162e = 1 + j10;
        h1.b bVar = new h1.b(j10, lVar, null, h1.a.f12084a);
        f12161d = f12161d.i(bVar.f12122b);
        f12167j = bVar;
        f12168k = new f1.a(0);
    }

    public static final void a() {
        f(f12158a);
    }

    public static final eh.l b(eh.l lVar, eh.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new e9.l0(lVar, lVar2, 1);
    }

    public static final HashMap c(long j10, c cVar, l lVar) {
        long[] jArr;
        l lVar2;
        long[] jArr2;
        l lVar3;
        int i10;
        k0 k0VarS;
        long j11 = j10;
        p.m0<i0> m0VarX = cVar.x();
        if (m0VarX != null) {
            l lVarG = cVar.d().i(cVar.g()).g(cVar.f12098j);
            Object[] objArr = m0VarX.f20753b;
            long[] jArr3 = m0VarX.f20752a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j12 = jArr3[i11];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j12 & 255) < 128) {
                                i0 i0Var = (i0) objArr[(i11 << 3) + i14];
                                k0 k0VarC = i0Var.c();
                                jArr2 = jArr3;
                                i10 = i12;
                                k0 k0VarS2 = s(k0VarC, j11, lVar);
                                if (k0VarS2 == null || (k0VarS = s(k0VarC, j11, lVarG)) == null || k0VarS2.equals(k0VarS)) {
                                    lVar3 = lVarG;
                                } else {
                                    lVar3 = lVarG;
                                    k0 k0VarS3 = s(k0VarC, cVar.g(), cVar.d());
                                    if (k0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    k0 k0VarM = i0Var.m(k0VarS, k0VarS2, k0VarS3);
                                    if (k0VarM == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(k0VarS2, k0VarM);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                lVar3 = lVarG;
                                i10 = i12;
                            }
                            j12 >>= i10;
                            i14++;
                            j11 = j10;
                            i12 = i10;
                            jArr3 = jArr2;
                            lVarG = lVar3;
                        }
                        jArr = jArr3;
                        lVar2 = lVarG;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        lVar2 = lVarG;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    j11 = j10;
                    jArr3 = jArr;
                    lVarG = lVar2;
                }
            }
        }
        return null;
    }

    public static final void d(h hVar) {
        long j10;
        if (f12161d.f(hVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(hVar.g());
        sb.append(", disposed=");
        sb.append(hVar.f12123c);
        sb.append(", applied=");
        c cVar = hVar instanceof c ? (c) hVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.f12101m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f12160c) {
            j jVar = f12163f;
            j10 = jVar.f12126a > 0 ? jVar.f12127b[0] : -1L;
        }
        sb.append(j10);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final l e(l lVar, long j10, long j11) {
        while (j10 < j11) {
            lVar = lVar.i(j10);
            j10++;
        }
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T f(eh.l<? super l, ? extends T> lVar) {
        p.m0<i0> m0Var;
        T t3;
        h1.b bVar = f12167j;
        synchronized (f12160c) {
            try {
                m0Var = bVar.f12096h;
                if (m0Var != null) {
                    f12168k.addAndGet(1);
                }
                t3 = (T) v(bVar, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m0Var != null) {
            try {
                ?? r42 = f12165h;
                int size = r42.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((eh.p) r42.get(i10)).invoke(new z0.d(m0Var), bVar);
                }
            } finally {
                f12168k.addAndGet(-1);
            }
        }
        synchronized (f12160c) {
            try {
                g();
                if (m0Var != null) {
                    Object[] objArr = m0Var.f20753b;
                    long[] jArr = m0Var.f20752a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        q((i0) objArr[(i11 << 3) + i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 == length) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t3;
    }

    public static final void g() {
        b0<i0> b0Var = f12164g;
        int i10 = b0Var.f12089a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            f1.n<i0> nVar = b0Var.f12091c[i11];
            i0 i0Var = nVar != null ? nVar.get() : null;
            if (i0Var != null && p(i0Var)) {
                if (i12 != i11) {
                    b0Var.f12091c[i12] = nVar;
                    int[] iArr = b0Var.f12090b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            b0Var.f12091c[i13] = null;
            b0Var.f12090b[i13] = 0;
        }
        if (i12 != i10) {
            b0Var.f12089a = i12;
        }
    }

    public static final h h(h hVar, eh.l<Object, pg.f0> lVar, boolean z10) {
        boolean z11 = hVar instanceof c;
        if (z11 || hVar == null) {
            return new m0(z11 ? (c) hVar : null, lVar, null, false, z10);
        }
        return new n0(hVar, lVar, z10);
    }

    public static final <T extends k0> T i(T t3) {
        T t10;
        h hVarK = k();
        T t11 = (T) s(t3, hVarK.g(), hVarK.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f12160c) {
            h hVarK2 = k();
            t10 = (T) s(t3, hVarK2.g(), hVarK2.d());
        }
        if (t10 != null) {
            return t10;
        }
        r();
        throw null;
    }

    public static final <T extends k0> T j(T t3, h hVar) {
        T t10;
        T t11 = (T) s(t3, hVar.g(), hVar.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f12160c) {
            t10 = (T) s(t3, hVar.g(), hVar.d());
        }
        if (t10 != null) {
            return t10;
        }
        r();
        throw null;
    }

    public static final h k() {
        h hVarA = f12159b.a();
        return hVarA == null ? f12167j : hVarA;
    }

    public static final eh.l<Object, pg.f0> l(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new b(lVar, lVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r6 = (T) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends k0> T m(T t3, i0 i0Var) {
        k0 k0VarC = i0Var.c();
        long j10 = f12162e;
        j jVar = f12163f;
        if (jVar.f12126a > 0) {
            j10 = jVar.f12127b[0];
        }
        long j11 = j10 - 1;
        T t10 = null;
        k0 k0Var = null;
        while (true) {
            if (k0VarC == null) {
                break;
            }
            long j12 = k0VarC.f12133a;
            if (j12 == 0) {
                break;
            }
            if (j12 != 0 && j12 <= j11) {
                long j13 = j12 - 0;
                boolean z10 = true;
                if (j13 < 0 || j13 >= 64 ? j13 < 64 || j13 >= 128 || ((1 << (((int) j13) - 64)) & 0) == 0 : ((1 << ((int) j13)) & 0) == 0) {
                    z10 = false;
                }
                if (z10) {
                    continue;
                } else if (k0Var == null) {
                    k0Var = k0VarC;
                } else {
                    if (k0VarC.f12133a < k0Var.f12133a) {
                        break;
                    }
                    t10 = (T) k0Var;
                }
            }
            k0VarC = k0VarC.f12134b;
        }
        if (t10 != null) {
            t10.f12133a = Long.MAX_VALUE;
            return t10;
        }
        T t11 = (T) t3.c(Long.MAX_VALUE);
        t11.f12134b = i0Var.c();
        i0Var.k(t11);
        return t11;
    }

    public static final void n(h hVar, i0 i0Var) {
        hVar.t(hVar.h() + 1);
        eh.l<Object, pg.f0> lVarI = hVar.i();
        if (lVarI != null) {
            lVarI.invoke(i0Var);
        }
    }

    public static final k0 o(k0 k0Var, j0 j0Var, h hVar, k0 k0Var2) {
        k0 k0VarM;
        if (hVar.f()) {
            hVar.n(j0Var);
        }
        long jG = hVar.g();
        if (k0Var2.f12133a == jG) {
            return k0Var2;
        }
        synchronized (f12160c) {
            k0VarM = m(k0Var, j0Var);
        }
        k0VarM.f12133a = jG;
        if (k0Var2.f12133a != 1) {
            hVar.n(j0Var);
        }
        return k0VarM;
    }

    public static final boolean p(i0 i0Var) {
        k0 k0Var;
        long j10 = f12162e;
        j jVar = f12163f;
        if (jVar.f12126a > 0) {
            j10 = jVar.f12127b[0];
        }
        k0 k0Var2 = null;
        k0 k0VarC = null;
        int i10 = 0;
        for (k0 k0VarC2 = i0Var.c(); k0VarC2 != null; k0VarC2 = k0VarC2.f12134b) {
            long j11 = k0VarC2.f12133a;
            if (j11 != 0) {
                if (j11 >= j10) {
                    i10++;
                } else if (k0Var2 == null) {
                    i10++;
                    k0Var2 = k0VarC2;
                } else {
                    if (j11 < k0Var2.f12133a) {
                        k0Var = k0Var2;
                        k0Var2 = k0VarC2;
                    } else {
                        k0Var = k0VarC2;
                    }
                    if (k0VarC == null) {
                        k0VarC = i0Var.c();
                        k0 k0Var3 = k0VarC;
                        while (true) {
                            if (k0VarC == null) {
                                k0VarC = k0Var3;
                                break;
                            }
                            long j12 = k0VarC.f12133a;
                            if (j12 >= j10) {
                                break;
                            }
                            if (k0Var3.f12133a < j12) {
                                k0Var3 = k0VarC;
                            }
                            k0VarC = k0VarC.f12134b;
                        }
                    }
                    k0Var2.f12133a = 0L;
                    k0Var2.a(k0VarC);
                    k0Var2 = k0Var;
                }
            }
        }
        return i10 > 1;
    }

    public static final void q(i0 i0Var) {
        if (p(i0Var)) {
            b0<i0> b0Var = f12164g;
            int i10 = b0Var.f12089a;
            int iIdentityHashCode = System.identityHashCode(i0Var);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = b0Var.f12089a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = b0Var.f12090b[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        f1.n<i0> nVar = b0Var.f12091c[i14];
                        if (i0Var == (nVar != null ? nVar.get() : null)) {
                            i11 = i14;
                        } else {
                            for (int i16 = i14 - 1; -1 < i16 && b0Var.f12090b[i16] == iIdentityHashCode; i16--) {
                                f1.n<i0> nVar2 = b0Var.f12091c[i16];
                                if ((nVar2 != null ? nVar2.get() : null) == i0Var) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = b0Var.f12089a;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(b0Var.f12089a + 1);
                                    break;
                                } else {
                                    if (b0Var.f12090b[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    f1.n<i0> nVar3 = b0Var.f12091c[i14];
                                    if ((nVar3 != null ? nVar3.get() : null) == i0Var) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            f1.n<i0>[] nVarArr = b0Var.f12091c;
            int length = nVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                f1.n<T>[] nVarArr2 = new f1.n[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(nVarArr, i18, nVarArr2, i20, i10 - i18);
                System.arraycopy(b0Var.f12091c, 0, nVarArr2, 0, i18);
                qg.m.d(i20, b0Var.f12090b, i18, i10, iArr);
                qg.m.h(0, b0Var.f12090b, i18, 6, iArr);
                b0Var.f12091c = nVarArr2;
                b0Var.f12090b = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(nVarArr, i18, nVarArr, i21, i10 - i18);
                int[] iArr2 = b0Var.f12090b;
                qg.m.d(i21, iArr2, i18, i10, iArr2);
            }
            b0Var.f12091c[i18] = new f1.n<>(i0Var);
            b0Var.f12090b[i18] = iIdentityHashCode;
            b0Var.f12089a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends k0> T s(T t3, long j10, l lVar) {
        T t10 = null;
        while (t3 != null) {
            long j11 = t3.f12133a;
            if (j11 != 0 && j11 <= j10 && !lVar.f(j11) && (t10 == null || t10.f12133a < t3.f12133a)) {
                t10 = t3;
            }
            t3 = (T) t3.f12134b;
        }
        if (t10 != null) {
            return t10;
        }
        return null;
    }

    public static final <T extends k0> T t(T t3, i0 i0Var) {
        T t10;
        h hVarK = k();
        eh.l<Object, pg.f0> lVarE = hVarK.e();
        if (lVarE != null) {
            lVarE.invoke(i0Var);
        }
        T t11 = (T) s(t3, hVarK.g(), hVarK.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f12160c) {
            h hVarK2 = k();
            k0 k0VarC = i0Var.c();
            kotlin.jvm.internal.r.c(k0VarC, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t10 = (T) s(k0VarC, hVarK2.g(), hVarK2.d());
            if (t10 == null) {
                r();
                throw null;
            }
        }
        return t10;
    }

    public static final void u(int i10) {
        j jVar = f12163f;
        int i11 = jVar.f12129d[i10];
        jVar.b(i11, jVar.f12126a - 1);
        jVar.f12126a--;
        long[] jArr = jVar.f12127b;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (jArr[i13] <= j10) {
                break;
            }
            jVar.b(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = jVar.f12127b;
        int i14 = jVar.f12126a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < jVar.f12126a) {
                long j11 = jArr2[i15];
                if (j11 < jArr2[i16]) {
                    if (j11 >= jArr2[i11]) {
                        break;
                    }
                    jVar.b(i15, i11);
                    i11 = i15;
                }
            }
            if (jArr2[i16] >= jArr2[i11]) {
                break;
            }
            jVar.b(i16, i11);
            i11 = i16;
        }
        jVar.f12129d[i10] = jVar.f12130e;
        jVar.f12130e = i10;
    }

    public static final <T> T v(h1.b bVar, eh.l<? super l, ? extends T> lVar) {
        long j10 = bVar.f12122b;
        T tInvoke = lVar.invoke(f12161d.e(j10));
        long j11 = f12162e;
        f12162e = 1 + j11;
        l lVarE = f12161d.e(j10);
        f12161d = lVarE;
        bVar.f12122b = j11;
        bVar.f12121a = lVarE;
        bVar.f12095g = 0;
        bVar.f12096h = null;
        bVar.o();
        f12161d = f12161d.i(j11);
        return tInvoke;
    }

    public static final <T extends k0> T w(T t3, i0 i0Var, h hVar) {
        T t10;
        if (hVar.f()) {
            hVar.n(i0Var);
        }
        long jG = hVar.g();
        T t11 = (T) s(t3, jG, hVar.d());
        if (t11 == null) {
            r();
            throw null;
        }
        if (t11.f12133a == hVar.g()) {
            return t11;
        }
        synchronized (f12160c) {
            t10 = (T) s(i0Var.c(), jG, hVar.d());
            if (t10 == null) {
                r();
                throw null;
            }
            if (t10.f12133a != jG) {
                k0 k0VarM = m(t10, i0Var);
                k0VarM.a(t10);
                k0VarM.f12133a = hVar.g();
                t10 = (T) k0VarM;
            }
        }
        if (t11.f12133a != 1) {
            hVar.n(i0Var);
        }
        return t10;
    }
}
