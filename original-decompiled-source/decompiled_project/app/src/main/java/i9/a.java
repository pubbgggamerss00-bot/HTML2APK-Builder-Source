package i9;

import r.z1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f14270a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14271b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14272c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14273d;

    public a(long j10, float f10, float f11, String emoji) {
        kotlin.jvm.internal.r.e(emoji, "emoji");
        this.f14270a = j10;
        this.f14271b = f10;
        this.f14272c = f11;
        this.f14273d = emoji;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14270a == aVar.f14270a && Float.compare(this.f14271b, aVar.f14271b) == 0 && Float.compare(this.f14272c, aVar.f14272c) == 0 && kotlin.jvm.internal.r.a(this.f14273d, aVar.f14273d);
    }

    public final int hashCode() {
        return this.f14273d.hashCode() + z1.a(this.f14272c, z1.a(this.f14271b, Long.hashCode(this.f14270a) * 31, 31), 31);
    }

    public final String toString() {
        return "CatFloatingEmoji(id=" + this.f14270a + ", startX=" + this.f14271b + ", startY=" + this.f14272c + ", emoji=" + this.f14273d + ")";
    }
}
