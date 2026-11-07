package y2;

import r.e2;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f33682a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33683b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.j0 f33684c;

    static {
        g1.n nVar = g1.m.f11307a;
    }

    public c0(t2.b bVar, long j10, t2.j0 j0Var) {
        t2.j0 j0Var2;
        this.f33682a = bVar;
        this.f33683b = t2.k0.b(bVar.f27761b.length(), j10);
        if (j0Var != null) {
            j0Var2 = new t2.j0(t2.k0.b(bVar.f27761b.length(), j0Var.f27839a));
        } else {
            j0Var2 = null;
        }
        this.f33684c = j0Var2;
    }

    public static c0 a(c0 c0Var, String str, long j10, int i10) {
        if ((i10 & 2) != 0) {
            j10 = c0Var.f33683b;
        }
        t2.j0 j0Var = c0Var.f33684c;
        c0Var.getClass();
        return new c0(new t2.b(str), j10, j0Var);
    }

    public static c0 b(c0 c0Var, t2.b bVar, long j10, int i10) {
        if ((i10 & 1) != 0) {
            bVar = c0Var.f33682a;
        }
        if ((i10 & 2) != 0) {
            j10 = c0Var.f33683b;
        }
        t2.j0 j0Var = (i10 & 4) != 0 ? c0Var.f33684c : null;
        c0Var.getClass();
        return new c0(bVar, j10, j0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return t2.j0.a(this.f33683b, c0Var.f33683b) && kotlin.jvm.internal.r.a(this.f33684c, c0Var.f33684c) && kotlin.jvm.internal.r.a(this.f33682a, c0Var.f33682a);
    }

    public final int hashCode() {
        int iHashCode = this.f33682a.hashCode() * 31;
        int i10 = t2.j0.f27838c;
        int iA = e2.a(iHashCode, 31, this.f33683b);
        t2.j0 j0Var = this.f33684c;
        return iA + (j0Var != null ? Long.hashCode(j0Var.f27839a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f33682a) + "', selection=" + ((Object) t2.j0.g(this.f33683b)) + ", composition=" + this.f33684c + ')';
    }

    public c0(String str, long j10, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? t2.j0.f27837b : j10, (t2.j0) null);
    }

    public c0(String str, long j10, t2.j0 j0Var) {
        this(new t2.b(str), j10, j0Var);
    }
}
