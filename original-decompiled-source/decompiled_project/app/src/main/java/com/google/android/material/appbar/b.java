package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import z3.j;

/* loaded from: classes2.dex */
public final class b extends y3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.b f6304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6305f;

    public b(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, m3.b bVar) {
        this.f6305f = baseBehavior;
        this.f6303d = appBarLayout;
        this.f6304e = bVar;
    }

    @Override // y3.a
    public final void d(View view, j jVar) {
        this.f33785a.onInitializeAccessibilityNodeInfo(view, jVar.f34725a);
        jVar.g("android.widget.ScrollView");
        AppBarLayout appBarLayout = this.f6303d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        m3.b bVar = this.f6304e;
        AppBarLayout.BaseBehavior baseBehavior = this.f6305f;
        View viewQ = AppBarLayout.BaseBehavior.q(baseBehavior, bVar);
        if (viewQ == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((AppBarLayout.c) appBarLayout.getChildAt(i10).getLayoutParams()).f6298a != 0) {
                if (baseBehavior.f6289h != (-appBarLayout.getTotalScrollRange())) {
                    jVar.b(j.a.f34730g);
                    jVar.h();
                }
                if (baseBehavior.f6289h != 0) {
                    if (!viewQ.canScrollVertically(-1)) {
                        jVar.b(j.a.f34731h);
                        jVar.h();
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            jVar.b(j.a.f34731h);
                            jVar.h();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // y3.a
    public final boolean g(View view, int i10, Bundle bundle) {
        int i11;
        AppBarLayout appBarLayout = this.f6303d;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.g(view, i10, bundle);
        }
        int downNestedPreScrollRange = 0;
        AppBarLayout.BaseBehavior baseBehavior = this.f6305f;
        if (baseBehavior.f6289h != 0) {
            m3.b bVar = this.f6304e;
            View viewQ = AppBarLayout.BaseBehavior.q(baseBehavior, bVar);
            if (!viewQ.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i12 = -appBarLayout.getDownNestedPreScrollRange();
            if (i12 != 0) {
                if (i12 != 0) {
                    if (i12 < 0) {
                        i11 = -appBarLayout.getTotalScrollRange();
                        downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i11;
                    } else {
                        i11 = -appBarLayout.getUpNestedPreScrollRange();
                    }
                    int i13 = i11;
                    int i14 = downNestedPreScrollRange;
                    if (i13 != i14) {
                        baseBehavior.o(bVar, appBarLayout, baseBehavior.m() - i12, i13, i14);
                    }
                }
                if (appBarLayout.f6278k) {
                    appBarLayout.d(appBarLayout.e(viewQ));
                }
                return true;
            }
        }
        return false;
    }
}
