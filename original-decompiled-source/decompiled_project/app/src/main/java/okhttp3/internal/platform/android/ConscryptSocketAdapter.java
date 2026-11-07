package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19792a = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public static final ConscryptSocketAdapter$Companion$factory$1 f19793b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean b(SSLSocket sSLSocket) {
            ConscryptPlatform.f19750e.getClass();
            return ConscryptPlatform.f19751f && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter c(SSLSocket sSLSocket) {
            return new ConscryptSocketAdapter();
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
        ConscryptPlatform.f19750e.getClass();
        return ConscryptPlatform.f19751f;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        r.e(protocols, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.f19768a.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(protocols).toArray(new String[0]));
        }
    }
}
