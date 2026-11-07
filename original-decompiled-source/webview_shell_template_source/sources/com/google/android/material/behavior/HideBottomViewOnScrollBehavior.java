package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.htmltoapk.template.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.b;
import z3.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<a> f11999a;

    /* renamed from: b, reason: collision with root package name */
    public int f12000b;

    /* renamed from: c, reason: collision with root package name */
    public int f12001c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f12002d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f12003e;

    /* renamed from: f, reason: collision with root package name */
    public int f12004f;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f12005g;
    public z3.a h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12006i;

    /* renamed from: j, reason: collision with root package name */
    public int f12007j;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f12008k;

    /* renamed from: l, reason: collision with root package name */
    public int f12009l;

    /* renamed from: m, reason: collision with root package name */
    public int f12010m;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f11999a = new LinkedHashSet<>();
        this.f12004f = 0;
        this.f12006i = true;
        this.f12007j = 2;
        this.f12009l = 0;
        this.f12010m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, z3.a] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, final V v2, int i6) {
        this.f12004f = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        this.f12000b = b.c(v2.getContext(), R.attr.motionDurationLong2, 225);
        this.f12001c = b.c(v2.getContext(), R.attr.motionDurationMedium4, 175);
        this.f12002d = b.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15147d);
        this.f12003e = b.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15146c);
        if (this.f12005g == null) {
            this.f12005g = (AccessibilityManager) v2.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12005g;
        if (accessibilityManager == 0 || this.h != null) {
            return false;
        }
        ?? r42 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: z3.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                if (z6) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.f15434a;
                    if (hideBottomViewOnScrollBehavior.f12007j == 1) {
                        hideBottomViewOnScrollBehavior.s(v2);
                    }
                }
            }
        };
        this.h = r42;
        accessibilityManager.addTouchExplorationStateChangeListener(r42);
        v2.addOnAttachStateChangeListener(new z3.b(this));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i6 <= 0) {
            if (i6 < 0) {
                s(view);
            }
        } else {
            if (this.f12007j == 1) {
                return;
            }
            if (this.f12006i && (accessibilityManager = this.f12005g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f12008k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            t(view, 1);
            this.f12008k = view.animate().translationY(this.f12004f).setInterpolator(this.f12003e).setDuration(this.f12001c).setListener(new c(this, view));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
        return i6 == 2;
    }

    public final void s(V v2) {
        if (this.f12007j == 2) {
            return;
        }
        t(v2, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f12008k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f12008k = v2.animate().translationY(0).setInterpolator(this.f12002d).setDuration(this.f12000b).setListener(new c(this, v2));
    }

    public final void t(V v2, int i6) {
        this.f12007j = i6;
        if (i6 == 1) {
            if (v2.hasFocus()) {
                v2.clearFocus();
            }
            if (v2.getImportantForAccessibility() != 4) {
                this.f12009l = v2.getImportantForAccessibility();
            }
            if (v2.getVisibility() != 4) {
                this.f12010m = v2.getVisibility();
            }
            v2.setImportantForAccessibility(4);
        } else if (i6 == 2) {
            if (v2.getImportantForAccessibility() == 4) {
                v2.setImportantForAccessibility(this.f12009l);
            }
            if (v2.getVisibility() == 4) {
                v2.setVisibility(this.f12010m);
            }
        }
        Iterator<a> it = this.f11999a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11999a = new LinkedHashSet<>();
        this.f12004f = 0;
        this.f12006i = true;
        this.f12007j = 2;
        this.f12009l = 0;
        this.f12010m = 0;
    }
}
