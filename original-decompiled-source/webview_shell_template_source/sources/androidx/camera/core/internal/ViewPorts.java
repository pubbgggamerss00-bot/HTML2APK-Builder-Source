package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.workaround.c;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.work.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    public static Map<UseCase, Rect> calculateViewPortRects(Rect rect, boolean z6, Rational rational, int i6, int i7, int i8, Map<UseCase, StreamSpec> map) {
        j.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, StreamSpec> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i6, rational), i7, z6, i8, i6);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF correctStartOrEnd(boolean z6, int i6, RectF rectF, RectF rectF2) {
        boolean z7 = false;
        boolean z8 = i6 == 0 && !z6;
        boolean z9 = i6 == 90 && z6;
        if (z8 || z9) {
            return rectF2;
        }
        boolean z10 = i6 == 0 && z6;
        boolean z11 = i6 == 270 && !z6;
        if (z10 || z11) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z12 = i6 == 90 && !z6;
        boolean z13 = i6 == 180 && z6;
        if (z12 || z13) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z14 = i6 == 180 && !z6;
        if (i6 == 270 && z6) {
            z7 = true;
        }
        if (z14 || z7) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z6 + " rotation " + i6);
    }

    private static RectF flipHorizontally(RectF rectF, float f6) {
        return new RectF(flipX(rectF.right, f6), rectF.top, flipX(rectF.left, f6), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f6) {
        return new RectF(rectF.left, flipY(rectF.bottom, f6), rectF.right, flipY(rectF.top, f6));
    }

    private static float flipX(float f6, float f7) {
        return (f7 + f7) - f6;
    }

    private static float flipY(float f6, float f7) {
        return (f7 + f7) - f6;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(RectF rectF, Rational rational, int i6, boolean z6, int i7, int i8) {
        if (i6 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i6 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i6 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i6 != 2) {
                throw new IllegalStateException(c.d(i6, "Unexpected scale type: "));
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z6, i7), i8, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z6, int i6) {
        return z6 ^ (i6 == 1);
    }
}
