package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f19382a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f19383b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f19384c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        r.e(socketAddress, "socketAddress");
        this.f19382a = address;
        this.f19383b = proxy;
        this.f19384c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return r.a(route.f19382a, this.f19382a) && r.a(route.f19383b, this.f19383b) && r.a(route.f19384c, this.f19384c);
    }

    public final int hashCode() {
        return this.f19384c.hashCode() + ((this.f19383b.hashCode() + ((this.f19382a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f19384c + '}';
    }
}
