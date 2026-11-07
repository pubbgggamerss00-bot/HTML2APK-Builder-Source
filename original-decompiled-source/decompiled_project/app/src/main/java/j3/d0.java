package j3;

import r.o2;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15045a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15046b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f15047c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15048d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15049e;

    public d0(int i10) {
        boolean z10 = (i10 & 4) != 0;
        q0 q0Var = q0.f15111a;
        this.f15045a = true;
        this.f15046b = true;
        this.f15047c = q0Var;
        this.f15048d = z10;
        this.f15049e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f15045a == d0Var.f15045a && this.f15046b == d0Var.f15046b && this.f15047c == d0Var.f15047c && this.f15048d == d0Var.f15048d && this.f15049e == d0Var.f15049e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15049e) + o2.a((this.f15047c.hashCode() + o2.a(Boolean.hashCode(this.f15045a) * 31, 31, this.f15046b)) * 31, 31, this.f15048d);
    }
}
