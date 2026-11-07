package j1;

import f3.r;
import j1.d;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14619a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14620b;

    public static final class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f14621a;

        public a(float f10) {
            this.f14621a = f10;
        }

        @Override // j1.d.b
        public final int a(int i10, int i11, r rVar) {
            float f10 = (i11 - i10) / 2.0f;
            r rVar2 = r.f8828a;
            float f11 = this.f14621a;
            if (rVar != rVar2) {
                f11 *= -1;
            }
            return org.bouncycastle.asn1.x509.a.a(1, f11, f10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f14621a, ((a) obj).f14621a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14621a);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("Horizontal(bias="), this.f14621a, ')');
        }
    }

    public static final class b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final float f14622a;

        public b(float f10) {
            this.f14622a = f10;
        }

        @Override // j1.d.c
        public final int a(int i10, int i11) {
            return org.bouncycastle.asn1.x509.a.a(1, this.f14622a, (i11 - i10) / 2.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f14622a, ((b) obj).f14622a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14622a);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("Vertical(bias="), this.f14622a, ')');
        }
    }

    public f(float f10, float f11) {
        this.f14619a = f10;
        this.f14620b = f11;
    }

    @Override // j1.d
    public final long a(long j10, long j11, r rVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & BodyPartID.bodyIdMax)) - ((int) (j10 & BodyPartID.bodyIdMax))) / 2.0f;
        r rVar2 = r.f8828a;
        float f12 = this.f14619a;
        if (rVar != rVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f14620b) * f11;
        return (Math.round(f15) & BodyPartID.bodyIdMax) | (Math.round(f14) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f14619a, fVar.f14619a) == 0 && Float.compare(this.f14620b, fVar.f14620b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14620b) + (Float.hashCode(this.f14619a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f14619a);
        sb.append(", verticalBias=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f14620b, ')');
    }
}
