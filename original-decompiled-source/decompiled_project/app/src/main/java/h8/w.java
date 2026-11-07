package h8;

import p5.g0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12489b;

    public w(String search, String replace) {
        kotlin.jvm.internal.r.e(search, "search");
        kotlin.jvm.internal.r.e(replace, "replace");
        this.f12488a = search;
        this.f12489b = replace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.r.a(this.f12488a, wVar.f12488a) && kotlin.jvm.internal.r.a(this.f12489b, wVar.f12489b);
    }

    public final int hashCode() {
        return this.f12489b.hashCode() + (this.f12488a.hashCode() * 31);
    }

    public final String toString() {
        return g0.a("EditBlock(search=", this.f12488a, ", replace=", this.f12489b, ")");
    }
}
