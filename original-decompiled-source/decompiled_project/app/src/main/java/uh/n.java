package uh;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29756e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f29757f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final v f29758g = new v("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f29759a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f29762d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29763a;

        public a(int i10) {
            this.f29763a = i10;
        }
    }

    public n(int i10, boolean z10) {
        this.f29759a = i10;
        this.f29760b = z10;
        int i11 = i10 - 1;
        this.f29761c = i11;
        this.f29762d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(E e10) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29757f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f29761c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.f29760b;
            AtomicReferenceArray atomicReferenceArray = this.f29762d;
            if (z10 || atomicReferenceArray.get(i11 & i12) == null) {
                if (f29757f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i11 & i12, e10);
                    n<E> nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f29762d;
                        int i13 = nVarC.f29761c & i11;
                        Object obj = atomicReferenceArray2.get(i13);
                        if ((obj instanceof a) && ((a) obj).f29763a == i11) {
                            atomicReferenceArray2.set(i13, e10);
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
                int i14 = this.f29759a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f29757f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        n<E> nVar;
        while (true) {
            atomicLongFieldUpdater = f29757f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29756e;
            n<E> nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f29759a * 2, nVar.f29760b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = nVar.f29761c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object aVar = nVar.f29762d.get(i13);
                if (aVar == null) {
                    aVar = new a(i10);
                }
                nVar3.f29762d.set(nVar3.f29761c & i10, aVar);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29757f;
            long j10 = atomicLongFieldUpdater.get(nVarC);
            if ((j10 & 1152921504606846976L) != 0) {
                return f29758g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = nVarC.f29761c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVarC.f29762d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = nVarC.f29760b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof a) {
                    break;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (f29757f.compareAndSet(nVarC, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                nVarC = this;
                if (z10) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(nVarC);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            nVarC = nVarC.c();
                        } else {
                            n<E> nVar = nVarC;
                            if (f29757f.compareAndSet(nVar, j12, (j12 & (-1073741824)) | j11)) {
                                nVar.f29762d.set(i13 & nVar.f29761c, null);
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
