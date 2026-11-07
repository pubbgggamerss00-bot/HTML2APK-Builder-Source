package we;

import android.util.Log;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import we.b;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f31515a;

    /* renamed from: c, reason: collision with root package name */
    public int f31517c = 0;

    /* renamed from: b, reason: collision with root package name */
    public b f31516b = e(null);

    public e(byte[] bArr) throws IOException {
        this.f31515a = ByteBuffer.wrap(bArr);
    }

    public final char a() throws IOException {
        try {
            return (char) this.f31515a.get();
        } catch (BufferUnderflowException unused) {
            throw new IOException("Premature end of buffer reached");
        }
    }

    public final b b() throws IOException {
        b bVar = this.f31516b;
        this.f31516b = e(bVar);
        return bVar;
    }

    public final boolean c(b.a aVar) {
        b bVar = this.f31516b;
        return bVar != null && bVar.f31495c == aVar;
    }

    public final String d() throws IOException {
        ByteBuffer byteBuffer;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byteBuffer = this.f31515a;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            byteBuffer.mark();
            char cA = a();
            if (Character.isWhitespace(cA) || cA == '(' || cA == ')' || cA == '<' || cA == '>' || cA == '[' || cA == ']' || cA == '{' || cA == '}' || cA == '/' || cA == '%') {
                break;
            }
            sb.append(cA);
        }
        byteBuffer.reset();
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x031d, code lost:
    
        if (r1 != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x031f, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022b A[LOOP:3: B:136:0x0225->B:138:0x022b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b e(b bVar) throws IOException {
        char cA;
        StringBuilder sb;
        char cA2;
        while (true) {
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                ByteBuffer byteBuffer = this.f31515a;
                b bVar2 = null;
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                char cA3 = a();
                if (cA3 == '%') {
                    while (byteBuffer.hasRemaining() && (cA = a()) != '\r' && cA != '\n') {
                    }
                } else if (cA3 == '(') {
                    StringBuilder sb2 = new StringBuilder();
                    while (byteBuffer.hasRemaining()) {
                        char cA4 = a();
                        if (cA4 == '\n' || cA4 == '\r') {
                            sb2.append("\n");
                        } else if (cA4 == '\\') {
                            char cA5 = a();
                            if (cA5 == '(') {
                                sb2.append('(');
                            } else if (cA5 == ')') {
                                sb2.append(')');
                            } else if (cA5 == '\\') {
                                sb2.append('\\');
                            } else if (cA5 == 'b') {
                                sb2.append('\b');
                            } else if (cA5 == 'f') {
                                sb2.append('\f');
                            } else if (cA5 == 'n' || cA5 == 'r') {
                                sb2.append("\n");
                            } else if (cA5 == 't') {
                                sb2.append('\t');
                            }
                            if (Character.isDigit(cA5)) {
                                try {
                                    sb2.append((char) Integer.parseInt(String.valueOf(new char[]{cA5, a(), a()}), 8));
                                } catch (NumberFormatException e10) {
                                    throw new IOException(e10);
                                }
                            } else {
                                continue;
                            }
                        } else if (cA4 == '(') {
                            this.f31517c++;
                            sb2.append('(');
                        } else if (cA4 != ')') {
                            sb2.append(cA4);
                        } else {
                            if (this.f31517c == 0) {
                                return new b(sb2.toString(), b.a.f31496a);
                            }
                            sb2.append(')');
                            this.f31517c--;
                        }
                    }
                } else {
                    if (cA3 == ')') {
                        throw new IOException("unexpected closing parenthesis");
                    }
                    if (cA3 == '[') {
                        return new b(cA3, b.a.f31501f);
                    }
                    if (cA3 == '{') {
                        return new b(cA3, b.a.f31503h);
                    }
                    if (cA3 == ']') {
                        return new b(cA3, b.a.f31502g);
                    }
                    if (cA3 == '}') {
                        return new b(cA3, b.a.f31504j);
                    }
                    if (cA3 == '/') {
                        String strD = d();
                        if (strD != null) {
                            return new b(strD, b.a.f31498c);
                        }
                        throw new a("Could not read token at position " + byteBuffer.position());
                    }
                    b.a aVar = b.a.f31497b;
                    if (cA3 == '<') {
                        if (a() == cA3) {
                            return new b("<<", b.a.f31505k);
                        }
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new b(cA3, aVar);
                    }
                    if (cA3 == '>') {
                        if (a() == cA3) {
                            return new b(">>", b.a.f31506l);
                        }
                        byteBuffer.position(byteBuffer.position() - 1);
                        return new b(cA3, aVar);
                    }
                    if (!Character.isWhitespace(cA3)) {
                        if (cA3 == 0) {
                            Log.w("PdfBox-Android", "NULL byte in font, skipped");
                        } else {
                            byteBuffer.position(byteBuffer.position() - 1);
                            byteBuffer.mark();
                            StringBuilder sb3 = new StringBuilder();
                            char cA6 = a();
                            if (cA6 == '+' || cA6 == '-') {
                                sb3.append(cA6);
                                cA6 = a();
                            }
                            while (Character.isDigit(cA6)) {
                                sb3.append(cA6);
                                cA6 = a();
                                z10 = true;
                            }
                            b.a aVar2 = b.a.f31500e;
                            if (cA6 == '.') {
                                sb3.append(cA6);
                                cA6 = a();
                            } else if (cA6 == '#') {
                                StringBuilder sb4 = new StringBuilder();
                                cA6 = a();
                                sb3 = sb4;
                                sb = sb3;
                                if (Character.isDigit(cA6)) {
                                    if (cA6 != 'e' && cA6 != 'E') {
                                        byteBuffer.reset();
                                    }
                                    if (bVar2 == null) {
                                        return bVar2;
                                    }
                                    String strD2 = d();
                                    if (strD2 == null) {
                                        throw new a("Could not read token at position " + byteBuffer.position());
                                    }
                                    if (!strD2.equals("RD") && !strD2.equals("-|")) {
                                        return new b(strD2, aVar);
                                    }
                                    if (bVar == null || bVar.f31495c != aVar2) {
                                        throw new IOException("expected INTEGER before -| or RD");
                                    }
                                    int iA = bVar.a();
                                    try {
                                        byteBuffer.get();
                                        byte[] bArr = new byte[iA];
                                        byteBuffer.get(bArr);
                                        return new b(bArr);
                                    } catch (BufferUnderflowException unused) {
                                        throw new IOException("Premature end of buffer reached");
                                    }
                                }
                                sb3.append(cA6);
                                cA6 = a();
                                while (Character.isDigit(cA6)) {
                                    sb3.append(cA6);
                                    cA6 = a();
                                }
                                if (cA6 != 'E' || cA6 == 'e') {
                                    sb3.append(cA6);
                                    cA2 = a();
                                    if (cA2 == '-') {
                                        sb3.append(cA2);
                                        cA2 = a();
                                    }
                                    if (Character.isDigit(cA2)) {
                                        byteBuffer.reset();
                                    } else {
                                        sb3.append(cA2);
                                        char cA7 = a();
                                        while (Character.isDigit(cA7)) {
                                            sb3.append(cA7);
                                            cA7 = a();
                                        }
                                        byteBuffer.position(byteBuffer.position() - 1);
                                        if (sb == null) {
                                            try {
                                                bVar2 = new b(Integer.toString(Integer.parseInt(sb3.toString(), Integer.parseInt(sb.toString()))), aVar2);
                                            } catch (NumberFormatException e11) {
                                                throw new IOException("Invalid number '" + sb3.toString() + "'", e11);
                                            }
                                        } else {
                                            bVar2 = new b(sb3.toString(), b.a.f31499d);
                                        }
                                    }
                                } else {
                                    byteBuffer.position(byteBuffer.position() - 1);
                                    if (sb == null) {
                                    }
                                }
                                if (bVar2 == null) {
                                }
                            } else {
                                if (sb3.length() == 0 || !z10) {
                                    byteBuffer.reset();
                                } else if (cA6 != 'e' && cA6 != 'E') {
                                    byteBuffer.position(byteBuffer.position() - 1);
                                    bVar2 = new b(sb3.toString(), aVar2);
                                }
                                if (bVar2 == null) {
                                }
                            }
                            sb = null;
                            if (Character.isDigit(cA6)) {
                            }
                            while (Character.isDigit(cA6)) {
                            }
                            if (cA6 != 'E') {
                                sb3.append(cA6);
                                cA2 = a();
                                if (cA2 == '-') {
                                }
                                if (Character.isDigit(cA2)) {
                                }
                            }
                            if (bVar2 == null) {
                            }
                        }
                    }
                    z11 = true;
                }
            }
        }
    }
}
