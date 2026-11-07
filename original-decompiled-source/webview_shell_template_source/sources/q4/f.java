package q4;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import e5.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i.b(configuration.fontWeightAdjustment + typeface.getWeight(), 1, CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL), typeface.isItalic());
    }
}
