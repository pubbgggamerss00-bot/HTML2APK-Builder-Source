package t0;

/* loaded from: classes.dex */
public final class ie {

    /* renamed from: a, reason: collision with root package name */
    public final float f26118a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26119b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26120c;

    public ie(float f10, float f11, float f12) {
        this.f26118a = f10;
        this.f26119b = f11;
        this.f26120c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return f3.h.a(this.f26118a, ieVar.f26118a) && f3.h.a(this.f26119b, ieVar.f26119b) && f3.h.a(this.f26120c, ieVar.f26120c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26120c) + r.z1.a(this.f26119b, Float.hashCode(this.f26118a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f10 = this.f26118a;
        sb.append((Object) f3.h.b(f10));
        sb.append(", right=");
        float f11 = this.f26119b;
        sb.append((Object) f3.h.b(f10 + f11));
        sb.append(", width=");
        sb.append((Object) f3.h.b(f11));
        sb.append(", contentWidth=");
        sb.append((Object) f3.h.b(this.f26120c));
        sb.append(')');
        return sb.toString();
    }
}
