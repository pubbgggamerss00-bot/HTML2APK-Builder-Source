package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.activity.m;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.c;
import com.htmltoapk.template.R;
import e5.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import n4.l;
import n4.n;
import u0.a;
import u0.f0;
import u0.n0;
import u0.s0;
import u4.g;
import u4.k;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public boolean A;
    public final BottomSheetBehavior<V>.e B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public c1.c Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference<V> Y;
    public final ArrayList Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f12057a;

    /* renamed from: a0, reason: collision with root package name */
    public final ArrayList<c> f12058a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12059b;

    /* renamed from: b0, reason: collision with root package name */
    public VelocityTracker f12060b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f12061c;

    /* renamed from: c0, reason: collision with root package name */
    public int f12062c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f12063d;

    /* renamed from: d0, reason: collision with root package name */
    public int f12064d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12065e;

    /* renamed from: e0, reason: collision with root package name */
    public WeakReference<View> f12066e0;

    /* renamed from: f, reason: collision with root package name */
    public int f12067f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f12068f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12069g;

    /* renamed from: g0, reason: collision with root package name */
    public HashMap f12070g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public final SparseIntArray f12071h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f12072i;

    /* renamed from: i0, reason: collision with root package name */
    public final SparseIntArray f12073i0;

    /* renamed from: j, reason: collision with root package name */
    public final g f12074j;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseIntArray f12075j0;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f12076k;

    /* renamed from: k0, reason: collision with root package name */
    public final Rect f12077k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f12078l;

    /* renamed from: l0, reason: collision with root package name */
    public final b f12079l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f12080m;

    /* renamed from: n, reason: collision with root package name */
    public int f12081n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12082o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12083p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12084q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12085r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f12086t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f12087u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f12088v;

    /* renamed from: w, reason: collision with root package name */
    public int f12089w;

    /* renamed from: x, reason: collision with root package name */
    public int f12090x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f12091y;

    /* renamed from: z, reason: collision with root package name */
    public final k f12092z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ View s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f12093t;

        public a(View view, int i6) {
            this.s = view;
            this.f12093t = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.I(this.s, this.f12093t, false);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends c.AbstractC0028c {
        public b() {
        }

        @Override // c1.c.AbstractC0028c
        public final int a(View view, int i6) {
            return view.getLeft();
        }

        @Override // c1.c.AbstractC0028c
        public final int b(View view, int i6) {
            return i.b(i6, BottomSheetBehavior.this.z(), d());
        }

        @Override // c1.c.AbstractC0028c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
        }

        @Override // c1.c.AbstractC0028c
        public final void f(int i6) {
            if (i6 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.L) {
                    bottomSheetBehavior.G(1);
                }
            }
        }

        @Override // c1.c.AbstractC0028c
        public final void g(View view, int i6, int i7) {
            BottomSheetBehavior.this.w(i7);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // c1.c.AbstractC0028c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f6, float f7) {
            int i6 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f7 < 0.0f) {
                if (bottomSheetBehavior.f12059b) {
                    i6 = 3;
                } else {
                    int top = view.getTop();
                    SystemClock.uptimeMillis();
                    bottomSheetBehavior.getClass();
                    if (top <= bottomSheetBehavior.F) {
                    }
                }
            } else if (bottomSheetBehavior.J && bottomSheetBehavior.H(view, f7)) {
                if (Math.abs(f6) >= Math.abs(f7) || f7 <= bottomSheetBehavior.f12063d) {
                    if (view.getTop() > (bottomSheetBehavior.z() + bottomSheetBehavior.X) / 2) {
                        i6 = 5;
                    } else if (bottomSheetBehavior.f12059b || Math.abs(view.getTop() - bottomSheetBehavior.z()) < Math.abs(view.getTop() - bottomSheetBehavior.F)) {
                    }
                }
            } else if (f7 == 0.0f || Math.abs(f6) > Math.abs(f7)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.f12059b) {
                    int i7 = bottomSheetBehavior.F;
                    if (top2 < i7) {
                        if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - i7) < Math.abs(top2 - bottomSheetBehavior.H)) {
                        bottomSheetBehavior.getClass();
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.E) >= Math.abs(top2 - bottomSheetBehavior.H)) {
                    i6 = 4;
                }
            } else if (!bottomSheetBehavior.f12059b) {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                    bottomSheetBehavior.getClass();
                }
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.I(view, i6, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
        @Override // c1.c.AbstractC0028c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean i(View view, int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i7 = bottomSheetBehavior.P;
            if (i7 != 1 && !bottomSheetBehavior.f12068f0) {
                if (i7 == 3 && bottomSheetBehavior.f12062c0 == i6) {
                    View view2 = null;
                    if (bottomSheetBehavior.f12065e) {
                        WeakReference<View> weakReference = bottomSheetBehavior.f12066e0;
                        if (weakReference != null) {
                            view2 = weakReference.get();
                        }
                    } else {
                        ArrayList arrayList = bottomSheetBehavior.Z;
                        if (!arrayList.isEmpty()) {
                            view2 = (View) ((WeakReference) arrayList.get(0)).get();
                        }
                    }
                    if (view2 == null || !view2.canScrollVertically(-1)) {
                    }
                } else {
                    SystemClock.uptimeMillis();
                    WeakReference<V> weakReference2 = bottomSheetBehavior.Y;
                    if (weakReference2 != null && weakReference2.get() == view) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public int f12101a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12102b;

        /* renamed from: c, reason: collision with root package name */
        public final a f12103c = new a();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f12102b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                c1.c cVar = bottomSheetBehavior.Q;
                if (cVar != null && cVar.f()) {
                    eVar.a(eVar.f12101a);
                } else if (bottomSheetBehavior.P == 2) {
                    bottomSheetBehavior.G(eVar.f12101a);
                }
            }
        }

        public e() {
        }

        public final void a(int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f12101a = i6;
            if (this.f12102b) {
                return;
            }
            bottomSheetBehavior.Y.get().postOnAnimation(this.f12103c);
            this.f12102b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f12057a = 0;
        this.f12059b = true;
        this.f12078l = -1;
        this.f12080m = -1;
        this.B = new e();
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.f12058a0 = new ArrayList<>();
        this.f12064d0 = -1;
        this.f12071h0 = new SparseIntArray();
        this.f12073i0 = new SparseIntArray();
        this.f12075j0 = new SparseIntArray();
        this.f12077k0 = new Rect();
        this.f12079l0 = new b();
    }

    public static View x(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View viewX = x(viewGroup.getChildAt(i6));
            if (viewX != null) {
                return viewX;
            }
        }
        return null;
    }

    public static int y(int i6, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    public final int A(int i6) {
        if (i6 == 3) {
            return z();
        }
        if (i6 == 4) {
            return this.H;
        }
        if (i6 == 5) {
            return this.X;
        }
        if (i6 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Invalid state to get top offset: "));
    }

    public final boolean B() {
        WeakReference<V> weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.Y.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean C(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void D(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                D(viewGroup.getChildAt(i6));
            }
        }
    }

    public final void E(int i6) {
        if (i6 == -1) {
            if (this.f12069g) {
                return;
            } else {
                this.f12069g = true;
            }
        } else {
            if (!this.f12069g && this.f12067f == i6) {
                return;
            }
            this.f12069g = false;
            this.f12067f = Math.max(0, i6);
        }
        M();
    }

    public final void F(int i6) {
        if (i6 == 1 || i6 == 2) {
            throw new IllegalArgumentException(m.e(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.J && i6 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i6);
            return;
        }
        int i7 = (i6 == 6 && this.f12059b && A(i6) <= this.E) ? 3 : i6;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            G(i6);
            return;
        }
        V v2 = this.Y.get();
        a aVar = new a(v2, i7);
        ViewParent parent = v2.getParent();
        if (parent != null && parent.isLayoutRequested() && v2.isAttachedToWindow()) {
            v2.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void G(int i6) {
        if (this.P == i6) {
            return;
        }
        this.P = i6;
        if (i6 != 4 && i6 != 3 && i6 != 6) {
            boolean z6 = this.J;
        }
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i7 = 0;
        if (i6 == 3) {
            L(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            L(false);
        }
        K(i6, true);
        while (true) {
            ArrayList<c> arrayList = this.f12058a0;
            if (i7 >= arrayList.size()) {
                J();
                return;
            } else {
                arrayList.get(i7).b();
                i7++;
            }
        }
    }

    public final boolean H(View view, float f6) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f6 * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) v()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        G(2);
        K(r4, true);
        r2.B.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(View view, int i6, boolean z6) {
        int iA = A(i6);
        c1.c cVar = this.Q;
        if (cVar != null) {
            if (!z6) {
                int left = view.getLeft();
                cVar.f2155r = view;
                cVar.f2141c = -1;
                boolean zH = cVar.h(left, iA, 0, 0);
                if (!zH && cVar.f2139a == 0 && cVar.f2155r != null) {
                    cVar.f2155r = null;
                }
            }
        }
        G(i6);
    }

    public final void J() {
        V v2;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        f0.j(v2, 1048576);
        f0.h(v2, 0);
        f0.j(v2, 524288);
        f0.h(v2, 0);
        f0.j(v2, 262144);
        f0.h(v2, 0);
        SparseIntArray sparseIntArray = this.f12073i0;
        int i6 = sparseIntArray.get(0, -1);
        if (i6 != -1) {
            f0.j(v2, i6);
            f0.h(v2, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f12071h0;
        int i7 = sparseIntArray2.get(0, -1);
        if (i7 != -1) {
            f0.j(v2, i7);
            f0.h(v2, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f12075j0;
        int i8 = sparseIntArray3.get(0, -1);
        if (i8 != -1) {
            f0.j(v2, i8);
            f0.h(v2, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f12059b && this.P != 6) {
            sparseIntArray2.put(0, s(v2, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            f0.k(v2, b.a.f14734i, new b4.d(this, 5));
        }
        int i9 = this.P;
        if (i9 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, s(v2, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i9 == 4) {
            sparseIntArray.put(0, s(v2, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i9 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, s(v2, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, s(v2, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void K(int i6, boolean z6) {
        g gVar;
        if (i6 == 2) {
            return;
        }
        boolean z7 = this.P == 3 && (this.f12091y || B());
        if (this.A == z7 || (gVar = this.f12074j) == null) {
            return;
        }
        this.A = z7;
        ValueAnimator valueAnimator = this.C;
        if (z6 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f14610t.f14626i, z7 ? u() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fU = this.A ? u() : 1.0f;
        g.c cVar = gVar.f14610t;
        if (cVar.f14626i != fU) {
            cVar.f14626i = fU;
            gVar.f14614x = true;
            gVar.f14615y = true;
            gVar.invalidateSelf();
        }
    }

    public final void L(boolean z6) {
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f12070g0 != null) {
                    return;
                } else {
                    this.f12070g0 = new HashMap(childCount);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if (childAt != this.Y.get() && z6) {
                    this.f12070g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f12070g0 = null;
        }
    }

    public final void M() {
        V v2;
        if (this.Y != null) {
            t();
            if (this.P != 4 || (v2 = this.Y.get()) == null) {
                return;
            }
            v2.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.Y = null;
        this.Q = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.Y = null;
        this.Q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        int i6;
        c1.c cVar;
        if (!v2.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.f12062c0 = -1;
            this.f12064d0 = -1;
            this.f12066e0 = null;
            VelocityTracker velocityTracker = this.f12060b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12060b0 = null;
            }
        }
        if (this.f12060b0 == null) {
            this.f12060b0 = VelocityTracker.obtain();
        }
        this.f12060b0.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f12064d0 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        view = null;
                        break;
                    }
                    Object obj = arrayList.get(i7);
                    i7++;
                    view = (View) ((WeakReference) obj).get();
                    if (view != null && coordinatorLayout.i(view, x7, y2)) {
                        break;
                    }
                }
            }
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.f12066e0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.f12062c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f12068f0 = true;
            }
            this.R = this.f12062c0 == -1 && !coordinatorLayout.i(v2, x6, this.f12064d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12068f0 = false;
            this.f12066e0 = null;
            this.f12062c0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (cVar = this.Q) == null || !cVar.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.f12065e) {
                                WeakReference<View> weakReference2 = this.f12066e0;
                                if (weakReference2 == null || weakReference2.get() == null) {
                                    if (this.Q == null || (i6 = this.f12064d0) == -1 || Math.abs(i6 - motionEvent.getY()) <= this.Q.f2140b) {
                                        break;
                                    }
                                }
                            } else {
                                View view2 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view2 == null || !coordinatorLayout.i(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) throws Resources.NotFoundException {
        if (coordinatorLayout.getFitsSystemWindows() && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        int i7 = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z6 = (Build.VERSION.SDK_INT < 29 || this.f12082o || this.f12069g) ? false : true;
            if (this.f12083p || this.f12084q || this.f12085r || this.f12086t || this.f12087u || this.f12088v || z6) {
                b4.c cVar = new b4.c(this, z6);
                int paddingStart = v2.getPaddingStart();
                v2.getPaddingTop();
                int paddingEnd = v2.getPaddingEnd();
                int paddingBottom = v2.getPaddingBottom();
                n.a aVar = new n.a();
                aVar.f13994a = paddingStart;
                aVar.f13995b = paddingEnd;
                aVar.f13996c = paddingBottom;
                l lVar = new l(cVar, aVar);
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                f0.d.k(v2, lVar);
                if (v2.isAttachedToWindow()) {
                    v2.requestApplyInsets();
                } else {
                    v2.addOnAttachStateChangeListener(new n4.m());
                }
            }
            f0.o(v2, new b4.e(v2));
            this.Y = new WeakReference<>(v2);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = v2.getContext();
            o4.b.c(context, R.attr.motionDurationMedium2, 300);
            o4.b.c(context, R.attr.motionDurationShort3, 150);
            o4.b.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v2.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g gVar = this.f12074j;
            if (gVar != null) {
                v2.setBackground(gVar);
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = v2.getElevation();
                }
                gVar.q(elevation);
            } else {
                ColorStateList colorStateList = this.f12076k;
                if (colorStateList != null) {
                    f0.d.h(v2, colorStateList);
                }
            }
            J();
            if (v2.getImportantForAccessibility() == 0) {
                v2.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new c1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f12079l0);
        }
        int top = v2.getTop();
        coordinatorLayout.k(v2, i6);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.V = height;
        int iMin = this.X;
        int i8 = iMin - height;
        int i9 = this.f12090x;
        if (i8 < i9) {
            boolean z7 = this.s;
            int i10 = this.f12080m;
            if (z7) {
                if (i10 != -1) {
                    iMin = Math.min(iMin, i10);
                }
                this.V = iMin;
            } else {
                int iMin2 = iMin - i9;
                if (i10 != -1) {
                    iMin2 = Math.min(iMin2, i10);
                }
                this.V = iMin2;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        this.F = (int) ((1.0f - this.G) * this.X);
        t();
        int i11 = this.P;
        if (i11 == 3) {
            int iZ = z();
            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
            v2.offsetTopAndBottom(iZ);
        } else if (i11 == 6) {
            int i12 = this.F;
            WeakHashMap<View, n0> weakHashMap3 = f0.f14480a;
            v2.offsetTopAndBottom(i12);
        } else if (this.J && i11 == 5) {
            int i13 = this.X;
            WeakHashMap<View, n0> weakHashMap4 = f0.f14480a;
            v2.offsetTopAndBottom(i13);
        } else if (i11 == 4) {
            int i14 = this.H;
            WeakHashMap<View, n0> weakHashMap5 = f0.f14480a;
            v2.offsetTopAndBottom(i14);
        } else if (i11 == 1 || i11 == 2) {
            int top2 = top - v2.getTop();
            WeakHashMap<View, n0> weakHashMap6 = f0.f14480a;
            v2.offsetTopAndBottom(top2);
        }
        K(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.f12065e) {
            D(v2);
        } else {
            arrayList.add(new WeakReference(x(v2)));
        }
        while (true) {
            ArrayList<c> arrayList2 = this.f12058a0;
            if (i7 >= arrayList2.size()) {
                return true;
            }
            arrayList2.get(i7).getClass();
            i7++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, this.f12078l, marginLayoutParams.width), y(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f12080m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            if (((WeakReference) obj).get() != null) {
                if (!C(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i6, int i7, int[] iArr, int i8) {
        boolean zC;
        if (i8 != 1 && (zC = C(view))) {
            int top = v2.getTop();
            int i9 = top - i7;
            boolean z6 = this.L;
            boolean z7 = this.M;
            if (i7 > 0) {
                if (!this.T && !z7 && zC && view.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i9 < z()) {
                    int iZ = top - z();
                    iArr[1] = iZ;
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    v2.offsetTopAndBottom(-iZ);
                    G(3);
                } else {
                    if (!z6) {
                        return;
                    }
                    iArr[1] = i7;
                    WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                    v2.offsetTopAndBottom(-i7);
                    G(1);
                }
            } else if (i7 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.T && !z7 && zC && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i10 = this.H;
                    if (i9 > i10 && !this.J) {
                        int i11 = top - i10;
                        iArr[1] = i11;
                        WeakHashMap<View, n0> weakHashMap3 = f0.f14480a;
                        v2.offsetTopAndBottom(-i11);
                        G(4);
                    } else {
                        if (!z6) {
                            return;
                        }
                        iArr[1] = i7;
                        WeakHashMap<View, n0> weakHashMap4 = f0.f14480a;
                        v2.offsetTopAndBottom(-i7);
                        G(1);
                    }
                }
            }
            w(v2.getTop());
            this.S = i7;
            this.T = true;
            this.N = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z6) {
        if (!this.O || v2.isInTouchMode()) {
            return false;
        }
        int i6 = this.P;
        if (i6 != 4 && i6 != 6) {
            return false;
        }
        Rect rect2 = this.f12077k0;
        if (v2.getLocalVisibleRect(rect2)) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            s0 s0VarA = f0.e.a(v2);
            if (s0VarA != null) {
                rect2.bottom -= s0VarA.f14553a.f(519).f13857d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        F(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i6 = this.f12057a;
        if (i6 != 0) {
            if (i6 == -1 || (i6 & 1) == 1) {
                this.f12067f = dVar.f12097v;
            }
            if (i6 == -1 || (i6 & 2) == 2) {
                this.f12059b = dVar.f12098w;
            }
            if (i6 == -1 || (i6 & 4) == 4) {
                this.J = dVar.f12099x;
            }
            if (i6 == -1 || (i6 & 8) == 8) {
                this.K = dVar.f12100y;
            }
        }
        int i7 = dVar.f12096u;
        if (i7 == 1 || i7 == 2) {
            this.P = 4;
        } else {
            this.P = i7;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
        this.S = 0;
        this.T = false;
        return (i6 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i6) {
        float yVelocity;
        int i7 = 3;
        if (v2.getTop() == z()) {
            G(3);
            return;
        }
        if (C(view) && this.T) {
            if (this.S > 0) {
                if (!this.f12059b && v2.getTop() > this.F) {
                    i7 = 6;
                }
            } else if (this.J) {
                VelocityTracker velocityTracker = this.f12060b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, this.f12061c);
                    yVelocity = this.f12060b0.getYVelocity(this.f12062c0);
                }
                if (H(v2, yVelocity)) {
                    i7 = 5;
                }
            } else if (this.S == 0) {
                int top = v2.getTop();
                if (!this.f12059b) {
                    int i8 = this.F;
                    if (top < i8) {
                        if (top >= Math.abs(top - this.H)) {
                        }
                    } else if (Math.abs(top - i8) < Math.abs(top - this.H)) {
                    }
                    i7 = 6;
                } else if (Math.abs(top - this.E) >= Math.abs(top - this.H)) {
                    i7 = 4;
                }
            } else {
                if (!this.f12059b) {
                    int top2 = v2.getTop();
                    if (Math.abs(top2 - this.F) < Math.abs(top2 - this.H)) {
                    }
                }
                i7 = 4;
            }
            I(v2, i7, false);
            this.T = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.P;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        c1.c cVar = this.Q;
        if (cVar != null && (this.L || i6 == 1)) {
            cVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f12062c0 = -1;
            this.f12064d0 = -1;
            this.f12066e0 = null;
            VelocityTracker velocityTracker = this.f12060b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12060b0 = null;
            }
        }
        if (this.f12060b0 == null) {
            this.f12060b0 = VelocityTracker.obtain();
        }
        this.f12060b0.addMovement(motionEvent);
        if (this.Q != null && ((this.L || this.P == 1) && actionMasked == 2 && !this.R)) {
            float fAbs = Math.abs(this.f12064d0 - motionEvent.getY());
            c1.c cVar2 = this.Q;
            if (fAbs > cVar2.f2140b) {
                cVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int s(View view, int i6, int i7) throws Resources.NotFoundException {
        int iA;
        String string = view.getResources().getString(i6);
        b4.d dVar = new b4.d(this, i7);
        ArrayList arrayListF = f0.f(view);
        int i8 = 0;
        while (true) {
            if (i8 >= arrayListF.size()) {
                int i9 = 0;
                int i10 = -1;
                while (true) {
                    int[] iArr = f0.f14483d;
                    if (i9 >= 32 || i10 != -1) {
                        break;
                    }
                    int i11 = iArr[i9];
                    boolean z6 = true;
                    for (int i12 = 0; i12 < arrayListF.size(); i12++) {
                        z6 &= ((b.a) arrayListF.get(i12)).a() != i11;
                    }
                    if (z6) {
                        i10 = i11;
                    }
                    i9++;
                }
                iA = i10;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((b.a) arrayListF.get(i8)).f14737a).getLabel())) {
                    iA = ((b.a) arrayListF.get(i8)).a();
                    break;
                }
                i8++;
            }
        }
        if (iA != -1) {
            b.a aVar = new b.a(null, iA, string, dVar, null);
            View.AccessibilityDelegate accessibilityDelegateD = f0.d(view);
            u0.a aVar2 = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a.C0093a ? ((a.C0093a) accessibilityDelegateD).f14448a : new u0.a(accessibilityDelegateD);
            if (aVar2 == null) {
                aVar2 = new u0.a();
            }
            f0.m(view, aVar2);
            f0.j(view, aVar.a());
            f0.f(view).add(aVar);
            f0.h(view, 0);
        }
        return iA;
    }

    public final void t() {
        int iV = v();
        if (this.f12059b) {
            this.H = Math.max(this.X - iV, this.E);
        } else {
            this.H = this.X - iV;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float u() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f6;
        float f7 = 0.0f;
        if (this.f12074j != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v2 = this.Y.get();
            if (B() && (rootWindowInsets = v2.getRootWindowInsets()) != null) {
                g gVar = this.f12074j;
                float[] fArr = gVar.U;
                float fA = fArr != null ? fArr[3] : gVar.f14610t.f14619a.c().f14639e.a(gVar.h());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f6 = (radius <= 0.0f || fA <= 0.0f) ? 0.0f : radius / fA;
                }
                g gVar2 = this.f12074j;
                float[] fArr2 = gVar2.U;
                float fA2 = fArr2 != null ? fArr2[0] : gVar2.f14610t.f14619a.c().f14640f.a(gVar2.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f7 = radius2 / fA2;
                    }
                }
                return Math.max(f6, f7);
            }
        }
        return 0.0f;
    }

    public final int v() {
        int i6;
        return this.f12069g ? Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V) + this.f12089w : (this.f12082o || this.f12083p || (i6 = this.f12081n) <= 0) ? this.f12067f + this.f12089w : Math.max(this.f12067f, i6 + this.f12072i);
    }

    public final void w(int i6) {
        if (this.Y.get() != null) {
            ArrayList<c> arrayList = this.f12058a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i7 = this.H;
            if (i6 <= i7 && i7 != z()) {
                z();
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                arrayList.get(i8).a();
            }
        }
    }

    public final int z() {
        if (this.f12059b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.f12090x);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends b1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public final int f12096u;

        /* renamed from: v, reason: collision with root package name */
        public final int f12097v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f12098w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f12099x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f12100y;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new d[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12096u = parcel.readInt();
            this.f12097v = parcel.readInt();
            this.f12098w = parcel.readInt() == 1;
            this.f12099x = parcel.readInt() == 1;
            this.f12100y = parcel.readInt() == 1;
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f12096u);
            parcel.writeInt(this.f12097v);
            parcel.writeInt(this.f12098w ? 1 : 0);
            parcel.writeInt(this.f12099x ? 1 : 0);
            parcel.writeInt(this.f12100y ? 1 : 0);
        }

        public d(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f12096u = bottomSheetBehavior.P;
            this.f12097v = bottomSheetBehavior.f12067f;
            this.f12098w = bottomSheetBehavior.f12059b;
            this.f12099x = bottomSheetBehavior.J;
            this.f12100y = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i6;
        super(context, attributeSet);
        this.f12057a = 0;
        this.f12059b = true;
        this.f12078l = -1;
        this.f12080m = -1;
        this.B = new e();
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.f12058a0 = new ArrayList<>();
        this.f12064d0 = -1;
        this.f12071h0 = new SparseIntArray();
        this.f12073i0 = new SparseIntArray();
        this.f12075j0 = new SparseIntArray();
        this.f12077k0 = new Rect();
        this.f12079l0 = new b();
        this.f12072i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15062b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f12076k = q4.c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f12092z = k.f(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f12092z;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f12074j = gVar;
            gVar.n(context);
            ColorStateList colorStateList = this.f12076k;
            if (colorStateList != null) {
                this.f12074j.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f12074j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(u(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new b4.b(this));
        this.I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f12078l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f12080m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue != null && (i6 = typedValuePeekValue.data) == -1) {
            E(i6);
        } else {
            E(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.J != z6) {
            this.J = z6;
            if (!z6 && this.P == 5) {
                F(4);
            }
            J();
        }
        this.f12082o = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f12059b != z7) {
            this.f12059b = z7;
            if (this.Y != null) {
                t();
            }
            G((this.f12059b && this.P == 6) ? 3 : this.P);
            K(this.P, true);
            J();
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.M = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12057a = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f6 = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f6 > 0.0f && f6 < 1.0f) {
            this.G = f6;
            if (this.Y != null) {
                this.F = (int) ((1.0f - f6) * this.X);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i7 = typedValuePeekValue2.data;
                if (i7 >= 0) {
                    this.D = i7;
                    K(this.P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
                if (dimensionPixelOffset >= 0) {
                    this.D = dimensionPixelOffset;
                    K(this.P, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f12063d = typedArrayObtainStyledAttributes.getInt(14, 500);
            this.f12065e = typedArrayObtainStyledAttributes.getBoolean(11, false);
            this.O = typedArrayObtainStyledAttributes.getBoolean(4, true);
            this.f12083p = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f12084q = typedArrayObtainStyledAttributes.getBoolean(21, false);
            this.f12085r = typedArrayObtainStyledAttributes.getBoolean(22, false);
            this.s = typedArrayObtainStyledAttributes.getBoolean(23, true);
            this.f12086t = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f12087u = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f12088v = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f12091y = typedArrayObtainStyledAttributes.getBoolean(26, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f12061c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
    }
}
