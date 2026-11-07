package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.activity.m;
import androidx.camera.camera2.internal.s0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.htmltoapk.template.R;
import e5.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;
import u4.g;
import u4.k;
import v0.b;
import v4.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f12411a;

    /* renamed from: b, reason: collision with root package name */
    public final g f12412b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f12413c;

    /* renamed from: d, reason: collision with root package name */
    public final k f12414d;

    /* renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior<V>.c f12415e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12416f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12417g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public c1.c f12418i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12419j;

    /* renamed from: k, reason: collision with root package name */
    public final float f12420k;

    /* renamed from: l, reason: collision with root package name */
    public int f12421l;

    /* renamed from: m, reason: collision with root package name */
    public int f12422m;

    /* renamed from: n, reason: collision with root package name */
    public int f12423n;

    /* renamed from: o, reason: collision with root package name */
    public int f12424o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference<V> f12425p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference<View> f12426q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12427r;
    public VelocityTracker s;

    /* renamed from: t, reason: collision with root package name */
    public int f12428t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f12429u;

    /* renamed from: v, reason: collision with root package name */
    public final a f12430v;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends c.AbstractC0028c {
        public a() {
        }

        @Override // c1.c.AbstractC0028c
        public final int a(View view, int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return i.b(i6, sideSheetBehavior.f12411a.f(), sideSheetBehavior.f12411a.e());
        }

        @Override // c1.c.AbstractC0028c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // c1.c.AbstractC0028c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f12421l + sideSheetBehavior.f12424o;
        }

        @Override // c1.c.AbstractC0028c
        public final void f(int i6) {
            if (i6 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f12417g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // c1.c.AbstractC0028c
        public final void g(View view, int i6, int i7) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f12426q;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f12411a.n(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f12429u;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f12411a.b(i6);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((v4.c) it.next()).b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        @Override // c1.c.AbstractC0028c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f6, float f7) {
            int i6;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.f12411a.j(f6)) {
                if (sideSheetBehavior.f12411a.m(view, f6)) {
                    i6 = (sideSheetBehavior.f12411a.l(f6, f7) || sideSheetBehavior.f12411a.k(view)) ? 5 : 3;
                } else {
                    if (f6 == 0.0f || Math.abs(f6) <= Math.abs(f7)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f12411a.c()) < Math.abs(left - sideSheetBehavior.f12411a.d())) {
                        }
                    }
                }
            }
            sideSheetBehavior.u(view, i6, true);
        }

        @Override // c1.c.AbstractC0028c
        public final boolean i(View view, int i6) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.f12425p) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f12433a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12434b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.camera.lifecycle.a f12435c = new androidx.camera.lifecycle.a(5, this);

        public c() {
        }

        public final void a(int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f12425p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f12433a = i6;
            if (this.f12434b) {
                return;
            }
            sideSheetBehavior.f12425p.get().postOnAnimation(this.f12435c);
            this.f12434b = true;
        }
    }

    public SideSheetBehavior() {
        this.f12415e = new c();
        this.f12417g = true;
        this.h = 5;
        this.f12420k = 0.1f;
        this.f12427r = -1;
        this.f12429u = new LinkedHashSet();
        this.f12430v = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f12425p = null;
        this.f12418i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f12425p = null;
        this.f12418i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        c1.c cVar;
        VelocityTracker velocityTracker;
        if ((!v2.isShown() && f0.e(v2) == null) || !this.f12417g) {
            this.f12419j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f12428t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f12419j) {
            this.f12419j = false;
            return false;
        }
        return (this.f12419j || (cVar = this.f12418i) == null || !cVar.o(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) throws Resources.NotFoundException {
        V v6;
        V v7;
        int i7;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        WeakReference<V> weakReference = this.f12425p;
        g gVar = this.f12412b;
        int iG = 0;
        if (weakReference == null) {
            this.f12425p = new WeakReference<>(v2);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = v2.getContext();
            o4.b.c(context, R.attr.motionDurationMedium2, 300);
            o4.b.c(context, R.attr.motionDurationShort3, 150);
            o4.b.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v2.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                v2.setBackground(gVar);
                float elevation = this.f12416f;
                if (elevation == -1.0f) {
                    elevation = v2.getElevation();
                }
                gVar.q(elevation);
            } else {
                ColorStateList colorStateList = this.f12413c;
                if (colorStateList != null) {
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    f0.d.h(v2, colorStateList);
                }
            }
            int i8 = this.h == 5 ? 4 : 0;
            if (v2.getVisibility() != i8) {
                v2.setVisibility(i8);
            }
            v();
            if (v2.getImportantForAccessibility() == 0) {
                v2.setImportantForAccessibility(1);
            }
            if (f0.e(v2) == null) {
                f0.n(v2, v2.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i9 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v2.getLayoutParams()).f926c, i6) == 3 ? 1 : 0;
        d dVar = this.f12411a;
        if (dVar == null || dVar.i() != i9) {
            CoordinatorLayout.f fVar = null;
            k kVar = this.f12414d;
            if (i9 == 0) {
                this.f12411a = new v4.b(this);
                if (kVar != null) {
                    WeakReference<V> weakReference2 = this.f12425p;
                    if (weakReference2 != null && (v7 = weakReference2.get()) != null && (v7.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v7.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        k.a aVarJ = kVar.j();
                        aVarJ.f14651f = new u4.a(0.0f);
                        aVarJ.f14652g = new u4.a(0.0f);
                        k kVarA = aVarJ.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA);
                        }
                    }
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalArgumentException(s0.a(i9, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f12411a = new v4.a(this);
                if (kVar != null) {
                    WeakReference<V> weakReference3 = this.f12425p;
                    if (weakReference3 != null && (v6 = weakReference3.get()) != null && (v6.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v6.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        k.a aVarJ2 = kVar.j();
                        aVarJ2.f14650e = new u4.a(0.0f);
                        aVarJ2.h = new u4.a(0.0f);
                        k kVarA2 = aVarJ2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA2);
                        }
                    }
                }
            }
        }
        if (this.f12418i == null) {
            this.f12418i = new c1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f12430v);
        }
        int iG2 = this.f12411a.g(v2);
        coordinatorLayout.k(v2, i6);
        this.f12422m = coordinatorLayout.getWidth();
        this.f12423n = this.f12411a.h(coordinatorLayout);
        this.f12421l = v2.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        this.f12424o = marginLayoutParams != null ? this.f12411a.a(marginLayoutParams) : 0;
        int i10 = this.h;
        if (i10 == 1 || i10 == 2) {
            iG = iG2 - this.f12411a.g(v2);
        } else if (i10 != 3) {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iG = this.f12411a.d();
        }
        WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
        v2.offsetLeftAndRight(iG);
        if (this.f12426q == null && (i7 = this.f12427r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i7)) != null) {
            this.f12426q = new WeakReference<>(viewFindViewById);
        }
        for (v4.c cVar : this.f12429u) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i6 = ((b) parcelable).f12432u;
        if (i6 == 1 || i6 == 2) {
            i6 = 5;
        }
        this.h = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f12418i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.f12419j && t()) {
            float fAbs = Math.abs(this.f12428t - motionEvent.getX());
            c1.c cVar = this.f12418i;
            if (fAbs > cVar.f2140b) {
                cVar.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f12419j;
    }

    public final void s(int i6) {
        V v2;
        if (this.h == i6) {
            return;
        }
        this.h = i6;
        WeakReference<V> weakReference = this.f12425p;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        int i7 = this.h == 5 ? 4 : 0;
        if (v2.getVisibility() != i7) {
            v2.setVisibility(i7);
        }
        Iterator it = this.f12429u.iterator();
        while (it.hasNext()) {
            ((v4.c) it.next()).a();
        }
        v();
    }

    public final boolean t() {
        if (this.f12418i != null) {
            return this.f12417g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        s(2);
        r2.f12415e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(View view, int i6, boolean z6) {
        int iC;
        if (i6 == 3) {
            iC = this.f12411a.c();
        } else {
            if (i6 != 5) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Invalid state to get outer edge offset: "));
            }
            iC = this.f12411a.d();
        }
        c1.c cVar = this.f12418i;
        if (cVar != null) {
            if (!z6) {
                int top = view.getTop();
                cVar.f2155r = view;
                cVar.f2141c = -1;
                boolean zH = cVar.h(iC, top, 0, 0);
                if (!zH && cVar.f2139a == 0 && cVar.f2155r != null) {
                    cVar.f2155r = null;
                }
            }
        }
        s(i6);
    }

    public final void v() {
        V v2;
        WeakReference<V> weakReference = this.f12425p;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        f0.j(v2, 262144);
        f0.h(v2, 0);
        f0.j(v2, 1048576);
        f0.h(v2, 0);
        final int i6 = 5;
        if (this.h != 5) {
            f0.k(v2, b.a.f14734i, new v0.d() { // from class: v4.e
                @Override // v0.d
                public final boolean a(View view) {
                    final int i7 = i6;
                    if (i7 == 1 || i7 == 2) {
                        throw new IllegalArgumentException(m.e(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = this.f14823a;
                    Reference reference = sideSheetBehavior.f12425p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i7);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f12425p.get();
                    Runnable runnable = new Runnable() { // from class: v4.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            Reference reference2 = sideSheetBehavior2.f12425p;
                            View view3 = reference2 != null ? (View) reference2.get() : null;
                            if (view3 != null) {
                                sideSheetBehavior2.u(view3, i7, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
        final int i7 = 3;
        if (this.h != 3) {
            f0.k(v2, b.a.h, new v0.d() { // from class: v4.e
                @Override // v0.d
                public final boolean a(View view) {
                    final int i72 = i7;
                    if (i72 == 1 || i72 == 2) {
                        throw new IllegalArgumentException(m.e(new StringBuilder("STATE_"), i72 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = this.f14823a;
                    Reference reference = sideSheetBehavior.f12425p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.s(i72);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f12425p.get();
                    Runnable runnable = new Runnable() { // from class: v4.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                            Reference reference2 = sideSheetBehavior2.f12425p;
                            View view3 = reference2 != null ? (View) reference2.get() : null;
                            if (view3 != null) {
                                sideSheetBehavior2.u(view3, i72, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends b1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public final int f12432u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12432u = parcel.readInt();
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f12432u);
        }

        public b(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f12432u = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12415e = new c();
        this.f12417g = true;
        this.h = 5;
        this.f12420k = 0.1f;
        this.f12427r = -1;
        this.f12429u = new LinkedHashSet();
        this.f12430v = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.C);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f12413c = q4.c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f12414d = k.f(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f12427r = resourceId;
            WeakReference<View> weakReference = this.f12426q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f12426q = null;
            WeakReference<V> weakReference2 = this.f12425p;
            if (weakReference2 != null) {
                V v2 = weakReference2.get();
                if (resourceId != -1 && v2.isLaidOut()) {
                    v2.requestLayout();
                }
            }
        }
        k kVar = this.f12414d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f12412b = gVar;
            gVar.n(context);
            ColorStateList colorStateList = this.f12413c;
            if (colorStateList != null) {
                this.f12412b.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f12412b.setTint(typedValue.data);
            }
        }
        this.f12416f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f12417g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
