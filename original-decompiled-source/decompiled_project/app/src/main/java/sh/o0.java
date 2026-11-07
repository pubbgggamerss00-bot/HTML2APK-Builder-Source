package sh;

import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;

/* loaded from: classes2.dex */
public class o0<T> extends th.b<r0> implements i0<T>, f, th.r<T> {

    /* renamed from: e, reason: collision with root package name */
    public final int f25041e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25042f;

    /* renamed from: g, reason: collision with root package name */
    public final rh.a f25043g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f25044h;

    /* renamed from: j, reason: collision with root package name */
    public long f25045j;

    /* renamed from: k, reason: collision with root package name */
    public long f25046k;

    /* renamed from: l, reason: collision with root package name */
    public int f25047l;

    /* renamed from: m, reason: collision with root package name */
    public int f25048m;

    public static final class a implements ph.b1 {

        /* renamed from: a, reason: collision with root package name */
        public final o0<?> f25049a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25050b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f25051c;

        /* renamed from: d, reason: collision with root package name */
        public final ph.m f25052d;

        public a(o0 o0Var, long j10, Object obj, ph.m mVar) {
            this.f25049a = o0Var;
            this.f25050b = j10;
            this.f25051c = obj;
            this.f25052d = mVar;
        }

        @Override // ph.b1
        public final void a() {
            o0<?> o0Var = this.f25049a;
            synchronized (o0Var) {
                if (this.f25050b < o0Var.p()) {
                    return;
                }
                Object[] objArr = o0Var.f25044h;
                kotlin.jvm.internal.r.b(objArr);
                long j10 = this.f25050b;
                if (objArr[((int) j10) & (objArr.length - 1)] != this) {
                    return;
                }
                q0.c(objArr, j10, q0.f25075a);
                o0Var.k();
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }
    }

    public o0(int i10, int i11, rh.a aVar) {
        this.f25041e = i10;
        this.f25042f = i11;
        this.f25043g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        throw r2.getCancellationException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(o0 o0Var, g gVar, tg.e eVar) throws Throwable {
        p0 p0Var;
        o0 o0Var2;
        Throwable th2;
        r0 r0Var;
        g gVar2;
        s1 s1Var;
        g gVar3;
        if (eVar instanceof p0) {
            p0Var = (p0) eVar;
            int i10 = p0Var.f25065g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p0Var.f25065g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p0Var = new p0(o0Var, eVar);
            }
        }
        Object obj = p0Var.f25063e;
        ug.a aVar = ug.a.f29706a;
        int i11 = p0Var.f25065g;
        if (i11 != 0) {
            if (i11 == 1) {
                r0Var = p0Var.f25061c;
                g gVar4 = p0Var.f25060b;
                o0 o0Var3 = p0Var.f25059a;
                try {
                    pg.q.b(obj);
                    gVar2 = gVar4;
                    o0Var = o0Var3;
                    try {
                        s1Var = (s1) p0Var.getContext().get(s1.a.f21589a);
                        gVar3 = gVar2;
                    } catch (Throwable th3) {
                        o0Var2 = o0Var;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    o0Var2 = o0Var3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s1 s1Var2 = p0Var.f25062d;
                r0Var = p0Var.f25061c;
                g gVar5 = p0Var.f25060b;
                o0Var2 = p0Var.f25059a;
                try {
                    pg.q.b(obj);
                    gVar3 = gVar5;
                    s1Var = s1Var2;
                    o0Var = o0Var2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            o0Var2.h(r0Var);
            throw th2;
        }
        pg.q.b(obj);
        r0 r0VarE = o0Var.e();
        try {
            if (gVar instanceof c1) {
                p0Var.f25059a = o0Var;
                p0Var.f25060b = gVar;
                p0Var.f25061c = r0VarE;
                p0Var.f25065g = 1;
                if (((c1) gVar).b(p0Var) == aVar) {
                    return;
                }
            }
            gVar2 = gVar;
            r0Var = r0VarE;
            s1Var = (s1) p0Var.getContext().get(s1.a.f21589a);
            gVar3 = gVar2;
        } catch (Throwable th6) {
            o0Var2 = o0Var;
            th2 = th6;
            r0Var = r0VarE;
        }
        while (true) {
            Object objU = o0Var.u(r0Var);
            if (objU == q0.f25075a) {
                p0Var.f25059a = o0Var;
                p0Var.f25060b = gVar3;
                p0Var.f25061c = r0Var;
                p0Var.f25062d = s1Var;
                p0Var.f25065g = 2;
                if (o0Var.j(r0Var, p0Var) == aVar) {
                    return;
                }
            } else {
                if (s1Var != null && !s1Var.isActive()) {
                    break;
                }
                p0Var.f25059a = o0Var;
                p0Var.f25060b = gVar3;
                p0Var.f25061c = r0Var;
                p0Var.f25062d = s1Var;
                p0Var.f25065g = 3;
                if (gVar3.c(objU, p0Var) == aVar) {
                    return;
                }
            }
        }
    }

    @Override // sh.f
    public final Object b(g<? super T> gVar, tg.e<?> eVar) throws Throwable {
        l(this, gVar, eVar);
        return ug.a.f29706a;
    }

    @Override // sh.g
    public final Object c(T t3, tg.e<? super pg.f0> eVar) throws Throwable {
        Throwable th2;
        tg.e<pg.f0>[] eVarArrO;
        a aVar;
        if (r(t3)) {
            return pg.f0.f21461a;
        }
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        tg.e<pg.f0>[] eVarArrO2 = th.c.f28782a;
        synchronized (this) {
            try {
                if (s(t3)) {
                    try {
                        mVar.resumeWith(pg.f0.f21461a);
                        eVarArrO = o(eVarArrO2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        a aVar2 = new a(this, p() + this.f25047l + this.f25048m, t3, mVar);
                        n(aVar2);
                        this.f25048m++;
                        if (this.f25042f == 0) {
                            eVarArrO2 = o(eVarArrO2);
                        }
                        eVarArrO = eVarArrO2;
                        aVar = aVar2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    mVar.t(new ph.c1(aVar));
                }
                for (tg.e<pg.f0> eVar2 : eVarArrO) {
                    if (eVar2 != null) {
                        eVar2.resumeWith(pg.f0.f21461a);
                    }
                }
                Object objO = mVar.o();
                ug.a aVar3 = ug.a.f29706a;
                if (objO != aVar3) {
                    objO = pg.f0.f21461a;
                }
                return objO == aVar3 ? objO : pg.f0.f21461a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // th.r
    public final f<T> d(tg.h hVar, int i10, rh.a aVar) {
        return q0.d(this, hVar, i10, aVar);
    }

    @Override // th.b
    public final th.d f() {
        return new r0();
    }

    @Override // th.b
    public final th.d[] g() {
        return new r0[2];
    }

    public final Object j(r0 r0Var, p0 p0Var) throws Throwable {
        ph.m mVar = new ph.m(1, ah.p.c(p0Var));
        mVar.p();
        synchronized (this) {
            try {
                if (t(r0Var) < 0) {
                    r0Var.f25079b = mVar;
                } else {
                    mVar.resumeWith(pg.f0.f21461a);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objO = mVar.o();
        return objO == ug.a.f29706a ? objO : pg.f0.f21461a;
    }

    public final void k() {
        if (this.f25042f != 0 || this.f25048m > 1) {
            Object[] objArr = this.f25044h;
            kotlin.jvm.internal.r.b(objArr);
            while (this.f25048m > 0) {
                long jP = p();
                int i10 = this.f25047l;
                int i11 = this.f25048m;
                if (objArr[((int) ((jP + (i10 + i11)) - 1)) & (objArr.length - 1)] != q0.f25075a) {
                    return;
                }
                this.f25048m = i11 - 1;
                q0.c(objArr, p() + this.f25047l + this.f25048m, null);
            }
        }
    }

    public final void m() {
        Object[] objArr;
        Object[] objArr2 = this.f25044h;
        kotlin.jvm.internal.r.b(objArr2);
        q0.c(objArr2, p(), null);
        this.f25047l--;
        long jP = p() + 1;
        if (this.f25045j < jP) {
            this.f25045j = jP;
        }
        if (this.f25046k < jP) {
            if (this.f28773b != 0 && (objArr = this.f28772a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        r0 r0Var = (r0) obj;
                        long j10 = r0Var.f25078a;
                        if (j10 >= 0 && j10 < jP) {
                            r0Var.f25078a = jP;
                        }
                    }
                }
            }
            this.f25046k = jP;
        }
    }

    public final void n(Object obj) {
        int i10 = this.f25047l + this.f25048m;
        Object[] objArrQ = this.f25044h;
        if (objArrQ == null) {
            objArrQ = q(null, 0, 2);
        } else if (i10 >= objArrQ.length) {
            objArrQ = q(objArrQ, i10, objArrQ.length * 2);
        }
        q0.c(objArrQ, p() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final tg.e<pg.f0>[] o(tg.e<pg.f0>[] eVarArr) {
        Object[] objArr;
        r0 r0Var;
        ph.m mVar;
        int length = eVarArr.length;
        if (this.f28773b != 0 && (objArr = this.f28772a) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            eVarArr = eVarArr;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj != null && (mVar = (r0Var = (r0) obj).f25079b) != null && t(r0Var) >= 0) {
                    int length3 = eVarArr.length;
                    eVarArr = eVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(eVarArr, Math.max(2, eVarArr.length * 2));
                        kotlin.jvm.internal.r.d(CopyOf, "copyOf(...)");
                        eVarArr = CopyOf;
                    }
                    eVarArr[length] = mVar;
                    r0Var.f25079b = null;
                    length++;
                }
                i10++;
                eVarArr = eVarArr;
            }
        }
        return eVarArr;
    }

    public final long p() {
        return Math.min(this.f25046k, this.f25045j);
    }

    public final Object[] q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f25044h = objArr2;
        if (objArr != null) {
            long jP = p();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + jP;
                q0.c(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean r(T t3) {
        int i10;
        boolean z10;
        tg.e<pg.f0>[] eVarArrO = th.c.f28782a;
        synchronized (this) {
            if (s(t3)) {
                eVarArrO = o(eVarArrO);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (tg.e<pg.f0> eVar : eVarArrO) {
            if (eVar != null) {
                eVar.resumeWith(pg.f0.f21461a);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(T t3) {
        int i10 = this.f28773b;
        int i11 = this.f25041e;
        if (i10 != 0) {
            int i12 = this.f25047l;
            int i13 = this.f25042f;
            if (i12 < i13 || this.f25046k > this.f25045j) {
                n(t3);
                int i14 = this.f25047l + 1;
                this.f25047l = i14;
                if (i14 > i13) {
                    m();
                }
                long jP = p() + this.f25047l;
                long j10 = this.f25045j;
                if (((int) (jP - j10)) > i11) {
                    v(1 + j10, this.f25046k, p() + this.f25047l, p() + this.f25047l + this.f25048m);
                }
            } else {
                int iOrdinal = this.f25043g.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                }
            }
        } else if (i11 != 0) {
            n(t3);
            int i15 = this.f25047l + 1;
            this.f25047l = i15;
            if (i15 > i11) {
                m();
            }
            this.f25046k = p() + this.f25047l;
            return true;
        }
        return true;
    }

    public final long t(r0 r0Var) {
        long j10 = r0Var.f25078a;
        if (j10 < p() + this.f25047l) {
            return j10;
        }
        if (this.f25042f <= 0 && j10 <= p() && this.f25048m != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object u(r0 r0Var) {
        Object obj;
        tg.e<pg.f0>[] eVarArrW = th.c.f28782a;
        synchronized (this) {
            try {
                long jT = t(r0Var);
                if (jT < 0) {
                    obj = q0.f25075a;
                } else {
                    long j10 = r0Var.f25078a;
                    Object[] objArr = this.f25044h;
                    kotlin.jvm.internal.r.b(objArr);
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f25051c;
                    }
                    r0Var.f25078a = jT + 1;
                    Object obj3 = obj2;
                    eVarArrW = w(j10);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (tg.e<pg.f0> eVar : eVarArrW) {
            if (eVar != null) {
                eVar.resumeWith(pg.f0.f21461a);
            }
        }
        return obj;
    }

    public final void v(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jP = p(); jP < jMin; jP++) {
            Object[] objArr = this.f25044h;
            kotlin.jvm.internal.r.b(objArr);
            q0.c(objArr, jP, null);
        }
        this.f25045j = j10;
        this.f25046k = j11;
        this.f25047l = (int) (j12 - jMin);
        this.f25048m = (int) (j13 - j12);
    }

    public final tg.e<pg.f0>[] w(long j10) {
        long j11;
        long j12;
        long j13;
        int i10;
        tg.e<pg.f0>[] eVarArr;
        Object[] objArr;
        long j14 = this.f25046k;
        tg.e<pg.f0>[] eVarArr2 = th.c.f28782a;
        if (j10 <= j14) {
            long jP = p();
            long j15 = this.f25047l + jP;
            int i11 = this.f25042f;
            if (i11 == 0 && this.f25048m > 0) {
                j15++;
            }
            int i12 = 0;
            if (this.f28773b != 0 && (objArr = this.f28772a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j16 = ((r0) obj).f25078a;
                        if (j16 >= 0 && j16 < j15) {
                            j15 = j16;
                        }
                    }
                }
            }
            if (j15 > this.f25046k) {
                long jP2 = p() + this.f25047l;
                int iMin = this.f28773b > 0 ? Math.min(this.f25048m, i11 - ((int) (jP2 - j15))) : this.f25048m;
                long j17 = this.f25048m + jP2;
                uh.v vVar = q0.f25075a;
                if (iMin > 0) {
                    tg.e<pg.f0>[] eVarArr3 = new tg.e[iMin];
                    j13 = 1;
                    Object[] objArr2 = this.f25044h;
                    kotlin.jvm.internal.r.b(objArr2);
                    i10 = i11;
                    long j18 = jP2;
                    while (true) {
                        if (jP2 >= j17) {
                            j11 = jP;
                            j12 = j15;
                            break;
                        }
                        j11 = jP;
                        Object obj2 = objArr2[((int) jP2) & (objArr2.length - 1)];
                        if (obj2 != vVar) {
                            kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            a aVar = (a) obj2;
                            int i13 = i12 + 1;
                            j12 = j15;
                            eVarArr3[i12] = aVar.f25052d;
                            q0.c(objArr2, jP2, vVar);
                            q0.c(objArr2, j18, aVar.f25051c);
                            j18++;
                            if (i13 >= iMin) {
                                break;
                            }
                            i12 = i13;
                        } else {
                            j12 = j15;
                        }
                        jP2++;
                        jP = j11;
                        j15 = j12;
                    }
                    jP2 = j18;
                    eVarArr = eVarArr3;
                } else {
                    j11 = jP;
                    j12 = j15;
                    j13 = 1;
                    i10 = i11;
                    eVarArr = eVarArr2;
                }
                int i14 = (int) (jP2 - j11);
                long j19 = this.f28773b == 0 ? jP2 : j12;
                long jMax = Math.max(this.f25045j, jP2 - Math.min(this.f25041e, i14));
                if (i10 == 0 && jMax < j17) {
                    Object[] objArr3 = this.f25044h;
                    kotlin.jvm.internal.r.b(objArr3);
                    if (kotlin.jvm.internal.r.a(objArr3[((int) jMax) & (objArr3.length - 1)], vVar)) {
                        jP2 += j13;
                        jMax += j13;
                    }
                }
                v(jMax, j19, jP2, j17);
                k();
                return eVarArr.length == 0 ? eVarArr : o(eVarArr);
            }
        }
        return eVarArr2;
    }
}
