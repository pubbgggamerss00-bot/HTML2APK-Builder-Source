package j3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r.o2;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15102a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15103b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15104c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15105d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15106e;

    public p0(int i10, boolean z10) {
        this.f15102a = i10;
        this.f15103b = z10;
        this.f15104c = true;
        this.f15105d = true;
        this.f15106e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f15102a == p0Var.f15102a && this.f15103b == p0Var.f15103b && this.f15104c == p0Var.f15104c && this.f15105d == p0Var.f15105d && this.f15106e == p0Var.f15106e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + o2.a(o2.a(o2.a(o2.a(this.f15102a * 31, 31, this.f15103b), 31, this.f15104c), 31, this.f15105d), 31, this.f15106e);
    }

    public p0(int i10) {
        this((i10 & 1) == 0, q0.f15111a, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p0(boolean z10, q0 q0Var, boolean z11) {
        x0.m0 m0Var = k.f15087a;
        int i10 = !z10 ? 262152 : PKIFailureInfo.transactionIdInUse;
        i10 = q0Var == q0.f15112b ? i10 | 8192 : i10;
        this(z11 ? i10 : i10 | 512, q0Var == q0.f15111a);
    }
}
