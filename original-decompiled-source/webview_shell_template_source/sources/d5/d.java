package d5;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d<T> implements Serializable {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Serializable {
        public final Throwable s;

        public a(Throwable th) {
            kotlin.jvm.internal.j.e("exception", th);
            this.s = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.j.a(this.s, ((a) obj).s);
            }
            return false;
        }

        public final int hashCode() {
            return this.s.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.s + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).s;
        }
        return null;
    }
}
