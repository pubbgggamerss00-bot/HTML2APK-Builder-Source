package s0;

import r.z1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f24114a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24115b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24116c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24117d;

    public h(float f10, float f11, float f12, float f13) {
        this.f24114a = f10;
        this.f24115b = f11;
        this.f24116c = f12;
        this.f24117d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f24114a == hVar.f24114a && this.f24115b == hVar.f24115b && this.f24116c == hVar.f24116c && this.f24117d == hVar.f24117d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24117d) + z1.a(this.f24116c, z1.a(this.f24115b, Float.hashCode(this.f24114a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f24114a);
        sb.append(", focusedAlpha=");
        sb.append(this.f24115b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f24116c);
        sb.append(", pressedAlpha=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f24117d, ')');
    }
}
