package o3;

import android.os.Build;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14016a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    static {
        int i6 = Build.VERSION.SDK_INT;
        int i7 = 33554432;
        if (i6 < 31) {
            if (i6 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i7 = 0;
                }
            }
        }
        f14016a = i7;
    }
}
