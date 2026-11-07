package f3;

import r.z1;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8814a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8815b;

    /* renamed from: c, reason: collision with root package name */
    public final g3.a f8816c;

    public g(float f10, float f11, g3.a aVar) {
        this.f8814a = f10;
        this.f8815b = f11;
        this.f8816c = aVar;
    }

    @Override // f3.d
    public final float G0() {
        return this.f8815b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f8814a, gVar.f8814a) == 0 && Float.compare(this.f8815b, gVar.f8815b) == 0 && kotlin.jvm.internal.r.a(this.f8816c, gVar.f8816c);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f8814a;
    }

    public final int hashCode() {
        return this.f8816c.hashCode() + z1.a(this.f8815b, Float.hashCode(this.f8814a) * 31, 31);
    }

    @Override // f3.d
    public final long o(float f10) {
        return u.e(this.f8816c.a(f10), 4294967296L);
    }

    @Override // f3.d
    public final float q(long j10) {
        if (v.a(t.b(j10), 4294967296L)) {
            return this.f8816c.b(t.c(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f8814a + ", fontScale=" + this.f8815b + ", converter=" + this.f8816c + ')';
    }
}
