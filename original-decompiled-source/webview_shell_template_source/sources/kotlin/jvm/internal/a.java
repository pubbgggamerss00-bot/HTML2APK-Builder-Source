package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<T> implements Iterator<T>, q5.a {
    public final T[] s;

    /* renamed from: t, reason: collision with root package name */
    public int f13550t;

    public a(T[] tArr) {
        this.s = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13550t < this.s.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.s;
            int i6 = this.f13550t;
            this.f13550t = i6 + 1;
            return tArr[i6];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f13550t--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
