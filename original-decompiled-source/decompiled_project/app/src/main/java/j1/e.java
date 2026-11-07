package j1;

import f3.r;
import j1.d;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14617a;

    public static final class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f14618a;

        public a(float f10) {
            this.f14618a = f10;
        }

        @Override // j1.d.b
        public final int a(int i10, int i11, r rVar) {
            return org.bouncycastle.asn1.x509.a.a(1, this.f14618a, (i11 - i10) / 2.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f14618a, ((a) obj).f14618a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14618a);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("Horizontal(bias="), this.f14618a, ')');
        }
    }

    public e(float f10) {
        this.f14617a = f10;
    }

    @Override // j1.d
    public final long a(long j10, long j11, r rVar) {
        long j12 = ((((int) (j11 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j11 & BodyPartID.bodyIdMax)) - ((int) (j10 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
        float f10 = ((int) (j12 >> 32)) / 2.0f;
        float f11 = 1;
        float f12 = (this.f14617a + f11) * f10;
        float f13 = (f11 - 1.0f) * (((int) (j12 & BodyPartID.bodyIdMax)) / 2.0f);
        return (Math.round(f13) & BodyPartID.bodyIdMax) | (Math.round(f12) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f14617a, ((e) obj).f14617a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f14617a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f14617a + ", verticalBias=-1.0)";
    }
}
