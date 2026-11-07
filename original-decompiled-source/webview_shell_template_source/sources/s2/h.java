package s2;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14360a = androidx.work.k.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z6) {
        String str = f14360a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            androidx.work.k.c().a(str, cls.getName() + " " + (z6 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e6) {
            androidx.work.k.c().a(str, androidx.activity.m.d(cls.getName(), " could not be ", z6 ? "enabled" : "disabled"), e6);
        }
    }
}
