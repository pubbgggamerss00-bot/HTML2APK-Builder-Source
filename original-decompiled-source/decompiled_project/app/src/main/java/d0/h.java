package d0;

import j2.c3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final int b(int i10, z0.b bVar) {
        int i11 = bVar.f34702c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int iA = m.b.a(i11, i12, 2, i12);
            Object[] objArr = bVar.f34700a;
            int i13 = ((g) objArr[iA]).f7131a;
            if (i13 != i10) {
                if (i13 < i10) {
                    i12 = iA + 1;
                    if (i10 < ((g) objArr[i12]).f7131a) {
                    }
                } else {
                    i11 = iA - 1;
                }
            }
            return iA;
        }
        return i12;
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new z.a2(3));
    }

    public static final long d(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new z.b2(3));
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new z.c2(3));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.a(dVar, c3.f14686a, new z.d2(3));
    }
}
