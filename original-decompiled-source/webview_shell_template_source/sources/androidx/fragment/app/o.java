package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {
    public static int a(Context context, int i6) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i6});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f1214a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1215b;

        public a(Animation animation) {
            this.f1214a = animation;
            this.f1215b = null;
        }

        public a(Animator animator) {
            this.f1214a = null;
            this.f1215b = animator;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup s;

        /* renamed from: t, reason: collision with root package name */
        public final View f1216t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1217u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f1218v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f1219w;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1219w = true;
            this.s = viewGroup;
            this.f1216t = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j6, Transformation transformation) {
            this.f1219w = true;
            if (this.f1217u) {
                return !this.f1218v;
            }
            if (!super.getTransformation(j6, transformation)) {
                this.f1217u = true;
                u0.u.a(this.s, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z6 = this.f1217u;
            ViewGroup viewGroup = this.s;
            if (z6 || !this.f1219w) {
                viewGroup.endViewTransition(this.f1216t);
                this.f1218v = true;
            } else {
                this.f1219w = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j6, Transformation transformation, float f6) {
            this.f1219w = true;
            if (this.f1217u) {
                return !this.f1218v;
            }
            if (!super.getTransformation(j6, transformation, f6)) {
                this.f1217u = true;
                u0.u.a(this.s, this);
            }
            return true;
        }
    }
}
