package okhttp3.internal.connection;

import c0.g0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import pg.f0;
import qg.t;

/* loaded from: classes2.dex */
public final class ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f19454a;

    /* renamed from: b, reason: collision with root package name */
    public final Address f19455b;

    /* renamed from: c, reason: collision with root package name */
    public final RealCall f19456c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f19457d;

    /* renamed from: e, reason: collision with root package name */
    public RouteSelector.Selection f19458e;

    /* renamed from: f, reason: collision with root package name */
    public RouteSelector f19459f;

    /* renamed from: g, reason: collision with root package name */
    public int f19460g;

    /* renamed from: h, reason: collision with root package name */
    public int f19461h;

    /* renamed from: i, reason: collision with root package name */
    public int f19462i;

    /* renamed from: j, reason: collision with root package name */
    public Route f19463j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall realCall, EventListener eventListener) {
        r.e(connectionPool, "connectionPool");
        r.e(eventListener, "eventListener");
        this.f19454a = connectionPool;
        this.f19455b = address;
        this.f19456c = realCall;
        this.f19457d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RealConnection a(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        ArrayList arrayList;
        String hostName;
        int port;
        List<InetAddress> listC;
        boolean zContains;
        RouteDatabase routeDatabase;
        boolean z12;
        Socket socketJ;
        while (!this.f19456c.f19477p) {
            RealConnection realConnection = this.f19456c.f19472j;
            if (realConnection != null) {
                synchronized (realConnection) {
                    try {
                        socketJ = (realConnection.f19493j || !b(realConnection.f19485b.f19382a.f19157h)) ? this.f19456c.j() : null;
                        f0 f0Var = f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f19456c.f19472j != null) {
                    if (socketJ != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z12 = z11;
                } else {
                    if (socketJ != null) {
                        Util.d(socketJ);
                    }
                    this.f19457d.getClass();
                    this.f19460g = 0;
                    this.f19461h = 0;
                    this.f19462i = 0;
                    if (this.f19454a.a(this.f19455b, this.f19456c, null, false)) {
                        Route route = this.f19463j;
                        try {
                            if (route != null) {
                                this.f19463j = null;
                            } else {
                                RouteSelector.Selection selection = this.f19458e;
                                if (selection == null || !selection.a()) {
                                    RouteSelector routeSelector = this.f19459f;
                                    if (routeSelector == null) {
                                        Address address = this.f19455b;
                                        RealCall realCall = this.f19456c;
                                        routeSelector = new RouteSelector(address, realCall.f19464a.D, realCall, this.f19457d);
                                        this.f19459f = routeSelector;
                                    }
                                    if (!routeSelector.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (routeSelector.f19520f < routeSelector.f19519e.size()) {
                                        Address address2 = routeSelector.f19515a;
                                        if (routeSelector.f19520f >= routeSelector.f19519e.size()) {
                                            throw new SocketException("No route to " + address2.f19157h.f19258d + "; exhausted proxy configurations: " + routeSelector.f19519e);
                                        }
                                        List<? extends Proxy> list = routeSelector.f19519e;
                                        int i13 = routeSelector.f19520f;
                                        routeSelector.f19520f = i13 + 1;
                                        Proxy proxy = list.get(i13);
                                        EventListener eventListener = routeSelector.f19518d;
                                        ArrayList arrayList2 = new ArrayList();
                                        routeSelector.f19521g = arrayList2;
                                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            HttpUrl httpUrl = address2.f19157h;
                                            hostName = httpUrl.f19258d;
                                            port = httpUrl.f19259e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            RouteSelector.f19514i.getClass();
                                            InetAddress address3 = inetSocketAddress.getAddress();
                                            if (address3 == null) {
                                                hostName = inetSocketAddress.getHostName();
                                                r.d(hostName, "hostName");
                                            } else {
                                                hostName = address3.getHostAddress();
                                                r.d(hostName, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 > port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            byte[] bArr = Util.f19393a;
                                            r.e(hostName, "<this>");
                                            if (Util.f19398f.e(hostName)) {
                                                listC = g0.c(InetAddress.getByName(hostName));
                                            } else {
                                                eventListener.getClass();
                                                List<InetAddress> listA = address2.f19150a.a(hostName);
                                                if (listA.isEmpty()) {
                                                    throw new UnknownHostException(address2.f19150a + " returned no addresses for " + hostName);
                                                }
                                                listC = listA;
                                            }
                                            Iterator<InetAddress> it = listC.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        Iterator it2 = routeSelector.f19521g.iterator();
                                        while (it2.hasNext()) {
                                            Route route2 = new Route(routeSelector.f19515a, proxy, (InetSocketAddress) it2.next());
                                            RouteDatabase routeDatabase2 = routeSelector.f19516b;
                                            synchronized (routeDatabase2) {
                                                zContains = routeDatabase2.f19511a.contains(route2);
                                            }
                                            if (zContains) {
                                                routeSelector.f19522h.add(route2);
                                            } else {
                                                arrayList.add(route2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        t.p(routeSelector.f19522h, arrayList);
                                        routeSelector.f19522h.clear();
                                    }
                                    RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList);
                                    this.f19458e = selection2;
                                    if (this.f19456c.f19477p) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f19454a.a(this.f19455b, this.f19456c, arrayList, false)) {
                                        realConnection = this.f19456c.f19472j;
                                        r.b(realConnection);
                                        this.f19457d.getClass();
                                    } else {
                                        if (!selection2.a()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i14 = selection2.f19524b;
                                        selection2.f19524b = i14 + 1;
                                        route = (Route) arrayList.get(i14);
                                        RealConnection realConnection2 = new RealConnection(this.f19454a, route);
                                        this.f19456c.f19479r = realConnection2;
                                        realConnection2.c(i10, i11, i12, z10, this.f19456c, this.f19457d);
                                        this.f19456c.f19479r = null;
                                        routeDatabase = this.f19456c.f19464a.D;
                                        Route route3 = realConnection2.f19485b;
                                        synchronized (routeDatabase) {
                                            r.e(route3, "route");
                                            routeDatabase.f19511a.remove(route3);
                                        }
                                        if (this.f19454a.a(this.f19455b, this.f19456c, arrayList, true)) {
                                            realConnection = this.f19456c.f19472j;
                                            r.b(realConnection);
                                            this.f19463j = route;
                                            Socket socket = realConnection2.f19487d;
                                            r.b(socket);
                                            Util.d(socket);
                                            this.f19457d.getClass();
                                        } else {
                                            synchronized (realConnection2) {
                                                RealConnectionPool realConnectionPool = this.f19454a;
                                                realConnectionPool.getClass();
                                                byte[] bArr2 = Util.f19393a;
                                                realConnectionPool.f19509d.add(realConnection2);
                                                realConnectionPool.f19507b.c(realConnectionPool.f19508c, 0L);
                                                this.f19456c.b(realConnection2);
                                                f0 f0Var2 = f0.f21461a;
                                            }
                                            this.f19457d.getClass();
                                            z12 = z11;
                                            realConnection = realConnection2;
                                        }
                                    }
                                } else {
                                    RouteSelector.Selection selection3 = this.f19458e;
                                    r.b(selection3);
                                    if (!selection3.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    ArrayList arrayList3 = selection3.f19523a;
                                    int i15 = selection3.f19524b;
                                    selection3.f19524b = i15 + 1;
                                    route = (Route) arrayList3.get(i15);
                                }
                            }
                            realConnection2.c(i10, i11, i12, z10, this.f19456c, this.f19457d);
                            this.f19456c.f19479r = null;
                            routeDatabase = this.f19456c.f19464a.D;
                            Route route32 = realConnection2.f19485b;
                            synchronized (routeDatabase) {
                            }
                        } catch (Throwable th3) {
                            this.f19456c.f19479r = null;
                            throw th3;
                        }
                        arrayList = null;
                        RealConnection realConnection22 = new RealConnection(this.f19454a, route);
                        this.f19456c.f19479r = realConnection22;
                    } else {
                        realConnection = this.f19456c.f19472j;
                        r.b(realConnection);
                        this.f19457d.getClass();
                    }
                    z12 = z11;
                }
            } else {
                this.f19460g = 0;
                this.f19461h = 0;
                this.f19462i = 0;
                if (this.f19454a.a(this.f19455b, this.f19456c, null, false)) {
                }
                z12 = z11;
            }
            if (realConnection.i(z12)) {
                return realConnection;
            }
            realConnection.k();
            if (this.f19463j == null) {
                RouteSelector.Selection selection4 = this.f19458e;
                if (selection4 != null ? selection4.a() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector2 = this.f19459f;
                    if (!(routeSelector2 != null ? routeSelector2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(HttpUrl url) {
        r.e(url, "url");
        HttpUrl httpUrl = this.f19455b.f19157h;
        return url.f19259e == httpUrl.f19259e && r.a(url.f19258d, httpUrl.f19258d);
    }

    public final void c(IOException e10) {
        r.e(e10, "e");
        this.f19463j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).f19737a == ErrorCode.REFUSED_STREAM) {
            this.f19460g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f19461h++;
        } else {
            this.f19462i++;
        }
    }
}
