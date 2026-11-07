package e3;

import f3.t;
import f3.u;
import f3.v;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f8375c = new n(u.c(0), u.c(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f8376a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8377b;

    public n(long j10, long j11) {
        this.f8376a = j10;
        this.f8377b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return t.a(this.f8376a, nVar.f8376a) && t.a(this.f8377b, nVar.f8377b);
    }

    public final int hashCode() {
        v[] vVarArr = t.f8832b;
        return Long.hashCode(this.f8377b) + (Long.hashCode(this.f8376a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) t.d(this.f8376a)) + ", restLine=" + ((Object) t.d(this.f8377b)) + ')';
    }
}
