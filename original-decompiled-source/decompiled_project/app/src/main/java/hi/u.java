package hi;

import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class u extends l {

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f13118d;

    public u(RandomAccessFile randomAccessFile) {
        this.f13118d = randomAccessFile;
    }

    @Override // hi.l
    public final synchronized void h() {
        this.f13118d.close();
    }

    @Override // hi.l
    public final synchronized int l(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.r.e(array, "array");
        this.f13118d.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f13118d.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // hi.l
    public final synchronized long p() {
        return this.f13118d.length();
    }
}
