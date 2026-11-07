package s7;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f24580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24581b;

    /* renamed from: c, reason: collision with root package name */
    public final o f24582c;

    /* renamed from: d, reason: collision with root package name */
    public final q f24583d;

    /* renamed from: e, reason: collision with root package name */
    public final g7.j f24584e;

    public p(String str, String str2, o oVar, q qVar, g7.j jVar) {
        this.f24580a = str;
        this.f24581b = str2;
        this.f24582c = oVar;
        this.f24583d = qVar;
        this.f24584e = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.r.a(this.f24580a, pVar.f24580a) && kotlin.jvm.internal.r.a(this.f24581b, pVar.f24581b) && kotlin.jvm.internal.r.a(this.f24582c, pVar.f24582c) && kotlin.jvm.internal.r.a(this.f24583d, pVar.f24583d) && kotlin.jvm.internal.r.a(this.f24584e, pVar.f24584e);
    }

    public final int hashCode() {
        int iHashCode = (this.f24582c.f24578a.hashCode() + l0.k.a(this.f24580a.hashCode() * 31, 31, this.f24581b)) * 31;
        q qVar = this.f24583d;
        return this.f24584e.f11510a.hashCode() + ((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f24580a + ", method=" + this.f24581b + ", headers=" + this.f24582c + ", body=" + this.f24583d + ", extras=" + this.f24584e + ')';
    }
}
