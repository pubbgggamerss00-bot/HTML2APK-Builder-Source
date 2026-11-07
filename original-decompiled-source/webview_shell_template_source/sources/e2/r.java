package e2;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class r extends q {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12831f = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(View view, int i6, int i7, int i8, int i9) {
            view.setLeftTopRightBottom(i6, i7, i8, i9);
        }
    }

    @SuppressLint({"NewApi"})
    public void f(View view, int i6, int i7, int i8, int i9) {
        if (f12831f) {
            try {
                a.a(view, i6, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f12831f = false;
            }
        }
    }
}
