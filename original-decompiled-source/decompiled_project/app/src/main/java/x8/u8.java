package x8;

/* loaded from: classes.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33259a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33260b;

    public u8(boolean z10, boolean z11) {
        this.f33259a = z10;
        this.f33260b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return this.f33259a == u8Var.f33259a && this.f33260b == u8Var.f33260b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33260b) + (Boolean.hashCode(this.f33259a) * 31);
    }

    public final String toString() {
        return "Decision(offer=" + this.f33259a + ", rating=" + this.f33260b + ")";
    }
}
