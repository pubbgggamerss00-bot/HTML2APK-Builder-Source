package a9;

import r.e2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f176a;

    /* renamed from: b, reason: collision with root package name */
    public final float f177b;

    /* renamed from: c, reason: collision with root package name */
    public final float f178c;

    /* renamed from: d, reason: collision with root package name */
    public final long f179d;

    /* renamed from: e, reason: collision with root package name */
    public final float f180e;

    /* renamed from: f, reason: collision with root package name */
    public final float f181f;

    /* renamed from: g, reason: collision with root package name */
    public final float f182g;

    /* renamed from: h, reason: collision with root package name */
    public final float f183h;

    /* renamed from: i, reason: collision with root package name */
    public final int f184i;

    public d(float f10, float f11, float f12, long j10, float f13, float f14, float f15, float f16, int i10) {
        this.f176a = f10;
        this.f177b = f11;
        this.f178c = f12;
        this.f179d = j10;
        this.f180e = f13;
        this.f181f = f14;
        this.f182g = f15;
        this.f183h = f16;
        this.f184i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f176a, dVar.f176a) == 0 && Float.compare(this.f177b, dVar.f177b) == 0 && Float.compare(this.f178c, dVar.f178c) == 0 && q1.b1.d(this.f179d, dVar.f179d) && Float.compare(this.f180e, dVar.f180e) == 0 && Float.compare(this.f181f, dVar.f181f) == 0 && Float.compare(this.f182g, dVar.f182g) == 0 && Float.compare(this.f183h, dVar.f183h) == 0 && this.f184i == dVar.f184i;
    }

    public final int hashCode() {
        int iA = r.z1.a(this.f178c, r.z1.a(this.f177b, Float.hashCode(this.f176a) * 31, 31), 31);
        int i10 = q1.b1.f21655i;
        return Integer.hashCode(this.f184i) + r.z1.a(this.f183h, r.z1.a(this.f182g, r.z1.a(this.f181f, r.z1.a(this.f180e, e2.a(iA, 31, this.f179d), 31), 31), 31), 31);
    }

    public final String toString() {
        String strJ = q1.b1.j(this.f179d);
        StringBuilder sb = new StringBuilder("ConfettiParticle(x=");
        sb.append(this.f176a);
        sb.append(", y=");
        sb.append(this.f177b);
        sb.append(", size=");
        sb.append(this.f178c);
        sb.append(", color=");
        sb.append(strJ);
        sb.append(", speed=");
        sb.append(this.f180e);
        sb.append(", angle=");
        sb.append(this.f181f);
        sb.append(", rotation=");
        sb.append(this.f182g);
        sb.append(", rotationSpeed=");
        sb.append(this.f183h);
        sb.append(", shape=");
        return x0.a.a(sb, this.f184i, ")");
    }
}
