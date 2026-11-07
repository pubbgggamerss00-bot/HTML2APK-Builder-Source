package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.camera2.internal.s0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.htmltoapk.template.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.b;
import z3.d;
import z3.e;
import z3.f;
import z3.g;
import z3.h;
import z3.i;
import z3.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public j f12011a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f12012b;

    /* renamed from: c, reason: collision with root package name */
    public g f12013c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12014d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<a> f12015e;

    /* renamed from: f, reason: collision with root package name */
    public int f12016f;

    /* renamed from: g, reason: collision with root package name */
    public int f12017g;
    public TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f12018i;

    /* renamed from: j, reason: collision with root package name */
    public int f12019j;

    /* renamed from: k, reason: collision with root package name */
    public int f12020k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f12021l;

    /* renamed from: m, reason: collision with root package name */
    public int f12022m;

    /* renamed from: n, reason: collision with root package name */
    public int f12023n;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void a();
    }

    public HideViewOnScrollBehavior() {
        this.f12014d = true;
        this.f12015e = new LinkedHashSet<>();
        this.f12019j = 0;
        this.f12020k = 2;
        this.f12022m = 0;
        this.f12023n = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, z3.g] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, final V v2, int i6) {
        if (this.f12012b == null) {
            this.f12012b = (AccessibilityManager) v2.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12012b;
        if (accessibilityManager != 0 && this.f12013c == null) {
            ?? r02 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: z3.g
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z6) {
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = this.f15438a;
                    if (hideViewOnScrollBehavior.f12014d && z6 && hideViewOnScrollBehavior.f12020k == 1) {
                        hideViewOnScrollBehavior.t(v2);
                    }
                }
            };
            this.f12013c = r02;
            accessibilityManager.addTouchExplorationStateChangeListener(r02);
            v2.addOnAttachStateChangeListener(new h(this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        int i7 = ((CoordinatorLayout.f) v2.getLayoutParams()).f926c;
        if (i7 == 80 || i7 == 81) {
            s(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i7, i6);
            s((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f12019j = this.f12011a.a(v2, marginLayoutParams);
        this.f12016f = b.c(v2.getContext(), R.attr.motionDurationLong2, 225);
        this.f12017g = b.c(v2.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = b.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15147d);
        this.f12018i = b.d(v2.getContext(), R.attr.motionEasingEmphasizedInterpolator, x3.a.f15146c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i6 <= 0) {
            if (i6 < 0) {
                t(view);
            }
        } else {
            if (this.f12020k == 1) {
                return;
            }
            if (this.f12014d && (accessibilityManager = this.f12012b) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f12021l;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            u(view, 1);
            this.f12021l = this.f12011a.c(view, this.f12019j).setInterpolator(this.f12018i).setDuration(this.f12017g).setListener(new i(this, view));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
        return i6 == 2;
    }

    public final void s(int i6) {
        j jVar = this.f12011a;
        if (jVar == null || jVar.b() != i6) {
            if (i6 == 0) {
                this.f12011a = new f();
            } else if (i6 == 1) {
                this.f12011a = new d();
            } else {
                if (i6 != 2) {
                    throw new IllegalArgumentException(s0.a(i6, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f12011a = new e();
            }
        }
    }

    public final void t(V v2) {
        if (this.f12020k == 2) {
            return;
        }
        u(v2, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f12021l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f12011a.getClass();
        this.f12021l = this.f12011a.c(v2, 0).setInterpolator(this.h).setDuration(this.f12016f).setListener(new i(this, v2));
    }

    public final void u(V v2, int i6) {
        this.f12020k = i6;
        if (i6 == 1) {
            if (v2.hasFocus()) {
                v2.clearFocus();
            }
            if (v2.getImportantForAccessibility() != 4) {
                this.f12022m = v2.getImportantForAccessibility();
            }
            if (v2.getVisibility() != 4) {
                this.f12023n = v2.getVisibility();
            }
            v2.setImportantForAccessibility(4);
        } else if (i6 == 2) {
            if (v2.getImportantForAccessibility() == 4) {
                v2.setImportantForAccessibility(this.f12022m);
            }
            if (v2.getVisibility() == 4) {
                v2.setVisibility(this.f12023n);
            }
        }
        Iterator<a> it = this.f12015e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12014d = true;
        this.f12015e = new LinkedHashSet<>();
        this.f12019j = 0;
        this.f12020k = 2;
        this.f12022m = 0;
        this.f12023n = 0;
    }
}
