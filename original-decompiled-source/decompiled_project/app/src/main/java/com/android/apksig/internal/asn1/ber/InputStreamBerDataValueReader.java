package com.android.apksig.internal.asn1.ber;

import ad.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public class InputStreamBerDataValueReader implements BerDataValueReader {
    private final InputStream mIn;

    public static class RecordingInputStream extends InputStream {
        private final ByteArrayOutputStream mBuf;
        private final InputStream mIn;

        @Override // java.io.InputStream
        public int available() throws IOException {
            return super.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
        }

        public int getReadByteCount() {
            return this.mBuf.size();
        }

        public byte[] getReadBytes() {
            return this.mBuf.toByteArray();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i10 = this.mIn.read();
            if (i10 != -1) {
                this.mBuf.write(i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            throw new IOException("mark/reset not supported");
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            if (j10 <= 0) {
                return this.mIn.skip(j10);
            }
            byte[] bArr = new byte[4096];
            int i10 = this.mIn.read(bArr, 0, (int) Math.min(4096, j10));
            if (i10 > 0) {
                this.mBuf.write(bArr, 0, i10);
            }
            if (i10 < 0) {
                return 0L;
            }
            return i10;
        }

        private RecordingInputStream(InputStream inputStream) {
            this.mIn = inputStream;
            this.mBuf = new ByteArrayOutputStream();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int i10 = this.mIn.read(bArr);
            if (i10 > 0) {
                this.mBuf.write(bArr, 0, i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.mIn.read(bArr, i10, i11);
            if (i12 > 0) {
                this.mBuf.write(bArr, i10, i12);
            }
            return i12;
        }
    }

    public InputStreamBerDataValueReader(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        this.mIn = inputStream;
    }

    private static int readHighTagNumber(InputStream inputStream) throws IOException, BerDataValueFormatException {
        int i10;
        int i11 = 0;
        do {
            i10 = inputStream.read();
            if (i10 == -1) {
                throw new BerDataValueFormatException("Truncated tag number");
            }
            if (i11 > 16777215) {
                throw new BerDataValueFormatException("Tag number too large");
            }
            i11 = (i11 << 7) | (i10 & CertificateBody.profileType);
        } while ((i10 & 128) != 0);
        return i11;
    }

    private static int readLongFormLength(InputStream inputStream, int i10) throws IOException, BerDataValueFormatException {
        int i11 = i10 & CertificateBody.profileType;
        if (i11 > 4) {
            throw new BerDataValueFormatException(b.b(i11, "Length too large: ", " bytes"));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new BerDataValueFormatException("Truncated length");
            }
            if (i12 > 8388607) {
                throw new BerDataValueFormatException("Length too large");
            }
            i12 = (i12 << 8) | (i14 & 255);
        }
        return i12;
    }

    private static int readShortFormLength(int i10) {
        return i10 & CertificateBody.profileType;
    }

    private static int readTagNumber(InputStream inputStream, int i10) throws IOException, BerDataValueFormatException {
        int tagNumber = BerEncoding.getTagNumber((byte) i10);
        return tagNumber == 31 ? readHighTagNumber(inputStream) : tagNumber;
    }

    private static int skipConstructedIndefiniteLengthContents(RecordingInputStream recordingInputStream) throws BerDataValueFormatException {
        int readByteCount = recordingInputStream.getReadByteCount();
        while (true) {
            BerDataValue dataValue = readDataValue(recordingInputStream);
            if (dataValue == null) {
                throw new BerDataValueFormatException("Truncated indefinite-length contents: " + (recordingInputStream.getReadByteCount() - readByteCount) + " bytes read");
            }
            if (recordingInputStream.getReadByteCount() <= 0) {
                throw new BerDataValueFormatException("Indefinite-length contents too long");
            }
            ByteBuffer encoded = dataValue.getEncoded();
            if (encoded.remaining() == 2 && encoded.get(0) == 0 && encoded.get(1) == 0) {
                return (recordingInputStream.getReadByteCount() - readByteCount) - 2;
            }
        }
    }

    private static void skipDefiniteLengthContents(InputStream inputStream, int i10) throws IOException, BerDataValueFormatException {
        long j10 = 0;
        while (i10 > 0) {
            int iSkip = (int) inputStream.skip(i10);
            if (iSkip <= 0) {
                throw new BerDataValueFormatException("Truncated definite-length contents: " + j10 + " bytes read, " + i10 + " missing");
            }
            i10 -= iSkip;
            j10 += iSkip;
        }
    }

    private static int skipPrimitiveIndefiniteLengthContents(InputStream inputStream) throws IOException, BerDataValueFormatException {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw new BerDataValueFormatException(b.b(i10, "Truncated indefinite-length contents: ", " bytes read"));
            }
            int i12 = i10 + 1;
            if (i12 < 0) {
                throw new BerDataValueFormatException("Indefinite-length contents too long");
            }
            if (i11 != 0) {
                z10 = false;
            } else {
                if (z10) {
                    return i10 - 1;
                }
                z10 = true;
            }
            i10 = i12;
        }
    }

    @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
    public BerDataValue readDataValue() throws BerDataValueFormatException {
        return readDataValue(this.mIn);
    }

    private static BerDataValue readDataValue(InputStream inputStream) throws BerDataValueFormatException {
        int readByteCount;
        int iSkipConstructedIndefiniteLengthContents;
        RecordingInputStream recordingInputStream = new RecordingInputStream(inputStream);
        try {
            int i10 = recordingInputStream.read();
            if (i10 == -1) {
                return null;
            }
            int tagNumber = readTagNumber(recordingInputStream, i10);
            int i11 = recordingInputStream.read();
            if (i11 == -1) {
                throw new BerDataValueFormatException("Missing length");
            }
            byte b10 = (byte) i10;
            boolean zIsConstructed = BerEncoding.isConstructed(b10);
            if ((i11 & 128) == 0) {
                iSkipConstructedIndefiniteLengthContents = readShortFormLength(i11);
                readByteCount = recordingInputStream.getReadByteCount();
                skipDefiniteLengthContents(recordingInputStream, iSkipConstructedIndefiniteLengthContents);
            } else if ((i11 & 255) != 128) {
                iSkipConstructedIndefiniteLengthContents = readLongFormLength(recordingInputStream, i11);
                readByteCount = recordingInputStream.getReadByteCount();
                skipDefiniteLengthContents(recordingInputStream, iSkipConstructedIndefiniteLengthContents);
            } else {
                readByteCount = recordingInputStream.getReadByteCount();
                iSkipConstructedIndefiniteLengthContents = zIsConstructed ? skipConstructedIndefiniteLengthContents(recordingInputStream) : skipPrimitiveIndefiniteLengthContents(recordingInputStream);
            }
            byte[] readBytes = recordingInputStream.getReadBytes();
            return new BerDataValue(ByteBuffer.wrap(readBytes), ByteBuffer.wrap(readBytes, readByteCount, iSkipConstructedIndefiniteLengthContents), BerEncoding.getTagClass(b10), zIsConstructed, tagNumber);
        } catch (IOException e10) {
            throw new BerDataValueFormatException("Failed to read data value", e10);
        }
    }
}
