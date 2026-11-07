package jh;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i implements Iterable<Long>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f15756a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15758c;

    public i(long j10, long j11) {
        this.f15756a = j10;
        if (j10 < j11) {
            long j12 = j11 % 1;
            long j13 = j10 % 1;
            long j14 = ((j12 < 0 ? j12 + 1 : j12) - (j13 < 0 ? j13 + 1 : j13)) % 1;
            j11 -= j14 < 0 ? j14 + 1 : j14;
        }
        this.f15757b = j11;
        this.f15758c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        long j10 = this.f15756a;
        long j11 = this.f15757b;
        if (j10 > j11) {
            i iVar = (i) obj;
            if (iVar.f15756a > iVar.f15757b) {
                return true;
            }
        }
        i iVar2 = (i) obj;
        return j10 == iVar2.f15756a && j11 == iVar2.f15757b;
    }

    public final int hashCode() {
        long j10 = this.f15756a;
        long j11 = this.f15757b;
        if (j10 > j11) {
            return -1;
        }
        return (int) ((31 * (j10 ^ (j10 >>> 32))) + ((j11 >>> 32) ^ j11));
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new h(this.f15756a, this.f15757b, this.f15758c);
    }

    public final String toString() {
        return this.f15756a + ".." + this.f15757b;
    }
}
