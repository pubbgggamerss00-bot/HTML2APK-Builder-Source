package af;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f534a;

    /* renamed from: b, reason: collision with root package name */
    public int f535b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<byte[]> f536c = new ArrayList<>();

    public final int a(int i10, InputStream inputStream) throws IOException {
        if (i10 <= 0) {
            return 0;
        }
        long j10 = this.f534a;
        d((i10 + j10) - 1);
        int i11 = (int) (j10 >> 9);
        int i12 = (int) (j10 & 511);
        int i13 = 0;
        while (i10 > 0) {
            byte[] bArr = this.f536c.get(i11);
            int iMin = Math.min(512 - i12, i10);
            i10 -= iMin;
            i13 += iMin;
            while (iMin > 0) {
                int i14 = inputStream.read(bArr, i12, iMin);
                if (i14 < 0) {
                    this.f534a -= i10 - i13;
                    return i13;
                }
                iMin -= i14;
                i12 += i14;
            }
            i11++;
            i12 = 0;
        }
        return i13;
    }

    public final int b(long j10) {
        if (j10 >= this.f534a) {
            return -1;
        }
        return this.f536c.get((int) (j10 >> 9))[(int) (j10 & 511)] & 255;
    }

    public final int c(long j10, byte[] bArr, int i10, int i11) {
        if (i11 > bArr.length - i10 || i11 < 0 || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        long j11 = this.f534a;
        if (j10 >= j11) {
            return -1;
        }
        if (i11 + j10 > j11) {
            i11 = (int) (j11 - j10);
        }
        byte[] bArr2 = this.f536c.get((int) (j10 >> 9));
        int i12 = (int) (j10 & 511);
        int iMin = Math.min(i11, 512 - i12);
        System.arraycopy(bArr2, i12, bArr, i10, iMin);
        return iMin;
    }

    public final void d(long j10) {
        ArrayList<byte[]> arrayList = this.f536c;
        int size = (((int) (j10 >> 9)) - arrayList.size()) + 1;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new byte[512]);
        }
        this.f534a = j10 + 1;
    }
}
