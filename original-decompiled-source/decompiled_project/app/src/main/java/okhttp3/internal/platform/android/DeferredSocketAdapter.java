package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Factory f19794a;

    /* renamed from: b, reason: collision with root package name */
    public SocketAdapter f19795b;

    public interface Factory {
        boolean b(SSLSocket sSLSocket);

        SocketAdapter c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        r.e(socketAdapterFactory, "socketAdapterFactory");
        this.f19794a = socketAdapterFactory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.f19794a.b(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            return socketAdapterE.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        r.e(protocols, "protocols");
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            socketAdapterE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.f19795b == null && this.f19794a.b(sSLSocket)) {
                this.f19795b = this.f19794a.c(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19795b;
    }
}
