package d5;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g<A, B, C> implements Serializable {
    public final A s;

    /* renamed from: t, reason: collision with root package name */
    public final B f12742t;

    /* renamed from: u, reason: collision with root package name */
    public final C f12743u;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, Object obj2, Serializable serializable) {
        this.s = obj;
        this.f12742t = obj2;
        this.f12743u = serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.j.a(this.s, gVar.s) && kotlin.jvm.internal.j.a(this.f12742t, gVar.f12742t) && kotlin.jvm.internal.j.a(this.f12743u, gVar.f12743u);
    }

    public final int hashCode() {
        A a7 = this.s;
        int iHashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f12742t;
        int iHashCode2 = (iHashCode + (b7 == null ? 0 : b7.hashCode())) * 31;
        C c7 = this.f12743u;
        return iHashCode2 + (c7 != null ? c7.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.s + ", " + this.f12742t + ", " + this.f12743u + ')';
    }
}
