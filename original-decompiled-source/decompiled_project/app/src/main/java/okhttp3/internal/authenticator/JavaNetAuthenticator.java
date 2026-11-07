package okhttp3.internal.authenticator;

import hi.g;
import hi.j;
import java.io.EOFException;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import qg.x;
import qg.z;

/* loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: b, reason: collision with root package name */
    public final Dns f19400b;

    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19401a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f19401a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f19401a[type.ordinal()]) == 1) {
            return (InetAddress) x.B(dns.a(httpUrl.f19258d));
        }
        SocketAddress socketAddressAddress = proxy.address();
        r.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        r.d(address, "address() as InetSocketAddress).address");
        return address;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request a(Route route, Response response) throws IOException {
        String str;
        List<Challenge> list;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Charset ISO_8859_1;
        Dns dns;
        r.e(response, "response");
        Headers headers = response.f19358f;
        int i10 = response.f19356d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                list = z.f22752a;
                Request request = response.f19353a;
                HttpUrl httpUrl = request.f19337a;
                boolean z10 = response.f19356d == 407;
                Proxy proxy = route == null ? route.f19383b : Proxy.NO_PROXY;
                for (Challenge challenge : list) {
                    if ("Basic".equalsIgnoreCase(challenge.f19185a)) {
                        Dns dns2 = (route == null || (dns = route.f19382a.f19150a) == null) ? this.f19400b : dns;
                        if (z10) {
                            SocketAddress socketAddressAddress = proxy.address();
                            r.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                            try {
                                passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), b(proxy, httpUrl, dns2), inetSocketAddress.getPort(), httpUrl.f19255a, challenge.f19186b.get("realm"), challenge.f19185a, new URL(httpUrl.f19262h), Authenticator.RequestorType.PROXY);
                            } catch (MalformedURLException e10) {
                                throw new RuntimeException(e10);
                            }
                        } else {
                            String str2 = httpUrl.f19258d;
                            r.d(proxy, "proxy");
                            try {
                                passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str2, b(proxy, httpUrl, dns2), httpUrl.f19259e, httpUrl.f19255a, challenge.f19186b.get("realm"), challenge.f19185a, new URL(httpUrl.f19262h), Authenticator.RequestorType.SERVER);
                            } catch (MalformedURLException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            String str3 = z10 ? "Proxy-Authorization" : "Authorization";
                            String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                            r.d(userName, "auth.userName");
                            char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                            r.d(password, "auth.password");
                            String str4 = new String(password);
                            String str5 = challenge.f19186b.get("charset");
                            if (str5 != null) {
                                try {
                                    ISO_8859_1 = Charset.forName(str5);
                                    r.d(ISO_8859_1, "forName(charset)");
                                } catch (Exception unused) {
                                }
                            } else {
                                ISO_8859_1 = StandardCharsets.ISO_8859_1;
                                r.d(ISO_8859_1, "ISO_8859_1");
                            }
                            int i11 = Credentials.f19234a;
                            String str6 = userName + ':' + str4;
                            j jVar = j.f13075d;
                            r.e(str6, "<this>");
                            byte[] bytes = str6.getBytes(ISO_8859_1);
                            r.d(bytes, "getBytes(...)");
                            String strConcat = "Basic ".concat(new j(bytes).a());
                            Request.Builder builderA = request.a();
                            builderA.b(str3, strConcat);
                            return builderA.a();
                        }
                    }
                }
                return null;
            }
            str = "Proxy-Authenticate";
        }
        String str7 = str;
        j jVar2 = HttpHeaders.f19527a;
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (str7.equalsIgnoreCase(headers.e(i12))) {
                g gVar = new g();
                gVar.F0(headers.g(i12));
                try {
                    HttpHeaders.b(gVar, arrayList);
                } catch (EOFException e12) {
                    Platform.f19768a.getClass();
                    Platform.f19769b.getClass();
                    Platform.i("Unable to parse challenge", 5, e12);
                }
            }
        }
        list = arrayList;
        Request request2 = response.f19353a;
        HttpUrl httpUrl2 = request2.f19337a;
        if (response.f19356d == 407) {
        }
        if (route == null) {
        }
        while (r0.hasNext()) {
        }
        return null;
    }

    public JavaNetAuthenticator(int i10) {
        Dns defaultDns = Dns.f19239a;
        r.e(defaultDns, "defaultDns");
        this.f19400b = defaultDns;
    }
}
