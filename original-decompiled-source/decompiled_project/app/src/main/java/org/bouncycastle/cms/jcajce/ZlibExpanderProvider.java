package org.bouncycastle.cms.jcajce;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.InputExpander;
import org.bouncycastle.operator.InputExpanderProvider;
import org.bouncycastle.util.io.StreamOverflowException;

/* loaded from: classes2.dex */
public class ZlibExpanderProvider implements InputExpanderProvider {
    private final long limit;

    public static class LimitedInputStream extends FilterInputStream {
        private long remaining;

        public LimitedInputStream(InputStream inputStream, long j10) {
            super(inputStream);
            this.remaining = j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if (r4 >= 0) goto L8;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int read() throws IOException {
            if (this.remaining >= 0) {
                int i10 = ((FilterInputStream) this).in.read();
                if (i10 >= 0) {
                    long j10 = this.remaining - 1;
                    this.remaining = j10;
                }
                return i10;
            }
            throw new StreamOverflowException("expanded byte limit exceeded");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 < 1) {
                return super.read(bArr, i10, i11);
            }
            long j10 = this.remaining;
            if (j10 < 1) {
                read();
                return -1;
            }
            if (j10 <= i11) {
                i11 = (int) j10;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 > 0) {
                this.remaining -= i12;
            }
            return i12;
        }
    }

    public ZlibExpanderProvider() {
        this.limit = -1L;
    }

    @Override // org.bouncycastle.operator.InputExpanderProvider
    public InputExpander get(final AlgorithmIdentifier algorithmIdentifier) {
        return new InputExpander() { // from class: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.1
            @Override // org.bouncycastle.operator.InputExpander
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }

            @Override // org.bouncycastle.operator.InputExpander
            public InputStream getInputStream(InputStream inputStream) {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
                return ZlibExpanderProvider.this.limit >= 0 ? new LimitedInputStream(inflaterInputStream, ZlibExpanderProvider.this.limit) : inflaterInputStream;
            }
        };
    }

    public ZlibExpanderProvider(long j10) {
        this.limit = j10;
    }
}
