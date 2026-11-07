package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import mh.s;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public class Jdk9Platform extends Platform {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f19763d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f19764e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        boolean z10 = false;
        z10 = false;
        f19763d = new Companion(z10 ? 1 : 0);
        String property = System.getProperty("java.specification.version");
        Integer numG = property != null ? s.g(property) : null;
        if (numG == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numG.intValue() >= 9) {
            z10 = true;
        }
        f19764e = z10;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        r.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f19768a.getClass();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
