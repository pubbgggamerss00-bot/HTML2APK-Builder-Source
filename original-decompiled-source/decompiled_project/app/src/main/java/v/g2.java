package v;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f29887a;

    /* renamed from: b, reason: collision with root package name */
    public long f29888b;

    public g2(long j10, t0 t0Var) {
        this.f29887a = t0Var;
        this.f29888b = j10;
    }

    public final long a(c2.b0 b0Var, float f10) {
        long jG = p1.c.g(this.f29888b, p1.c.f(b0Var.f4595c, b0Var.f4599g));
        this.f29888b = jG;
        t0 t0Var = this.f29887a;
        if ((t0Var == null ? p1.c.c(jG) : Math.abs(b(jG))) < f10) {
            return 9205357640488583168L;
        }
        if (t0Var == null) {
            long j10 = this.f29888b;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / p1.c.c(j10);
            return p1.c.f(this.f29888b, p1.c.h(f10, (BodyPartID.bodyIdMax & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) / r9)) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
        }
        float fB = b(this.f29888b) - (Math.signum(b(this.f29888b)) * f10);
        long j11 = this.f29888b;
        t0 t0Var2 = t0.f30084b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (t0Var == t0Var2 ? j11 & BodyPartID.bodyIdMax : j11 >> 32));
        if (t0Var == t0Var2) {
            return (Float.floatToRawIntBits(fB) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fIntBitsToFloat2));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fB));
    }

    public final float b(long j10) {
        return Float.intBitsToFloat((int) (this.f29887a == t0.f30084b ? j10 >> 32 : j10 & BodyPartID.bodyIdMax));
    }
}
