package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.v0;
import com.google.android.gms.ads.RequestConfiguration;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1055t;

    /* renamed from: u, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1056u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1057v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        kotlin.jvm.internal.j.e("context", context);
        this.s = new ArrayList();
        this.f1055t = new ArrayList();
        this.f1057v = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.f13274b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1055t.contains(view)) {
            this.s.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof k ? (k) tag : null) != null) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        s0 s0VarG;
        kotlin.jvm.internal.j.e("insets", windowInsets);
        s0 s0VarG2 = s0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1056u;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            kotlin.jvm.internal.j.d("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", windowInsetsOnApplyWindowInsets);
            s0VarG = s0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            WindowInsets windowInsetsF = s0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = f0.c.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    s0VarG2 = s0.g(this, windowInsetsB);
                }
            }
            s0VarG = s0VarG2;
        }
        if (!s0VarG.f14553a.n()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                u0.f0.b(getChildAt(i6), s0VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e("canvas", canvas);
        if (this.f1057v) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        kotlin.jvm.internal.j.e("canvas", canvas);
        kotlin.jvm.internal.j.e("child", view);
        if (this.f1057v) {
            ArrayList arrayList = this.s;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.j.e("view", view);
        this.f1055t.remove(view);
        if (this.s.remove(view)) {
            this.f1057v = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends k> F getFragment() {
        FragmentActivity fragmentActivity;
        k kVar;
        y yVarC;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                kVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            kVar = tag instanceof k ? (k) tag : null;
            if (kVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (kVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            yVarC = fragmentActivity.s.f1220a.f1224v;
        } else {
            if (kVar.K == null || !kVar.C) {
                throw new IllegalStateException("The Fragment " + kVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            yVarC = kVar.c();
        }
        return (F) yVarC.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        kotlin.jvm.internal.j.e("insets", windowInsets);
        return windowInsets;
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
                View childAt = getChildAt(childCount);
                kotlin.jvm.internal.j.d("view", childAt);
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.j.e("view", view);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i6) {
        View childAt = getChildAt(i6);
        kotlin.jvm.internal.j.d("view", childAt);
        a(childAt);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.j.e("view", view);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            kotlin.jvm.internal.j.d("view", childAt);
            a(childAt);
        }
        super.removeViews(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            kotlin.jvm.internal.j.d("view", childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i6, i7);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f1057v = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        kotlin.jvm.internal.j.e("listener", onApplyWindowInsetsListener);
        this.f1056u = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.j.e("view", view);
        if (view.getParent() == this) {
            this.f1055t.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, y yVar) {
        View view;
        super(context, attributeSet);
        kotlin.jvm.internal.j.e("context", context);
        kotlin.jvm.internal.j.e("attrs", attributeSet);
        this.s = new ArrayList();
        this.f1055t = new ArrayList();
        this.f1057v = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i6 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.f13274b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        k kVarB = yVar.B(id);
        if (classAttribute != null && kVarB == null) {
            if (id == -1) {
                throw new IllegalStateException(v0.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
            r rVarE = yVar.E();
            context.getClassLoader();
            k kVarA = rVarE.a(classAttribute);
            kotlin.jvm.internal.j.d("fm.fragmentFactory.insta…ontext.classLoader, name)", kVarA);
            kVarA.U = true;
            s<?> sVar = kVarA.K;
            if ((sVar == null ? null : sVar.s) != null) {
                kVarA.U = true;
            }
            a aVar = new a(yVar);
            aVar.f1122o = true;
            kVarA.V = this;
            aVar.e(getId(), kVarA, string, 1);
            if (!aVar.f1115g) {
                aVar.f1058p.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListE = yVar.f1233c.e();
        int size = arrayListE.size();
        while (i6 < size) {
            Object obj = arrayListE.get(i6);
            i6++;
            e0 e0Var = (e0) obj;
            k kVar = e0Var.f1097c;
            if (kVar.O == getId() && (view = kVar.W) != null && view.getParent() == null) {
                kVar.V = this;
                e0Var.b();
            }
        }
    }
}
