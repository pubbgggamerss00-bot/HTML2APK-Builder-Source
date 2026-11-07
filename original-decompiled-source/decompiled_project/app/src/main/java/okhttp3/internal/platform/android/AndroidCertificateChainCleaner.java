package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f19772d = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f19773b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f19774c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f19773b = x509TrustManager;
        this.f19774c = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final List a(String hostname, List chain) throws CertificateException, SSLPeerUnverifiedException {
        r.e(chain, "chain");
        r.e(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f19774c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            r.d(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f19773b == this.f19773b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19773b);
    }
}
