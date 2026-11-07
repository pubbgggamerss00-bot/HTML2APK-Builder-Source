package f9;

/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9787a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9789c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9790d;

    public i5(String str, String label, String description, boolean z10) {
        kotlin.jvm.internal.r.e(label, "label");
        kotlin.jvm.internal.r.e(description, "description");
        this.f9787a = str;
        this.f9788b = label;
        this.f9789c = description;
        this.f9790d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return kotlin.jvm.internal.r.a(this.f9787a, i5Var.f9787a) && kotlin.jvm.internal.r.a(this.f9788b, i5Var.f9788b) && kotlin.jvm.internal.r.a(this.f9789c, i5Var.f9789c) && this.f9790d == i5Var.f9790d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9790d) + l0.k.a(l0.k.a(this.f9787a.hashCode() * 31, 31, this.f9788b), 31, this.f9789c);
    }

    public final String toString() {
        StringBuilder sbA = androidx.room.y0.a("PermissionItem(permission=", this.f9787a, ", label=", this.f9788b, ", description=");
        sbA.append(this.f9789c);
        sbA.append(", required=");
        sbA.append(this.f9790d);
        sbA.append(")");
        return sbA.toString();
    }
}
