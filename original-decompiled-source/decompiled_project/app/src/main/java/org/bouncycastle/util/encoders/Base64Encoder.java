package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = 61;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13) throws IOException {
        char c14 = this.padding;
        if (c12 == c14) {
            if (c13 != c14) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b10 = bArr[c10];
            byte b11 = bArr[c11];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            return 1;
        }
        if (c13 == c14) {
            byte[] bArr2 = this.decodingTable;
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c12];
            if ((b12 | b13 | b14) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b12 << 2) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b14 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b15 = bArr3[c10];
        byte b16 = bArr3[c11];
        byte b17 = bArr3[c12];
        byte b18 = bArr3[c13];
        if ((b15 | b16 | b17 | b18) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b15 << 2) | (b16 >> 4));
        outputStream.write((b16 << 4) | (b17 >> 2));
        outputStream.write((b17 << 6) | b18);
        return 3;
    }

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(String str, int i10, int i11) {
        while (i10 < i11 && ignore(str.charAt(i10))) {
            i10++;
        }
        return i10;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i10 = length;
        int i11 = 0;
        while (i10 > 0 && i11 != 4) {
            if (!ignore(str.charAt(i10 - 1))) {
                i11++;
            }
            i10--;
        }
        int iNextI = nextI(str, 0, i10);
        int i12 = 0;
        int i13 = 0;
        while (iNextI < i10) {
            int i14 = iNextI + 1;
            byte b10 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, i14, i10);
            int i15 = iNextI2 + 1;
            byte b11 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, i15, i10);
            int i16 = iNextI3 + 1;
            byte b12 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, i16, i10);
            int i17 = iNextI4 + 1;
            byte b13 = this.decodingTable[str.charAt(iNextI4)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i12] = (byte) ((b10 << 2) | (b11 >> 4));
            int i18 = i12 + 2;
            bArr[i12 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i12 += 3;
            bArr[i18] = (byte) ((b12 << 6) | b13);
            i13 += 3;
            if (i12 == 54) {
                outputStream.write(bArr);
                i12 = 0;
            }
            iNextI = nextI(str, i17, i10);
        }
        if (i12 > 0) {
            outputStream.write(bArr, 0, i12);
        }
        int iNextI5 = nextI(str, iNextI, length);
        int iNextI6 = nextI(str, iNextI5 + 1, length);
        int iNextI7 = nextI(str, iNextI6 + 1, length);
        return i13 + decodeLastBlock(outputStream, str.charAt(iNextI5), str.charAt(iNextI6), str.charAt(iNextI7), str.charAt(nextI(str, iNextI7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        if (i11 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i12 = i10;
        int i13 = i11;
        while (i13 > 0) {
            int iMin = Math.min(54, i13);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i12, iMin, bArr2, 0));
            i12 += iMin;
            i13 -= iMin;
            bArr = bArr3;
        }
        return ((i11 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i10) {
        return ((i10 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i10) {
        return (i10 / 4) * 3;
    }

    public void initialiseDecodingTable() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i10 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private int nextI(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && ignore((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[54];
        int i12 = i10 + i11;
        while (i12 > i10 && ignore((char) bArr[i12 - 1])) {
            i12--;
        }
        if (i12 == 0) {
            return 0;
        }
        int i13 = i12;
        int i14 = 0;
        while (i13 > i10 && i14 != 4) {
            if (!ignore((char) bArr[i13 - 1])) {
                i14++;
            }
            i13--;
        }
        int iNextI = nextI(bArr, i10, i13);
        int i15 = 0;
        int i16 = 0;
        while (iNextI < i13) {
            int i17 = iNextI + 1;
            byte b10 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i17, i13);
            int i18 = iNextI2 + 1;
            byte b11 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i18, i13);
            int i19 = iNextI3 + 1;
            byte b12 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i19, i13);
            int i20 = iNextI4 + 1;
            byte b13 = this.decodingTable[bArr[iNextI4]];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr2[i15] = (byte) ((b10 << 2) | (b11 >> 4));
            int i21 = i15 + 2;
            bArr2[i15 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i15 += 3;
            bArr2[i21] = (byte) ((b12 << 6) | b13);
            if (i15 == 54) {
                outputStream.write(bArr2);
                i15 = 0;
            }
            i16 += 3;
            iNextI = nextI(bArr, i20, i13);
        }
        if (i15 > 0) {
            outputStream.write(bArr2, 0, i15);
        }
        int iNextI5 = nextI(bArr, iNextI, i12);
        int iNextI6 = nextI(bArr, iNextI5 + 1, i12);
        int iNextI7 = nextI(bArr, iNextI6 + 1, i12);
        return i16 + decodeLastBlock(outputStream, (char) bArr[iNextI5], (char) bArr[iNextI6], (char) bArr[iNextI7], (char) bArr[nextI(bArr, iNextI7 + 1, i12)]);
    }

    public int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        int i13 = (i10 + i11) - 2;
        int i14 = i10;
        int i15 = i12;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            int i16 = i14 + 2;
            int i17 = bArr[i14 + 1] & 255;
            i14 += 3;
            byte b11 = bArr[i16];
            byte[] bArr3 = this.encodingTable;
            bArr2[i15] = bArr3[(b10 >>> 2) & 63];
            bArr2[i15 + 1] = bArr3[((b10 << 4) | (i17 >>> 4)) & 63];
            int i18 = i15 + 3;
            bArr2[i15 + 2] = bArr3[((i17 << 2) | ((b11 & 255) >>> 6)) & 63];
            i15 += 4;
            bArr2[i18] = bArr3[b11 & 63];
        }
        int i19 = i11 - (i14 - i10);
        if (i19 == 1) {
            int i20 = bArr[i14] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i15] = bArr4[(i20 >>> 2) & 63];
            bArr2[i15 + 1] = bArr4[(i20 << 4) & 63];
            int i21 = i15 + 3;
            byte b12 = this.padding;
            bArr2[i15 + 2] = b12;
            i15 += 4;
            bArr2[i21] = b12;
        } else if (i19 == 2) {
            int i22 = bArr[i14] & 255;
            int i23 = bArr[i14 + 1] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i15] = bArr5[(i22 >>> 2) & 63];
            bArr2[i15 + 1] = bArr5[((i22 << 4) | (i23 >>> 4)) & 63];
            int i24 = i15 + 3;
            bArr2[i15 + 2] = bArr5[(i23 << 2) & 63];
            i15 += 4;
            bArr2[i24] = this.padding;
        }
        return i15 - i12;
    }
}
