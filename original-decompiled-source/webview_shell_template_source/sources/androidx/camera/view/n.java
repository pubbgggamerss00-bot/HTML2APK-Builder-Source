package androidx.camera.view;

import android.animation.ValueAnimator;
import androidx.camera.core.Logger;
import w2.l0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f710b;

    public /* synthetic */ n(int i6, Object obj) {
        this.f709a = i6;
        this.f710b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f709a) {
            case 0:
                q qVar = (q) this.f710b;
                qVar.getClass();
                Logger.d("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                l0.b bVar = (l0.b) this.f710b;
                kotlin.jvm.internal.j.e("it", valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.Float", animatedValue);
                bVar.f14933u = ((Float) animatedValue).floatValue();
                bVar.invalidate();
                break;
            default:
                y4.c cVar = (y4.c) this.f710b;
                cVar.getClass();
                cVar.f15273d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
