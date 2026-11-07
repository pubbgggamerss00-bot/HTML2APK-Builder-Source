package okhttp3.internal;

import f3.f;
import hi.g;
import hi.i;
import hi.j;
import hi.l0;
import hi.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.r;
import mh.a;
import mh.k;
import mh.x;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;
import org.bouncycastle.asn1.eac.CertificateBody;
import qg.p;

/* loaded from: classes2.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19393a;

    /* renamed from: b, reason: collision with root package name */
    public static final Headers f19394b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f19395c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f19396d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f19397e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f19398f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f19399g;

    /* JADX WARN: Type inference failed for: r5v0, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
    static {
        byte[] bArr = new byte[0];
        f19393a = bArr;
        Headers.f19250b.getClass();
        f19394b = Headers.Companion.c(new String[0]);
        ResponseBody.f19379a.getClass();
        final g gVar = new g();
        gVar.m86write(bArr);
        final long j10 = 0;
        f19395c = new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
            @Override // okhttp3.ResponseBody
            public final long h() {
                return j10;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType l() {
                return null;
            }

            @Override // okhttp3.ResponseBody
            public final i s0() {
                return gVar;
            }
        };
        RequestBody.f19348a.getClass();
        if (j10 < 0 || j10 > j10 || 0 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        new RequestBody$Companion$toRequestBody$2(null, 0, bArr);
        j jVar = j.f13075d;
        f19396d = z.a.b(j.a.a("efbbbf"), j.a.a("feff"), j.a.a("fffe"), j.a.a("0000ffff"), j.a.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        r.b(timeZone);
        f19397e = timeZone;
        f19398f = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f19399g = x.J(x.I(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        r.e(httpUrl, "<this>");
        r.e(other, "other");
        return r.a(httpUrl.f19258d, other.f19258d) && httpUrl.f19259e == other.f19259e && r.a(httpUrl.f19255a, other.f19255a);
    }

    public static final int b(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(70L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        r.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        r.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!r.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i10, int i11, String str, String str2) {
        r.e(str, "<this>");
        while (i10 < i11) {
            if (x.s(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, char c10, int i10, int i11) {
        r.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int g(String str, char c10, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return f(str, c10, i10, i11);
    }

    public static final String h(String format, Object... objArr) {
        r.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        r.e(strArr, "<this>");
        r.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                b bVarE = f.e(strArr2);
                while (bVarE.hasNext()) {
                    if (comparator.compare(str, (String) bVarE.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(Response response) {
        String strC = response.f19358f.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> k(T... elements) {
        r.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(p.j(Arrays.copyOf(objArr, objArr.length)));
        r.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (r.f(cCharAt, 31) <= 0 || r.f(cCharAt, CertificateBody.profileType) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(int i10, int i11, String str) {
        r.e(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(int i10, int i11, String str) {
        r.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator<? super String> comparator) {
        r.e(other, "other");
        r.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String name) {
        r.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset r(i iVar, Charset charset) throws IOException {
        r.e(iVar, "<this>");
        r.e(charset, "default");
        int iD = iVar.D(f19396d);
        if (iD == -1) {
            return charset;
        }
        if (iD == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            r.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iD == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            r.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iD == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            r.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iD == 3) {
            a.f18237a.getClass();
            Charset charset2 = a.f18242f;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            r.d(charsetForName, "forName(...)");
            a.f18242f = charsetForName;
            return charsetForName;
        }
        if (iD != 4) {
            throw new AssertionError();
        }
        a.f18237a.getClass();
        Charset charset3 = a.f18241e;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        r.d(charsetForName2, "forName(...)");
        a.f18241e = charsetForName2;
        return charsetForName2;
    }

    public static final int s(i iVar) throws IOException {
        r.e(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final int t(g gVar) throws EOFException {
        int i10 = 0;
        while (!gVar.p() && gVar.z(0L) == 61) {
            i10++;
            gVar.readByte();
        }
        return i10;
    }

    public static final boolean u(l0 l0Var, int i10) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = l0Var.b().e() ? l0Var.b().c() - jNanoTime : Long.MAX_VALUE;
        l0Var.b().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            g gVar = new g();
            while (l0Var.y(8192L, gVar) != -1) {
                gVar.skip(gVar.f13061b);
            }
            if (jC == Long.MAX_VALUE) {
                l0Var.b().a();
                return true;
            }
            l0Var.b().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                l0Var.b().a();
                return false;
            }
            l0Var.b().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                l0Var.b().a();
            } else {
                l0Var.b().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final Headers v(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.a(header.f19588a.q(), header.f19589b.q());
        }
        return builder.b();
    }

    public static final String w(HttpUrl httpUrl, boolean z10) {
        r.e(httpUrl, "<this>");
        int i10 = httpUrl.f19259e;
        String str = httpUrl.f19258d;
        if (x.r(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z10) {
            HttpUrl.Companion companion = HttpUrl.f19253j;
            String str2 = httpUrl.f19255a;
            companion.getClass();
            if (i10 == HttpUrl.Companion.b(str2)) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        r.e(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(qg.x.e0(list));
        r.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i10, String str) throws NumberFormatException {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String z(int i10, int i11, String str) {
        int iM = m(i10, i11, str);
        String strSubstring = str.substring(iM, n(iM, i11, str));
        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
