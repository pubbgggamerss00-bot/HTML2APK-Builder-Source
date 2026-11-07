package wh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31578b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31579c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31580d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31581e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f31582a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final g a(g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31579c;
        if (atomicIntegerFieldUpdater.get(this) - f31580d.get(this) == 127) {
            return gVar;
        }
        if (gVar.f31569b) {
            f31581e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & CertificateBody.profileType;
        while (true) {
            AtomicReferenceArray<g> atomicReferenceArray = this.f31582a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, gVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final g b() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31580d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f31579c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & CertificateBody.profileType;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f31582a.getAndSet(i11, null)) != null) {
                if (andSet.f31569b) {
                    f31581e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g c(int i10, boolean z10) {
        int i11 = i10 & CertificateBody.profileType;
        AtomicReferenceArray<g> atomicReferenceArray = this.f31582a;
        g gVar = atomicReferenceArray.get(i11);
        if (gVar != null && gVar.f31569b == z10) {
            while (!atomicReferenceArray.compareAndSet(i11, gVar, null)) {
                if (atomicReferenceArray.get(i11) != gVar) {
                }
            }
            if (z10) {
                f31581e.decrementAndGet(this);
            }
            return gVar;
        }
        return null;
    }
}
