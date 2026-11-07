package q1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class u0 {

    public static final class a {
        public static q1 a(List list) {
            return new q1(list, null, (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) & BodyPartID.bodyIdMax));
        }

        public static q1 b(List list) {
            return new q1(list, null, 0L, 9187343241974906880L);
        }

        public static w1 c(List list, long j10, float f10, int i10) {
            if ((i10 & 2) != 0) {
                j10 = 9205357640488583168L;
            }
            if ((i10 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            return new w1(f10, j10, list);
        }
    }

    public abstract void a(float f10, long j10, h0 h0Var);
}
