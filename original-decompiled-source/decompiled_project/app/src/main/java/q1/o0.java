package q1;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class o0 {
    public static final int a(float f10, float[] fArr, int i10) {
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = f10;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }
}
