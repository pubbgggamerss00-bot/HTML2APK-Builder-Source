package x0;

/* loaded from: classes.dex */
public final class u implements i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f31919a;

    public u(v vVar) {
        this.f31919a = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f31919a.equals(((u) obj).f31919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31919a.hashCode() * 31;
    }
}
