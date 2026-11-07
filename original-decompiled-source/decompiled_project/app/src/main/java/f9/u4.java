package f9;

/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10691b;

    public u4(String content, boolean z10) {
        kotlin.jvm.internal.r.e(content, "content");
        this.f10690a = content;
        this.f10691b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return kotlin.jvm.internal.r.a(this.f10690a, u4Var.f10690a) && this.f10691b == u4Var.f10691b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10691b) + (this.f10690a.hashCode() * 31);
    }

    public final String toString() {
        return "HtmlRead(content=" + this.f10690a + ", complete=" + this.f10691b + ")";
    }
}
