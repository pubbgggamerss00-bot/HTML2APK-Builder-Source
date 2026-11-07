package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes2.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19786a = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public static final BouncyCastleSocketAdapter$Companion$factory$1 f19787b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean b(SSLSocket sSLSocket) {
            BouncyCastlePlatform.f19747e.getClass();
            boolean z10 = BouncyCastlePlatform.f19748f;
            return false;
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter c(SSLSocket sSLSocket) {
            return new BouncyCastleSocketAdapter();
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        BouncyCastlePlatform.f19747e.getClass();
        return BouncyCastlePlatform.f19748f;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        r.e(protocols, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform.f19768a.getClass();
            parameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
