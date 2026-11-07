package h1;

import h1.i;
import h1.n;
import java.util.ArrayList;
import java.util.HashMap;
import p.y0;
import x0.b2;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12092n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final eh.l<Object, pg.f0> f12093e;

    /* renamed from: f, reason: collision with root package name */
    public final eh.l<Object, pg.f0> f12094f;

    /* renamed from: g, reason: collision with root package name */
    public int f12095g;

    /* renamed from: h, reason: collision with root package name */
    public p.m0<i0> f12096h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f12097i;

    /* renamed from: j, reason: collision with root package name */
    public l f12098j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f12099k;

    /* renamed from: l, reason: collision with root package name */
    public int f12100l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12101m;

    public c(long j10, l lVar, eh.l<Object, pg.f0> lVar2, eh.l<Object, pg.f0> lVar3) {
        super(j10, lVar);
        this.f12093e = lVar2;
        this.f12094f = lVar3;
        this.f12098j = l.f12135e;
        this.f12099k = f12092n;
        this.f12100l = 1;
    }

    public final void A(long j10) {
        synchronized (n.f12160c) {
            this.f12098j = this.f12098j.i(j10);
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    public void B(p.m0<i0> m0Var) {
        this.f12096h = m0Var;
    }

    public c C(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2) throws Throwable {
        if (this.f12123c) {
            b2.a("Cannot use a disposed snapshot");
        }
        if (this.f12101m && this.f12124d < 0) {
            b2.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n.f12160c;
        synchronized (obj) {
            try {
                long j10 = n.f12162e;
                n.f12162e = j10 + 1;
                n.f12161d = n.f12161d.i(j10);
                l lVarD = d();
                r(lVarD.i(j10));
                try {
                    d dVar = new d(j10, n.e(lVarD, g() + 1, j10), n.l(lVar, e(), true), n.b(lVar2, i()), this);
                    if (this.f12101m || this.f12123c) {
                        return dVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j11 = n.f12162e;
                        n.f12162e = j11 + 1;
                        s(j11);
                        n.f12161d = n.f12161d.i(g());
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                    r(n.e(d(), jG + 1, g()));
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // h1.h
    public final void b() {
        n.f12161d = n.f12161d.e(g()).c(this.f12098j);
    }

    @Override // h1.h
    public void c() {
        if (this.f12123c) {
            return;
        }
        super.c();
        l();
    }

    @Override // h1.h
    public boolean f() {
        return false;
    }

    @Override // h1.h
    public int h() {
        return this.f12095g;
    }

    @Override // h1.h
    public eh.l<Object, pg.f0> i() {
        return this.f12094f;
    }

    @Override // h1.h
    public void k() {
        this.f12100l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // h1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l() {
        if (this.f12100l <= 0) {
            b2.a("no pending nested snapshots");
        }
        int i10 = this.f12100l - 1;
        this.f12100l = i10;
        if (i10 != 0 || this.f12101m) {
            return;
        }
        p.m0<i0> m0VarX = x();
        if (m0VarX != null) {
            if (this.f12101m) {
                b2.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = m0VarX.f20753b;
            long[] jArr = m0VarX.f20752a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                for (k0 k0VarC = ((i0) objArr[(i11 << 3) + i13]).c(); k0VarC != null; k0VarC = k0VarC.f12134b) {
                                    long j11 = k0VarC.f12133a;
                                    if (j11 == jG || qg.x.w(this.f12098j, Long.valueOf(j11))) {
                                        n.a aVar = n.f12158a;
                                        k0VarC.f12133a = 0L;
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // h1.h
    public void m() {
        if (this.f12101m || this.f12123c) {
            return;
        }
        v();
    }

    @Override // h1.h
    public void n(i0 i0Var) {
        p.m0<i0> m0VarX = x();
        if (m0VarX == null) {
            m0VarX = y0.a();
            B(m0VarX);
        }
        m0VarX.d(i0Var);
    }

    @Override // h1.h
    public final void p() {
        int length = this.f12099k.length;
        for (int i10 = 0; i10 < length; i10++) {
            n.u(this.f12099k[i10]);
        }
        o();
    }

    @Override // h1.h
    public void t(int i10) {
        this.f12095g = i10;
    }

    @Override // h1.h
    public h u(eh.l<Object, pg.f0> lVar) throws Throwable {
        if (this.f12123c) {
            b2.a("Cannot use a disposed snapshot");
        }
        if (this.f12101m && this.f12124d < 0) {
            b2.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n.f12160c;
        synchronized (obj) {
            try {
                long j10 = n.f12162e;
                n.f12162e = j10 + 1;
                n.f12161d = n.f12161d.i(j10);
                try {
                    e eVar = new e(j10, n.e(d(), jG + 1, j10), n.l(lVar, e(), true), this);
                    if (this.f12101m || this.f12123c) {
                        return eVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j11 = n.f12162e;
                        n.f12162e = j11 + 1;
                        s(j11);
                        n.f12161d = n.f12161d.i(g());
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                    r(n.e(d(), jG2 + 1, g()));
                    return eVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        A(g());
        pg.f0 f0Var = pg.f0.f21461a;
        if (this.f12101m || this.f12123c) {
            return;
        }
        long jG = g();
        synchronized (n.f12160c) {
            long j10 = n.f12162e;
            n.f12162e = j10 + 1;
            s(j10);
            n.f12161d = n.f12161d.i(g());
        }
        r(n.e(d(), jG + 1, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i w() {
        HashMap mapC;
        qg.z zVar;
        p.m0<i0> m0Var;
        long j10;
        long j11;
        p.m0<i0> m0VarX = x();
        if (m0VarX != null) {
            long j12 = n.f12167j.f12122b;
            mapC = n.c(j12, this, n.f12161d.e(j12));
        } else {
            mapC = null;
        }
        qg.z zVar2 = qg.z.f22752a;
        synchronized (n.f12160c) {
            try {
                n.d(this);
                if (m0VarX == null || m0VarX.f20755d == 0) {
                    b();
                    b bVar = n.f12167j;
                    p.m0<i0> m0Var2 = bVar.f12096h;
                    n.v(bVar, n.f12158a);
                    if (m0Var2 == null || !m0Var2.c()) {
                        zVar = zVar2;
                        m0Var = null;
                    } else {
                        zVar = n.f12165h;
                        m0Var = m0Var2;
                    }
                } else {
                    b bVar2 = n.f12167j;
                    i iVarZ = z(n.f12162e, m0VarX, mapC, n.f12161d.e(bVar2.f12122b));
                    if (!kotlin.jvm.internal.r.a(iVarZ, i.b.f12125a)) {
                        return iVarZ;
                    }
                    b();
                    m0Var = bVar2.f12096h;
                    n.v(bVar2, n.f12158a);
                    B(null);
                    bVar2.f12096h = null;
                    zVar = n.f12165h;
                }
                pg.f0 f0Var = pg.f0.f21461a;
                this.f12101m = true;
                if (m0Var != null) {
                    z0.d dVar = new z0.d(m0Var);
                    if (!m0Var.b()) {
                        int size = zVar.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((eh.p) zVar.get(i10)).invoke(dVar, this);
                        }
                    }
                }
                if (m0VarX != null && m0VarX.c()) {
                    z0.d dVar2 = new z0.d(m0VarX);
                    int size2 = zVar.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((eh.p) zVar.get(i11)).invoke(dVar2, this);
                    }
                }
                synchronized (n.f12160c) {
                    try {
                        p();
                        n.g();
                        if (m0Var != null) {
                            Object[] objArr = m0Var.f20753b;
                            long[] jArr = m0Var.f20752a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j10 = 128;
                                while (true) {
                                    long j13 = jArr[i12];
                                    j11 = 255;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j13 & 255) < 128) {
                                                n.q((i0) objArr[(i12 << 3) + i14]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j10 = 128;
                                j11 = 255;
                            }
                        }
                        if (m0VarX != null) {
                            Object[] objArr2 = m0VarX.f20753b;
                            long[] jArr2 = m0VarX.f20752a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j14 = jArr2[i15];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j14 & j11) < j10) {
                                                n.q((i0) objArr2[(i15 << 3) + i17]);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f12097i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                n.q((i0) arrayList.get(i18));
                            }
                        }
                        this.f12097i = null;
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return i.b.f12125a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public p.m0<i0> x() {
        return this.f12096h;
    }

    @Override // h1.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public eh.l<Object, pg.f0> e() {
        return this.f12093e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i z(long j10, p.m0 m0Var, HashMap map, l lVar) {
        ArrayList arrayList;
        ArrayList arrayListO;
        ArrayList arrayList2;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j11;
        ArrayList arrayList3;
        k0 k0VarM;
        l lVarG = d().i(g()).g(this.f12098j);
        Object[] objArr3 = m0Var.f20753b;
        long[] jArr3 = m0Var.f20752a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList2 = null;
            arrayListO = null;
            while (true) {
                long j12 = jArr3[i11];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j12 & 255) < 128) {
                            objArr2 = objArr3;
                            i0 i0Var = (i0) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            k0 k0VarC = i0Var.c();
                            i10 = i13;
                            ArrayList arrayList4 = arrayList2;
                            k0 k0VarS = n.s(k0VarC, j10, lVar);
                            if (k0VarS == null) {
                                lVar3 = lVarG;
                                arrayList3 = arrayListO;
                                j11 = j12;
                            } else {
                                arrayList3 = arrayListO;
                                j11 = j12;
                                k0 k0VarS2 = n.s(k0VarC, g(), lVarG);
                                if (k0VarS2 == null) {
                                    lVar3 = lVarG;
                                } else {
                                    lVar3 = lVarG;
                                    if (k0VarS2.f12133a != 1 && !k0VarS.equals(k0VarS2)) {
                                        k0 k0VarS3 = n.s(k0VarC, g(), d());
                                        if (k0VarS3 == null) {
                                            n.r();
                                            throw null;
                                        }
                                        if (map == null || (k0VarM = (k0) map.get(k0VarS)) == null) {
                                            k0VarM = i0Var.m(k0VarS2, k0VarS, k0VarS3);
                                        }
                                        if (k0VarM == null) {
                                            return new i.a();
                                        }
                                        if (!k0VarM.equals(k0VarS3)) {
                                            if (k0VarM.equals(k0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new pg.n(i0Var, k0VarS.c(g())));
                                                arrayListO = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListO.add(i0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!k0VarM.equals(k0VarS2) ? new pg.n(i0Var, k0VarM) : new pg.n(i0Var, k0VarS2.c(g())));
                                            }
                                        }
                                        arrayListO = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListO = arrayList3;
                        } else {
                            lVar3 = lVarG;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j11 = j12;
                        }
                        j12 = j11 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        lVarG = lVar3;
                    }
                    lVar2 = lVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    lVar2 = lVarG;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                lVarG = lVar2;
            }
        } else {
            arrayList = null;
            arrayListO = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                pg.n nVar = (pg.n) arrayList2.get(i14);
                i0 i0Var2 = (i0) nVar.f21469a;
                k0 k0Var = (k0) nVar.f21470b;
                k0Var.f12133a = j10;
                synchronized (n.f12160c) {
                    k0Var.f12134b = i0Var2.c();
                    i0Var2.k(k0Var);
                    pg.f0 f0Var = pg.f0.f21461a;
                }
            }
        }
        if (arrayListO != null) {
            int size2 = arrayListO.size();
            for (int i15 = 0; i15 < size2; i15++) {
                m0Var.l((i0) arrayListO.get(i15));
            }
            ArrayList arrayList6 = this.f12097i;
            if (arrayList6 != null) {
                arrayListO = qg.x.O(arrayListO, arrayList6);
            }
            this.f12097i = arrayListO;
        }
        return i.b.f12125a;
    }
}
