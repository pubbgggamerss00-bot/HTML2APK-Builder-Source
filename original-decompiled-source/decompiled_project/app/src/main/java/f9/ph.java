package f9;

/* loaded from: classes.dex */
public final class ph {

    /* renamed from: a, reason: collision with root package name */
    public final String f10256a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10258c;

    public ph(int i10, String str, String str2) {
        this.f10256a = str;
        this.f10257b = str2;
        this.f10258c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return kotlin.jvm.internal.r.a(this.f10256a, phVar.f10256a) && kotlin.jvm.internal.r.a(this.f10257b, phVar.f10257b) && this.f10258c == phVar.f10258c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10258c) + l0.k.a(this.f10256a.hashCode() * 31, 31, this.f10257b);
    }

    public final String toString() {
        return x0.a.a(androidx.room.y0.a("QuickInsert(label=", this.f10256a, ", code=", this.f10257b, ", caret="), this.f10258c, ")");
    }
}
