package m0;

import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f17255a = new p1.e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17256a;

        static {
            int[] iArr = new int[i0.u1.values().length];
            try {
                i0.u1 u1Var = i0.u1.f13615a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                i0.u1 u1Var2 = i0.u1.f13615a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                i0.u1 u1Var3 = i0.u1.f13615a;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17256a = iArr;
        }
    }

    public static final boolean a(p1.e eVar, long j10) {
        float f10 = eVar.f21131a;
        float f11 = eVar.f21133c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (f10 > fIntBitsToFloat || fIntBitsToFloat > f11) {
            return false;
        }
        float f12 = eVar.f21132b;
        float f13 = eVar.f21134d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return f12 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long b(r1 r1Var, long j10, z.a aVar) {
        g2.v vVar;
        g2.v vVarI;
        int i10;
        float fL;
        x xVarC = r1Var.c(aVar);
        if (xVarC == null || (vVar = r1Var.f17479k) == null || (vVarI = xVarC.i()) == null || (i10 = aVar.f17597b) > xVarC.a()) {
            return 9205357640488583168L;
        }
        p1.c cVar = (p1.c) r1Var.f17485q.getValue();
        kotlin.jvm.internal.r.b(cVar);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vVarI.L(vVar, cVar.f21129a) >> 32));
        long j11 = xVarC.j(i10);
        if (t2.j0.b(j11)) {
            fL = xVarC.l(i10);
        } else {
            float fL2 = xVarC.l((int) (j11 >> 32));
            float f10 = xVarC.f(((int) (j11 & BodyPartID.bodyIdMax)) - 1);
            fL = jh.j.l(fIntBitsToFloat, Math.min(fL2, f10), Math.max(fL2, f10));
        }
        if (fL == -1.0f) {
            return 9205357640488583168L;
        }
        if (!f3.p.b(j10, 0L) && Math.abs(fIntBitsToFloat - fL) > ((int) (j10 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        if (xVarC.b(i10) == -1.0f) {
            return 9205357640488583168L;
        }
        return vVar.L(vVarI, (Float.floatToRawIntBits(fL) << 32) | (Float.floatToRawIntBits(r12) & BodyPartID.bodyIdMax));
    }

    public static final p1.e c(g2.v vVar) {
        p1.e eVarB = g2.w.b(vVar);
        long jR = vVar.R(eVarB.e());
        float f10 = eVarB.f21133c;
        float f11 = eVarB.f21134d;
        long jR2 = vVar.R((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax));
        return new p1.e(Float.intBitsToFloat((int) (jR >> 32)), Float.intBitsToFloat((int) (jR & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (jR2 >> 32)), Float.intBitsToFloat((int) (jR2 & BodyPartID.bodyIdMax)));
    }
}
