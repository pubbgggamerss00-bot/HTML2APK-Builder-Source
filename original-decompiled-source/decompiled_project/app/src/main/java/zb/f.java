package zb;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public final class f extends e {
    @Override // zb.e
    public final void a(p pVar, float f10, float f11) {
        float f12 = f11 * f10;
        pVar.d(f12, 180.0f, 90.0f);
        double d10 = f12;
        pVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10), (float) (Math.sin(Math.toRadians(CropImageView.DEFAULT_ASPECT_RATIO)) * d10));
    }
}
