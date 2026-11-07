package w;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<T> implements Iterator<T>, q5.a {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f14837t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14838u;

    public c(int i6) {
        this.s = i6;
    }

    public abstract T a(int i6);

    public abstract void b(int i6);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14837t < this.s;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.f14837t);
        this.f14837t++;
        this.f14838u = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14838u) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i6 = this.f14837t - 1;
        this.f14837t = i6;
        b(i6);
        this.s--;
        this.f14838u = false;
    }
}
