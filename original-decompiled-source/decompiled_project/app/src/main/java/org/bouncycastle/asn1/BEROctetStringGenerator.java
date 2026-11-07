package org.bouncycastle.asn1;

import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        public BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i10 = this._off;
            if (i10 != 0) {
                DEROctetString.encode(this._derOut, true, this._buf, 0, i10);
            }
            this._derOut.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            byte[] bArr = this._buf;
            int i11 = this._off;
            int i12 = i11 + 1;
            this._off = i12;
            bArr[i11] = (byte) i10;
            if (i12 == bArr.length) {
                DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            byte[] bArr2 = this._buf;
            int length = bArr2.length;
            int i12 = this._off;
            int i13 = length - i12;
            if (i11 < i13) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this._off += i11;
                return;
            }
            if (i12 > 0) {
                System.arraycopy(bArr, i10, bArr2, i12, i13);
                DEROctetString.encode(this._derOut, true, this._buf, 0, length);
            } else {
                i13 = 0;
            }
            while (true) {
                int i14 = i11 - i13;
                if (i14 < length) {
                    System.arraycopy(bArr, i10 + i13, this._buf, 0, i14);
                    this._off = i14;
                    return;
                } else {
                    DEROctetString.encode(this._derOut, true, bArr, i10 + i13, length);
                    i13 += length;
                }
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[DescriptorProtos.Edition.EDITION_2023_VALUE]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i10, boolean z10) throws IOException {
        super(outputStream, i10, z10);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
