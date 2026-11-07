package t2;

import t2.b;
import x0.s1;

@pg.d
/* loaded from: classes.dex */
public final class n0 implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27863a;

    public n0(String str) {
        this.f27863a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return kotlin.jvm.internal.r.a(this.f27863a, ((n0) obj).f27863a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27863a.hashCode();
    }

    public final String toString() {
        return s1.a(new StringBuilder("UrlAnnotation(url="), this.f27863a, ')');
    }
}
