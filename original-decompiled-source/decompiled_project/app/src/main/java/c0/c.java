package c0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4355a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f4355a == ((c) obj).f4355a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4355a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f4355a + ')';
    }
}
