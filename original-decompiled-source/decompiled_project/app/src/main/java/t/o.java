package t;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.f2;
import q1.i2;

/* loaded from: classes.dex */
public final class o {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f10, long j10, f2 f2Var) {
        return b(dVar, f10, new i2(j10), f2Var);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, q1.u0 u0Var, f2 f2Var) {
        return dVar.h(new BorderModifierNodeElement(f10, u0Var, f2Var));
    }

    public static final long c(float f10, long j10) {
        float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - f10);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & BodyPartID.bodyIdMax);
    }
}
