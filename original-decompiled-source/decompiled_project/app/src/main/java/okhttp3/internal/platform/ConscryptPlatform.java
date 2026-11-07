package okhttp3.internal.platform;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes2.dex */
public final class ConscryptPlatform extends Platform {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f19750e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f19751f;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f19752d;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final DisabledHostnameVerifier f19753a = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }
    }

    static {
        boolean z10 = false;
        z10 = false;
        z10 = false;
        f19750e = new Companion(z10 ? 1 : 0);
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, Companion.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (Companion.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f19751f = z10;
    }

    public /* synthetic */ ConscryptPlatform(int i10) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        r.e(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.f19768a.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f19752d);
        r.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextK = k();
        sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
        r.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.Platform
    public final X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        r.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                r.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.f19753a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        r.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    private ConscryptPlatform() {
        Provider providerNewProvider = Conscrypt.newProvider();
        r.d(providerNewProvider, "newProvider()");
        this.f19752d = providerNewProvider;
    }
}
