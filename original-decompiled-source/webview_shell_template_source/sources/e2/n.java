package e2;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12823a = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static int a(ViewGroup viewGroup, int i6) {
            return viewGroup.getChildDrawingOrder(i6);
        }

        public static void b(ViewGroup viewGroup, boolean z6) {
            viewGroup.suppressLayout(z6);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z6);
        } else if (f12823a) {
            try {
                a.b(viewGroup, z6);
            } catch (NoSuchMethodError unused) {
                f12823a = false;
            }
        }
    }
}
