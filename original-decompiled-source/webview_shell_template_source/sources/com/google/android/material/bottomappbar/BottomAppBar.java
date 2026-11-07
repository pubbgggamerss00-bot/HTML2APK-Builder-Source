package com.google.android.material.bottomappbar;

import a4.c;
import a4.d;
import a4.e;
import a4.f;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.htmltoapk.template.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f12036x0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public Integer f12037m0;

    /* renamed from: n0, reason: collision with root package name */
    public AnimatorSet f12038n0;

    /* renamed from: o0, reason: collision with root package name */
    public AnimatorSet f12039o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f12040q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12041r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f12042s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f12043t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f12044u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f12045v0;

    /* renamed from: w0, reason: collision with root package name */
    public Behavior f12046w0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ ActionMenuView s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f12052t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f12053u;

        public a(ActionMenuView actionMenuView, int i6, boolean z6) {
            this.s = actionMenuView;
            this.f12052t = i6;
            this.f12053u = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = this.f12052t;
            boolean z6 = this.f12053u;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.s.setTranslationX(bottomAppBar.z(r3, i6, z6));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends b1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public int f12055u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f12056v;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12055u = parcel.readInt();
            this.f12056v = parcel.readInt() != 0;
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f12055u);
            parcel.writeInt(this.f12056v ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return o4.b.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return A(this.p0);
    }

    private float getFabTranslationY() {
        if (this.f12041r0 == 1) {
            return -getTopEdgeTreatment().f33u;
        }
        return y() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final float A(int i6) {
        int measuredWidth = 0;
        boolean z6 = getLayoutDirection() == 1;
        if (i6 != 1) {
            return 0.0f;
        }
        View viewY = y();
        if (this.f12042s0 != -1 && viewY != null) {
            measuredWidth = this.f12042s0 + (viewY.getMeasuredWidth() / 2);
        }
        return ((getMeasuredWidth() / 2) - measuredWidth) * (z6 ? -1 : 1);
    }

    public final boolean B() {
        View viewY = y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        return floatingActionButton != null && floatingActionButton.h();
    }

    public final void C() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f12045v0 && B()) {
            int i6 = this.f12041r0;
        }
        throw null;
    }

    public final void D(ActionMenuView actionMenuView, int i6, boolean z6, boolean z7) {
        a aVar = new a(actionMenuView, i6, z6);
        if (z7) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f33u;
    }

    public int getFabAlignmentMode() {
        return this.p0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f12042s0;
    }

    public int getFabAnchorMode() {
        return this.f12041r0;
    }

    public int getFabAnimationMode() {
        return this.f12040q0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f32t;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().s;
    }

    public boolean getHideOnScroll() {
        return this.f12044u0;
    }

    public int getMenuAlignmentMode() {
        return this.f12043t0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a1.a.g(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        if (z6) {
            AnimatorSet animatorSet = this.f12039o0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f12038n0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f12039o0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B()) {
            D(actionMenuView, this.p0, this.f12045v0, false);
        } else {
            D(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.s);
        this.p0 = bVar.f12055u;
        this.f12045v0 = bVar.f12056v;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f12055u = this.p0;
        bVar.f12056v = this.f12045v0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f6) {
        if (f6 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f6 >= 0.0f) {
                topEdgeTreatment.f33u = f6;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        throw null;
    }

    public void setFabAlignmentMode(int i6) {
        int i7;
        boolean z6 = this.f12045v0;
        int i8 = 0;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f12039o0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (B()) {
                i7 = i6;
            } else {
                z6 = false;
                i7 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i7, z6)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new d(this, actionMenuView, i7, z6));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f12039o0 = animatorSet3;
            animatorSet3.addListener(new c(i8, this));
            this.f12039o0.start();
        }
        if (this.p0 != i6 && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f12038n0;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f12040q0 == 1) {
                View viewY = y();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null, "translationX", A(i6));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewY2 = y();
                FloatingActionButton floatingActionButton = viewY2 instanceof FloatingActionButton ? (FloatingActionButton) viewY2 : null;
                if (floatingActionButton != null && !floatingActionButton.g()) {
                    floatingActionButton.f(new a4.b(this, i6), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(o4.b.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15144a));
            this.f12038n0 = animatorSet5;
            animatorSet5.addListener(new a4.a(this, 0));
            this.f12038n0.start();
        }
        this.p0 = i6;
    }

    public void setFabAlignmentModeEndMargin(int i6) {
        if (this.f12042s0 == i6) {
            return;
        }
        this.f12042s0 = i6;
        C();
        throw null;
    }

    public void setFabAnchorMode(int i6) {
        this.f12041r0 = i6;
        C();
        throw null;
    }

    public void setFabAnimationMode(int i6) {
        this.f12040q0 = i6;
    }

    public void setFabCornerSize(float f6) {
        if (f6 == getTopEdgeTreatment().f34v) {
            return;
        }
        getTopEdgeTreatment().f34v = f6;
        throw null;
    }

    public void setFabCradleMargin(float f6) {
        if (f6 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f32t = f6;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f6) {
        if (f6 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().s = f6;
        throw null;
    }

    public void setHideOnScroll(boolean z6) {
        this.f12044u0 = z6;
    }

    public void setMenuAlignmentMode(int i6) {
        if (this.f12043t0 != i6) {
            this.f12043t0 = i6;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                D(actionMenuView, this.p0, B(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f12037m0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f12037m0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f12037m0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final View y() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((g) coordinatorLayout.f917t.f10860t).get(this);
        ArrayList arrayList = coordinatorLayout.f919v;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int z(ActionMenuView actionMenuView, int i6, boolean z6) throws Resources.NotFoundException {
        int i7 = 0;
        if (this.f12043t0 != 1 && (i6 != 1 || !z6)) {
            return 0;
        }
        boolean z7 = getLayoutDirection() == 1;
        int measuredWidth = z7 ? getMeasuredWidth() : 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f13075a & 8388615) == 8388611) {
                measuredWidth = z7 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z7 ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z7) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i7 = dimensionPixelOffset;
        }
        return measuredWidth - (right + i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f12046w0 == null) {
            this.f12046w0 = new Behavior();
        }
        return this.f12046w0;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: n, reason: collision with root package name */
        public final Rect f12047n;

        /* renamed from: o, reason: collision with root package name */
        public WeakReference<BottomAppBar> f12048o;

        /* renamed from: p, reason: collision with root package name */
        public int f12049p;

        /* renamed from: q, reason: collision with root package name */
        public final a f12050q;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f12048o.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f12047n.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.f12049p == 0) {
                    if (bottomAppBar.f12041r0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i14 = BottomAppBar.f12036x0;
                bottomAppBar.C();
                throw null;
            }
        }

        public Behavior() {
            this.f12050q = new a();
            this.f12047n = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f12048o = new WeakReference<>(bottomAppBar);
            int i7 = BottomAppBar.f12036x0;
            View viewY = bottomAppBar.y();
            if (viewY == null || viewY.isLaidOut()) {
                coordinatorLayout.k(bottomAppBar, i6);
                super.h(coordinatorLayout, bottomAppBar, i6);
                return false;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewY.getLayoutParams();
            fVar.f927d = 17;
            int i8 = bottomAppBar.f12041r0;
            if (i8 == 1) {
                fVar.f927d = 49;
            }
            if (i8 == 0) {
                fVar.f927d |= 80;
            }
            this.f12049p = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewY.getLayoutParams())).bottomMargin;
            if (viewY instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) viewY;
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.b();
                floatingActionButton.c(new e(bottomAppBar));
                floatingActionButton.d();
            }
            viewY.addOnLayoutChangeListener(this.f12050q);
            bottomAppBar.C();
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i6, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12050q = new a();
            this.f12047n = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
