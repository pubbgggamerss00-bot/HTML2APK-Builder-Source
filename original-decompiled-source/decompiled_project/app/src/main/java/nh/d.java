package nh;

import g8.w;
import jh.j;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import mh.y;
import nh.b;

/* loaded from: classes2.dex */
public final class d {
    public static final long a(String str) throws NumberFormatException {
        e eVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.a aVar = b.f18809b;
        char cCharAt2 = str.charAt(0);
        int i10 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = i10 > 0 && str.length() > 0 && w.i(str.charAt(0), '-', false);
        if (length <= i10) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i10) != 'P') {
            throw new IllegalArgumentException();
        }
        int i11 = i10 + 1;
        if (i11 == length) {
            throw new IllegalArgumentException();
        }
        e eVar2 = null;
        long jG = 0;
        boolean z11 = false;
        while (i11 < length) {
            if (str.charAt(i11) != 'T') {
                int i12 = i11;
                while (i12 < str.length() && (('0' <= (cCharAt = str.charAt(i12)) && cCharAt < ':') || x.s("+-.", cCharAt))) {
                    i12++;
                }
                String strSubstring = str.substring(i11, i12);
                r.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i11;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i13 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        eVar = e.f18818f;
                    } else if (cCharAt3 == 'M') {
                        eVar = e.f18817e;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        eVar = e.f18816d;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    eVar = e.f18819g;
                }
                if (eVar2 != null && eVar2.compareTo(eVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iX = x.x(strSubstring, '.', 0, 6);
                if (eVar != e.f18816d || iX <= 0) {
                    jG = b.g(jG, g(e(strSubstring), eVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iX);
                    r.d(strSubstring2, "substring(...)");
                    long jG2 = b.g(jG, g(e(strSubstring2), eVar));
                    String strSubstring3 = strSubstring.substring(iX);
                    r.d(strSubstring3, "substring(...)");
                    double d10 = Double.parseDouble(strSubstring3);
                    double dA = cc.d.a(d10, eVar, e.f18814b);
                    if (Double.isNaN(dA)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jC = gh.a.c(dA);
                    jG = b.g(jG2, (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? c(gh.a.c(cc.d.a(d10, eVar, e.f18815c))) : d(jC));
                }
                eVar2 = eVar;
                i11 = i13;
            } else {
                if (z11 || (i11 = i11 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? b.i(jG) : jG;
    }

    public static final long b(long j10) {
        long j11 = (j10 << 1) + 1;
        b.a aVar = b.f18809b;
        int i10 = c.f18813a;
        return j11;
    }

    public static final long c(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? b(j.n(j10, -4611686018427387903L, 4611686018427387903L)) : d(j10 * 1000000);
    }

    public static final long d(long j10) {
        long j11 = j10 << 1;
        b.a aVar = b.f18809b;
        int i10 = c.f18813a;
        return j11;
    }

    public static final long e(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !x.s("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!t.p(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(y.Z(1, str));
    }

    public static final long f(int i10, e unit) {
        r.e(unit, "unit");
        return unit.compareTo(e.f18816d) <= 0 ? d(cc.d.c(i10, unit, e.f18814b)) : g(i10, unit);
    }

    public static final long g(long j10, e unit) {
        r.e(unit, "unit");
        e eVar = e.f18814b;
        long jC = cc.d.c(4611686018426999999L, eVar, unit);
        return ((-jC) > j10 || j10 > jC) ? b(j.n(cc.d.b(j10, unit, e.f18815c), -4611686018427387903L, 4611686018427387903L)) : d(cc.d.c(j10, unit, eVar));
    }
}
