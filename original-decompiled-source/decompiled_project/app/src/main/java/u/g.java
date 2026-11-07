package u;

import q1.b1;
import r.e2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f28883a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28884b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28885c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28886d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28887e;

    public g(long j10, long j11, long j12, long j13, long j14) {
        this.f28883a = j10;
        this.f28884b = j11;
        this.f28885c = j12;
        this.f28886d = j13;
        this.f28887e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return b1.d(this.f28883a, gVar.f28883a) && b1.d(this.f28884b, gVar.f28884b) && b1.d(this.f28885c, gVar.f28885c) && b1.d(this.f28886d, gVar.f28886d) && b1.d(this.f28887e, gVar.f28887e);
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Long.hashCode(this.f28887e) + e2.a(e2.a(e2.a(Long.hashCode(this.f28883a) * 31, 31, this.f28884b), 31, this.f28885c), 31, this.f28886d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        ad.f.c(this.f28883a, ", textColor=", sb);
        ad.f.c(this.f28884b, ", iconColor=", sb);
        ad.f.c(this.f28885c, ", disabledTextColor=", sb);
        ad.f.c(this.f28886d, ", disabledIconColor=", sb);
        sb.append((Object) b1.j(this.f28887e));
        sb.append(')');
        return sb.toString();
    }
}
