package d0;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface q0 extends g2.o0 {
    List<g2.g1> C0(int i10, long j10);

    @Override // f3.d
    default long E(long j10) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fN0 = N0(f3.k.b(j10));
        float fN02 = N0(f3.k.a(j10));
        return (Float.floatToRawIntBits(fN02) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fN0) << 32);
    }

    @Override // f3.d
    default long o(float f10) {
        return f3.u.e(f10 / G0(), 4294967296L);
    }

    @Override // f3.d
    default long p(long j10) {
        if (j10 != 9205357640488583168L) {
            return f3.i.a(v(Float.intBitsToFloat((int) (j10 >> 32))), v(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))));
        }
        return 9205357640488583168L;
    }

    @Override // f3.d
    default float q(long j10) {
        if (!f3.v.a(f3.t.b(j10), 4294967296L)) {
            y.c.c("Only Sp can convert to Px");
        }
        return G0() * f3.t.c(j10);
    }

    @Override // f3.d
    default long t(float f10) {
        return f3.u.e(f10 / (getDensity() * G0()), 4294967296L);
    }

    @Override // f3.d
    default float u(int i10) {
        return i10 / getDensity();
    }

    @Override // f3.d
    default float v(float f10) {
        return f10 / getDensity();
    }
}
