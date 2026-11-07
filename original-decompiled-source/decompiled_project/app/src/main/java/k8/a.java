package k8;

import androidx.datastore.preferences.protobuf.a1;
import r.e2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16058c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16059d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16060e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16061f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16062g;

    /* renamed from: h, reason: collision with root package name */
    public final double f16063h;

    /* renamed from: i, reason: collision with root package name */
    public final double f16064i;

    /* renamed from: j, reason: collision with root package name */
    public final double f16065j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16066k;

    public a(String str, int i10, int i11, String str2, long j10, long j11, double d10, int i12, int i13) {
        long j12 = (i13 & 64) != 0 ? 0L : j11;
        double d11 = (i13 & 128) != 0 ? 0.0d : d10;
        double d12 = (i13 & 256) != 0 ? 0.0d : 0.01d;
        double d13 = (i13 & 512) != 0 ? 0.0d : 0.5d;
        double d14 = (i13 & 1024) == 0 ? 0.05d : 0.0d;
        this.f16056a = str;
        this.f16057b = i10;
        this.f16058c = i11;
        this.f16059d = str2;
        this.f16060e = j10;
        this.f16061f = j12;
        this.f16062g = d11;
        this.f16063h = d12;
        this.f16064i = d13;
        this.f16065j = d14;
        this.f16066k = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16056a.equals(aVar.f16056a) && this.f16057b == aVar.f16057b && this.f16058c == aVar.f16058c && this.f16059d.equals(aVar.f16059d) && this.f16060e == aVar.f16060e && Double.compare(1.25d, 1.25d) == 0 && this.f16061f == aVar.f16061f && Double.compare(this.f16062g, aVar.f16062g) == 0 && Double.compare(this.f16063h, aVar.f16063h) == 0 && Double.compare(this.f16064i, aVar.f16064i) == 0 && Double.compare(this.f16065j, aVar.f16065j) == 0 && this.f16066k == aVar.f16066k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16066k) + ((Double.hashCode(this.f16065j) + ((Double.hashCode(this.f16064i) + ((Double.hashCode(this.f16063h) + ((Double.hashCode(this.f16062g) + e2.a((Double.hashCode(1.25d) + e2.a(l0.k.a(a1.a(this.f16058c, a1.a(this.f16057b, this.f16056a.hashCode() * 31, 31), 31), 31, this.f16059d), 31, this.f16060e)) * 31, 31, this.f16061f)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f16057b, "BuildingDef(id=", this.f16056a, ", nameRes=", ", descRes=");
        sbA.append(this.f16058c);
        sbA.append(", icon=");
        sbA.append(this.f16059d);
        sbA.append(", baseCost=");
        sbA.append(this.f16060e);
        sbA.append(", costMultiplier=1.25, tapBonus=");
        sbA.append(this.f16061f);
        sbA.append(", ppsMultiplier=");
        sbA.append(this.f16062g);
        sbA.append(", critBonus=");
        sbA.append(this.f16063h);
        sbA.append(", comboBonus=");
        sbA.append(this.f16064i);
        sbA.append(", eventBonus=");
        sbA.append(this.f16065j);
        sbA.append(", unlockLevel=");
        return x0.a.a(sbA, this.f16066k, ")");
    }
}
