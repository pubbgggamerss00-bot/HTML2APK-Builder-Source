package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.htmltoapk.template.R;
import e2.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends u {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends AnimatorListenerAdapter implements f.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f12788a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12789b = false;

        public a(View view) {
            this.f12788a = view;
        }

        @Override // e2.f.d
        public final void a() {
            View view = this.f12788a;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? o.f12824a.a(view) : 0.0f));
        }

        @Override // e2.f.d
        public final void e() {
            this.f12788a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            o.f12824a.b(this.f12788a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f12788a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f12789b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z6) {
            boolean z7 = this.f12789b;
            View view = this.f12788a;
            if (z7) {
                view.setLayerType(0, null);
            }
            if (z6) {
                return;
            }
            s sVar = o.f12824a;
            sVar.b(view, 1.0f);
            sVar.getClass();
        }

        @Override // e2.f.d
        public final void c(f fVar) {
        }

        @Override // e2.f.d
        public final void d(f fVar) {
        }

        @Override // e2.f.d
        public final void f(f fVar) {
        }

        @Override // e2.f.d
        public final void g(f fVar) {
        }
    }

    public c(int i6) {
        this.S = i6;
    }

    public static float K(m mVar, float f6) {
        Float f7;
        return (mVar == null || (f7 = (Float) mVar.f12820a.get("android:fade:transitionAlpha")) == null) ? f6 : f7.floatValue();
    }

    public final ObjectAnimator J(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        o.f12824a.b(view, f6);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, o.f12825b, f7);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        o().a(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // e2.f
    public final void g(m mVar) {
        u.H(mVar);
        View view = mVar.f12821b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(o.f12824a.a(view)) : Float.valueOf(0.0f);
        }
        mVar.f12820a.put("android:fade:transitionAlpha", fValueOf);
    }
}
