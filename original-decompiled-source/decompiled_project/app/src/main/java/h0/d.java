package h0;

import com.yalantis.ucrop.view.CropImageView;
import p1.h;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f12082a;

    public d(float f10) {
        this.f12082a = f10;
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO || f10 > 100.0f) {
            y.c.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // h0.b
    public final float a(long j10, f3.d dVar) {
        return (this.f12082a / 100.0f) * h.c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f12082a, ((d) obj).f12082a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12082a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f12082a + "%)";
    }
}
