package w5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<d<T>> f15087a;

    public a(d<? extends T> dVar) {
        this.f15087a = new AtomicReference<>(dVar);
    }

    @Override // w5.d
    public final Iterator<T> iterator() {
        d<T> andSet = this.f15087a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
