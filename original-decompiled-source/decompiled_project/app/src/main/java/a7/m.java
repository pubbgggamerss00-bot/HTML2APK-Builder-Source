package a7;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.r;
import t6.s;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96a;

    static {
        String strF = s.f("NetworkStateTracker");
        r.d(strF, "tagWithPrefix(\"NetworkStateTracker\")");
        f96a = strF;
    }

    public static final y6.g a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        r.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            s.d().c(f96a, "Unable to validate active network", e10);
        }
        boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        return new y6.g(z10, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
