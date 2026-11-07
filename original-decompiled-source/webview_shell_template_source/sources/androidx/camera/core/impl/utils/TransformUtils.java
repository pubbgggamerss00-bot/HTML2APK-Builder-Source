package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.camera2.internal.compat.workaround.c;
import androidx.work.j;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static float calculateSignedAngle(float f6, float f7, float f8, float f9) {
        float f10 = (f7 * f9) + (f6 * f8);
        float f11 = (f6 * f9) - (f7 * f8);
        double dSqrt = Math.sqrt((f7 * f7) + (f6 * f6)) * Math.sqrt((f9 * f9) + (f8 * f8));
        return (float) Math.toDegrees(Math.atan2(f11 / dSqrt, f10 / dSqrt));
    }

    public static Matrix getExifTransform(int i6, int i7, int i8) {
        Matrix matrix = new Matrix();
        float f6 = i7;
        float f7 = i8;
        RectF rectF = new RectF(0.0f, 0.0f, f6, f7);
        RectF rectF2 = NORMALIZED_RECT;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        switch (i6) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f7, f6);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f7, f6);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f7, f6);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f7, f6);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static Matrix getNormalizedToBuffer(Rect rect) {
        return getNormalizedToBuffer(new RectF(rect));
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i6) {
        return getRectToRect(rectF, rectF2, i6, false);
    }

    public static Size getRotatedSize(Rect rect, int i6) {
        return rotateSize(rectToSize(rect), i6);
    }

    public static int getRotationDegrees(Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean hasCropping(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean is90or270(int i6) {
        if (i6 == 90 || i6 == 270) {
            return true;
        }
        if (i6 == 0 || i6 == 180) {
            return false;
        }
        throw new IllegalArgumentException(c.d(i6, "Invalid rotation degrees: "));
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, Size size2) {
        return isAspectRatioMatchingWithRoundingError(size, false, size2, false);
    }

    public static boolean isMirrored(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return calculateSignedAngle(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float max(float f6, float f7, float f8, float f9) {
        return Math.max(Math.max(f6, f7), Math.max(f8, f9));
    }

    public static float min(float f6, float f7, float f8, float f9) {
        return Math.min(Math.min(f6, f7), Math.min(f8, f9));
    }

    public static Size rectToSize(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String rectToString(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static float[] rectToVertices(RectF rectF) {
        float f6 = rectF.left;
        float f7 = rectF.top;
        float f8 = rectF.right;
        float f9 = rectF.bottom;
        return new float[]{f6, f7, f8, f7, f8, f9, f6, f9};
    }

    public static Size reverseSize(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static SizeF reverseSizeF(SizeF sizeF) {
        return new SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static RectF rotateRect(RectF rectF, int i6) {
        j.a("Invalid rotation degrees: " + i6, i6 % 90 == 0);
        return is90or270(within360(i6)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static Size rotateSize(Size size, int i6) {
        j.a("Invalid rotation degrees: " + i6, i6 % 90 == 0);
        return is90or270(within360(i6)) ? reverseSize(size) : size;
    }

    public static Rect sizeToRect(Size size) {
        return sizeToRect(size, 0, 0);
    }

    public static RectF sizeToRectF(Size size) {
        return sizeToRectF(size, 0, 0);
    }

    public static float[] sizeToVertices(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static Matrix updateSensorToBufferTransform(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static RectF verticesToRect(float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static int within360(int i6) {
        return ((i6 % 360) + 360) % 360;
    }

    public static Matrix getNormalizedToBuffer(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i6, boolean z6) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i6);
        if (z6) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, boolean z6, Size size2, boolean z7) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z6) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z7) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static Rect sizeToRect(Size size, int i6, int i7) {
        return new Rect(i6, i7, size.getWidth() + i6, size.getHeight() + i7);
    }

    public static RectF sizeToRectF(Size size, int i6, int i7) {
        return new RectF(i6, i7, size.getWidth() + i6, size.getHeight() + i7);
    }
}
