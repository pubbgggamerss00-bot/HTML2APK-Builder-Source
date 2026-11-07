package lc;

/* loaded from: classes2.dex */
public final class n<T> extends j<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f16951a;

    public n(Iterable iterable) {
        this.f16951a = iterable;
    }

    @Override // lc.j
    public final Object a(nc.k kVar) {
        return this.f16951a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f16951a.equals(((n) obj).f16951a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16951a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f16951a + ")";
    }
}
