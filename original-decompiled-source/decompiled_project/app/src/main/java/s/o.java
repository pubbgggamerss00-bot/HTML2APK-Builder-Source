package s;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    public float f23852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23853b = 1;

    public o(float f10) {
        this.f23852a = f10;
    }

    @Override // s.s
    public final float a(int i10) {
        return i10 == 0 ? this.f23852a : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.s
    public final int b() {
        return this.f23853b;
    }

    @Override // s.s
    public final s c() {
        return new o(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // s.s
    public final void d() {
        this.f23852a = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // s.s
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f23852a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).f23852a == this.f23852a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23852a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f23852a;
    }
}
