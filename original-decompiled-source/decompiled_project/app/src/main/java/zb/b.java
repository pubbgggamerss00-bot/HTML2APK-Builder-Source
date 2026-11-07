package zb;

import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f34882a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34883b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f34882a;
            f10 += ((b) dVar).f34883b;
        }
        this.f34882a = dVar;
        this.f34883b = f10;
    }

    @Override // zb.d
    public final float a(RectF rectF) {
        return Math.max(CropImageView.DEFAULT_ASPECT_RATIO, this.f34882a.a(rectF) + this.f34883b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f34882a.equals(bVar.f34882a) && this.f34883b == bVar.f34883b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34882a, Float.valueOf(this.f34883b)});
    }
}
