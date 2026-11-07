package q8;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22292a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.d f22293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22296e;

    public l1(long j10, w1.d dVar, int i10, int i11, int i12) {
        this.f22292a = j10;
        this.f22293b = dVar;
        this.f22294c = i10;
        this.f22295d = i11;
        this.f22296e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return q1.b1.d(this.f22292a, l1Var.f22292a) && kotlin.jvm.internal.r.a(this.f22293b, l1Var.f22293b) && this.f22294c == l1Var.f22294c && this.f22295d == l1Var.f22295d && this.f22296e == l1Var.f22296e;
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Integer.hashCode(this.f22296e) + androidx.datastore.preferences.protobuf.a1.a(this.f22295d, androidx.datastore.preferences.protobuf.a1.a(this.f22294c, (this.f22293b.hashCode() + (Long.hashCode(this.f22292a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strJ = q1.b1.j(this.f22292a);
        StringBuilder sb = new StringBuilder("ProjectKindStyle(color=");
        sb.append(strJ);
        sb.append(", icon=");
        sb.append(this.f22293b);
        sb.append(", label=");
        sb.append(this.f22294c);
        sb.append(", limitTitle=");
        sb.append(this.f22295d);
        sb.append(", limitMessage=");
        return x0.a.a(sb, this.f22296e, ")");
    }
}
