package b4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import u4.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1992a;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f1992a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f1992a.f12074j;
        if (gVar != null) {
            g.c cVar = gVar.f14610t;
            if (cVar.f14626i != fFloatValue) {
                cVar.f14626i = fFloatValue;
                gVar.f14614x = true;
                gVar.f14615y = true;
                gVar.invalidateSelf();
            }
        }
    }
}
