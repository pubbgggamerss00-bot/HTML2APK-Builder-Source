package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import c1.x;
import com.basitce.htmltoapk.R;
import com.google.android.material.appbar.AppBarLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import m3.b;
import ob.d;
import y3.p;
import y3.q0;
import zb.g;
import zb.h;
import zb.i;
import zb.k;
import zb.m;

/* loaded from: classes2.dex */
public final class AppBarLayout extends LinearLayout implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public int f6269a;

    /* renamed from: b, reason: collision with root package name */
    public int f6270b;

    /* renamed from: c, reason: collision with root package name */
    public int f6271c;

    /* renamed from: d, reason: collision with root package name */
    public int f6272d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6273e;

    /* renamed from: f, reason: collision with root package name */
    public int f6274f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6275g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6276h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6277j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6278k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f6279l;

    /* renamed from: m, reason: collision with root package name */
    public int f6280m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference<View> f6281n;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f6282p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f6283q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f6284r;

    /* renamed from: s, reason: collision with root package name */
    public int f6285s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f6286t;

    /* renamed from: v, reason: collision with root package name */
    public Integer f6287v;

    /* renamed from: w, reason: collision with root package name */
    public Behavior f6288w;

    public static class BaseBehavior<T extends AppBarLayout> extends ob.c<T> {

        /* renamed from: h, reason: collision with root package name */
        public int f6289h;

        /* renamed from: i, reason: collision with root package name */
        public ValueAnimator f6290i;

        /* renamed from: j, reason: collision with root package name */
        public a f6291j;

        /* renamed from: k, reason: collision with root package name */
        public WeakReference<View> f6292k;

        public static class a extends q4.a {
            public static final Parcelable.Creator<a> CREATOR = new C0069a();

            /* renamed from: c, reason: collision with root package name */
            public boolean f6293c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f6294d;

            /* renamed from: e, reason: collision with root package name */
            public int f6295e;

            /* renamed from: f, reason: collision with root package name */
            public float f6296f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f6297g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            public class C0069a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i10) {
                    return new a[i10];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f6293c = parcel.readByte() != 0;
                this.f6294d = parcel.readByte() != 0;
                this.f6295e = parcel.readInt();
                this.f6296f = parcel.readFloat();
                this.f6297g = parcel.readByte() != 0;
            }

            @Override // q4.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f6293c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f6294d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f6295e);
                parcel.writeFloat(this.f6296f);
                parcel.writeByte(this.f6297g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View q(BaseBehavior baseBehavior, m3.b bVar) {
            int childCount = bVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bVar.getChildAt(i10);
                if (((b.d) childAt.getLayoutParams()).f17639a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View r(m3.b bVar) {
            int childCount = bVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bVar.getChildAt(i10);
                if ((childAt instanceof p) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // m3.b.AbstractC0173b
        public final void f(View view, Parcelable parcelable) {
            if (parcelable instanceof a) {
                this.f6291j = (a) parcelable;
            } else {
                this.f6291j = null;
            }
        }

        @Override // m3.b.AbstractC0173b
        public final Parcelable g(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a aVarS = s(absSavedState, (AppBarLayout) view);
            return aVarS == null ? absSavedState : aVarS;
        }

        @Override // m3.b.AbstractC0173b
        public final boolean h(m3.b bVar, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.f6278k || appBarLayout.f6277j || (appBarLayout.getTotalScrollRange() != 0 && bVar.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f6290i) != null) {
                valueAnimator.cancel();
            }
            this.f6292k = null;
            return z10;
        }

        @Override // ob.c
        public final boolean j(View view) {
            WeakReference<View> weakReference = this.f6292k;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // ob.c
        public final int k(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // ob.c
        public final int l(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // ob.c
        public final int m() {
            return this.f6289h;
        }

        @Override // ob.c
        public final void n(m3.b bVar, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int i10 = this.f6289h - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    i11 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f6298a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i11);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i13 = cVar2.f6298a;
                if ((i13 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i11 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i13 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i13 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (i10 < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i13 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (i10 < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    int iE = x.e(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0);
                    int iAbs = Math.abs(this.f6289h - iE);
                    float fAbs = Math.abs(CropImageView.DEFAULT_ASPECT_RATIO);
                    int iRound = fAbs > CropImageView.DEFAULT_ASPECT_RATIO ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
                    int i14 = this.f6289h;
                    if (i14 == iE) {
                        ValueAnimator valueAnimator = this.f6290i;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            this.f6290i.cancel();
                        }
                    } else {
                        ValueAnimator valueAnimator2 = this.f6290i;
                        if (valueAnimator2 == null) {
                            ValueAnimator valueAnimator3 = new ValueAnimator();
                            this.f6290i = valueAnimator3;
                            valueAnimator3.setInterpolator(nb.a.f18656b);
                            this.f6290i.addUpdateListener(new com.google.android.material.appbar.a(this, appBarLayout, bVar));
                        } else {
                            valueAnimator2.cancel();
                        }
                        this.f6290i.setDuration(Math.min(iRound, 600));
                        this.f6290i.setIntValues(i14, iE);
                        this.f6290i.start();
                    }
                }
            }
            if (appBarLayout.f6278k) {
                appBarLayout.d(appBarLayout.e(r(bVar)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
        @Override // ob.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int o(m3.b bVar, View view, int i10, int i11, int i12) {
            int top;
            View childAt;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i13 = this.f6289h;
            int i14 = 0;
            zE = false;
            zE = false;
            zE = false;
            zE = false;
            boolean zE = false;
            i14 = 0;
            if (i11 == 0 || i13 < i11 || i13 > i12) {
                this.f6289h = 0;
            } else {
                int iE = x.e(i10, i11, i12);
                if (i13 != iE) {
                    if (appBarLayout.f6273e) {
                        int iAbs = Math.abs(iE);
                        int childCount = appBarLayout.getChildCount();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= childCount) {
                                break;
                            }
                            View childAt2 = appBarLayout.getChildAt(i15);
                            c cVar = (c) childAt2.getLayoutParams();
                            Interpolator interpolator = cVar.f6299b;
                            if (iAbs < childAt2.getTop() || iAbs > childAt2.getBottom()) {
                                i15++;
                            } else if (interpolator != null) {
                                int i16 = cVar.f6298a;
                                if ((i16 & 1) != 0) {
                                    topInset = childAt2.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i16 & 2) != 0) {
                                        topInset -= childAt2.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                if (childAt2.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f10 = topInset;
                                    top = (childAt2.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt2.getTop()) / f10) * f10)) * Integer.signum(iE);
                                }
                            }
                        }
                        top = iE;
                        int i17 = i13 - iE;
                        this.f6289h = iE - top;
                        if (!appBarLayout.f6273e) {
                            throw null;
                        }
                        appBarLayout.f6269a = 0;
                        if (!appBarLayout.willNotDraw()) {
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        char c10 = iE < i13 ? (char) 65535 : (char) 1;
                        int iAbs2 = Math.abs(iE);
                        int childCount2 = appBarLayout.getChildCount();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= childCount2) {
                                childAt = null;
                                break;
                            }
                            childAt = appBarLayout.getChildAt(i18);
                            if (iAbs2 >= childAt.getTop() && iAbs2 <= childAt.getBottom()) {
                                break;
                            }
                            i18++;
                        }
                        if (childAt != null) {
                            int i19 = ((c) childAt.getLayoutParams()).f6298a;
                            if ((i19 & 1) != 0) {
                                int minimumHeight = childAt.getMinimumHeight();
                                if (c10 <= 0 || (i19 & 12) == 0 ? !((i19 & 2) == 0 || (-iE) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-iE) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                                    zE = true;
                                }
                            }
                        }
                        if (appBarLayout.f6278k) {
                            zE = appBarLayout.e(r(bVar));
                        }
                        if (appBarLayout.d(zE)) {
                            throw null;
                        }
                        i14 = i17;
                    } else {
                        top = iE;
                        int i172 = i13 - iE;
                        this.f6289h = iE - top;
                        if (!appBarLayout.f6273e) {
                        }
                    }
                }
            }
            if (q0.a(bVar) != null) {
                return i14;
            }
            q0.h(bVar, new com.google.android.material.appbar.b(this, appBarLayout, bVar));
            return i14;
        }

        public final a s(Parcelable parcelable, T t3) {
            int childCount = t3.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t3.getChildAt(i10);
                int bottom = childAt.getBottom();
                if (childAt.getTop() <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = q4.a.f21913b;
                    }
                    a aVar = new a(parcelable);
                    aVar.f6294d = true;
                    aVar.f6293c = false;
                    aVar.f6295e = i10;
                    aVar.f6297g = bottom == t3.getTopInset() + childAt.getMinimumHeight();
                    aVar.f6296f = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        @Override // m3.b.AbstractC0173b
        public final boolean e(m3.b bVar, View view, Rect rect) {
            throw null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18034h);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f6298a;

        /* renamed from: b, reason: collision with root package name */
        public Interpolator f6299b;
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.f6298a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f6298a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.f6298a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f6298a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18027a);
        cVar.f6298a = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (typedArrayObtainStyledAttributes.getInt(0, 0) == 1) {
            new Rect();
            new Rect();
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f6299b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        BaseBehavior.a aVarS = (this.f6270b == -1 || this.f6274f != 0) ? null : this.f6288w.s(q4.a.f21913b, this);
        this.f6270b = -1;
        this.f6271c = -1;
        this.f6272d = -1;
        if (aVarS != null) {
            Behavior behavior = this.f6288w;
            if (behavior.f6291j != null) {
                return;
            }
            behavior.f6291j = aVarS;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z10) {
        if (this.f6275g || this.f6277j == z10) {
            return false;
        }
        this.f6277j = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof h)) {
            return true;
        }
        ColorStateList colorStateList = this.f6279l;
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (colorStateList == null) {
            if (!this.f6278k) {
                return true;
            }
            f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            return true;
        }
        float f11 = z10 ? 0.0f : 1.0f;
        if (z10) {
            f10 = 1.0f;
        }
        f(f11, f10);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6286t == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, -this.f6269a);
        this.f6286t.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6286t;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        if (this.f6281n == null && (i10 = this.f6280m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f6280m);
            }
            if (viewFindViewById != null) {
                this.f6281n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f6281n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void f(float f10, float f11) {
        ValueAnimator valueAnimator = this.f6282p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f6282p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        this.f6282p.setInterpolator(null);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f6283q;
        if (animatorUpdateListener != null) {
            this.f6282p.addUpdateListener(animatorUpdateListener);
        }
        this.f6282p.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f6298a = 1;
        return cVar;
    }

    @Override // m3.b.a
    public b.AbstractC0173b<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f6288w = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f6271c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f6298a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f6271c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f6272d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f6298a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f6272d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6280m;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f6274f;
    }

    public Drawable getStatusBarForeground() {
        return this.f6286t;
    }

    @Deprecated
    public float getTargetElevation() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f6270b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f6298a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f6270b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof h) {
            i.b(this, (h) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f6284r == null) {
            this.f6284r = new int[4];
        }
        int[] iArr = this.f6284r;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f6276h;
        int i11 = R.attr.state_liftable;
        if (!z10) {
            i11 = -R.attr.state_liftable;
        }
        iArr[0] = i11;
        int i12 = R.attr.state_lifted;
        if (!z10 || !this.f6277j) {
            i12 = -R.attr.state_lifted;
        }
        iArr[1] = i12;
        int i13 = R.attr.state_collapsible;
        if (!z10) {
            i13 = -R.attr.state_collapsible;
        }
        iArr[2] = i13;
        int i14 = R.attr.state_collapsed;
        if (!z10 || !this.f6277j) {
            i14 = -R.attr.state_collapsed;
        }
        iArr[3] = i14;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f6281n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6281n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    Field field = q0.f33885a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f6273e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i14).getLayoutParams()).f6299b != null) {
                this.f6273e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f6286t;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f6275g) {
            return;
        }
        if (!this.f6278k) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((c) getChildAt(i15).getLayoutParams()).f6298a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f6276h != z11) {
            this.f6276h = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = x.e(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final h hVar;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof h) {
            hVar = (h) drawable;
        } else {
            ColorStateList colorStateListA = tb.d.a(drawable);
            if (colorStateListA == null) {
                hVar = null;
            } else {
                m mVar = new m();
                mVar.f34928a = new k();
                mVar.f34929b = new k();
                mVar.f34930c = new k();
                mVar.f34931d = new k();
                mVar.f34932e = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
                mVar.f34933f = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
                mVar.f34934g = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
                mVar.f34935h = new zb.a(CropImageView.DEFAULT_ASPECT_RATIO);
                mVar.f34936i = new g();
                mVar.f34937j = new g();
                mVar.f34938k = new g();
                mVar.f34939l = new g();
                h hVar2 = new h(mVar);
                hVar2.k(colorStateListA);
                hVar = hVar2;
            }
        }
        if (hVar != null && (colorStateList = hVar.f34886b.f34915c) != null) {
            this.f6285s = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f6279l;
            if (colorStateList2 != null) {
                final Integer numA = ga.g.a(getContext(), R.attr.colorSurface);
                this.f6283q = new ValueAnimator.AnimatorUpdateListener() { // from class: ob.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        AppBarLayout appBarLayout = this.f19115a;
                        int iB = r3.a.b(r3.a.d(colorStateList2.getDefaultColor(), Math.round(Color.alpha(r2) * fFloatValue)), appBarLayout.f6285s);
                        hVar.k(ColorStateList.valueOf(iB));
                        if (appBarLayout.f6286t != null && (num = appBarLayout.f6287v) != null && num.equals(numA)) {
                            appBarLayout.f6286t.setTint(iB);
                        }
                        throw null;
                    }
                };
            } else {
                hVar.f34886b.f34914b = new ub.a(context);
                hVar.n();
                this.f6283q = new ValueAnimator.AnimatorUpdateListener() { // from class: ob.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AppBarLayout appBarLayout = this.f19119a;
                        appBarLayout.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        hVar.j(fFloatValue);
                        Drawable drawable2 = appBarLayout.f6286t;
                        if (drawable2 instanceof h) {
                            ((h) drawable2).j(fFloatValue);
                        }
                        throw null;
                    }
                };
            }
            drawable = hVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof h) {
            ((h) background).j(f10);
        }
    }

    public void setExpanded(boolean z10) {
        this.f6274f = (z10 ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z10) {
        this.f6278k = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f6279l != colorStateList) {
            this.f6279l = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f6280m = -1;
        if (view != null) {
            this.f6281n = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f6281n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6281n = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f6280m = i10;
        WeakReference<View> weakReference = this.f6281n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6281n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f6275g = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setPendingAction(int i10) {
        this.f6274f = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f6286t;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6286t = drawableMutate;
            if (drawableMutate instanceof h) {
                numValueOf = Integer.valueOf(((h) drawableMutate).f34906v);
            } else {
                ColorStateList colorStateListA = tb.d.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.f6287v = numValueOf;
            Drawable drawable3 = this.f6286t;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6286t.setState(getDrawableState());
                }
                this.f6286t.setLayoutDirection(getLayoutDirection());
                this.f6286t.setVisible(getVisibility() == 0, false);
                this.f6286t.setCallback(this);
            }
            if (this.f6286t != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(i.a.c(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -R.attr.state_lifted}, ObjectAnimator.ofFloat(this, "elevation", CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j10));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", CropImageView.DEFAULT_ASPECT_RATIO).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f6286t;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6286t;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f6298a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
