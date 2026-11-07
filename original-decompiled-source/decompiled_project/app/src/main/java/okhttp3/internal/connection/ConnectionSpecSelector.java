package okhttp3.internal.connection;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.r;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;
import sg.b;

/* loaded from: classes2.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a, reason: collision with root package name */
    public final List<ConnectionSpec> f19433a;

    /* renamed from: b, reason: collision with root package name */
    public int f19434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19435c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19436d;

    public ConnectionSpecSelector(List<ConnectionSpec> connectionSpecs) {
        r.e(connectionSpecs, "connectionSpecs");
        this.f19433a = connectionSpecs;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        int i10;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i11 = this.f19434b;
        List<ConnectionSpec> list = this.f19433a;
        int size = list.size();
        while (true) {
            if (i11 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = list.get(i11);
            if (connectionSpec.b(sSLSocket)) {
                this.f19434b = i11 + 1;
                break;
            }
            i11++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f19436d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            r.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            r.d(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i12 = this.f19434b;
        int size2 = list.size();
        while (true) {
            i10 = 0;
            if (i12 >= size2) {
                z10 = false;
                break;
            }
            if (list.get(i12).b(sSLSocket)) {
                z10 = true;
                break;
            }
            i12++;
        }
        this.f19435c = z10;
        boolean z11 = this.f19436d;
        String[] strArr = connectionSpec.f19213d;
        String[] strArr2 = connectionSpec.f19212c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            r.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            CipherSuite.f19187b.getClass();
            cipherSuitesIntersection = Util.o(enabledCipherSuites, strArr2, CipherSuite.f19188c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            r.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.o(enabledProtocols2, strArr, b.f24919a);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        r.d(supportedCipherSuites, "supportedCipherSuites");
        CipherSuite.f19187b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f19188c;
        byte[] bArr = Util.f19393a;
        r.e(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z11 && i10 != -1) {
            r.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i10];
            r.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            r.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder();
        builder.f19214a = connectionSpec.f19210a;
        builder.f19215b = strArr2;
        builder.f19216c = strArr;
        builder.f19217d = connectionSpec.f19211b;
        r.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        builder.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        r.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        builder.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.f19213d);
        }
        if (connectionSpecA.a() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.f19212c);
        }
        return connectionSpec;
    }
}
