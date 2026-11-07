package p1;

import b8.n;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f21125a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: b, reason: collision with root package name */
    public float f21126b = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: c, reason: collision with root package name */
    public float f21127c = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: d, reason: collision with root package name */
    public float f21128d = CropImageView.DEFAULT_ASPECT_RATIO;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f21125a = Math.max(f10, this.f21125a);
        this.f21126b = Math.max(f11, this.f21126b);
        this.f21127c = Math.min(f12, this.f21127c);
        this.f21128d = Math.min(f13, this.f21128d);
    }

    public final boolean b() {
        return (this.f21125a >= this.f21127c) | (this.f21126b >= this.f21128d);
    }

    public final String toString() {
        return "MutableRect(" + n.e(this.f21125a) + ", " + n.e(this.f21126b) + ", " + n.e(this.f21127c) + ", " + n.e(this.f21128d) + ')';
    }
}
