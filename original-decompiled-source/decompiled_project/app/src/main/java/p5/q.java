package p5;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final y0<Object> f21257a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21258b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21259c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public g1 f21260a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21261b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21262c;
    }

    public q(y0 y0Var, Object obj, boolean z10) {
        if (z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + y0Var.b() + " has null value but is not nullable.").toString());
        }
        this.f21257a = y0Var;
        this.f21259c = obj;
        this.f21258b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = qVar.f21259c;
        if (this.f21258b != qVar.f21258b || !this.f21257a.equals(qVar.f21257a)) {
            return false;
        }
        Object obj3 = this.f21259c;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.f21257a.hashCode() * 961) + (this.f21258b ? 1 : 0)) * 31;
        Object obj = this.f21259c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kotlin.jvm.internal.h0.a(q.class).e());
        sb.append(" Type: " + this.f21257a);
        sb.append(" Nullable: false");
        if (this.f21258b) {
            sb.append(" DefaultValue: " + this.f21259c);
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
