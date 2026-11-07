package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            while (i10 < length && ignore(str.charAt(i10))) {
                i10++;
            }
            int i13 = i10 + 1;
            byte b10 = this.decodingTable[str.charAt(i10)];
            while (i13 < length && ignore(str.charAt(i13))) {
                i13++;
            }
            int i14 = i13 + 1;
            byte b11 = this.decodingTable[str.charAt(i13)];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i15 = i11 + 1;
            bArr[i11] = (byte) ((b10 << 4) | b11);
            if (i15 == 36) {
                outputStream.write(bArr);
                i11 = 0;
            } else {
                i11 = i15;
            }
            i12++;
            i10 = i14;
        }
        if (i11 > 0) {
            outputStream.write(bArr, 0, i11);
        }
        return i12;
    }

    public byte[] decodeStrict(String str, int i10, int i11) throws IOException {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i10 < 0 || i11 < 0 || i10 > str.length() - i11) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i11 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i12 = i11 >>> 1;
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + 1;
            byte b10 = this.decodingTable[str.charAt(i10)];
            i10 += 2;
            int i15 = (b10 << 4) | this.decodingTable[str.charAt(i14)];
            if (i15 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i13] = (byte) i15;
        }
        return bArr;
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
            int iMin = Math.min(36, i13);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i12, iMin, bArr2, 0));
            i12 += iMin;
            i13 -= iMin;
            bArr = bArr3;
        }
        return i11 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i10) {
        return i10 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i10) {
        return i10 / 2;
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
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[36];
        int i12 = i11 + i10;
        while (i12 > i10 && ignore((char) bArr[i12 - 1])) {
            i12--;
        }
        int i13 = 0;
        int i14 = 0;
        while (i10 < i12) {
            while (i10 < i12 && ignore((char) bArr[i10])) {
                i10++;
            }
            int i15 = i10 + 1;
            byte b10 = this.decodingTable[bArr[i10]];
            while (i15 < i12 && ignore((char) bArr[i15])) {
                i15++;
            }
            int i16 = i15 + 1;
            byte b11 = this.decodingTable[bArr[i15]];
            if ((b10 | b11) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            int i17 = i13 + 1;
            bArr2[i13] = (byte) ((b10 << 4) | b11);
            if (i17 == 36) {
                outputStream.write(bArr2);
                i13 = 0;
            } else {
                i13 = i17;
            }
            i14++;
            i10 = i16;
        }
        if (i13 > 0) {
            outputStream.write(bArr2, 0, i13);
        }
        return i14;
    }

    public int encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        int i13 = i11 + i10;
        int i14 = i12;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            int i16 = i14 + 1;
            byte[] bArr3 = this.encodingTable;
            bArr2[i14] = bArr3[(b10 & 255) >>> 4];
            i14 += 2;
            bArr2[i16] = bArr3[b10 & RegisterType.DOUBLE_HI];
            i10 = i15;
        }
        return i14 - i12;
    }
}
