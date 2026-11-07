package f9;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8990c;

    public b(int i10, int i11, String str) {
        this.f8988a = i10;
        this.f8989b = i11;
        this.f8990c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8988a == bVar.f8988a && this.f8989b == bVar.f8989b && this.f8990c.equals(bVar.f8990c);
    }

    public final int hashCode() {
        return l0.k.a(androidx.datastore.preferences.protobuf.a1.a(this.f8989b, Integer.hashCode(this.f8988a) * 31, 31), 31, this.f8990c);
    }

    public final String toString() {
        return b.o.a(p.g0.a(this.f8988a, this.f8989b, "CodeSnippet(titleRes=", ", descRes=", ", code="), this.f8990c, ", placeholder=null)");
    }
}
