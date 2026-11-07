package e2;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12826a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f12827b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12828c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        public static void b(View view, float f6) {
            view.setTransitionAlpha(f6);
        }
    }

    @SuppressLint({"NewApi"})
    public float a(View view) {
        if (f12826a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f12826a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(View view, float f6) {
        if (f12826a) {
            try {
                a.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f12826a = false;
            }
        }
        view.setAlpha(f6);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void c(View view, int i6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f12828c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12827b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f12828c = true;
        }
        Field field = f12827b;
        if (field != null) {
            try {
                f12827b.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
