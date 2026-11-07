package pg;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t<A, B, C> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f21479a;

    /* renamed from: b, reason: collision with root package name */
    public final B f21480b;

    /* renamed from: c, reason: collision with root package name */
    public final C f21481c;

    public t(A a10, B b10, C c10) {
        this.f21479a = a10;
        this.f21480b = b10;
        this.f21481c = c10;
    }

    public final A a() {
        return this.f21479a;
    }

    public final B b() {
        return this.f21480b;
    }

    public final C c() {
        return this.f21481c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.r.a(this.f21479a, tVar.f21479a) && kotlin.jvm.internal.r.a(this.f21480b, tVar.f21480b) && kotlin.jvm.internal.r.a(this.f21481c, tVar.f21481c);
    }

    public final int hashCode() {
        A a10 = this.f21479a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f21480b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f21481c;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21479a + ", " + this.f21480b + ", " + this.f21481c + ')';
    }
}
