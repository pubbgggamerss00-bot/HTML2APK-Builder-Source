package k8;

import androidx.datastore.preferences.protobuf.a1;
import r.e2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16161d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16162e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16163f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16164g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16165h;

    public m(String str, int i10, int i11, String str2, long j10, double d10, double d11, int i12) {
        this.f16158a = str;
        this.f16159b = i10;
        this.f16160c = i11;
        this.f16161d = str2;
        this.f16162e = j10;
        this.f16163f = d10;
        this.f16164g = d11;
        this.f16165h = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f16158a.equals(mVar.f16158a) && this.f16159b == mVar.f16159b && this.f16160c == mVar.f16160c && this.f16161d.equals(mVar.f16161d) && this.f16162e == mVar.f16162e && Double.compare(1.18d, 1.18d) == 0 && Double.compare(this.f16163f, mVar.f16163f) == 0 && Double.compare(this.f16164g, mVar.f16164g) == 0 && this.f16165h == mVar.f16165h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16165h) + ((Double.hashCode(this.f16164g) + ((Double.hashCode(this.f16163f) + ((Double.hashCode(1.18d) + e2.a(l0.k.a(a1.a(this.f16160c, a1.a(this.f16159b, this.f16158a.hashCode() * 31, 31), 31), 31, this.f16161d), 31, this.f16162e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f16159b, "WorkerDef(id=", this.f16158a, ", nameRes=", ", descRes=");
        sbA.append(this.f16160c);
        sbA.append(", icon=");
        sbA.append(this.f16161d);
        sbA.append(", baseCost=");
        sbA.append(this.f16162e);
        sbA.append(", costMultiplier=1.18, basePps=");
        sbA.append(this.f16163f);
        sbA.append(", heartChance=");
        sbA.append(this.f16164g);
        sbA.append(", unlockLevel=");
        sbA.append(this.f16165h);
        sbA.append(")");
        return sbA.toString();
    }
}
