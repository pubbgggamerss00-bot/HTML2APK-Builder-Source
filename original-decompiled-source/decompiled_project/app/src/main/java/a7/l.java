package a7;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.r;
import t6.s;

/* loaded from: classes.dex */
public final class l extends i<y6.g> {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f94f;

    /* renamed from: g, reason: collision with root package name */
    public final k f95g;

    public l(Context context, e7.c cVar) {
        super(context, cVar);
        Object systemService = this.f88b.getSystemService("connectivity");
        r.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f94f = (ConnectivityManager) systemService;
        this.f95g = new k(this);
    }

    @Override // a7.i
    public final y6.g a() {
        return m.a(this.f94f);
    }

    @Override // a7.i
    public final void c() {
        try {
            s.d().a(m.f96a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f94f;
            k networkCallback = this.f95g;
            r.e(connectivityManager, "<this>");
            r.e(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e10) {
            s.d().c(m.f96a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            s.d().c(m.f96a, "Received exception while registering network callback", e11);
        }
    }

    @Override // a7.i
    public final void d() {
        try {
            s.d().a(m.f96a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f94f;
            k networkCallback = this.f95g;
            r.e(connectivityManager, "<this>");
            r.e(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e10) {
            s.d().c(m.f96a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            s.d().c(m.f96a, "Received exception while unregistering network callback", e11);
        }
    }
}
