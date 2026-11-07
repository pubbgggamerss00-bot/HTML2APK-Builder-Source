package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.p0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.a0;
import u0.f0;
import u0.g0;
import u0.m;
import u0.n;
import u0.n0;
import u0.p;
import u0.q;
import u0.v;
import u0.z;
import v0.b;
import y0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements p, m {
    public static final float U = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a V = new a();
    public static final int[] W = {R.attr.fillViewport};
    public boolean A;
    public boolean B;
    public View C;
    public boolean D;
    public VelocityTracker E;
    public boolean F;
    public boolean G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public final int[] L;
    public final int[] M;
    public int N;
    public int O;
    public e P;
    public final q Q;
    public final n R;
    public float S;
    public final u0.d T;
    public final float s;

    /* renamed from: t, reason: collision with root package name */
    public long f977t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f978u;

    /* renamed from: v, reason: collision with root package name */
    public final OverScroller f979v;

    /* renamed from: w, reason: collision with root package name */
    public final EdgeEffect f980w;

    /* renamed from: x, reason: collision with root package name */
    public final EdgeEffect f981x;

    /* renamed from: y, reason: collision with root package name */
    public v f982y;

    /* renamed from: z, reason: collision with root package name */
    public int f983z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends u0.a {
        @Override // u0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // u0.a
        public final void d(View view, v0.b bVar) {
            int scrollRange;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, bVar.f14729a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.h(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            bVar.j(true);
            if (nestedScrollView.getScrollY() > 0) {
                bVar.b(b.a.f14733g);
                bVar.b(b.a.f14735j);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                bVar.b(b.a.f14732f);
                bVar.b(b.a.f14736k);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        @Override // u0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean g(View view, int i6, Bundle bundle) {
            if (super.g(view, i6, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i6 == 4096) {
                    int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i6 == 8192 || i6 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.o(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i6 == 16908346) {
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
        public static void a(NestedScrollView nestedScrollView, float f6) {
            try {
                nestedScrollView.setFrameContentVelocity(f6);
            } catch (LinkageError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c {
        public c() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int s;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e(parcel);
                eVar.s = parcel.readInt();
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return p0.a(sb, this.s, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.s);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.htmltoapk.template.R.attr.nestedScrollViewStyle);
        this.f978u = new Rect();
        this.A = true;
        this.B = false;
        this.C = null;
        this.D = false;
        this.G = true;
        this.K = -1;
        this.L = new int[2];
        this.M = new int[2];
        this.T = new u0.d(getContext(), new c());
        int i6 = Build.VERSION.SDK_INT;
        this.f980w = i6 >= 31 ? b.C0108b.a(context, attributeSet) : new EdgeEffect(context);
        this.f981x = i6 >= 31 ? b.C0108b.a(context, attributeSet) : new EdgeEffect(context);
        this.s = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f979v = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.H = viewConfiguration.getScaledTouchSlop();
        this.I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W, com.htmltoapk.template.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.Q = new q();
        this.R = new n(this);
        setNestedScrollingEnabled(true);
        f0.m(this, V);
    }

    public static boolean f(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && f((View) parent, nestedScrollView);
    }

    private v getScrollFeedbackProvider() {
        if (this.f982y == null) {
            this.f982y = new v(this);
        }
        return this.f982y;
    }

    public final boolean a(int i6) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i6);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !g(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i6 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i6 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i6 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f978u;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i6);
        }
        if (view != null && view.isFocused() && !g(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i6 - verticalFadingEdgeLength : i6;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i7, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        }
        if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(KeyEvent keyEvent) {
        this.f978u.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? e(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? e(130) : a(130);
                    }
                    if (keyCode == 62) {
                        k(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return e(33);
                    }
                    if (keyCode == 93) {
                        return e(130);
                    }
                    if (keyCode == 122) {
                        k(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        k(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i6;
        if (this.f979v.isFinished()) {
            return;
        }
        this.f979v.computeScrollOffset();
        int currY = this.f979v.getCurrY();
        int i7 = currY - this.O;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f980w;
        EdgeEffect edgeEffect2 = this.f981x;
        if (i7 <= 0 || y0.b.a(edgeEffect) == 0.0f) {
            if (i7 < 0 && y0.b.a(edgeEffect2) != 0.0f) {
                float f6 = height;
                iRound = Math.round(y0.b.b(edgeEffect2, (i7 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (iRound != i7) {
                    edgeEffect2.finish();
                }
            }
            int i8 = i7;
            this.O = currY;
            int[] iArr = this.M;
            iArr[1] = 0;
            this.R.c(0, i8, iArr, null, 1);
            i6 = i8 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f979v.getCurrVelocity()));
            }
            if (i6 != 0) {
                int scrollY = getScrollY();
                j(i6, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i9 = i6 - scrollY2;
                iArr[1] = 0;
                this.R.d(0, scrollY2, 0, i9, this.L, 1, iArr);
                i6 = i9 - iArr[1];
            }
            if (i6 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i6 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f979v.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f979v.getCurrVelocity());
                    }
                }
                this.f979v.abortAnimation();
                q(1);
            }
            if (this.f979v.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                q(1);
                return;
            }
        }
        iRound = Math.round(y0.b.b(edgeEffect, ((-i7) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i7) {
            edgeEffect.finish();
        }
        i7 -= iRound;
        int i82 = i7;
        this.O = currY;
        int[] iArr2 = this.M;
        iArr2[1] = 0;
        this.R.c(0, i82, iArr2, null, 1);
        i6 = i82 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i6 != 0) {
        }
        if (i6 != 0) {
        }
        if (this.f979v.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final void d(int i6) {
        if (getChildCount() > 0) {
            this.f979v.fling(getScrollX(), getScrollY(), 0, i6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.R.g(2, 1);
            this.O = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f979v.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return this.R.a(f6, f7, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.R.b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.R.c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.R.d(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f980w;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f981x;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i6) {
        int childCount;
        boolean z6 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f978u;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return l(i6, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i6, int i7) {
        Rect rect = this.f978u;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i6 >= getScrollY() && rect.top - i6 <= getScrollY() + i7;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.Q;
        return qVar.f14523b | qVar.f14522a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.S == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.S = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.S;
    }

    public final void h(int i6, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i6);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.R.d(0, scrollY2, 0, i6 - scrollY2, null, i7, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.R.f(0);
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f983z = (int) motionEvent.getY(i6);
            this.K = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.R.f14519d;
    }

    public final boolean j(int i6, int i7, int i8, int i9) {
        int i10;
        boolean z6;
        int i11;
        boolean z7;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i12 = i8 + i6;
        if (i7 <= 0 && i7 >= 0) {
            i10 = i7;
            z6 = false;
        } else {
            i10 = 0;
            z6 = true;
        }
        if (i12 > i9) {
            i11 = i9;
        } else {
            if (i12 >= 0) {
                i11 = i12;
                z7 = false;
                if (z7 && !this.R.f(1)) {
                    this.f979v.springBack(i10, i11, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i11);
                return !z6 || z7;
            }
            i11 = 0;
        }
        z7 = true;
        if (z7) {
            this.f979v.springBack(i10, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i11);
        if (z6) {
        }
    }

    public final void k(int i6) {
        boolean z6 = i6 == 130;
        int height = getHeight();
        Rect rect = this.f978u;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i7 = rect.top;
        int i8 = height + i7;
        rect.bottom = i8;
        l(i6, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(int i6, int i7, int i8) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        boolean z7 = i6 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z9 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9 && z10) {
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else if (z10) {
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i7 < scrollY || i8 > i9) {
            m(z7 ? i7 - scrollY : i8 - i9, -1, null, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i6);
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(int i6, int i7, MotionEvent motionEvent, int i8, int i9, boolean z6) {
        int i10;
        int i11;
        boolean z7;
        boolean z8;
        VelocityTracker velocityTracker;
        n nVar = this.R;
        if (i9 == 1) {
            nVar.g(2, i9);
        }
        boolean zC = this.R.c(0, i6, this.M, this.L, i9);
        int[] iArr = this.L;
        int[] iArr2 = this.M;
        if (zC) {
            i10 = i6 - iArr2[1];
            i11 = iArr[1];
        } else {
            i10 = i6;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z9 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z10 = j(i10, 0, scrollY, scrollRange) && !nVar.f(i9);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f14582a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i7, scrollY2);
        }
        iArr2[1] = 0;
        this.R.d(0, scrollY2, 0, i10 - scrollY2, this.L, i9, iArr2);
        int i12 = i11 + iArr[1];
        int i13 = i10 - iArr2[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f981x;
        EdgeEffect edgeEffect2 = this.f980w;
        if (i14 >= 0) {
            if (i14 > scrollRange && z9) {
                y0.b.b(edgeEffect, i13 / getHeight(), 1.0f - (i8 / getWidth()));
                if (motionEvent != null) {
                    z7 = false;
                    getScrollFeedbackProvider().f14582a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i7, false);
                } else {
                    z7 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z8 = z7;
            } else {
                z8 = z10;
            }
            if (z8 && i9 == 0 && (velocityTracker = this.E) != null) {
                velocityTracker.clear();
            }
            if (i9 == 1) {
                q(i9);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i12;
        }
        if (z9) {
            y0.b.b(edgeEffect2, (-i13) / getHeight(), i8 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f14582a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i7, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z7 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z8 = z7;
        }
        if (z8) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
        }
        return i12;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i6, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(EdgeEffect edgeEffect, int i6) {
        if (i6 > 0) {
            return true;
        }
        float fA = y0.b.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i6) * 0.35f;
        float f6 = this.s * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d7 = U;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * dLog) * ((double) f6))) < fA;
    }

    public final void o(int i6, int i7, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f977t > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f979v.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z6) {
                this.R.g(2, 1);
            } else {
                q(1);
            }
            this.O = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f979v.isFinished()) {
                this.f979v.abortAnimation();
                q(1);
            }
            scrollBy(i6, i7);
        }
        this.f977t = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        int i6;
        int width;
        int i7;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z6;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f7;
        long j6;
        float f8;
        float fSqrt;
        int i8;
        NestedScrollView nestedScrollView3;
        float f9;
        if (motionEvent.getAction() != 8 || this.D) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i6 = 9;
            f6 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f6 = axisValue2;
            i6 = 26;
        } else {
            f6 = 0.0f;
            i6 = 0;
            width = 0;
        }
        if (f6 == 0.0f) {
            return false;
        }
        m(-((int) (getVerticalScrollFactorCompat() * f6)), i6, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i6 != 0) {
            u0.d dVar = this.T;
            NestedScrollView nestedScrollView4 = NestedScrollView.this;
            int[] iArr = dVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i9 = 1;
            if (dVar.f14473f == source && dVar.f14474g == deviceId && dVar.f14472e == i6) {
                z6 = false;
                i7 = 0;
            } else {
                Context context = dVar.f14468a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i7 = 0;
                int source2 = motionEvent.getSource();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    Method method = g0.f14497a;
                    scaledMinimumFlingVelocity = g0.c.b(viewConfiguration, deviceId2, i6, source2);
                } else {
                    Method method2 = g0.f14497a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i6, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i6 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i10 >= 34) {
                    scaledMaximumFlingVelocity = g0.c.a(viewConfiguration, deviceId3, i6, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i6, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i6 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                dVar.f14473f = source;
                dVar.f14474g = deviceId;
                dVar.f14472e = i6;
                z6 = true;
            }
            if (iArr[i7] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = dVar.f14470c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                dVar.f14470c = null;
                return true;
            }
            if (dVar.f14470c == null) {
                dVar.f14470c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = dVar.f14470c;
            Map<VelocityTracker, a0> map = z.f14592a;
            velocityTracker2.addMovement(motionEvent);
            int i11 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map<VelocityTracker, a0> map2 = z.f14592a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new a0());
                }
                a0 a0Var = map2.get(velocityTracker2);
                long[] jArr = a0Var.f14450b;
                long eventTime = motionEvent.getEventTime();
                if (a0Var.f14452d != 0 && eventTime - jArr[a0Var.f14453e] > 40) {
                    a0Var.f14452d = i7;
                    a0Var.f14451c = 0.0f;
                }
                int i12 = (a0Var.f14453e + 1) % 20;
                a0Var.f14453e = i12;
                int i13 = a0Var.f14452d;
                if (i13 != 20) {
                    a0Var.f14452d = i13 + 1;
                }
                a0Var.f14449a[i12] = motionEvent.getAxisValue(26);
                jArr[a0Var.f14453e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, Float.MAX_VALUE);
            a0 a0Var2 = z.f14592a.get(velocityTracker2);
            if (a0Var2 != null) {
                float[] fArr = a0Var2.f14449a;
                long[] jArr2 = a0Var2.f14450b;
                int i14 = a0Var2.f14452d;
                if (i14 < 2) {
                    nestedScrollView = nestedScrollView4;
                    f8 = Float.MAX_VALUE;
                    i8 = 1000;
                    fSqrt = 0.0f;
                    f9 = fSqrt * i8;
                    a0Var2.f14451c = f9;
                    if (f9 >= (-Math.abs(f8))) {
                        a0Var2.f14451c = -Math.abs(f8);
                    } else if (a0Var2.f14451c > Math.abs(f8)) {
                        a0Var2.f14451c = Math.abs(f8);
                    }
                } else {
                    int i15 = a0Var2.f14453e;
                    int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                    long j7 = jArr2[i15];
                    while (true) {
                        j6 = jArr2[i16];
                        if (j7 - j6 <= 100) {
                            break;
                        }
                        a0Var2.f14452d--;
                        i16 = (i16 + 1) % 20;
                    }
                    int i17 = a0Var2.f14452d;
                    if (i17 >= 2) {
                        if (i17 == 2) {
                            int i18 = (i16 + 1) % 20;
                            if (j6 != jArr2[i18]) {
                                nestedScrollView = nestedScrollView4;
                                f8 = Float.MAX_VALUE;
                                i8 = 1000;
                                fSqrt = fArr[i18] / (r12 - j6);
                            }
                        } else {
                            f8 = Float.MAX_VALUE;
                            float f10 = 0.0f;
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 >= a0Var2.f14452d - 1) {
                                    break;
                                }
                                int i21 = i19 + i16;
                                long j8 = jArr2[i21 % 20];
                                int i22 = (i21 + 1) % i11;
                                if (jArr2[i22] == j8) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i20++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float fSqrt2 = (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
                                    float f11 = fArr[i22] / (jArr2[i22] - j8);
                                    float fAbs = (Math.abs(f11) * (f11 - fSqrt2)) + f10;
                                    if (i20 == i9) {
                                        fAbs *= 0.5f;
                                    }
                                    f10 = fAbs;
                                }
                                i19++;
                                nestedScrollView4 = nestedScrollView3;
                                i11 = 20;
                                i9 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            fSqrt = ((float) Math.sqrt(Math.abs(f10) * 2.0f)) * (f10 < 0.0f ? -1.0f : 1.0f);
                            i8 = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                        }
                        f9 = fSqrt * i8;
                        a0Var2.f14451c = f9;
                        if (f9 >= (-Math.abs(f8))) {
                        }
                    }
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = z.a.a(velocityTracker2, i6);
            } else if (i6 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i6 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                a0 a0Var3 = z.f14592a.get(velocityTracker2);
                yVelocity = (a0Var3 == null || i6 != 26) ? 0.0f : a0Var3.f14451c;
            }
            float f12 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f12);
            if (z6 || !(fSignum == Math.signum(dVar.f14471d) || fSignum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f979v.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f12) >= iArr[0]) {
                float fMax = Math.max(-r3, Math.min(f12, iArr[1]));
                if (fMax == 0.0f) {
                    f7 = 0.0f;
                } else {
                    nestedScrollView2.f979v.abortAnimation();
                    nestedScrollView2.d((int) fMax);
                    f7 = fMax;
                }
                dVar.f14471d = f7;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.D) {
            return true;
        }
        int i6 = action & 255;
        if (i6 == 0) {
            int y2 = (int) motionEvent.getY();
            int x6 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x6 < childAt.getLeft() || x6 >= childAt.getRight()) {
                    if (!p(motionEvent) && this.f979v.isFinished()) {
                        z6 = false;
                    }
                    this.D = z6;
                    VelocityTracker velocityTracker = this.E;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.E = null;
                    }
                } else {
                    this.f983z = y2;
                    this.K = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.E;
                    if (velocityTracker2 == null) {
                        this.E = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.E.addMovement(motionEvent);
                    this.f979v.computeScrollOffset();
                    if (!p(motionEvent) && this.f979v.isFinished()) {
                        z6 = false;
                    }
                    this.D = z6;
                    this.R.g(2, 0);
                }
            }
        } else if (i6 == 1) {
            this.D = false;
            this.K = -1;
            VelocityTracker velocityTracker3 = this.E;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.E = null;
            }
            if (this.f979v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            q(0);
        } else if (i6 == 2) {
            int i7 = this.K;
            if (i7 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i7);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i7 + " in onInterceptTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y6 - this.f983z) > this.H && (2 & getNestedScrollAxes()) == 0) {
                        this.D = true;
                        this.f983z = y6;
                        if (this.E == null) {
                            this.E = VelocityTracker.obtain();
                        }
                        this.E.addMovement(motionEvent);
                        this.N = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i6 != 3) {
            if (i6 == 6) {
                i(motionEvent);
            }
        }
        return this.D;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int measuredHeight;
        super.onLayout(z6, i6, i7, i8, i9);
        int i10 = 0;
        this.A = false;
        View view = this.C;
        if (view != null && f(view, this)) {
            View view2 = this.C;
            Rect rect = this.f978u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.C = null;
        if (!this.B) {
            if (this.P != null) {
                scrollTo(getScrollX(), this.P.s);
                this.P = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i10 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.B = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.F && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        d((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.R.b(f6, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        this.R.c(i6, i7, iArr, null, 0);
    }

    @Override // u0.p
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        h(i9, i10, iArr);
    }

    @Override // u0.o
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        q qVar = this.Q;
        if (i7 == 1) {
            qVar.f14523b = i6;
        } else {
            qVar.f14522a = i6;
        }
        this.R.g(2, i7);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i6, int i7, boolean z6, boolean z7) {
        super.scrollTo(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (i6 == 2) {
            i6 = 130;
        } else if (i6 == 1) {
            i6 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i6) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i6);
        if (viewFindNextFocus != null && g(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i6, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.P = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.s = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !g(viewFindFocus, 0, i9)) {
            return;
        }
        Rect rect = this.f978u;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.G) {
                o(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // u0.o
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i7) {
        return (i6 & 2) != 0;
    }

    @Override // u0.o
    public final void onStopNestedScroll(View view, int i6) {
        q qVar = this.Q;
        if (i6 == 1) {
            qVar.f14523b = 0;
        } else {
            qVar.f14522a = 0;
        }
        q(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fB;
        int iRound;
        int i6;
        ViewParent parent2;
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.N);
        n nVar = this.R;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f980w;
            EdgeEffect edgeEffect2 = this.f981x;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.E;
                velocityTracker.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, this.J);
                int yVelocity = (int) velocityTracker.getYVelocity(this.K);
                if (Math.abs(yVelocity) >= this.I) {
                    if (y0.b.a(edgeEffect) != 0.0f) {
                        if (n(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (y0.b.a(edgeEffect2) != 0.0f) {
                        int i7 = -yVelocity;
                        if (n(edgeEffect2, i7)) {
                            edgeEffect2.onAbsorb(i7);
                        } else {
                            d(i7);
                        }
                    } else {
                        int i8 = -yVelocity;
                        float f7 = i8;
                        if (!nVar.b(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            d(i8);
                        }
                    }
                } else if (this.f979v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.K = -1;
                this.D = false;
                VelocityTracker velocityTracker2 = this.E;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.E = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.K);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.K + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i9 = this.f983z - y2;
                    float x6 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i9 / getHeight();
                    if (y0.b.a(edgeEffect) != 0.0f) {
                        fB = -y0.b.b(edgeEffect, -height, x6);
                        if (y0.b.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (y0.b.a(edgeEffect2) != 0.0f) {
                            fB = y0.b.b(edgeEffect2, height, 1.0f - x6);
                            if (y0.b.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        iRound = Math.round(f6 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i6 = i9 - iRound;
                        if (!this.D && Math.abs(i6) > this.H) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.D = true;
                            i6 = i6 <= 0 ? i6 - this.H : i6 + this.H;
                        }
                        if (this.D) {
                            int iM = m(i6, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f983z = y2 - iM;
                            this.N += iM;
                        }
                    }
                    f6 = fB;
                    iRound = Math.round(f6 * getHeight());
                    if (iRound != 0) {
                    }
                    i6 = i9 - iRound;
                    if (!this.D) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.D = true;
                        if (i6 <= 0) {
                        }
                    }
                    if (this.D) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.D && getChildCount() > 0) {
                    if (this.f979v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.K = -1;
                this.D = false;
                VelocityTracker velocityTracker3 = this.E;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.E = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f983z = (int) motionEvent.getY(actionIndex);
                this.K = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                i(motionEvent);
                this.f983z = (int) motionEvent.getY(motionEvent.findPointerIndex(this.K));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.D && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f979v.isFinished()) {
                this.f979v.abortAnimation();
                q(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f983z = y6;
            this.K = pointerId;
            nVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.E;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f980w;
        if (y0.b.a(edgeEffect) != 0.0f) {
            y0.b.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f981x;
        if (y0.b.a(edgeEffect2) == 0.0f) {
            return z6;
        }
        y0.b.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void q(int i6) {
        this.R.h(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.A) {
            this.C = view2;
        } else {
            Rect rect = this.f978u;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z7 = iB != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, iB);
                return z7;
            }
            o(0, iB, false);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.E) != null) {
            velocityTracker.recycle();
            this.E = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i6 < 0) {
                i6 = 0;
            } else if (width + i6 > width2) {
                i6 = width2 - width;
            }
            if (height >= height2 || i7 < 0) {
                i7 = 0;
            } else if (height + i7 > height2) {
                i7 = height2 - height;
            }
            if (i6 == getScrollX() && i7 == getScrollY()) {
                return;
            }
            super.scrollTo(i6, i7);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.F) {
            this.F = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        n nVar = this.R;
        if (nVar.f14519d) {
            ViewGroup viewGroup = nVar.f14518c;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.d.l(viewGroup);
        }
        nVar.f14519d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.G = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return this.R.g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        q(0);
    }

    @Override // u0.o
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8) {
        this.R.c(i6, i7, iArr, null, i8);
    }

    @Override // u0.o
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10) {
        h(i9, i10, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return onStartNestedScroll(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        h(i9, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6) {
        if (getChildCount() <= 0) {
            super.addView(view, i6);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        onNestedScrollAccepted(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(d dVar) {
    }
}
