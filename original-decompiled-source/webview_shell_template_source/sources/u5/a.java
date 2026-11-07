package u5;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a implements Iterable<Integer>, q5.a {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14720t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14721u;

    public a(int i6, int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.s = i6;
        if (i8 > 0) {
            if (i6 < i7) {
                int i9 = i7 % i8;
                int i10 = i6 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i7 -= i11 < 0 ? i11 + i8 : i11;
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i6 > i7) {
                int i12 = -i8;
                int i13 = i6 % i12;
                int i14 = i7 % i12;
                int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                i7 += i15 < 0 ? i15 + i12 : i15;
            }
        }
        this.f14720t = i7;
        this.f14721u = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.s == aVar.s && this.f14720t == aVar.f14720t && this.f14721u == aVar.f14721u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.s * 31) + this.f14720t) * 31) + this.f14721u;
    }

    public boolean isEmpty() {
        int i6 = this.f14721u;
        int i7 = this.f14720t;
        int i8 = this.s;
        return i6 > 0 ? i8 > i7 : i8 < i7;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new b(this.s, this.f14720t, this.f14721u);
    }

    public String toString() {
        StringBuilder sb;
        int i6 = this.f14720t;
        int i7 = this.s;
        int i8 = this.f14721u;
        if (i8 > 0) {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append("..");
            sb.append(i6);
            sb.append(" step ");
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append(" downTo ");
            sb.append(i6);
            sb.append(" step ");
            sb.append(-i8);
        }
        return sb.toString();
    }
}
