package s7;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f24533b;

    public e(ConnectivityManager connectivityManager) {
        this.f24533b = connectivityManager;
    }

    @Override // s7.d
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f24533b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
