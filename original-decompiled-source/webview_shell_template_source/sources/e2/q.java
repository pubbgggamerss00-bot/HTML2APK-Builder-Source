package e2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class q extends p {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f12829d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f12830e = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @SuppressLint({"NewApi"})
    public void d(View view, Matrix matrix) {
        if (f12829d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12829d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (f12830e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12830e = false;
            }
        }
    }
}
