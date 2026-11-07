package rb;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23326a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23327b;

    /* renamed from: c, reason: collision with root package name */
    public int f23328c;

    /* renamed from: d, reason: collision with root package name */
    public int f23329d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23330e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23332g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23333h;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        float fAbs;
        this.f23326a = i10;
        if (f10 < f11) {
            f10 = f11;
        } else if (f10 > f12) {
            f10 = f12;
        }
        this.f23327b = f10;
        this.f23328c = i11;
        this.f23330e = f13;
        this.f23329d = i12;
        this.f23331f = f14;
        this.f23332g = i13;
        float f16 = i13;
        float f17 = (f13 * i12) + (f14 * f16);
        float f18 = i11;
        float f19 = f15 - ((f10 * f18) + f17);
        if (i11 > 0 && f19 > CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f23327b = Math.min(f19 / f18, f12 - f10) + f10;
        } else if (i11 > 0 && f19 < CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f23327b = Math.max(f19 / f18, f11 - f10) + f10;
        }
        int i14 = this.f23328c;
        float f20 = i14 > 0 ? this.f23327b : 0.0f;
        this.f23327b = f20;
        int i15 = this.f23329d;
        float f21 = i15;
        float f22 = f21 / 2.0f;
        float f23 = (f15 - ((i14 + f22) * (i14 > 0 ? f20 : 0.0f))) / (f22 + f16);
        this.f23331f = f23;
        float f24 = (f20 + f23) / 2.0f;
        this.f23330e = f24;
        if (i15 > 0 && f23 != f14) {
            float f25 = (f14 - f23) * f16;
            float fMin = Math.min(Math.abs(f25), f24 * 0.1f * f21);
            if (f25 > CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f23330e -= fMin / this.f23329d;
                this.f23331f = (fMin / f16) + this.f23331f;
            } else {
                this.f23330e = (fMin / this.f23329d) + this.f23330e;
                this.f23331f -= fMin / f16;
            }
        }
        if (i13 <= 0 || this.f23328c <= 0 || this.f23329d <= 0) {
            fAbs = (i13 <= 0 || this.f23328c <= 0 || this.f23331f > this.f23327b) ? i10 * Math.abs(f14 - this.f23331f) : Float.MAX_VALUE;
        } else {
            float f26 = this.f23331f;
            float f27 = this.f23330e;
            if (f26 <= f27 || f27 <= this.f23327b) {
            }
        }
        this.f23333h = fAbs;
    }

    public static a a(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    float f16 = aVar2.f23333h;
                    if (aVar == null || f16 < aVar.f23333h) {
                        if (f16 == CropImageView.DEFAULT_ASPECT_RATIO) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f23326a + ", smallCount=" + this.f23328c + ", smallSize=" + this.f23327b + ", mediumCount=" + this.f23329d + ", mediumSize=" + this.f23330e + ", largeCount=" + this.f23332g + ", largeSize=" + this.f23331f + ", cost=" + this.f23333h + "]";
    }
}
