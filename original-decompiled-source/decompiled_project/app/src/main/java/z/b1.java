package z;

/* loaded from: classes.dex */
public final class b1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f34467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34468b;

    public b1(u1 u1Var, int i10) {
        this.f34467a = u1Var;
        this.f34468b = i10;
    }

    @Override // z.u1
    public final int a(f3.d dVar, f3.r rVar) {
        if (((rVar == f3.r.f8828a ? 8 : 2) & this.f34468b) != 0) {
            return this.f34467a.a(dVar, rVar);
        }
        return 0;
    }

    @Override // z.u1
    public final int b(f3.d dVar) {
        if ((this.f34468b & 16) != 0) {
            return this.f34467a.b(dVar);
        }
        return 0;
    }

    @Override // z.u1
    public final int c(f3.d dVar) {
        if ((this.f34468b & 32) != 0) {
            return this.f34467a.c(dVar);
        }
        return 0;
    }

    @Override // z.u1
    public final int d(f3.d dVar, f3.r rVar) {
        if (((rVar == f3.r.f8828a ? 4 : 1) & this.f34468b) != 0) {
            return this.f34467a.d(dVar, rVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return kotlin.jvm.internal.r.a(this.f34467a, b1Var.f34467a) && this.f34468b == b1Var.f34468b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34468b) + (this.f34467a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f34467a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f34468b;
        int i11 = hf.a.f12990a;
        if ((i10 & i11) == i11) {
            hf.a.d(sb3, "Start");
        }
        int i12 = hf.a.f12992c;
        if ((i10 & i12) == i12) {
            hf.a.d(sb3, "Left");
        }
        if ((i10 & 16) == 16) {
            hf.a.d(sb3, "Top");
        }
        int i13 = hf.a.f12991b;
        if ((i10 & i13) == i13) {
            hf.a.d(sb3, "End");
        }
        int i14 = hf.a.f12993d;
        if ((i10 & i14) == i14) {
            hf.a.d(sb3, "Right");
        }
        if ((i10 & 32) == 32) {
            hf.a.d(sb3, "Bottom");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
