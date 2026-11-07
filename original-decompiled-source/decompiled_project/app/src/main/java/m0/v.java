package m0;

import com.yalantis.ucrop.view.CropImageView;
import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class v {
    public static final o a(o oVar, o oVar2, j1 j1Var, long j10, z.a aVar) {
        if (aVar == null) {
            return l1.b(oVar, oVar2);
        }
        int iCompare = j1Var.f17369f.compare(Long.valueOf(aVar.f17598c), Long.valueOf(j10));
        return iCompare < 0 ? o.f17433a : iCompare > 0 ? o.f17435c : o.f17434b;
    }

    public static final int b(long j10, t2.h0 h0Var) {
        int i10 = (int) (BodyPartID.bodyIdMax & j10);
        if (Float.intBitsToFloat(i10) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        t2.l lVar = h0Var.f27820b;
        return fIntBitsToFloat >= lVar.f27847e ? h0Var.f27819a.f27809a.f27761b.length() : lVar.g(j10);
    }
}
