package b6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2039e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2040f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final v f2041g = new v(0, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f2042a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2044c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f2045d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2046a;

        public a(int i6) {
            this.f2046a = i6;
        }
    }

    public n(int i6, boolean z6) {
        this.f2042a = i6;
        this.f2043b = z6;
        int i7 = i6 - 1;
        this.f2044c = i7;
        this.f2045d = new AtomicReferenceArray(i6);
        if (i7 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i6 & i7) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(E e6) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2040f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return (2305843009213693952L & j6) != 0 ? 2 : 1;
            }
            int i6 = (int) (1073741823 & j6);
            int i7 = (int) ((1152921503533105152L & j6) >> 30);
            int i8 = this.f2044c;
            if (((i7 + 2) & i8) == (i6 & i8)) {
                return 1;
            }
            boolean z6 = this.f2043b;
            AtomicReferenceArray atomicReferenceArray = this.f2045d;
            if (z6 || atomicReferenceArray.get(i7 & i8) == null) {
                if (f2040f.compareAndSet(this, j6, ((-1152921503533105153L) & j6) | (((i7 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i7 & i8, e6);
                    n<E> nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f2045d;
                        int i9 = nVarC.f2044c & i7;
                        Object obj = atomicReferenceArray2.get(i9);
                        if ((obj instanceof a) && ((a) obj).f2046a == i7) {
                            atomicReferenceArray2.set(i9, e6);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i10 = this.f2042a;
                if (i10 < 1024 || ((i7 - i6) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f2040f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        n<E> nVar;
        while (true) {
            atomicLongFieldUpdater = f2040f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j7 = 1152921504606846976L | j6;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j6, j7)) {
                j6 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2039e;
            n<E> nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f2042a * 2, nVar.f2043b);
            int i6 = (int) (1073741823 & j6);
            int i7 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i8 = nVar.f2044c;
                int i9 = i6 & i8;
                if (i9 == (i8 & i7)) {
                    break;
                }
                Object aVar = nVar.f2045d.get(i9);
                if (aVar == null) {
                    aVar = new a(i6);
                }
                nVar3.f2045d.set(nVar3.f2044c & i6, aVar);
                i6++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        n<E> nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2040f;
            long j6 = atomicLongFieldUpdater.get(nVarC);
            if ((j6 & 1152921504606846976L) != 0) {
                return f2041g;
            }
            int i6 = (int) (j6 & 1073741823);
            int i7 = nVarC.f2044c;
            int i8 = i6 & i7;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i7) == i8) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVarC.f2045d;
            Object obj = atomicReferenceArray.get(i8);
            boolean z6 = nVarC.f2043b;
            if (obj == null) {
                if (z6) {
                    break;
                }
            } else {
                if (obj instanceof a) {
                    break;
                }
                long j7 = (i6 + 1) & 1073741823;
                if (f2040f.compareAndSet(nVarC, j6, (j6 & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i8, null);
                    return obj;
                }
                nVarC = this;
                if (z6) {
                    while (true) {
                        long j8 = atomicLongFieldUpdater.get(nVarC);
                        int i9 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            nVarC = nVarC.c();
                        } else {
                            n<E> nVar = nVarC;
                            if (f2040f.compareAndSet(nVar, j8, (j8 & (-1073741824)) | j7)) {
                                nVar.f2045d.set(i9 & nVar.f2044c, null);
                                nVarC = null;
                            } else {
                                nVarC = nVar;
                            }
                        }
                        if (nVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
