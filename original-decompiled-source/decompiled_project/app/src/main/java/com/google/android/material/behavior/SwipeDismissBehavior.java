package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;
import m3.b;
import r4.a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b.AbstractC0173b<V> {

    /* renamed from: a, reason: collision with root package name */
    public r4.a f6306a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6307b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6308c;

    /* renamed from: d, reason: collision with root package name */
    public int f6309d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f6310e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f6311f = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: g, reason: collision with root package name */
    public float f6312g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final a f6313h = new a();

    public class a extends a.c {

        /* renamed from: a, reason: collision with root package name */
        public int f6314a;

        /* renamed from: b, reason: collision with root package name */
        public int f6315b = -1;

        public a() {
        }

        @Override // r4.a.c
        public final int a(View view, int i10) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i11 = SwipeDismissBehavior.this.f6309d;
            if (i11 == 0) {
                if (z10) {
                    width = this.f6314a - view.getWidth();
                    width2 = this.f6314a;
                } else {
                    width = this.f6314a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 != 1) {
                width = this.f6314a - view.getWidth();
                width2 = view.getWidth() + this.f6314a;
            } else if (z10) {
                width = this.f6314a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f6314a - view.getWidth();
                width2 = this.f6314a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // r4.a.c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // r4.a.c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // r4.a.c
        public final void e(View view, int i10) {
            this.f6315b = i10;
            this.f6314a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f6308c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f6308c = false;
            }
        }

        @Override // r4.a.c
        public final void f(int i10) {
        }

        @Override // r4.a.c
        public final void g(View view, int i10, int i11) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f10 = width * swipeDismissBehavior.f6311f;
            float width2 = view.getWidth() * swipeDismissBehavior.f6312g;
            float fAbs = Math.abs(i10 - this.f6314a);
            if (fAbs <= f10) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                view.setAlpha(Math.min(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
        @Override // r4.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f10, float f11) {
            int i10;
            this.f6315b = -1;
            int width = view.getWidth();
            boolean z10 = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
                boolean z11 = view.getLayoutDirection() == 1;
                int i11 = swipeDismissBehavior.f6309d;
                if (i11 != 2 && (i11 != 0 ? i11 != 1 || (!z11 ? f10 < CropImageView.DEFAULT_ASPECT_RATIO : f10 > CropImageView.DEFAULT_ASPECT_RATIO) : !z11 ? f10 > CropImageView.DEFAULT_ASPECT_RATIO : f10 < CropImageView.DEFAULT_ASPECT_RATIO)) {
                    i10 = this.f6314a;
                } else if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    int left = view.getLeft();
                    int i12 = this.f6314a;
                    i10 = left < i12 ? this.f6314a - width : i12 + width;
                    z10 = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f6314a) >= Math.round(view.getWidth() * swipeDismissBehavior.f6310e)) {
                }
            }
            if (swipeDismissBehavior.f6306a.n(i10, view.getTop())) {
                view.postOnAnimation(new b(view, z10));
            }
        }

        @Override // r4.a.c
        public final boolean i(View view, int i10) {
            int i11 = this.f6315b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.j(view);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final View f6317a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6318b;

        public b(View view, boolean z10) {
            this.f6317a = view;
            this.f6318b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r4.a aVar = SwipeDismissBehavior.this.f6306a;
            if (aVar == null || !aVar.f()) {
                return;
            }
            this.f6317a.postOnAnimation(this);
        }
    }

    @Override // m3.b.AbstractC0173b
    public boolean c(m3.b bVar, V v10, MotionEvent motionEvent) {
        boolean zA = this.f6307b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zA = bVar.a(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6307b = zA;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6307b = false;
        }
        if (zA) {
            if (this.f6306a == null) {
                this.f6306a = new r4.a(bVar.getContext(), bVar, this.f6313h);
            }
            if (!this.f6308c && this.f6306a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // m3.b.AbstractC0173b
    public final void i(m3.b bVar, View view, MotionEvent motionEvent) {
        if (this.f6306a != null) {
            if (this.f6308c && motionEvent.getActionMasked() == 3) {
                return;
            }
            this.f6306a.i(motionEvent);
        }
    }

    public boolean j(View view) {
        return true;
    }
}
