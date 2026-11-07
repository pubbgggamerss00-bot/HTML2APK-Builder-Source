package x0;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31917a;

    public t1(String str) {
        this.f31917a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && kotlin.jvm.internal.r.a(this.f31917a, ((t1) obj).f31917a);
    }

    public final int hashCode() {
        return this.f31917a.hashCode();
    }

    public final String toString() {
        return s1.a(new StringBuilder("OpaqueKey(key="), this.f31917a, ')');
    }
}
