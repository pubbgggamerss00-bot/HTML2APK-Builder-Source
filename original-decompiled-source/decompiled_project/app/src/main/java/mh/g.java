package mh;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f18264a;

    /* renamed from: b, reason: collision with root package name */
    public final jh.g f18265b;

    public g(String str, jh.g gVar) {
        this.f18264a = str;
        this.f18265b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.r.a(this.f18264a, gVar.f18264a) && kotlin.jvm.internal.r.a(this.f18265b, gVar.f18265b);
    }

    public final int hashCode() {
        return this.f18265b.hashCode() + (this.f18264a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f18264a + ", range=" + this.f18265b + ')';
    }
}
