package r;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22777a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.d f22778b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22779c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f22780a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22781b;

        /* renamed from: c, reason: collision with root package name */
        public final long f22782c;

        public a(float f10, float f11, long j10) {
            this.f22780a = f10;
            this.f22781b = f11;
            this.f22782c = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f22780a, aVar.f22780a) == 0 && Float.compare(this.f22781b, aVar.f22781b) == 0 && this.f22782c == aVar.f22782c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f22782c) + z1.a(this.f22781b, Float.hashCode(this.f22780a) * 31, 31);
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.f22780a + ", distance=" + this.f22781b + ", duration=" + this.f22782c + ')';
        }
    }

    public a2(float f10, f3.d dVar) {
        this.f22777a = f10;
        this.f22778b = dVar;
        float density = dVar.getDensity();
        float f11 = b2.f22787a;
        this.f22779c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f10) {
        double dB = b(f10);
        double d10 = b2.f22787a;
        double d11 = d10 - 1.0d;
        return new a(f10, (float) (Math.exp((d10 / d11) * dB) * this.f22777a * this.f22779c), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = r.a.f22764a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f22777a * this.f22779c));
    }
}
