package rh;

import kotlin.jvm.internal.h0;
import pg.f0;
import ph.y2;
import rh.l;

/* loaded from: classes2.dex */
public final class p<E> extends c<E> {

    /* renamed from: l, reason: collision with root package name */
    public final a f23630l;

    public p(int i10, a aVar) {
        super(i10);
        this.f23630l = aVar;
        if (aVar != a.f23576a) {
            if (i10 < 1) {
                throw new IllegalArgumentException(ad.b.b(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + h0.a(c.class).e() + " instead").toString());
        }
    }

    public final Object M(E e10, boolean z10) {
        m mVar;
        p<E> pVar;
        E e11;
        if (this.f23630l == a.f23578c) {
            Object objG = super.g(e10);
            return (!(objG instanceof l.b) || (objG instanceof l.a)) ? objG : f0.f21461a;
        }
        Object obj = g.f23605d;
        m mVar2 = (m) c.f23584f.get(this);
        while (true) {
            long andIncrement = c.f23580b.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zX = x(andIncrement, false);
            int i10 = g.f23603b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (mVar2.f29768c != j12) {
                m mVarI = c.i(this, j12, mVar2);
                if (mVarI != null) {
                    mVar = mVarI;
                    e11 = e10;
                    pVar = this;
                } else if (zX) {
                    return new l.a(u());
                }
            } else {
                mVar = mVar2;
                pVar = this;
                e11 = e10;
            }
            int iK = c.k(pVar, mVar, i11, e11, j10, obj, zX);
            mVar2 = mVar;
            if (iK == 0) {
                mVar2.a();
                return f0.f21461a;
            }
            if (iK == 1) {
                return f0.f21461a;
            }
            if (iK == 2) {
                if (zX) {
                    mVar2.i();
                    return new l.a(u());
                }
                y2 y2Var = obj instanceof y2 ? (y2) obj : null;
                if (y2Var != null) {
                    y2Var.b(mVar2, i11 + i10);
                }
                p((mVar2.f29768c * j11) + i11);
                return f0.f21461a;
            }
            if (iK == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iK == 4) {
                if (j10 < c.f23581c.get(this)) {
                    mVar2.a();
                }
                return new l.a(u());
            }
            if (iK == 5) {
                mVar2.a();
            }
            e10 = e11;
        }
    }

    @Override // rh.c, rh.x
    public final Object d(E e10, tg.e<? super f0> eVar) throws Throwable {
        if (M(e10, true) instanceof l.a) {
            throw u();
        }
        return f0.f21461a;
    }

    @Override // rh.c, rh.x
    public final Object g(E e10) {
        return M(e10, false);
    }

    @Override // rh.c
    public final boolean z() {
        return this.f23630l == a.f23577b;
    }
}
