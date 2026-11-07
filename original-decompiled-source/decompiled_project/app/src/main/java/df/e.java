package df;

import com.android.apksig.internal.zip.ZipUtils;
import j2.y;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends FilterInputStream {
    public static final b A;

    /* renamed from: q, reason: collision with root package name */
    public static final short[][] f7918q = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};

    /* renamed from: r, reason: collision with root package name */
    public static final short[][] f7919r = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, ZipUtils.GP_FLAG_EFS, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, 576, 896, 960, 1024, 1088, 1152, 1216}};

    /* renamed from: s, reason: collision with root package name */
    public static final short[][] f7920s = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};

    /* renamed from: t, reason: collision with root package name */
    public static final short[][] f7921t = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, 512, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, ZipUtils.GP_FLAG_EFS, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* renamed from: v, reason: collision with root package name */
    public static final a f7922v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f7923w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f7924x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f7925y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f7926z;

    /* renamed from: a, reason: collision with root package name */
    public final int f7927a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f7928b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7929c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7931e;

    /* renamed from: f, reason: collision with root package name */
    public int f7932f;

    /* renamed from: g, reason: collision with root package name */
    public int f7933g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7934h;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7935j;

    /* renamed from: k, reason: collision with root package name */
    public int f7936k;

    /* renamed from: l, reason: collision with root package name */
    public int f7937l;

    /* renamed from: m, reason: collision with root package name */
    public int f7938m;

    /* renamed from: n, reason: collision with root package name */
    public int f7939n;

    /* renamed from: p, reason: collision with root package name */
    public int f7940p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public a f7941a;

        /* renamed from: b, reason: collision with root package name */
        public a f7942b;

        /* renamed from: c, reason: collision with root package name */
        public int f7943c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7944d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7945e = false;

        public final String toString() {
            return "[leaf=" + this.f7945e + ", value=" + this.f7943c + ", canBeFill=" + this.f7944d + "]";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a f7946a = new a();

        public final void a(int i10, int i11, int i12) throws IOException {
            a aVar = this.f7946a;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i10 - 1;
                boolean z10 = ((i11 >> (i14 - i13)) & 1) == 1;
                a aVar2 = z10 ? aVar.f7942b : aVar.f7941a;
                if (aVar2 == null) {
                    aVar2 = new a();
                    if (i13 == i14) {
                        aVar2.f7943c = i12;
                        aVar2.f7945e = true;
                    }
                    if (i11 == 0) {
                        aVar2.f7944d = true;
                    }
                    if (z10) {
                        aVar.f7942b = aVar2;
                    } else {
                        aVar.f7941a = aVar2;
                    }
                } else if (aVar2.f7945e) {
                    throw new IOException("node is leaf, no other following");
                }
                aVar = aVar2;
            }
        }

        public final void b(int i10, a aVar) throws IOException {
            a aVar2 = this.f7946a;
            int i11 = 0;
            while (i11 < 12) {
                boolean z10 = ((i10 >> (11 - i11)) & 1) == 1;
                a aVar3 = z10 ? aVar2.f7942b : aVar2.f7941a;
                if (aVar3 == null) {
                    aVar3 = i11 == 11 ? aVar : new a();
                    if (i10 == 0) {
                        aVar3.f7944d = true;
                    }
                    if (z10) {
                        aVar2.f7942b = aVar3;
                    } else {
                        aVar2.f7941a = aVar3;
                    }
                } else if (aVar3.f7945e) {
                    throw new IOException("node is leaf, no other following");
                }
                aVar2 = aVar3;
                i11++;
            }
        }
    }

    static {
        a aVar = new a();
        f7922v = aVar;
        aVar.f7945e = true;
        aVar.f7943c = -2000;
        a aVar2 = new a();
        f7923w = aVar2;
        aVar2.f7943c = -1000;
        aVar2.f7941a = aVar2;
        aVar2.f7942b = aVar;
        b bVar = new b();
        f7926z = bVar;
        try {
            bVar.b(0, aVar2);
            bVar.b(1, aVar);
            f7924x = new b();
            for (int i10 = 0; i10 < 12; i10++) {
                int i11 = 0;
                while (true) {
                    try {
                        short[] sArr = f7918q[i10];
                        if (i11 < sArr.length) {
                            f7924x.a(i10 + 2, sArr[i11], f7919r[i10][i11]);
                            i11++;
                        }
                    } catch (IOException e10) {
                        throw new AssertionError(e10);
                    }
                }
            }
            b bVar2 = f7924x;
            bVar2.b(0, f7923w);
            bVar2.b(1, f7922v);
            f7925y = new b();
            for (int i12 = 0; i12 < 9; i12++) {
                int i13 = 0;
                while (true) {
                    try {
                        short[] sArr2 = f7920s[i12];
                        if (i13 < sArr2.length) {
                            f7925y.a(i12 + 4, sArr2[i13], f7921t[i12][i13]);
                            i13++;
                        }
                    } catch (IOException e11) {
                        throw new AssertionError(e11);
                    }
                }
            }
            b bVar3 = f7925y;
            bVar3.b(0, f7923w);
            bVar3.b(1, f7922v);
            b bVar4 = new b();
            A = bVar4;
            try {
                bVar4.a(4, 1, -3000);
                bVar4.a(3, 1, -4000);
                bVar4.a(1, 1, 0);
                bVar4.a(3, 3, 1);
                bVar4.a(6, 3, 2);
                bVar4.a(7, 3, 3);
                bVar4.a(3, 2, -1);
                bVar4.a(6, 2, -2);
                bVar4.a(7, 2, -3);
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public e(InputStream inputStream, int i10, int i11, long j10, boolean z10) {
        super(inputStream);
        this.f7938m = 0;
        this.f7939n = -1;
        this.f7940p = -1;
        this.f7927a = i10;
        this.f7931e = i11;
        this.f7928b = new byte[(i10 + 7) / 8];
        int i12 = i10 + 2;
        this.f7934h = new int[i12];
        this.f7935j = new int[i12];
        if (i11 == 2) {
            this.f7930d = z10;
            this.f7929c = false;
        } else if (i11 == 3) {
            this.f7930d = z10;
            this.f7929c = (1 & j10) != 0;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException(y.a(i11, "Illegal parameter: "));
            }
            this.f7930d = z10;
            this.f7929c = false;
        }
    }

    public final void E() throws IOException {
        if (this.f7933g >= this.f7932f) {
            this.f7932f = 0;
            try {
                p();
            } catch (EOFException e10) {
                if (this.f7932f != 0) {
                    throw e10;
                }
                this.f7932f = -1;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new IOException("Malformed CCITT stream", e11);
            }
            this.f7933g = 0;
        }
    }

    public final int M(int i10, boolean z10) {
        int i11 = (this.f7938m & (-2)) + (!z10 ? 1 : 0);
        if (i11 > 2) {
            i11 -= 2;
        }
        if (i10 == 0) {
            return i11;
        }
        while (i11 < this.f7936k) {
            if (i10 < this.f7934h[i11]) {
                this.f7938m = i11;
                return i11;
            }
            i11 += 2;
        }
        return -1;
    }

    public final boolean N() throws IOException {
        int i10 = this.f7940p;
        if (i10 < 0 || i10 > 7) {
            int i11 = ((FilterInputStream) this).in.read();
            this.f7939n = i11;
            if (i11 == -1) {
                throw new EOFException("Unexpected end of Huffman RLE stream");
            }
            this.f7940p = 0;
        }
        int i12 = this.f7939n;
        boolean z10 = (i12 & 128) != 0;
        this.f7939n = i12 << 1;
        this.f7940p++;
        return z10;
    }

    public final void h() throws IOException {
        int iZ = 0;
        this.f7937l = 0;
        boolean z10 = true;
        do {
            iZ += z10 ? z(f7925y) : z(f7924x);
            int[] iArr = this.f7935j;
            int i10 = this.f7937l;
            this.f7937l = i10 + 1;
            iArr[i10] = iZ;
            z10 = !z10;
        } while (iZ < this.f7927a);
    }

    public final void l() throws IOException {
        int i10;
        this.f7936k = this.f7937l;
        int[] iArr = this.f7935j;
        this.f7935j = this.f7934h;
        this.f7934h = iArr;
        int iZ = 0;
        this.f7937l = 0;
        boolean z10 = true;
        while (true) {
            int i11 = this.f7927a;
            if (iZ >= i11) {
                return;
            }
            a aVar = A.f7946a;
            while (true) {
                aVar = N() ? aVar.f7942b : aVar.f7941a;
                if (aVar != null) {
                    if (aVar.f7945e) {
                        int i12 = aVar.f7943c;
                        if (i12 == -4000) {
                            b bVar = f7924x;
                            b bVar2 = f7925y;
                            int iZ2 = z(z10 ? bVar2 : bVar) + iZ;
                            int[] iArr2 = this.f7935j;
                            int i13 = this.f7937l;
                            this.f7937l = i13 + 1;
                            iArr2[i13] = iZ2;
                            if (!z10) {
                                bVar = bVar2;
                            }
                            iZ = z(bVar) + iZ2;
                            int[] iArr3 = this.f7935j;
                            int i14 = this.f7937l;
                            this.f7937l = i14 + 1;
                            iArr3[i14] = iZ;
                        } else if (i12 != -3000) {
                            int iM = M(iZ, z10);
                            if (iM >= this.f7936k || iM == -1) {
                                i10 = aVar.f7943c;
                            } else {
                                i10 = this.f7934h[iM];
                                i11 = aVar.f7943c;
                            }
                            iZ = i10 + i11;
                            int[] iArr4 = this.f7935j;
                            int i15 = this.f7937l;
                            iArr4[i15] = iZ;
                            this.f7937l = i15 + 1;
                            z10 = !z10;
                        } else {
                            int iM2 = M(iZ, z10) + 1;
                            iZ = iM2 >= this.f7936k ? i11 : this.f7934h[iM2];
                        }
                    }
                }
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() throws IOException {
        int i10;
        int i11;
        byte[] bArr;
        boolean z10 = this.f7930d;
        int i12 = this.f7931e;
        if (i12 == 2) {
            if (z10) {
                this.f7940p = -1;
            }
            h();
        } else if (i12 == 3) {
            if (z10) {
                this.f7940p = -1;
            }
            loop4: while (true) {
                a aVar = f7926z.f7946a;
                do {
                    aVar = N() ? aVar.f7942b : aVar.f7941a;
                    if (aVar == null) {
                        break;
                    }
                } while (!aVar.f7945e);
                if (this.f7929c || N()) {
                    h();
                } else {
                    l();
                }
            }
            if (this.f7929c) {
                h();
            }
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException(y.a(i12, "Illegal parameter: "));
            }
            if (z10) {
                this.f7940p = -1;
            }
            l();
        }
        this.f7938m = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = true;
        while (true) {
            int i15 = this.f7937l;
            i10 = this.f7927a;
            if (i13 > i15) {
                break;
            }
            int i16 = i13 != i15 ? this.f7935j[i13] : i10;
            if (i16 <= i10) {
                i10 = i16;
            }
            int i17 = i14 / 8;
            while (true) {
                i11 = i14 % 8;
                bArr = this.f7928b;
                if (i11 == 0 || i10 - i14 <= 0) {
                    break;
                }
                bArr[i17] = (byte) ((z11 ? 0 : 1 << (7 - i11)) | bArr[i17]);
                i14++;
            }
            if (i11 == 0) {
                i17 = i14 / 8;
                byte b10 = (byte) (z11 ? 0 : 255);
                while (i10 - i14 > 7) {
                    bArr[i17] = b10;
                    i14 += 8;
                    i17++;
                }
            }
            while (i10 - i14 > 0) {
                int i18 = i14 % 8;
                if (i18 == 0) {
                    bArr[i17] = 0;
                }
                bArr[i17] = (byte) ((z11 ? 0 : 1 << (7 - i18)) | bArr[i17]);
                i14++;
            }
            z11 = !z11;
            i13++;
        }
        if (i14 != i10) {
            throw new IOException(e1.c.a(i14, i10, "Sum of run-lengths does not equal scan line width: ", " > "));
        }
        this.f7932f = (i14 + 7) / 8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f7932f;
        if (i10 < 0) {
            return 0;
        }
        if (this.f7933g >= i10) {
            E();
            if (this.f7932f < 0) {
                return 0;
            }
        }
        int i11 = this.f7933g;
        this.f7933g = i11 + 1;
        return this.f7928b[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        int i10 = this.f7932f;
        if (i10 < 0) {
            return -1L;
        }
        if (this.f7933g >= i10) {
            E();
            if (this.f7932f < 0) {
                return -1L;
            }
        }
        int iMin = (int) Math.min(this.f7932f - this.f7933g, j10);
        this.f7933g += iMin;
        return iMin;
    }

    public final int z(b bVar) throws IOException {
        a aVar = bVar.f7946a;
        int i10 = 0;
        while (true) {
            aVar = N() ? aVar.f7942b : aVar.f7941a;
            if (aVar == null) {
                throw new IOException("Unknown code in Huffman RLE stream");
            }
            if (aVar.f7945e) {
                int i11 = aVar.f7943c;
                i10 += i11;
                if (i11 < 64) {
                    return i11 >= 0 ? i10 : this.f7927a;
                }
                aVar = bVar.f7946a;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f7932f;
        if (i12 < 0) {
            Arrays.fill(bArr, i10, i10 + i11, (byte) 0);
            return i11;
        }
        if (this.f7933g >= i12) {
            E();
            if (this.f7932f < 0) {
                Arrays.fill(bArr, i10, i10 + i11, (byte) 0);
                return i11;
            }
        }
        int iMin = Math.min(this.f7932f - this.f7933g, i11);
        System.arraycopy(this.f7928b, this.f7933g, bArr, i10, iMin);
        this.f7933g += iMin;
        return iMin;
    }
}
