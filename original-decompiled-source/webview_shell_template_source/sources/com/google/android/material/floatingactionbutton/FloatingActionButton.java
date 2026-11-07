package com.google.android.material.floatingactionbutton;

import a4.b;
import a4.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import l.j;
import n4.o;
import u4.k;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class FloatingActionButton extends o implements k4.a, u4.o, CoordinatorLayout.b {
    public boolean A;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f12325t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f12326u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f12327v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f12328w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f12329x;

    /* renamed from: y, reason: collision with root package name */
    public int f12330y;

    /* renamed from: z, reason: collision with root package name */
    public int f12331z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b<T extends FloatingActionButton> implements d.a {
        @Override // com.google.android.material.floatingactionbutton.d.a
        public final void a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        return null;
    }

    @Override // k4.a
    public final boolean a() {
        throw null;
    }

    public final void b() {
        d impl = getImpl();
        if (impl.f12356m == null) {
            impl.f12356m = new ArrayList<>();
        }
        impl.f12356m.add(null);
    }

    public final void c(e eVar) {
        d impl = getImpl();
        if (impl.f12355l == null) {
            impl.f12355l = new ArrayList<>();
        }
        impl.f12355l.add(eVar);
    }

    public final void d() {
        d impl = getImpl();
        b bVar = new b();
        if (impl.f12357n == null) {
            impl.f12357n = new ArrayList<>();
        }
        impl.f12357n.add(bVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final int e(int i6) {
        int i7 = this.f12331z;
        if (i7 != 0) {
            return i7;
        }
        Resources resources = getResources();
        return i6 != -1 ? i6 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? e(1) : e(0);
    }

    public final void f(a4.b bVar, boolean z6) {
        d impl = getImpl();
        if (bVar != null) {
            new com.google.android.material.floatingactionbutton.a(this, bVar);
        }
        impl.getClass();
        throw null;
    }

    public final boolean g() {
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f12325t;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f12326u;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        getImpl().getClass();
        throw null;
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f12348d;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f12349e;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f12331z;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public x3.b getHideMotionSpec() {
        return getImpl().h;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12329x;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12329x;
    }

    public k getShapeAppearanceModel() {
        k kVar = getImpl().f12345a;
        kVar.getClass();
        return kVar;
    }

    public x3.b getShowMotionSpec() {
        return getImpl().f12351g;
    }

    public int getSize() {
        return this.f12330y;
    }

    public int getSizeDimension() {
        return e(this.f12330y);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12327v;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f12328w;
    }

    public boolean getUseCompatPadding() {
        return this.A;
    }

    public final boolean h() {
        getImpl().getClass();
        throw null;
    }

    public final void i() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f12327v;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f12328w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(j.c(colorForState, mode));
    }

    public final void j(b.a aVar, boolean z6) {
        d impl = getImpl();
        if (aVar != null) {
            new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        impl.getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i7) {
        getSizeDimension();
        getImpl().f();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x4.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x4.a aVar = (x4.a) parcelable;
        super.onRestoreInstanceState(aVar.s);
        aVar.f15156u.get("expandableWidgetHelper").getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new g();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12325t != colorStateList) {
            this.f12325t = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f12326u != mode) {
            this.f12326u = mode;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCompatElevation(float f6) {
        d impl = getImpl();
        if (impl.f12347c != f6) {
            impl.f12347c = f6;
            impl.d(f6, impl.f12348d, impl.f12349e);
        }
    }

    public void setCompatElevationResource(int i6) {
        setCompatElevation(getResources().getDimension(i6));
    }

    public void setCompatHoveredFocusedTranslationZ(float f6) {
        d impl = getImpl();
        if (impl.f12348d != f6) {
            impl.f12348d = f6;
            impl.d(impl.f12347c, f6, impl.f12349e);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i6) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i6));
    }

    public void setCompatPressedTranslationZ(float f6) {
        d impl = getImpl();
        if (impl.f12349e != f6) {
            impl.f12349e = f6;
            impl.d(impl.f12347c, impl.f12348d, f6);
        }
    }

    public void setCompatPressedTranslationZResource(int i6) {
        setCompatPressedTranslationZ(getResources().getDimension(i6));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(isClickable() ? getContentDescription() : null);
        }
    }

    public void setCustomSize(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i6 != this.f12331z) {
            this.f12331z = i6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        if (z6 != getImpl().f12346b) {
            getImpl().f12346b = z6;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i6) {
        throw null;
    }

    public void setHideMotionSpec(x3.b bVar) {
        getImpl().h = bVar;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(x3.b.a(getContext(), i6));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() == drawable) {
            return;
        }
        super.setImageDrawable(drawable);
        d impl = getImpl();
        float f6 = impl.f12352i;
        impl.f12352i = f6;
        impl.a(f6, null);
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        throw null;
    }

    public void setMaxImageSize(int i6) {
        d impl = getImpl();
        if (impl.f12353j == i6) {
            return;
        }
        impl.f12353j = i6;
        float f6 = impl.f12352i;
        impl.f12352i = f6;
        impl.a(f6, null);
        throw null;
    }

    public void setRippleColor(int i6) {
        setRippleColor(ColorStateList.valueOf(i6));
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        super.setScaleX(f6);
        ArrayList<d.a> arrayList = getImpl().f12357n;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).a();
        throw null;
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        super.setScaleY(f6);
        ArrayList<d.a> arrayList = getImpl().f12357n;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).a();
        throw null;
    }

    public void setShadowPaddingEnabled(boolean z6) {
        d impl = getImpl();
        impl.getClass();
        impl.f();
        throw null;
    }

    @Override // u4.o
    public void setShapeAppearanceModel(k kVar) {
        getImpl().f12345a = kVar;
    }

    public void setShowMotionSpec(x3.b bVar) {
        getImpl().f12351g = bVar;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(x3.b.a(getContext(), i6));
    }

    public void setSize(int i6) {
        this.f12331z = 0;
        if (i6 != this.f12330y) {
            this.f12330y = i6;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12327v != colorStateList) {
            this.f12327v = colorStateList;
            i();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f12328w != mode) {
            this.f12328w = mode;
            i();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        super.setTranslationX(f6);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        super.setTranslationY(f6);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationZ(float f6) {
        super.setTranslationZ(f6);
        getImpl().e();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.A == z6) {
            return;
        }
        this.A = z6;
        getImpl().f();
        throw null;
    }

    @Override // n4.o, android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f12332a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12333b;

        public BaseBehavior() {
            this.f12333b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f924a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListD = coordinatorLayout.d(floatingActionButton);
            int size = arrayListD.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayListD.get(i7);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f924a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.k(floatingActionButton, i6);
            throw null;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f12333b || fVar.f929f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f12332a == null) {
                this.f12332a = new Rect();
            }
            Rect rect = this.f12332a;
            n4.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.f(null, false);
                return true;
            }
            floatingActionButton.j(null, false);
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f12333b || fVar.f929f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.f(null, false);
                return true;
            }
            floatingActionButton.j(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.h);
            this.f12333b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12329x != colorStateList) {
            this.f12329x = colorStateList;
            getImpl().getClass();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }
}
