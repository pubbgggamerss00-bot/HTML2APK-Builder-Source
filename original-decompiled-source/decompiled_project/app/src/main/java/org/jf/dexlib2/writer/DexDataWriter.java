package org.jf.dexlib2.writer;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class DexDataWriter extends BufferedOutputStream {
    private int filePosition;
    private byte[] tempBuf;
    private byte[] zeroBuf;

    public DexDataWriter(OutputStream outputStream, int i10) {
        this(outputStream, i10, PKIFailureInfo.transactionIdInUse);
    }

    public static void writeInt(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10);
        outputStream.write(i10 >> 8);
        outputStream.write(i10 >> 16);
        outputStream.write(i10 >> 24);
    }

    public static void writeSleb128(OutputStream outputStream, int i10) throws IOException {
        if (i10 >= 0) {
            while (i10 > 63) {
                outputStream.write((i10 & CertificateBody.profileType) | 128);
                i10 >>>= 7;
            }
            outputStream.write(i10 & CertificateBody.profileType);
            return;
        }
        while (i10 < -64) {
            outputStream.write((i10 & CertificateBody.profileType) | 128);
            i10 >>= 7;
        }
        outputStream.write(i10 & CertificateBody.profileType);
    }

    public static void writeUleb128(OutputStream outputStream, int i10) throws IOException {
        while ((i10 & BodyPartID.bodyIdMax) > 127) {
            outputStream.write((i10 & CertificateBody.profileType) | 128);
            i10 >>>= 7;
        }
        outputStream.write(i10);
    }

    public void align() throws IOException {
        int i10 = (-getPosition()) & 3;
        if (i10 > 0) {
            write(this.zeroBuf, 0, i10);
        }
    }

    public int getPosition() {
        return this.filePosition;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        this.filePosition++;
        super.write(i10);
    }

    public void writeEncodedDouble(int i10, double d10) throws IOException {
        writeRightZeroExtendedLong(i10, Double.doubleToRawLongBits(d10));
    }

    public void writeEncodedFloat(int i10, float f10) throws IOException {
        writeRightZeroExtendedInt(i10, Float.floatToRawIntBits(f10));
    }

    public void writeEncodedInt(int i10, int i11) throws IOException {
        int i12 = 0;
        if (i11 >= 0) {
            while (i11 > 127) {
                this.tempBuf[i12] = (byte) i11;
                i11 >>= 8;
                i12++;
            }
        } else {
            while (i11 < -128) {
                this.tempBuf[i12] = (byte) i11;
                i11 >>= 8;
                i12++;
            }
        }
        this.tempBuf[i12] = (byte) i11;
        writeEncodedValueHeader(i10, i12);
        write(this.tempBuf, 0, i12 + 1);
    }

    public void writeEncodedLong(int i10, long j10) throws IOException {
        int i11;
        if (j10 >= 0) {
            i11 = 0;
            while (j10 > 127) {
                this.tempBuf[i11] = (byte) j10;
                j10 >>= 8;
                i11++;
            }
        } else {
            i11 = 0;
            while (j10 < -128) {
                this.tempBuf[i11] = (byte) j10;
                j10 >>= 8;
                i11++;
            }
        }
        this.tempBuf[i11] = (byte) j10;
        writeEncodedValueHeader(i10, i11);
        write(this.tempBuf, 0, i11 + 1);
    }

    public void writeEncodedUint(int i10, int i11) throws IOException {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            this.tempBuf[i12] = (byte) i11;
            i11 >>>= 8;
            if (i11 == 0) {
                writeEncodedValueHeader(i10, i12);
                write(this.tempBuf, 0, i13);
                return;
            }
            i12 = i13;
        }
    }

    public void writeEncodedValueHeader(int i10, int i11) throws IOException {
        write(i10 | (i11 << 5));
    }

    public void writeLong(long j10) throws IOException {
        writeInt((int) j10);
        writeInt((int) (j10 >> 32));
    }

    public void writeRightZeroExtendedInt(int i10, int i11) throws IOException {
        int i12 = 3;
        while (true) {
            int i13 = i12 - 1;
            this.tempBuf[i12] = (byte) (((-16777216) & i11) >>> 24);
            i11 <<= 8;
            if (i11 == 0) {
                writeEncodedValueHeader(i10, 3 - i12);
                write(this.tempBuf, i12, 4 - i12);
                return;
            }
            i12 = i13;
        }
    }

    public void writeRightZeroExtendedLong(int i10, long j10) throws IOException {
        int i11 = 7;
        while (true) {
            int i12 = i11 - 1;
            this.tempBuf[i11] = (byte) (((-72057594037927936L) & j10) >>> 56);
            j10 <<= 8;
            if (j10 == 0) {
                writeEncodedValueHeader(i10, 7 - i11);
                write(this.tempBuf, i11, 8 - i11);
                return;
            }
            i11 = i12;
        }
    }

    public void writeShort(int i10) throws IOException {
        if (i10 < -32768 || i10 > 32767) {
            throw new ExceptionWithContext("Short value out of range: %d", Integer.valueOf(i10));
        }
        write(i10);
        write(i10 >> 8);
    }

    public void writeString(String str) throws IOException {
        int length = str.length();
        if (this.tempBuf.length <= str.length() * 3) {
            this.tempBuf = new byte[str.length() * 3];
        }
        byte[] bArr = this.tempBuf;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else if (cCharAt < 2048) {
                int i12 = i10 + 1;
                bArr[i10] = (byte) (((cCharAt >> 6) & 31) | 192);
                i10 += 2;
                bArr[i12] = (byte) ((cCharAt & '?') | 128);
            } else {
                bArr[i10] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                int i13 = i10 + 2;
                bArr[i10 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i10 += 3;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
            }
        }
        write(bArr, 0, i10);
    }

    public void writeUbyte(int i10) throws IOException {
        if (i10 < 0 || i10 > 255) {
            throw new ExceptionWithContext("Unsigned byte value out of range: %d", Integer.valueOf(i10));
        }
        write(i10);
    }

    public void writeUshort(int i10) throws IOException {
        if (i10 < 0 || i10 > 65535) {
            throw new ExceptionWithContext("Unsigned short value out of range: %d", Integer.valueOf(i10));
        }
        write(i10);
        write(i10 >> 8);
    }

    public DexDataWriter(OutputStream outputStream, int i10, int i11) {
        super(outputStream, i11);
        this.tempBuf = new byte[8];
        this.zeroBuf = new byte[3];
        this.filePosition = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void writeUleb128(int i10) throws IOException {
        writeUleb128(this, i10);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.filePosition += i11;
        super.write(bArr, i10, i11);
    }

    public void writeInt(int i10) throws IOException {
        writeInt(this, i10);
    }

    public void writeSleb128(int i10) throws IOException {
        writeSleb128(this, i10);
    }
}
