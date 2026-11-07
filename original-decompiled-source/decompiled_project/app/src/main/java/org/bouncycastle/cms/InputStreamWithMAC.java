package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import r1.f;

/* loaded from: classes2.dex */
public final class InputStreamWithMAC extends InputStream {
    private final InputStream base;
    private boolean baseFinished = false;
    private int index = 0;
    private byte[] mac;
    private MACProvider macProvider;

    public InputStreamWithMAC(InputStream inputStream, MACProvider mACProvider) {
        this.base = inputStream;
        this.macProvider = mACProvider;
    }

    public byte[] getMAC() {
        if (this.baseFinished) {
            return Arrays.clone(this.mac);
        }
        throw new IllegalStateException("input stream not fully processed");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte b10;
        if (this.baseFinished) {
            int i10 = this.index;
            byte[] bArr = this.mac;
            if (i10 >= bArr.length) {
                return -1;
            }
            this.index = i10 + 1;
            b10 = bArr[i10];
        } else {
            int i11 = this.base.read();
            if (i11 >= 0) {
                return i11;
            }
            this.baseFinished = true;
            MACProvider mACProvider = this.macProvider;
            if (mACProvider != null) {
                mACProvider.init();
                this.mac = this.macProvider.getMAC();
            }
            byte[] bArr2 = this.mac;
            int i12 = this.index;
            this.index = i12 + 1;
            b10 = bArr2[i12];
        }
        return b10 & 255;
    }

    public InputStreamWithMAC(InputStream inputStream, byte[] bArr) {
        this.base = inputStream;
        this.mac = bArr;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("input array is null");
        }
        if (i10 < 0 || bArr.length < i10 + i11) {
            throw new IndexOutOfBoundsException(f.a(i10, i11, "invalid off(", ") and len(", ")"));
        }
        if (this.baseFinished) {
            int i12 = this.index;
            byte[] bArr2 = this.mac;
            if (i12 >= bArr2.length) {
                return -1;
            }
            if (i11 >= bArr2.length - i12) {
                System.arraycopy(bArr2, i12, bArr, i10, bArr2.length - i12);
                byte[] bArr3 = this.mac;
                int length = bArr3.length - this.index;
                this.index = bArr3.length;
                return length;
            }
            System.arraycopy(bArr2, i12, bArr, i10, i11);
        } else {
            int i13 = this.base.read(bArr, i10, i11);
            if (i13 >= 0) {
                return i13;
            }
            this.baseFinished = true;
            MACProvider mACProvider = this.macProvider;
            if (mACProvider != null) {
                mACProvider.init();
                this.mac = this.macProvider.getMAC();
            }
            byte[] bArr4 = this.mac;
            if (i11 >= bArr4.length) {
                System.arraycopy(bArr4, 0, bArr, i10, bArr4.length);
                byte[] bArr5 = this.mac;
                this.index = bArr5.length;
                return bArr5.length;
            }
            System.arraycopy(bArr4, 0, bArr, i10, i11);
        }
        this.index += i11;
        return i11;
    }
}
