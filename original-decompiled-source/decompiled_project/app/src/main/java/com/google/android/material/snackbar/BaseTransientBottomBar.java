package com.google.android.material.snackbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6475a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i, reason: collision with root package name */
        public final b f6476i;

        public Behavior() {
            b bVar = new b();
            this.f6311f = Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 0.1f), 1.0f);
            this.f6312g = Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 0.6f), 1.0f);
            this.f6309d = 0;
            this.f6476i = bVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, m3.b.AbstractC0173b
        public final boolean c(m3.b bVar, View view, MotionEvent motionEvent) {
            this.f6476i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (bc.b.a().f4208a) {
                    }
                }
            } else if (bVar.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (bc.b.a().f4208a) {
                }
            }
            return super.c(bVar, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean j(View view) {
            this.f6476i.getClass();
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    public static class b {
    }

    public static class c extends FrameLayout {

        /* renamed from: e, reason: collision with root package name */
        public static final a f6477e = new a();

        /* renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar<?> f6478a;

        /* renamed from: b, reason: collision with root package name */
        public int f6479b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f6480c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f6481d;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6478a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }

        public int getAnimationMode() {
            return this.f6479b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }

        public int getMaxInlineActionWidth() {
            return 0;
        }

        public int getMaxWidth() {
            return 0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6478a;
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
            if (this.f6478a != null) {
                synchronized (bc.b.a().f4208a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6478a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
        }

        public void setAnimationMode(int i10) {
            this.f6479b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f6480c != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f6480c);
                drawable.setTintMode(this.f6481d);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f6480c = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.f6481d);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f6481d = mode;
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
                if (this.f6478a == null) {
                    return;
                }
                int i10 = BaseTransientBottomBar.f6475a;
                throw null;
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f6477e);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = nb.a.f18655a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
