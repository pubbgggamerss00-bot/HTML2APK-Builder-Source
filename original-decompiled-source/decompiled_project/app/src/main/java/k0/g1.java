package k0;

import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import i0.i2;
import i0.l4;
import j2.k5;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t2.f0;

/* loaded from: classes.dex */
public final class g1 {
    public static final int a(i2 i2Var, long j10, k5 k5Var) {
        long jY;
        int iE;
        l4 l4VarD = i2Var.d();
        if (l4VarD != null) {
            t2.l lVar = l4VarD.f13418a.f27820b;
            g2.v vVarC = i2Var.c();
            if (vVarC != null && (iE = e(lVar, (jY = vVarC.y(j10)), k5Var)) != -1) {
                return lVar.g(p1.c.a(jY, (lVar.b(iE) + lVar.f(iE)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long b(i2 i2Var, p1.e eVar, p1.e eVar2, int i10) {
        long jF = f(i2Var, eVar, i10);
        if (t2.j0.b(jF)) {
            return t2.j0.f27837b;
        }
        long jF2 = f(i2Var, eVar2, i10);
        if (t2.j0.b(jF2)) {
            return t2.j0.f27837b;
        }
        int i11 = (int) (jF >> 32);
        int iMin = Math.min(i11, i11);
        int i12 = (int) (jF2 & BodyPartID.bodyIdMax);
        return t2.k0.a(iMin, Math.max(i12, i12));
    }

    public static final boolean c(t2.h0 h0Var, int i10) {
        t2.l lVar = h0Var.f27820b;
        int iD = lVar.d(i10);
        return i10 == h0Var.g(iD) || i10 == lVar.c(iD, false) ? h0Var.h(i10) != h0Var.a(i10) : h0Var.a(i10) != h0Var.a(i10 - 1);
    }

    public static final long d(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
    }

    public static final int e(t2.l lVar, long j10, k5 k5Var) {
        float fG = k5Var != null ? k5Var.g() : CropImageView.DEFAULT_ASPECT_RATIO;
        int i10 = (int) (BodyPartID.bodyIdMax & j10);
        int iE = lVar.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < lVar.f(iE) - fG || Float.intBitsToFloat(i10) > lVar.b(iE) + fG) {
            return -1;
        }
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) < (-fG) || Float.intBitsToFloat(i11) > lVar.f27846d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long f(i2 i2Var, p1.e eVar, int i10) {
        l4 l4VarD = i2Var.d();
        t2.l lVar = l4VarD != null ? l4VarD.f13418a.f27820b : null;
        g2.v vVarC = i2Var.c();
        return (lVar == null || vVarC == null) ? t2.j0.f27837b : lVar.h(eVar.j(vVarC.y(0L)), i10, f0.a.f27808b);
    }

    public static final boolean g(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean i(int i10) {
        int type;
        return (!h(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }
}
