package j2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.basitce.htmltoapk.R;
import java.lang.ref.WeakReference;
import x0.k2;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<x0.s> f14632a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f14633b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.platform.i f14634c;

    /* renamed from: d, reason: collision with root package name */
    public x0.s f14635d;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<pg.f0> f14636e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14637f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14638g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14639h;

    /* renamed from: j2.a$a, reason: collision with other inner class name */
    public static final class C0141a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {
        public C0141a() {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                a.this.a(0, jVar2);
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [j2.g5, java.lang.Object] */
    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        i5 i5Var = new i5(this);
        addOnAttachStateChangeListener(i5Var);
        ?? r02 = new p4.b() { // from class: j2.g5
            @Override // p4.b
            public final void a() {
                this.f14727a.e();
            }
        };
        p4.a.b(this).f21187a.add(r02);
        this.f14636e = new h5(this, i5Var, r02);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(x0.s sVar) {
        if (this.f14635d != sVar) {
            this.f14635d = sVar;
            if (sVar != null) {
                this.f14632a = null;
            }
            androidx.compose.ui.platform.i iVar = this.f14634c;
            if (iVar != null) {
                iVar.a();
                this.f14634c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f14633b != iBinder) {
            this.f14633b = iBinder;
            this.f14632a = null;
        }
    }

    public abstract void a(int i10, x0.j jVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f14638g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f14635d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        androidx.compose.ui.platform.i iVar = this.f14634c;
        if (iVar != null) {
            iVar.a();
        }
        this.f14634c = null;
        requestLayout();
    }

    public final void f() {
        if (this.f14634c == null) {
            try {
                this.f14638g = true;
                this.f14634c = b6.a(this, i(), new f1.b(-656146368, true, new C0141a()));
            } finally {
                this.f14638g = false;
            }
        }
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f14634c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f14637f;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final x0.s i() {
        x0.k2 k2VarA;
        x0.s sVarB = this.f14635d;
        if (sVarB == null) {
            sVarB = a6.b(this);
            if (sVarB == null) {
                for (ViewParent parent = getParent(); sVarB == null && (parent instanceof View); parent = parent.getParent()) {
                    sVarB = a6.b((View) parent);
                }
            }
            if (sVarB != null) {
                x0.s sVar = (!(sVarB instanceof x0.k2) || ((k2.d) ((x0.k2) sVarB).f31783t.getValue()).compareTo(k2.d.f31789b) > 0) ? sVarB : null;
                if (sVar != null) {
                    this.f14632a = new WeakReference<>(sVar);
                }
            } else {
                sVarB = null;
            }
            if (sVarB == null) {
                WeakReference<x0.s> weakReference = this.f14632a;
                if (weakReference == null || (sVarB = weakReference.get()) == null || ((sVarB instanceof x0.k2) && ((k2.d) ((x0.k2) sVarB).f31783t.getValue()).compareTo(k2.d.f31789b) <= 0)) {
                    sVarB = null;
                }
                if (sVarB == null) {
                    if (!isAttachedToWindow()) {
                        f2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    x0.s sVarB2 = a6.b(view);
                    if (sVarB2 == null) {
                        k2VarA = v5.f14934a.get().a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, k2VarA);
                        Handler handler = view.getHandler();
                        int i10 = qh.h.f22763a;
                        view.addOnAttachStateChangeListener(new t5(ph.h.c(ph.l1.f21562a, new qh.f(handler, "windowRecomposer cleanup", false).f22762f, null, new u5(k2VarA, view, null), 2)));
                    } else {
                        if (!(sVarB2 instanceof x0.k2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        k2VarA = (x0.k2) sVarB2;
                    }
                    x0.k2 k2Var = ((k2.d) k2VarA.f31783t.getValue()).compareTo(k2.d.f31789b) > 0 ? k2VarA : null;
                    if (k2Var != null) {
                        this.f14632a = new WeakReference<>(k2Var);
                    }
                    return k2VarA;
                }
            }
        }
        return sVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f14639h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(x0.s sVar) {
        setParentContext(sVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f14637f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((i2.v1) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f14639h = true;
    }

    public final void setViewCompositionStrategy(j5 j5Var) {
        eh.a<pg.f0> aVar = this.f14636e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f14636e = j5Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }
}
