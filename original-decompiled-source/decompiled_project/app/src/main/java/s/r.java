package s;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public float f23901a;

    /* renamed from: b, reason: collision with root package name */
    public float f23902b;

    /* renamed from: c, reason: collision with root package name */
    public float f23903c;

    /* renamed from: d, reason: collision with root package name */
    public float f23904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23905e = 4;

    public r(float f10, float f11, float f12, float f13) {
        this.f23901a = f10;
        this.f23902b = f11;
        this.f23903c = f12;
        this.f23904d = f13;
    }

    @Override // s.s
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f23904d : this.f23903c : this.f23902b : this.f23901a;
    }

    @Override // s.s
    public final int b() {
        return this.f23905e;
    }

    @Override // s.s
    public final s c() {
        return new r(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // s.s
    public final void d() {
        this.f23901a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23902b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23903c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23904d = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f23901a = f10;
            return;
        }
        if (i10 == 1) {
            this.f23902b = f10;
        } else if (i10 == 2) {
            this.f23903c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f23904d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f23901a == this.f23901a && rVar.f23902b == this.f23902b && rVar.f23903c == this.f23903c && rVar.f23904d == this.f23904d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23904d) + r.z1.a(this.f23903c, r.z1.a(this.f23902b, Float.hashCode(this.f23901a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f23901a + ", v2 = " + this.f23902b + ", v3 = " + this.f23903c + ", v4 = " + this.f23904d;
    }
}
