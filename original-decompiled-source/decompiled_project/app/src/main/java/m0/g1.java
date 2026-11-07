package m0;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.u1 f17333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17334b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f17335c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17336d;

    public g1(i0.u1 u1Var, long j10, f1 f1Var, boolean z10) {
        this.f17333a = u1Var;
        this.f17334b = j10;
        this.f17335c = f1Var;
        this.f17336d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f17333a == g1Var.f17333a && p1.c.b(this.f17334b, g1Var.f17334b) && this.f17335c == g1Var.f17335c && this.f17336d == g1Var.f17336d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17336d) + ((this.f17335c.hashCode() + r.e2.a(this.f17333a.hashCode() * 31, 31, this.f17334b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f17333a + ", position=" + ((Object) p1.c.i(this.f17334b)) + ", anchor=" + this.f17335c + ", visible=" + this.f17336d + ')';
    }
}
