package y2;

/* loaded from: classes.dex */
public final class b0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f33679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33680b;

    public b0(int i10, int i11) {
        this.f33679a = i10;
        this.f33680b = i11;
    }

    @Override // y2.i
    public final void a(k kVar) {
        int iM = jh.j.m(this.f33679a, 0, kVar.f33737a.a());
        int iM2 = jh.j.m(this.f33680b, 0, kVar.f33737a.a());
        if (iM < iM2) {
            kVar.f(iM, iM2);
        } else {
            kVar.f(iM2, iM);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f33679a == b0Var.f33679a && this.f33680b == b0Var.f33680b;
    }

    public final int hashCode() {
        return (this.f33679a * 31) + this.f33680b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f33679a);
        sb.append(", end=");
        return b.b.a(sb, this.f33680b, ')');
    }
}
