package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f11997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11998f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f11998f = baseBehavior;
        this.f11996d = appBarLayout;
        this.f11997e = coordinatorLayout;
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        this.f14446a.onInitializeAccessibilityNodeInfo(view, bVar.f14729a);
        bVar.h(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f11996d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f11997e;
        AppBarLayout.BaseBehavior baseBehavior = this.f11998f;
        View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (viewB == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (((AppBarLayout.c) appBarLayout.getChildAt(i6).getLayoutParams()).f11985a != 0) {
                if (baseBehavior.t() != (-appBarLayout.getTotalScrollRange())) {
                    bVar.b(b.a.f14732f);
                    bVar.j(true);
                }
                if (baseBehavior.t() != 0) {
                    if (!viewB.canScrollVertically(-1)) {
                        bVar.b(b.a.f14733g);
                        bVar.j(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            bVar.b(b.a.f14733g);
                            bVar.j(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // u0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        AppBarLayout appBarLayout = this.f11996d;
        if (i6 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i6 != 8192) {
            return super.g(view, i6, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f11998f;
        if (baseBehavior.t() != 0) {
            CoordinatorLayout coordinatorLayout = this.f11997e;
            View viewB = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!viewB.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i7 = -appBarLayout.getDownNestedPreScrollRange();
            if (i7 != 0) {
                baseBehavior.E(coordinatorLayout, this.f11996d, viewB, i7, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
