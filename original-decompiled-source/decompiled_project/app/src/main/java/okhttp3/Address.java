package okhttp3;

import a2.a;
import j2.y;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.r;
import l0.k;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final Dns f19150a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f19151b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f19152c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f19153d;

    /* renamed from: e, reason: collision with root package name */
    public final CertificatePinner f19154e;

    /* renamed from: f, reason: collision with root package name */
    public final Authenticator f19155f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f19156g;

    /* renamed from: h, reason: collision with root package name */
    public final HttpUrl f19157h;

    /* renamed from: i, reason: collision with root package name */
    public final List<Protocol> f19158i;

    /* renamed from: j, reason: collision with root package name */
    public final List<ConnectionSpec> f19159j;

    public Address(String uriHost, int i10, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        r.e(uriHost, "uriHost");
        r.e(dns, "dns");
        r.e(socketFactory, "socketFactory");
        r.e(proxyAuthenticator, "proxyAuthenticator");
        r.e(protocols, "protocols");
        r.e(connectionSpecs, "connectionSpecs");
        r.e(proxySelector, "proxySelector");
        this.f19150a = dns;
        this.f19151b = socketFactory;
        this.f19152c = sSLSocketFactory;
        this.f19153d = hostnameVerifier;
        this.f19154e = certificatePinner;
        this.f19155f = proxyAuthenticator;
        this.f19156g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            builder.f19265a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            builder.f19265a = "https";
        }
        String strB = HostnamesKt.b(HttpUrl.Companion.e(HttpUrl.f19253j, uriHost, 0, 0, 7));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        builder.f19268d = strB;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(y.a(i10, "unexpected port: ").toString());
        }
        builder.f19269e = i10;
        this.f19157h = builder.a();
        this.f19158i = Util.x(protocols);
        this.f19159j = Util.x(connectionSpecs);
    }

    public final boolean a(Address that) {
        r.e(that, "that");
        return r.a(this.f19150a, that.f19150a) && r.a(this.f19155f, that.f19155f) && r.a(this.f19158i, that.f19158i) && r.a(this.f19159j, that.f19159j) && r.a(this.f19156g, that.f19156g) && r.a(this.f19152c, that.f19152c) && r.a(this.f19153d, that.f19153d) && r.a(this.f19154e, that.f19154e) && this.f19157h.f19259e == that.f19157h.f19259e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return r.a(this.f19157h, address.f19157h) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19154e) + ((Objects.hashCode(this.f19153d) + ((Objects.hashCode(this.f19152c) + ((this.f19156g.hashCode() + a.a(this.f19159j, a.a(this.f19158i, (this.f19155f.hashCode() + ((this.f19150a.hashCode() + k.a(527, 31, this.f19157h.f19262h)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f19157h;
        sb.append(httpUrl.f19258d);
        sb.append(':');
        sb.append(httpUrl.f19259e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f19156g);
        sb.append('}');
        return sb.toString();
    }
}
