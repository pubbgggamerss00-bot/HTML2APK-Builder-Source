package g5;

import android.view.animation.Interpolator;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f11474a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11475b;

    public d(float[] fArr) {
        this.f11474a = fArr;
        this.f11475b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        float[] fArr = this.f11474a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f11475b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return org.bouncycastle.jcajce.provider.digest.c.a(fArr[iMin + 1], f13, f12, f13);
    }
}
