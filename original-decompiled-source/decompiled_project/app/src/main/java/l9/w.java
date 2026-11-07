package l9;

import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f16906a = qg.o.C(new String[]{"p", "li", "option", "td", "th", "tr", "thead", "tbody", "tfoot"});

    /* renamed from: b, reason: collision with root package name */
    public static final List<String> f16907b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f16908c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f16909a;

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f16910b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16911c;

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            ArrayList arrayList = null;
            this(arrayList, arrayList, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f16909a, aVar.f16909a) && kotlin.jvm.internal.r.a(this.f16910b, aVar.f16910b) && this.f16911c == aVar.f16911c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16911c) + a2.a.a(this.f16910b, this.f16909a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Result(errors=" + this.f16909a + ", warnings=" + this.f16910b + ", partial=" + this.f16911c + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [qg.z] */
        public /* synthetic */ a(ArrayList arrayList, List list, int i10) {
            int i11 = i10 & 1;
            ?? r12 = qg.z.f22752a;
            this(i11 != 0 ? r12 : arrayList, (List<String>) ((i10 & 2) != 0 ? r12 : list), (i10 & 4) == 0);
        }

        public a(List<String> errors, List<String> warnings, boolean z10) {
            kotlin.jvm.internal.r.e(errors, "errors");
            kotlin.jvm.internal.r.e(warnings, "warnings");
            this.f16909a = errors;
            this.f16910b = warnings;
            this.f16911c = z10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f16912a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f16913b;

        public b(int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f16912a = iArr;
            this.f16913b = iArr2;
        }
    }

    static {
        List<String> listJ = qg.p.j(ProjectKind.HTML, "head", "body", "div", "span", "script", "style", "p", "a", "button", "table", "tbody", "thead", "tfoot", "tr", "td", "th", "ul", "ol", "li", "form", "select", "option", "textarea", AnnotatedPrivateKey.LABEL, "h1", "h2", "h3", "h4", "h5", "h6");
        f16907b = listJ;
        qg.f0 f0Var = new qg.f0(new qg.v(listJ));
        int iA = qg.j0.a(qg.p.h(f0Var, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = f0Var.iterator();
        while (true) {
            qg.g0 g0Var = (qg.g0) it;
            if (!g0Var.f22722a.hasNext()) {
                f16908c = linkedHashMap;
                return;
            } else {
                qg.e0 e0Var = (qg.e0) g0Var.next();
                linkedHashMap.put(e0Var.f22720b, Integer.valueOf(e0Var.f22719a));
            }
        }
    }

    public static String a(String raw) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.r.e(raw, "raw");
        String string = mh.x.W(raw).toString();
        if (string.length() == 0) {
            return raw;
        }
        Pattern patternCompile = Pattern.compile("^(`{3,}|'{3,}|\"{3,})([a-zA-Z0-9_-]*)\\s*");
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(string);
        kotlin.jvm.internal.r.d(matcher, "matcher(...)");
        mh.i iVarA = mh.m.a(matcher, 0, string);
        List listJ = qg.p.j(Integer.valueOf(mh.x.y(string, "<!DOCTYPE", 0, true, 2)), Integer.valueOf(mh.x.y(string, "<html", 0, true, 2)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((Number) obj).intValue() >= 0) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) qg.x.M(arrayList);
        int iIntValue = num != null ? num.intValue() : -1;
        if (iVarA == null && iIntValue > 0) {
            List listJ2 = qg.p.j(Integer.valueOf(mh.x.y(string, "```", 0, false, 6)), Integer.valueOf(mh.x.y(string, "'''", 0, false, 6)), Integer.valueOf(mh.x.y(string, "\"\"\"", 0, false, 6)));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listJ2) {
                int iIntValue2 = ((Number) obj2).intValue();
                if (1 <= iIntValue2 && iIntValue2 < iIntValue) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                Integer num2 = (Integer) qg.x.M(arrayList2);
                String strSubstring = string.substring(num2 != null ? num2.intValue() : -1);
                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                Matcher matcher2 = patternCompile.matcher(strSubstring);
                kotlin.jvm.internal.r.d(matcher2, "matcher(...)");
                mh.i iVarA2 = mh.m.a(matcher2, 0, strSubstring);
                if (iVarA2 != null) {
                    iVarA = iVarA2;
                    string = strSubstring;
                }
            }
        }
        if (iVarA == null) {
            return string;
        }
        String strSubstring2 = string.substring(iVarA.b().f15745b + 1);
        kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
        char[] cArr = {'\r', '\n', ' ', '\t'};
        int length = strSubstring2.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!qg.o.q(cArr, strSubstring2.charAt(i10))) {
                charSequenceSubSequence = strSubstring2.subSequence(i10, strSubstring2.length());
                break;
            }
            i10++;
        }
        String input = charSequenceSubSequence.toString();
        Pattern patternCompile2 = Pattern.compile("\\s*(`{3,}|'{3,}|\"{3,})\\s*$");
        kotlin.jvm.internal.r.d(patternCompile2, "compile(...)");
        kotlin.jvm.internal.r.e(input, "input");
        Matcher matcher3 = patternCompile2.matcher(input);
        kotlin.jvm.internal.r.d(matcher3, "matcher(...)");
        mh.i iVarA3 = mh.m.a(matcher3, 0, input);
        if (iVarA3 != null) {
            String strSubstring3 = input.substring(0, iVarA3.b().f15744a);
            kotlin.jvm.internal.r.d(strSubstring3, "substring(...)");
            return mh.x.Y(strSubstring3, '\r', '\n', ' ', '\t');
        }
        int iB = mh.x.B(2, input, "</html>");
        int i11 = iB != -1 ? iB + 7 : -1;
        int iB2 = mh.x.B(2, input, "</body>");
        int iMax = Math.max(i11, iB2 != -1 ? iB2 + 7 : -1);
        if (iMax == -1) {
            return input;
        }
        List listJ3 = qg.p.j(Integer.valueOf(mh.x.y(input, "```", iMax, false, 4)), Integer.valueOf(mh.x.y(input, "'''", iMax, false, 4)), Integer.valueOf(mh.x.y(input, "\"\"\"", iMax, false, 4)));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listJ3) {
            if (((Number) obj3).intValue() >= iMax) {
                arrayList3.add(obj3);
            }
        }
        Integer num3 = (Integer) qg.x.M(arrayList3);
        if (num3 == null) {
            return input;
        }
        String strSubstring4 = input.substring(0, num3.intValue());
        kotlin.jvm.internal.r.d(strSubstring4, "substring(...)");
        return mh.x.Y(strSubstring4, '\r', '\n', ' ', '\t');
    }

    public static final pg.n<Integer, Integer> b(b bVar, String str) {
        Integer num = (Integer) f16908c.get(str);
        if (num == null) {
            return new pg.n<>(0, 0);
        }
        int iIntValue = num.intValue();
        return new pg.n<>(Integer.valueOf(bVar.f16912a[iIntValue]), Integer.valueOf(bVar.f16913b[iIntValue]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[PHI: r14 r22 r25
      0x00dc: PHI (r14v4 boolean) = (r14v2 boolean), (r14v8 boolean) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r22v6 boolean) = (r22v23 boolean), (r22v11 boolean) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r25v4 java.util.List<java.lang.String>) = (r25v7 java.util.List<java.lang.String>), (r25v8 java.util.List<java.lang.String>) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[PHI: r2 r14 r22 r25
      0x00de: PHI (r2v22 int) = (r2v33 int), (r2v37 int) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r14v7 boolean) = (r14v2 boolean), (r14v8 boolean) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r22v9 boolean) = (r22v18 boolean), (r22v14 boolean) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r25v6 java.util.List<java.lang.String>) = (r25v7 java.util.List<java.lang.String>), (r25v8 java.util.List<java.lang.String>) binds: [B:51:0x0104, B:39:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r22v2, types: [int] */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(String html) {
        boolean z10;
        List<String> list;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int iX;
        ?? r92;
        boolean z18;
        kotlin.jvm.internal.r.e(html, "html");
        String string = mh.x.W(html).toString();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 4;
        if (string.length() == 0) {
            arrayList.add("HTML content is empty.");
            return new a(arrayList, arrayList2, i11);
        }
        List<String> list2 = f16907b;
        int[] iArr = new int[list2.size()];
        int[] iArr2 = new int[list2.size()];
        long jCurrentTimeMillis = System.currentTimeMillis() + 1500;
        int length = string.length();
        boolean z19 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        while (true) {
            if (i12 >= length) {
                z10 = z19;
                list = list2;
                break;
            }
            if (i12 - i13 < 32768) {
                i10 = i13;
            } else {
                if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    z11 = z19;
                    list = list2;
                    z13 = true;
                    z12 = true;
                    break;
                }
                i10 = i12;
            }
            if (string.charAt(i12) != '<') {
                i12++;
            } else {
                int i14 = i12 + 3;
                if (i14 < length && string.charAt(i12 + 1) == '!' && string.charAt(i12 + 2) == '-' && string.charAt(i14) == '-') {
                    int iY = mh.x.y(string, "-->", i12 + 4, z19, i11);
                    i12 = iY == -1 ? length : iY + 3;
                } else {
                    int i15 = -1;
                    int i16 = i12 + 1;
                    if (i16 >= length) {
                        z10 = z19;
                    } else if (string.charAt(i16) == '!') {
                        int i17 = i12;
                        list = list2;
                        z14 = false;
                        z17 = false;
                        if (mh.t.k(i17, 0, 9, string, "<!DOCTYPE", true)) {
                            z24 = true;
                        }
                        iX = mh.x.x(string, '>', i17 + 2, i11);
                        if (iX == -1) {
                            i12 = length;
                            z16 = z14;
                        } else {
                            i12 = iX + 1;
                            z16 = z17;
                        }
                        list2 = list;
                        z15 = z16;
                        i13 = i10;
                        z19 = z15;
                    } else {
                        i15 = -1;
                        z10 = false;
                    }
                    int i18 = i12;
                    list = list2;
                    if (i16 >= length || string.charAt(i16) != '?') {
                        boolean z25 = (i16 >= length || string.charAt(i16) != '/') ? z10 ? 1 : 0 : true;
                        int i19 = z25 ? i18 + 2 : i16;
                        int i20 = i19;
                        while (i20 < length && Character.isLetterOrDigit(string.charAt(i20))) {
                            i20++;
                        }
                        if (i20 == i19) {
                            list2 = list;
                            i12 = i16;
                            z15 = z10;
                            i13 = i10;
                            z19 = z15;
                        } else {
                            String strSubstring = string.substring(i19, i20);
                            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                            int iX2 = mh.x.x(string, '>', i20, i11);
                            if (iX2 == -1) {
                                break;
                            }
                            if (z25) {
                                r92 = 1;
                            } else if (lowerCase.equals("meta")) {
                                String strSubstring2 = string.substring(i20, iX2);
                                kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
                                if (z21) {
                                    z18 = true;
                                } else {
                                    z18 = true;
                                    z18 = true;
                                    if (mh.x.r(strSubstring2, "charset", true)) {
                                        z21 = true;
                                    }
                                }
                                if (z22 || !mh.x.r(strSubstring2, "viewport", z18)) {
                                    z20 = z18 ? 1 : 0;
                                    r92 = z18;
                                } else {
                                    z20 = z18 ? 1 : 0;
                                    z22 = z20;
                                    r92 = z18;
                                }
                            } else {
                                r92 = 1;
                                r92 = 1;
                                if (lowerCase.equals("title")) {
                                    z23 = true;
                                }
                            }
                            Integer num = (Integer) f16908c.get(lowerCase);
                            if (num != null) {
                                if (z25) {
                                    iArr2[num.intValue()] = iArr2[num.intValue()] + r92;
                                } else if (iX2 <= i20 || string.charAt(iX2 - 1) != '/') {
                                    iArr[num.intValue()] = iArr[num.intValue()] + r92;
                                }
                            }
                            if (z25 || !(lowerCase.equals("script") || lowerCase.equals("style"))) {
                                i12 = iX2 + 1;
                            } else {
                                int iV = mh.x.v(string, "</".concat(lowerCase), iX2 + 1, r92);
                                i12 = iV == -1 ? length : iV;
                            }
                            list2 = list;
                            i13 = i10;
                            z19 = z10 ? 1 : 0;
                            i11 = 4;
                        }
                    } else {
                        iX = mh.x.x(string, '>', i18 + 2, i11);
                        z17 = z10;
                        z14 = z10;
                        if (iX == i15) {
                        }
                        list2 = list;
                        z15 = z16;
                        i13 = i10;
                        z19 = z15;
                    }
                }
            }
            i13 = i10;
        }
        z12 = true;
        z13 = z10 ? 1 : 0;
        z11 = z10;
        boolean z26 = z20;
        boolean z27 = z21;
        boolean z28 = z22;
        boolean z29 = z23;
        boolean z30 = z13;
        b bVar = new b(iArr, iArr2, z24, z26, z27, z28, z29, z30);
        if (!z24) {
            arrayList2.add("Missing <!DOCTYPE html> declaration.");
        }
        if (z26) {
            if (!z27) {
                arrayList2.add("Missing charset meta tag (e.g. <meta charset=\"UTF-8\">).");
            }
            if (!z28) {
                arrayList2.add("Missing viewport meta tag.");
            }
        } else {
            arrayList2.add("No <meta> tags found; charset/viewport may be missing.");
        }
        if (!z29) {
            arrayList2.add("Missing <title> tag.");
        }
        if (z30) {
            arrayList2.add("Large file: the structural scan hit its time budget, so tag balance was not verified. The build itself is unaffected.");
            return new a(arrayList, arrayList2, z12);
        }
        pg.n<Integer, Integer> nVarB = b(bVar, ProjectKind.HTML);
        Integer num2 = nVarB.f21469a;
        if (num2.intValue() == 0 || num2.intValue() != nVarB.f21470b.intValue()) {
            arrayList.add("Missing or unbalanced <html> tag.");
        }
        pg.n<Integer, Integer> nVarB2 = b(bVar, "head");
        Integer num3 = nVarB2.f21469a;
        if (num3.intValue() == 0 || num3.intValue() != nVarB2.f21470b.intValue()) {
            arrayList2.add("Missing or unbalanced <head> section.");
        }
        pg.n<Integer, Integer> nVarB3 = b(bVar, "body");
        Integer num4 = nVarB3.f21469a;
        if (num4.intValue() == 0 || num4.intValue() != nVarB3.f21470b.intValue()) {
            arrayList.add("Missing or unbalanced <body> section.");
        }
        ?? r22 = z11;
        for (String str : list) {
            int i21 = r22 + 1;
            if (bVar.f16912a[r22] != bVar.f16913b[r22]) {
                int iHashCode = str.hashCode();
                if (iHashCode != 3029410) {
                    if (iHashCode != 3198432) {
                        if (iHashCode != 3213227 || !str.equals(ProjectKind.HTML)) {
                            pg.n<Integer, Integer> nVarB4 = b(bVar, str);
                            String strA = x0.a.a(androidx.datastore.preferences.protobuf.h.a(nVarB4.f21469a.intValue(), "Unbalanced <", str, ">: ", " open, "), nVarB4.f21470b.intValue(), " close.");
                            if (f16906a.contains(str)) {
                                arrayList2.add(strA);
                            } else {
                                arrayList.add(strA);
                            }
                        }
                    } else if (!str.equals("head")) {
                    }
                } else if (!str.equals("body")) {
                }
            }
            r22 = i21;
        }
        return new a(arrayList, arrayList2, 4);
    }
}
