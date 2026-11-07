package d7;

import android.net.NetworkRequest;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final String f7390b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7391a;

    static {
        String strF = t6.s.f("NetworkRequestCompat");
        kotlin.jvm.internal.r.d(strF, "tagWithPrefix(\"NetworkRequestCompat\")");
        f7390b = strF;
    }

    public o(NetworkRequest networkRequest) {
        this.f7391a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.r.a(this.f7391a, ((o) obj).f7391a);
    }

    public final int hashCode() {
        Object obj = this.f7391a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f7391a + ')';
    }
}
