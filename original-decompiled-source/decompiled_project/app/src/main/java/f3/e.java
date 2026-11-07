package f3;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8812a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8813b;

    public e(float f10, float f11) {
        this.f8812a = f10;
        this.f8813b = f11;
    }

    @Override // f3.d
    public final float G0() {
        return this.f8813b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8812a, eVar.f8812a) == 0 && Float.compare(this.f8813b, eVar.f8813b) == 0;
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f8812a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8813b) + (Float.hashCode(this.f8812a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f8812a);
        sb.append(", fontScale=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f8813b, ')');
    }
}
