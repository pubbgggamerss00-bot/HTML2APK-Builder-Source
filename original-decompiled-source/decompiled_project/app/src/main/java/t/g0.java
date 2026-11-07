package t;

import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class g0 {
    public static float a(EdgeEffect edgeEffect, float f10, float f11, f3.d dVar) {
        float f12 = h0.f25247a;
        double density = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d10 = h0.f25247a * density;
        float fExp = (float) (Math.exp((h0.f25248b / h0.f25249c) * Math.log((Math.abs(f10) * 0.35f) / d10)) * d10);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? j.b(edgeEffect) : 0.0f) * f11) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int iB = gh.a.b(f10);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iB);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f10;
    }
}
