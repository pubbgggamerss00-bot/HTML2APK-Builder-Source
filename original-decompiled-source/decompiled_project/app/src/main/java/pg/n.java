package pg;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class n<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f21469a;

    /* renamed from: b, reason: collision with root package name */
    public final B f21470b;

    public n(A a10, B b10) {
        this.f21469a = a10;
        this.f21470b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.r.a(this.f21469a, nVar.f21469a) && kotlin.jvm.internal.r.a(this.f21470b, nVar.f21470b);
    }

    public final int hashCode() {
        A a10 = this.f21469a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f21470b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21469a + ", " + this.f21470b + ')';
    }
}
