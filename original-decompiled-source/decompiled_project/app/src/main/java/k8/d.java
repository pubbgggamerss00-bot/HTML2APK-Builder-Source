package k8;

import androidx.datastore.preferences.protobuf.a1;
import kotlin.jvm.internal.r;
import q1.b1;
import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16074c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16075d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16076e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16077f;

    /* renamed from: g, reason: collision with root package name */
    public final b1 f16078g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16079h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16080i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16081j;

    public d(String str, int i10, int i11, String str2, long j10, double d10, b1 b1Var, float f10, int i12, int i13) {
        this.f16072a = str;
        this.f16073b = i10;
        this.f16074c = i11;
        this.f16075d = str2;
        this.f16076e = j10;
        this.f16077f = d10;
        this.f16078g = b1Var;
        this.f16079h = f10;
        this.f16080i = i12;
        this.f16081j = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16072a.equals(dVar.f16072a) && this.f16073b == dVar.f16073b && this.f16074c == dVar.f16074c && this.f16075d.equals(dVar.f16075d) && this.f16076e == dVar.f16076e && Double.compare(1.15d, 1.15d) == 0 && Double.compare(this.f16077f, dVar.f16077f) == 0 && r.a(this.f16078g, dVar.f16078g) && Float.compare(this.f16079h, dVar.f16079h) == 0 && this.f16080i == dVar.f16080i && this.f16081j == dVar.f16081j;
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.f16077f) + ((Double.hashCode(1.15d) + e2.a(l0.k.a(a1.a(this.f16074c, a1.a(this.f16073b, this.f16072a.hashCode() * 31, 31), 31), 31, this.f16075d), 31, this.f16076e)) * 31)) * 31;
        b1 b1Var = this.f16078g;
        return Integer.hashCode(this.f16081j) + a1.a(this.f16080i, z1.a(this.f16079h, (iHashCode + (b1Var == null ? 0 : Long.hashCode(b1Var.f21656a))) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f16073b, "CatBreed(id=", this.f16072a, ", nameRes=", ", descRes=");
        sbA.append(this.f16074c);
        sbA.append(", icon=");
        sbA.append(this.f16075d);
        sbA.append(", baseCost=");
        sbA.append(this.f16076e);
        sbA.append(", costMultiplier=1.15, basePps=");
        sbA.append(this.f16077f);
        sbA.append(", tintColor=");
        sbA.append(this.f16078g);
        sbA.append(", sizeDp=");
        sbA.append(this.f16079h);
        sbA.append(", unlockLevel=");
        sbA.append(this.f16080i);
        sbA.append(", imageRes=");
        sbA.append(this.f16081j);
        sbA.append(")");
        return sbA.toString();
    }
}
