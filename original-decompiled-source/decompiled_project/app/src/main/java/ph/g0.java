package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tg.f;
import tg.h;

/* loaded from: classes2.dex */
public abstract class g0 extends tg.a implements tg.f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21535b = new a(f.a.f28767a, new f0());

    public static final class a extends tg.b<tg.f, g0> {
    }

    public g0() {
        super(f.a.f28767a);
    }

    public abstract void D0(tg.h hVar, Runnable runnable);

    public void E0(tg.h hVar, Runnable runnable) {
        uh.g.b(this, hVar, runnable);
    }

    public boolean F0(tg.h hVar) {
        return !(this instanceof v2);
    }

    public g0 G0(int i10) {
        uh.i.a(i10);
        return new uh.h(this, i10);
    }

    @Override // tg.a, tg.h
    public final <E extends h.a> E get(h.b<E> key) {
        E e10;
        kotlin.jvm.internal.r.e(key, "key");
        if (key instanceof tg.b) {
            tg.b bVar = (tg.b) key;
            h.b<?> bVar2 = this.f28762a;
            if ((bVar2 == bVar || bVar.f28764b == bVar2) && (e10 = (E) bVar.f28763a.invoke(this)) != null) {
                return e10;
            }
        } else if (f.a.f28767a == key) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((tg.h.a) r3.f28763a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (tg.f.a.f28767a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return tg.i.f28768a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // tg.a, tg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tg.h minusKey(h.b<?> key) {
        kotlin.jvm.internal.r.e(key, "key");
        if (key instanceof tg.b) {
            tg.b bVar = (tg.b) key;
            h.b<?> bVar2 = this.f28762a;
            if (bVar2 != bVar) {
                if (bVar.f28764b != bVar2) {
                    return this;
                }
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + m0.a(this);
    }

    @Override // tg.f
    public final uh.f v0(vg.c cVar) {
        return new uh.f(this, cVar);
    }

    @Override // tg.f
    public final void y0(tg.e<?> eVar) {
        kotlin.jvm.internal.r.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        uh.f fVar = (uh.f) eVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.f.f29732h;
        while (atomicReferenceFieldUpdater.get(fVar) == uh.g.f29738b) {
        }
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null) {
            mVar.k();
        }
    }
}
