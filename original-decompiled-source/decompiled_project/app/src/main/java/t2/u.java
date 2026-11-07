package t2;

import r.e2;

/* loaded from: classes.dex */
public final class u {
    public final boolean equals(Object obj) {
        boolean zA = f3.t.a(0L, 0L);
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && zA && zA;
    }

    public final int hashCode() {
        f3.v[] vVarArr = f3.t.f8832b;
        return Integer.hashCode(0) + e2.a(Long.hashCode(0L) * 31, 31, 0L);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) f3.t.d(0L)) + ", height=" + ((Object) f3.t.d(0L)) + ", placeholderVerticalAlign=" + ((Object) "Invalid") + ')';
    }
}
