package t0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class u8 {
    public static final float a(e0.b bVar) {
        return bVar.l().getOrientation() == v.t0.f30084b ? Float.intBitsToFloat((int) (bVar.p() >> 32)) : Float.intBitsToFloat((int) (bVar.p() & BodyPartID.bodyIdMax));
    }

    public static final boolean b(e0.b bVar, float f10) {
        boolean zE = bVar.l().e();
        boolean z10 = (bVar.q() ? -f10 : a(bVar)) > CropImageView.DEFAULT_ASPECT_RATIO;
        return (z10 && zE) || !(z10 || zE);
    }
}
