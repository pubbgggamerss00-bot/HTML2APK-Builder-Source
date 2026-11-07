package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import i2.a1;
import j2.e3;
import pg.f0;

/* loaded from: classes.dex */
final class AspectRatioElement extends a1<z.e> {

    /* renamed from: b, reason: collision with root package name */
    public final float f922b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f923c;

    /* renamed from: d, reason: collision with root package name */
    public final l<e3, f0> f924d;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f10, boolean z10, l<? super e3, f0> lVar) {
        this.f922b = f10;
        this.f923c = z10;
        this.f924d = lVar;
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        a0.a.a("aspectRatio " + f10 + " must be > 0");
    }

    @Override // i2.a1
    public final d.c a() {
        z.e eVar = new z.e();
        eVar.f34491q = this.f922b;
        eVar.f34492r = this.f923c;
        return eVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        z.e eVar = (z.e) cVar;
        eVar.f34491q = this.f922b;
        eVar.f34492r = this.f923c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f922b == aspectRatioElement.f922b) {
            if (this.f923c == ((AspectRatioElement) obj).f923c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f923c) + (Float.hashCode(this.f922b) * 31);
    }
}
