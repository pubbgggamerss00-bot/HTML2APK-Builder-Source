package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f6, float f7) {
        Matrix.translateM(fArr, 0, -f6, -f7, 0.0f);
    }

    private static void normalize(float[] fArr, float f6, float f7) {
        Matrix.translateM(fArr, 0, f6, f7, 0.0f);
    }

    public static void postRotate(float[] fArr, float f6, float f7, float f8) throws Throwable {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            try {
                Matrix.setIdentityM(fArr2, 0);
                normalize(fArr2, f7, f8);
                Matrix.rotateM(fArr2, 0, f6, 0.0f, 0.0f, 1.0f);
                denormalize(fArr2, f7, f8);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
            } catch (Throwable th2) {
                th = th2;
                fArr2 = fArr2;
                Throwable th3 = th;
                throw th3;
            }
        }
    }

    public static void preRotate(float[] fArr, float f6, float f7, float f8) {
        normalize(fArr, f7, f8);
        Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f7, f8);
    }

    public static void preVerticalFlip(float[] fArr, float f6) {
        normalize(fArr, 0.0f, f6);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f6);
    }

    public static void setRotate(float[] fArr, float f6, float f7, float f8) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f6, f7, f8);
    }

    public static String toString(float[] fArr, int i6) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i6]), Float.valueOf(fArr[i6 + 4]), Float.valueOf(fArr[i6 + 8]), Float.valueOf(fArr[i6 + 12]), Float.valueOf(fArr[i6 + 1]), Float.valueOf(fArr[i6 + 5]), Float.valueOf(fArr[i6 + 9]), Float.valueOf(fArr[i6 + 13]), Float.valueOf(fArr[i6 + 2]), Float.valueOf(fArr[i6 + 6]), Float.valueOf(fArr[i6 + 10]), Float.valueOf(fArr[i6 + 14]), Float.valueOf(fArr[i6 + 3]), Float.valueOf(fArr[i6 + 7]), Float.valueOf(fArr[i6 + 11]), Float.valueOf(fArr[i6 + 15]));
    }
}
