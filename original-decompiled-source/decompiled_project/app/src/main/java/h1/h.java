package h1;

import androidx.datastore.preferences.protobuf.u1;
import h1.n;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public l f12121a;

    /* renamed from: b, reason: collision with root package name */
    public long f12122b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12123c;

    /* renamed from: d, reason: collision with root package name */
    public int f12124d;

    public static final class a {
        public static h a() {
            return n.f12159b.a();
        }

        public static h b(h hVar) {
            if (hVar instanceof m0) {
                m0 m0Var = (m0) hVar;
                if (m0Var.f12157t == u1.a()) {
                    m0Var.f12155r = null;
                    return hVar;
                }
            }
            if (hVar instanceof n0) {
                n0 n0Var = (n0) hVar;
                if (n0Var.f12175h == u1.a()) {
                    n0Var.f12174g = null;
                    return hVar;
                }
            }
            h hVarH = n.h(hVar, null, false);
            hVarH.j();
            return hVarH;
        }

        public static Object c(eh.a aVar, eh.l lVar) {
            h m0Var;
            if (lVar == null) {
                return aVar.invoke();
            }
            h hVarA = n.f12159b.a();
            if (hVarA instanceof m0) {
                m0 m0Var2 = (m0) hVarA;
                if (m0Var2.f12157t == u1.a()) {
                    eh.l<Object, pg.f0> lVar2 = m0Var2.f12155r;
                    eh.l<Object, pg.f0> lVar3 = m0Var2.f12156s;
                    try {
                        ((m0) hVarA).f12155r = n.l(lVar, lVar2, true);
                        ((m0) hVarA).f12156s = lVar3;
                        return aVar.invoke();
                    } finally {
                        m0Var2.f12155r = lVar2;
                        m0Var2.f12156s = lVar3;
                    }
                }
            }
            if (hVarA == null || (hVarA instanceof c)) {
                m0Var = new m0(hVarA instanceof c ? (c) hVarA : null, lVar, null, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                m0Var = hVarA.u(lVar);
            }
            try {
                h hVarJ = m0Var.j();
                try {
                    Object objInvoke = aVar.invoke();
                    h.q(hVarJ);
                    m0Var.c();
                    return objInvoke;
                } catch (Throwable th2) {
                    h.q(hVarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                m0Var.c();
                throw th3;
            }
        }

        public static void d(h hVar, h hVar2, eh.l lVar) {
            if (hVar != hVar2) {
                hVar2.getClass();
                h.q(hVar);
                hVar2.c();
            } else if (hVar instanceof m0) {
                ((m0) hVar).f12155r = lVar;
            } else if (hVar instanceof n0) {
                ((n0) hVar).f12174g = lVar;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + hVar).toString());
            }
        }
    }

    public h(long j10, l lVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f12121a = lVar;
        this.f12122b = j10;
        n.a aVar = n.f12158a;
        if (j10 != 0) {
            l lVarD = d();
            long j11 = lVarD.f12138c;
            long[] jArr = lVarD.f12139d;
            if (jArr != null) {
                j10 = jArr[0];
            } else {
                long j12 = lVarD.f12137b;
                if (j12 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                } else {
                    long j13 = lVarD.f12136a;
                    if (j13 != 0) {
                        j11 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                    }
                }
                j10 = iNumberOfTrailingZeros + j11;
            }
            synchronized (n.f12160c) {
                iA = n.f12163f.a(j10);
            }
        } else {
            iA = -1;
        }
        this.f12124d = iA;
    }

    public static void q(h hVar) {
        n.f12159b.b(hVar);
    }

    public final void a() {
        synchronized (n.f12160c) {
            b();
            p();
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    public void b() {
        n.f12161d = n.f12161d.e(g());
    }

    public void c() {
        this.f12123c = true;
        synchronized (n.f12160c) {
            o();
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    public l d() {
        return this.f12121a;
    }

    public abstract eh.l<Object, pg.f0> e();

    public abstract boolean f();

    public long g() {
        return this.f12122b;
    }

    public int h() {
        return 0;
    }

    public abstract eh.l<Object, pg.f0> i();

    public final h j() {
        f1.i<h> iVar = n.f12159b;
        h hVarA = iVar.a();
        iVar.b(this);
        return hVarA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(i0 i0Var);

    public final void o() {
        int i10 = this.f12124d;
        if (i10 >= 0) {
            n.u(i10);
            this.f12124d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(l lVar) {
        this.f12121a = lVar;
    }

    public void s(long j10) {
        this.f12122b = j10;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract h u(eh.l<Object, pg.f0> lVar);
}
