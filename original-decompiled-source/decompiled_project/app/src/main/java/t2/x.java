package t2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f27889a;

    /* renamed from: b, reason: collision with root package name */
    public final v f27890b;

    public x(w wVar, v vVar) {
        this.f27889a = wVar;
        this.f27890b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.r.a(this.f27890b, xVar.f27890b) && kotlin.jvm.internal.r.a(this.f27889a, xVar.f27889a);
    }

    public final int hashCode() {
        w wVar = this.f27889a;
        int iHashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        v vVar = this.f27890b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f27889a + ", paragraphSyle=" + this.f27890b + ')';
    }
}
