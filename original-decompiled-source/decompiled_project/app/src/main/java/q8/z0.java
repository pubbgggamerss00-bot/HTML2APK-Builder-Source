package q8;

import java.util.Set;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f22504a = qg.o.C(new String[]{"area", "base", "br", "col", "embed", "hr", "img", "input", "link", "meta", "param", "source", "track", "wbr"});

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f22505b = qg.o.C(new String[]{"var", "let", "const", "function", "return", "if", "else", "for", "while", "do", "switch", "case", "break", "continue", "new", "this", "typeof", "instanceof", "try", "catch", "finally", "throw", "class", "extends", "import", "export", "from", "default", "async", "await", "yield", "true", "false", "null", "undefined", "in", "of", "delete", "void", "super", "static", "get", "set"});

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f22506a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f22507b;

        public a(String text, int[] iArr) {
            kotlin.jvm.internal.r.e(text, "text");
            this.f22506a = text;
            this.f22507b = iArr;
        }
    }

    public static long a(int i10) {
        int i11 = (i10 >> 6) & 3;
        int i12 = (i11 == 1 && (i10 & 32) == 0) ? 8 : (i11 == 2 && (i10 & 32) == 0) ? 14 : 0;
        if (i12 == 0) {
            i11 = 0;
        }
        return i(i12 | (i11 << 6), 1);
    }

    public static boolean b(CharSequence charSequence, int i10, int i11) {
        if (charSequence.charAt(i10) == '<') {
            int i12 = (i11 >> 6) & 3;
            if (i12 != 1 ? i12 != 2 ? false : f(i10, charSequence, "</style") : f(i10, charSequence, "</script")) {
                return true;
            }
        }
        return false;
    }

    public static int c(int i10, int i11, int i12) {
        return (i10 & 65535) | (i11 << 12) | (jh.j.m(i12, 0, 255) << 16);
    }

    public static boolean d(char c10) {
        return Character.isLetterOrDigit(c10) || c10 == '_' || c10 == '$';
    }

    public static boolean e(char c10) {
        return Character.isLetterOrDigit(c10) || c10 == '-' || c10 == ':' || c10 == '_' || c10 == '.';
    }

    public static boolean f(int i10, CharSequence charSequence, String str) {
        if (str.length() + i10 <= charSequence.length()) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (Character.toLowerCase(charSequence.charAt(i10 + i11)) == str.charAt(i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public static long g(CharSequence text, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.r.e(text, "text");
        int i15 = (i11 >>> 16) & 255;
        if (i15 > 0) {
            int i16 = (i11 >> 12) & 15;
            return i(c(i11, i16, i15 - 1), i16);
        }
        char cCharAt = text.charAt(i10);
        int iJ = 65535 & i11;
        int i17 = i11 & 31;
        switch (i17) {
            case 0:
                if (cCharAt == '<' && (i12 = i10 + 1) < text.length()) {
                    char cCharAt2 = text.charAt(i12);
                    return f(i10, text, "<!--") ? i(c((int) (i(j(iJ, 6), 4) >>> 8), 4, 3), 4) : (cCharAt2 == '!' || cCharAt2 == '?') ? i(j(iJ, 7), 5) : (Character.isLetter(cCharAt2) || (cCharAt2 == '/' && (i13 = i10 + 2) < text.length() && Character.isLetter(text.charAt(i13)))) ? h(text, i10) : i(iJ, 0);
                }
                if (cCharAt == '&') {
                    int i18 = i10 + 1;
                    int i19 = i18;
                    while (i19 < text.length() && i19 - i10 <= 12 && (Character.isLetterOrDigit(text.charAt(i19)) || text.charAt(i19) == '#')) {
                        i19++;
                    }
                    if (i19 < text.length() && i19 > i18 && text.charAt(i19) == ';') {
                        return i(c(iJ, 7, i19 - i10), 7);
                    }
                }
                return i(iJ, 0);
            case 1:
                return cCharAt == '>' ? a(iJ) : g8.w.j(cCharAt) ? i(j(iJ, 2), 0) : i(iJ, 1);
            case 2:
                if (cCharAt == '>') {
                    return a(iJ);
                }
                if (cCharAt == '/') {
                    return i(iJ, 1);
                }
                if (cCharAt == '\"') {
                    return i(j(iJ, 3), 3);
                }
                if (cCharAt == '\'') {
                    return i(j(iJ, 4), 3);
                }
                if (cCharAt != '=') {
                    return g8.w.j(cCharAt) ? i(iJ, 0) : i(iJ, 2);
                }
                int i20 = i10 + 1;
                char cCharAt3 = i20 < text.length() ? text.charAt(i20) : ' ';
                if (cCharAt3 != '\"' && cCharAt3 != '\'' && cCharAt3 != '>' && !g8.w.j(cCharAt3)) {
                    iJ = j(iJ, 5);
                }
                return i(iJ, 0);
            case 3:
            case 4:
                if (cCharAt == (i17 != 3 ? '\'' : '\"')) {
                    iJ = j(iJ, 2);
                }
                return i(iJ, 3);
            case 5:
                return cCharAt == '>' ? a(iJ) : g8.w.j(cCharAt) ? i(j(iJ, 2), 0) : i(iJ, 3);
            case 6:
                if (cCharAt == '>' && i10 >= 2 && text.charAt(i10 - 1) == '-' && text.charAt(i10 - 2) == '-') {
                    iJ = j(iJ, 0);
                }
                return i(iJ, 4);
            case 7:
                if (cCharAt == '>') {
                    iJ = j(iJ, 0);
                }
                return i(iJ, 5);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (b(text, i10, iJ)) {
                    return h(text, i10);
                }
                int i21 = i10 + 1;
                char cCharAt4 = i21 < text.length() ? text.charAt(i21) : (char) 0;
                switch (i17) {
                    case 9:
                    case 10:
                    case 11:
                        return cCharAt == '\\' ? i(c(iJ, 3, 1), 3) : (cCharAt == (i17 != 9 ? i17 != 10 ? '`' : '\'' : '\"') || (cCharAt == '\n' && i17 != 11)) ? i(j(iJ, 8), 3) : i(iJ, 3);
                    case 12:
                        if (cCharAt == '\n') {
                            iJ = j(iJ, 8);
                        }
                        return i(iJ, 4);
                    case 13:
                        if (cCharAt == '/' && i10 > 0 && text.charAt(i10 - 1) == '*') {
                            iJ = j(iJ, 8);
                        }
                        return i(iJ, 4);
                    default:
                        return cCharAt == '\"' ? i(j(iJ, 9), 3) : cCharAt == '\'' ? i(j(iJ, 10), 3) : cCharAt == '`' ? i(j(iJ, 11), 3) : (cCharAt == '/' && cCharAt4 == '/') ? i(j(iJ, 12), 4) : (cCharAt == '/' && cCharAt4 == '*') ? i(c(j(iJ, 13), 4, 1), 4) : (!d(cCharAt) || (i10 != 0 && d(text.charAt(i10 + (-1))))) ? i(iJ, 0) : k(text, i10, cCharAt, iJ, f22505b);
                }
            default:
                if (b(text, i10, iJ)) {
                    return h(text, i10);
                }
                switch (i17) {
                    case 15:
                    case 16:
                        if (cCharAt == (i17 != 15 ? '\'' : '\"') || cCharAt == '\n') {
                            iJ = j(iJ, 14);
                        }
                        return i(iJ, 3);
                    case 17:
                        if (cCharAt == '/' && i10 > 0 && text.charAt(i10 - 1) == '*') {
                            iJ = j(iJ, 14);
                        }
                        return i(iJ, 4);
                    default:
                        int i22 = (iJ >> 8) & 3;
                        boolean z10 = i22 > 0;
                        if (cCharAt == '/' && (i14 = i10 + 1) < text.length() && text.charAt(i14) == '*') {
                            return i(c(j(iJ, 17), 4, 1), 4);
                        }
                        if (cCharAt == '\"') {
                            return i(j(iJ, 15), 3);
                        }
                        if (cCharAt == '\'') {
                            return i(j(iJ, 16), 3);
                        }
                        if (cCharAt == '{') {
                            int i23 = i22 + 1;
                            return i((i11 & 64767) | ((i23 <= 3 ? i23 : 3) << 8), 0);
                        }
                        if (cCharAt == '}') {
                            int i24 = i11 & 64767;
                            int i25 = i22 - 1;
                            if (i25 < 0) {
                                i25 = 0;
                            }
                            return i(i24 | (i25 << 8), 0);
                        }
                        if (cCharAt == '@') {
                            int i26 = i10 + 1;
                            while (i26 < text.length() && i26 - i10 < 64 && e(text.charAt(i26))) {
                                i26++;
                            }
                            return i(c(iJ, 5, (i26 - i10) - 1), 5);
                        }
                        if (cCharAt == '#' && z10) {
                            int i27 = i10 + 1;
                            while (i27 < text.length() && i27 - i10 < 10 && Character.isLetterOrDigit(text.charAt(i27))) {
                                i27++;
                            }
                            return i(c(iJ, 6, (i27 - i10) - 1), 6);
                        }
                        if (Character.isDigit(cCharAt) && (i10 == 0 || !e(text.charAt(i10 - 1)))) {
                            return k(text, i10, cCharAt, iJ, null);
                        }
                        if (!z10 || (!(Character.isLetter(cCharAt) || cCharAt == '-') || (i10 != 0 && e(text.charAt(i10 - 1))))) {
                            return (z10 || g8.w.j(cCharAt) || cCharAt == ',' || cCharAt == '>' || cCharAt == '+' || cCharAt == '~') ? i(iJ, 0) : i(iJ, 1);
                        }
                        int i28 = i10 + 1;
                        while (i28 < text.length() && i28 - i10 < 64 && e(text.charAt(i28)) && text.charAt(i28) != ':') {
                            i28++;
                        }
                        int i29 = i28;
                        while (i29 < text.length() && i29 - i10 < 64 && text.charAt(i29) == ' ') {
                            i29++;
                        }
                        int i30 = (i29 >= text.length() || text.charAt(i29) != ':') ? 0 : 2;
                        return i(c(iJ, i30, (i28 - i10) - 1), i30);
                }
        }
    }

    public static long h(CharSequence charSequence, int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = 0;
        boolean z10 = i13 < charSequence.length() && charSequence.charAt(i13) == '/';
        if (z10) {
            i13 = i10 + 2;
        }
        int i15 = (z10 ? 32 : 0) | 1;
        if (f(i13, charSequence, "script") && ((i12 = i13 + 6) >= charSequence.length() || !e(charSequence.charAt(i12)))) {
            i14 = 1;
        } else if (f(i13, charSequence, "style") && ((i11 = i13 + 5) >= charSequence.length() || !e(charSequence.charAt(i11)))) {
            i14 = 2;
        }
        return i((i14 << 6) | i15, 1);
    }

    public static long i(int i10, int i11) {
        return i11 | (i10 << 8);
    }

    public static int j(int i10, int i11) {
        return (i10 & (-32)) | i11;
    }

    public static long k(CharSequence charSequence, int i10, char c10, int i11, Set set) {
        int i12 = i10 + 1;
        while (i12 < charSequence.length() && i12 - i10 < 64 && d(charSequence.charAt(i12))) {
            i12++;
        }
        int i13 = i12 - i10;
        if (!Character.isDigit(c10)) {
            return (set == null || i13 > 10 || !set.contains(charSequence.subSequence(i10, i12).toString())) ? i(c(i11, 0, i13 - 1), 0) : i(c(i11, 5, i13 - 1), 5);
        }
        while (i12 < charSequence.length() && i12 - i10 < 64 && (charSequence.charAt(i12) == '.' || charSequence.charAt(i12) == '%' || d(charSequence.charAt(i12)))) {
            i12++;
        }
        return i(c(i11, 6, (i12 - i10) - 1), 6);
    }
}
