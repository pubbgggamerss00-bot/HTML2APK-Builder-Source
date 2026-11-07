package t;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public q1.e0 f25289a = null;

    /* renamed from: b, reason: collision with root package name */
    public q1.b0 f25290b = null;

    /* renamed from: c, reason: collision with root package name */
    public s1.a f25291c = null;

    /* renamed from: d, reason: collision with root package name */
    public q1.j0 f25292d = null;

    public l(int i10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.r.a(this.f25289a, lVar.f25289a) && kotlin.jvm.internal.r.a(this.f25290b, lVar.f25290b) && kotlin.jvm.internal.r.a(this.f25291c, lVar.f25291c) && kotlin.jvm.internal.r.a(this.f25292d, lVar.f25292d);
    }

    public final int hashCode() {
        q1.e0 e0Var = this.f25289a;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        q1.b0 b0Var = this.f25290b;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        s1.a aVar = this.f25291c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        q1.j0 j0Var = this.f25292d;
        return iHashCode3 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f25289a + ", canvas=" + this.f25290b + ", canvasDrawScope=" + this.f25291c + ", borderPath=" + this.f25292d + ')';
    }
}
