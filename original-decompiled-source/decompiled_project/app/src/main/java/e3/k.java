package e3;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;

/* loaded from: classes.dex */
public final class k {
    public static final long a(float f10, long j10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : b1.c(b1.e(j10) * f10, j10);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10) {
        return f10 == CropImageView.DEFAULT_ASPECT_RATIO ? dVar : androidx.compose.ui.graphics.a.b(dVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, null, false, 130815);
    }
}
