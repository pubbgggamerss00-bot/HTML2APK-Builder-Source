package t2;

import x0.s1;

/* loaded from: classes.dex */
public final class o0 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27871a;

    public o0(String str) {
        this.f27871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return kotlin.jvm.internal.r.a(this.f27871a, ((o0) obj).f27871a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27871a.hashCode();
    }

    public final String toString() {
        return s1.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f27871a, ')');
    }
}
