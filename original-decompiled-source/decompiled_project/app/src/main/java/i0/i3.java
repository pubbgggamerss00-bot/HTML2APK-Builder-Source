package i0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class i3 {
    public static void a(y2.c0 c0Var, z2 z2Var, t2.h0 h0Var, g2.v vVar, y2.n0 n0Var, boolean z10, y2.v vVar2) {
        if (z10) {
            int iB = vVar2.b(t2.j0.d(c0Var.f33683b));
            p1.e eVarB = iB < h0Var.f27819a.f27809a.f27761b.length() ? h0Var.b(iB) : iB != 0 ? h0Var.b(iB - 1) : new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, (int) (j3.a(z2Var.f13726b, z2Var.f13731g, z2Var.f13732h, j3.f13380a, 1) & BodyPartID.bodyIdMax));
            float f10 = eVarB.f21132b;
            float f11 = eVarB.f21131a;
            long jY = vVar.Y((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax));
            p1.e eVarA = p1.f.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jY & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jY >> 32))) << 32), (Float.floatToRawIntBits(eVarB.f21133c - f11) << 32) | (Float.floatToRawIntBits(eVarB.f21134d - f10) & BodyPartID.bodyIdMax));
            if (kotlin.jvm.internal.r.a(n0Var.f33750a.f33705b.get(), n0Var)) {
                n0Var.f33751b.h(eVarA);
            }
        }
    }
}
