package j7;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final g7.l f15225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15226b;

    public g(g7.l lVar, boolean z10) {
        this.f15225a = lVar;
        this.f15226b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.r.a(this.f15225a, gVar.f15225a) && this.f15226b == gVar.f15226b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15226b) + (this.f15225a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.f15225a + ", isSampled=" + this.f15226b + ')';
    }
}
