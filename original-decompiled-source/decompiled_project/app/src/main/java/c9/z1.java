package c9;

/* loaded from: classes.dex */
public final class z1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5332a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5335d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5337f;

    public z1(float f10, float f11, String text, int i10, float f12, int i11) {
        kotlin.jvm.internal.r.e(text, "text");
        this.f5332a = f10;
        this.f5333b = f11;
        this.f5334c = text;
        this.f5335d = i10;
        this.f5336e = f12;
        this.f5337f = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Float.compare(this.f5332a, z1Var.f5332a) == 0 && Float.compare(this.f5333b, z1Var.f5333b) == 0 && kotlin.jvm.internal.r.a(this.f5334c, z1Var.f5334c) && this.f5335d == z1Var.f5335d && Float.compare(this.f5336e, z1Var.f5336e) == 0 && this.f5337f == z1Var.f5337f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5337f) + r.z1.a(this.f5336e, androidx.datastore.preferences.protobuf.a1.a(this.f5335d, l0.k.a(r.z1.a(this.f5333b, Float.hashCode(this.f5332a) * 31, 31), 31, this.f5334c), 31), 31);
    }

    public final String toString() {
        return "TextMark(x=" + this.f5332a + ", y=" + this.f5333b + ", text=" + this.f5334c + ", color=" + this.f5335d + ", size=" + this.f5336e + ", angle=" + this.f5337f + ")";
    }
}
