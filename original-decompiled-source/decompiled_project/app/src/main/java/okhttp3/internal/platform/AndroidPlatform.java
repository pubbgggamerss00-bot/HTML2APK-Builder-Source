package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import qg.o;

/* loaded from: classes2.dex */
public final class AndroidPlatform extends Platform {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f19741f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f19742g;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19743d;

    /* renamed from: e, reason: collision with root package name */
    public final CloseGuard f19744e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f19745a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f19746b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f19745a = x509TrustManager;
            this.f19746b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = this.f19746b.invoke(this.f19745a, x509Certificate);
                r.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return r.a(this.f19745a, customTrustRootIndex.f19745a) && r.a(this.f19746b, customTrustRootIndex.f19746b);
        }

        public final int hashCode() {
            return this.f19746b.hashCode() + (this.f19745a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f19745a + ", findByIssuerAndSignatureMethod=" + this.f19746b + ')';
        }
    }

    static {
        boolean z10 = false;
        z10 = false;
        f19741f = new Companion(z10 ? 1 : 0);
        Platform.f19768a.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f19742g = z10;
    }

    public AndroidPlatform() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        StandardAndroidSocketAdapter.f19796h.getClass();
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e10) {
            Platform.f19768a.getClass();
            Platform.f19769b.getClass();
            Platform.i("unable to load android socket classes", 5, e10);
            standardAndroidSocketAdapter = null;
        }
        AndroidSocketAdapter.f19779f.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f19780g);
        ConscryptSocketAdapter.f19792a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f19793b);
        BouncyCastleSocketAdapter.f19786a.getClass();
        int i10 = 0;
        ArrayList arrayListS = o.s(new SocketAdapter[]{standardAndroidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f19787b)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListS.size();
        while (i10 < size) {
            Object obj = arrayListS.get(i10);
            i10++;
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f19743d = arrayList;
        CloseGuard.f19788d.getClass();
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f19744e = new CloseGuard(method3, method2, method);
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AndroidCertificateChainCleaner.f19772d.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(c(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        Object obj;
        r.e(protocols, "protocols");
        ArrayList arrayList = this.f19743d;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((SocketAdapter) obj).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        r.e(address, "address");
        socket.connect(address, i10);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f19743d;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (((SocketAdapter) obj).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CloseGuard closeGuard = this.f19744e;
        closeGuard.getClass();
        Method method = closeGuard.f19789a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = closeGuard.f19790b;
                r.b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean h(String hostname) {
        r.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void j(Object obj, String message) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r.e(message, "message");
        CloseGuard closeGuard = this.f19744e;
        closeGuard.getClass();
        if (obj != null) {
            try {
                Method method = closeGuard.f19791c;
                r.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        Platform.i(message, 5, null);
    }
}
