package m9;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f17959a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17960b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17962d;

    public u1(float f10, float f11, float f12, float f13) {
        this.f17959a = f10;
        this.f17960b = f11;
        this.f17961c = f12;
        this.f17962d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Float.compare(this.f17959a, u1Var.f17959a) == 0 && Float.compare(this.f17960b, u1Var.f17960b) == 0 && Float.compare(this.f17961c, u1Var.f17961c) == 0 && Float.compare(this.f17962d, u1Var.f17962d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17962d) + r.z1.a(this.f17961c, r.z1.a(this.f17960b, Float.hashCode(this.f17959a) * 31, 31), 31);
    }

    public final String toString() {
        return "Box(left=" + this.f17959a + ", top=" + this.f17960b + ", right=" + this.f17961c + ", bottom=" + this.f17962d + ")";
    }
}
