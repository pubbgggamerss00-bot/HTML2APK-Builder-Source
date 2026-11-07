package q1;

import android.graphics.RenderEffect;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class t0 extends z1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f21737b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21739d;

    public t0(float f10, float f11, int i10) {
        this.f21737b = f10;
        this.f21738c = f11;
        this.f21739d = i10;
    }

    @Override // q1.z1
    public final RenderEffect b() {
        float f10 = this.f21737b;
        float f11 = this.f21738c;
        return (f10 == CropImageView.DEFAULT_ASPECT_RATIO && f11 == CropImageView.DEFAULT_ASPECT_RATIO) ? RenderEffect.createOffsetEffect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) : RenderEffect.createBlurEffect(f10, f11, n0.a(this.f21739d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f21737b == t0Var.f21737b && this.f21738c == t0Var.f21738c && this.f21739d == t0Var.f21739d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21739d) + r.z1.a(this.f21738c, Float.hashCode(this.f21737b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f21737b + ", radiusY=" + this.f21738c + ", edgeTreatment=" + ((Object) j2.a(this.f21739d)) + ')';
    }
}
