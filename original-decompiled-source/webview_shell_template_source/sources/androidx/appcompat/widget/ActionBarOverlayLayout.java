package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import com.htmltoapk.template.R;
import g.s;
import j.g;
import java.util.WeakHashMap;
import l.f0;
import l.g0;
import u0.f0;
import u0.n0;
import u0.o;
import u0.p;
import u0.q;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements f0, o, p {
    public static final int[] U = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final s0 V;
    public static final Rect W;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public s0 I;
    public s0 J;
    public s0 K;
    public s0 L;
    public d M;
    public OverScroller N;
    public ViewPropertyAnimator O;
    public final a P;
    public final b Q;
    public final c R;
    public final q S;
    public final f T;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f245t;

    /* renamed from: u, reason: collision with root package name */
    public ContentFrameLayout f246u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContainer f247v;

    /* renamed from: w, reason: collision with root package name */
    public g0 f248w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f249x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f250y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f251z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.B = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.B = false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.O = actionBarOverlayLayout.f247v.animate().translationY(0.0f).setListener(actionBarOverlayLayout.P);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.O = actionBarOverlayLayout.f247v.animate().translationY(-actionBarOverlayLayout.f247v.getHeight()).setListener(actionBarOverlayLayout.P);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e extends ViewGroup.MarginLayoutParams {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        s0.e dVar = i6 >= 34 ? new s0.d() : i6 >= 30 ? new s0.c() : i6 >= 29 ? new s0.b() : new s0.a();
        dVar.g(m0.b.c(0, 1, 0, 1));
        V = dVar.b();
        W = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245t = 0;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s0 s0Var = s0.f14552b;
        this.I = s0Var;
        this.J = s0Var;
        this.K = s0Var;
        this.L = s0Var;
        this.P = new a();
        this.Q = new b();
        this.R = new c();
        l(context);
        this.S = new q();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.T = fVar;
        addView(fVar);
    }

    public static boolean j(View view, Rect rect, boolean z6) {
        boolean z7;
        e eVar = (e) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i7 = rect.left;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i7;
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i9 = rect.top;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i9;
            z7 = true;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i11;
            z7 = true;
        }
        if (z6) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i13 = rect.bottom;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i13;
                return true;
            }
        }
        return z7;
    }

    @Override // l.f0
    public final void a(Menu menu, j.a aVar) {
        m();
        this.f248w.a(menu, aVar);
    }

    @Override // l.f0
    public final boolean b() {
        m();
        return this.f248w.b();
    }

    @Override // l.f0
    public final void c() {
        m();
        this.f248w.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // l.f0
    public final boolean d() {
        m();
        return this.f248w.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f249x != null) {
            if (this.f247v.getVisibility() == 0) {
                translationY = (int) (this.f247v.getTranslationY() + this.f247v.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f249x.setBounds(0, translationY, getWidth(), this.f249x.getIntrinsicHeight() + translationY);
            this.f249x.draw(canvas);
        }
    }

    @Override // l.f0
    public final boolean e() {
        m();
        return this.f248w.e();
    }

    @Override // l.f0
    public final boolean f() {
        m();
        return this.f248w.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // l.f0
    public final boolean g() {
        m();
        return this.f248w.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f247v;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.S;
        return qVar.f14523b | qVar.f14522a;
    }

    public CharSequence getTitle() {
        m();
        return this.f248w.getTitle();
    }

    @Override // l.f0
    public final void h(int i6) {
        m();
        if (i6 == 2) {
            this.f248w.p();
        } else if (i6 == 5) {
            this.f248w.q();
        } else {
            if (i6 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // l.f0
    public final void i() {
        m();
        this.f248w.h();
    }

    public final void k() {
        removeCallbacks(this.Q);
        removeCallbacks(this.R);
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(U);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f249x = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.N = new OverScroller(context);
    }

    public final void m() {
        g0 wrapper;
        if (this.f246u == null) {
            this.f246u = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f247v = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof g0) {
                wrapper = (g0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f248w = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        s0 s0VarG = s0.g(this, windowInsets);
        boolean zJ = j(this.f247v, new Rect(s0VarG.b(), s0VarG.d(), s0VarG.c(), s0VarG.a()), false);
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        Rect rect = this.E;
        f0.d.b(this, s0VarG, rect);
        int i6 = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        s0.l lVar = s0VarG.f14553a;
        s0 s0VarM = lVar.m(i6, i7, i8, i9);
        this.I = s0VarM;
        boolean z6 = true;
        if (!this.J.equals(s0VarM)) {
            this.J = this.I;
            zJ = true;
        }
        Rect rect2 = this.F;
        if (rect2.equals(rect)) {
            z6 = zJ;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return lVar.a().f14553a.c().f14553a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        f0.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i7) {
        int measuredHeight;
        m();
        measureChildWithMargins(this.f247v, i6, 0, i7, 0);
        e eVar = (e) this.f247v.getLayoutParams();
        int iMax = Math.max(0, this.f247v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f247v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f247v.getMeasuredState());
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        boolean z6 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z6) {
            measuredHeight = this.s;
            if (this.f251z && this.f247v.getTabContainer() != null) {
                measuredHeight += this.s;
            }
        } else {
            measuredHeight = this.f247v.getVisibility() != 8 ? this.f247v.getMeasuredHeight() : 0;
        }
        Rect rect = this.E;
        Rect rect2 = this.G;
        rect2.set(rect);
        this.K = this.I;
        if (this.f250y || z6) {
            m0.b bVarC = m0.b.c(this.K.b(), this.K.d() + measuredHeight, this.K.c(), this.K.a());
            s0 s0Var = this.K;
            int i8 = Build.VERSION.SDK_INT;
            s0.e dVar = i8 >= 34 ? new s0.d(s0Var) : i8 >= 30 ? new s0.c(s0Var) : i8 >= 29 ? new s0.b(s0Var) : new s0.a(s0Var);
            dVar.g(bVarC);
            this.K = dVar.b();
        } else {
            f fVar = this.T;
            s0 s0Var2 = V;
            Rect rect3 = this.H;
            f0.d.b(fVar, s0Var2, rect3);
            if (!rect3.equals(W)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.K = this.K.f14553a.m(0, measuredHeight, 0, 0);
            }
        }
        j(this.f246u, rect2, true);
        if (!this.L.equals(this.K)) {
            s0 s0Var3 = this.K;
            this.L = s0Var3;
            u0.f0.b(this.f246u, s0Var3);
        }
        measureChildWithMargins(this.f246u, i6, 0, i7, 0);
        e eVar2 = (e) this.f246u.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f246u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f246u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f246u.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i6, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i7, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        if (!this.A || !z6) {
            return false;
        }
        this.N.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.N.getFinalY() > this.f247v.getHeight()) {
            k();
            this.R.run();
        } else {
            k();
            this.Q.run();
        }
        this.B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
    }

    @Override // u0.p
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        onNestedScroll(view, i6, i7, i8, i9, i10);
    }

    @Override // u0.o
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // u0.o
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i6);
    }

    @Override // u0.o
    public final void onStopNestedScroll(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i6) {
        super.onWindowSystemUiVisibilityChanged(i6);
        m();
        int i7 = this.D ^ i6;
        this.D = i6;
        boolean z6 = (i6 & 4) == 0;
        boolean z7 = (i6 & 256) != 0;
        d dVar = this.M;
        if (dVar != null) {
            s sVar = (s) dVar;
            sVar.f13187o = !z7;
            if (z6 || !z7) {
                if (sVar.f13188p) {
                    sVar.f13188p = false;
                    sVar.g(true);
                }
            } else if (!sVar.f13188p) {
                sVar.f13188p = true;
                sVar.g(true);
            }
        }
        if ((i7 & 256) == 0 || this.M == null) {
            return;
        }
        WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
        f0.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f245t = i6;
        d dVar = this.M;
        if (dVar != null) {
            ((s) dVar).f13186n = i6;
        }
    }

    public void setActionBarHideOffset(int i6) {
        k();
        this.f247v.setTranslationY(-Math.max(0, Math.min(i6, this.f247v.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.M = dVar;
        if (getWindowToken() != null) {
            ((s) this.M).f13186n = this.f245t;
            int i6 = this.D;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
                f0.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f251z = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.A) {
            this.A = z6;
            if (z6) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i6) {
        m();
        this.f248w.setIcon(i6);
    }

    public void setLogo(int i6) {
        m();
        this.f248w.l(i6);
    }

    public void setOverlayMode(boolean z6) {
        this.f250y = z6;
    }

    @Override // l.f0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f248w.setWindowCallback(callback);
    }

    @Override // l.f0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f248w.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // u0.o
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8) {
    }

    @Override // u0.o
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i6, i7, i8, i9);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        s sVar;
        g gVar;
        this.S.f14522a = i6;
        this.C = getActionBarHideOffset();
        k();
        d dVar = this.M;
        if (dVar == null || (gVar = (sVar = (s) dVar).s) == null) {
            return;
        }
        gVar.a();
        sVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) == 0 || this.f247v.getVisibility() != 0) {
            return false;
        }
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.A || this.B) {
            return;
        }
        if (this.C <= this.f247v.getHeight()) {
            k();
            postDelayed(this.Q, 600L);
        } else {
            k();
            postDelayed(this.R, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        int i10 = this.C + i7;
        this.C = i10;
        setActionBarHideOffset(i10);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f248w.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i6) {
    }
}
