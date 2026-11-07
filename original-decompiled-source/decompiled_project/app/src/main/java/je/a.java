package je;

import je.d;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15682c;

    /* renamed from: d, reason: collision with root package name */
    public final f f15683d;

    /* renamed from: e, reason: collision with root package name */
    public final d.a f15684e;

    public a(String str, String str2, String str3, b bVar, d.a aVar) {
        this.f15680a = str;
        this.f15681b = str2;
        this.f15682c = str3;
        this.f15683d = bVar;
        this.f15684e = aVar;
    }

    @Override // je.d
    public final f a() {
        return this.f15683d;
    }

    @Override // je.d
    public final String b() {
        return this.f15681b;
    }

    @Override // je.d
    public final String c() {
        return this.f15682c;
    }

    @Override // je.d
    public final d.a d() {
        return this.f15684e;
    }

    @Override // je.d
    public final String e() {
        return this.f15680a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f15680a;
        if (str == null) {
            if (dVar.e() != null) {
                return false;
            }
        } else if (!str.equals(dVar.e())) {
            return false;
        }
        String str2 = this.f15681b;
        if (str2 == null) {
            if (dVar.b() != null) {
                return false;
            }
        } else if (!str2.equals(dVar.b())) {
            return false;
        }
        String str3 = this.f15682c;
        if (str3 == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!str3.equals(dVar.c())) {
            return false;
        }
        f fVar = this.f15683d;
        if (fVar == null) {
            if (dVar.a() != null) {
                return false;
            }
        } else if (!fVar.equals(dVar.a())) {
            return false;
        }
        d.a aVar = this.f15684e;
        return aVar == null ? dVar.d() == null : aVar.equals(dVar.d());
    }

    public final int hashCode() {
        String str = this.f15680a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f15681b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15682c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f15683d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f15684e;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f15680a + ", fid=" + this.f15681b + ", refreshToken=" + this.f15682c + ", authToken=" + this.f15683d + ", responseCode=" + this.f15684e + "}";
    }
}
