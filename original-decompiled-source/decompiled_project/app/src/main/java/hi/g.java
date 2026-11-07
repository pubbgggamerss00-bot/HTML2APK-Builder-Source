package hi;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public g0 f13060a;

    /* renamed from: b, reason: collision with root package name */
    public long f13061b;

    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public g f13062a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f13062a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f13062a = null;
        }
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h A(j jVar) {
        k0(jVar);
        return this;
    }

    @Override // hi.i
    public final boolean A0(long j10, j bytes) {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        int iD = bytes.d();
        if (j10 >= 0 && iD >= 0 && this.f13061b - j10 >= iD && bytes.d() >= iD) {
            for (int i10 = 0; i10 < iD; i10++) {
                if (z(i10 + j10) == bytes.i(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // hi.i
    public final int D(z options) throws EOFException {
        kotlin.jvm.internal.r.e(options, "options");
        int iB = ii.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        skip(options.f13120a[iB].d());
        return iB;
    }

    public final void D0(int i10) {
        g0 g0VarG0 = g0(2);
        byte[] bArr = g0VarG0.f13063a;
        int i11 = g0VarG0.f13065c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        g0VarG0.f13065c = i11 + 2;
        this.f13061b += 2;
    }

    public final long E(byte b10, long j10, long j11) {
        g0 g0Var;
        long j12 = j10;
        long j13 = j11;
        long j14 = 0;
        if (0 > j12 || j12 > j13) {
            throw new IllegalArgumentException(("size=" + this.f13061b + " fromIndex=" + j12 + " toIndex=" + j13).toString());
        }
        long j15 = this.f13061b;
        if (j13 > j15) {
            j13 = j15;
        }
        long j16 = -1;
        if (j12 == j13 || (g0Var = this.f13060a) == null) {
            return -1L;
        }
        if (j15 - j12 < j12) {
            while (j15 > j12) {
                g0Var = g0Var.f13069g;
                kotlin.jvm.internal.r.b(g0Var);
                j15 -= g0Var.f13065c - g0Var.f13064b;
            }
            while (j15 < j13) {
                byte[] bArr = g0Var.f13063a;
                long j17 = j16;
                int iMin = (int) Math.min(g0Var.f13065c, (g0Var.f13064b + j13) - j15);
                for (int i10 = (int) ((g0Var.f13064b + j12) - j15); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - g0Var.f13064b) + j15;
                    }
                }
                j15 += g0Var.f13065c - g0Var.f13064b;
                g0Var = g0Var.f13068f;
                kotlin.jvm.internal.r.b(g0Var);
                j16 = j17;
                j12 = j15;
            }
            return j16;
        }
        while (true) {
            long j18 = (g0Var.f13065c - g0Var.f13064b) + j14;
            if (j18 > j12) {
                break;
            }
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j14 = j18;
        }
        while (j14 < j13) {
            byte[] bArr2 = g0Var.f13063a;
            int iMin2 = (int) Math.min(g0Var.f13065c, (g0Var.f13064b + j13) - j14);
            for (int i11 = (int) ((g0Var.f13064b + j12) - j14); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return (i11 - g0Var.f13064b) + j14;
                }
            }
            j14 += g0Var.f13065c - g0Var.f13064b;
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j12 = j14;
        }
        return -1L;
    }

    public final void E0(int i10, int i11, String string) {
        char cCharAt;
        kotlin.jvm.internal.r.e(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(j2.y.a(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(e1.c.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbB = p.i0.b(i11, "endIndex > string.length: ", " > ");
            sbB.append(string.length());
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                g0 g0VarG0 = g0(1);
                byte[] bArr = g0VarG0.f13063a;
                int i12 = g0VarG0.f13065c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = g0VarG0.f13065c;
                int i15 = (i12 + i10) - i14;
                g0VarG0.f13065c = i14 + i15;
                this.f13061b += i15;
            } else {
                if (cCharAt2 < 2048) {
                    g0 g0VarG02 = g0(2);
                    byte[] bArr2 = g0VarG02.f13063a;
                    int i16 = g0VarG02.f13065c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarG02.f13065c = i16 + 2;
                    this.f13061b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    g0 g0VarG03 = g0(3);
                    byte[] bArr3 = g0VarG03.f13063a;
                    int i17 = g0VarG03.f13065c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarG03.f13065c = i17 + 3;
                    this.f13061b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        q0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        g0 g0VarG04 = g0(4);
                        byte[] bArr4 = g0VarG04.f13063a;
                        int i20 = g0VarG04.f13065c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        g0VarG04.f13065c = i20 + 4;
                        this.f13061b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    @Override // hi.i
    public final String F(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jE = E((byte) 10, 0L, j11);
        if (jE != -1) {
            return ii.a.a(jE, this);
        }
        if (j11 < this.f13061b && z(j11 - 1) == 13 && z(j11) == 10) {
            return ii.a.a(j11, this);
        }
        g gVar = new g();
        l(gVar, 0L, Math.min(32, this.f13061b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f13061b, j10) + " content=" + gVar.m(gVar.f13061b).e() + (char) 8230);
    }

    public final void F0(String string) {
        kotlin.jvm.internal.r.e(string, "string");
        E0(0, string.length(), string);
    }

    public final void G0(int i10) {
        if (i10 < 128) {
            q0(i10);
            return;
        }
        if (i10 < 2048) {
            g0 g0VarG0 = g0(2);
            byte[] bArr = g0VarG0.f13063a;
            int i11 = g0VarG0.f13065c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            g0VarG0.f13065c = i11 + 2;
            this.f13061b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            q0(63);
            return;
        }
        if (i10 < 65536) {
            g0 g0VarG02 = g0(3);
            byte[] bArr2 = g0VarG02.f13063a;
            int i12 = g0VarG02.f13065c;
            bArr2[i12] = (byte) ((i10 >> 12) | BERTags.FLAGS);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            g0VarG02.f13065c = i12 + 3;
            this.f13061b += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.d(i10)));
        }
        g0 g0VarG03 = g0(4);
        byte[] bArr3 = g0VarG03.f13063a;
        int i13 = g0VarG03.f13065c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        g0VarG03.f13065c = i13 + 4;
        this.f13061b += 4;
    }

    public final long M(j targetBytes) {
        int i10;
        int i11;
        kotlin.jvm.internal.r.e(targetBytes, "targetBytes");
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            return -1L;
        }
        long j10 = this.f13061b;
        long j11 = 0;
        if (j10 < 0) {
            while (j10 > 0) {
                g0Var = g0Var.f13069g;
                kotlin.jvm.internal.r.b(g0Var);
                j10 -= g0Var.f13065c - g0Var.f13064b;
            }
            if (targetBytes.d() == 2) {
                byte bI = targetBytes.i(0);
                byte bI2 = targetBytes.i(1);
                while (j10 < this.f13061b) {
                    byte[] bArr = g0Var.f13063a;
                    i10 = (int) ((g0Var.f13064b + j11) - j10);
                    int i12 = g0Var.f13065c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bI || b10 == bI2) {
                            i11 = g0Var.f13064b;
                        } else {
                            i10++;
                        }
                    }
                    j11 = (g0Var.f13065c - g0Var.f13064b) + j10;
                    g0Var = g0Var.f13068f;
                    kotlin.jvm.internal.r.b(g0Var);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] bArrH = targetBytes.h();
            while (j10 < this.f13061b) {
                byte[] bArr2 = g0Var.f13063a;
                i10 = (int) ((g0Var.f13064b + j11) - j10);
                int i13 = g0Var.f13065c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrH) {
                        if (b11 == b12) {
                            i11 = g0Var.f13064b;
                        }
                    }
                    i10++;
                }
                j11 = (g0Var.f13065c - g0Var.f13064b) + j10;
                g0Var = g0Var.f13068f;
                kotlin.jvm.internal.r.b(g0Var);
                j10 = j11;
            }
            return -1L;
        }
        j10 = 0;
        while (true) {
            long j12 = (g0Var.f13065c - g0Var.f13064b) + j10;
            if (j12 > 0) {
                break;
            }
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j10 = j12;
        }
        if (targetBytes.d() == 2) {
            byte bI3 = targetBytes.i(0);
            byte bI4 = targetBytes.i(1);
            while (j10 < this.f13061b) {
                byte[] bArr3 = g0Var.f13063a;
                i10 = (int) ((g0Var.f13064b + j11) - j10);
                int i14 = g0Var.f13065c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bI3 || b13 == bI4) {
                        i11 = g0Var.f13064b;
                    } else {
                        i10++;
                    }
                }
                j11 = (g0Var.f13065c - g0Var.f13064b) + j10;
                g0Var = g0Var.f13068f;
                kotlin.jvm.internal.r.b(g0Var);
                j10 = j11;
            }
            return -1L;
        }
        byte[] bArrH2 = targetBytes.h();
        while (j10 < this.f13061b) {
            byte[] bArr4 = g0Var.f13063a;
            i10 = (int) ((g0Var.f13064b + j11) - j10);
            int i15 = g0Var.f13065c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrH2) {
                    if (b14 == b15) {
                        i11 = g0Var.f13064b;
                    }
                }
                i10++;
            }
            j11 = (g0Var.f13065c - g0Var.f13064b) + j10;
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j10 = j11;
        }
        return -1L;
        return (i10 - i11) + j10;
    }

    public final byte[] N(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(m0.r.a("byteCount: ", j10).toString());
        }
        if (this.f13061b < j10) {
            throw new EOFException();
        }
        byte[] sink = new byte[(int) j10];
        kotlin.jvm.internal.r.e(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return sink;
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h O(String str) {
        F0(str);
        return this;
    }

    @Override // hi.i
    public final String S(Charset charset) {
        return d0(this.f13061b, charset);
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h V(long j10) {
        v0(j10);
        return this;
    }

    @Override // hi.i
    public final boolean Y(long j10) {
        return this.f13061b >= j10;
    }

    public final short Z() throws EOFException {
        short s10 = readShort();
        int i10 = b.f13032a;
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    @Override // hi.i
    public final String a0() throws EOFException {
        return F(Long.MAX_VALUE);
    }

    @Override // hi.l0
    public final m0 b() {
        return m0.f13094d;
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f13061b == 0) {
            return gVar;
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        g0 g0VarC = g0Var.c();
        gVar.f13060a = g0VarC;
        g0VarC.f13069g = g0VarC;
        g0VarC.f13068f = g0VarC;
        for (g0 g0Var2 = g0Var.f13068f; g0Var2 != g0Var; g0Var2 = g0Var2.f13068f) {
            g0 g0Var3 = g0VarC.f13069g;
            kotlin.jvm.internal.r.b(g0Var3);
            kotlin.jvm.internal.r.b(g0Var2);
            g0Var3.b(g0Var2.c());
        }
        gVar.f13061b = this.f13061b;
        return gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, hi.j0
    public final void close() {
    }

    public final String d0(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.r.e(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(m0.r.a("byteCount: ", j10).toString());
        }
        if (this.f13061b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        int i10 = g0Var.f13064b;
        if (i10 + j10 > g0Var.f13065c) {
            return new String(N(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(g0Var.f13063a, i10, i11, charset);
        int i12 = g0Var.f13064b + i11;
        g0Var.f13064b = i12;
        this.f13061b -= j10;
        if (i12 == g0Var.f13065c) {
            this.f13060a = g0Var.a();
            h0.a(g0Var);
        }
        return str;
    }

    public final String e0() {
        return d0(this.f13061b, mh.a.f18238b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        long j10 = this.f13061b;
        g gVar = (g) obj;
        if (j10 != gVar.f13061b) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        g0 g0Var2 = gVar.f13060a;
        kotlin.jvm.internal.r.b(g0Var2);
        int i10 = g0Var.f13064b;
        int i11 = g0Var2.f13064b;
        long j11 = 0;
        while (j11 < this.f13061b) {
            long jMin = Math.min(g0Var.f13065c - i10, g0Var2.f13065c - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (g0Var.f13063a[i10] != g0Var2.f13063a[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == g0Var.f13065c) {
                g0Var = g0Var.f13068f;
                kotlin.jvm.internal.r.b(g0Var);
                i10 = g0Var.f13064b;
            }
            if (i11 == g0Var2.f13065c) {
                g0Var2 = g0Var2.f13068f;
                kotlin.jvm.internal.r.b(g0Var2);
                i11 = g0Var2.f13064b;
            }
            j11 += jMin;
        }
        return true;
    }

    public final j f0(int i10) {
        if (i10 == 0) {
            return j.f13075d;
        }
        b.b(this.f13061b, 0L, i10);
        g0 g0Var = this.f13060a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.r.b(g0Var);
            int i14 = g0Var.f13065c;
            int i15 = g0Var.f13064b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            g0Var = g0Var.f13068f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        g0 g0Var2 = this.f13060a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.r.b(g0Var2);
            bArr[i16] = g0Var2.f13063a;
            i11 += g0Var2.f13065c - g0Var2.f13064b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = g0Var2.f13064b;
            g0Var2.f13066d = true;
            i16++;
            g0Var2 = g0Var2.f13068f;
        }
        return new i0(bArr, iArr);
    }

    @Override // hi.h, hi.j0, java.io.Flushable
    public final void flush() {
    }

    public final g0 g0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            g0 g0VarB = h0.b();
            this.f13060a = g0VarB;
            g0VarB.f13069g = g0VarB;
            g0VarB.f13068f = g0VarB;
            return g0VarB;
        }
        g0 g0Var2 = g0Var.f13069g;
        kotlin.jvm.internal.r.b(g0Var2);
        if (g0Var2.f13065c + i10 <= 8192 && g0Var2.f13067e) {
            return g0Var2;
        }
        g0 g0VarB2 = h0.b();
        g0Var2.b(g0VarB2);
        return g0VarB2;
    }

    public final long h() {
        long j10 = this.f13061b;
        if (j10 == 0) {
            return 0L;
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        g0 g0Var2 = g0Var.f13069g;
        kotlin.jvm.internal.r.b(g0Var2);
        return (g0Var2.f13065c >= 8192 || !g0Var2.f13067e) ? j10 : j10 - (r3 - g0Var2.f13064b);
    }

    public final int hashCode() {
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = g0Var.f13065c;
            for (int i12 = g0Var.f13064b; i12 < i11; i12++) {
                i10 = (i10 * 31) + g0Var.f13063a[i12];
            }
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
        } while (g0Var != this.f13060a);
        return i10;
    }

    public final void i0(int i10, byte[] source) {
        kotlin.jvm.internal.r.e(source, "source");
        int i11 = 0;
        long j10 = i10;
        b.b(source.length, 0, j10);
        while (i11 < i10) {
            g0 g0VarG0 = g0(1);
            int iMin = Math.min(i10 - i11, 8192 - g0VarG0.f13065c);
            int i12 = i11 + iMin;
            qg.m.c(g0VarG0.f13065c, source, i11, g0VarG0.f13063a, i12);
            g0VarG0.f13065c += iMin;
            i11 = i12;
        }
        this.f13061b += j10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // hi.j0
    public final void j(long j10, g source) {
        g0 g0VarB;
        kotlin.jvm.internal.r.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.b(source.f13061b, 0L, j10);
        while (j10 > 0) {
            g0 g0Var = source.f13060a;
            kotlin.jvm.internal.r.b(g0Var);
            int i10 = g0Var.f13065c;
            g0 g0Var2 = source.f13060a;
            kotlin.jvm.internal.r.b(g0Var2);
            long j11 = i10 - g0Var2.f13064b;
            int i11 = 0;
            if (j10 < j11) {
                g0 g0Var3 = this.f13060a;
                g0 g0Var4 = g0Var3 != null ? g0Var3.f13069g : null;
                if (g0Var4 != null && g0Var4.f13067e) {
                    if ((g0Var4.f13065c + j10) - (g0Var4.f13066d ? 0 : g0Var4.f13064b) <= 8192) {
                        g0 g0Var5 = source.f13060a;
                        kotlin.jvm.internal.r.b(g0Var5);
                        g0Var5.d(g0Var4, (int) j10);
                        source.f13061b -= j10;
                        this.f13061b += j10;
                        return;
                    }
                }
                g0 g0Var6 = source.f13060a;
                kotlin.jvm.internal.r.b(g0Var6);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > g0Var6.f13065c - g0Var6.f13064b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    g0VarB = g0Var6.c();
                } else {
                    g0VarB = h0.b();
                    byte[] bArr = g0Var6.f13063a;
                    byte[] bArr2 = g0VarB.f13063a;
                    int i13 = g0Var6.f13064b;
                    qg.m.c(0, bArr, i13, bArr2, i13 + i12);
                }
                g0VarB.f13065c = g0VarB.f13064b + i12;
                g0Var6.f13064b += i12;
                g0 g0Var7 = g0Var6.f13069g;
                kotlin.jvm.internal.r.b(g0Var7);
                g0Var7.b(g0VarB);
                source.f13060a = g0VarB;
            }
            g0 g0Var8 = source.f13060a;
            kotlin.jvm.internal.r.b(g0Var8);
            long j12 = g0Var8.f13065c - g0Var8.f13064b;
            source.f13060a = g0Var8.a();
            g0 g0Var9 = this.f13060a;
            if (g0Var9 == null) {
                this.f13060a = g0Var8;
                g0Var8.f13069g = g0Var8;
                g0Var8.f13068f = g0Var8;
            } else {
                g0 g0Var10 = g0Var9.f13069g;
                kotlin.jvm.internal.r.b(g0Var10);
                g0Var10.b(g0Var8);
                g0 g0Var11 = g0Var8.f13069g;
                if (g0Var11 == g0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.r.b(g0Var11);
                if (g0Var11.f13067e) {
                    int i14 = g0Var8.f13065c - g0Var8.f13064b;
                    g0 g0Var12 = g0Var8.f13069g;
                    kotlin.jvm.internal.r.b(g0Var12);
                    int i15 = 8192 - g0Var12.f13065c;
                    g0 g0Var13 = g0Var8.f13069g;
                    kotlin.jvm.internal.r.b(g0Var13);
                    if (!g0Var13.f13066d) {
                        g0 g0Var14 = g0Var8.f13069g;
                        kotlin.jvm.internal.r.b(g0Var14);
                        i11 = g0Var14.f13064b;
                    }
                    if (i14 <= i15 + i11) {
                        g0 g0Var15 = g0Var8.f13069g;
                        kotlin.jvm.internal.r.b(g0Var15);
                        g0Var8.d(g0Var15, i14);
                        g0Var8.a();
                        h0.a(g0Var8);
                    }
                }
            }
            source.f13061b -= j12;
            this.f13061b += j12;
            j10 -= j12;
        }
    }

    public final void k0(j byteString) {
        kotlin.jvm.internal.r.e(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    public final void l(g out, long j10, long j11) {
        kotlin.jvm.internal.r.e(out, "out");
        long j12 = j10;
        b.b(this.f13061b, j12, j11);
        if (j11 == 0) {
            return;
        }
        out.f13061b += j11;
        g0 g0Var = this.f13060a;
        while (true) {
            kotlin.jvm.internal.r.b(g0Var);
            long j13 = g0Var.f13065c - g0Var.f13064b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            g0Var = g0Var.f13068f;
        }
        g0 g0Var2 = g0Var;
        long j14 = j11;
        while (j14 > 0) {
            kotlin.jvm.internal.r.b(g0Var2);
            g0 g0VarC = g0Var2.c();
            int i10 = g0VarC.f13064b + ((int) j12);
            g0VarC.f13064b = i10;
            g0VarC.f13065c = Math.min(i10 + ((int) j14), g0VarC.f13065c);
            g0 g0Var3 = out.f13060a;
            if (g0Var3 == null) {
                g0VarC.f13069g = g0VarC;
                g0VarC.f13068f = g0VarC;
                out.f13060a = g0VarC;
            } else {
                g0 g0Var4 = g0Var3.f13069g;
                kotlin.jvm.internal.r.b(g0Var4);
                g0Var4.b(g0VarC);
            }
            j14 -= g0VarC.f13065c - g0VarC.f13064b;
            g0Var2 = g0Var2.f13068f;
            j12 = 0;
        }
    }

    public final long l0(l0 source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        long j10 = 0;
        while (true) {
            long jY = source.y(8192L, this);
            if (jY == -1) {
                return j10;
            }
            j10 += jY;
        }
    }

    @Override // hi.i
    public final j m(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(m0.r.a("byteCount: ", j10).toString());
        }
        if (this.f13061b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new j(N(j10));
        }
        j jVarF0 = f0((int) j10);
        skip(j10);
        return jVarF0;
    }

    @Override // hi.i
    public final long m0(j0 j0Var) throws IOException {
        long j10 = this.f13061b;
        if (j10 > 0) {
            j0Var.j(j10, this);
        }
        return j10;
    }

    public final boolean p() {
        return this.f13061b == 0;
    }

    public final void q0(int i10) {
        g0 g0VarG0 = g0(1);
        byte[] bArr = g0VarG0.f13063a;
        int i11 = g0VarG0.f13065c;
        g0VarG0.f13065c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f13061b++;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.r.e(sink, "sink");
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), g0Var.f13065c - g0Var.f13064b);
        sink.put(g0Var.f13063a, g0Var.f13064b, iMin);
        int i10 = g0Var.f13064b + iMin;
        g0Var.f13064b = i10;
        this.f13061b -= iMin;
        if (i10 == g0Var.f13065c) {
            this.f13060a = g0Var.a();
            h0.a(g0Var);
        }
        return iMin;
    }

    @Override // hi.i
    public final byte readByte() throws EOFException {
        if (this.f13061b == 0) {
            throw new EOFException();
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        int i10 = g0Var.f13064b;
        int i11 = g0Var.f13065c;
        int i12 = i10 + 1;
        byte b10 = g0Var.f13063a[i10];
        this.f13061b--;
        if (i12 != i11) {
            g0Var.f13064b = i12;
            return b10;
        }
        this.f13060a = g0Var.a();
        h0.a(g0Var);
        return b10;
    }

    @Override // hi.i
    public final int readInt() throws EOFException {
        if (this.f13061b < 4) {
            throw new EOFException();
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        int i10 = g0Var.f13064b;
        int i11 = g0Var.f13065c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = g0Var.f13063a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f13061b -= 4;
        if (i14 != i11) {
            g0Var.f13064b = i14;
            return i15;
        }
        this.f13060a = g0Var.a();
        h0.a(g0Var);
        return i15;
    }

    @Override // hi.i
    public final short readShort() throws EOFException {
        if (this.f13061b < 2) {
            throw new EOFException();
        }
        g0 g0Var = this.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        int i10 = g0Var.f13064b;
        int i11 = g0Var.f13065c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = g0Var.f13063a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f13061b -= 2;
        if (i14 == i11) {
            this.f13060a = g0Var.a();
            h0.a(g0Var);
        } else {
            g0Var.f13064b = i14;
        }
        return (short) i15;
    }

    @Override // hi.i
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            g0 g0Var = this.f13060a;
            if (g0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, g0Var.f13065c - g0Var.f13064b);
            long j11 = iMin;
            this.f13061b -= j11;
            j10 -= j11;
            int i10 = g0Var.f13064b + iMin;
            g0Var.f13064b = i10;
            if (i10 == g0Var.f13065c) {
                this.f13060a = g0Var.a();
                h0.a(g0Var);
            }
        }
    }

    public final String toString() {
        long j10 = this.f13061b;
        if (j10 <= 2147483647L) {
            return f0((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f13061b).toString());
    }

    @Override // hi.i
    public final void u0(long j10) throws EOFException {
        if (this.f13061b < j10) {
            throw new EOFException();
        }
    }

    public final void v0(long j10) {
        if (j10 == 0) {
            q0(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        g0 g0VarG0 = g0(i10);
        byte[] bArr = g0VarG0.f13063a;
        int i11 = g0VarG0.f13065c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = ii.a.f14534a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        g0VarG0.f13065c += i10;
        this.f13061b += i10;
    }

    @Override // hi.i
    public final g w() {
        return this;
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h write(byte[] bArr) {
        m86write(bArr);
        return this;
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h writeByte(int i10) {
        q0(i10);
        return this;
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h writeInt(int i10) {
        y0(i10);
        return this;
    }

    @Override // hi.h
    public final /* bridge */ /* synthetic */ h writeShort(int i10) {
        D0(i10);
        return this;
    }

    @Override // hi.l0
    public final long y(long j10, g sink) {
        kotlin.jvm.internal.r.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f13061b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.j(j10, this);
        return j10;
    }

    public final void y0(int i10) {
        g0 g0VarG0 = g0(4);
        byte[] bArr = g0VarG0.f13063a;
        int i11 = g0VarG0.f13065c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        g0VarG0.f13065c = i11 + 4;
        this.f13061b += 4;
    }

    public final byte z(long j10) {
        b.b(this.f13061b, j10, 1L);
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            kotlin.jvm.internal.r.b(null);
            throw null;
        }
        long j11 = this.f13061b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                g0Var = g0Var.f13069g;
                kotlin.jvm.internal.r.b(g0Var);
                j11 -= g0Var.f13065c - g0Var.f13064b;
            }
            return g0Var.f13063a[(int) ((g0Var.f13064b + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = g0Var.f13065c;
            int i11 = g0Var.f13064b;
            long j13 = (i10 - i11) + j12;
            if (j13 > j10) {
                return g0Var.f13063a[(int) ((i11 + j10) - j12)];
            }
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j12 = j13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4 A[EDGE_INSN: B:44:0x00a4->B:38:0x00a4 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // hi.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z0() throws EOFException {
        int i10;
        if (this.f13061b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            g0 g0Var = this.f13060a;
            kotlin.jvm.internal.r.b(g0Var);
            byte[] bArr = g0Var.f13063a;
            int i12 = g0Var.f13064b;
            int i13 = g0Var.f13065c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else if (b10 < 65 || b10 > 70) {
                    z10 = true;
                    if (i11 == 0) {
                        int i14 = b.f13032a;
                        char[] cArr = ii.b.f14536a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & RegisterType.DOUBLE_HI]})));
                    }
                    if (i12 != i13) {
                        this.f13060a = g0Var.a();
                        h0.a(g0Var);
                    } else {
                        g0Var.f13064b = i12;
                    }
                    if (!z10) {
                        break;
                    }
                } else {
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    g gVar = new g();
                    gVar.v0(j10);
                    gVar.q0(b10);
                    throw new NumberFormatException("Number too large: ".concat(gVar.e0()));
                }
                j10 = (j10 << 4) | i10;
                i12++;
                i11++;
            }
            if (i12 != i13) {
            }
            if (!z10) {
            }
        } while (this.f13060a != null);
        this.f13061b -= i11;
        return j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            g0 g0VarG0 = g0(1);
            int iMin = Math.min(i10, 8192 - g0VarG0.f13065c);
            source.get(g0VarG0.f13063a, g0VarG0.f13065c, iMin);
            i10 -= iMin;
            g0VarG0.f13065c += iMin;
        }
        this.f13061b += iRemaining;
        return iRemaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m86write(byte[] source) {
        kotlin.jvm.internal.r.e(source, "source");
        i0(source.length, source);
    }

    public final int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.r.e(sink, "sink");
        b.b(sink.length, i10, i11);
        g0 g0Var = this.f13060a;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, g0Var.f13065c - g0Var.f13064b);
        byte[] bArr = g0Var.f13063a;
        int i12 = g0Var.f13064b;
        qg.m.c(i10, bArr, i12, sink, i12 + iMin);
        int i13 = g0Var.f13064b + iMin;
        g0Var.f13064b = i13;
        this.f13061b -= iMin;
        if (i13 == g0Var.f13065c) {
            this.f13060a = g0Var.a();
            h0.a(g0Var);
        }
        return iMin;
    }
}
