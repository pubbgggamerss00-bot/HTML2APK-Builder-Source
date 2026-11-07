package qg;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f0<T> implements Iterable<e0<? extends T>>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final eh.a<Iterator<T>> f22721a;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(eh.a<? extends Iterator<? extends T>> aVar) {
        this.f22721a = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<e0<T>> iterator() {
        return new g0(this.f22721a.invoke());
    }
}
