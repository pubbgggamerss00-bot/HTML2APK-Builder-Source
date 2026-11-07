package b6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y5.b0;
import y5.b1;
import y5.g1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2034t = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2035u = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends b6.b<l> {

        /* renamed from: b, reason: collision with root package name */
        public final b1 f2036b;

        /* renamed from: c, reason: collision with root package name */
        public g1 f2037c;

        public a(b1 b1Var) {
            this.f2036b = b1Var;
        }

        @Override // b6.b
        public final void b(l lVar, Object obj) {
            l lVar2 = lVar;
            boolean z6 = obj == null;
            b1 b1Var = this.f2036b;
            Object obj2 = z6 ? b1Var : this.f2037c;
            if (obj2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.s;
                while (!atomicReferenceFieldUpdater.compareAndSet(lVar2, this, obj2)) {
                    if (atomicReferenceFieldUpdater.get(lVar2) != this) {
                        return;
                    }
                }
                if (z6) {
                    g1 g1Var = this.f2037c;
                    kotlin.jvm.internal.j.b(g1Var);
                    b1Var.f(g1Var);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public /* synthetic */ class b extends kotlin.jvm.internal.m {
        public final String b() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((b6.r) r6).f2048a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l e() {
        l lVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2034t;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            lVar = lVar2;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
                    Object obj = atomicReferenceFieldUpdater2.get(lVar);
                    if (obj == this) {
                        if (lVar2 != lVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != lVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof q) {
                        ((q) obj).a(lVar);
                        break;
                    }
                    if (!(obj instanceof r)) {
                        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", obj);
                        lVar3 = lVar;
                        lVar = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar = (l) atomicReferenceFieldUpdater.get(lVar);
                    }
                }
                lVar = lVar3;
            }
        }
        return lVar;
    }

    public final void f(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2034t;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (g() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (i()) {
                lVar.e();
                return;
            }
            return;
        }
    }

    public final Object g() {
        while (true) {
            Object obj = s.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final l h() {
        l lVar;
        Object objG = g();
        r rVar = objG instanceof r ? (r) objG : null;
        if (rVar != null && (lVar = rVar.f2048a) != null) {
            return lVar;
        }
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objG);
        return (l) objG;
    }

    public boolean i() {
        return g() instanceof r;
    }

    public String toString() {
        return new b(this) + '@' + b0.e(this);
    }
}
