package okhttp3.internal.platform;

import android.util.Log;
import hi.g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import qg.p;

/* loaded from: classes2.dex */
public class Platform {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19768a = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public static volatile Platform f19769b;

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f19770c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static ArrayList a(List protocols) {
            r.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p.h(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((Protocol) obj2).f19336a);
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            r.e(protocols, "protocols");
            g gVar = new g();
            ArrayList arrayListA = a(protocols);
            int size = arrayListA.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListA.get(i10);
                i10++;
                String str = (String) obj;
                gVar.q0(str.length());
                gVar.F0(str);
            }
            return gVar.N(gVar.f13061b);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    static {
        Platform jdk9Platform;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            AndroidLog.f19775a.getClass();
            for (Map.Entry<String, String> entry : AndroidLog.f19777c.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (AndroidLog.f19776b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f19778a);
                }
            }
            Android10Platform.f19738e.getClass();
            jdk9Platform = Android10Platform.f19739f ? new Android10Platform() : null;
            if (jdk9Platform == null) {
                AndroidPlatform.f19741f.getClass();
                jdk8WithJettyBootPlatform = AndroidPlatform.f19742g ? new AndroidPlatform() : null;
                r.b(jdk8WithJettyBootPlatform);
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            ConscryptPlatform.f19750e.getClass();
            jdk9Platform = ConscryptPlatform.f19751f ? new ConscryptPlatform(0) : null;
            if (jdk9Platform == null) {
                if (BouncyCastleProvider.PROVIDER_NAME.equals(Security.getProviders()[0].getName())) {
                    BouncyCastlePlatform.f19747e.getClass();
                    jdk9Platform = BouncyCastlePlatform.f19748f ? new BouncyCastlePlatform(0) : null;
                    if (jdk9Platform == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            OpenJSSEPlatform.f19765e.getClass();
                            jdk9Platform = OpenJSSEPlatform.f19766f ? new OpenJSSEPlatform(0) : null;
                            if (jdk9Platform == null) {
                                Jdk9Platform.f19763d.getClass();
                                jdk9Platform = Jdk9Platform.f19764e ? new Jdk9Platform() : null;
                                if (jdk9Platform == null) {
                                    Jdk8WithJettyBootPlatform.f19754i.getClass();
                                    String jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    try {
                                        r.d(jvmVersion, "jvmVersion");
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        try {
                                            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                            Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                            Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                            Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                            Method getMethod = cls.getMethod("get", SSLSocket.class);
                                            Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                            r.d(putMethod, "putMethod");
                                            r.d(getMethod, "getMethod");
                                            r.d(removeMethod, "removeMethod");
                                            r.d(clientProviderClass, "clientProviderClass");
                                            r.d(serverProviderClass, "serverProviderClass");
                                            jdk8WithJettyBootPlatform = new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                                        }
                                    }
                                    jdk9Platform = jdk8WithJettyBootPlatform != null ? jdk8WithJettyBootPlatform : new Platform();
                                }
                            }
                        }
                    }
                }
            }
        }
        f19769b = jdk9Platform;
        f19770c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static void i(String message, int i10, Throwable th2) {
        r.e(message, "message");
        f19770c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner b(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(c(x509TrustManager));
    }

    public TrustRootIndex c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        r.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        r.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        r.e(address, "address");
        socket.connect(address, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f19770c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        r.e(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        r.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        r.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            r.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        r.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                r.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        r.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
