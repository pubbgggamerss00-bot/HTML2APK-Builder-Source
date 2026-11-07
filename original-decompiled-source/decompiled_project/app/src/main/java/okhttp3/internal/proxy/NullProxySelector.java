package okhttp3.internal.proxy;

import c0.g0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes2.dex */
public final class NullProxySelector extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final NullProxySelector f19797a = new NullProxySelector();

    private NullProxySelector() {
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return g0.c(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
