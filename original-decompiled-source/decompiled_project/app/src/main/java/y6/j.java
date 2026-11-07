package y6;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class j extends s implements eh.a<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkRequest f33981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f33982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f33983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NetworkRequest networkRequest, ConnectivityManager connectivityManager, k kVar) {
        super(0);
        this.f33981a = networkRequest;
        this.f33982b = connectivityManager;
        this.f33983c = kVar;
    }

    @Override // eh.a
    public final f0 invoke() {
        Object obj = k.f33985b;
        NetworkRequest networkRequest = this.f33981a;
        ConnectivityManager connectivityManager = this.f33982b;
        k kVar = this.f33983c;
        synchronized (obj) {
            LinkedHashMap linkedHashMap = k.f33986c;
            linkedHashMap.remove(networkRequest);
            if (linkedHashMap.isEmpty()) {
                t6.s.d().a(n.f34000a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(kVar);
            }
        }
        return f0.f21461a;
    }
}
