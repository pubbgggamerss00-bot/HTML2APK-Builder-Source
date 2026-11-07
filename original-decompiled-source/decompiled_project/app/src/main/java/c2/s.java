package c2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class s {
    public static final boolean a(b0 b0Var) {
        return !b0Var.f4600h && b0Var.f4596d;
    }

    public static final boolean b(b0 b0Var) {
        return (b0Var.b() || !b0Var.f4600h || b0Var.f4596d) ? false : true;
    }

    public static final boolean c(b0 b0Var) {
        return b0Var.f4600h && !b0Var.f4596d;
    }

    public static final boolean d(b0 b0Var, long j10, long j11) {
        int i10 = b0Var.f4601i == 1 ? 1 : 0;
        long j12 = b0Var.f4595c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax));
        float f10 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) * f10;
        float f11 = ((int) (j10 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) * f10;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & BodyPartID.bodyIdMax)) + fIntBitsToFloat4);
    }

    public static final long e(b0 b0Var, boolean z10) {
        long jF = p1.c.f(b0Var.f4595c, b0Var.f4599g);
        if (z10 || !b0Var.b()) {
            return jF;
        }
        return 0L;
    }
}
