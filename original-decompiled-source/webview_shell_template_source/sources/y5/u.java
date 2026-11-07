package y5;

import g5.e;
import g5.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class u extends g5.a implements g5.e {

    /* renamed from: t, reason: collision with root package name */
    public static final a f15373t = new a(e.a.s, t.s);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends g5.b<g5.e, u> {
    }

    public u() {
        super(e.a.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((g5.f.b) r3.s.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (g5.e.a.s == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return g5.g.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // g5.a, g5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g5.f b(f.c<?> cVar) {
        kotlin.jvm.internal.j.e("key", cVar);
        if (cVar instanceof g5.b) {
            g5.b bVar = (g5.b) cVar;
            f.c<?> cVar2 = this.s;
            if (cVar2 != bVar) {
                if (bVar.f13266t != cVar2) {
                    return this;
                }
            }
        }
    }

    @Override // g5.e
    public final b6.g m(i5.c cVar) {
        return new b6.g(this, cVar);
    }

    @Override // g5.e
    public final void q(g5.d<?> dVar) {
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", dVar);
        b6.g gVar = (b6.g) dVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.g.f2019z;
        while (atomicReferenceFieldUpdater.get(gVar) == b6.h.f2025b) {
        }
        Object obj = atomicReferenceFieldUpdater.get(gVar);
        f fVar = obj instanceof f ? (f) obj : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f.f15342z;
            j0 j0Var = (j0) atomicReferenceFieldUpdater2.get(fVar);
            if (j0Var == null) {
                return;
            }
            j0Var.d();
            atomicReferenceFieldUpdater2.set(fVar, h1.s);
        }
    }

    @Override // g5.a, g5.f
    public final <E extends f.b> E t(f.c<E> cVar) {
        E e6;
        kotlin.jvm.internal.j.e("key", cVar);
        if (cVar instanceof g5.b) {
            g5.b bVar = (g5.b) cVar;
            f.c<?> cVar2 = this.s;
            if ((cVar2 == bVar || bVar.f13266t == cVar2) && (e6 = (E) bVar.s.invoke(this)) != null) {
                return e6;
            }
        } else if (e.a.s == cVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.e(this);
    }

    public abstract void x(g5.f fVar, Runnable runnable);

    public boolean y() {
        return !(this instanceof m1);
    }
}
