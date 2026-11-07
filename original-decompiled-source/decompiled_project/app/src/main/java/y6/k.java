package y6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import qg.x;
import t6.s;
import y6.b;

/* loaded from: classes.dex */
public final class k extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final k f33984a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f33985b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f33986c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listC0;
        r.e(network, "network");
        r.e(networkCapabilities, "networkCapabilities");
        s.d().a(n.f34000a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f33985b) {
            listC0 = x.c0(f33986c.entrySet());
        }
        for (Map.Entry entry : listC0) {
            ((eh.l) entry.getValue()).invoke(((NetworkRequest) entry.getKey()).canBeSatisfiedBy(networkCapabilities) ? b.a.f33959a : new b.C0345b(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listC0;
        r.e(network, "network");
        s.d().a(n.f34000a, "NetworkRequestConstraintController onLost callback");
        synchronized (f33985b) {
            listC0 = x.c0(f33986c.values());
        }
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            ((eh.l) it.next()).invoke(new b.C0345b(7));
        }
    }
}
