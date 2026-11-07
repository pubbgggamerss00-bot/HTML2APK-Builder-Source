package c5;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class o {
    public static int a(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f4968a;

        public a(Animation animation) {
            this.f4968a = animation;
        }

        public a(Animator animator) {
            this.f4968a = null;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f4969a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4970b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4971c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4972d;

        public b(Animation animation, ViewGroup viewGroup) {
            super(false);
            this.f4972d = true;
            this.f4969a = viewGroup;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f4972d = true;
            if (this.f4970b) {
                return !this.f4971c;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4970b = true;
                y3.x.a(this.f4969a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f4970b;
            ViewGroup viewGroup = this.f4969a;
            if (z10 || !this.f4972d) {
                viewGroup.endViewTransition(null);
                this.f4971c = true;
            } else {
                this.f4972d = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4972d = true;
            if (this.f4970b) {
                return !this.f4971c;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4970b = true;
                y3.x.a(this.f4969a, this);
            }
            return true;
        }
    }
}
