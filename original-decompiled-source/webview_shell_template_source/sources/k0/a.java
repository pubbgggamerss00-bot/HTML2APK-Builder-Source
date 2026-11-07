package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import i0.q;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import l0.f;
import q0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: k0.a$a, reason: collision with other inner class name */
    public static class C0071a {
        public static void a(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new q(context).f13338a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f13800c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Context context, int i6) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        f.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.b bVar = new f.b(resources, theme);
        synchronized (f.f13797c) {
            try {
                SparseArray<f.a> sparseArray = f.f13796b.get(bVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i6)) == null) {
                    colorStateList = null;
                } else {
                    if (aVar.f13799b.equals(resources.getConfiguration())) {
                        if (theme != null || aVar.f13800c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = aVar.f13798a;
                    }
                    sparseArray.remove(i6);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = f.f13795a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i6, typedValue, true);
        int i7 = typedValue.type;
        if (i7 < 28 || i7 > 31) {
            try {
                colorStateListA = l0.c.a(resources, resources.getXml(i6), theme);
            } catch (Exception e6) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i6, theme);
        }
        synchronized (f.f13797c) {
            try {
                WeakHashMap<f.b, SparseArray<f.a>> weakHashMap = f.f13796b;
                SparseArray<f.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i6, new f.a(colorStateListA, bVar.f13801a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListA;
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(context) : new e(new Handler(context.getMainLooper()));
    }
}
