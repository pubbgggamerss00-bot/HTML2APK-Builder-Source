package r;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final s.e0<Float> f23002a;

    public y1(s.e0 e0Var) {
        this.f23002a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            return Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && kotlin.jvm.internal.r.a(this.f23002a, ((y1) obj).f23002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23002a.hashCode() + (Float.hashCode(CropImageView.DEFAULT_ASPECT_RATIO) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f23002a + ')';
    }
}
