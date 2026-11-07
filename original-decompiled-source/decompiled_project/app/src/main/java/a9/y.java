package a9;

import java.util.List;
import r.e2;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final w1.d f366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f368c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Object> f369d;

    /* renamed from: e, reason: collision with root package name */
    public final long f370e;

    /* renamed from: f, reason: collision with root package name */
    public final long f371f;

    public y() {
        throw null;
    }

    public y(w1.d dVar, int i10, int i11, List list, long j10, long j11) {
        this.f366a = dVar;
        this.f367b = i10;
        this.f368c = i11;
        this.f369d = list;
        this.f370e = j10;
        this.f371f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.r.a(this.f366a, yVar.f366a) && this.f367b == yVar.f367b && this.f368c == yVar.f368c && kotlin.jvm.internal.r.a(this.f369d, yVar.f369d) && q1.b1.d(this.f370e, yVar.f370e) && q1.b1.d(this.f371f, yVar.f371f);
    }

    public final int hashCode() {
        int iA = a2.a.a(this.f369d, androidx.datastore.preferences.protobuf.a1.a(this.f368c, androidx.datastore.preferences.protobuf.a1.a(this.f367b, this.f366a.hashCode() * 31, 31), 31), 31);
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f371f) + e2.a(iA, 31, this.f370e);
    }

    public final String toString() {
        return "FeatureItemData(icon=" + this.f366a + ", titleRes=" + this.f367b + ", detailRes=" + this.f368c + ", detailArgs=" + this.f369d + ", tintDark=" + q1.b1.j(this.f370e) + ", tintLight=" + q1.b1.j(this.f371f) + ")";
    }
}
