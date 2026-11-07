package d4;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12722a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12723b;

    /* renamed from: c, reason: collision with root package name */
    public int f12724c;

    /* renamed from: d, reason: collision with root package name */
    public int f12725d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12726e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12727f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12728g;
    public final float h;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i6, float f6, float f7, float f8, int i7, float f9, int i8, float f10, int i9, float f11) {
        float fAbs;
        this.f12722a = i6;
        float fA = e5.i.a(f6, f7, f8);
        this.f12723b = fA;
        this.f12724c = i7;
        this.f12726e = f9;
        this.f12725d = i8;
        this.f12727f = f10;
        this.f12728g = i9;
        float f12 = i9;
        float f13 = (f9 * i8) + (f10 * f12);
        float f14 = i7;
        float f15 = f11 - ((fA * f14) + f13);
        if (i7 > 0 && f15 > 0.0f) {
            this.f12723b = Math.min(f15 / f14, f8 - fA) + fA;
        } else if (i7 > 0 && f15 < 0.0f) {
            this.f12723b = Math.max(f15 / f14, f7 - fA) + fA;
        }
        int i10 = this.f12724c;
        float f16 = i10 > 0 ? this.f12723b : 0.0f;
        this.f12723b = f16;
        int i11 = this.f12725d;
        float f17 = i11;
        float f18 = f17 / 2.0f;
        float f19 = (f11 - ((i10 + f18) * (i10 > 0 ? f16 : 0.0f))) / (f18 + f12);
        this.f12727f = f19;
        float f20 = (f16 + f19) / 2.0f;
        this.f12726e = f20;
        if (i11 > 0 && f19 != f10) {
            float f21 = (f10 - f19) * f12;
            float fMin = Math.min(Math.abs(f21), f20 * 0.1f * f17);
            if (f21 > 0.0f) {
                this.f12726e -= fMin / this.f12725d;
                this.f12727f = (fMin / f12) + this.f12727f;
            } else {
                this.f12726e = (fMin / this.f12725d) + this.f12726e;
                this.f12727f -= fMin / f12;
            }
        }
        if (i9 <= 0 || this.f12724c <= 0 || this.f12725d <= 0) {
            fAbs = (i9 <= 0 || this.f12724c <= 0 || this.f12727f > this.f12723b) ? i6 * Math.abs(f10 - this.f12727f) : Float.MAX_VALUE;
        } else {
            float f22 = this.f12727f;
            float f23 = this.f12726e;
            if (f22 <= f23 || f23 <= this.f12723b) {
            }
        }
        this.h = fAbs;
    }

    public static a a(float f6, float f7, float f8, float f9, int[] iArr, float f10, int[] iArr2, float f11, int[] iArr3) {
        a aVar = null;
        int i6 = 1;
        for (int i7 : iArr3) {
            int length = iArr2.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = iArr2[i8];
                int length2 = iArr.length;
                int i10 = 0;
                while (i10 < length2) {
                    int i11 = length;
                    int i12 = i8;
                    int i13 = i6;
                    int i14 = length2;
                    int i15 = i10;
                    a aVar2 = new a(i13, f7, f8, f9, iArr[i10], f10, i9, f11, i7, f6);
                    float f12 = aVar2.h;
                    if (aVar == null || f12 < aVar.h) {
                        if (f12 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i16 = i13 + 1;
                    i10 = i15 + 1;
                    i8 = i12;
                    i6 = i16;
                    length = i11;
                    length2 = i14;
                }
                i8++;
                i6 = i6;
                length = length;
            }
        }
        return aVar;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f12722a + ", smallCount=" + this.f12724c + ", smallSize=" + this.f12723b + ", mediumCount=" + this.f12725d + ", mediumSize=" + this.f12726e + ", largeCount=" + this.f12728g + ", largeSize=" + this.f12727f + ", cost=" + this.h + "]";
    }
}
