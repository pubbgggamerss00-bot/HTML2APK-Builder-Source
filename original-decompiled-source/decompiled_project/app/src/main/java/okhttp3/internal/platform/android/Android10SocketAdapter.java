package okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Android10SocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19771a = new Companion(0);

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        f19771a.getClass();
        Platform.f19768a.getClass();
        return "Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) throws IOException {
        r.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Platform.f19768a.getClass();
            sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
