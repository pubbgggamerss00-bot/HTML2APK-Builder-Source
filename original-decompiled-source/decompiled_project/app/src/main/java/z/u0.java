package z;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f34640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34641b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34642c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34643d;

    public u0(int i10, int i11, int i12, int i13) {
        this.f34640a = i10;
        this.f34641b = i11;
        this.f34642c = i12;
        this.f34643d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f34640a == u0Var.f34640a && this.f34641b == u0Var.f34641b && this.f34642c == u0Var.f34642c && this.f34643d == u0Var.f34643d;
    }

    public final int hashCode() {
        return (((((this.f34640a * 31) + this.f34641b) * 31) + this.f34642c) * 31) + this.f34643d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f34640a);
        sb.append(", top=");
        sb.append(this.f34641b);
        sb.append(", right=");
        sb.append(this.f34642c);
        sb.append(", bottom=");
        return b.b.a(sb, this.f34643d, ')');
    }
}
