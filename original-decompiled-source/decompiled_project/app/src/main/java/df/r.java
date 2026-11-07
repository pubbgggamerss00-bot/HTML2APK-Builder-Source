package df;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r {

    public static final class a extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public int f7971a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7972b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7973c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7974d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7975e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f7976f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f7977g;

        /* renamed from: h, reason: collision with root package name */
        public byte[] f7978h;

        /* renamed from: j, reason: collision with root package name */
        public int f7979j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7980k;

        public a(OutputStream outputStream, int i10, int i11, int i12, int i13) {
            super(outputStream);
            this.f7979j = 0;
            this.f7980k = false;
            this.f7971a = i10;
            this.f7972b = i11;
            this.f7973c = i12;
            this.f7974d = i13;
            int i14 = (((i11 * i12) * i13) + 7) / 8;
            this.f7975e = i14;
            this.f7976f = i10 >= 10;
            this.f7977g = new byte[i14];
            this.f7978h = new byte[i14];
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            int i10 = this.f7979j;
            if (i10 > 0) {
                Arrays.fill(this.f7977g, i10, this.f7975e, (byte) 0);
                h();
            }
            super.flush();
        }

        public final void h() throws IOException {
            int i10 = this.f7971a;
            byte[] bArr = this.f7977g;
            byte[] bArr2 = this.f7978h;
            if (i10 != 1) {
                int i11 = this.f7972b;
                int i12 = this.f7973c;
                int i13 = ((i11 * i12) + 7) / 8;
                int length = bArr.length;
                if (i10 != 2) {
                    switch (i10) {
                        case 11:
                            for (int i14 = i13; i14 < length; i14++) {
                                bArr[i14] = (byte) (bArr[i14] + bArr[i14 - i13]);
                            }
                            break;
                        case 12:
                            for (int i15 = 0; i15 < length; i15++) {
                                bArr[i15] = (byte) (((bArr[i15] & 255) + (bArr2[i15] & 255)) & 255);
                            }
                            break;
                        case 13:
                            for (int i16 = 0; i16 < length; i16++) {
                                int i17 = i16 - i13;
                                bArr[i16] = (byte) (((((i17 >= 0 ? bArr[i17] & 255 : 0) + (bArr2[i16] & 255)) / 2) + (bArr[i16] & 255)) & 255);
                            }
                            break;
                        case 14:
                            for (int i18 = 0; i18 < length; i18++) {
                                int i19 = bArr[i18] & 255;
                                int i20 = i18 - i13;
                                int i21 = i20 >= 0 ? bArr[i20] & 255 : 0;
                                int i22 = bArr2[i18] & 255;
                                int i23 = i20 >= 0 ? bArr2[i20] & 255 : 0;
                                int i24 = (i21 + i22) - i23;
                                int iAbs = Math.abs(i24 - i21);
                                int iAbs2 = Math.abs(i24 - i22);
                                int iAbs3 = Math.abs(i24 - i23);
                                if (iAbs <= iAbs2 && iAbs <= iAbs3) {
                                    bArr[i18] = (byte) ((i19 + i21) & 255);
                                } else if (iAbs2 <= iAbs3) {
                                    bArr[i18] = (byte) ((i19 + i22) & 255);
                                } else {
                                    bArr[i18] = (byte) ((i19 + i23) & 255);
                                }
                            }
                            break;
                    }
                } else if (i12 == 8) {
                    for (int i25 = i13; i25 < length; i25++) {
                        bArr[i25] = (byte) ((bArr[i25] & 255) + (bArr[i25 - i13] & 255));
                    }
                } else if (i12 == 16) {
                    for (int i26 = i13; i26 < length - 1; i26 += 2) {
                        int i27 = i26 + 1;
                        int i28 = i26 - i13;
                        int i29 = ((bArr[i28] & 255) << 8) + (bArr[i28 + 1] & 255) + ((bArr[i26] & 255) << 8) + (bArr[i27] & 255);
                        bArr[i26] = (byte) ((i29 >> 8) & 255);
                        bArr[i27] = (byte) (i29 & 255);
                    }
                } else if (i12 == 1 && i11 == 1) {
                    for (int i30 = 0; i30 < length; i30++) {
                        int i31 = 7;
                        while (i31 >= 0) {
                            int i32 = bArr[i30];
                            int i33 = (i32 >> i31) & 1;
                            if (i30 != 0 || i31 != 7) {
                                if (((i33 + ((i31 == 7 ? bArr[i30 - 1] : i32 >> (i31 + 1)) & 1)) & 1) == 0) {
                                    bArr[i30] = (byte) (i32 & (~(1 << i31)));
                                } else {
                                    bArr[i30] = (byte) (i32 | (1 << i31));
                                }
                            }
                            i31--;
                        }
                    }
                } else {
                    int i34 = this.f7974d * i11;
                    for (int i35 = i11; i35 < i34; i35++) {
                        int i36 = i35 * i12;
                        int i37 = i36 / 8;
                        int i38 = (8 - (i36 % 8)) - i12;
                        int i39 = (i35 - i11) * i12;
                        int i40 = bArr[i37];
                        int i41 = (1 << i12) - 1;
                        bArr[i37] = (byte) ((((((i40 >>> i38) & i41) + ((bArr[i39 / 8] >>> ((8 - (i39 % 8)) - i12)) & i41)) & i41) << i38) | ((~(i41 << i38)) & i40));
                    }
                }
            }
            ((FilterOutputStream) this).out.write(this.f7977g);
            byte[] bArr3 = this.f7978h;
            this.f7978h = this.f7977g;
            this.f7977g = bArr3;
            this.f7979j = 0;
            this.f7980k = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = i11 + i10;
            while (i10 < i12) {
                if (this.f7976f && this.f7979j == 0 && !this.f7980k) {
                    this.f7971a = bArr[i10] + 10;
                    i10++;
                    this.f7980k = true;
                } else {
                    int iMin = Math.min(this.f7975e - this.f7979j, i12 - i10);
                    System.arraycopy(bArr, i10, this.f7977g, this.f7979j, iMin);
                    int i13 = this.f7979j + iMin;
                    this.f7979j = i13;
                    i10 += iMin;
                    if (i13 == this.f7977g.length) {
                        h();
                    }
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(int i10) throws IOException {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public static OutputStream a(OutputStream outputStream, cf.d dVar) {
        int iG0 = dVar.G0(cf.l.P1, null, -1);
        return iG0 > 1 ? new a(outputStream, iG0, Math.min(dVar.G0(cf.l.S, null, 1), 32), dVar.G0(cf.l.f5537y, null, 8), dVar.G0(cf.l.U, null, 1)) : outputStream;
    }
}
