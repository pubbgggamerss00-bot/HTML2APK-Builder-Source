package okhttp3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import l0.k;
import mh.x;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import r.e2;
import r.o2;

/* loaded from: classes2.dex */
public final class Cookie {

    /* renamed from: j, reason: collision with root package name */
    public static final Companion f19218j = new Companion(0);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f19219k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f19220l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f19221m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f19222n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f19223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19225c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19226d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19228f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19229g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19230h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19231i;

    public static final class Builder {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static long b(int i10, String str) throws NumberFormatException {
            int iA = a(str, 0, i10, false);
            Matcher matcher = Cookie.f19222n.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iY = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(str, iA + 1, i10, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(Cookie.f19222n).matches()) {
                    String strGroup = matcher.group(1);
                    r.d(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    r.d(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    r.d(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(Cookie.f19221m).matches()) {
                    String strGroup4 = matcher.group(1);
                    r.d(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iY == -1) {
                    Pattern pattern = Cookie.f19220l;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        r.d(strGroup5, "matcher.group(1)");
                        Locale US = Locale.US;
                        r.d(US, "US");
                        String lowerCase = strGroup5.toLowerCase(US);
                        r.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        r.d(strPattern, "MONTH_PATTERN.pattern()");
                        iY = x.y(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i11 == -1 && matcher.usePattern(Cookie.f19219k).matches()) {
                        String strGroup6 = matcher.group(1);
                        r.d(strGroup6, "matcher.group(1)");
                        i11 = Integer.parseInt(strGroup6);
                    }
                }
                iA = a(str, iA2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iY == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i13 || i13 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f19397e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iY - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19223a = str;
        this.f19224b = str2;
        this.f19225c = j10;
        this.f19226d = str3;
        this.f19227e = str4;
        this.f19228f = z10;
        this.f19229g = z11;
        this.f19230h = z12;
        this.f19231i = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return r.a(cookie.f19223a, this.f19223a) && r.a(cookie.f19224b, this.f19224b) && cookie.f19225c == this.f19225c && r.a(cookie.f19226d, this.f19226d) && r.a(cookie.f19227e, this.f19227e) && cookie.f19228f == this.f19228f && cookie.f19229g == this.f19229g && cookie.f19230h == this.f19230h && cookie.f19231i == this.f19231i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19231i) + o2.a(o2.a(o2.a(k.a(k.a(e2.a(k.a(k.a(527, 31, this.f19223a), 31, this.f19224b), 31, this.f19225c), 31, this.f19226d), 31, this.f19227e), 31, this.f19228f), 31, this.f19229g), 31, this.f19230h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19223a);
        sb.append('=');
        sb.append(this.f19224b);
        if (this.f19230h) {
            long j10 = this.f19225c;
            if (j10 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = DatesKt.f19526a.get().format(new Date(j10));
                r.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f19231i) {
            sb.append("; domain=");
            sb.append(this.f19226d);
        }
        sb.append("; path=");
        sb.append(this.f19227e);
        if (this.f19228f) {
            sb.append("; secure");
        }
        if (this.f19229g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        r.d(string, "toString()");
        return string;
    }
}
