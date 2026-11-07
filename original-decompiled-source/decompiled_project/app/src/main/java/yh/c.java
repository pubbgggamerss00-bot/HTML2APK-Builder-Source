package yh;

import ah.p;
import eh.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pg.f0;
import ph.m;
import ph.m0;
import ph.o;
import ph.y2;
import uh.s;
import uh.v;

/* loaded from: classes2.dex */
public final class c extends g implements yh.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34407h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public final class a implements ph.k<f0>, y2 {

        /* renamed from: a, reason: collision with root package name */
        public final m<f0> f34408a;

        public a(m mVar) {
            this.f34408a = mVar;
        }

        @Override // ph.y2
        public final void b(s<?> sVar, int i10) {
            this.f34408a.b(sVar, i10);
        }

        @Override // ph.k
        public final boolean cancel(Throwable th2) {
            return this.f34408a.cancel(th2);
        }

        @Override // tg.e
        public final tg.h getContext() {
            return this.f34408a.f21567e;
        }

        @Override // ph.k
        public final v m(Object obj, q qVar) {
            final c cVar = c.this;
            q qVar2 = new q(this) { // from class: yh.b
                @Override // eh.q
                public final Object b(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f34407h;
                    c cVar2 = this.f34406a;
                    atomicReferenceFieldUpdater.set(cVar2, null);
                    cVar2.l(null);
                    return f0.f21461a;
                }
            };
            v vVarD = this.f34408a.D((f0) obj, qVar2);
            if (vVarD != null) {
                c.f34407h.set(cVar, null);
            }
            return vVarD;
        }

        @Override // ph.k
        public final void r(Object obj, q qVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f34407h;
            c cVar = c.this;
            atomicReferenceFieldUpdater.set(cVar, null);
            final di.c cVar2 = new di.c(cVar, this);
            m<f0> mVar = this.f34408a;
            mVar.A((f0) obj, mVar.f21605c, new q() { // from class: ph.l
                @Override // eh.q
                public final Object b(Object obj2, Object obj3, Object obj4) {
                    cVar2.invoke((Throwable) obj2);
                    return pg.f0.f21461a;
                }
            });
        }

        @Override // tg.e
        public final void resumeWith(Object obj) {
            this.f34408a.resumeWith(obj);
        }

        @Override // ph.k
        public final void w(Object obj) {
            this.f34408a.w(obj);
        }
    }

    public c() {
        super(1);
        this.owner$volatile = d.f34410a;
    }

    public final boolean d() {
        return Math.max(g.f34416g.get(this), 0) == 0;
    }

    public final boolean e() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f34416g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f34417a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f34407h.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0.r(pg.f0.f21461a, r3.f34418b);
     */
    @Override // yh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(vg.c cVar) throws Throwable {
        if (e()) {
            return f0.f21461a;
        }
        m mVarA = o.a(p.c(cVar));
        try {
            a aVar = new a(mVarA);
            while (true) {
                int andDecrement = g.f34416g.getAndDecrement(this);
                if (andDecrement <= this.f34417a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (c(aVar)) {
                        break;
                    }
                }
            }
            Object objO = mVarA.o();
            ug.a aVar2 = ug.a.f29706a;
            if (objO != aVar2) {
                objO = f0.f21461a;
            }
            return objO == aVar2 ? objO : f0.f21461a;
        } catch (Throwable th2) {
            mVarA.z();
            throw th2;
        }
    }

    @Override // yh.a
    public final void l(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34407h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = d.f34410a;
            if (obj2 != vVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    a();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + m0.a(this) + "[isLocked=" + d() + ",owner=" + f34407h.get(this) + ']';
    }
}
