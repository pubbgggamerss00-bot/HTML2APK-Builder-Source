package q0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static Object a(String str, Bundle bundle) {
            return bundle.getParcelable(str, d.a.class);
        }
    }

    public static Object a(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (d.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
