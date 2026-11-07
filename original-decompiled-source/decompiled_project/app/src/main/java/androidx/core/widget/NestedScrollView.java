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
import c4.b;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import y3.c0;
import y3.n0;
import y3.o0;
import y3.p;
import y3.q;
import y3.q0;
import y3.r0;
import y3.s;
import y3.t;
import z3.j;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements s, p {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a G = new a();
    public static final int[] H = {R.attr.fillViewport};
    public e A;
    public final t B;
    public final q C;
    public float D;
    public final y3.e E;

    /* renamed from: a, reason: collision with root package name */
    public final float f1411a;

    /* renamed from: b, reason: collision with root package name */
    public long f1412b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1413c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f1414d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1415e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1416f;

    /* renamed from: g, reason: collision with root package name */
    public c0 f1417g;

    /* renamed from: h, reason: collision with root package name */
    public int f1418h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1419j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1420k;

    /* renamed from: l, reason: collision with root package name */
    public View f1421l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1422m;

    /* renamed from: n, reason: collision with root package name */
    public VelocityTracker f1423n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1424p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1425q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1426r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1427s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1428t;

    /* renamed from: v, reason: collision with root package name */
    public int f1429v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f1430w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1431x;

    /* renamed from: y, reason: collision with root package name */
    public int f1432y;

    /* renamed from: z, reason: collision with root package name */
    public int f1433z;

    public static class a extends y3.a {
        @Override // y3.a
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

        @Override // y3.a
        public final void d(View view, j jVar) {
            int scrollRange;
            this.f33785a.onInitializeAccessibilityNodeInfo(view, jVar.f34725a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            jVar.g("android.widget.ScrollView");
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            jVar.h();
            if (nestedScrollView.getScrollY() > 0) {
                jVar.b(j.a.f34731h);
                jVar.b(j.a.f34734k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                jVar.b(j.a.f34730g);
                jVar.b(j.a.f34736m);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        @Override // y3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i10 == 4096) {
                    int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.t(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.t(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i10 == 16908346) {
                }
            }
            return false;
        }
    }

    public static final class b {
        public static void a(NestedScrollView nestedScrollView, float f10) {
            try {
                nestedScrollView.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public class c {
        public c() {
        }
    }

    public interface d {
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f1435a;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e(parcel);
                eVar.f1435a = parcel.readInt();
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return x0.a.a(sb, this.f1435a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1435a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private c0 getScrollFeedbackProvider() {
        if (this.f1417g == null) {
            this.f1417g = new c0(this);
        }
        return this.f1417g;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    public final boolean a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f1413c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(c(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
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

    @Override // y3.s
    public final void b(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        m(i13, i14, iArr);
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i10;
        if (this.f1414d.isFinished()) {
            return;
        }
        this.f1414d.computeScrollOffset();
        int currY = this.f1414d.getCurrY();
        int i11 = currY - this.f1433z;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1415e;
        EdgeEffect edgeEffect2 = this.f1416f;
        if (i11 <= 0 || c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            if (i11 < 0 && c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                float f10 = height;
                iRound = Math.round(c4.b.b(edgeEffect2, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect2.finish();
                }
            }
            int i12 = i11;
            this.f1433z = currY;
            int[] iArr = this.f1431x;
            iArr[1] = 0;
            this.C.c(0, iArr, i12, 1, null);
            i10 = i12 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f1414d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                o(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                this.C.d(0, this.f1430w, scrollY2, 0, i13, iArr, 1);
                i10 = i13 - iArr[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f1414d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1414d.getCurrVelocity());
                    }
                }
                this.f1414d.abortAnimation();
                v(1);
            }
            if (this.f1414d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                v(1);
                return;
            }
        }
        iRound = Math.round(c4.b.b(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect.finish();
        }
        i11 -= iRound;
        int i122 = i11;
        this.f1433z = currY;
        int[] iArr2 = this.f1431x;
        iArr2[1] = 0;
        this.C.c(0, iArr2, i122, 1, null);
        i10 = i122 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i10 != 0) {
        }
        if (i10 != 0) {
        }
        if (this.f1414d.isFinished()) {
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

    public final void d(int i10) {
        if (getChildCount() > 0) {
            this.f1414d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, 0, 0);
            this.C.g(2, 1);
            this.f1433z = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f1414d.getCurrVelocity()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f1413c.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zJ = false;
                        if (!zJ) {
                            return false;
                        }
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zJ = keyEvent.isAltPressed() ? j(33) : a(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                p(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zJ = j(33);
                            } else if (keyCode == 93) {
                                zJ = j(130);
                            } else if (keyCode == 122) {
                                p(33);
                            } else if (keyCode == 123) {
                                p(130);
                            }
                            zJ = false;
                        } else {
                            zJ = keyEvent.isAltPressed() ? j(130) : a(130);
                        }
                        if (!zJ) {
                        }
                    }
                } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                        zJ = true;
                    }
                    if (!zJ) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.C.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.C.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.C.c(i10, iArr, i11, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.C.d(i10, iArr, i11, i12, i13, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1415e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1416f;
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
        canvas.rotate(180.0f, width2, CropImageView.DEFAULT_ASPECT_RATIO);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // y3.r
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        m(i13, i14, null);
    }

    @Override // y3.r
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // y3.r
    public final void g(View view, View view2, int i10, int i11) {
        t tVar = this.B;
        if (i11 == 1) {
            tVar.f33894b = i10;
        } else {
            tVar.f33893a = i10;
        }
        this.C.g(2, i11);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
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
        t tVar = this.B;
        return tVar.f33894b | tVar.f33893a;
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
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.D == CropImageView.DEFAULT_ASPECT_RATIO) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.D;
    }

    @Override // y3.r
    public final void h(View view, int i10) {
        t tVar = this.B;
        if (i10 == 1) {
            tVar.f33894b = 0;
        } else {
            tVar.f33893a = 0;
        }
        v(i10);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.C.f(0);
    }

    @Override // y3.r
    public final void i(int i10, int i11, int[] iArr, int i12) {
        this.C.c(i10, iArr, i11, i12, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.C.f33883d;
    }

    public final boolean j(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1413c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i10, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i10, int i11) {
        Rect rect = this.f1413c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void m(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.d(0, null, scrollY2, 0, i10 - scrollY2, iArr, i11);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1429v) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1418h = (int) motionEvent.getY(i10);
            this.f1429v = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1423n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 > i13) {
            i15 = i13;
        } else {
            if (i16 >= 0) {
                i15 = i16;
                z11 = false;
                if (z11 && !this.C.f(1)) {
                    this.f1414d.springBack(i14, i15, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i14, i15);
                return !z10 || z11;
            }
            i15 = 0;
        }
        z11 = true;
        if (z11) {
            this.f1414d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1420k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        int width;
        int i11;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z10;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f11;
        long j10;
        float f12;
        float fSqrt;
        int i12;
        NestedScrollView nestedScrollView3;
        float f13;
        if (motionEvent.getAction() != 8 || this.f1422m) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i10 = 9;
            f10 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f10 = axisValue2;
            i10 = 26;
        } else {
            f10 = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f10)), i10, motionEvent, width, 1, (motionEvent.getSource() & ItemType.STRING_DATA_ITEM) == 8194);
        if (i10 != 0) {
            y3.e eVar = this.E;
            NestedScrollView nestedScrollView4 = NestedScrollView.this;
            int[] iArr = eVar.f33815h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i13 = 1;
            if (eVar.f33813f == source && eVar.f33814g == deviceId && eVar.f33812e == i10) {
                z10 = false;
                i11 = 0;
            } else {
                Context context = eVar.f33808a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i11 = 0;
                int source2 = motionEvent.getSource();
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    scaledMinimumFlingVelocity = r0.b(viewConfiguration, deviceId2, i10, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i10, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
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
                if (i14 >= 34) {
                    scaledMaximumFlingVelocity = r0.a(viewConfiguration, deviceId3, i10, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                eVar.f33813f = source;
                eVar.f33814g = deviceId;
                eVar.f33812e = i10;
                z10 = true;
            }
            if (iArr[i11] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = eVar.f33810c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                eVar.f33810c = null;
                return true;
            }
            if (eVar.f33810c == null) {
                eVar.f33810c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = eVar.f33810c;
            Map<VelocityTracker, o0> map = n0.f33874a;
            velocityTracker2.addMovement(motionEvent);
            int i15 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map<VelocityTracker, o0> map2 = n0.f33874a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new o0());
                }
                o0 o0Var = map2.get(velocityTracker2);
                long[] jArr = o0Var.f33876b;
                long eventTime = motionEvent.getEventTime();
                if (o0Var.f33878d != 0 && eventTime - jArr[o0Var.f33879e] > 40) {
                    o0Var.f33878d = i11;
                    o0Var.f33877c = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                int i16 = (o0Var.f33879e + 1) % 20;
                o0Var.f33879e = i16;
                int i17 = o0Var.f33878d;
                if (i17 != 20) {
                    o0Var.f33878d = i17 + 1;
                }
                o0Var.f33875a[i16] = motionEvent.getAxisValue(26);
                jArr[o0Var.f33879e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, Float.MAX_VALUE);
            o0 o0Var2 = n0.f33874a.get(velocityTracker2);
            if (o0Var2 != null) {
                float[] fArr = o0Var2.f33875a;
                long[] jArr2 = o0Var2.f33876b;
                int i18 = o0Var2.f33878d;
                if (i18 < 2) {
                    nestedScrollView = nestedScrollView4;
                    f12 = Float.MAX_VALUE;
                    i12 = 1000;
                    fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
                    f13 = fSqrt * i12;
                    o0Var2.f33877c = f13;
                    if (f13 >= (-Math.abs(f12))) {
                        o0Var2.f33877c = -Math.abs(f12);
                    } else if (o0Var2.f33877c > Math.abs(f12)) {
                        o0Var2.f33877c = Math.abs(f12);
                    }
                } else {
                    int i19 = o0Var2.f33879e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long j11 = jArr2[i19];
                    while (true) {
                        j10 = jArr2[i20];
                        if (j11 - j10 <= 100) {
                            break;
                        }
                        o0Var2.f33878d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = o0Var2.f33878d;
                    if (i21 >= 2) {
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j10 != jArr2[i22]) {
                                nestedScrollView = nestedScrollView4;
                                f12 = Float.MAX_VALUE;
                                i12 = 1000;
                                fSqrt = fArr[i22] / (r11 - j10);
                            }
                        } else {
                            f12 = Float.MAX_VALUE;
                            float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= o0Var2.f33878d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j12 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % i15;
                                if (jArr2[i26] == j12) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i24++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float fSqrt2 = (f14 < CropImageView.DEFAULT_ASPECT_RATIO ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                                    float f15 = fArr[i26] / (jArr2[i26] - j12);
                                    float fAbs = (Math.abs(f15) * (f15 - fSqrt2)) + f14;
                                    if (i24 == i13) {
                                        fAbs *= 0.5f;
                                    }
                                    f14 = fAbs;
                                }
                                i23++;
                                nestedScrollView4 = nestedScrollView3;
                                i15 = 20;
                                i13 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            fSqrt = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * (f14 < CropImageView.DEFAULT_ASPECT_RATIO ? -1.0f : 1.0f);
                            i12 = DescriptorProtos.Edition.EDITION_2023_VALUE;
                        }
                        f13 = fSqrt * i12;
                        o0Var2.f33877c = f13;
                        if (f13 >= (-Math.abs(f12))) {
                        }
                    }
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = n0.a.a(velocityTracker2, i10);
            } else if (i10 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i10 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                o0 o0Var3 = n0.f33874a.get(velocityTracker2);
                yVelocity = (o0Var3 == null || i10 != 26) ? CropImageView.DEFAULT_ASPECT_RATIO : o0Var3.f33877c;
            }
            float f16 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f16);
            if (z10 || !(fSignum == Math.signum(eVar.f33811d) || fSignum == CropImageView.DEFAULT_ASPECT_RATIO)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f1414d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f16) >= iArr[0]) {
                float fMax = Math.max(-r3, Math.min(f16, iArr[1]));
                if (fMax == CropImageView.DEFAULT_ASPECT_RATIO) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView2.f1414d.abortAnimation();
                    nestedScrollView2.d((int) fMax);
                    f11 = fMax;
                }
                eVar.f33811d = f11;
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
        boolean z10 = true;
        if (action == 2 && this.f1422m) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    if (!u(motionEvent) && this.f1414d.isFinished()) {
                        z10 = false;
                    }
                    this.f1422m = z10;
                    VelocityTracker velocityTracker = this.f1423n;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1423n = null;
                    }
                } else {
                    this.f1418h = y10;
                    this.f1429v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1423n;
                    if (velocityTracker2 == null) {
                        this.f1423n = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1423n.addMovement(motionEvent);
                    this.f1414d.computeScrollOffset();
                    if (!u(motionEvent) && this.f1414d.isFinished()) {
                        z10 = false;
                    }
                    this.f1422m = z10;
                    this.C.g(2, 0);
                }
            }
        } else if (i10 == 1) {
            this.f1422m = false;
            this.f1429v = -1;
            VelocityTracker velocityTracker3 = this.f1423n;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1423n = null;
            }
            if (this.f1414d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else if (i10 == 2) {
            int i11 = this.f1429v;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f1418h) > this.f1426r && (2 & getNestedScrollAxes()) == 0) {
                        this.f1422m = true;
                        this.f1418h = y11;
                        if (this.f1423n == null) {
                            this.f1423n = VelocityTracker.obtain();
                        }
                        this.f1423n.addMovement(motionEvent);
                        this.f1432y = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 != 3) {
            if (i10 == 6) {
                n(motionEvent);
            }
        }
        return this.f1422m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1419j = false;
        View view = this.f1421l;
        if (view != null && k(view, this)) {
            View view2 = this.f1421l;
            Rect rect = this.f1413c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iC = c(rect);
            if (iC != 0) {
                scrollBy(0, iC);
            }
        }
        this.f1421l = null;
        if (!this.f1420k) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f1435a);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1420k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1424p && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(CropImageView.DEFAULT_ASPECT_RATIO, f11, true);
        d((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.C.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.C.c(i10, iArr, i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        g(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
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
        this.A = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f1435a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f1413c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iC = c(rect);
        if (iC != 0) {
            if (this.f1425q) {
                t(0, iC, false);
            } else {
                scrollBy(0, iC);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
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
        int i10;
        ViewParent parent2;
        if (this.f1423n == null) {
            this.f1423n = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1432y = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = this.f1432y;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        motionEventObtain.offsetLocation(CropImageView.DEFAULT_ASPECT_RATIO, f10);
        q qVar = this.C;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1415e;
            EdgeEffect edgeEffect2 = this.f1416f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1423n;
                velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, this.f1428t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1429v);
                if (Math.abs(yVelocity) >= this.f1427s) {
                    if (c4.b.a(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        int i11 = -yVelocity;
                        if (s(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            d(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f12 = i12;
                        if (!qVar.b(CropImageView.DEFAULT_ASPECT_RATIO, f12)) {
                            dispatchNestedFling(CropImageView.DEFAULT_ASPECT_RATIO, f12, true);
                            d(i12);
                        }
                    }
                } else if (this.f1414d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1429v = -1;
                this.f1422m = false;
                VelocityTracker velocityTracker2 = this.f1423n;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1423n = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1429v);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1429v + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f1418h - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (c4.b.a(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        fB = -c4.b.b(edgeEffect, -height, x10);
                        if (c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                            fB = c4.b.b(edgeEffect2, height, 1.0f - x10);
                            if (c4.b.a(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
                                edgeEffect2.onRelease();
                            }
                        }
                        iRound = Math.round(f11 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.f1422m && Math.abs(i10) > this.f1426r) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1422m = true;
                            i10 = i10 <= 0 ? i10 - this.f1426r : i10 + this.f1426r;
                        }
                        if (this.f1422m) {
                            int iR = r(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f1418h = y10 - iR;
                            this.f1432y += iR;
                        }
                    }
                    f11 = fB;
                    iRound = Math.round(f11 * getHeight());
                    if (iRound != 0) {
                    }
                    i10 = i13 - iRound;
                    if (!this.f1422m) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f1422m = true;
                        if (i10 <= 0) {
                        }
                    }
                    if (this.f1422m) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1422m && getChildCount() > 0) {
                    if (this.f1414d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f1429v = -1;
                this.f1422m = false;
                VelocityTracker velocityTracker3 = this.f1423n;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1423n = null;
                }
                v(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1418h = (int) motionEvent.getY(actionIndex);
                this.f1429v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1418h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1429v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1422m && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1414d.isFinished()) {
                this.f1414d.abortAnimation();
                v(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1418h = y11;
            this.f1429v = pointerId;
            qVar.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1423n;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1413c;
        if (z10) {
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
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        q(i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            r(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        q qVar = this.C;
        if (i13 == 1) {
            qVar.g(2, i13);
        }
        boolean zC = this.C.c(0, this.f1431x, i10, i13, this.f1430w);
        int[] iArr = this.f1430w;
        int[] iArr2 = this.f1431x;
        if (zC) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = o(i14, 0, scrollY, scrollRange) && !qVar.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f33803a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        this.C.d(0, this.f1430w, scrollY2, 0, i14 - scrollY2, iArr2, i13);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f1416f;
        EdgeEffect edgeEffect2 = this.f1415e;
        if (i18 >= 0) {
            if (i18 > scrollRange && z13) {
                c4.b.b(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
                if (motionEvent != null) {
                    z11 = false;
                    getScrollFeedbackProvider().f33803a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
                } else {
                    z11 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.f1423n) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                v(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (z13) {
            c4.b.b(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f33803a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z12 = z11;
        }
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
        }
        return i16;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1419j) {
            this.f1421l = view2;
        } else {
            Rect rect = this.f1413c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iC = c(rect);
            if (iC != 0) {
                scrollBy(0, iC);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iC = c(rect);
        boolean z11 = iC != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iC);
                return z11;
            }
            t(0, iC, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f1423n) != null) {
            velocityTracker.recycle();
            this.f1423n = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1419j = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fA = c4.b.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1411a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = F;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fA;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1424p) {
            this.f1424p = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        q qVar = this.C;
        if (qVar.f33883d) {
            ViewGroup viewGroup = qVar.f33882c;
            Field field = q0.f33885a;
            viewGroup.stopNestedScroll();
        }
        qVar.f33883d = z10;
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1425q = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.C.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1412b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1414d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z10) {
                this.C.g(2, 1);
            } else {
                v(1);
            }
            this.f1433z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1414d.isFinished()) {
                this.f1414d.abortAnimation();
                v(1);
            }
            scrollBy(i10, i11);
        }
        this.f1412b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1415e;
        if (c4.b.a(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
            c4.b.b(edgeEffect, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1416f;
        if (c4.b.a(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return z10;
        }
        c4.b.b(edgeEffect2, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void v(int i10) {
        this.C.h(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.basitce.htmltoapk.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i10);
        this.f1413c = new Rect();
        this.f1419j = true;
        this.f1420k = false;
        this.f1421l = null;
        this.f1422m = false;
        this.f1425q = true;
        this.f1429v = -1;
        this.f1430w = new int[2];
        this.f1431x = new int[2];
        this.E = new y3.e(getContext(), new c());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = b.a.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1415e = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = b.a.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1416f = edgeEffect2;
        this.f1411a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1414d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1426r = viewConfiguration.getScaledTouchSlop();
        this.f1427s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1428t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.B = new t();
        this.C = new q(this);
        setNestedScrollingEnabled(true);
        q0.h(this, G);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
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
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
