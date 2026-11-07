package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public final int B;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public c f238t;

    /* renamed from: u, reason: collision with root package name */
    public View f239u;

    /* renamed from: v, reason: collision with root package name */
    public View f240v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f241w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f242x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f243y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f244z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new l.b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12934a);
        boolean z6 = false;
        this.f241w = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f242x = typedArrayObtainStyledAttributes.getDrawable(2);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f244z = true;
            this.f243y = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f244z ? !(this.f241w != null || this.f242x != null) : this.f243y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f241w;
        if (drawable != null && drawable.isStateful()) {
            this.f241w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f242x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f242x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f243y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f243y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f238t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f241w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f242x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f243y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f239u = findViewById(R.id.action_bar);
        this.f240v = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.s || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        Drawable drawable;
        super.onLayout(z6, i6, i7, i8, i9);
        c cVar = this.f238t;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (cVar == null || cVar.getVisibility() == 8) ? false : true;
        if (cVar != null && cVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
            int measuredHeight2 = measuredHeight - cVar.getMeasuredHeight();
            int i10 = layoutParams.bottomMargin;
            cVar.layout(i6, measuredHeight2 - i10, i8, measuredHeight - i10);
        }
        if (this.f244z) {
            Drawable drawable2 = this.f243y;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = z8;
            }
        } else {
            if (this.f241w != null) {
                if (this.f239u.getVisibility() == 0) {
                    this.f241w.setBounds(this.f239u.getLeft(), this.f239u.getTop(), this.f239u.getRight(), this.f239u.getBottom());
                } else {
                    View view = this.f240v;
                    if (view == null || view.getVisibility() != 0) {
                        this.f241w.setBounds(0, 0, 0, 0);
                    } else {
                        this.f241w.setBounds(this.f240v.getLeft(), this.f240v.getTop(), this.f240v.getRight(), this.f240v.getBottom());
                    }
                }
                z8 = true;
            }
            this.A = z9;
            if (z9 && (drawable = this.f242x) != null) {
                drawable.setBounds(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
            }
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int iA;
        int i8;
        if (this.f239u == null && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE && (i8 = this.B) >= 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i7)), Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i7);
        if (this.f239u == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        c cVar = this.f238t;
        if (cVar == null || cVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f239u;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f240v;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f240v);
        } else {
            iA = a(this.f239u);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f238t) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i7) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f241w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f241w);
        }
        this.f241w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f239u;
            if (view != null) {
                this.f241w.setBounds(view.getLeft(), this.f239u.getTop(), this.f239u.getRight(), this.f239u.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f244z ? !(this.f241w != null || this.f242x != null) : this.f243y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f243y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f243y);
        }
        this.f243y = drawable;
        boolean z6 = this.f244z;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f243y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f241w != null || this.f242x != null) : this.f243y == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f242x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f242x);
        }
        this.f242x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A && (drawable2 = this.f242x) != null) {
                drawable2.setBounds(this.f238t.getLeft(), this.f238t.getTop(), this.f238t.getRight(), this.f238t.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f244z ? !(this.f241w != null || this.f242x != null) : this.f243y == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        c cVar2 = this.f238t;
        if (cVar2 != null) {
            removeView(cVar2);
        }
        this.f238t = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z6) {
        this.s = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        Drawable drawable = this.f241w;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f242x;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f243y;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f241w;
        boolean z6 = this.f244z;
        if (drawable == drawable2 && !z6) {
            return true;
        }
        if (drawable == this.f242x && this.A) {
            return true;
        }
        return (drawable == this.f243y && z6) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }
}
