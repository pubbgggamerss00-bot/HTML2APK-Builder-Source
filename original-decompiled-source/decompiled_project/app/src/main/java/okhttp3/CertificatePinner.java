package okhttp3;

import eh.a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.r;
import mh.t;
import okhttp3.internal.tls.CertificateChainCleaner;
import qg.x;

/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f19177c = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f19178d = new CertificatePinner(x.h0(new Builder().f19181a), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set<Pin> f19179a;

    /* renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f19180b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19181a = new ArrayList();
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pin);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.f19179a = set;
        this.f19180b = certificateChainCleaner;
    }

    public final void a(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        r.e(hostname, "hostname");
        r.e(peerCertificates, "peerCertificates");
        b(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void b(String hostname, a<? extends List<? extends X509Certificate>> aVar) {
        r.e(hostname, "hostname");
        Iterator<T> it = this.f19179a.iterator();
        if (it.hasNext()) {
            ((Pin) it.next()).getClass();
            t.p(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return r.a(certificatePinner.f19179a, this.f19179a) && r.a(certificatePinner.f19180b, this.f19180b);
    }

    public final int hashCode() {
        int iHashCode = (this.f19179a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f19180b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
