package n4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e extends androidx.appcompat.widget.b {
    public Drawable H;
    public final Rect I;
    public final Rect J;
    public int K;
    public final boolean L;
    public boolean M;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.H;
        if (drawable != null) {
            if (this.M) {
                this.M = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.L;
                Rect rect = this.I;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i6 = this.K;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.J;
                Gravity.apply(i6, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.H.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.H;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        this.M = z6 | this.M;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.M = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.H);
            }
            this.H = drawable;
            this.M = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.K == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i6) {
        if (this.K != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.K = i6;
            if (i6 == 119 && this.H != null) {
                this.H.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H;
    }

    public e(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, 0);
        this.I = new Rect();
        this.J = new Rect();
        this.K = 119;
        this.L = true;
        this.M = false;
        j.a(context, attributeSet, 0, 0);
        int[] iArr = w3.a.f15069j;
        j.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.K = typedArrayObtainStyledAttributes.getInt(1, this.K);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.L = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
