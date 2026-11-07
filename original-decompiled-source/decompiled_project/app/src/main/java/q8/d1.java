package q8;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22164a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22166c;

    public d1(long j10, float f10, String text) {
        kotlin.jvm.internal.r.e(text, "text");
        this.f22164a = j10;
        this.f22165b = f10;
        this.f22166c = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f22164a == d1Var.f22164a && Float.compare(this.f22165b, d1Var.f22165b) == 0 && kotlin.jvm.internal.r.a(this.f22166c, d1Var.f22166c);
    }

    public final int hashCode() {
        return this.f22166c.hashCode() + r.z1.a(this.f22165b, Long.hashCode(this.f22164a) * 31, 31);
    }

    public final String toString() {
        return "MiniHeart(id=" + this.f22164a + ", xOffsetDp=" + this.f22165b + ", text=" + this.f22166c + ")";
    }
}
