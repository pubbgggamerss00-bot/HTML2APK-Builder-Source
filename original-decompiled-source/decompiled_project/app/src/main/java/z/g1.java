package z;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class g1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34518a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34519b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34520c;

    /* renamed from: d, reason: collision with root package name */
    public final float f34521d;

    public g1(float f10, float f11, float f12, float f13) {
        this.f34518a = f10;
        this.f34519b = f11;
        this.f34520c = f12;
        this.f34521d = f13;
        if (!((f10 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO)) || !(f13 >= CropImageView.DEFAULT_ASPECT_RATIO)) {
            a0.a.a("Padding must be non-negative");
        }
    }

    @Override // z.f1
    public final float a() {
        return this.f34521d;
    }

    @Override // z.f1
    public final float b(f3.r rVar) {
        return rVar == f3.r.f8828a ? this.f34518a : this.f34520c;
    }

    @Override // z.f1
    public final float c() {
        return this.f34519b;
    }

    @Override // z.f1
    public final float d(f3.r rVar) {
        return rVar == f3.r.f8828a ? this.f34520c : this.f34518a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return f3.h.a(this.f34518a, g1Var.f34518a) && f3.h.a(this.f34519b, g1Var.f34519b) && f3.h.a(this.f34520c, g1Var.f34520c) && f3.h.a(this.f34521d, g1Var.f34521d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f34521d) + r.z1.a(this.f34520c, r.z1.a(this.f34519b, Float.hashCode(this.f34518a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) f3.h.b(this.f34518a)) + ", top=" + ((Object) f3.h.b(this.f34519b)) + ", end=" + ((Object) f3.h.b(this.f34520c)) + ", bottom=" + ((Object) f3.h.b(this.f34521d)) + ')';
    }
}
