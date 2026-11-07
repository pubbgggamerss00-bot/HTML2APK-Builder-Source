package i3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f13364a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f13365b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f13366c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f13367d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f13368e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f13369f;

    public static boolean a(Context context) {
        if (f13366c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z6 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z6 = true;
            }
            f13366c = Boolean.valueOf(z6);
        }
        return f13366c.booleanValue();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13364a == null) {
            f13364a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f13364a.booleanValue();
        if (c(context)) {
            return !g.a() || g.b();
        }
        return false;
    }

    public static boolean c(Context context) {
        if (f13365b == null) {
            f13365b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f13365b.booleanValue();
    }
}
