package wa;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f31479a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f31480b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f31481c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f31482d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f31479a == null) {
            f31479a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f31479a.booleanValue();
        if (f31480b == null) {
            f31480b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f31480b.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
