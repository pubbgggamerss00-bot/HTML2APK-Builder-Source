package s;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: a, reason: collision with root package name */
    public float f23859a;

    /* renamed from: b, reason: collision with root package name */
    public float f23860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23861c = 2;

    public p(float f10, float f11) {
        this.f23859a = f10;
        this.f23860b = f11;
    }

    @Override // s.s
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f23860b : this.f23859a;
    }

    @Override // s.s
    public final int b() {
        return this.f23861c;
    }

    @Override // s.s
    public final s c() {
        return new p(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // s.s
    public final void d() {
        this.f23859a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f23860b = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f23859a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f23860b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f23859a == this.f23859a && pVar.f23860b == this.f23860b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23860b) + (Float.hashCode(this.f23859a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f23859a + ", v2 = " + this.f23860b;
    }
}
