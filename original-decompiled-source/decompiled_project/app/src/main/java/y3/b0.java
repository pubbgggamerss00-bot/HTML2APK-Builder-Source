package y3;

import android.graphics.Point;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33790b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f33791c;

    public b0(int i10, int i11, Point point) {
        int i12 = point.x;
        int i13 = point.y;
        this.f33789a = i10;
        this.f33790b = i11;
        this.f33791c = new Point(i12, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f33789a == b0Var.f33789a && this.f33790b == b0Var.f33790b && this.f33791c.equals(b0Var.f33791c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33791c.hashCode() + (((this.f33789a * 31) + this.f33790b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i10 = this.f33789a;
        sb.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f33790b);
        sb.append(", center=");
        sb.append(this.f33791c);
        sb.append('}');
        return sb.toString();
    }
}
