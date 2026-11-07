package ve;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class a extends RandomAccessFile {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f30751a;

    /* renamed from: b, reason: collision with root package name */
    public int f30752b;

    /* renamed from: c, reason: collision with root package name */
    public int f30753c;

    /* renamed from: d, reason: collision with root package name */
    public long f30754d;

    public a(File file) throws FileNotFoundException {
        super(file, "r");
        this.f30752b = 0;
        this.f30753c = 0;
        this.f30754d = 0L;
        this.f30751a = new byte[16384];
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() throws IOException {
        return (this.f30754d - this.f30752b) + this.f30753c;
    }

    @Override // java.io.RandomAccessFile
    public final int read() throws IOException {
        int i10 = this.f30753c;
        int i11 = this.f30752b;
        byte[] bArr = this.f30751a;
        if (i10 >= i11) {
            int i12 = read(bArr);
            if (i12 >= 0) {
                this.f30754d += i12;
                this.f30752b = i12;
                this.f30753c = 0;
            }
            if (i12 < 0) {
                return -1;
            }
        }
        if (this.f30752b == 0) {
            return -1;
        }
        int i13 = this.f30753c;
        this.f30753c = i13 + 1;
        return (bArr[i13] + HPKE.mode_base) & 255;
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j10) throws IOException {
        int i10;
        int i11 = (int) (this.f30754d - j10);
        if (i11 >= 0 && i11 <= (i10 = this.f30752b)) {
            this.f30753c = i10 - i11;
            return;
        }
        super.seek(j10);
        this.f30752b = 0;
        this.f30753c = 0;
        this.f30754d = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (true) {
            int i13 = this.f30752b;
            int i14 = this.f30753c;
            int i15 = i13 - i14;
            byte[] bArr2 = this.f30751a;
            if (i11 <= i15) {
                System.arraycopy(bArr2, i14, bArr, i10, i11);
                this.f30753c += i11;
                return i12 + i11;
            }
            System.arraycopy(bArr2, i14, bArr, i10, i15);
            i12 += i15;
            this.f30753c += i15;
            int i16 = read(bArr2);
            if (i16 >= 0) {
                this.f30754d += i16;
                this.f30752b = i16;
                this.f30753c = 0;
            }
            if (i16 <= 0) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            i10 += i15;
            i11 -= i15;
        }
    }
}
