package di;

/* loaded from: classes2.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8056a;

    /* renamed from: b, reason: collision with root package name */
    public final v f8057b;

    /* renamed from: c, reason: collision with root package name */
    public String f8058c;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f8059d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8060e;

    public n0(String source) {
        kotlin.jvm.internal.r.e(source, "source");
        v vVar = new v();
        vVar.f8078a = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        vVar.f8079b = iArr;
        vVar.f8080c = -1;
        this.f8057b = vVar;
        this.f8059d = new StringBuilder();
        this.f8060e = source;
    }

    public static /* synthetic */ void n(n0 n0Var, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = n0Var.f8056a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        n0Var.m(i10, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f8059d.append((char) (o(charSequence, i10 + 3) + (o(charSequence, i10) << 12) + (o(charSequence, i10 + 1) << 8) + (o(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f8056a = i10;
        if (i11 < charSequence.length()) {
            return a(charSequence, this.f8056a);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i10 = this.f8056a;
        if (i10 == -1) {
            return false;
        }
        while (true) {
            String str = this.f8060e;
            if (i10 >= str.length()) {
                this.f8056a = i10;
                return false;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8056a = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
    }

    public final void c(int i10, String str) {
        if (p().length() - i10 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (p().charAt(i10 + i11) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f8056a = str.length() + i10;
    }

    public final String d() {
        g('\"');
        int i10 = this.f8056a;
        String str = this.f8060e;
        int iX = mh.x.x(str, '\"', i10, 4);
        if (iX == -1) {
            j();
            int i11 = this.f8056a;
            n(this, i8.n.d("Expected quotation mark '\"', but had '", (i11 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11)), "' instead"), i11, null, 4);
            throw null;
        }
        int i12 = i10;
        while (i12 < iX) {
            if (str.charAt(i12) == '\\') {
                int iT = this.f8056a;
                char cCharAt = str.charAt(i12);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    StringBuilder sb = this.f8059d;
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) p(), iT, i12);
                        int iT2 = t(i12 + 1);
                        if (iT2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iT2 + 1;
                        char cCharAt2 = str.charAt(iT2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c10 = cCharAt2 < 'u' ? j.f8030a[cCharAt2] : (char) 0;
                            if (c10 == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c10);
                        }
                        iT = t(iA);
                        if (iT == -1) {
                            n(this, "Unexpected EOF", iT, null, 4);
                            throw null;
                        }
                    } else {
                        i12++;
                        if (i12 >= str.length()) {
                            sb.append((CharSequence) p(), iT, i12);
                            iT = t(i12);
                            if (iT == -1) {
                                n(this, "Unexpected EOF", iT, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i12);
                        }
                    }
                    i12 = iT;
                    z10 = true;
                    cCharAt = str.charAt(i12);
                }
                String string = !z10 ? p().subSequence(iT, i12).toString() : l(iT, i12);
                this.f8056a = i12 + 1;
                return string;
            }
            i12++;
        }
        this.f8056a = iX + 1;
        String strSubstring = str.substring(i10, iX);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f8056a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte e() {
        int i10 = this.f8056a;
        while (true) {
            String str = this.f8060e;
            if (i10 == -1 || i10 >= str.length()) {
                break;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8056a = i11;
                return a.a(cCharAt);
            }
            i10 = i11;
        }
    }

    public final byte f(byte b10) {
        byte bE = e();
        if (bE == b10) {
            return bE;
        }
        String strC = a.c(b10);
        int i10 = this.f8056a;
        int i11 = i10 - 1;
        n(this, p5.g0.a("Expected ", strC, ", but had '", (i10 == p().length() || i11 < 0) ? "EOF" : String.valueOf(p().charAt(i11)), "' instead"), i11, null, 4);
        throw null;
    }

    public void g(char c10) {
        int i10 = this.f8056a;
        if (i10 == -1) {
            w(c10);
            throw null;
        }
        while (true) {
            String str = this.f8060e;
            if (i10 >= str.length()) {
                this.f8056a = -1;
                w(c10);
                throw null;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8056a = i11;
                if (cCharAt == c10) {
                    return;
                }
                w(c10);
                throw null;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        n(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        throw new pg.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        n(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        n(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        n(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (p().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        n(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        n(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r21.f8056a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        n(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h() {
        boolean z10;
        boolean z11;
        boolean z12;
        int iT = t(u());
        int i10 = 0;
        if (iT < p().length() && iT != -1) {
            if (p().charAt(iT) == '\"') {
                iT++;
                if (iT == p().length()) {
                    n(this, "EOF", 0, null, 6);
                    throw null;
                }
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = iT;
            int i12 = 0;
            boolean z13 = false;
            boolean z14 = false;
            long j10 = 0;
            long j11 = 0;
            while (true) {
                if (i11 == p().length()) {
                    z11 = z10;
                    z12 = z13;
                    break;
                }
                char cCharAt = p().charAt(i11);
                if ((cCharAt != 'e' && cCharAt != 'E') || z13) {
                    z11 = z10;
                    if (cCharAt == '-' && z13) {
                        if (i11 == iT) {
                            n(this, "Unexpected symbol '-' in numeric literal", i10, null, 6);
                            throw null;
                        }
                        i11++;
                        i12 = i10;
                        z10 = z11;
                    } else if (cCharAt != '+' || !z13) {
                        z12 = z13;
                        if (cCharAt != '-') {
                            if (a.a(cCharAt) != 0) {
                                break;
                            }
                            i11++;
                            int i13 = cCharAt - '0';
                            if (i13 < 0 || i13 >= 10) {
                                break;
                            }
                            if (z12) {
                                j10 = (j10 * 10) + i13;
                                z10 = z11;
                                z13 = z12;
                            } else {
                                j11 = (j11 * 10) - i13;
                                if (j11 > 0) {
                                    n(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z10 = z11;
                                z13 = z12;
                                i10 = 0;
                            }
                        } else {
                            if (i11 != iT) {
                                n(this, "Unexpected symbol '-' in numeric literal", i10, null, 6);
                                throw null;
                            }
                            i11++;
                            z10 = z11;
                            z13 = z12;
                            z14 = true;
                        }
                    } else {
                        if (i11 == iT) {
                            n(this, "Unexpected symbol '+' in numeric literal", i10, null, 6);
                            throw null;
                        }
                        i11++;
                        z10 = z11;
                        i12 = 1;
                    }
                } else {
                    if (i11 == iT) {
                        n(this, "Unexpected symbol " + cCharAt + " in numeric literal", i10, null, 6);
                        throw null;
                    }
                    i11++;
                    i12 = 1;
                    z13 = true;
                }
            }
        } else {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String i() {
        String str = this.f8058c;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.r.b(str);
        this.f8058c = null;
        return str;
    }

    public final String j() {
        String strL;
        String str = this.f8058c;
        if (str != null) {
            kotlin.jvm.internal.r.b(str);
            this.f8058c = null;
            return str;
        }
        int iU = u();
        if (iU >= p().length() || iU == -1) {
            n(this, "EOF", iU, null, 4);
            throw null;
        }
        byte bA = a.a(p().charAt(iU));
        if (bA == 1) {
            return i();
        }
        if (bA != 0) {
            n(this, "Expected beginning of the string, but got " + p().charAt(iU), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (a.a(p().charAt(iU)) == 0) {
            iU++;
            if (iU >= p().length()) {
                this.f8059d.append((CharSequence) p(), this.f8056a, iU);
                int iT = t(iU);
                if (iT == -1) {
                    this.f8056a = iU;
                    return l(0, 0);
                }
                iU = iT;
                z10 = true;
            }
        }
        if (z10) {
            strL = l(this.f8056a, iU);
        } else {
            strL = p().subSequence(this.f8056a, iU).toString();
        }
        this.f8056a = iU;
        return strL;
    }

    public final String k() {
        String strJ = j();
        if (!kotlin.jvm.internal.r.a(strJ, "null") || p().charAt(this.f8056a - 1) == '\"') {
            return strJ;
        }
        n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final String l(int i10, int i11) {
        String strP = p();
        StringBuilder sb = this.f8059d;
        sb.append((CharSequence) strP, i10, i11);
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final void m(int i10, String message, String hint) {
        kotlin.jvm.internal.r.e(message, "message");
        kotlin.jvm.internal.r.e(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbA = v5.b.a(message, " at path: ");
        sbA.append(this.f8057b.a());
        sbA.append(strConcat);
        throw t.c(i10, p(), sbA.toString());
    }

    public final int o(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String p() {
        return this.f8060e;
    }

    public final String q(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.r.e(keyToMatch, "keyToMatch");
        int i10 = this.f8056a;
        try {
            if (e() == 6 && kotlin.jvm.internal.r.a(s(z10), keyToMatch)) {
                this.f8058c = null;
                if (e() == 5) {
                    return s(z10);
                }
            }
            return null;
        } finally {
            this.f8056a = i10;
            this.f8058c = null;
        }
    }

    public byte r() {
        String strP = p();
        int i10 = this.f8056a;
        while (true) {
            int iT = t(i10);
            if (iT == -1) {
                this.f8056a = iT;
                return (byte) 10;
            }
            char cCharAt = strP.charAt(iT);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f8056a = iT;
                return a.a(cCharAt);
            }
            i10 = iT + 1;
        }
    }

    public final String s(boolean z10) {
        String strI;
        byte bR = r();
        if (z10) {
            if (bR != 1 && bR != 0) {
                return null;
            }
            strI = j();
        } else {
            if (bR != 1) {
                return null;
            }
            strI = i();
        }
        this.f8058c = strI;
        return strI;
    }

    public final int t(int i10) {
        if (i10 < this.f8060e.length()) {
            return i10;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) p());
        sb.append("', currentPosition=");
        return b.b.a(sb, this.f8056a, ')');
    }

    public int u() {
        char cCharAt;
        int i10 = this.f8056a;
        if (i10 == -1) {
            return i10;
        }
        while (true) {
            String str = this.f8060e;
            if (i10 >= str.length() || !((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f8056a = i10;
        return i10;
    }

    public final boolean v() {
        int iU = u();
        String strP = p();
        if (iU >= strP.length() || iU == -1 || strP.charAt(iU) != ',') {
            return false;
        }
        this.f8056a++;
        return true;
    }

    public final void w(char c10) {
        int i10 = this.f8056a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f8056a = i10 - 1;
                String strJ = j();
                this.f8056a = i10;
                if (kotlin.jvm.internal.r.a(strJ, "null")) {
                    m(this.f8056a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f8056a = i10;
                throw th2;
            }
        }
        String strC = a.c(a.a(c10));
        int i11 = this.f8056a;
        int i12 = i11 - 1;
        String str = this.f8060e;
        n(this, p5.g0.a("Expected ", strC, ", but had '", (i11 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12)), "' instead"), i12, null, 4);
        throw null;
    }
}
