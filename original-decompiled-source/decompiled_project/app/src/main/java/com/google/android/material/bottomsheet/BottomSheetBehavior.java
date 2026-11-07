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
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import b.o;
import c1.x;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import j2.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import m3.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r4.a;
import y3.a;
import y3.i1;
import y3.q0;
import z3.j;
import zb.h;
import zb.m;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b.AbstractC0173b<V> {
    public final ArrayList<c> A;
    public VelocityTracker B;
    public int C;
    public int D;
    public WeakReference<View> E;
    public boolean F;
    public HashMap G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final Rect K;

    /* renamed from: a, reason: collision with root package name */
    public final int f6330a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6332c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6333d;

    /* renamed from: e, reason: collision with root package name */
    public int f6334e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6335f;

    /* renamed from: g, reason: collision with root package name */
    public final h f6336g;

    /* renamed from: h, reason: collision with root package name */
    public final ColorStateList f6337h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6338i;

    /* renamed from: j, reason: collision with root package name */
    public final m f6339j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6340k;

    /* renamed from: l, reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f6341l;

    /* renamed from: m, reason: collision with root package name */
    public final ValueAnimator f6342m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6343n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6344o;

    /* renamed from: p, reason: collision with root package name */
    public int f6345p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6346q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6347r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6348s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f6349t;

    /* renamed from: u, reason: collision with root package name */
    public int f6350u;

    /* renamed from: v, reason: collision with root package name */
    public r4.a f6351v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6352w;

    /* renamed from: x, reason: collision with root package name */
    public final float f6353x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference<V> f6354y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f6355z;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f6356a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6357b;

        public a(View view, int i10) {
            this.f6356a = view;
            this.f6357b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.t(this.f6356a, this.f6357b, false);
        }
    }

    public class b extends a.c {
        public b() {
        }

        @Override // r4.a.c
        public final int a(View view, int i10) {
            return view.getLeft();
        }

        @Override // r4.a.c
        public final int b(View view, int i10) {
            return x.e(i10, BottomSheetBehavior.this.n(), d());
        }

        @Override // r4.a.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f6346q) {
                return 0;
            }
            return bottomSheetBehavior.f6345p;
        }

        @Override // r4.a.c
        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f6348s) {
                    bottomSheetBehavior.s(1);
                }
            }
        }

        @Override // r4.a.c
        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            ArrayList<c> arrayList = bottomSheetBehavior.A;
            if (bottomSheetBehavior.f6354y.get() == null || arrayList.isEmpty()) {
                return;
            }
            int i12 = bottomSheetBehavior.f6345p;
            if (i11 <= i12 && i12 != bottomSheetBehavior.n()) {
                bottomSheetBehavior.n();
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                arrayList.get(i13).a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // r4.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f10, float f11) {
            int i10 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                if (bottomSheetBehavior.f6331b) {
                    i10 = 3;
                } else {
                    int top = view.getTop();
                    SystemClock.uptimeMillis();
                    if (top <= bottomSheetBehavior.f6344o) {
                    }
                }
            } else if (bottomSheetBehavior.f6346q) {
                if (!bottomSheetBehavior.f6347r) {
                    if (view.getTop() >= bottomSheetBehavior.f6345p) {
                        if (Math.abs(((bottomSheetBehavior.f6353x * f11) + view.getTop()) - bottomSheetBehavior.f6345p) / bottomSheetBehavior.m() > 0.5f) {
                        }
                    }
                    if (f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f6331b) {
                        }
                    }
                }
                if ((Math.abs(f10) < Math.abs(f11) && f11 > bottomSheetBehavior.f6332c) || view.getTop() > bottomSheetBehavior.n() / 2) {
                    i10 = 5;
                } else if (bottomSheetBehavior.f6331b || Math.abs(view.getTop() - bottomSheetBehavior.n()) < Math.abs(view.getTop() - bottomSheetBehavior.f6344o)) {
                }
            } else if (f11 != CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f10) > Math.abs(f11)) {
                int top22 = view.getTop();
                if (bottomSheetBehavior.f6331b) {
                    int i11 = bottomSheetBehavior.f6344o;
                    if (top22 < i11) {
                        if (top22 < Math.abs(top22 - bottomSheetBehavior.f6345p)) {
                        }
                    } else if (Math.abs(top22 - i11) >= Math.abs(top22 - bottomSheetBehavior.f6345p)) {
                    }
                } else if (Math.abs(top22) >= Math.abs(top22 - bottomSheetBehavior.f6345p)) {
                    i10 = 4;
                }
            } else if (!bottomSheetBehavior.f6331b) {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.f6344o) >= Math.abs(top3 - bottomSheetBehavior.f6345p)) {
                }
            }
            bottomSheetBehavior.t(view, i10, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
        @Override // r4.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f6350u;
            if (i11 != 1 && !bottomSheetBehavior.F) {
                if (i11 == 3 && bottomSheetBehavior.C == i10) {
                    View view2 = null;
                    if (bottomSheetBehavior.f6333d) {
                        WeakReference<View> weakReference = bottomSheetBehavior.E;
                        if (weakReference != null) {
                            view2 = weakReference.get();
                        }
                    } else {
                        ArrayList arrayList = bottomSheetBehavior.f6355z;
                        if (!arrayList.isEmpty()) {
                            view2 = (View) ((WeakReference) arrayList.get(0)).get();
                        }
                    }
                    if (view2 == null || !view2.canScrollVertically(-1)) {
                    }
                } else {
                    SystemClock.uptimeMillis();
                    WeakReference<V> weakReference2 = bottomSheetBehavior.f6354y;
                    if (weakReference2 != null && weakReference2.get() == view) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public int f6365a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6366b;

        /* renamed from: c, reason: collision with root package name */
        public final a f6367c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f6366b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                r4.a aVar = bottomSheetBehavior.f6351v;
                if (aVar != null && aVar.f()) {
                    eVar.a(eVar.f6365a);
                } else if (bottomSheetBehavior.f6350u == 2) {
                    bottomSheetBehavior.s(eVar.f6365a);
                }
            }
        }

        public e() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f6354y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f6365a = i10;
            if (this.f6366b) {
                return;
            }
            bottomSheetBehavior.f6354y.get().postOnAnimation(this.f6367c);
            this.f6366b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f6330a = 0;
        this.f6331b = true;
        this.f6341l = new e();
        this.f6348s = true;
        this.f6349t = true;
        this.f6350u = 4;
        this.f6353x = 0.1f;
        this.f6355z = new ArrayList();
        this.A = new ArrayList<>();
        this.D = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new Rect();
        new b();
    }

    @Override // m3.b.AbstractC0173b
    public final void a(b.d dVar) {
        this.f6354y = null;
        this.f6351v = null;
    }

    @Override // m3.b.AbstractC0173b
    public final void b() {
        this.f6354y = null;
        this.f6351v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    @Override // m3.b.AbstractC0173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(m3.b bVar, V v10, MotionEvent motionEvent) {
        int i10;
        r4.a aVar;
        if (!v10.isShown() || !this.f6348s) {
            this.f6352w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.C = -1;
            this.D = -1;
            this.E = null;
            VelocityTracker velocityTracker = this.B;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B = null;
            }
        }
        if (this.B == null) {
            this.B = VelocityTracker.obtain();
        }
        this.B.addMovement(motionEvent);
        ArrayList arrayList = this.f6355z;
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.D = (int) motionEvent.getY();
            int x11 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        view = null;
                        break;
                    }
                    Object obj = arrayList.get(i11);
                    i11++;
                    view = (View) ((WeakReference) obj).get();
                    if (view != null && bVar.a(view, x11, y10)) {
                        break;
                    }
                }
            }
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.E = weakReference;
            if (this.f6350u != 2 && weakReference.get() != null) {
                this.C = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.F = true;
            }
            this.f6352w = this.C == -1 && !bVar.a(v10, x10, this.D);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
            this.E = null;
            this.C = -1;
            if (this.f6352w) {
                this.f6352w = false;
                return false;
            }
        }
        if (this.f6352w || (aVar = this.f6351v) == null || !aVar.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.f6352w && this.f6350u != 1) {
                            if (this.f6333d) {
                                WeakReference<View> weakReference2 = this.E;
                                if (weakReference2 == null || weakReference2.get() == null) {
                                    if (this.f6351v == null || (i10 = this.D) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f6351v.f23187b) {
                                        break;
                                    }
                                }
                            } else {
                                View view2 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view2 == null || !bVar.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
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

    @Override // m3.b.AbstractC0173b
    public final boolean d(View view) {
        ArrayList arrayList = this.f6355z;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((WeakReference) obj).get() != null) {
                int size2 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (((WeakReference) obj2).get() == view) {
                        if (this.f6350u != 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m3.b.AbstractC0173b
    public final boolean e(m3.b bVar, View view, Rect rect) {
        if (!this.f6349t || view.isInTouchMode()) {
            return false;
        }
        int i10 = this.f6350u;
        if (i10 != 4 && i10 != 6) {
            return false;
        }
        Rect rect2 = this.K;
        if (view.getLocalVisibleRect(rect2)) {
            Field field = q0.f33885a;
            i1 i1VarA = q0.d.a(view);
            if (i1VarA != null) {
                rect2.bottom -= i1VarA.f33825a.i(519).f23166d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        r(3);
        return true;
    }

    @Override // m3.b.AbstractC0173b
    public final void f(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f6330a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f6334e = dVar.f6361d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f6331b = dVar.f6362e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f6346q = dVar.f6363f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f6347r = dVar.f6364g;
            }
        }
        int i11 = dVar.f6360c;
        if (i11 == 1 || i11 == 2) {
            this.f6350u = 4;
        } else {
            this.f6350u = i11;
        }
    }

    @Override // m3.b.AbstractC0173b
    public final Parcelable g(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // m3.b.AbstractC0173b
    public final boolean h(m3.b bVar, V v10, View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // m3.b.AbstractC0173b
    public final void i(m3.b bVar, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = this.f6350u;
            if (i10 == 1 && actionMasked == 0) {
                return;
            }
            r4.a aVar = this.f6351v;
            if (aVar != null && (this.f6348s || i10 == 1)) {
                aVar.i(motionEvent);
            }
            if (actionMasked == 0) {
                this.C = -1;
                this.D = -1;
                this.E = null;
                VelocityTracker velocityTracker = this.B;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.B = null;
                }
            }
            if (this.B == null) {
                this.B = VelocityTracker.obtain();
            }
            this.B.addMovement(motionEvent);
            if (this.f6351v != null) {
                if ((this.f6348s || this.f6350u == 1) && actionMasked == 2 && !this.f6352w) {
                    float fAbs = Math.abs(this.D - motionEvent.getY());
                    r4.a aVar2 = this.f6351v;
                    if (fAbs > aVar2.f23187b) {
                        aVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                    }
                }
            }
        }
    }

    public final int j(View view, int i10, int i11) throws Resources.NotFoundException {
        int iA;
        String string = view.getResources().getString(i10);
        qb.d dVar = new qb.d(this, i11);
        ArrayList arrayListB = q0.b(view);
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListB.size()) {
                int i13 = 0;
                int i14 = -1;
                while (true) {
                    int[] iArr = q0.f33887c;
                    if (i13 >= 32 || i14 != -1) {
                        break;
                    }
                    int i15 = iArr[i13];
                    boolean z10 = true;
                    for (int i16 = 0; i16 < arrayListB.size(); i16++) {
                        z10 &= ((j.a) arrayListB.get(i16)).a() != i15;
                    }
                    if (z10) {
                        i14 = i15;
                    }
                    i13++;
                }
                iA = i14;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((j.a) arrayListB.get(i12)).f34738a).getLabel())) {
                    iA = ((j.a) arrayListB.get(i12)).a();
                    break;
                }
                i12++;
            }
        }
        if (iA != -1) {
            j.a aVar = new j.a(null, iA, string, dVar, null);
            View.AccessibilityDelegate accessibilityDelegateA = q0.a(view);
            y3.a aVar2 = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a.C0340a ? ((a.C0340a) accessibilityDelegateA).f33787a : new y3.a(accessibilityDelegateA);
            if (aVar2 == null) {
                aVar2 = new y3.a();
            }
            q0.h(view, aVar2);
            q0.e(view, aVar.a());
            q0.b(view).add(aVar);
            q0.c(view, 0);
        }
        return iA;
    }

    public final void k() {
        int iM = m();
        if (this.f6331b) {
            this.f6345p = Math.max(0 - iM, 0);
        } else {
            this.f6345p = 0 - iM;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float l() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f10;
        h hVar = this.f6336g;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (hVar != null && (weakReference = this.f6354y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v10 = this.f6354y.get();
            if (p() && (rootWindowInsets = v10.getRootWindowInsets()) != null) {
                h hVar2 = this.f6336g;
                hVar2.getClass();
                m mVar = hVar2.f34886b.f34913a;
                mVar.getClass();
                float fA = mVar.f34932e.a(hVar2.e());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f10 = (radius <= CropImageView.DEFAULT_ASPECT_RATIO || fA <= CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : radius / fA;
                }
                h hVar3 = this.f6336g;
                hVar3.getClass();
                m mVar2 = hVar3.f34886b.f34913a;
                mVar2.getClass();
                float fA2 = mVar2.f34933f.a(hVar3.e());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > CropImageView.DEFAULT_ASPECT_RATIO && fA2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        f11 = radius2 / fA2;
                    }
                }
                return Math.max(f10, f11);
            }
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final int m() {
        return this.f6335f ? Math.min(Math.max(0, 0), 0) : this.f6334e;
    }

    public final int n() {
        if (this.f6331b) {
            return 0;
        }
        return Math.max(this.f6343n, 0);
    }

    public final int o(int i10) {
        if (i10 == 3) {
            return n();
        }
        if (i10 == 4) {
            return this.f6345p;
        }
        if (i10 == 5) {
            return 0;
        }
        if (i10 == 6) {
            return this.f6344o;
        }
        throw new IllegalArgumentException(y.a(i10, "Invalid state to get top offset: "));
    }

    public final boolean p() {
        WeakReference<V> weakReference = this.f6354y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f6354y.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void q(int i10) {
        V v10;
        if (i10 == -1) {
            if (this.f6335f) {
                return;
            } else {
                this.f6335f = true;
            }
        } else {
            if (!this.f6335f && this.f6334e == i10) {
                return;
            }
            this.f6335f = false;
            this.f6334e = Math.max(0, i10);
        }
        if (this.f6354y != null) {
            k();
            if (this.f6350u != 4 || (v10 = this.f6354y.get()) == null) {
                return;
            }
            v10.requestLayout();
        }
    }

    public final void r(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(o.a(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f6346q && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f6331b && o(i10) <= 0) ? 3 : i10;
        WeakReference<V> weakReference = this.f6354y;
        if (weakReference == null || weakReference.get() == null) {
            s(i10);
            return;
        }
        V v10 = this.f6354y.get();
        a aVar = new a(v10, i11);
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && v10.isAttachedToWindow()) {
            v10.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void s(int i10) {
        if (this.f6350u == i10) {
            return;
        }
        this.f6350u = i10;
        WeakReference<V> weakReference = this.f6354y;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            w(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            w(false);
        }
        v(i10, true);
        while (true) {
            ArrayList<c> arrayList = this.A;
            if (i11 >= arrayList.size()) {
                u();
                return;
            } else {
                arrayList.get(i11).b();
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        s(2);
        v(r4, true);
        r2.f6341l.a(r4);
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
    public final void t(View view, int i10, boolean z10) {
        int iO = o(i10);
        r4.a aVar = this.f6351v;
        if (aVar != null) {
            if (!z10) {
                int left = view.getLeft();
                aVar.f23203r = view;
                aVar.f23188c = -1;
                boolean zH = aVar.h(left, iO, 0, 0);
                if (!zH && aVar.f23186a == 0 && aVar.f23203r != null) {
                    aVar.f23203r = null;
                }
            }
        }
        s(i10);
    }

    public final void u() {
        V v10;
        WeakReference<V> weakReference = this.f6354y;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        q0.e(v10, PKIFailureInfo.badCertTemplate);
        q0.c(v10, 0);
        q0.e(v10, PKIFailureInfo.signerNotTrusted);
        q0.c(v10, 0);
        q0.e(v10, PKIFailureInfo.transactionIdInUse);
        q0.c(v10, 0);
        SparseIntArray sparseIntArray = this.I;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            q0.e(v10, i10);
            q0.c(v10, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.H;
        int i11 = sparseIntArray2.get(0, -1);
        if (i11 != -1) {
            q0.e(v10, i11);
            q0.c(v10, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.J;
        int i12 = sparseIntArray3.get(0, -1);
        if (i12 != -1) {
            q0.e(v10, i12);
            q0.c(v10, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f6331b && this.f6350u != 6) {
            sparseIntArray2.put(0, j(v10, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f6346q && this.f6350u != 5) {
            q0.f(v10, j.a.f34733j, new qb.d(this, 5));
        }
        int i13 = this.f6350u;
        if (i13 == 3) {
            if (this.f6347r && this.f6346q) {
                return;
            }
            sparseIntArray3.put(0, j(v10, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i13 == 4) {
            sparseIntArray.put(0, j(v10, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i13 != 6) {
                return;
            }
            if (!this.f6347r || !this.f6346q) {
                sparseIntArray3.put(0, j(v10, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, j(v10, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void v(int i10, boolean z10) {
        h hVar;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.f6350u == 3 && (this.f6338i || p());
        if (this.f6340k == z11 || (hVar = this.f6336g) == null) {
            return;
        }
        this.f6340k = z11;
        ValueAnimator valueAnimator = this.f6342m;
        if (z10 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(hVar.f34886b.f34920h, z11 ? l() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fL = this.f6340k ? l() : 1.0f;
        h.c cVar = hVar.f34886b;
        if (cVar.f34920h != fL) {
            cVar.f34920h = fL;
            hVar.f34890f = true;
            hVar.f34891g = true;
            hVar.invalidateSelf();
        }
    }

    public final void w(boolean z10) {
        WeakReference<V> weakReference = this.f6354y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof m3.b) {
            m3.b bVar = (m3.b) parent;
            int childCount = bVar.getChildCount();
            if (z10) {
                if (this.G != null) {
                    return;
                } else {
                    this.G = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = bVar.getChildAt(i10);
                if (childAt != this.f6354y.get() && z10) {
                    this.G.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.G = null;
        }
    }

    public static class d extends q4.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f6360c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6361d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f6362e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f6363f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f6364g;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6360c = parcel.readInt();
            this.f6361d = parcel.readInt();
            this.f6362e = parcel.readInt() == 1;
            this.f6363f = parcel.readInt() == 1;
            this.f6364g = parcel.readInt() == 1;
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6360c);
            parcel.writeInt(this.f6361d);
            parcel.writeInt(this.f6362e ? 1 : 0);
            parcel.writeInt(this.f6363f ? 1 : 0);
            parcel.writeInt(this.f6364g ? 1 : 0);
        }

        public d(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f6360c = bottomSheetBehavior.f6350u;
            this.f6361d = bottomSheetBehavior.f6334e;
            this.f6362e = bottomSheetBehavior.f6331b;
            this.f6363f = bottomSheetBehavior.f6346q;
            this.f6364g = bottomSheetBehavior.f6347r;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10;
        int resourceId;
        ColorStateList colorStateList;
        super(context, attributeSet);
        this.f6330a = 0;
        this.f6331b = true;
        this.f6341l = new e();
        this.f6348s = true;
        this.f6349t = true;
        this.f6350u = 4;
        this.f6353x = 0.1f;
        this.f6355z = new ArrayList();
        this.A = new ArrayList<>();
        this.D = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new Rect();
        new b();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f18028b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f6337h = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = p3.b.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f6339j = m.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        m mVar = this.f6339j;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f6336g = hVar;
            hVar.f34886b.f34914b = new ub.a(context);
            hVar.n();
            ColorStateList colorStateList2 = this.f6337h;
            if (colorStateList2 != null) {
                this.f6336g.k(colorStateList2);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f6336g.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(l(), 1.0f);
        this.f6342m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f6342m.addUpdateListener(new qb.c(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            q(i10);
        } else {
            q(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f6346q != z10) {
            this.f6346q = z10;
            if (!z10 && this.f6350u == 5) {
                r(4);
            }
            u();
        }
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f6331b != z11) {
            this.f6331b = z11;
            if (this.f6354y != null) {
                k();
            }
            s((this.f6331b && this.f6350u == 6) ? 3 : this.f6350u);
            v(this.f6350u, true);
            u();
        }
        this.f6347r = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f6348s = typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f6330a = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO && f10 < 1.0f) {
            if (this.f6354y != null) {
                this.f6344o = (int) ((1.0f - f10) * 0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.f6343n = i11;
                    v(this.f6350u, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f6343n = dimensionPixelOffset;
                    v(this.f6350u, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f6332c = typedArrayObtainStyledAttributes.getInt(14, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            this.f6333d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            this.f6349t = typedArrayObtainStyledAttributes.getBoolean(4, true);
            typedArrayObtainStyledAttributes.getBoolean(20, false);
            typedArrayObtainStyledAttributes.getBoolean(21, false);
            typedArrayObtainStyledAttributes.getBoolean(22, false);
            typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.getBoolean(17, false);
            typedArrayObtainStyledAttributes.getBoolean(18, false);
            typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f6338i = typedArrayObtainStyledAttributes.getBoolean(26, true);
            typedArrayObtainStyledAttributes.recycle();
            ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
