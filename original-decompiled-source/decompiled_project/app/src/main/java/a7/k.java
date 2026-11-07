package a7;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.r;
import t6.s;

/* loaded from: classes.dex */
public final class k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f93a;

    public k(l lVar) {
        this.f93a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        r.e(network, "network");
        r.e(capabilities, "capabilities");
        s.d().a(m.f96a, "Network capabilities changed: " + capabilities);
        this.f93a.b(new y6.g(capabilities.hasCapability(12), capabilities.hasCapability(16), capabilities.hasCapability(11) ^ true, capabilities.hasCapability(18)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        r.e(network, "network");
        s.d().a(m.f96a, "Network connection lost");
        l lVar = this.f93a;
        lVar.b(m.a(lVar.f94f));
    }
}
