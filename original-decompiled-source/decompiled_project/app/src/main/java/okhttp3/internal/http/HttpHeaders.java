package okhttp3.internal.http;

import com.google.protobuf.DescriptorProtos;
import hi.g;
import hi.j;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import k1.q;
import kotlin.jvm.internal.r;
import mh.a;
import mh.t;
import mh.x;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import qg.a0;
import qg.z;

/* loaded from: classes2.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    public static final j f19527a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f19528b;

    static {
        j jVar = j.f13075d;
        f19527a = j.a.b("\"\\");
        f19528b = j.a.b("\t ,=");
    }

    public static final boolean a(Response response) {
        if (r.a(response.f19353a.f19338b, "HEAD")) {
            return false;
        }
        int i10 = response.f19356d;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && Util.j(response) == -1 && !"chunked".equalsIgnoreCase(Response.h("Transfer-Encoding", response))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(g gVar, ArrayList arrayList) throws EOFException {
        String strC;
        int iT;
        LinkedHashMap linkedHashMap;
        String strC2;
        while (true) {
            String strC3 = null;
            while (true) {
                if (strC3 == null) {
                    e(gVar);
                    strC3 = c(gVar);
                    if (strC3 == null) {
                        return;
                    }
                }
                boolean zE = e(gVar);
                strC = c(gVar);
                if (strC == null) {
                    if (gVar.p()) {
                        arrayList.add(new Challenge(strC3, a0.f22708a));
                        return;
                    }
                    return;
                }
                iT = Util.t(gVar);
                boolean zE2 = e(gVar);
                if (zE || (!zE2 && !gVar.p())) {
                    linkedHashMap = new LinkedHashMap();
                    int iT2 = Util.t(gVar) + iT;
                    while (true) {
                        if (strC == null) {
                            strC = c(gVar);
                            if (!e(gVar)) {
                                iT2 = Util.t(gVar);
                                if (iT2 == 0) {
                                    if (iT2 > 1 || e(gVar)) {
                                        return;
                                    }
                                    if (gVar.p() || gVar.z(0L) != 34) {
                                        strC2 = c(gVar);
                                    } else {
                                        if (gVar.readByte() != 34) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        g gVar2 = new g();
                                        while (true) {
                                            long jM = gVar.M(f19527a);
                                            if (jM == -1) {
                                                break;
                                            }
                                            if (gVar.z(jM) == 34) {
                                                gVar2.j(jM, gVar);
                                                gVar.readByte();
                                                strC2 = gVar2.e0();
                                                break;
                                            } else {
                                                if (gVar.f13061b == jM + 1) {
                                                    break;
                                                }
                                                gVar2.j(jM, gVar);
                                                gVar.readByte();
                                                gVar2.j(1L, gVar);
                                            }
                                        }
                                        strC2 = null;
                                    }
                                    if (strC2 == null || ((String) linkedHashMap.put(strC, strC2)) != null) {
                                        return;
                                    }
                                    if (!e(gVar) && !gVar.p()) {
                                        return;
                                    } else {
                                        strC = null;
                                    }
                                }
                            }
                        } else if (iT2 == 0) {
                            break;
                        }
                    }
                }
                arrayList.add(new Challenge(strC3, linkedHashMap));
                strC3 = strC;
            }
            StringBuilder sbA = q.a(strC);
            sbA.append(t.l(iT, "="));
            Map mapSingletonMap = Collections.singletonMap(null, sbA.toString());
            r.d(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            arrayList.add(new Challenge(strC3, mapSingletonMap));
        }
    }

    public static final String c(g gVar) {
        long jM = gVar.M(f19528b);
        if (jM == -1) {
            jM = gVar.f13061b;
        }
        if (jM != 0) {
            return gVar.d0(jM, a.f18238b);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(CookieJar cookieJar, HttpUrl url, Headers headers) throws NumberFormatException {
        int i10;
        List<Cookie> list;
        List<Cookie> listUnmodifiableList;
        z zVar;
        Cookie cookie;
        int i11;
        long j10;
        Cookie cookie2;
        r.e(cookieJar, "<this>");
        r.e(url, "url");
        r.e(headers, "headers");
        if (cookieJar == CookieJar.f19232a) {
            return;
        }
        Cookie.f19218j.getClass();
        int size = headers.size();
        int i12 = 0;
        int i13 = 0;
        ArrayList arrayList = null;
        while (true) {
            i10 = 2;
            if (i13 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(headers.e(i13))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.g(i13));
            }
            i13++;
        }
        z zVar2 = z.f22752a;
        if (arrayList != null) {
            List<Cookie> listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            r.d(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = zVar2;
        }
        int size2 = list.size();
        int i14 = 0;
        ArrayList arrayList2 = null;
        while (i14 < size2) {
            String setCookie = (String) list.get(i14);
            r.e(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c10 = ';';
            int iG = Util.g(setCookie, ';', i12, i12, 6);
            char c11 = '=';
            int iG2 = Util.g(setCookie, '=', i12, iG, i10);
            if (iG2 == iG) {
                zVar = zVar2;
                cookie = null;
                i11 = 0;
            } else {
                String strZ = Util.z(i12, iG2, setCookie);
                if (strZ.length() != 0 && Util.l(strZ) == -1) {
                    String strZ2 = Util.z(iG2 + 1, iG, setCookie);
                    if (Util.l(strZ2) == -1) {
                        int i15 = iG + 1;
                        int length = setCookie.length();
                        long j11 = -1;
                        long jB = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z10 = false;
                        boolean z11 = true;
                        boolean z12 = false;
                        boolean z13 = false;
                        while (true) {
                            if (i15 < length) {
                                z zVar3 = zVar2;
                                int iF = Util.f(setCookie, c10, i15, length);
                                int iF2 = Util.f(setCookie, c11, i15, iF);
                                String strZ3 = Util.z(i15, iF2, setCookie);
                                String strZ4 = iF2 < iF ? Util.z(iF2 + 1, iF, setCookie) : "";
                                if (strZ3.equalsIgnoreCase("expires")) {
                                    try {
                                        jB = Cookie.Companion.b(strZ4.length(), strZ4);
                                        z12 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strZ3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j11 = Long.parseLong(strZ4);
                                        if (j11 <= 0) {
                                            j11 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e10) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        r.d(patternCompile, "compile(...)");
                                        if (!patternCompile.matcher(strZ4).matches()) {
                                            throw e10;
                                        }
                                        j11 = t.p(strZ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z12 = true;
                                } else if (strZ3.equalsIgnoreCase("domain")) {
                                    if (t.i(strZ4, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strB = HostnamesKt.b(x.I(strZ4, "."));
                                    if (strB == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strB;
                                    z11 = false;
                                } else if (strZ3.equalsIgnoreCase("path")) {
                                    str = strZ4;
                                } else if (strZ3.equalsIgnoreCase("secure")) {
                                    z13 = true;
                                } else if (strZ3.equalsIgnoreCase("httponly")) {
                                    z10 = true;
                                }
                                i15 = iF + 1;
                                zVar2 = zVar3;
                                c11 = '=';
                                c10 = ';';
                            } else {
                                zVar = zVar2;
                                if (j11 == Long.MIN_VALUE) {
                                    j10 = Long.MIN_VALUE;
                                } else if (j11 != -1) {
                                    long j12 = jCurrentTimeMillis + (j11 <= 9223372036854775L ? j11 * DescriptorProtos.Edition.EDITION_2023_VALUE : Long.MAX_VALUE);
                                    j10 = (j12 < jCurrentTimeMillis || j12 > 253402300799999L) ? 253402300799999L : j12;
                                } else {
                                    j10 = jB;
                                }
                                String str3 = url.f19258d;
                                if (str2 == null) {
                                    str2 = str3;
                                } else if (!r.a(str3, str2) && (!t.i(str3, str2, false) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || Util.f19398f.e(str3))) {
                                    i11 = 0;
                                    cookie2 = null;
                                    cookie = cookie2;
                                }
                                if (str3.length() != str2.length()) {
                                    PublicSuffixDatabase.f19798e.getClass();
                                    if (PublicSuffixDatabase.f19801h.a(str2) == null) {
                                    }
                                    cookie = cookie2;
                                }
                                String strSubstring = "/";
                                i11 = 0;
                                if (str == null || !t.p(str, "/", false)) {
                                    String strB2 = url.b();
                                    int iC = x.C(strB2, '/', 0, 6);
                                    if (iC != 0) {
                                        strSubstring = strB2.substring(0, iC);
                                        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    str = strSubstring;
                                }
                                cookie2 = new Cookie(strZ, strZ2, j10, str2, str, z13, z10, z12, z11);
                                cookie = cookie2;
                            }
                        }
                    }
                }
            }
            if (cookie != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cookie);
            }
            i14++;
            i12 = i11;
            zVar2 = zVar;
            i10 = 2;
        }
        z zVar4 = zVar2;
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            r.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = zVar4;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        cookieJar.a(url, listUnmodifiableList);
    }

    public static final boolean e(g gVar) throws EOFException {
        boolean z10 = false;
        while (!gVar.p()) {
            byte bZ = gVar.z(0L);
            if (bZ == 44) {
                gVar.readByte();
                z10 = true;
            } else {
                if (bZ != 32 && bZ != 9) {
                    break;
                }
                gVar.readByte();
            }
        }
        return z10;
    }
}
