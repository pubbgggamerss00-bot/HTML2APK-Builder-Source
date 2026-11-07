package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.j;
import com.google.android.material.appbar.AppBarLayout;
import com.htmltoapk.template.R;
import e5.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import u0.f0;
import u0.m;
import u0.n0;
import w.g;
import y3.d;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;
    public ColorStateList C;
    public int D;
    public WeakReference<View> E;
    public ValueAnimator F;
    public ValueAnimator.AnimatorUpdateListener G;
    public int[] H;
    public int I;
    public Drawable J;
    public Integer K;
    public Behavior L;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f11966t;

    /* renamed from: u, reason: collision with root package name */
    public int f11967u;

    /* renamed from: v, reason: collision with root package name */
    public int f11968v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11969w;

    /* renamed from: x, reason: collision with root package name */
    public int f11970x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11971y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11972z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class BaseBehavior<T extends AppBarLayout> extends y3.c<T> {

        /* renamed from: j, reason: collision with root package name */
        public int f11973j;

        /* renamed from: k, reason: collision with root package name */
        public int f11974k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f11975l;

        /* renamed from: m, reason: collision with root package name */
        public a f11976m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference<View> f11977n;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a extends b1.a {
            public static final Parcelable.Creator<a> CREATOR = new C0032a();

            /* renamed from: u, reason: collision with root package name */
            public boolean f11978u;

            /* renamed from: v, reason: collision with root package name */
            public boolean f11979v;

            /* renamed from: w, reason: collision with root package name */
            public int f11980w;

            /* renamed from: x, reason: collision with root package name */
            public float f11981x;

            /* renamed from: y, reason: collision with root package name */
            public boolean f11982y;

            /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            public class C0032a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i6) {
                    return new a[i6];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f11978u = parcel.readByte() != 0;
                this.f11979v = parcel.readByte() != 0;
                this.f11980w = parcel.readInt();
                this.f11981x = parcel.readFloat();
                this.f11982y = parcel.readByte() != 0;
            }

            @Override // b1.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                super.writeToParcel(parcel, i6);
                parcel.writeByte(this.f11978u ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f11979v ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f11980w);
                parcel.writeFloat(this.f11981x);
                parcel.writeByte(this.f11982y ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f924a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof m) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i7, boolean z6) {
            View childAt;
            boolean zE;
            int iAbs = Math.abs(i6);
            int childCount = appBarLayout.getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i8);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i8++;
                }
            }
            if (childAt != null) {
                int i9 = ((c) childAt.getLayoutParams()).f11985a;
                if ((i9 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zE = true;
                    if (i7 <= 0 || (i9 & 12) == 0 ? (i9 & 2) == 0 || (-i6) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i6) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zE = false;
                    }
                }
            }
            if (appBarLayout.B) {
                zE = appBarLayout.e(D(coordinatorLayout));
            }
            boolean zD = appBarLayout.d(zE);
            if (!z6) {
                if (zD) {
                    List list = (List) ((g) coordinatorLayout.f917t.f10860t).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f919v;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList.get(i10)).getLayoutParams()).f924a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).f15238f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            int iAbs = Math.abs(t() - i6);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iT = t();
            if (iT == i6) {
                ValueAnimator valueAnimator = this.f11975l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f11975l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f11975l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11975l = valueAnimator3;
                valueAnimator3.setInterpolator(x3.a.f15148e);
                this.f11975l.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f11975l.setDuration(Math.min(iRound, 600));
            this.f11975l.setIntValues(iT, i6);
            this.f11975l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i7;
            int downNestedPreScrollRange;
            if (i6 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i6 < 0) {
                    i7 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i7;
                } else {
                    i7 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i8 = i7;
                int i9 = downNestedPreScrollRange;
                if (i8 != i9) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, t() - i6, i8, i9);
                }
            }
            if (appBarLayout2.B) {
                appBarLayout2.d(appBarLayout2.e(view));
            }
        }

        public final a F(Parcelable parcelable, T t6) {
            int iS = s();
            int childCount = t6.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t6.getChildAt(i6);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = b1.a.f1982t;
                    }
                    a aVar = new a(parcelable);
                    boolean z6 = iS == 0;
                    aVar.f11979v = z6;
                    aVar.f11978u = !z6 && (-iS) >= t6.getTotalScrollRange();
                    aVar.f11980w = i6;
                    aVar.f11982y = bottom == t6.getTopInset() + childAt.getMinimumHeight();
                    aVar.f11981x = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t6) {
            int paddingTop = t6.getPaddingTop() + t6.getTopInset();
            int iT = t() - paddingTop;
            int childCount = t6.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    i6 = -1;
                    break;
                }
                View childAt = t6.getChildAt(i6);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f11985a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i7 = -iT;
                if (top <= i7 && bottom >= i7) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 >= 0) {
                View childAt2 = t6.getChildAt(i6);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i8 = cVar2.f11985a;
                if ((i8 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i6 == 0 && t6.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= t6.getTopInset();
                    }
                    if ((i8 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i8 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iT < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i8 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iT < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, t6, i.b(topInset + paddingTop, -t6.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // y3.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i6);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.f11976m;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i7 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, i7);
                        } else {
                            A(coordinatorLayout, appBarLayout, i7);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.f11978u) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (aVar.f11979v) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.f11980w);
                int i8 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.f11976m.f11982y ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i8 : Math.round(childAt.getHeight() * this.f11976m.f11981x) + i8);
            }
            appBarLayout.f11970x = 0;
            this.f11976m = null;
            int iB = i.b(s(), -appBarLayout.getTotalScrollRange(), 0);
            e1.c cVar = this.f15239a;
            if (cVar == null) {
                this.f15240b = iB;
            } else if (cVar.f12777c != iB) {
                cVar.f12777c = iB;
                cVar.c();
            }
            H(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.s = s();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (f0.d(coordinatorLayout) != null) {
                return true;
            }
            f0.m(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.l(appBarLayout, i6, i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i7, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i8 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, t() - i8, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i8 == 0 && f0.d(coordinatorLayout2) == null) {
                f0.m(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof a) {
                this.f11976m = (a) parcelable;
            } else {
                this.f11976m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a aVarF = F(absSavedState, (AppBarLayout) view);
            return aVarF == null ? absSavedState : aVarF;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z6 = (i6 & 2) != 0 && (appBarLayout.B || appBarLayout.A || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z6 && (valueAnimator = this.f11975l) != null) {
                valueAnimator.cancel();
            }
            this.f11977n = null;
            this.f11974k = i7;
            return z6;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f11974k == 0 || i6 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.B) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f11977n = new WeakReference<>(view2);
        }

        @Override // y3.e
        public final int t() {
            return s() + this.f11973j;
        }

        @Override // y3.c
        public final boolean v(View view) {
            WeakReference<View> weakReference = this.f11977n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // y3.c
        public final int w(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // y3.c
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // y3.c
        public final void y(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.B) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
        @Override // y3.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            int top;
            e1.c cVar;
            boolean z6;
            List list;
            int i9;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iT = t();
            int i10 = 0;
            if (i7 == 0 || iT < i7 || iT > i8) {
                this.f11973j = 0;
            } else {
                int iB = i.b(i6, i7, i8);
                if (iT != iB) {
                    if (appBarLayout.f11969w) {
                        int iAbs = Math.abs(iB);
                        int childCount = appBarLayout.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i11);
                            c cVar2 = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar2.f11987c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i11++;
                            } else if (interpolator != null) {
                                int i12 = cVar2.f11985a;
                                if ((i12 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar2).topMargin + ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                                    if ((i12 & 2) != 0) {
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f6 = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f6) * f6)) * Integer.signum(iB);
                                }
                            }
                        }
                        top = iB;
                        cVar = this.f15239a;
                        int i13 = 1;
                        if (cVar == null) {
                            if (cVar.f12777c != top) {
                                cVar.f12777c = top;
                                cVar.c();
                                z6 = true;
                            }
                            int i14 = iT - iB;
                            this.f11973j = iB - top;
                            if (z6) {
                                int i15 = 0;
                                while (i15 < appBarLayout.getChildCount()) {
                                    c cVar3 = (c) appBarLayout.getChildAt(i15).getLayoutParams();
                                    b bVar = cVar3.f11986b;
                                    if (bVar != null && (cVar3.f11985a & i13) != 0) {
                                        View childAt2 = appBarLayout.getChildAt(i15);
                                        float fS = s();
                                        Rect rect = bVar.f11984b;
                                        Rect rect2 = bVar.f11983a;
                                        childAt2.getDrawingRect(rect2);
                                        appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                        rect2.offset(0, -appBarLayout.getTopInset());
                                        float fAbs = rect2.top - Math.abs(fS);
                                        if (fAbs <= 0.0f) {
                                            float fA = 1.0f - i.a(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                            float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fA * fA)));
                                            childAt2.setTranslationY(fHeight);
                                            childAt2.getDrawingRect(rect);
                                            rect.offset(0, (int) (-fHeight));
                                            if (fHeight >= rect.height()) {
                                                childAt2.setAlpha(0.0f);
                                            } else {
                                                childAt2.setAlpha(1.0f);
                                            }
                                            childAt2.setClipBounds(rect);
                                        } else {
                                            childAt2.setClipBounds(null);
                                            childAt2.setTranslationY(0.0f);
                                            childAt2.setAlpha(1.0f);
                                        }
                                    }
                                    i15++;
                                    i13 = 1;
                                }
                            }
                            if (!z6 && appBarLayout.f11969w && (list = (List) ((g) coordinatorLayout.f917t.f10860t).get(appBarLayout)) != null && !list.isEmpty()) {
                                for (i9 = 0; i9 < list.size(); i9++) {
                                    View view2 = (View) list.get(i9);
                                    CoordinatorLayout.c cVar4 = ((CoordinatorLayout.f) view2.getLayoutParams()).f924a;
                                    if (cVar4 != null) {
                                        cVar4.d(coordinatorLayout, view2, appBarLayout);
                                    }
                                }
                            }
                            appBarLayout.s = s();
                            if (!appBarLayout.willNotDraw()) {
                                appBarLayout.postInvalidateOnAnimation();
                            }
                            H(coordinatorLayout, appBarLayout, iB, iB < iT ? -1 : 1, false);
                            i10 = i14;
                        } else {
                            this.f15240b = top;
                        }
                        z6 = false;
                        int i142 = iT - iB;
                        this.f11973j = iB - top;
                        if (z6) {
                        }
                        if (!z6) {
                            while (i9 < list.size()) {
                            }
                        }
                        appBarLayout.s = s();
                        if (!appBarLayout.willNotDraw()) {
                        }
                        H(coordinatorLayout, appBarLayout, iB, iB < iT ? -1 : 1, false);
                        i10 = i142;
                    } else {
                        top = iB;
                        cVar = this.f15239a;
                        int i132 = 1;
                        if (cVar == null) {
                        }
                        z6 = false;
                        int i1422 = iT - iB;
                        this.f11973j = iB - top;
                        if (z6) {
                        }
                        if (!z6) {
                        }
                        appBarLayout.s = s();
                        if (!appBarLayout.willNotDraw()) {
                        }
                        H(coordinatorLayout, appBarLayout, iB, iB < iT ? -1 : 1, false);
                        i10 = i1422;
                    }
                }
            }
            if (f0.d(coordinatorLayout) != null) {
                return i10;
            }
            f0.m(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            return i10;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iB;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f924a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f11973j + this.f15237e;
                if (this.f15238f == 0) {
                    iB = 0;
                } else {
                    float fW = w(view2);
                    int i6 = this.f15238f;
                    iB = i.b((int) (fW * i6), 0, i6);
                }
                int i7 = bottom - iB;
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                view.offsetTopAndBottom(i7);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.B) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                f0.m(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            AppBarLayout appBarLayout;
            ArrayList arrayListD = coordinatorLayout.d(view);
            int size = arrayListD.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListD.get(i6);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i6++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f15235c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.f11970x = (z6 ? 0 : 4) | 10;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // y3.d
        public final AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) arrayList.get(i6);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // y3.d
        public final float w(View view) {
            int i6;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f924a;
                int iT = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iT > downNestedPreScrollRange) && (i6 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iT / i6) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // y3.d
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.A);
            this.f15238f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f11983a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f11984b = new Rect();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f11985a;

        /* renamed from: b, reason: collision with root package name */
        public b f11986b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f11987c;
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.f11985a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f11985a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.f11985a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f11985a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15061a);
        cVar.f11985a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f11986b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f11987c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        BaseBehavior.a aVarF = (this.f11966t == -1 || this.f11970x != 0) ? null : this.L.F(b1.a.f1982t, this);
        this.f11966t = -1;
        this.f11967u = -1;
        this.f11968v = -1;
        if (aVarF != null) {
            Behavior behavior = this.L;
            if (behavior.f11976m != null) {
                return;
            }
            behavior.f11976m = aVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z6) {
        if (this.f11971y || this.A == z6) {
            return false;
        }
        this.A = z6;
        refreshDrawableState();
        if (!(getBackground() instanceof u4.g)) {
            return true;
        }
        if (this.C != null) {
            f(z6 ? 0.0f : 1.0f, z6 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.B) {
            return true;
        }
        f(0.0f, 0.0f);
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.J == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.s);
        this.J.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i6;
        if (this.E == null && (i6 = this.D) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i6) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.D);
            }
            if (viewFindViewById != null) {
                this.E = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.E;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void f(float f6, float f7) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, f7);
        this.F = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        this.F.setInterpolator(null);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.G;
        if (animatorUpdateListener != null) {
            this.F.addUpdateListener(animatorUpdateListener);
        }
        this.F.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f11985a = 1;
        return cVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.L = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i6 = this.f11967u;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = cVar.f11985a;
                if ((i8 & 5) != 5) {
                    if (i7 > 0) {
                        break;
                    }
                } else {
                    int i9 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i8 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i8 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i9 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i7 += iMin;
                    }
                    iMin = minimumHeight + i9;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i7 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i7);
        this.f11967u = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i6 = this.f11968v;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i7 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i8 = cVar.f11985a;
                if ((i8 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i8 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i7++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f11968v = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.D;
    }

    public u4.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof u4.g) {
            return (u4.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i6 = (minimumHeight * 2) + topInset;
            return i6 < getHeight() ? i6 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i7 = (minimumHeight2 * 2) + topInset;
        return i7 < getHeight() ? i7 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f11970x;
    }

    public Drawable getStatusBarForeground() {
        return this.J;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i6 = this.f11966t;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i7 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = cVar.f11985a;
                if ((i8 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i7 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i8 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i7++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f11966t = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof u4.g) {
            a1.a.g(this, (u4.g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        if (this.H == null) {
            this.H = new int[4];
        }
        int[] iArr = this.H;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + iArr.length);
        boolean z6 = this.f11972z;
        iArr[0] = z6 ? R.attr.state_liftable : -2130904219;
        iArr[1] = (z6 && this.A) ? R.attr.state_lifted : -2130904220;
        iArr[2] = z6 ? R.attr.state_collapsible : -2130904215;
        iArr[3] = (z6 && this.A) ? R.attr.state_collapsed : -2130904214;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.E = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        boolean z7 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f11969w = false;
        int childCount2 = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i10).getLayoutParams()).f11987c != null) {
                this.f11969w = true;
                break;
            }
            i10++;
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f11971y) {
            return;
        }
        if (!this.B) {
            int childCount3 = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount3) {
                    z7 = false;
                    break;
                }
                int i12 = ((c) getChildAt(i11).getLayoutParams()).f11985a;
                if ((i12 & 1) == 1 && (i12 & 10) != 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (this.f11972z != z7) {
            this.f11972z = z7;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i7);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = i.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i7));
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
        final u4.g gVar;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof u4.g) {
            gVar = (u4.g) drawable;
        } else {
            ColorStateList colorStateListA = i4.a.a(drawable);
            if (colorStateListA == null) {
                gVar = null;
            } else {
                u4.g gVar2 = new u4.g();
                gVar2.r(colorStateListA);
                gVar = gVar2;
            }
        }
        if (gVar != null && (colorStateList = gVar.f14610t.f14621c) != null) {
            this.I = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.C;
            if (colorStateList2 != null) {
                final Integer numG = j.g(getContext(), R.attr.colorSurface);
                this.G = new ValueAnimator.AnimatorUpdateListener() { // from class: y3.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f15221a;
                        appBarLayout.getClass();
                        int i6 = j.i(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.I, colorStateList2.getDefaultColor());
                        gVar.r(ColorStateList.valueOf(i6));
                        if (appBarLayout.J != null && (num = appBarLayout.K) != null && num.equals(numG)) {
                            appBarLayout.J.setTint(i6);
                        }
                        throw null;
                    }
                };
            } else {
                gVar.n(context);
                this.G = new ValueAnimator.AnimatorUpdateListener() { // from class: y3.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AppBarLayout appBarLayout = this.f15225a;
                        appBarLayout.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        gVar.q(fFloatValue);
                        Drawable drawable2 = appBarLayout.J;
                        if (drawable2 instanceof u4.g) {
                            ((u4.g) drawable2).q(fFloatValue);
                        }
                        throw null;
                    }
                };
            }
            drawable = gVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof u4.g) {
            ((u4.g) background).q(f6);
        }
    }

    public void setExpanded(boolean z6) {
        this.f11970x = (z6 ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z6) {
        this.B = z6;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.D = -1;
        if (view != null) {
            this.E = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.E = null;
    }

    public void setLiftOnScrollTargetViewId(int i6) {
        this.D = i6;
        WeakReference<View> weakReference = this.E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.E = null;
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.f11971y = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (i6 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i6);
    }

    public void setPendingAction(int i6) {
        this.f11970x = i6;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.J;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.J = drawableMutate;
            if (drawableMutate instanceof u4.g) {
                numValueOf = Integer.valueOf(((u4.g) drawableMutate).N);
            } else {
                ColorStateList colorStateListA = i4.a.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.K = numValueOf;
            Drawable drawable3 = this.J;
            boolean z6 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.J.setState(getDrawableState());
                }
                this.J.setLayoutDirection(getLayoutDirection());
                this.J.setVisible(getVisibility() == 0, false);
                this.J.setCallback(this);
            }
            if (this.J != null && getTopInset() > 0) {
                z6 = true;
            }
            setWillNotDraw(!z6);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i6) {
        setStatusBarForeground(new ColorDrawable(i6));
    }

    public void setStatusBarForegroundResource(int i6) {
        setStatusBarForeground(b0.d(getContext(), i6));
    }

    @Deprecated
    public void setTargetElevation(float f6) throws Resources.NotFoundException {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j6 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130904220}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j6));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f6).setDuration(j6));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f11985a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
