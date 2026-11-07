package hi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f13070a = new g0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f13071b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<g0>[] f13072c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f13071b = iHighestOneBit;
        AtomicReference<g0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f13072c = atomicReferenceArr;
    }

    public static final void a(g0 segment) {
        kotlin.jvm.internal.r.e(segment, "segment");
        if (segment.f13068f != null || segment.f13069g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f13066d) {
            return;
        }
        AtomicReference<g0> atomicReference = f13072c[(int) (Thread.currentThread().getId() & (f13071b - 1))];
        g0 g0Var = f13070a;
        g0 andSet = atomicReference.getAndSet(g0Var);
        if (andSet == g0Var) {
            return;
        }
        int i10 = andSet != null ? andSet.f13065c : 0;
        if (i10 >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f13068f = andSet;
        segment.f13064b = 0;
        segment.f13065c = i10 + 8192;
        atomicReference.set(segment);
    }

    public static final g0 b() {
        AtomicReference<g0> atomicReference = f13072c[(int) (Thread.currentThread().getId() & (f13071b - 1))];
        g0 g0Var = f13070a;
        g0 andSet = atomicReference.getAndSet(g0Var);
        if (andSet == g0Var) {
            return new g0();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new g0();
        }
        atomicReference.set(andSet.f13068f);
        andSet.f13068f = null;
        andSet.f13065c = 0;
        return andSet;
    }
}
