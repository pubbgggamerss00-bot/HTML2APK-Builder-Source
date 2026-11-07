package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import qg.x;
import sg.b;

/* loaded from: classes2.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionSpec f19208e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionSpec f19209f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19210a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19211b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f19212c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19213d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19214a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f19215b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f19216c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19217d;

        public Builder(boolean z10) {
            this.f19214a = z10;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f19214a, this.f19217d, this.f19215b, this.f19216c);
        }

        public final void b(String... cipherSuites) {
            r.e(cipherSuites, "cipherSuites");
            if (!this.f19214a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f19215b = (String[]) cipherSuites.clone();
        }

        public final void c(CipherSuite... cipherSuites) {
            r.e(cipherSuites, "cipherSuites");
            if (!this.f19214a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f19206a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            r.e(tlsVersions, "tlsVersions");
            if (!this.f19214a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f19216c = (String[]) tlsVersions.clone();
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f19214a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f19392a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f19203r;
        CipherSuite cipherSuite2 = CipherSuite.f19204s;
        CipherSuite cipherSuite3 = CipherSuite.f19205t;
        CipherSuite cipherSuite4 = CipherSuite.f19197l;
        CipherSuite cipherSuite5 = CipherSuite.f19199n;
        CipherSuite cipherSuite6 = CipherSuite.f19198m;
        CipherSuite cipherSuite7 = CipherSuite.f19200o;
        CipherSuite cipherSuite8 = CipherSuite.f19202q;
        CipherSuite cipherSuite9 = CipherSuite.f19201p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f19195j, CipherSuite.f19196k, CipherSuite.f19193h, CipherSuite.f19194i, CipherSuite.f19191f, CipherSuite.f19192g, CipherSuite.f19190e};
        Builder builder = new Builder(true);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.e(tlsVersion, tlsVersion2);
        builder.f19217d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder2.e(tlsVersion, tlsVersion2);
        builder2.f19217d = true;
        f19208e = builder2.a();
        Builder builder3 = new Builder(true);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.f19217d = true;
        builder3.a();
        f19209f = new Builder(false).a();
    }

    public ConnectionSpec(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f19210a = z10;
        this.f19211b = z11;
        this.f19212c = strArr;
        this.f19213d = strArr2;
    }

    public final List<CipherSuite> a() {
        String[] strArr = this.f19212c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f19187b.b(str));
        }
        return x.c0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f19210a) {
            return false;
        }
        String[] strArr = this.f19213d;
        if (strArr != null && !Util.i(strArr, sSLSocket.getEnabledProtocols(), b.f24919a)) {
            return false;
        }
        String[] strArr2 = this.f19212c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        CipherSuite.f19187b.getClass();
        return Util.i(strArr2, enabledCipherSuites, CipherSuite.f19188c);
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.f19213d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.f19385b.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return x.c0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z10 = connectionSpec.f19210a;
        boolean z11 = this.f19210a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f19212c, connectionSpec.f19212c) && Arrays.equals(this.f19213d, connectionSpec.f19213d) && this.f19211b == connectionSpec.f19211b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f19210a) {
            return 17;
        }
        String[] strArr = this.f19212c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f19213d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f19211b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f19210a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f19211b + ')';
    }
}
