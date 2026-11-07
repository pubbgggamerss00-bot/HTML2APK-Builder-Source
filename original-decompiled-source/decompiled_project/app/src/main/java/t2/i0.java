package t2;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f27829a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f27830b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f27831c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f27832d;

    public i0() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.r.a(this.f27829a, i0Var.f27829a) && kotlin.jvm.internal.r.a(this.f27830b, i0Var.f27830b) && kotlin.jvm.internal.r.a(this.f27831c, i0Var.f27831c) && kotlin.jvm.internal.r.a(this.f27832d, i0Var.f27832d);
    }

    public final int hashCode() {
        b0 b0Var = this.f27829a;
        int iHashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
        b0 b0Var2 = this.f27830b;
        int iHashCode2 = (iHashCode + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31;
        b0 b0Var3 = this.f27831c;
        int iHashCode3 = (iHashCode2 + (b0Var3 != null ? b0Var3.hashCode() : 0)) * 31;
        b0 b0Var4 = this.f27832d;
        return iHashCode3 + (b0Var4 != null ? b0Var4.hashCode() : 0);
    }

    public i0(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.f27829a = b0Var;
        this.f27830b = b0Var2;
        this.f27831c = b0Var3;
        this.f27832d = b0Var4;
    }

    public /* synthetic */ i0(b0 b0Var, int i10) {
        this((i10 & 1) != 0 ? null : b0Var, null, null, null);
    }
}
