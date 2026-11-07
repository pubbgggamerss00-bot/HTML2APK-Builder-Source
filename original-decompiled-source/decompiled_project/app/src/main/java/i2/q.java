package i2;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final float f14001a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14002b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14003c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14004d;

    public q(float f10, float f11, float f12, float f13) {
        this.f14001a = f10;
        this.f14002b = f11;
        this.f14003c = f12;
        this.f14004d = f13;
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f2.a.a("Left must be non-negative");
        }
        if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f2.a.a("Top must be non-negative");
        }
        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f2.a.a("Right must be non-negative");
        }
        if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        f2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return f3.h.a(this.f14001a, qVar.f14001a) && f3.h.a(this.f14002b, qVar.f14002b) && f3.h.a(this.f14003c, qVar.f14003c) && f3.h.a(this.f14004d, qVar.f14004d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + r.z1.a(this.f14004d, r.z1.a(this.f14003c, r.z1.a(this.f14002b, Float.hashCode(this.f14001a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) f3.h.b(this.f14001a)) + ", top=" + ((Object) f3.h.b(this.f14002b)) + ", end=" + ((Object) f3.h.b(this.f14003c)) + ", bottom=" + ((Object) f3.h.b(this.f14004d)) + ", isLayoutDirectionAware=true)";
    }
}
