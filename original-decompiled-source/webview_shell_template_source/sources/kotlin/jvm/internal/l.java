package kotlin.jvm.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l implements c {
    public final Class<?> s;

    public l(Class cls) {
        j.e("jClass", cls);
        this.s = cls;
    }

    @Override // kotlin.jvm.internal.c
    public final Class<?> a() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.s, ((l) obj).s);
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return this.s.toString() + " (Kotlin reflection is not available)";
    }
}
