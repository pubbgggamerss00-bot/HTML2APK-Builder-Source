package jh;

import b6.n;

/* loaded from: classes2.dex */
public class e implements Iterable<Integer>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15746c;

    public e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f15744a = i10;
        this.f15745b = n.d(i10, i11, i12);
        this.f15746c = i12;
    }

    @Override // java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f iterator() {
        return new f(this.f15744a, this.f15745b, this.f15746c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f15744a == eVar.f15744a && this.f15745b == eVar.f15745b && this.f15746c == eVar.f15746c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15744a * 31) + this.f15745b) * 31) + this.f15746c;
    }

    public boolean isEmpty() {
        int i10 = this.f15746c;
        int i11 = this.f15745b;
        int i12 = this.f15744a;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f15745b;
        int i11 = this.f15744a;
        int i12 = this.f15746c;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
