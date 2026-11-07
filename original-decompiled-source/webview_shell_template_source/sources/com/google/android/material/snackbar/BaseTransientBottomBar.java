package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.j;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.htmltoapk.template.R;
import n4.n;
import u4.g;
import u4.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12437a = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i, reason: collision with root package name */
        public final b f12438i;

        public Behavior() {
            b bVar = new b();
            this.f12029f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.f12030g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f12027d = 0;
            this.f12438i = bVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f12438i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (w4.b.a().f15086a) {
                    }
                }
            } else if (coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (w4.b.a().f15086a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f12438i.getClass();
            return view instanceof c;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i6 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends FrameLayout {
        public static final a B = new a();
        public PorterDuff.Mode A;
        public BaseTransientBottomBar<?> s;

        /* renamed from: t, reason: collision with root package name */
        public final k f12439t;

        /* renamed from: u, reason: collision with root package name */
        public int f12440u;

        /* renamed from: v, reason: collision with root package name */
        public final float f12441v;

        /* renamed from: w, reason: collision with root package name */
        public final float f12442w;

        /* renamed from: x, reason: collision with root package name */
        public final int f12443x;

        /* renamed from: y, reason: collision with root package name */
        public final int f12444y;

        /* renamed from: z, reason: collision with root package name */
        public ColorStateList f12445z;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
            GradientDrawable gradientDrawable;
            super(a5.a.b(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, w3.a.D);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f12440u = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f12439t = k.f(context2, attributeSet, 0, 0).a();
            }
            this.f12441v = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(q4.c.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(n.a(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f12442w = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f12443x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f12444y = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            getPaddingEnd();
            setOnTouchListener(B);
            setFocusable(true);
            if (getBackground() == null) {
                int i6 = j.i(getBackgroundOverlayColorAlpha(), j.j(getContext(), q4.b.d(this, R.attr.colorSurface)), j.j(getContext(), q4.b.d(this, R.attr.colorOnSurface)));
                k kVar = this.f12439t;
                if (kVar != null) {
                    int i7 = BaseTransientBottomBar.f12437a;
                    g gVar = new g(kVar);
                    gVar.r(ColorStateList.valueOf(i6));
                    gradientDrawable = gVar;
                } else {
                    Resources resources = getResources();
                    int i8 = BaseTransientBottomBar.f12437a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(i6);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f12445z;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                setBackground(gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.s = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f12442w;
        }

        public int getAnimationMode() {
            return this.f12440u;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f12441v;
        }

        public int getMaxInlineActionWidth() {
            return this.f12444y;
        }

        public int getMaxWidth() {
            return this.f12443x;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.s;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.s != null) {
                synchronized (w4.b.a().f15086a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
            super.onLayout(z6, i6, i7, i8, i9);
            if (this.s != null) {
                throw null;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i6, int i7) {
            super.onMeasure(i6, i7);
            int i8 = this.f12443x;
            if (i8 <= 0 || getMeasuredWidth() <= i8) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i7);
        }

        public void setAnimationMode(int i6) {
            this.f12440u = i6;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f12445z != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f12445z);
                drawable.setTintMode(this.A);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f12445z = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.A);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.A = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.s == null) {
                    return;
                }
                int i6 = BaseTransientBottomBar.f12437a;
                throw null;
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : B);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = x3.a.f15144a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
