package x0;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f31952a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31953b;

    public w0(Integer num, Object obj) {
        this.f31952a = num;
        this.f31953b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f31952a.equals(w0Var.f31952a) && kotlin.jvm.internal.r.a(this.f31953b, w0Var.f31953b);
    }

    public final int hashCode() {
        int iHashCode = this.f31952a.hashCode() * 31;
        Object obj = this.f31953b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f31952a + ", right=" + this.f31953b + ')';
    }
}
