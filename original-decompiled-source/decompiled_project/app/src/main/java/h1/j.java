package h1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f12126a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12127b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12128c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12129d;

    /* renamed from: e, reason: collision with root package name */
    public int f12130e;

    public final int a(long j10) {
        int i10 = this.f12126a + 1;
        long[] jArr = this.f12127b;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            int[] iArr = new int[i11];
            qg.m.e(0, jArr, 0, jArr2, jArr.length);
            qg.m.h(0, this.f12128c, 0, 14, iArr);
            this.f12127b = jArr2;
            this.f12128c = iArr;
        }
        int i12 = this.f12126a;
        this.f12126a = i12 + 1;
        int length2 = this.f12129d.length;
        if (this.f12130e >= length2) {
            int i13 = length2 * 2;
            int[] iArr2 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr2[i14] = i15;
                i14 = i15;
            }
            qg.m.h(0, this.f12129d, 0, 14, iArr2);
            this.f12129d = iArr2;
        }
        int i16 = this.f12130e;
        int[] iArr3 = this.f12129d;
        this.f12130e = iArr3[i16];
        long[] jArr3 = this.f12127b;
        jArr3[i12] = j10;
        this.f12128c[i12] = i16;
        iArr3[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (jArr3[i17] <= j10) {
                break;
            }
            b(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public final void b(int i10, int i11) {
        long[] jArr = this.f12127b;
        int[] iArr = this.f12128c;
        int[] iArr2 = this.f12129d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
