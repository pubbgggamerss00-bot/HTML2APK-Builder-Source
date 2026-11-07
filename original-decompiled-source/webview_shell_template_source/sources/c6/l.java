package c6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2249b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2250c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2251d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2252e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f2253a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final g a() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2251d;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 - f2250c.get(this) == 0) {
                return null;
            }
            int i7 = i6 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 + 1) && (andSet = this.f2253a.getAndSet(i7, null)) != null) {
                if (andSet.f2238t.a() == 1) {
                    f2252e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g b(int i6, boolean z6) {
        int i7 = i6 & 127;
        AtomicReferenceArray<g> atomicReferenceArray = this.f2253a;
        g gVar = atomicReferenceArray.get(i7);
        if (gVar != null) {
            if ((gVar.f2238t.a() == 1) == z6) {
                while (!atomicReferenceArray.compareAndSet(i7, gVar, null)) {
                    if (atomicReferenceArray.get(i7) != gVar) {
                    }
                }
                if (z6) {
                    f2252e.decrementAndGet(this);
                }
                return gVar;
            }
        }
        return null;
    }
}
