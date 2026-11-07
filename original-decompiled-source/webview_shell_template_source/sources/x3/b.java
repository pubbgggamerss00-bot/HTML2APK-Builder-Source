package x3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g<String, c> f15149a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    public final g<String, PropertyValuesHolder[]> f15150b = new g<>();

    public static b a(Context context, int i6) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i6);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e6) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i6), e6);
            return null;
        }
    }

    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bVar.f15150b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            c cVar = new c();
            cVar.f15154d = 0;
            cVar.f15155e = 1;
            cVar.f15151a = startDelay;
            cVar.f15152b = duration;
            cVar.f15153c = interpolator;
            cVar.f15154d = objectAnimator.getRepeatCount();
            cVar.f15155e = objectAnimator.getRepeatMode();
            bVar.f15149a.put(propertyName, cVar);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f15149a.equals(((b) obj).f15149a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15149a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15149a + "}\n";
    }
}
