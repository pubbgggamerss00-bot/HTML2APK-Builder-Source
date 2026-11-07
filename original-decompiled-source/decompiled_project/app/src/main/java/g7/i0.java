package g7;

import java.util.ArrayList;
import java.util.List;
import qg.c;

/* loaded from: classes.dex */
public final class i0 {
    public static h0 a(String str) {
        String str2 = hi.b0.f13033b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new h0(sb.toString(), str2, "file", null, str);
    }

    public static final String b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final String c(h0 h0Var) {
        List listD = d(h0Var);
        String str = h0Var.f11505b;
        if (listD.isEmpty()) {
            return null;
        }
        String str2 = h0Var.f11508e;
        kotlin.jvm.internal.r.b(str2);
        if (!mh.t.p(str2, str, false)) {
            str = "";
        }
        return qg.x.I(listD, h0Var.f11505b, str, null, null, 60);
    }

    public static final List d(h0 h0Var) {
        String str = h0Var.f11508e;
        if (str == null) {
            return qg.z.f22752a;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            int iX = mh.x.x(str, '/', i11, 4);
            if (iX == -1) {
                iX = str.length();
            }
            String strSubstring = str.substring(i11, iX);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i10 = iX;
        }
        return arrayList;
    }

    public static final long e(hh.c cVar, jh.i iVar) {
        kotlin.jvm.internal.r.e(cVar, "<this>");
        long j10 = iVar.f15756a;
        long j11 = iVar.f15757b;
        if (j10 <= j11) {
            return j11 < Long.MAX_VALUE ? cVar.f(j10, j11 + 1) : j10 > Long.MIN_VALUE ? cVar.f(j10 - 1, j11) + 1 : cVar.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
    }

    public static final String f(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMax) {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    c.a.a(0, i11, bArr.length);
                    return new String(bArr, 0, i11, mh.a.f18238b);
                }
            } else if (str.charAt(i10) == '%') {
                int i12 = i10 + 3;
                try {
                    String strSubstring = str.substring(i10 + 1, i12);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    g8.w.h(16);
                    bArr[i11] = (byte) Integer.parseInt(strSubstring, 16);
                    i11++;
                    i10 = i12;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
        }
    }

    public static h0 g(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = hi.b0.f13033b;
        String strN = !kotlin.jvm.internal.r.a(str2, "/") ? mh.t.n(str, str2, "/") : str;
        int i10 = 0;
        boolean z10 = true;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (i10 < strN.length()) {
            char cCharAt = strN.charAt(i10);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i13 == -1 && i11 == -1) {
                            i13 = i10 + 1;
                        }
                    } else if (z10 && i13 == -1 && i11 == -1) {
                        int i16 = i10 + 2;
                        if (i16 < str.length() && str.charAt(i10 + 1) == '/' && str.charAt(i16) == '/') {
                            i14 = i10 + 3;
                            z10 = false;
                            i15 = i10;
                            i10 = i16;
                        } else if (strN.equals(str)) {
                            i12 = i10 + 1;
                            i15 = i10;
                            i10 = i12;
                            i14 = i10;
                        }
                    }
                } else if (i12 == -1 && i13 == -1 && i11 == -1) {
                    i12 = i14 == -1 ? 0 : i10;
                    z10 = false;
                }
            } else if (i11 == -1) {
                i11 = i10 + 1;
            }
            i10++;
        }
        int iMin = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, strN.length());
        int iMin2 = Math.min(i13 == -1 ? Integer.MAX_VALUE : i13 - 1, iMin);
        if (i14 != -1) {
            strSubstring2 = strN.substring(0, i15);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            strSubstring = strN.substring(i14, Math.min(i12 != -1 ? i12 : Integer.MAX_VALUE, iMin2));
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i12 != -1) {
            strSubstring3 = strN.substring(i12, iMin2);
            kotlin.jvm.internal.r.d(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i13 != -1) {
            strSubstring4 = strN.substring(i13, iMin);
            kotlin.jvm.internal.r.d(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i11 != -1) {
            strSubstring5 = strN.substring(i11, strN.length());
            kotlin.jvm.internal.r.d(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strF = strSubstring2 != null ? f(strSubstring2, bArr) : null;
        String strF2 = strSubstring != null ? f(strSubstring, bArr) : null;
        String strF3 = strSubstring3 != null ? f(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            f(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            f(strSubstring5, bArr);
        }
        return new h0(strN, str2, strF, strF2, strF3);
    }
}
