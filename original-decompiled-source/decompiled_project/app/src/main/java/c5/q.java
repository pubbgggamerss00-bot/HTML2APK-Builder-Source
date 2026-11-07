package c5;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import y3.i1;
import y3.q0;

/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4973a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4974b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attrs, b0 b0Var) {
        super(context, attrs);
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(attrs, "attrs");
        this.f4973a = new ArrayList();
        this.f4974b = new ArrayList();
        this.f4976d = true;
        String classAttribute = attrs.getClassAttribute();
        int i10 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, b5.a.f3575b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        h hVarA = b0Var.A(id2);
        if (classAttribute != null && hVarA == null) {
            if (id2 == -1) {
                throw new IllegalStateException(i8.n.d("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            s sVarD = b0Var.D();
            context.getClassLoader();
            h hVarA2 = sVarD.a(classAttribute);
            kotlin.jvm.internal.r.d(hVarA2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            hVarA2.F = true;
            t<?> tVar = hVarA2.f4890v;
            if ((tVar == null ? null : tVar.f4979a) != null) {
                hVarA2.F = true;
            }
            a aVar = new a(b0Var);
            aVar.f4933o = true;
            hVarA2.G = this;
            aVar.e(getId(), hVarA2, string);
            if (aVar.f4925g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            b0 b0Var2 = aVar.f4760p;
            if (b0Var2.f4798u != null && !b0Var2.H) {
                b0Var2.x(true);
                aVar.a(b0Var2.J, b0Var2.K);
                b0Var2.f4779b = true;
                try {
                    b0Var2.Q(b0Var2.J, b0Var2.K);
                    b0Var2.d();
                    b0Var2.b0();
                    b0Var2.u();
                    b0Var2.f4780c.f4915b.values().removeAll(Collections.singleton(null));
                } catch (Throwable th2) {
                    b0Var2.d();
                    throw th2;
                }
            }
        }
        ArrayList arrayListD = b0Var.f4780c.d();
        int size = arrayListD.size();
        while (i10 < size) {
            Object obj = arrayListD.get(i10);
            i10++;
            int i11 = ((h0) obj).f4910c.f4894z;
            getId();
        }
    }

    public final void a(View view) {
        if (this.f4974b.contains(view)) {
            this.f4973a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.r.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof h ? (h) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        i1 i1VarC;
        kotlin.jvm.internal.r.e(insets, "insets");
        i1 i1VarC2 = i1.c(insets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4975c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.r.b(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.r.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            i1VarC = i1.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            Field field = q0.f33885a;
            WindowInsets windowInsetsB = i1VarC2.b();
            if (windowInsetsB != null) {
                onApplyWindowInsets(windowInsetsB);
                if (!windowInsetsB.equals(windowInsetsB)) {
                    i1VarC2 = i1.c(windowInsetsB, this);
                }
            }
            i1VarC = i1VarC2;
        }
        if (!i1VarC.f33825a.s()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Field field2 = q0.f33885a;
                WindowInsets windowInsetsB2 = i1VarC.b();
                if (windowInsetsB2 != null) {
                    WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? q0.h.a(childAt, windowInsetsB2) : q0.b.a(childAt, windowInsetsB2);
                    if (!windowInsetsA.equals(windowInsetsB2)) {
                        i1.c(windowInsetsA, childAt);
                    }
                }
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.r.e(canvas, "canvas");
        if (this.f4976d) {
            ArrayList arrayList = this.f4973a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.r.e(canvas, "canvas");
        kotlin.jvm.internal.r.e(child, "child");
        if (this.f4976d) {
            ArrayList arrayList = this.f4973a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.r.e(view, "view");
        this.f4974b.remove(view);
        if (this.f4973a.remove(view)) {
            this.f4976d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends h> F getFragment() {
        n nVar;
        h hVar;
        b0 b0VarG;
        View view = this;
        while (true) {
            nVar = null;
            if (view == null) {
                hVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            hVar = tag instanceof h ? (h) tag : null;
            if (hVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (hVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof n) {
                    nVar = (n) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (nVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            b0VarG = nVar.f4962a.f4977a.f4982d;
        } else {
            if (hVar.f4890v == null || !hVar.f4882l) {
                throw new IllegalStateException("The Fragment " + hVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            b0VarG = hVar.g();
        }
        return (F) b0VarG.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.r.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.r.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.r.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.r.d(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.r.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.r.d(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.r.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f4976d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.r.e(listener, "listener");
        this.f4975c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.r.e(view, "view");
        if (view.getParent() == this) {
            this.f4974b.add(view);
        }
        super.startViewTransition(view);
    }
}
