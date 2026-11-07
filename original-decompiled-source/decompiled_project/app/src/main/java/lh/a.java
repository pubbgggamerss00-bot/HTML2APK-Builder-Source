package lh;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<T>> f17057a;

    public a(g<? extends T> gVar) {
        this.f17057a = new AtomicReference<>(gVar);
    }

    @Override // lh.g
    public final Iterator<T> iterator() {
        g<T> andSet = this.f17057a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
