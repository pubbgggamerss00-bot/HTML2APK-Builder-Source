package jh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements Iterator, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f15752a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15754c;

    /* renamed from: d, reason: collision with root package name */
    public long f15755d;

    public h(long j10, long j11, long j12) {
        this.f15752a = j12;
        this.f15753b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f15754c = z10;
        this.f15755d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15754c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f15755d;
        if (j10 != this.f15753b) {
            this.f15755d = this.f15752a + j10;
        } else {
            if (!this.f15754c) {
                throw new NoSuchElementException();
            }
            this.f15754c = false;
        }
        return Long.valueOf(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
