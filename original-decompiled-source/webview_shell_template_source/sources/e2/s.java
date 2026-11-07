package e2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class s extends r {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f12832g = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(View view, int i6) {
            view.setTransitionVisibility(i6);
        }
    }

    @Override // e2.p
    @SuppressLint({"NewApi"})
    public void c(View view, int i6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i6);
        } else if (f12832g) {
            try {
                a.a(view, i6);
            } catch (NoSuchMethodError unused) {
                f12832g = false;
            }
        }
    }
}
