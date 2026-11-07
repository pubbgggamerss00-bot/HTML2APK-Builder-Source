package e2;

import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f8341a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8342b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8344d;

    public c(float f10, float f11, int i10, long j10) {
        this.f8341a = f10;
        this.f8342b = f11;
        this.f8343c = j10;
        this.f8344d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f8341a == this.f8341a && cVar.f8342b == this.f8342b && cVar.f8343c == this.f8343c && cVar.f8344d == this.f8344d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8344d) + e2.a(z1.a(this.f8342b, Float.hashCode(this.f8341a) * 31, 31), 31, this.f8343c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f8341a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.f8342b);
        sb.append(",uptimeMillis=");
        sb.append(this.f8343c);
        sb.append(",deviceId=");
        return b.b.a(sb, this.f8344d, ')');
    }
}
