package o9;

import b.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19062a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f19062a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f19062a.equals(((b) obj).f19062a);
    }

    public final int hashCode() {
        return this.f19062a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o.a(new StringBuilder("Encoding{name=\""), this.f19062a, "\"}");
    }
}
