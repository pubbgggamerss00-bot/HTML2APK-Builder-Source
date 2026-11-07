package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import qg.o;

/* loaded from: classes2.dex */
public final class Android10Platform extends Platform {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f19738e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f19739f;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19740d;

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
        f19738e = new Companion(z10 ? 1 : 0);
        Platform.f19768a.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        f19739f = z10;
    }

    public Android10Platform() {
        Android10SocketAdapter.f19771a.getClass();
        Platform.f19768a.getClass();
        Android10SocketAdapter android10SocketAdapter = (!"Dalvik".equals(System.getProperty("java.vm.name")) || Build.VERSION.SDK_INT < 29) ? null : new Android10SocketAdapter();
        AndroidSocketAdapter.f19779f.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f19780g);
        ConscryptSocketAdapter.f19792a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f19793b);
        BouncyCastleSocketAdapter.f19786a.getClass();
        int i10 = 0;
        ArrayList arrayListS = o.s(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f19787b)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListS.size();
        while (i10 < size) {
            Object obj = arrayListS.get(i10);
            i10++;
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f19740d = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        Object obj;
        r.e(protocols, "protocols");
        ArrayList arrayList = this.f19740d;
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f19740d;
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
    public final boolean h(String hostname) {
        r.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
