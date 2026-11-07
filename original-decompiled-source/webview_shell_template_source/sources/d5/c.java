package d5;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c<A, B> implements Serializable {
    public final A s;

    /* renamed from: t, reason: collision with root package name */
    public final B f12739t;

    public c(A a7, B b7) {
        this.s = a7;
        this.f12739t = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.j.a(this.s, cVar.s) && kotlin.jvm.internal.j.a(this.f12739t, cVar.f12739t);
    }

    public final int hashCode() {
        A a7 = this.s;
        int iHashCode = (a7 == null ? 0 : a7.hashCode()) * 31;
        B b7 = this.f12739t;
        return iHashCode + (b7 != null ? b7.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.s + ", " + this.f12739t + ')';
    }
}
