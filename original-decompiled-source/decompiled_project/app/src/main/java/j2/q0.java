package j2;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14863a = a.f14864a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<y2.x, y2.x> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14864a = new a(1);

        @Override // eh.l
        public final y2.x invoke(y2.x xVar) {
            return xVar;
        }
    }

    public static final float a(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final void b(float[] fArr, float[] fArr2) {
        float fA = a(fArr2, 0, fArr, 0);
        float fA2 = a(fArr2, 0, fArr, 1);
        float fA3 = a(fArr2, 0, fArr, 2);
        float fA4 = a(fArr2, 0, fArr, 3);
        float fA5 = a(fArr2, 1, fArr, 0);
        float fA6 = a(fArr2, 1, fArr, 1);
        float fA7 = a(fArr2, 1, fArr, 2);
        float fA8 = a(fArr2, 1, fArr, 3);
        float fA9 = a(fArr2, 2, fArr, 0);
        float fA10 = a(fArr2, 2, fArr, 1);
        float fA11 = a(fArr2, 2, fArr, 2);
        float fA12 = a(fArr2, 2, fArr, 3);
        float fA13 = a(fArr2, 3, fArr, 0);
        float fA14 = a(fArr2, 3, fArr, 1);
        float fA15 = a(fArr2, 3, fArr, 2);
        float fA16 = a(fArr2, 3, fArr, 3);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }
}
