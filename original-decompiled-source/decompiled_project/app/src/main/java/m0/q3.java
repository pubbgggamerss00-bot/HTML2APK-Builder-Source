package m0;

/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17464a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17465b;

    public q3(long j10, long j11) {
        this.f17464a = j10;
        this.f17465b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return q1.b1.d(this.f17464a, q3Var.f17464a) && q1.b1.d(this.f17465b, q3Var.f17465b);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f17465b) + (Long.hashCode(this.f17464a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        ad.f.c(this.f17464a, ", selectionBackgroundColor=", sb);
        sb.append((Object) q1.b1.j(this.f17465b));
        sb.append(')');
        return sb.toString();
    }
}
