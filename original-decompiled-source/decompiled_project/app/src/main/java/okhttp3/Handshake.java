package okhttp3;

import e9.w0;
import eh.a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.r;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import pg.s;
import qg.p;
import qg.z;

/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f19243e = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f19244a;

    /* renamed from: b, reason: collision with root package name */
    public final CipherSuite f19245b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Certificate> f19246c;

    /* renamed from: d, reason: collision with root package name */
    public final s f19247d;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listK = z.f22752a;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            CipherSuite cipherSuiteB = CipherSuite.f19187b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.f19385b.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listK2 = peerCertificates != null ? Util.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listK = Util.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new Handshake(tlsVersionA, cipherSuiteB, listK, new Handshake$Companion$handshake$1(listK2));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a<? extends List<? extends Certificate>> aVar) {
        this.f19244a = tlsVersion;
        this.f19245b = cipherSuite;
        this.f19246c = list;
        this.f19247d = w0.b(new Handshake$peerCertificates$2(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f19247d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f19244a == this.f19244a && r.a(handshake.f19245b, this.f19245b) && r.a(handshake.a(), a()) && r.a(handshake.f19246c, this.f19246c);
    }

    public final int hashCode() {
        return this.f19246c.hashCode() + ((a().hashCode() + ((this.f19245b.hashCode() + ((this.f19244a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(p.h(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                r.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f19244a);
        sb.append(" cipherSuite=");
        sb.append(this.f19245b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f19246c;
        ArrayList arrayList2 = new ArrayList(p.h(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                r.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
