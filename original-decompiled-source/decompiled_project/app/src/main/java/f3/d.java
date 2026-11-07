package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface d {
    default long E(long j10) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fN0 = N0(k.b(j10));
        float fN02 = N0(k.a(j10));
        return (Float.floatToRawIntBits(fN02) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fN0) << 32);
    }

    float G0();

    default float N0(float f10) {
        return getDensity() * f10;
    }

    default int T0(long j10) {
        return Math.round(r1(j10));
    }

    default int b1(float f10) {
        float fN0 = N0(f10);
        if (Float.isInfinite(fN0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fN0);
    }

    float getDensity();

    default long o(float f10) {
        float[] fArr = g3.b.f11461a;
        if (G0() < 1.03f) {
            return u.e(f10 / G0(), 4294967296L);
        }
        g3.a aVarA = g3.b.a(G0());
        return u.e(aVarA != null ? aVarA.a(f10) : f10 / G0(), 4294967296L);
    }

    default long p(long j10) {
        if (j10 != 9205357640488583168L) {
            return i.a(v(Float.intBitsToFloat((int) (j10 >> 32))), v(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))));
        }
        return 9205357640488583168L;
    }

    default float q(long j10) {
        float fC;
        float fG0;
        if (!v.a(t.b(j10), 4294967296L)) {
            l.b("Only Sp can convert to Px");
        }
        float[] fArr = g3.b.f11461a;
        if (G0() >= 1.03f) {
            g3.a aVarA = g3.b.a(G0());
            fC = t.c(j10);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fG0 = G0();
        } else {
            fC = t.c(j10);
            fG0 = G0();
        }
        return fG0 * fC;
    }

    default float r1(long j10) {
        if (!v.a(t.b(j10), 4294967296L)) {
            l.b("Only Sp can convert to Px");
        }
        return N0(q(j10));
    }

    default long t(float f10) {
        return o(v(f10));
    }

    default float u(int i10) {
        return i10 / getDensity();
    }

    default float v(float f10) {
        return f10 / getDensity();
    }
}
