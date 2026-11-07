package qb;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import zb.h;

/* loaded from: classes2.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f22594a;

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f22594a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h hVar = this.f22594a.f6336g;
        if (hVar != null) {
            h.c cVar = hVar.f34886b;
            if (cVar.f34920h != fFloatValue) {
                cVar.f34920h = fFloatValue;
                hVar.f34890f = true;
                hVar.f34891g = true;
                hVar.invalidateSelf();
            }
        }
    }
}
