package f1;

import g8.w;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f8789a;

    public d() {
        this(0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f8789a);
        sb.append(")@");
        int iHashCode = hashCode();
        w.h(16);
        String string = Integer.toString(iHashCode, 16);
        r.d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    public d(int i10) {
        this.f8789a = 0;
    }
}
