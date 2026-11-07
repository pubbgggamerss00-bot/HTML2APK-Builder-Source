package w2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14946d;

    public m0(float f6, float f7, float f8, float f9) {
        this.f14943a = f6;
        this.f14944b = f7;
        this.f14945c = f8;
        this.f14946d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Float.compare(this.f14943a, m0Var.f14943a) == 0 && Float.compare(this.f14944b, m0Var.f14944b) == 0 && Float.compare(this.f14945c, m0Var.f14945c) == 0 && Float.compare(this.f14946d, m0Var.f14946d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14946d) + ((Float.hashCode(this.f14945c) + ((Float.hashCode(this.f14944b) + (Float.hashCode(this.f14943a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Box(left=" + this.f14943a + ", top=" + this.f14944b + ", right=" + this.f14945c + ", bottom=" + this.f14946d + ")";
    }
}
