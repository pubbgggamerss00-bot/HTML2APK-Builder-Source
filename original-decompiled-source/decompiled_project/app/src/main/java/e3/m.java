package e3;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f8372c = new m(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);

    /* renamed from: a, reason: collision with root package name */
    public final float f8373a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8374b;

    public m(float f10, float f11) {
        this.f8373a = f10;
        this.f8374b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8373a == mVar.f8373a && this.f8374b == mVar.f8374b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8374b) + (Float.hashCode(this.f8373a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f8373a);
        sb.append(", skewX=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f8374b, ')');
    }

    public m() {
        this(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
