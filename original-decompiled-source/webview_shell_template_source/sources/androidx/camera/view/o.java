package androidx.camera.view;

import android.animation.ValueAnimator;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements ImageCapture.ScreenFlash {

    /* renamed from: a, reason: collision with root package name */
    public float f711a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f713c;

    public o(q qVar) {
        this.f713c = qVar;
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void apply(long j6, ImageCapture.ScreenFlashListener screenFlashListener) {
        Logger.d("ScreenFlashView", "ScreenFlash#apply");
        q qVar = this.f713c;
        this.f711a = qVar.getBrightness();
        qVar.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f712b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(screenFlashListener);
        androidx.camera.core.processing.p pVar = new androidx.camera.core.processing.p(2, screenFlashListener);
        Logger.d("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(qVar.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new n(0, qVar));
        valueAnimatorOfFloat.addListener(new p(pVar));
        valueAnimatorOfFloat.start();
        this.f712b = valueAnimatorOfFloat;
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void clear() {
        Logger.d("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.f712b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f712b = null;
        }
        q qVar = this.f713c;
        qVar.setAlpha(0.0f);
        qVar.setBrightness(this.f711a);
    }
}
