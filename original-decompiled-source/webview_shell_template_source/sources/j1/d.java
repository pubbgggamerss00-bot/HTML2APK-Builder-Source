package j1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f13446a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13447b;

    public d(float[] fArr) {
        this.f13446a = fArr;
        this.f13447b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f13446a;
        int iMin = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f13447b;
        float f8 = (f6 - (iMin * f7)) / f7;
        float f9 = fArr[iMin];
        return ((fArr[iMin + 1] - f9) * f8) + f9;
    }
}
