package p2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends d<n2.b> {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14074i = k.e("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14075g;
    public final a h;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.c().a(e.f14074i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            k.c().a(e.f14074i, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, u2.a aVar) {
        super(context, aVar);
        this.f14075g = (ConnectivityManager) this.f14069b.getSystemService("connectivity");
        this.h = new a();
    }

    @Override // p2.d
    public final n2.b a() {
        return f();
    }

    @Override // p2.d
    public final void d() {
        String str = f14074i;
        try {
            k.c().a(str, "Registering network callback", new Throwable[0]);
            this.f14075g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e6) {
            k.c().b(str, "Received exception while registering network callback", e6);
        }
    }

    @Override // p2.d
    public final void e() {
        String str = f14074i;
        try {
            k.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.f14075g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e6) {
            k.c().b(str, "Received exception while unregistering network callback", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n2.b f() {
        boolean z6;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f14075g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e6) {
            k.c().b(f14074i, "Unable to validate active network", e6);
        }
        if (networkCapabilities != null) {
            z6 = networkCapabilities.hasCapability(16);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z7 = true;
        }
        n2.b bVar = new n2.b();
        bVar.f13913a = z8;
        bVar.f13914b = z6;
        bVar.f13915c = zIsActiveNetworkMetered;
        bVar.f13916d = z7;
        return bVar;
    }
}
