package c4;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class b {

    public static class a {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
        }
    }

    public static float a(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? a.b(edgeEffect) : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static float b(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }
}
