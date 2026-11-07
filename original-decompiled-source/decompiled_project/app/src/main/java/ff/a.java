package ff;

import android.util.Log;
import cf.l;
import cf.m;
import cf.n;
import cf.o;
import cf.p;
import cf.u;
import h1.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11181d = Long.toString(Long.MAX_VALUE).length();

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f11182a = wf.a.f31525f.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final j f11183b;

    /* renamed from: c, reason: collision with root package name */
    public cf.e f11184c;

    public a(j jVar) {
        this.f11183b = jVar;
    }

    public static boolean d(int i10) {
        return i10 >= 48 && i10 <= 57;
    }

    public static boolean e(int i10) {
        return i10 == 32 || i10 == 13 || i10 == 10 || i10 == 9 || i10 == 62 || i10 == 60 || i10 == 91 || i10 == 47 || i10 == 93 || i10 == 41 || i10 == 40 || i10 == 0 || i10 == 12 || i10 == 37;
    }

    public static boolean f(char c10) {
        if (d(c10)) {
            return true;
        }
        if (c10 < 'a' || c10 > 'f') {
            return c10 >= 'A' && c10 <= 'F';
        }
        return true;
    }

    public static boolean g(int i10) {
        return i10 == 0 || i10 == 9 || i10 == 12 || i10 == 10 || i10 == 13 || i10 == 32;
    }

    public final int a(int i10) throws IOException {
        byte b10;
        byte[] bArr = new byte[3];
        j jVar = this.f11183b;
        int i11 = jVar.read(bArr);
        if (i11 == 3 && bArr[0] == 13 && (((b10 = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b10 == 47 || b10 == 62)) {
            i10 = 0;
        }
        if (i11 > 0) {
            jVar.s(i11, bArr);
        }
        return i10;
    }

    public final o b(p pVar) throws IOException {
        cf.e eVar = this.f11184c;
        if (eVar != null) {
            return eVar.i0(pVar);
        }
        throw new IOException("object reference " + pVar + " at offset " + this.f11183b.getPosition() + " in content stream");
    }

    public final boolean c() throws IOException {
        return d(this.f11183b.peek());
    }

    public final cf.d h() throws IOException {
        l('<');
        l('<');
        t();
        cf.d dVar = new cf.d();
        boolean z10 = false;
        loop0: while (!z10) {
            t();
            j jVar = this.f11183b;
            char cPeek = (char) jVar.peek();
            if (cPeek == '>') {
                z10 = true;
            } else if (cPeek == '/') {
                l lVarI = i();
                if (lVarI == null || lVarI.f5545b.isEmpty()) {
                    Log.w("PdfBox-Android", "Empty COSName at offset " + jVar.getPosition());
                }
                long position = jVar.getPosition();
                cf.b bVarK = k();
                t();
                if ((bVarK instanceof n) && c()) {
                    long position2 = jVar.getPosition();
                    cf.b bVarK2 = k();
                    t();
                    l(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                    if (!(bVarK instanceof cf.i)) {
                        Log.e("PdfBox-Android", "expected number, actual=" + bVarK + " at offset " + position);
                        bVarK = m.f5548c;
                    } else if (bVarK2 instanceof cf.i) {
                        long j10 = ((cf.i) bVarK).f5445b;
                        if (j10 <= 0) {
                            StringBuilder sbA = y.a("invalid object number value =", " at offset ", j10);
                            sbA.append(position);
                            Log.w("PdfBox-Android", sbA.toString());
                            bVarK = m.f5548c;
                        } else {
                            int i10 = (int) ((cf.i) bVarK2).f5445b;
                            if (i10 < 0) {
                                Log.e("PdfBox-Android", "invalid generation number value =" + i10 + " at offset " + position);
                                bVarK = m.f5548c;
                            } else {
                                bVarK = b(new p(i10, j10));
                            }
                        }
                    } else {
                        Log.e("PdfBox-Android", "expected number, actual=" + bVarK2 + " at offset " + position2);
                        bVarK = m.f5548c;
                    }
                }
                t();
                if (bVarK == null) {
                    Log.w("PdfBox-Android", "Bad dictionary declaration at offset " + jVar.getPosition());
                    return dVar;
                }
                if (!(bVarK instanceof cf.i) || ((cf.i) bVarK).f5446c) {
                    bVarK.f5417a = true;
                    dVar.O0(lVarI, bVarK);
                } else {
                    Log.w("PdfBox-Android", "Skipped out of range number value at offset " + jVar.getPosition());
                }
            } else {
                Log.w("PdfBox-Android", "Invalid dictionary, found: '" + cPeek + "' but expected: '/' at offset " + jVar.getPosition());
                int i11 = jVar.read();
                while (i11 != -1 && i11 != 47 && i11 != 62) {
                    if (i11 == 101 && jVar.read() == 110 && jVar.read() == 100) {
                        int i12 = jVar.read();
                        boolean z11 = i12 == 115 && jVar.read() == 116 && jVar.read() == 114 && jVar.read() == 101 && jVar.read() == 97 && jVar.read() == 109;
                        boolean z12 = !z11 && i12 == 111 && jVar.read() == 98 && jVar.read() == 106;
                        if (z11 || z12) {
                            break loop0;
                        }
                    }
                    i11 = jVar.read();
                }
                if (i11 == -1) {
                    return dVar;
                }
                jVar.b0(i11);
            }
        }
        l('>');
        l('>');
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l i() throws IOException {
        String str;
        l('/');
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = this.f11183b;
        int i10 = jVar.read();
        while (i10 != -1) {
            if (i10 == 35) {
                int i11 = jVar.read();
                int i12 = jVar.read();
                char c10 = (char) i11;
                if (f(c10)) {
                    char c11 = (char) i12;
                    if (f(c11)) {
                        String str2 = Character.toString(c10) + c11;
                        try {
                            byteArrayOutputStream.write(Integer.parseInt(str2, 16));
                            i11 = jVar.read();
                        } catch (NumberFormatException e10) {
                            throw new IOException(i8.n.d("Error: expected hex digit, actual='", str2, "'"), e10);
                        }
                    } else {
                        if (i12 == -1 || i11 == -1) {
                            Log.e("PdfBox-Android", "Premature EOF in BaseParser#parseCOSName");
                            i10 = -1;
                            break;
                        }
                        jVar.b0(i12);
                        byteArrayOutputStream.write(i10);
                    }
                    i10 = i11;
                }
            } else {
                if (e(i10)) {
                    break;
                }
                byteArrayOutputStream.write(i10);
                i10 = jVar.read();
            }
        }
        if (i10 != -1) {
            jVar.b0(i10);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            this.f11182a.decode(ByteBuffer.wrap(byteArray));
            str = new String(byteArray, wf.a.f31525f);
        } catch (CharacterCodingException unused) {
            str = new String(byteArray, wf.a.f31524e);
        }
        return l.g0(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r0 = r1.toString();
        r1 = cf.u.f5564c;
        r1 = new java.io.ByteArrayOutputStream();
        r2 = new java.lang.StringBuilder(r0.trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if ((r2.length() % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r2.append('0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r3 = r2.length();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r4 >= r3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        r5 = r4 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r1.write(java.lang.Integer.parseInt(r2.substring(r4, r5), 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (cf.u.f5564c != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        android.util.Log.w("PdfBox-Android", "Encountered a malformed hex string");
        r1.write(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        throw new java.io.IOException("Invalid hex string: ".concat(r0), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        return new cf.u(r1.toByteArray());
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u j() throws IOException {
        int i10;
        j jVar = this.f11183b;
        char c10 = (char) jVar.read();
        int iA = 1;
        if (c10 != '<') {
            if (c10 != '(') {
                throw new IOException("parseCOSString string should start with '(' or '<' and not '" + c10 + "' at offset " + jVar.getPosition());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i11 = jVar.read();
            while (iA > 0 && i11 != -1) {
                char c11 = (char) i11;
                if (c11 == ')') {
                    iA = a(iA - 1);
                    if (iA != 0) {
                        byteArrayOutputStream.write(c11);
                    }
                } else if (c11 == '(') {
                    iA++;
                    byteArrayOutputStream.write(c11);
                } else if (c11 == '\\') {
                    char c12 = (char) jVar.read();
                    if (c12 == '\n' || c12 == '\r') {
                        i11 = jVar.read();
                        while (true) {
                            if ((10 == i11 || 13 == i11) && i11 != -1) {
                                i11 = jVar.read();
                            }
                        }
                    } else if (c12 == '\\') {
                        byteArrayOutputStream.write(c12);
                    } else if (c12 == 'b') {
                        byteArrayOutputStream.write(8);
                    } else if (c12 == 'f') {
                        byteArrayOutputStream.write(12);
                    } else if (c12 == 'n') {
                        byteArrayOutputStream.write(10);
                    } else if (c12 == 'r') {
                        byteArrayOutputStream.write(13);
                    } else if (c12 == 't') {
                        byteArrayOutputStream.write(9);
                    } else if (c12 != '(') {
                        if (c12 != ')') {
                            switch (c12) {
                                case '0':
                                case '1':
                                case '2':
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                case '4':
                                case EACTags.SEX /* 53 */:
                                case EACTags.CURRENCY_EXPONENT /* 54 */:
                                case '7':
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c12);
                                    i11 = jVar.read();
                                    char c13 = (char) i11;
                                    if (c13 >= '0' && c13 <= '7') {
                                        sb.append(c13);
                                        i11 = jVar.read();
                                        char c14 = (char) i11;
                                        if (c14 >= '0' && c14 <= '7') {
                                            sb.append(c14);
                                            i11 = -2;
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream.write(Integer.parseInt(sb.toString(), 8));
                                        break;
                                    } catch (NumberFormatException e10) {
                                        throw new IOException("Error: Expected octal character, actual='" + ((Object) sb) + "'", e10);
                                    }
                                    break;
                                default:
                                    byteArrayOutputStream.write(c12);
                                    break;
                            }
                        } else {
                            iA = a(iA);
                            if (iA != 0) {
                                byteArrayOutputStream.write(c12);
                            } else {
                                byteArrayOutputStream.write(92);
                            }
                        }
                    }
                    if (i11 != -2) {
                        i11 = jVar.read();
                    }
                } else {
                    byteArrayOutputStream.write(c11);
                }
                i11 = -2;
                if (i11 != -2) {
                }
            }
            if (i11 != -1) {
                jVar.b0(i11);
            }
            return new u(byteArrayOutputStream.toByteArray());
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i12 = jVar.read();
            char c15 = (char) i12;
            if (!f(c15)) {
                if (i12 == 62) {
                    break;
                }
                if (i12 < 0) {
                    throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                }
                if (i12 != 32 && i12 != 10 && i12 != 9 && i12 != 13 && i12 != 8 && i12 != 12) {
                    if (sb2.length() % 2 != 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    do {
                        i10 = jVar.read();
                        if (i10 == 62) {
                            break;
                        }
                    } while (i10 >= 0);
                    if (i10 < 0) {
                        throw new IOException("Missing closing bracket for hex string. Reached EOS.");
                    }
                }
            } else {
                sb2.append(c15);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        r0.read();
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cf.b k() throws IOException {
        t();
        j jVar = this.f11183b;
        char cPeek = (char) jVar.peek();
        if (cPeek == '(') {
            return j();
        }
        if (cPeek == '/') {
            return i();
        }
        if (cPeek == '<') {
            int i10 = jVar.read();
            char cPeek2 = (char) jVar.peek();
            jVar.b0(i10);
            return cPeek2 == '<' ? h() : j();
        }
        if (cPeek == 'R') {
            jVar.read();
            return new o(null);
        }
        if (cPeek == '[') {
            long position = jVar.getPosition();
            l('[');
            cf.a aVar = new cf.a();
            t();
            while (true) {
                int iPeek = jVar.peek();
                if (iPeek <= 0 || ((char) iPeek) == ']') {
                    break;
                }
                cf.b bVarK = k();
                if (bVarK instanceof o) {
                    ArrayList arrayList = aVar.f5416b;
                    if (arrayList.size() <= 0 || !(aVar.i0(arrayList.size() - 1) instanceof cf.i)) {
                        bVarK = null;
                    } else {
                        cf.i iVar = (cf.i) aVar.q0(arrayList.size() - 1);
                        if (arrayList.size() > 0 && (aVar.i0(arrayList.size() - 1) instanceof cf.i)) {
                            bVarK = b(new p((int) iVar.f5445b, ((cf.i) aVar.q0(arrayList.size() - 1)).f5445b));
                        }
                    }
                }
                if (bVarK == null) {
                    Log.w("PdfBox-Android", "Corrupt array element at offset " + jVar.getPosition() + ", start offset: " + position);
                    String strR = r();
                    if (strR.isEmpty() && jVar.peek() == 91) {
                        break;
                    }
                    jVar.p0(strR.getBytes(wf.a.f31523d));
                    if ("endobj".equals(strR) || "endstream".equals(strR)) {
                        break;
                    }
                } else {
                    aVar.g0(bVarK);
                }
                t();
            }
            return aVar;
        }
        if (cPeek == 'f') {
            String str = new String(jVar.c0(5), wf.a.f31523d);
            if (str.equals("false")) {
                return cf.c.f5421f;
            }
            throw new IOException("expected false actual='" + str + "' " + jVar + "' at offset " + jVar.getPosition());
        }
        if (cPeek == 'n') {
            m("null".toCharArray());
            return m.f5548c;
        }
        if (cPeek == 't') {
            String str2 = new String(jVar.c0(4), wf.a.f31523d);
            if (str2.equals("true")) {
                return cf.c.f5420e;
            }
            throw new IOException("expected true actual='" + str2 + "' " + jVar + "' at offset " + jVar.getPosition());
        }
        if (cPeek == 65535) {
            return null;
        }
        if (Character.isDigit(cPeek) || cPeek == '-' || cPeek == '+' || cPeek == '.') {
            StringBuilder sb = new StringBuilder();
            int i11 = jVar.read();
            while (true) {
                char c10 = (char) i11;
                if (!Character.isDigit(c10) && c10 != '-' && c10 != '+' && c10 != '.' && c10 != 'E' && c10 != 'e') {
                    break;
                }
                sb.append(c10);
                i11 = jVar.read();
            }
            if (i11 != -1) {
                jVar.b0(i11);
            }
            return n.i0(sb.toString());
        }
        long position2 = jVar.getPosition();
        String strR2 = r();
        if (!strR2.isEmpty()) {
            if ("endobj".equals(strR2) || "endstream".equals(strR2)) {
                jVar.p0(strR2.getBytes(wf.a.f31523d));
                return null;
            }
            StringBuilder sbA = e.e.a("Skipped unexpected dir object = '", strR2, "' at offset ");
            sbA.append(jVar.getPosition());
            sbA.append(" (start offset: ");
            sbA.append(position2);
            sbA.append(")");
            Log.w("PdfBox-Android", sbA.toString());
            return null;
        }
        int iPeek2 = jVar.peek();
        throw new IOException("Unknown dir object c='" + cPeek + "' cInt=" + ((int) cPeek) + " peek='" + ((char) iPeek2) + "' peekInt=" + iPeek2 + " at offset " + jVar.getPosition() + " (start offset: " + position2 + ")");
    }

    public final void l(char c10) throws IOException {
        j jVar = this.f11183b;
        char c11 = (char) jVar.read();
        if (c11 == c10) {
            return;
        }
        throw new IOException("expected='" + c10 + "' actual='" + c11 + "' at offset " + jVar.getPosition());
    }

    public final void m(char[] cArr) throws IOException {
        t();
        for (char c10 : cArr) {
            j jVar = this.f11183b;
            if (jVar.read() != c10) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c10 + "' at offset " + jVar.getPosition());
            }
        }
        t();
    }

    public final int n() throws IOException, NumberFormatException {
        t();
        StringBuilder sbS = s();
        try {
            int i10 = Integer.parseInt(sbS.toString());
            if (i10 < 0 || i10 > 65535) {
                throw new IOException(ad.b.b(i10, "Generation Number '", "' has more than 5 digits"));
            }
            return i10;
        } catch (NumberFormatException e10) {
            byte[] bytes = sbS.toString().getBytes(wf.a.f31523d);
            j jVar = this.f11183b;
            jVar.p0(bytes);
            throw new IOException("Error: Expected an integer type at offset " + jVar.getPosition() + ", instead got '" + ((Object) sbS) + "'", e10);
        }
    }

    public final String o() throws IOException {
        int i10;
        j jVar = this.f11183b;
        if (jVar.g()) {
            throw new IOException("Error: End-of-File, expected line at offset " + jVar.getPosition());
        }
        StringBuilder sb = new StringBuilder(11);
        while (true) {
            i10 = jVar.read();
            if (i10 == -1 || 10 == i10 || 13 == i10) {
                break;
            }
            sb.append((char) i10);
        }
        if (13 == i10 && 10 == jVar.peek()) {
            jVar.read();
        }
        return sb.toString();
    }

    public final long p() throws IOException {
        t();
        StringBuilder sbS = s();
        try {
            return Long.parseLong(sbS.toString());
        } catch (NumberFormatException e10) {
            byte[] bytes = sbS.toString().getBytes(wf.a.f31523d);
            j jVar = this.f11183b;
            jVar.p0(bytes);
            throw new IOException("Error: Expected a long type at offset " + jVar.getPosition() + ", instead got '" + ((Object) sbS) + "'", e10);
        }
    }

    public final long q() throws IOException {
        long jP = p();
        if (jP < 0 || jP >= 10000000000L) {
            throw new IOException(c2.u.a("Object Number '", "' has more than 10 digits or is negative", jP));
        }
        return jP;
    }

    public final String r() throws IOException {
        t();
        StringBuilder sb = new StringBuilder();
        j jVar = this.f11183b;
        int i10 = jVar.read();
        while (true) {
            char c10 = (char) i10;
            if (e(c10) || i10 == -1) {
                break;
            }
            sb.append(c10);
            i10 = jVar.read();
        }
        if (i10 != -1) {
            jVar.b0(i10);
        }
        return sb.toString();
    }

    public final StringBuilder s() throws IOException {
        j jVar;
        StringBuilder sb = new StringBuilder();
        do {
            jVar = this.f11183b;
            int i10 = jVar.read();
            if (i10 < 48 || i10 > 57) {
                if (i10 != -1) {
                    jVar.b0(i10);
                }
                return sb;
            }
            sb.append((char) i10);
        } while (sb.length() <= f11181d);
        throw new IOException("Number '" + ((Object) sb) + "' is getting too long, stop reading at offset " + jVar.getPosition());
    }

    public final void t() throws IOException {
        j jVar = this.f11183b;
        int i10 = jVar.read();
        while (true) {
            if (!g(i10) && i10 != 37) {
                break;
            }
            if (i10 == 37) {
                i10 = jVar.read();
                while (10 != i10 && 13 != i10 && i10 != -1) {
                    i10 = jVar.read();
                }
            } else {
                i10 = jVar.read();
            }
        }
        if (i10 != -1) {
            jVar.b0(i10);
        }
    }

    public final void u() throws IOException {
        j jVar = this.f11183b;
        int i10 = jVar.read();
        while (32 == i10) {
            i10 = jVar.read();
        }
        if (13 != i10) {
            if (10 != i10) {
                jVar.b0(i10);
            }
        } else {
            int i11 = jVar.read();
            if (10 != i11) {
                jVar.b0(i11);
            }
        }
    }
}
