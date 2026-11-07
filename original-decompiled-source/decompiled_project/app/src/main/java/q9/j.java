package q9;

import q9.p;

/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f22560a = p.a.f22586a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22561b;

    public j(h hVar) {
        this.f22561b = hVar;
    }

    @Override // q9.p
    public final a a() {
        return this.f22561b;
    }

    @Override // q9.p
    public final p.a b() {
        return this.f22560a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        p.a aVar = this.f22560a;
        if (aVar == null) {
            if (pVar.b() != null) {
                return false;
            }
        } else if (!aVar.equals(pVar.b())) {
            return false;
        }
        h hVar = this.f22561b;
        return hVar == null ? pVar.a() == null : hVar.equals(pVar.a());
    }

    public final int hashCode() {
        p.a aVar = this.f22560a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        h hVar = this.f22561b;
        return (hVar != null ? hVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f22560a + ", androidClientInfo=" + this.f22561b + "}";
    }
}
