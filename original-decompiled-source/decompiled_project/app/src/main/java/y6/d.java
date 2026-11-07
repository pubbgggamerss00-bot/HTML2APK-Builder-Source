package y6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.r;
import t6.s;
import y6.b;
import y6.e;

/* loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33964b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e.b f33965a;

    public d(e.b bVar) {
        this.f33965a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        r.e(network, "network");
        r.e(networkCapabilities, "networkCapabilities");
        s.d().a(n.f34000a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.f33965a.invoke(b.a.f33959a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        r.e(network, "network");
        s.d().a(n.f34000a, "NetworkRequestConstraintController onLost callback");
        this.f33965a.invoke(new b.C0345b(7));
    }
}
