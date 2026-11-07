package q1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class p0 extends c1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f21723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21724c;

    /* JADX WARN: Illegal instructions before constructor call */
    public p0(int i10, long j10) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            r0.a();
            porterDuffColorFilter = q0.a(c2.n0.j(j10), a0.a(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c2.n0.j(j10), a0.b(i10));
        }
        super(porterDuffColorFilter);
        this.f21723b = j10;
        this.f21724c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return b1.d(this.f21723b, p0Var.f21723b) && this.f21724c == p0Var.f21724c;
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Integer.hashCode(this.f21724c) + (Long.hashCode(this.f21723b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        ad.f.c(this.f21723b, ", blendMode=", sb);
        int i10 = this.f21724c;
        sb.append((Object) (i10 == 0 ? "Clear" : i10 == 1 ? "Src" : i10 == 2 ? "Dst" : i10 == 3 ? "SrcOver" : i10 == 4 ? "DstOver" : i10 == 5 ? "SrcIn" : i10 == 6 ? "DstIn" : i10 == 7 ? "SrcOut" : i10 == 8 ? "DstOut" : i10 == 9 ? "SrcAtop" : i10 == 10 ? "DstAtop" : i10 == 11 ? "Xor" : i10 == 12 ? "Plus" : i10 == 13 ? "Modulate" : i10 == 14 ? "Screen" : i10 == 15 ? "Overlay" : i10 == 16 ? "Darken" : i10 == 17 ? "Lighten" : i10 == 18 ? "ColorDodge" : i10 == 19 ? "ColorBurn" : i10 == 20 ? "HardLight" : i10 == 21 ? "Softlight" : i10 == 22 ? "Difference" : i10 == 23 ? "Exclusion" : i10 == 24 ? "Multiply" : i10 == 25 ? "Hue" : i10 == 26 ? "Saturation" : i10 == 27 ? "Color" : i10 == 28 ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
