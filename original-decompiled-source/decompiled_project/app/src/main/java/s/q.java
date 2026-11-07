package s;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public float f23895a;

    /* renamed from: b, reason: collision with root package name */
    public float f23896b;

    /* renamed from: c, reason: collision with root package name */
    public float f23897c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23898d = 3;

    public q(float f10, float f11, float f12) {
        this.f23895a = f10;
        this.f23896b = f11;
        this.f23897c = f12;
    }

    @Override // s.s
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f23897c : this.f23896b : this.f23895a;
    }

    @Override // s.s
    public final int b() {
        return this.f23898d;
    }

    @Override // s.s
    public final s c() {
        return new q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // s.s
    public final void d() {
        this.f23895a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23896b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23897c = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f23895a = f10;
        } else if (i10 == 1) {
            this.f23896b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f23897c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f23895a == this.f23895a && qVar.f23896b == this.f23896b && qVar.f23897c == this.f23897c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23897c) + r.z1.a(this.f23896b, Float.hashCode(this.f23895a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f23895a + ", v2 = " + this.f23896b + ", v3 = " + this.f23897c;
    }
}
