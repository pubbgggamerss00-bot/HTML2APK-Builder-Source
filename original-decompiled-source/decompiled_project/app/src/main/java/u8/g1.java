package u8;

import r.z1;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29462a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29463b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29464c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29465d;

    public g1(long j10, float f10, float f11, String text) {
        kotlin.jvm.internal.r.e(text, "text");
        this.f29462a = j10;
        this.f29463b = f10;
        this.f29464c = f11;
        this.f29465d = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f29462a == g1Var.f29462a && Float.compare(this.f29463b, g1Var.f29463b) == 0 && Float.compare(this.f29464c, g1Var.f29464c) == 0 && kotlin.jvm.internal.r.a(this.f29465d, g1Var.f29465d);
    }

    public final int hashCode() {
        return this.f29465d.hashCode() + z1.a(this.f29464c, z1.a(this.f29463b, Long.hashCode(this.f29462a) * 31, 31), 31);
    }

    public final String toString() {
        return "TapParticle(id=" + this.f29462a + ", xPx=" + this.f29463b + ", yPx=" + this.f29464c + ", text=" + this.f29465d + ")";
    }
}
