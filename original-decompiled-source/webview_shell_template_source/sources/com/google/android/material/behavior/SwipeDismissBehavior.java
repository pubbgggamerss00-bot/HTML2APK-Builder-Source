package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.c;
import u0.f0;
import v0.b;
import z3.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public c f12024a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12025b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12026c;

    /* renamed from: d, reason: collision with root package name */
    public int f12027d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f12028e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f12029f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f12030g = 0.5f;
    public final a h = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public final View s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f12034t;

        public b(View view, boolean z6) {
            this.s = view;
            this.f12034t = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f12024a;
            if (cVar == null || !cVar.f()) {
                return;
            }
            this.s.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean zI = this.f12025b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zI = coordinatorLayout.i(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12025b = zI;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12025b = false;
        }
        if (zI) {
            if (this.f12024a == null) {
                this.f12024a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.f12026c && this.f12024a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        if (v2.getImportantForAccessibility() == 0) {
            v2.setImportantForAccessibility(1);
            f0.j(v2, 1048576);
            f0.h(v2, 0);
            if (s(v2)) {
                f0.k(v2, b.a.f14734i, new k(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (this.f12024a == null) {
            return false;
        }
        if (this.f12026c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f12024a.i(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends c.AbstractC0028c {

        /* renamed from: a, reason: collision with root package name */
        public int f12031a;

        /* renamed from: b, reason: collision with root package name */
        public int f12032b = -1;

        public a() {
        }

        @Override // c1.c.AbstractC0028c
        public final int a(View view, int i6) {
            int width;
            int width2;
            int width3;
            boolean z6 = view.getLayoutDirection() == 1;
            int i7 = SwipeDismissBehavior.this.f12027d;
            if (i7 == 0) {
                if (z6) {
                    width = this.f12031a - view.getWidth();
                    width2 = this.f12031a;
                } else {
                    width = this.f12031a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i7 != 1) {
                width = this.f12031a - view.getWidth();
                width2 = view.getWidth() + this.f12031a;
            } else if (z6) {
                width = this.f12031a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f12031a - view.getWidth();
                width2 = this.f12031a;
            }
            return Math.min(Math.max(width, i6), width2);
        }

        @Override // c1.c.AbstractC0028c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // c1.c.AbstractC0028c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // c1.c.AbstractC0028c
        public final void e(View view, int i6) {
            this.f12032b = i6;
            this.f12031a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f12026c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f12026c = false;
            }
        }

        @Override // c1.c.AbstractC0028c
        public final void g(View view, int i6, int i7) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f6 = width * swipeDismissBehavior.f12029f;
            float width2 = view.getWidth() * swipeDismissBehavior.f12030g;
            float fAbs = Math.abs(i6 - this.f12031a);
            if (fAbs <= f6) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f6) / (width2 - f6))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
        @Override // c1.c.AbstractC0028c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f6, float f7) {
            int i6;
            this.f12032b = -1;
            int width = view.getWidth();
            boolean z6 = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f6 != 0.0f) {
                boolean z7 = view.getLayoutDirection() == 1;
                int i7 = swipeDismissBehavior.f12027d;
                if (i7 != 2 && (i7 != 0 ? i7 != 1 || (!z7 ? f6 < 0.0f : f6 > 0.0f) : !z7 ? f6 > 0.0f : f6 < 0.0f)) {
                    i6 = this.f12031a;
                } else if (f6 >= 0.0f) {
                    int left = view.getLeft();
                    int i8 = this.f12031a;
                    i6 = left < i8 ? this.f12031a - width : i8 + width;
                    z6 = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f12031a) >= Math.round(view.getWidth() * swipeDismissBehavior.f12028e)) {
                }
            }
            if (swipeDismissBehavior.f12024a.n(i6, view.getTop())) {
                view.postOnAnimation(new b(view, z6));
            }
        }

        @Override // c1.c.AbstractC0028c
        public final boolean i(View view, int i6) {
            int i7 = this.f12032b;
            return (i7 == -1 || i7 == i6) && SwipeDismissBehavior.this.s(view);
        }

        @Override // c1.c.AbstractC0028c
        public final void f(int i6) {
        }
    }
}
