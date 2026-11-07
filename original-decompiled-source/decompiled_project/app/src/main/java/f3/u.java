package f3;

import i2.e0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8835a = 0;

    public static final void a(long j10) {
        v[] vVarArr = t.f8832b;
        if ((j10 & 1095216660480L) == 0) {
            l.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long b(double d10) {
        return e((float) d10, 4294967296L);
    }

    public static final long c(int i10) {
        return e(i10, 4294967296L);
    }

    public static final boolean d(e0 e0Var) {
        if (e0Var.f13816h == null) {
            return false;
        }
        e0 e0VarG = e0Var.G();
        return (e0VarG != null ? e0VarG.f13816h : null) == null || e0Var.K.f13915b;
    }

    public static final long e(float f10, long j10) {
        long jFloatToRawIntBits = j10 | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
        v[] vVarArr = t.f8832b;
        return jFloatToRawIntBits;
    }
}
