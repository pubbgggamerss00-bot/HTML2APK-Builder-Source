package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: l0, reason: collision with root package name */
    public int f12320l0;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f12321m0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.getLayoutParams().width = f6.intValue();
            view2.requestLayout();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.getLayoutParams().height = f6.intValue();
            view2.requestLayout();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.setPaddingRelative(f6.intValue(), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            View view2 = view;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f6.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    public static void z(ExtendedFloatingActionButton extendedFloatingActionButton, int i6) {
        if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 3) {
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Unknown strategy type: "));
        }
        throw null;
    }

    public final void A() {
        CharSequence text;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (isClickable()) {
            text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getContentDescription();
            }
        } else {
            text = null;
        }
        if (TextUtils.equals(getTooltipText(), text)) {
            return;
        }
        setTooltipText(text);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i6 = this.f12320l0;
        if (i6 >= 0) {
            return i6;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public int getCurrentOriginalTextColor() {
        return this.f12321m0.getColorForState(getDrawableState(), 0);
    }

    public x3.b getExtendMotionSpec() {
        throw null;
    }

    public x3.b getHideMotionSpec() {
        throw null;
    }

    public ColorStateList getOriginalTextColor() {
        return this.f12321m0;
    }

    public x3.b getShowMotionSpec() {
        throw null;
    }

    public x3.b getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
        A();
    }

    public void setCollapsedSize(int i6) {
        this.f12320l0 = i6;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        A();
    }

    public void setExtendMotionSpec(x3.b bVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i6) {
        setExtendMotionSpec(x3.b.a(getContext(), i6));
    }

    public void setExtended(boolean z6) {
        if (z6) {
            throw null;
        }
    }

    public void setHideMotionSpec(x3.b bVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(x3.b.a(getContext(), i6));
    }

    public void setShowMotionSpec(x3.b bVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(x3.b.a(getContext(), i6));
    }

    public void setShrinkMotionSpec(x3.b bVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i6) {
        setShrinkMotionSpec(x3.b.a(getContext(), i6));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i6) {
        super.setTextColor(i6);
        this.f12321m0 = getTextColors();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f12322a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12323b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f12324c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f12323b = false;
            this.f12324c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f924a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListD = coordinatorLayout.d(extendedFloatingActionButton);
            int size = arrayListD.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayListD.get(i7);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f924a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.k(extendedFloatingActionButton, i6);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f12323b;
            boolean z7 = this.f12324c;
            if ((z6 || z7) && fVar.f929f == appBarLayout.getId()) {
                if (this.f12322a == null) {
                    this.f12322a = new Rect();
                }
                Rect rect = this.f12322a;
                n4.c.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.z(extendedFloatingActionButton, z7 ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.z(extendedFloatingActionButton, z7 ? 3 : 0);
                throw null;
            }
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z6 = this.f12323b;
            boolean z7 = this.f12324c;
            if ((z6 || z7) && fVar.f929f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.z(extendedFloatingActionButton, z7 ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.z(extendedFloatingActionButton, z7 ? 3 : 0);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15067g);
            this.f12323b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f12324c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f12321m0 = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z6) {
    }

    public void setAnimationEnabled(boolean z6) {
    }
}
