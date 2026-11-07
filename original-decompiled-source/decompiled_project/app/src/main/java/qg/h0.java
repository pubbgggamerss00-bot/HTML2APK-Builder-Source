package qg;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h0 implements Iterator<Integer>, fh.a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
