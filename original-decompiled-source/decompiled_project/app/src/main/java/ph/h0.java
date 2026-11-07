package ph;

import tg.h;

/* loaded from: classes2.dex */
public final class h0 extends tg.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21545c = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f21546b;

    public static final class a implements h.b<h0> {
    }

    public h0() {
        super(f21545c);
        this.f21546b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.r.a(this.f21546b, ((h0) obj).f21546b);
    }

    public final int hashCode() {
        return this.f21546b.hashCode();
    }

    public final String toString() {
        return x0.s1.a(new StringBuilder("CoroutineName("), this.f21546b, ')');
    }
}
