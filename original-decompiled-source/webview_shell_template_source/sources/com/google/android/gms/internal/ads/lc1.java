package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lc1 {
    public static Bundle a(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void c(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void d(Bundle bundle, String str, int i6, boolean z6) {
        if (z6) {
            bundle.putInt(str, i6);
        }
    }

    public static void e(Bundle bundle, String str, String str2, boolean z6) {
        if (!z6 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void f(Bundle bundle, String str, boolean z6, boolean z7) {
        if (z7) {
            bundle.putBoolean(str, z6);
        }
    }
}
