package e1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f8338a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8338a == ((a) obj).f8338a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8338a);
    }

    public final String toString() {
        return b.b.a(new StringBuilder("DeltaCounter(count="), this.f8338a, ')');
    }
}
