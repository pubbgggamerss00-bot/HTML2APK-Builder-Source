package g2;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w {
    public static final p1.e a(v vVar) {
        v vVarS = vVar.S();
        return vVarS != null ? vVarS.N(vVar, true) : new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (vVar.a() >> 32), (int) (vVar.a() & BodyPartID.bodyIdMax));
    }

    public static final p1.e b(v vVar) {
        v vVarC = c(vVar);
        float fA = (int) (vVarC.a() >> 32);
        float fA2 = (int) (vVarC.a() & BodyPartID.bodyIdMax);
        p1.e eVarN = vVarC.N(vVar, true);
        float f10 = eVarN.f21131a;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        if (f10 > fA) {
            f10 = fA;
        }
        float f12 = eVarN.f21132b;
        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f12 = 0.0f;
        }
        if (f12 > fA2) {
            f12 = fA2;
        }
        float f13 = eVarN.f21133c;
        if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f13 = 0.0f;
        }
        if (f13 <= fA) {
            fA = f13;
        }
        float f14 = eVarN.f21134d;
        if (f14 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = f14;
        }
        if (f11 <= fA2) {
            fA2 = f11;
        }
        if (f10 == fA || f12 == fA2) {
            return p1.e.f21130e;
        }
        long jB = vVarC.B((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f12) & BodyPartID.bodyIdMax));
        long jB2 = vVarC.B((Float.floatToRawIntBits(f12) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fA) << 32));
        long jB3 = vVarC.B((Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA2) & BodyPartID.bodyIdMax));
        long jB4 = vVarC.B((Float.floatToRawIntBits(fA2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & BodyPartID.bodyIdMax));
        return new p1.e(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final v c(v vVar) {
        v vVar2;
        v vVarS = vVar.S();
        while (true) {
            v vVar3 = vVarS;
            vVar2 = vVar;
            vVar = vVar3;
            if (vVar == null) {
                break;
            }
            vVarS = vVar.S();
        }
        i2.g1 g1Var = vVar2 instanceof i2.g1 ? (i2.g1) vVar2 : null;
        if (g1Var == null) {
            return vVar2;
        }
        i2.g1 g1Var2 = g1Var.f13878s;
        while (true) {
            i2.g1 g1Var3 = g1Var2;
            i2.g1 g1Var4 = g1Var;
            g1Var = g1Var3;
            if (g1Var == null) {
                return g1Var4;
            }
            g1Var2 = g1Var.f13878s;
        }
    }

    public static final boolean d(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[2] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[3] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[4] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[5] == 1.0f && fArr[6] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[7] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[8] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[9] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[10] == 1.0f && fArr[11] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[12] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[13] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[14] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[15] == 1.0f;
    }
}
