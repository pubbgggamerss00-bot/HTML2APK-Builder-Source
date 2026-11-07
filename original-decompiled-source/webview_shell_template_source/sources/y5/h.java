package y5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends z0 {

    /* renamed from: w, reason: collision with root package name */
    public final f<?> f15347w;

    public h(f<?> fVar) {
        this.f15347w = fVar;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ d5.j invoke(Throwable th) {
        j(th);
        return d5.j.f12745a;
    }

    @Override // y5.n
    public final void j(Throwable th) {
        c1 c1VarK = k();
        f<?> fVar = this.f15347w;
        fVar.getClass();
        CancellationException cancellationExceptionH = c1VarK.h();
        if (fVar.p()) {
            g5.d<?> dVar = fVar.f15343v;
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", dVar);
            b6.g gVar = (b6.g) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.g.f2019z;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                b6.v vVar = b6.h.f2025b;
                if (!kotlin.jvm.internal.j.a(obj, vVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, vVar, cancellationExceptionH)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        fVar.j(cancellationExceptionH);
        if (fVar.p()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f.f15342z;
        j0 j0Var = (j0) atomicReferenceFieldUpdater2.get(fVar);
        if (j0Var == null) {
            return;
        }
        j0Var.d();
        atomicReferenceFieldUpdater2.set(fVar, h1.s);
    }
}
