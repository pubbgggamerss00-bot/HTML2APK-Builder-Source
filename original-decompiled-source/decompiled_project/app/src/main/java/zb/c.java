package zb;

import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f34884a;

    public c(float f10) {
        this.f34884a = f10;
    }

    @Override // zb.d
    public final float a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f10 = this.f34884a;
        return f10 < CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO : f10 > fMin ? fMin : f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f34884a == ((c) obj).f34884a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f34884a)});
    }
}
