package wf;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f31529a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f31530b;

    static {
        long[] jArr = new long[19];
        f31529a = jArr;
        jArr[0] = 1;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            long[] jArr2 = f31529a;
            if (i11 >= jArr2.length) {
                break;
            }
            jArr2[i11] = jArr2[i11 - 1] * 10;
            i11++;
        }
        int[] iArr = new int[10];
        f31530b = iArr;
        iArr[0] = 1;
        while (true) {
            int[] iArr2 = f31530b;
            if (i10 >= iArr2.length) {
                return;
            }
            iArr2[i10] = iArr2[i10 - 1] * 10;
            i10++;
        }
    }

    public static int a(long j10, int i10, boolean z10, byte[] bArr, int i11) {
        while (j10 > 2147483647L && (!z10 || j10 > 0)) {
            long j11 = f31529a[i10];
            j10 -= j11 * (j10 / j11);
            bArr[i11] = (byte) (r2 + 48);
            i10--;
            i11++;
        }
        int i12 = (int) j10;
        while (i10 >= 0 && (!z10 || i12 > 0)) {
            int i13 = f31530b[i10];
            int i14 = i12 / i13;
            i12 -= i13 * i14;
            bArr[i11] = (byte) (i14 + 48);
            i10--;
            i11++;
        }
        return i11;
    }
}
