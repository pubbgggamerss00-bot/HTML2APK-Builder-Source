package uh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ph.m0;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29752a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29753b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29754c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public /* synthetic */ class a extends kotlin.jvm.internal.y {
        @Override // kh.g
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final boolean d(l lVar, int i10) {
        while (true) {
            l lVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29753b;
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lVarE = (l) obj;
                    if (!lVarE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVarE);
                }
            }
            if (lVarE instanceof j) {
                return (((j) lVarE).f29751d & i10) == 0 && lVarE.d(lVar, i10);
            }
            atomicReferenceFieldUpdater.set(lVar, lVarE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29752a;
            atomicReferenceFieldUpdater2.set(lVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(lVarE, this, lVar)) {
                if (atomicReferenceFieldUpdater2.get(lVarE) != this) {
                    break;
                }
            }
            lVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((uh.p) r6).f29765a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l e() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29753b;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            l lVar2 = lVar;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29752a;
                    Object obj = atomicReferenceFieldUpdater2.get(lVar2);
                    if (obj == this) {
                        if (lVar == lVar2) {
                            return lVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != lVar) {
                                break;
                            }
                        }
                        return lVar2;
                    }
                    if (h()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        lVar3 = lVar2;
                        lVar2 = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar2 = (l) atomicReferenceFieldUpdater.get(lVar2);
                    }
                }
                lVar2 = lVar3;
            }
        }
    }

    public final void f(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29753b;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (f29752a.get(this) != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (h()) {
                lVar.e();
                return;
            }
            return;
        }
    }

    public final l g() {
        l lVar;
        Object obj = f29752a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (lVar = pVar.f29765a) != null) {
            return lVar;
        }
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (l) obj;
    }

    public boolean h() {
        return f29752a.get(this) instanceof p;
    }

    public String toString() {
        return new a(this, m0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + m0.a(this);
    }
}
