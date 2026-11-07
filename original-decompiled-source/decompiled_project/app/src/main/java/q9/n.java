package q9;

import q9.s;

/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: a, reason: collision with root package name */
    public final s.b f22584a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f22585b;

    public n(s.b bVar, s.a aVar) {
        this.f22584a = bVar;
        this.f22585b = aVar;
    }

    @Override // q9.s
    public final s.a a() {
        return this.f22585b;
    }

    @Override // q9.s
    public final s.b b() {
        return this.f22584a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        s.b bVar = this.f22584a;
        if (bVar == null) {
            if (sVar.b() != null) {
                return false;
            }
        } else if (!bVar.equals(sVar.b())) {
            return false;
        }
        s.a aVar = this.f22585b;
        return aVar == null ? sVar.a() == null : aVar.equals(sVar.a());
    }

    public final int hashCode() {
        s.b bVar = this.f22584a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        s.a aVar = this.f22585b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f22584a + ", mobileSubtype=" + this.f22585b + "}";
    }
}
