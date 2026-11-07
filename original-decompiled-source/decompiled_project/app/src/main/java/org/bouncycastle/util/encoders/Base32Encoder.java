package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) throws IOException {
        char c18 = this.padding;
        if (c17 != c18) {
            byte[] bArr = this.decodingTable;
            byte b10 = bArr[c10];
            byte b11 = bArr[c11];
            byte b12 = bArr[c12];
            byte b13 = bArr[c13];
            byte b14 = bArr[c14];
            byte b15 = bArr[c15];
            byte b16 = bArr[c16];
            byte b17 = bArr[c17];
            if ((b10 | b11 | b12 | b13 | b14 | b15 | b16 | b17) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b10 << 3) | (b11 >> 2));
            outputStream.write((b11 << 6) | (b12 << 1) | (b13 >> 4));
            outputStream.write((b13 << 4) | (b14 >> 1));
            outputStream.write((b14 << 7) | (b15 << 2) | (b16 >> 3));
            outputStream.write((b16 << 5) | b17);
            return 5;
        }
        if (c16 != c18) {
            byte[] bArr2 = this.decodingTable;
            byte b18 = bArr2[c10];
            byte b19 = bArr2[c11];
            byte b20 = bArr2[c12];
            byte b21 = bArr2[c13];
            byte b22 = bArr2[c14];
            byte b23 = bArr2[c15];
            byte b24 = bArr2[c16];
            if ((b18 | b19 | b20 | b21 | b22 | b23 | b24) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b18 << 3) | (b19 >> 2));
            outputStream.write((b19 << 6) | (b20 << 1) | (b21 >> 4));
            outputStream.write((b21 << 4) | (b22 >> 1));
            outputStream.write((b22 << 7) | (b23 << 2) | (b24 >> 3));
            return 4;
        }
        if (c15 != c18) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        if (c14 != c18) {
            byte[] bArr3 = this.decodingTable;
            byte b25 = bArr3[c10];
            byte b26 = bArr3[c11];
            byte b27 = bArr3[c12];
            byte b28 = bArr3[c13];
            byte b29 = bArr3[c14];
            if ((b25 | b26 | b27 | b28 | b29) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b25 << 3) | (b26 >> 2));
            outputStream.write((b26 << 6) | (b27 << 1) | (b28 >> 4));
            outputStream.write((b28 << 4) | (b29 >> 1));
            return 3;
        }
        if (c13 == c18) {
            if (c12 != c18) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            byte[] bArr4 = this.decodingTable;
            byte b30 = bArr4[c10];
            byte b31 = bArr4[c11];
            if ((b30 | b31) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b30 << 3) | (b31 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b32 = bArr5[c10];
        byte b33 = bArr5[c11];
        byte b34 = bArr5[c12];
        byte b35 = bArr5[c13];
        if ((b32 | b33 | b34 | b35) < 0) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        outputStream.write((b32 << 3) | (b33 >> 2));
        outputStream.write((b33 << 6) | (b34 << 1) | (b35 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte b10 = bArr[i10];
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        int i14 = bArr[i10 + 3] & 255;
        byte b11 = bArr[i10 + 4];
        byte[] bArr3 = this.encodingTable;
        bArr2[i11] = bArr3[(b10 >>> 3) & 31];
        bArr2[i11 + 1] = bArr3[((b10 << 2) | (i12 >>> 6)) & 31];
        bArr2[i11 + 2] = bArr3[(i12 >>> 1) & 31];
        bArr2[i11 + 3] = bArr3[((i12 << 4) | (i13 >>> 4)) & 31];
        bArr2[i11 + 4] = bArr3[((i13 << 1) | (i14 >>> 7)) & 31];
        bArr2[i11 + 5] = bArr3[(i14 >>> 2) & 31];
        bArr2[i11 + 6] = bArr3[(((b11 & 255) >>> 5) | (i14 << 3)) & 31];
        bArr2[i11 + 7] = bArr3[b11 & 31];
    }

    private boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    private int nextI(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && ignore((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
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
            int iMin = Math.min(45, i13);
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
        return ((i10 + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i10) {
        return (i10 / 8) * 5;
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

    public Base32Encoder(byte[] bArr, byte b10) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException("encoding table needs to be length 32");
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b10;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i12 = i10 + i11;
        while (i12 > i10 && ignore((char) bArr[i12 - 1])) {
            i12--;
        }
        if (i12 == 0) {
            return 0;
        }
        int i13 = i12;
        int i14 = 0;
        while (i13 > i10 && i14 != 8) {
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
            int iNextI5 = nextI(bArr, i20, i13);
            int i21 = iNextI5 + 1;
            byte b14 = this.decodingTable[bArr[iNextI5]];
            int iNextI6 = nextI(bArr, i21, i13);
            int i22 = iNextI6 + 1;
            byte b15 = this.decodingTable[bArr[iNextI6]];
            int iNextI7 = nextI(bArr, i22, i13);
            int i23 = iNextI7 + 1;
            byte b16 = this.decodingTable[bArr[iNextI7]];
            int iNextI8 = nextI(bArr, i23, i13);
            int i24 = iNextI8 + 1;
            byte b17 = this.decodingTable[bArr[iNextI8]];
            if ((b10 | b11 | b12 | b13 | b14 | b15 | b16 | b17) < 0) {
                throw new IOException("invalid characters encountered in base32 data");
            }
            bArr2[i15] = (byte) ((b10 << 3) | (b11 >> 2));
            bArr2[i15 + 1] = (byte) ((b11 << 6) | (b12 << 1) | (b13 >> 4));
            bArr2[i15 + 2] = (byte) ((b13 << 4) | (b14 >> 1));
            int i25 = i15 + 4;
            bArr2[i15 + 3] = (byte) ((b15 << 2) | (b14 << 7) | (b16 >> 3));
            i15 += 5;
            bArr2[i25] = (byte) ((b16 << 5) | b17);
            if (i15 == 55) {
                outputStream.write(bArr2);
                i15 = 0;
            }
            i16 += 5;
            iNextI = nextI(bArr, i24, i13);
        }
        if (i15 > 0) {
            outputStream.write(bArr2, 0, i15);
        }
        int iNextI9 = nextI(bArr, iNextI, i12);
        int iNextI10 = nextI(bArr, iNextI9 + 1, i12);
        int iNextI11 = nextI(bArr, iNextI10 + 1, i12);
        int iNextI12 = nextI(bArr, iNextI11 + 1, i12);
        int iNextI13 = nextI(bArr, iNextI12 + 1, i12);
        int iNextI14 = nextI(bArr, iNextI13 + 1, i12);
        int iNextI15 = nextI(bArr, iNextI14 + 1, i12);
        return i16 + decodeLastBlock(outputStream, (char) bArr[iNextI9], (char) bArr[iNextI10], (char) bArr[iNextI11], (char) bArr[iNextI12], (char) bArr[iNextI13], (char) bArr[iNextI14], (char) bArr[iNextI15], (char) bArr[nextI(bArr, iNextI15 + 1, i12)]);
    }

    public int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        int i13 = (i10 + i11) - 4;
        int i14 = i10;
        int i15 = i12;
        while (i14 < i13) {
            encodeBlock(bArr, i14, bArr2, i15);
            i14 += 5;
            i15 += 8;
        }
        int i16 = i11 - (i14 - i10);
        if (i16 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i14, bArr3, 0, i16);
            encodeBlock(bArr3, 0, bArr2, i15);
            if (i16 == 1) {
                byte b10 = this.padding;
                bArr2[i15 + 2] = b10;
                bArr2[i15 + 3] = b10;
                bArr2[i15 + 4] = b10;
                bArr2[i15 + 5] = b10;
                bArr2[i15 + 6] = b10;
                bArr2[i15 + 7] = b10;
            } else if (i16 == 2) {
                byte b11 = this.padding;
                bArr2[i15 + 4] = b11;
                bArr2[i15 + 5] = b11;
                bArr2[i15 + 6] = b11;
                bArr2[i15 + 7] = b11;
            } else if (i16 == 3) {
                byte b12 = this.padding;
                bArr2[i15 + 5] = b12;
                bArr2[i15 + 6] = b12;
                bArr2[i15 + 7] = b12;
            } else if (i16 == 4) {
                bArr2[i15 + 7] = this.padding;
            }
            i15 += 8;
        }
        return i15 - i12;
    }
}
