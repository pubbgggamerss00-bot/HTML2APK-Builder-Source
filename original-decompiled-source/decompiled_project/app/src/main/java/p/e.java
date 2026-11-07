package p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f20603a;

    static {
        long[] jArr;
        long[] jArr2 = w0.f20748a;
        int iE = w0.e(0);
        int iMax = iE > 0 ? Math.max(7, w0.d(iE)) : 0;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        float[] fArr = new float[iMax];
        f20603a = new float[0];
    }
}
