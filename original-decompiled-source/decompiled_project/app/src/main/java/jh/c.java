package jh;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.f15735a;
        char c11 = this.f15736b;
        if (r.f(c10, c11) > 0) {
            c cVar = (c) obj;
            if (r.f(cVar.f15735a, cVar.f15736b) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.f15735a && c11 == cVar2.f15736b;
    }

    public final int hashCode() {
        char c10 = this.f15735a;
        char c11 = this.f15736b;
        if (r.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f15735a + ".." + this.f15736b;
    }
}
