package df;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class f extends OutputStream {

    /* renamed from: q, reason: collision with root package name */
    public static final a[] f7947q = new a[64];

    /* renamed from: r, reason: collision with root package name */
    public static final a[] f7948r = new a[40];

    /* renamed from: s, reason: collision with root package name */
    public static final a[] f7949s;

    /* renamed from: t, reason: collision with root package name */
    public static final a[] f7950t;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7954d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7955e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f7956f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f7957g;

    /* renamed from: p, reason: collision with root package name */
    public final OutputStream f7964p;

    /* renamed from: a, reason: collision with root package name */
    public int f7951a = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f7958h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f7959j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7960k = 0;

    /* renamed from: l, reason: collision with root package name */
    public byte f7961l = 0;

    /* renamed from: m, reason: collision with root package name */
    public byte f7962m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final int f7963n = 1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7965a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7966b;

        public a(int i10, int i11) {
            this.f7965a = i10;
            this.f7966b = i11;
        }
    }

    static {
        int i10 = 0;
        while (true) {
            short[][] sArr = e.f7918q;
            if (i10 >= 9) {
                break;
            }
            int i11 = i10 + 4;
            int i12 = 0;
            while (true) {
                short[] sArr2 = e.f7920s[i10];
                if (i12 < sArr2.length) {
                    short s10 = e.f7921t[i10][i12];
                    short s11 = sArr2[i12];
                    if (s10 < 64) {
                        f7947q[s10] = new a(s11, i11);
                    } else {
                        f7948r[(s10 / 64) - 1] = new a(s11, i11);
                    }
                    i12++;
                }
            }
            i10++;
        }
        f7949s = new a[64];
        f7950t = new a[40];
        int i13 = 0;
        while (true) {
            short[][] sArr3 = e.f7918q;
            if (i13 >= 12) {
                return;
            }
            int i14 = i13 + 2;
            int i15 = 0;
            while (true) {
                short[] sArr4 = e.f7918q[i13];
                if (i15 < sArr4.length) {
                    short s12 = e.f7919r[i13][i15];
                    short s13 = sArr4[i15];
                    if (s12 < 64) {
                        f7949s[s12] = new a(s13, i14);
                    } else {
                        f7950t[(s12 / 64) - 1] = new a(s13, i14);
                    }
                    i15++;
                }
            }
            i13++;
        }
    }

    public f(OutputStream outputStream, int i10, int i11) {
        this.f7964p = outputStream;
        this.f7954d = i10;
        this.f7955e = i11;
        this.f7957g = new int[i10];
        this.f7956f = new int[i10];
        int i12 = (i10 + 7) / 8;
        this.f7953c = i12;
        this.f7952b = new byte[i12];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7964p.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f7964p.flush();
    }

    public final void h(int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            boolean z10 = ((i10 >> ((i11 - i12) - 1)) & 1) == 1;
            if (this.f7963n == 1) {
                this.f7961l = (byte) ((z10 ? 1 << (7 - (this.f7962m % 8)) : 0) | this.f7961l);
            } else {
                this.f7961l = (byte) ((z10 ? 1 << (this.f7962m % 8) : 0) | this.f7961l);
            }
            byte b10 = (byte) (this.f7962m + 1);
            this.f7962m = b10;
            if (b10 == 8) {
                this.f7964p.write(this.f7961l);
                this.f7961l = (byte) 0;
                this.f7962m = (byte) 0;
            }
        }
    }

    public final void l(int i10, boolean z10) throws IOException {
        int length = i10 / 64;
        a[] aVarArr = z10 ? f7948r : f7950t;
        while (length > 0) {
            if (length >= aVarArr.length) {
                h(aVarArr[aVarArr.length - 1].f7965a, aVarArr[aVarArr.length - 1].f7966b);
                length -= aVarArr.length;
            } else {
                a aVar = aVarArr[length - 1];
                h(aVar.f7965a, aVar.f7966b);
                length = 0;
            }
        }
        a aVar2 = z10 ? f7947q[i10 % 64] : f7949s[i10 % 64];
        h(aVar2.f7965a, aVar2.f7966b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        r7[0] = r12;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r9 >= r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        r7[1] = r11[r9];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(int i10) throws IOException {
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14 = this.f7951a;
        byte[] bArr = this.f7952b;
        bArr[i14] = (byte) i10;
        int i15 = i14 + 1;
        this.f7951a = i15;
        if (i15 == this.f7953c) {
            this.f7958h++;
            int[] iArr2 = this.f7957g;
            this.f7957g = this.f7956f;
            this.f7956f = iArr2;
            this.f7960k = this.f7959j;
            this.f7959j = 0;
            boolean z10 = true;
            int i16 = 0;
            while (true) {
                i11 = this.f7954d;
                if (i16 >= i11) {
                    break;
                }
                if ((((bArr[i16 / 8] >> (7 - (i16 % 8))) & 1) == 1) == z10) {
                    int[] iArr3 = this.f7956f;
                    int i17 = this.f7959j;
                    iArr3[i17] = i16;
                    this.f7959j = i17 + 1;
                    z10 = !z10;
                }
                i16++;
            }
            boolean z11 = true;
            int i18 = 0;
            while (i18 < i11) {
                int[] iArr4 = {i11, i11};
                int i19 = 0;
                while (true) {
                    i12 = this.f7959j;
                    if (i19 < i12) {
                        iArr = this.f7956f;
                        i13 = iArr[i19];
                        if (i18 >= i13 && (i18 != 0 || !z11)) {
                            i19++;
                        }
                    }
                }
                iArr4[0] = i13;
                int i20 = i19 + 1;
                if (i20 < i12) {
                    iArr4[1] = iArr[i20];
                }
                int[] iArr5 = {i11, i11};
                boolean z12 = !z11;
                ?? r92 = z12;
                while (true) {
                    int i21 = this.f7960k;
                    if (r92 < i21) {
                        int[] iArr6 = this.f7957g;
                        int i22 = iArr6[r92];
                        if (i22 <= i18 && (i18 != 0 || r92 != 0)) {
                            r92 += 2;
                        }
                    }
                }
                int i23 = iArr4[0];
                int i24 = i23 - iArr5[0];
                if (i23 > iArr5[1]) {
                    h(1, 4);
                    i18 = iArr5[1];
                } else if (i24 > 3 || i24 < -3) {
                    h(1, 3);
                    l(iArr4[0] - i18, z11);
                    l(iArr4[1] - iArr4[0], z12);
                    i18 = iArr4[1];
                } else {
                    switch (i24) {
                        case -3:
                            h(2, 7);
                            break;
                        case -2:
                            h(2, 6);
                            break;
                        case -1:
                            h(2, 3);
                            break;
                        case 0:
                            h(1, 1);
                            break;
                        case 1:
                            h(3, 3);
                            break;
                        case 2:
                            h(3, 6);
                            break;
                        case 3:
                            h(3, 7);
                            break;
                    }
                    i18 = iArr5[0] + i24;
                    z11 = z12;
                }
            }
            if (this.f7958h == this.f7955e) {
                h(1, 12);
                h(1, 12);
                if (this.f7962m != 0) {
                    this.f7964p.write(this.f7961l);
                }
                this.f7961l = (byte) 0;
                this.f7962m = (byte) 0;
            }
            this.f7951a = 0;
        }
    }
}
