package qg;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q implements Iterator<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Enumeration<Object> f22747a;

    public q(Enumeration<Object> enumeration) {
        this.f22747a = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22747a.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f22747a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
