package q2;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f21766d = new h(CropImageView.DEFAULT_ASPECT_RATIO, 0, new jh.d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));

    /* renamed from: a, reason: collision with root package name */
    public final float f21767a;

    /* renamed from: b, reason: collision with root package name */
    public final jh.d f21768b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21769c;

    public h(float f10, int i10, jh.d dVar) {
        this.f21767a = f10;
        this.f21768b = dVar;
        this.f21769c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f21767a == hVar.f21767a && kotlin.jvm.internal.r.a(this.f21768b, hVar.f21768b) && this.f21769c == hVar.f21769c;
    }

    public final int hashCode() {
        return ((this.f21768b.hashCode() + (Float.hashCode(this.f21767a) * 31)) * 31) + this.f21769c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f21767a);
        sb.append(", range=");
        sb.append(this.f21768b);
        sb.append(", steps=");
        return b.b.a(sb, this.f21769c, ')');
    }
}
