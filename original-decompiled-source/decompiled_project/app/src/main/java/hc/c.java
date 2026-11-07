package hc;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f12974a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12975b;

    public c(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f12974a = pendingIntent;
        this.f12975b = z10;
    }

    @Override // hc.b
    public final PendingIntent a() {
        return this.f12974a;
    }

    @Override // hc.b
    public final boolean b() {
        return this.f12975b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12974a.equals(bVar.a()) && this.f12975b == bVar.b();
    }

    public final int hashCode() {
        return ((this.f12974a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12975b ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sbA = e.e.a("ReviewInfo{pendingIntent=", this.f12974a.toString(), ", isNoOp=");
        sbA.append(this.f12975b);
        sbA.append("}");
        return sbA.toString();
    }
}
