package i9;

import q1.b1;
import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f14277a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14278b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14279c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14280d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14281e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14282f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14283g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14284h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14285i;

    public b(float f10, float f11, float f12, long j10, float f13, float f14, float f15, float f16, int i10) {
        this.f14277a = f10;
        this.f14278b = f11;
        this.f14279c = f12;
        this.f14280d = j10;
        this.f14281e = f13;
        this.f14282f = f14;
        this.f14283g = f15;
        this.f14284h = f16;
        this.f14285i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f14277a, bVar.f14277a) == 0 && Float.compare(this.f14278b, bVar.f14278b) == 0 && Float.compare(this.f14279c, bVar.f14279c) == 0 && b1.d(this.f14280d, bVar.f14280d) && Float.compare(this.f14281e, bVar.f14281e) == 0 && Float.compare(this.f14282f, bVar.f14282f) == 0 && Float.compare(this.f14283g, bVar.f14283g) == 0 && Float.compare(this.f14284h, bVar.f14284h) == 0 && this.f14285i == bVar.f14285i;
    }

    public final int hashCode() {
        int iA = z1.a(this.f14279c, z1.a(this.f14278b, Float.hashCode(this.f14277a) * 31, 31), 31);
        int i10 = b1.f21655i;
        return Integer.hashCode(this.f14285i) + z1.a(this.f14284h, z1.a(this.f14283g, z1.a(this.f14282f, z1.a(this.f14281e, e2.a(iA, 31, this.f14280d), 31), 31), 31), 31);
    }

    public final String toString() {
        String strJ = b1.j(this.f14280d);
        StringBuilder sb = new StringBuilder("CelebrationConfetti(x=");
        sb.append(this.f14277a);
        sb.append(", y=");
        sb.append(this.f14278b);
        sb.append(", size=");
        sb.append(this.f14279c);
        sb.append(", color=");
        sb.append(strJ);
        sb.append(", speed=");
        sb.append(this.f14281e);
        sb.append(", angle=");
        sb.append(this.f14282f);
        sb.append(", rotation=");
        sb.append(this.f14283g);
        sb.append(", rotationSpeed=");
        sb.append(this.f14284h);
        sb.append(", shape=");
        return x0.a.a(sb, this.f14285i, ")");
    }
}
