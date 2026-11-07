package okhttp3;

import hi.g;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jh.e;
import jh.j;
import kotlin.jvm.internal.r;
import l.b;
import m3.a;
import mh.t;
import mh.x;
import mh.y;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.bouncycastle.math.Primes;
import org.jf.dexlib2.analysis.RegisterType;
import qg.p;

/* loaded from: classes2.dex */
public final class HttpUrl {

    /* renamed from: j, reason: collision with root package name */
    public static final Companion f19253j = new Companion(0);

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f19254k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f19255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19256b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19257c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19258d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19259e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f19260f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19261g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19262h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19263i;

    public static final class Builder {

        /* renamed from: i, reason: collision with root package name */
        public static final Companion f19264i = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public String f19265a;

        /* renamed from: d, reason: collision with root package name */
        public String f19268d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f19270f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f19271g;

        /* renamed from: h, reason: collision with root package name */
        public String f19272h;

        /* renamed from: b, reason: collision with root package name */
        public String f19266b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f19267c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f19269e = -1;

        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f19270f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f19265a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f19253j;
            String strE = Companion.e(companion, this.f19266b, 0, 0, 7);
            String strE2 = Companion.e(companion, this.f19267c, 0, 0, 7);
            String str2 = this.f19268d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = this.f19269e;
            if (iB == -1) {
                String str3 = this.f19265a;
                r.b(str3);
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f19270f;
            ArrayList arrayList3 = new ArrayList(p.h(arrayList2, 10));
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList3.add(Companion.e(HttpUrl.f19253j, (String) obj, 0, 0, 7));
            }
            ArrayList arrayList4 = this.f19271g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(p.h(arrayList4, 10));
                int size2 = arrayList4.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    String str4 = (String) obj2;
                    arrayList.add(str4 != null ? Companion.e(HttpUrl.f19253j, str4, 0, 0, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f19272h;
            return new HttpUrl(str, strE, strE2, str2, iB, arrayList3, arrayList, str5 != null ? Companion.e(HttpUrl.f19253j, str5, 0, 0, 7) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(HttpUrl httpUrl, String str) throws NumberFormatException, EOFException {
            int i10;
            int iE;
            ArrayList arrayList;
            int i11;
            int i12;
            ArrayList arrayList2;
            int i13;
            ArrayList arrayList3;
            char cCharAt;
            String input = str;
            r.e(input, "input");
            byte[] bArr = Util.f19393a;
            int iM = Util.m(0, input.length(), input);
            int iN = Util.n(iM, input.length(), input);
            f19264i.getClass();
            if (iN - iM < 2) {
                i10 = -1;
            } else {
                char cCharAt2 = input.charAt(iM);
                if ((r.f(cCharAt2, 97) >= 0 && r.f(cCharAt2, 122) <= 0) || (r.f(cCharAt2, 65) >= 0 && r.f(cCharAt2, 90) <= 0)) {
                    i10 = iM + 1;
                    while (true) {
                        if (i10 >= iN) {
                            break;
                        }
                        char cCharAt3 = input.charAt(i10);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && (('0' > cCharAt3 || cCharAt3 >= ':') && cCharAt3 != '+' && cCharAt3 != '-' && cCharAt3 != '.'))) {
                            if (cCharAt3 != ':') {
                                break;
                            }
                        } else {
                            i10++;
                        }
                    }
                    i10 = -1;
                }
            }
            if (i10 == -1) {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(a.a("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? y.b0(6, input).concat("...") : input));
                }
                this.f19265a = httpUrl.f19255a;
            } else if (t.o(input, "https:", iM, true)) {
                this.f19265a = "https";
                iM += 6;
            } else {
                if (!t.o(input, "http:", iM, true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = input.substring(0, i10);
                    r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f19265a = "http";
                iM += 5;
            }
            int i14 = 0;
            for (int i15 = iM; i15 < iN && ((cCharAt = input.charAt(i15)) == '\\' || cCharAt == '/'); i15++) {
                i14++;
            }
            char c10 = '?';
            ArrayList arrayList4 = this.f19270f;
            char c11 = '#';
            if (i14 >= 2 || httpUrl == null || !r.a(httpUrl.f19255a, this.f19265a)) {
                int i16 = iM + i14;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iE = Util.e(i16, iN, input, "@/\\?#");
                    char cCharAt4 = iE != iN ? input.charAt(iE) : (char) 65535;
                    if (cCharAt4 == 65535 || cCharAt4 == c11 || cCharAt4 == '/' || cCharAt4 == '\\' || cCharAt4 == c10) {
                        break;
                    }
                    if (cCharAt4 == '@') {
                        if (z10) {
                            arrayList2 = arrayList4;
                            i13 = iE;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f19267c);
                            sb2.append("%40");
                            input = str;
                            sb2.append(Companion.a(HttpUrl.f19253j, input, i16, i13, " \"':;<=>@[]^`{}|/\\?#", 240));
                            this.f19267c = sb2.toString();
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            int iF = Util.f(input, ':', i16, iE);
                            Companion companion = HttpUrl.f19253j;
                            arrayList2 = arrayList5;
                            String strA = Companion.a(companion, input, i16, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                            if (z11) {
                                strA = this.f19266b + "%40" + strA;
                            }
                            this.f19266b = strA;
                            if (iF != iE) {
                                int i17 = iF + 1;
                                i13 = iE;
                                this.f19267c = Companion.a(companion, str, i17, i13, " \"':;<=>@[]^`{}|/\\?#", 240);
                                z10 = true;
                            } else {
                                i13 = iE;
                            }
                            input = str;
                            z11 = true;
                        }
                        i16 = i13 + 1;
                        arrayList4 = arrayList2;
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int i18 = i16;
                arrayList = arrayList4;
                int i19 = i18;
                while (true) {
                    if (i19 >= iE) {
                        i11 = iE;
                        break;
                    }
                    char cCharAt5 = input.charAt(i19);
                    if (cCharAt5 != '[') {
                        if (cCharAt5 == ':') {
                            i11 = i19;
                            break;
                        }
                    } else {
                        do {
                            i19++;
                            if (i19 < iE) {
                            }
                        } while (input.charAt(i19) != ']');
                    }
                    i19++;
                }
                int i20 = i11 + 1;
                if (i20 < iE) {
                    Companion companion2 = HttpUrl.f19253j;
                    this.f19268d = HostnamesKt.b(Companion.e(companion2, input, i18, i11, 4));
                    try {
                        i12 = Integer.parseInt(Companion.a(companion2, input, i20, iE, "", 248));
                    } catch (NumberFormatException unused) {
                    }
                    if (1 > i12 || i12 >= 65536) {
                        i12 = -1;
                    }
                    this.f19269e = i12;
                    if (i12 == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i20, iE);
                        r.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    this.f19268d = HostnamesKt.b(Companion.e(HttpUrl.f19253j, input, i18, i11, 4));
                    String str2 = this.f19265a;
                    r.b(str2);
                    this.f19269e = Companion.b(str2);
                }
                if (this.f19268d == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, i11);
                    r.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM = iE;
            } else {
                this.f19266b = httpUrl.e();
                this.f19267c = httpUrl.a();
                this.f19268d = httpUrl.f19258d;
                this.f19269e = httpUrl.f19259e;
                arrayList4.clear();
                arrayList4.addAll(httpUrl.c());
                if (iM == iN || input.charAt(iM) == '#') {
                    String strD = httpUrl.d();
                    this.f19271g = strD != null ? Companion.f(Companion.a(HttpUrl.f19253j, strD, 0, 0, " \"'<>#", Primes.SMALL_FACTOR_LIMIT)) : null;
                }
                arrayList = arrayList4;
            }
            int iE2 = Util.e(iM, iN, input, "?#");
            if (iM != iE2) {
                char cCharAt6 = input.charAt(iM);
                if (cCharAt6 == '/' || cCharAt6 == '\\') {
                    arrayList3 = arrayList;
                    arrayList3.clear();
                    arrayList3.add("");
                    iM++;
                } else {
                    arrayList3 = arrayList;
                    arrayList3.set(arrayList.size() - 1, "");
                }
                while (iM < iE2) {
                    int iE3 = Util.e(iM, iE2, input, "/\\");
                    boolean z12 = iE3 < iE2;
                    String strA2 = Companion.a(HttpUrl.f19253j, input, iM, iE3, " \"<>^`{}|/\\?#", 240);
                    if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) b.b(arrayList3, 1)).length() == 0) {
                                arrayList3.set(arrayList3.size() - 1, strA2);
                            } else {
                                arrayList3.add(strA2);
                            }
                            if (z12) {
                                arrayList3.add("");
                            }
                        } else if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                            arrayList3.add("");
                        } else {
                            arrayList3.set(arrayList3.size() - 1, "");
                        }
                    }
                    iM = z12 ? iE3 + 1 : iE3;
                }
            }
            if (iE2 < iN && input.charAt(iE2) == '?') {
                int iF2 = Util.f(input, '#', iE2, iN);
                this.f19271g = Companion.f(Companion.a(HttpUrl.f19253j, input, iE2 + 1, iF2, " \"'<>#", 208));
                iE2 = iF2;
            }
            if (iE2 >= iN || input.charAt(iE2) != '#') {
                return;
            }
            this.f19272h = Companion.a(HttpUrl.f19253j, input, iE2 + 1, iN, "", 176);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f19265a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f19266b.length() > 0 || this.f19267c.length() > 0) {
                sb.append(this.f19266b);
                if (this.f19267c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f19267c);
                }
                sb.append('@');
            }
            String str2 = this.f19268d;
            if (str2 != null) {
                if (x.s(str2, ':')) {
                    sb.append('[');
                    sb.append(this.f19268d);
                    sb.append(']');
                } else {
                    sb.append(this.f19268d);
                }
            }
            int iB = this.f19269e;
            if (iB != -1 || this.f19265a != null) {
                if (iB == -1) {
                    Companion companion = HttpUrl.f19253j;
                    String str3 = this.f19265a;
                    r.b(str3);
                    companion.getClass();
                    iB = Companion.b(str3);
                }
                String str4 = this.f19265a;
                if (str4 != null) {
                    HttpUrl.f19253j.getClass();
                    if (iB != Companion.b(str4)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
            }
            HttpUrl.f19253j.getClass();
            ArrayList arrayList = this.f19270f;
            r.e(arrayList, "<this>");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append('/');
                sb.append((String) arrayList.get(i10));
            }
            if (this.f19271g != null) {
                sb.append('?');
                Companion companion2 = HttpUrl.f19253j;
                ArrayList arrayList2 = this.f19271g;
                r.b(arrayList2);
                companion2.getClass();
                e eVarP = j.p(j.q(0, arrayList2.size()), 2);
                int i11 = eVarP.f15744a;
                int i12 = eVarP.f15745b;
                int i13 = eVarP.f15746c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        String str5 = (String) arrayList2.get(i11);
                        String str6 = (String) arrayList2.get(i11 + 1);
                        if (i11 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                        if (i11 == i12) {
                            break;
                        }
                        i11 += i13;
                    }
                }
            }
            if (this.f19272h != null) {
                sb.append('#');
                sb.append(this.f19272h);
            }
            String string = sb.toString();
            r.d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static String a(Companion companion, String str, int i10, int i11, String str2, int i12) throws EOFException {
            int i13 = (i12 & 1) != 0 ? 0 : i10;
            int length = (i12 & 2) != 0 ? str.length() : i11;
            boolean z10 = (i12 & 8) == 0;
            boolean z11 = (i12 & 16) == 0;
            boolean z12 = (i12 & 32) == 0;
            boolean z13 = (i12 & 64) == 0;
            companion.getClass();
            r.e(str, "<this>");
            int iCharCount = i13;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i14 = 128;
                int i15 = 32;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || x.s(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z12)))) {
                    g gVar = new g();
                    gVar.E0(i13, iCharCount, str);
                    g gVar2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z12) {
                                gVar.F0(z10 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i15 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z13) || x.s(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z10 || (z11 && !d(iCharCount, length, str)))))) {
                                if (gVar2 == null) {
                                    gVar2 = new g();
                                }
                                gVar2.G0(iCodePointAt2);
                                while (!gVar2.p()) {
                                    byte b10 = gVar2.readByte();
                                    gVar.q0(37);
                                    char[] cArr = HttpUrl.f19254k;
                                    gVar.q0(cArr[((b10 & 255) >> 4) & 15]);
                                    gVar.q0(cArr[b10 & RegisterType.DOUBLE_HI]);
                                }
                            } else {
                                gVar.G0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i14 = 128;
                        i15 = 32;
                    }
                    return gVar.e0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i13, length);
            r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static int b(String scheme) {
            r.e(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        public static HttpUrl c(String str) throws NumberFormatException, EOFException {
            r.e(str, "<this>");
            Builder builder = new Builder();
            builder.b(null, str);
            return builder.a();
        }

        public static boolean d(int i10, int i11, String str) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.q(str.charAt(i10 + 1)) != -1 && Util.q(str.charAt(i12)) != -1;
        }

        public static String e(Companion companion, String str, int i10, int i11, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            boolean z10 = (i12 & 4) == 0;
            companion.getClass();
            r.e(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    g gVar = new g();
                    gVar.E0(i10, iCharCount, str);
                    while (iCharCount < i11) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                            int iQ = Util.q(str.charAt(iCharCount + 1));
                            int iQ2 = Util.q(str.charAt(i13));
                            if (iQ == -1 || iQ2 == -1) {
                                gVar.G0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                gVar.q0((iQ << 4) + iQ2);
                                iCharCount = Character.charCount(iCodePointAt) + i13;
                            }
                        } else if (iCodePointAt == 43 && z10) {
                            gVar.q0(32);
                            iCharCount++;
                        } else {
                            gVar.G0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return gVar.e0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i10, i11);
            r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static ArrayList f(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iX = x.x(str, '&', i10, 4);
                if (iX == -1) {
                    iX = str.length();
                }
                int iX2 = x.x(str, '=', i10, 4);
                if (iX2 == -1 || iX2 > iX) {
                    String strSubstring = str.substring(i10, iX);
                    r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iX2);
                    r.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iX2 + 1, iX);
                    r.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iX + 1;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String str, String str2, String host, int i10, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        r.e(scheme, "scheme");
        r.e(host, "host");
        this.f19255a = scheme;
        this.f19256b = str;
        this.f19257c = str2;
        this.f19258d = host;
        this.f19259e = i10;
        this.f19260f = arrayList2;
        this.f19261g = str3;
        this.f19262h = str4;
        this.f19263i = scheme.equals("https");
    }

    public final String a() {
        if (this.f19257c.length() == 0) {
            return "";
        }
        int length = this.f19255a.length() + 3;
        String str = this.f19262h;
        String strSubstring = str.substring(x.x(str, ':', length, 4) + 1, x.x(str, '@', 0, 6));
        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f19255a.length() + 3;
        String str = this.f19262h;
        int iX = x.x(str, '/', length, 4);
        String strSubstring = str.substring(iX, Util.e(iX, str.length(), str, "?#"));
        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f19255a.length() + 3;
        String str = this.f19262h;
        int iX = x.x(str, '/', length, 4);
        int iE = Util.e(iX, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iX < iE) {
            int i10 = iX + 1;
            int iF = Util.f(str, '/', i10, iE);
            String strSubstring = str.substring(i10, iF);
            r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iX = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f19260f == null) {
            return null;
        }
        String str = this.f19262h;
        int iX = x.x(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iX, Util.f(str, '#', iX, str.length()));
        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f19256b.length() == 0) {
            return "";
        }
        int length = this.f19255a.length() + 3;
        String str = this.f19262h;
        String strSubstring = str.substring(length, Util.e(length, str.length(), str, ":@"));
        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && r.a(((HttpUrl) obj).f19262h, this.f19262h);
    }

    public final String f() throws EOFException {
        Builder builder;
        try {
            builder = new Builder();
            builder.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        r.b(builder);
        Companion companion = f19253j;
        builder.f19266b = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        builder.f19267c = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return builder.a().f19262h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        Builder builder = new Builder();
        String str = this.f19255a;
        builder.f19265a = str;
        builder.f19266b = e();
        builder.f19267c = a();
        builder.f19268d = this.f19258d;
        Companion companion = f19253j;
        companion.getClass();
        int iB = Companion.b(str);
        int i10 = this.f19259e;
        if (i10 == iB) {
            i10 = -1;
        }
        builder.f19269e = i10;
        ArrayList arrayList = builder.f19270f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        builder.f19271g = strD != null ? Companion.f(Companion.a(companion, strD, 0, 0, " \"'<>#", Primes.SMALL_FACTOR_LIMIT)) : null;
        if (this.f19261g == null) {
            strSubstring = null;
        } else {
            String str2 = this.f19262h;
            strSubstring = str2.substring(x.x(str2, '#', 0, 6) + 1);
            r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        builder.f19272h = strSubstring;
        String str3 = builder.f19268d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            r.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            r.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        builder.f19268d = strReplaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, Companion.a(f19253j, (String) arrayList.get(i11), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = builder.f19271g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str4 != null ? Companion.a(f19253j, str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = builder.f19272h;
        builder.f19272h = str5 != null ? Companion.a(f19253j, str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = builder.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                r.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                r.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                r.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f19262h.hashCode();
    }

    public final String toString() {
        return this.f19262h;
    }
}
