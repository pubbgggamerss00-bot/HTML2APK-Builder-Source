package r9;

import ae.y;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f23286a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23287b = "PLAY_BILLING_LIBRARY";

    /* renamed from: c, reason: collision with root package name */
    public final o9.a f23288c;

    /* renamed from: d, reason: collision with root package name */
    public final y f23289d;

    /* renamed from: e, reason: collision with root package name */
    public final o9.b f23290e;

    public i(j jVar, o9.a aVar, y yVar, o9.b bVar) {
        this.f23286a = jVar;
        this.f23288c = aVar;
        this.f23289d = yVar;
        this.f23290e = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23286a.equals(iVar.f23286a) && this.f23287b.equals(iVar.f23287b) && this.f23288c.equals(iVar.f23288c) && this.f23289d.equals(iVar.f23289d) && this.f23290e.equals(iVar.f23290e);
    }

    public final int hashCode() {
        return ((((((((this.f23286a.hashCode() ^ 1000003) * 1000003) ^ this.f23287b.hashCode()) * 1000003) ^ this.f23288c.hashCode()) * 1000003) ^ this.f23289d.hashCode()) * 1000003) ^ this.f23290e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f23286a + ", transportName=" + this.f23287b + ", event=" + this.f23288c + ", transformer=" + this.f23289d + ", encoding=" + this.f23290e + "}";
    }
}
