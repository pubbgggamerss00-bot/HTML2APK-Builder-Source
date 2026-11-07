package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.g0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import u0.a;
import u0.f0;
import u0.g0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements u0.m {
    public static boolean S0 = false;
    public static boolean T0 = false;
    public static final int[] U0 = {R.attr.nestedScrollingEnabled};
    public static final float V0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean W0 = true;
    public static final boolean X0 = true;
    public static final boolean Y0 = true;
    public static final Class<?>[] Z0;

    /* renamed from: a1, reason: collision with root package name */
    public static final c f1400a1;

    /* renamed from: b1, reason: collision with root package name */
    public static final y f1401b1;
    public final a A;
    public q A0;
    public final Rect B;
    public ArrayList B0;
    public final Rect C;
    public boolean C0;
    public final RectF D;
    public boolean D0;
    public e E;
    public final k E0;
    public m F;
    public boolean F0;
    public t G;
    public androidx.recyclerview.widget.x G0;
    public final ArrayList H;
    public final int[] H0;
    public final ArrayList<l> I;
    public u0.n I0;
    public final ArrayList<p> J;
    public final int[] J0;
    public p K;
    public final int[] K0;
    public boolean L;
    public final int[] L0;
    public boolean M;
    public final ArrayList M0;
    public boolean N;
    public final b N0;
    public int O;
    public boolean O0;
    public boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public final d R0;
    public int S;
    public boolean T;
    public final AccessibilityManager U;
    public boolean V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1402a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1403b0;

    /* renamed from: c0, reason: collision with root package name */
    public i f1404c0;

    /* renamed from: d0, reason: collision with root package name */
    public EdgeEffect f1405d0;

    /* renamed from: e0, reason: collision with root package name */
    public EdgeEffect f1406e0;

    /* renamed from: f0, reason: collision with root package name */
    public EdgeEffect f1407f0;

    /* renamed from: g0, reason: collision with root package name */
    public EdgeEffect f1408g0;

    /* renamed from: h0, reason: collision with root package name */
    public j f1409h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1410i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1411j0;

    /* renamed from: k0, reason: collision with root package name */
    public VelocityTracker f1412k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f1413l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1414m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1415n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f1416o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public o f1417q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f1418r0;
    public final float s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f1419s0;

    /* renamed from: t, reason: collision with root package name */
    public final u f1420t;

    /* renamed from: t0, reason: collision with root package name */
    public final float f1421t0;

    /* renamed from: u, reason: collision with root package name */
    public final s f1422u;

    /* renamed from: u0, reason: collision with root package name */
    public final float f1423u0;

    /* renamed from: v, reason: collision with root package name */
    public v f1424v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f1425v0;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.recyclerview.widget.a f1426w;

    /* renamed from: w0, reason: collision with root package name */
    public final a0 f1427w0;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.recyclerview.widget.b f1428x;

    /* renamed from: x0, reason: collision with root package name */
    public androidx.recyclerview.widget.m f1429x0;

    /* renamed from: y, reason: collision with root package name */
    public final c0 f1430y;

    /* renamed from: y0, reason: collision with root package name */
    public final m.b f1431y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1432z;

    /* renamed from: z0, reason: collision with root package name */
    public final x f1433z0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.N || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.L) {
                recyclerView.requestLayout();
            } else if (recyclerView.Q) {
                recyclerView.P = true;
            } else {
                recyclerView.p();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a0 implements Runnable {
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public int f1434t;

        /* renamed from: u, reason: collision with root package name */
        public OverScroller f1435u;

        /* renamed from: v, reason: collision with root package name */
        public Interpolator f1436v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f1437w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f1438x;

        public a0() {
            c cVar = RecyclerView.f1400a1;
            this.f1436v = cVar;
            this.f1437w = false;
            this.f1438x = false;
            this.f1435u = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i6, int i7) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f1434t = 0;
            this.s = 0;
            Interpolator interpolator = this.f1436v;
            c cVar = RecyclerView.f1400a1;
            if (interpolator != cVar) {
                this.f1436v = cVar;
                this.f1435u = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.f1435u.fling(0, 0, i6, i7, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f1437w) {
                this.f1438x = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i6, int i7, int i8, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i8 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i6);
                int iAbs2 = Math.abs(i7);
                boolean z6 = iAbs > iAbs2;
                int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z6) {
                    iAbs = iAbs2;
                }
                i8 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i9 = i8;
            if (interpolator == null) {
                interpolator = RecyclerView.f1400a1;
            }
            if (this.f1436v != interpolator) {
                this.f1436v = interpolator;
                this.f1435u = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f1434t = 0;
            this.s = 0;
            recyclerView.setScrollState(2);
            this.f1435u.startScroll(0, 0, i6, i7, i9);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6;
            int i7;
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.L0;
            if (recyclerView.F == null) {
                recyclerView.removeCallbacks(this);
                this.f1435u.abortAnimation();
                return;
            }
            this.f1438x = false;
            this.f1437w = true;
            recyclerView.p();
            OverScroller overScroller = this.f1435u;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.s;
                int i11 = currY - this.f1434t;
                this.s = currX;
                this.f1434t = currY;
                int iO = RecyclerView.o(i10, recyclerView.f1405d0, recyclerView.f1407f0, recyclerView.getWidth());
                int iO2 = RecyclerView.o(i11, recyclerView.f1406e0, recyclerView.f1408g0, recyclerView.getHeight());
                int[] iArr2 = recyclerView.L0;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.u(iO, iO2, iArr2, null, 1)) {
                    iO -= iArr[0];
                    iO2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.n(iO, iO2);
                }
                if (recyclerView.E != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.f0(iO, iO2, iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    int i14 = iO - i12;
                    int i15 = iO2 - i13;
                    androidx.recyclerview.widget.o oVar = recyclerView.F.f1476e;
                    if (oVar != null && !oVar.f1515d && oVar.f1516e) {
                        int iB = recyclerView.f1433z0.b();
                        if (iB == 0) {
                            oVar.f();
                        } else if (oVar.f1512a >= iB) {
                            oVar.f1512a = iB - 1;
                            oVar.b(i12, i13);
                        } else {
                            oVar.b(i12, i13);
                        }
                    }
                    i6 = i14;
                    i8 = i12;
                    i7 = i15;
                    i9 = i13;
                } else {
                    i6 = iO;
                    i7 = iO2;
                    i8 = 0;
                    i9 = 0;
                }
                if (!recyclerView.I.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.L0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.v(i8, i9, i6, i7, null, 1, iArr3);
                int i16 = i6 - iArr[0];
                int i17 = i7 - iArr[1];
                if (i8 != 0 || i9 != 0) {
                    recyclerView.w(i8, i9);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
                androidx.recyclerview.widget.o oVar2 = recyclerView.F.f1476e;
                if ((oVar2 == null || !oVar2.f1515d) && z6) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i18 = i16 < 0 ? -currVelocity : i16 > 0 ? currVelocity : 0;
                        if (i17 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i17 <= 0) {
                            currVelocity = 0;
                        }
                        if (i18 < 0) {
                            recyclerView.y();
                            if (recyclerView.f1405d0.isFinished()) {
                                recyclerView.f1405d0.onAbsorb(-i18);
                            }
                        } else if (i18 > 0) {
                            recyclerView.z();
                            if (recyclerView.f1407f0.isFinished()) {
                                recyclerView.f1407f0.onAbsorb(i18);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.A();
                            if (recyclerView.f1406e0.isFinished()) {
                                recyclerView.f1406e0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.x();
                            if (recyclerView.f1408g0.isFinished()) {
                                recyclerView.f1408g0.onAbsorb(currVelocity);
                            }
                        }
                        if (i18 != 0 || currVelocity != 0) {
                            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.Y0) {
                        m.b bVar = recyclerView.f1431y0;
                        int[] iArr4 = bVar.f1689c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f1690d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.m mVar = recyclerView.f1429x0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i8, i9);
                    }
                }
            }
            androidx.recyclerview.widget.o oVar3 = recyclerView.F.f1476e;
            if (oVar3 != null && oVar3.f1515d) {
                oVar3.b(0, 0);
            }
            this.f1437w = false;
            if (!this.f1438x) {
                recyclerView.setScrollState(0);
                recyclerView.l0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z6;
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.f1409h0;
            if (jVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) jVar;
                long j6 = kVar.f1466d;
                ArrayList<b0> arrayList = kVar.h;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar.f1634j;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar.f1635k;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList<b0> arrayList4 = kVar.f1633i;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        b0 b0Var = arrayList.get(i6);
                        i6++;
                        b0 b0Var2 = b0Var;
                        View view = b0Var2.f1441a;
                        ArrayList<b0> arrayList5 = arrayList;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        kVar.f1641q.add(b0Var2);
                        viewPropertyAnimatorAnimate.setDuration(j6).alpha(0.0f).setListener(new androidx.recyclerview.widget.f(view, viewPropertyAnimatorAnimate, kVar, b0Var2)).start();
                        arrayList = arrayList5;
                        zIsEmpty = zIsEmpty;
                        zIsEmpty2 = zIsEmpty2;
                    }
                    boolean z7 = zIsEmpty;
                    boolean z8 = zIsEmpty2;
                    arrayList.clear();
                    if (!z8) {
                        ArrayList<k.b> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList2);
                        kVar.f1637m.add(arrayList6);
                        arrayList2.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList6);
                        if (z7) {
                            cVar.run();
                        } else {
                            View view2 = arrayList6.get(0).f1649a.f1441a;
                            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                            view2.postOnAnimationDelayed(cVar, j6);
                        }
                    }
                    if (!zIsEmpty3) {
                        ArrayList<k.a> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList3);
                        kVar.f1638n.add(arrayList7);
                        arrayList3.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList7);
                        if (z7) {
                            dVar.run();
                        } else {
                            View view3 = arrayList7.get(0).f1643a.f1441a;
                            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                            view3.postOnAnimationDelayed(dVar, j6);
                        }
                    }
                    if (zIsEmpty4) {
                        z6 = false;
                    } else {
                        ArrayList<b0> arrayList8 = new ArrayList<>();
                        arrayList8.addAll(arrayList4);
                        kVar.f1636l.add(arrayList8);
                        arrayList4.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList8);
                        if (z7 && z8 && zIsEmpty3) {
                            eVar.run();
                            z6 = false;
                        } else {
                            if (z7) {
                                j6 = 0;
                            }
                            long jMax = Math.max(!z8 ? kVar.f1467e : 0L, zIsEmpty3 ? 0L : kVar.f1468f) + j6;
                            z6 = false;
                            View view4 = arrayList8.get(0).f1441a;
                            WeakHashMap<View, n0> weakHashMap3 = f0.f14480a;
                            view4.postOnAnimationDelayed(eVar, jMax);
                        }
                    }
                }
            }
            recyclerView.F0 = z6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class b0 {

        /* renamed from: t, reason: collision with root package name */
        public static final List<Object> f1440t = Collections.EMPTY_LIST;

        /* renamed from: a, reason: collision with root package name */
        public final View f1441a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<RecyclerView> f1442b;

        /* renamed from: j, reason: collision with root package name */
        public int f1449j;

        /* renamed from: r, reason: collision with root package name */
        public RecyclerView f1457r;
        public e<? extends b0> s;

        /* renamed from: c, reason: collision with root package name */
        public int f1443c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f1444d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f1445e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f1446f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f1447g = -1;
        public b0 h = null;

        /* renamed from: i, reason: collision with root package name */
        public b0 f1448i = null;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f1450k = null;

        /* renamed from: l, reason: collision with root package name */
        public final List<Object> f1451l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f1452m = 0;

        /* renamed from: n, reason: collision with root package name */
        public s f1453n = null;

        /* renamed from: o, reason: collision with root package name */
        public boolean f1454o = false;

        /* renamed from: p, reason: collision with root package name */
        public int f1455p = 0;

        /* renamed from: q, reason: collision with root package name */
        public int f1456q = -1;

        public b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1441a = view;
        }

        public final void a(int i6) {
            this.f1449j = i6 | this.f1449j;
        }

        public final int b() {
            int i6 = this.f1447g;
            return i6 == -1 ? this.f1443c : i6;
        }

        public final List<Object> c() {
            ArrayList arrayList;
            return ((this.f1449j & 1024) != 0 || (arrayList = this.f1450k) == null || arrayList.size() == 0) ? f1440t : this.f1451l;
        }

        public final boolean d() {
            View view = this.f1441a;
            return (view.getParent() == null || view.getParent() == this.f1457r) ? false : true;
        }

        public final boolean e() {
            return (this.f1449j & 1) != 0;
        }

        public final boolean f() {
            return (this.f1449j & 4) != 0;
        }

        public final boolean g() {
            if ((this.f1449j & 16) != 0) {
                return false;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            return !this.f1441a.hasTransientState();
        }

        public final boolean h() {
            return (this.f1449j & 8) != 0;
        }

        public final boolean i() {
            return this.f1453n != null;
        }

        public final boolean j() {
            return (this.f1449j & 256) != 0;
        }

        public final boolean k() {
            return (this.f1449j & 2) != 0;
        }

        public final void l(int i6, boolean z6) {
            if (this.f1444d == -1) {
                this.f1444d = this.f1443c;
            }
            if (this.f1447g == -1) {
                this.f1447g = this.f1443c;
            }
            if (z6) {
                this.f1447g += i6;
            }
            this.f1443c += i6;
            View view = this.f1441a;
            if (view.getLayoutParams() != null) {
                ((n) view.getLayoutParams()).f1494c = true;
            }
        }

        public final void m() {
            if (RecyclerView.S0 && j()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f1449j = 0;
            this.f1443c = -1;
            this.f1444d = -1;
            this.f1445e = -1L;
            this.f1447g = -1;
            this.f1452m = 0;
            this.h = null;
            this.f1448i = null;
            ArrayList arrayList = this.f1450k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f1449j &= -1025;
            this.f1455p = 0;
            this.f1456q = -1;
            RecyclerView.l(this);
        }

        public final void n(boolean z6) {
            int i6 = this.f1452m;
            int i7 = z6 ? i6 - 1 : i6 + 1;
            this.f1452m = i7;
            if (i7 < 0) {
                this.f1452m = 0;
                if (RecyclerView.S0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z6 && i7 == 1) {
                this.f1449j |= 16;
            } else if (z6 && i7 == 0) {
                this.f1449j &= -17;
            }
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z6 + ":" + this);
            }
        }

        public final boolean o() {
            return (this.f1449j & 128) != 0;
        }

        public final boolean p() {
            return (this.f1449j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1443c + " id=" + this.f1445e + ", oldPos=" + this.f1444d + ", pLpos:" + this.f1447g);
            if (i()) {
                sb.append(" scrap ");
                sb.append(this.f1454o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (f()) {
                sb.append(" invalid");
            }
            if (!e()) {
                sb.append(" unbound");
            }
            if ((this.f1449j & 2) != 0) {
                sb.append(" update");
            }
            if (h()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (j()) {
                sb.append(" tmpDetached");
            }
            if (!g()) {
                sb.append(" not recyclable(" + this.f1452m + ")");
            }
            if ((this.f1449j & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || f()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1441a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d {
        public d() {
        }

        public final void a(b0 b0Var, j.b bVar, j.b bVar2) {
            boolean zG;
            int i6;
            int i7;
            b0Var.n(false);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.f1409h0;
            zVar.getClass();
            if (bVar == null || ((i6 = bVar.f1469a) == (i7 = bVar2.f1469a) && bVar.f1470b == bVar2.f1470b)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.l(b0Var);
                b0Var.f1441a.setAlpha(0.0f);
                kVar.f1633i.add(b0Var);
                zG = true;
            } else {
                zG = zVar.g(b0Var, i6, bVar.f1470b, i7, bVar2.f1470b);
            }
            if (zG) {
                recyclerView.W();
            }
        }

        public final void b(b0 b0Var, j.b bVar, j.b bVar2) {
            boolean zG;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1422u.m(b0Var);
            recyclerView.h(b0Var);
            b0Var.n(false);
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.f1409h0;
            zVar.getClass();
            int i6 = bVar.f1469a;
            int i7 = bVar.f1470b;
            View view = b0Var.f1441a;
            int left = bVar2 == null ? view.getLeft() : bVar2.f1469a;
            int top = bVar2 == null ? view.getTop() : bVar2.f1470b;
            if (b0Var.h() || (i6 == left && i7 == top)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.l(b0Var);
                kVar.h.add(b0Var);
                zG = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zG = zVar.g(b0Var, i6, i7, left, top);
            }
            if (zG) {
                recyclerView.W();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i6) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).b(i6);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface h {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public k f1463a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1464b;

        /* renamed from: c, reason: collision with root package name */
        public long f1465c;

        /* renamed from: d, reason: collision with root package name */
        public long f1466d;

        /* renamed from: e, reason: collision with root package name */
        public long f1467e;

        /* renamed from: f, reason: collision with root package name */
        public long f1468f;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public interface a {
            void a();
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f1469a;

            /* renamed from: b, reason: collision with root package name */
            public int f1470b;

            public final void a(b0 b0Var) {
                View view = b0Var.f1441a;
                this.f1469a = view.getLeft();
                this.f1470b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(b0 b0Var) {
            RecyclerView recyclerView;
            int i6 = b0Var.f1449j;
            if (b0Var.f() || (i6 & 4) != 0 || (recyclerView = b0Var.f1457r) == null) {
                return;
            }
            recyclerView.J(b0Var);
        }

        public abstract boolean a(b0 b0Var, b0 b0Var2, b bVar, b bVar2);

        /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(b0 b0Var) {
            k kVar = this.f1463a;
            if (kVar != null) {
                RecyclerView recyclerView = RecyclerView.this;
                boolean z6 = true;
                b0Var.n(true);
                View view = b0Var.f1441a;
                if (b0Var.h != null && b0Var.f1448i == null) {
                    b0Var.h = null;
                }
                b0Var.f1448i = null;
                if ((b0Var.f1449j & 16) != 0) {
                    return;
                }
                s sVar = recyclerView.f1422u;
                recyclerView.j0();
                androidx.recyclerview.widget.b bVar = recyclerView.f1428x;
                b.a aVar = bVar.f1589b;
                androidx.recyclerview.widget.v vVar = bVar.f1588a;
                int i6 = bVar.f1591d;
                if (i6 != 1) {
                    if (i6 == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        bVar.f1591d = 2;
                        int iIndexOfChild = vVar.f1719a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            bVar.j(view);
                        } else if (aVar.d(iIndexOfChild)) {
                            aVar.f(iIndexOfChild);
                            bVar.j(view);
                            vVar.a(iIndexOfChild);
                        }
                        if (z6) {
                            b0 b0VarM = RecyclerView.M(view);
                            sVar.m(b0VarM);
                            sVar.j(b0VarM);
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.k0(!z6);
                        if (z6 && b0Var.j()) {
                            recyclerView.removeDetachedView(view, false);
                            return;
                        }
                    } finally {
                        bVar.f1591d = 0;
                    }
                }
                if (bVar.f1592e != view) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z6 = false;
                if (z6) {
                }
                recyclerView.k0(!z6);
                if (z6) {
                }
            }
        }

        public abstract void d(b0 b0Var);

        public abstract void e();

        public abstract boolean f();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class k {
        public k() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class o {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface p {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<a> f1496a;

        /* renamed from: b, reason: collision with root package name */
        public int f1497b;

        /* renamed from: c, reason: collision with root package name */
        public Set<e<?>> f1498c;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<b0> f1499a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public int f1500b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f1501c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f1502d = 0;
        }

        public final a a(int i6) {
            SparseArray<a> sparseArray = this.f1496a;
            a aVar = sparseArray.get(i6);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i6, aVar2);
            return aVar2;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class s {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<b0> f1503a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<b0> f1504b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<b0> f1505c;

        /* renamed from: d, reason: collision with root package name */
        public final List<b0> f1506d;

        /* renamed from: e, reason: collision with root package name */
        public int f1507e;

        /* renamed from: f, reason: collision with root package name */
        public int f1508f;

        /* renamed from: g, reason: collision with root package name */
        public r f1509g;

        public s() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f1503a = arrayList;
            this.f1504b = null;
            this.f1505c = new ArrayList<>();
            this.f1506d = Collections.unmodifiableList(arrayList);
            this.f1507e = 2;
            this.f1508f = 2;
        }

        public final void a(b0 b0Var, boolean z6) {
            RecyclerView.l(b0Var);
            View view = b0Var.f1441a;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.x xVar = recyclerView.G0;
            if (xVar != null) {
                x.a aVar = xVar.f1722e;
                f0.m(view, aVar != null ? (u0.a) aVar.f1724e.remove(view) : null);
            }
            if (z6) {
                t tVar = recyclerView.G;
                ArrayList arrayList = recyclerView.H;
                if (tVar != null) {
                    tVar.a();
                }
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((t) arrayList.get(i6)).a();
                }
                e eVar = recyclerView.E;
                if (eVar != null) {
                    eVar.g(b0Var);
                }
                if (recyclerView.f1433z0 != null) {
                    recyclerView.f1430y.d(b0Var);
                }
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + b0Var);
                }
            }
            b0Var.s = null;
            b0Var.f1457r = null;
            r rVarC = c();
            rVarC.getClass();
            int i7 = b0Var.f1446f;
            ArrayList<b0> arrayList2 = rVarC.a(i7).f1499a;
            if (rVarC.f1496a.get(i7).f1500b <= arrayList2.size()) {
                a1.a.c(view);
            } else {
                if (RecyclerView.S0 && arrayList2.contains(b0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                b0Var.m();
                arrayList2.add(b0Var);
            }
        }

        public final int b(int i6) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i6 >= 0 && i6 < recyclerView.f1433z0.b()) {
                return !recyclerView.f1433z0.f1532g ? i6 : recyclerView.f1426w.f(i6, 0);
            }
            throw new IndexOutOfBoundsException("invalid position " + i6 + ". State item count is " + recyclerView.f1433z0.b() + recyclerView.B());
        }

        public final r c() {
            if (this.f1509g == null) {
                r rVar = new r();
                rVar.f1496a = new SparseArray<>();
                rVar.f1497b = 0;
                rVar.f1498c = Collections.newSetFromMap(new IdentityHashMap());
                this.f1509g = rVar;
                e();
            }
            return this.f1509g;
        }

        public final View d(int i6) {
            return l(i6, Long.MAX_VALUE).f1441a;
        }

        public final void e() {
            RecyclerView recyclerView;
            e<?> eVar;
            r rVar = this.f1509g;
            if (rVar == null || (eVar = (recyclerView = RecyclerView.this).E) == null || !recyclerView.L) {
                return;
            }
            rVar.f1498c.add(eVar);
        }

        public final void f(e<?> eVar, boolean z6) {
            r rVar = this.f1509g;
            if (rVar != null) {
                SparseArray<r.a> sparseArray = rVar.f1496a;
                Set<e<?>> set = rVar.f1498c;
                set.remove(eVar);
                if (set.size() != 0 || z6) {
                    return;
                }
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    ArrayList<b0> arrayList = sparseArray.get(sparseArray.keyAt(i6)).f1499a;
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        a1.a.c(arrayList.get(i7).f1441a);
                    }
                }
            }
        }

        public final void g() {
            ArrayList<b0> arrayList = this.f1505c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.Y0) {
                m.b bVar = RecyclerView.this.f1431y0;
                int[] iArr = bVar.f1689c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f1690d = 0;
            }
        }

        public final void h(int i6) {
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i6);
            }
            ArrayList<b0> arrayList = this.f1505c;
            b0 b0Var = arrayList.get(i6);
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + b0Var);
            }
            a(b0Var, true);
            arrayList.remove(i6);
        }

        public final void i(View view) {
            b0 b0VarM = RecyclerView.M(view);
            boolean zJ = b0VarM.j();
            RecyclerView recyclerView = RecyclerView.this;
            if (zJ) {
                recyclerView.removeDetachedView(view, false);
            }
            if (b0VarM.i()) {
                b0VarM.f1453n.m(b0VarM);
            } else if (b0VarM.p()) {
                b0VarM.f1449j &= -33;
            }
            j(b0VarM);
            if (recyclerView.f1409h0 == null || b0VarM.g()) {
                return;
            }
            recyclerView.f1409h0.d(b0VarM);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
        
            r6 = r6 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(b0 b0Var) {
            boolean z6;
            boolean z7;
            int i6;
            RecyclerView recyclerView = RecyclerView.this;
            m.b bVar = recyclerView.f1431y0;
            boolean zI = b0Var.i();
            View view = b0Var.f1441a;
            boolean z8 = true;
            if (zI || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(b0Var.i());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(recyclerView.B());
                throw new IllegalArgumentException(sb.toString());
            }
            if (b0Var.j()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(b0Var);
                throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb2));
            }
            if (b0Var.o()) {
                throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((b0Var.f1449j & 16) == 0) {
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                z6 = view.hasTransientState();
            }
            boolean z9 = RecyclerView.S0;
            ArrayList<b0> arrayList = this.f1505c;
            if (z9 && arrayList.contains(b0Var)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(b0Var);
                throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb3));
            }
            if (b0Var.g()) {
                if (this.f1508f <= 0 || (b0Var.f1449j & 526) != 0) {
                    z7 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f1508f && size > 0) {
                        h(0);
                        size--;
                    }
                    if (RecyclerView.Y0 && size > 0) {
                        int i7 = b0Var.f1443c;
                        if (bVar.f1689c != null) {
                            int i8 = bVar.f1690d * 2;
                            for (int i9 = 0; i9 < i8; i9 += 2) {
                                if (bVar.f1689c[i9] == i7) {
                                    break;
                                }
                            }
                            i6 = size - 1;
                            loop1: while (i6 >= 0) {
                                int i10 = arrayList.get(i6).f1443c;
                                if (bVar.f1689c == null) {
                                    break;
                                }
                                int i11 = bVar.f1690d * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (bVar.f1689c[i12] == i10) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i6 + 1;
                        } else {
                            i6 = size - 1;
                            loop1: while (i6 >= 0) {
                            }
                            size = i6 + 1;
                        }
                    }
                    arrayList.add(size, b0Var);
                    z7 = true;
                }
                if (z7) {
                    z8 = false;
                } else {
                    a(b0Var, true);
                }
                z = z7;
            } else {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                }
                z8 = false;
            }
            recyclerView.f1430y.d(b0Var);
            if (z || z8 || !z6) {
                return;
            }
            a1.a.c(view);
            b0Var.s = null;
            b0Var.f1457r = null;
        }

        public final void k(View view) {
            j jVar;
            b0 b0VarM = RecyclerView.M(view);
            int i6 = b0VarM.f1449j & 12;
            RecyclerView recyclerView = RecyclerView.this;
            if (i6 == 0 && b0VarM.k() && (jVar = recyclerView.f1409h0) != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) jVar;
                if (b0VarM.c().isEmpty() && kVar.f1725g && !b0VarM.f()) {
                    if (this.f1504b == null) {
                        this.f1504b = new ArrayList<>();
                    }
                    b0VarM.f1453n = this;
                    b0VarM.f1454o = true;
                    this.f1504b.add(b0VarM);
                    return;
                }
            }
            if (b0VarM.f() && !b0VarM.h() && !recyclerView.E.f1460b) {
                throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            b0VarM.f1453n = this;
            b0VarM.f1454o = false;
            this.f1503a.add(b0VarM);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0369  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x04ca  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x0611  */
        /* JADX WARN: Removed duplicated region for block: B:354:0x061b  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x0631 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:362:0x0634  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b0 l(int i6, long j6) {
            boolean z6;
            b0 b0VarD;
            boolean z7;
            long j7;
            long j8;
            boolean z8;
            boolean z9;
            boolean z10;
            ViewGroup.LayoutParams layoutParams;
            n nVar;
            RecyclerView recyclerViewG;
            b0 b0VarRemove;
            int i7;
            View view;
            boolean z11;
            int size;
            int iF;
            RecyclerView recyclerView = RecyclerView.this;
            x xVar = recyclerView.f1433z0;
            if (i6 < 0 || i6 >= xVar.b()) {
                StringBuilder sbA = g0.a("Invalid item position ", i6, "(", i6, "). Item count:");
                sbA.append(xVar.b());
                sbA.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (xVar.f1532g) {
                ArrayList<b0> arrayList = this.f1504b;
                if (arrayList == null || (size = arrayList.size()) == 0) {
                    b0VarD = null;
                    z6 = b0VarD == null;
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            b0VarD = this.f1504b.get(i8);
                            if (!b0VarD.p() && b0VarD.b() == i6) {
                                b0VarD.a(32);
                                break;
                            }
                            i8++;
                        } else if (recyclerView.E.f1460b && (iF = recyclerView.f1426w.f(i6, 0)) > 0 && iF < recyclerView.E.a()) {
                            long jB = recyclerView.E.b(iF);
                            for (int i9 = 0; i9 < size; i9++) {
                                b0 b0Var = this.f1504b.get(i9);
                                if (!b0Var.p() && b0Var.f1445e == jB) {
                                    b0Var.a(32);
                                    b0VarD = b0Var;
                                    break;
                                }
                            }
                        }
                    }
                    b0VarD = null;
                    if (b0VarD == null) {
                    }
                }
            } else {
                z6 = false;
                b0VarD = null;
            }
            ArrayList<b0> arrayList2 = this.f1503a;
            ArrayList<b0> arrayList3 = this.f1505c;
            if (b0VarD == null) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    b0 b0Var2 = arrayList2.get(i10);
                    if (!b0Var2.p() && b0Var2.b() == i6 && !b0Var2.f() && (xVar.f1532g || !b0Var2.h())) {
                        b0Var2.a(32);
                        b0VarD = b0Var2;
                        z7 = true;
                        break;
                    }
                }
                ArrayList arrayList4 = recyclerView.f1428x.f1590c;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size3) {
                        z7 = true;
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i11);
                    b0 b0VarM = RecyclerView.M(view);
                    z7 = true;
                    if (b0VarM.b() == i6 && !b0VarM.f() && !b0VarM.h()) {
                        break;
                    }
                    i11++;
                }
                if (view == null) {
                    int size4 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size4) {
                            b0VarD = null;
                            break;
                        }
                        b0 b0Var3 = arrayList3.get(i12);
                        if (b0Var3.f() || b0Var3.b() != i6 || b0Var3.d()) {
                            i12++;
                        } else {
                            arrayList3.remove(i12);
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i6 + ") found match in cache: " + b0Var3);
                            }
                            b0VarD = b0Var3;
                        }
                    }
                } else {
                    b0 b0VarM2 = RecyclerView.M(view);
                    androidx.recyclerview.widget.b bVar = recyclerView.f1428x;
                    b.a aVar = bVar.f1589b;
                    int iIndexOfChild = bVar.f1588a.f1719a.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                    if (!aVar.d(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    aVar.a(iIndexOfChild);
                    bVar.j(view);
                    androidx.recyclerview.widget.b bVar2 = recyclerView.f1428x;
                    b.a aVar2 = bVar2.f1589b;
                    int iIndexOfChild2 = bVar2.f1588a.f1719a.indexOfChild(view);
                    int iB = (iIndexOfChild2 == -1 || aVar2.d(iIndexOfChild2)) ? -1 : iIndexOfChild2 - aVar2.b(iIndexOfChild2);
                    if (iB == -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(b0VarM2);
                        throw new IllegalStateException(androidx.activity.m.c(recyclerView, sb));
                    }
                    recyclerView.f1428x.c(iB);
                    k(view);
                    b0VarM2.a(8224);
                    b0VarD = b0VarM2;
                }
                if (b0VarD != null) {
                    if (!b0VarD.h()) {
                        int i13 = b0VarD.f1443c;
                        if (i13 < 0 || i13 >= recyclerView.E.a()) {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(b0VarD);
                            throw new IndexOutOfBoundsException(androidx.activity.m.c(recyclerView, sb2));
                        }
                        if (!xVar.f1532g) {
                            recyclerView.E.getClass();
                            if (b0VarD.f1446f != 0) {
                                z11 = false;
                            } else {
                                e eVar = recyclerView.E;
                                if (!eVar.f1460b || b0VarD.f1445e == eVar.b(b0VarD.f1443c)) {
                                    z11 = z7;
                                }
                            }
                        }
                    } else {
                        if (RecyclerView.S0 && !xVar.f1532g) {
                            throw new IllegalStateException(androidx.activity.m.c(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z11 = xVar.f1532g;
                    }
                    if (z11) {
                        z6 = z7;
                    } else {
                        b0VarD.a(4);
                        if (b0VarD.i()) {
                            recyclerView.removeDetachedView(b0VarD.f1441a, false);
                            b0VarD.f1453n.m(b0VarD);
                        } else if (b0VarD.p()) {
                            b0VarD.f1449j &= -33;
                        }
                        j(b0VarD);
                        b0VarD = null;
                    }
                }
            } else {
                z7 = true;
            }
            if (b0VarD == null) {
                int iF2 = recyclerView.f1426w.f(i6, 0);
                if (iF2 >= 0) {
                    j7 = 3;
                    if (iF2 < recyclerView.E.a()) {
                        recyclerView.E.getClass();
                        e eVar2 = recyclerView.E;
                        if (eVar2.f1460b) {
                            long jB2 = eVar2.b(iF2);
                            int size5 = arrayList2.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    j8 = 4;
                                    b0 b0Var4 = arrayList2.get(size5);
                                    i7 = iF2;
                                    long j9 = b0Var4.f1445e;
                                    View view2 = b0Var4.f1441a;
                                    if (j9 == jB2 && !b0Var4.p()) {
                                        if (b0Var4.f1446f == 0) {
                                            b0Var4.a(32);
                                            if (b0Var4.h() && !xVar.f1532g) {
                                                b0Var4.f1449j = (b0Var4.f1449j & (-15)) | 2;
                                            }
                                            b0VarD = b0Var4;
                                        } else {
                                            arrayList2.remove(size5);
                                            recyclerView.removeDetachedView(view2, false);
                                            b0 b0VarM3 = RecyclerView.M(view2);
                                            b0VarM3.f1453n = null;
                                            b0VarM3.f1454o = false;
                                            b0VarM3.f1449j &= -33;
                                            j(b0VarM3);
                                        }
                                    }
                                    size5--;
                                    iF2 = i7;
                                } else {
                                    i7 = iF2;
                                    j8 = 4;
                                    int size6 = arrayList3.size() - 1;
                                    while (true) {
                                        if (size6 < 0) {
                                            break;
                                        }
                                        b0 b0Var5 = arrayList3.get(size6);
                                        if (b0Var5.f1445e != jB2 || b0Var5.d()) {
                                            size6--;
                                        } else if (b0Var5.f1446f == 0) {
                                            arrayList3.remove(size6);
                                            b0VarD = b0Var5;
                                        } else {
                                            h(size6);
                                        }
                                    }
                                    b0VarD = null;
                                }
                            }
                            if (b0VarD != null) {
                                b0VarD.f1443c = i7;
                                z6 = z7;
                            }
                        } else {
                            j8 = 4;
                        }
                        if (b0VarD == null) {
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i6 + ") fetching from shared pool");
                            }
                            r.a aVar3 = c().f1496a.get(0);
                            if (aVar3 != null) {
                                ArrayList<b0> arrayList5 = aVar3.f1499a;
                                if (arrayList5.isEmpty()) {
                                    b0VarRemove = null;
                                    if (b0VarRemove != null) {
                                    }
                                    b0VarD = b0VarRemove;
                                } else {
                                    for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                        if (!arrayList5.get(size7).d()) {
                                            b0VarRemove = arrayList5.remove(size7);
                                            break;
                                        }
                                    }
                                    b0VarRemove = null;
                                    if (b0VarRemove != null) {
                                        b0VarRemove.m();
                                        boolean z12 = RecyclerView.S0;
                                    }
                                    b0VarD = b0VarRemove;
                                }
                            }
                        }
                        if (b0VarD == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j6 != Long.MAX_VALUE) {
                                long j10 = this.f1509g.a(0).f1501c;
                                if (!((j10 == 0 || j10 + nanoTime < j6) ? z7 : false)) {
                                    return null;
                                }
                            }
                            e eVar3 = recyclerView.E;
                            eVar3.getClass();
                            try {
                                int i14 = q0.j.f14103a;
                                Trace.beginSection("RV CreateView");
                                b0VarD = eVar3.d(recyclerView);
                                View view3 = b0VarD.f1441a;
                                if (view3.getParent() != null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                b0VarD.f1446f = 0;
                                Trace.endSection();
                                if (RecyclerView.Y0 && (recyclerViewG = RecyclerView.G(view3)) != null) {
                                    b0VarD.f1442b = new WeakReference<>(recyclerViewG);
                                }
                                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                r.a aVarA = this.f1509g.a(0);
                                long j11 = aVarA.f1501c;
                                if (j11 != 0) {
                                    nanoTime2 = (nanoTime2 / j8) + ((j11 / j8) * 3);
                                }
                                aVarA.f1501c = nanoTime2;
                                if (RecyclerView.T0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } finally {
                                int i15 = q0.j.f14103a;
                                Trace.endSection();
                            }
                        }
                    }
                }
                StringBuilder sbA2 = g0.a("Inconsistency detected. Invalid item position ", i6, "(offset:", iF2, ").state:");
                sbA2.append(xVar.b());
                sbA2.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbA2.toString());
            }
            j7 = 3;
            j8 = 4;
            View view4 = b0VarD.f1441a;
            if (z6 && !xVar.f1532g) {
                int i16 = b0VarD.f1449j;
                if ((i16 & 8192) != 0 ? z7 : false) {
                    b0VarD.f1449j = i16 & (-8193);
                    if (xVar.f1534j) {
                        j.b(b0VarD);
                        j jVar = recyclerView.f1409h0;
                        b0VarD.c();
                        jVar.getClass();
                        j.b bVar3 = new j.b();
                        bVar3.a(b0VarD);
                        recyclerView.Z(b0VarD, bVar3);
                    }
                }
            }
            if (!xVar.f1532g || !b0VarD.e()) {
                if (b0VarD.e()) {
                    if (((b0VarD.f1449j & 2) != 0 ? z7 : false) || b0VarD.f()) {
                    }
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                        nVar = (n) recyclerView.generateDefaultLayoutParams();
                        view4.setLayoutParams(nVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        nVar = (n) layoutParams;
                    } else {
                        nVar = (n) recyclerView.generateLayoutParams(layoutParams);
                        view4.setLayoutParams(nVar);
                    }
                    nVar.f1492a = b0VarD;
                    if (!z6 || !z10) {
                        z9 = false;
                    }
                    nVar.f1495d = z9;
                    return b0VarD;
                }
                if (RecyclerView.S0 && b0VarD.h()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(b0VarD);
                    throw new IllegalStateException(androidx.activity.m.c(recyclerView, sb3));
                }
                int iF3 = recyclerView.f1426w.f(i6, 0);
                b0VarD.s = null;
                b0VarD.f1457r = recyclerView;
                int i17 = b0VarD.f1446f;
                long nanoTime3 = recyclerView.getNanoTime();
                if (j6 != Long.MAX_VALUE) {
                    long j12 = this.f1509g.a(i17).f1502d;
                    if (j12 == 0 || j12 + nanoTime3 < j6) {
                        if (b0VarD.j()) {
                            recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                            z8 = z7;
                        } else {
                            z8 = false;
                        }
                        e<? extends b0> eVar4 = recyclerView.E;
                        eVar4.getClass();
                        boolean z13 = b0VarD.s == null ? z7 : false;
                        if (z13) {
                            b0VarD.f1443c = iF3;
                            if (eVar4.f1460b) {
                                b0VarD.f1445e = eVar4.b(iF3);
                            }
                            b0VarD.f1449j = (b0VarD.f1449j & (-520)) | 1;
                            int i18 = q0.j.f14103a;
                            Trace.beginSection("RV OnBindView");
                        }
                        b0VarD.s = eVar4;
                        if (RecyclerView.S0) {
                            if (view4.getParent() == null) {
                                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                                if (view4.isAttachedToWindow() != b0VarD.j()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + b0VarD.j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + b0VarD);
                                }
                            }
                            if (view4.getParent() == null) {
                                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                                if (view4.isAttachedToWindow()) {
                                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + b0VarD);
                                }
                            }
                        }
                        b0VarD.c();
                        eVar4.c(b0VarD, iF3);
                        if (z13) {
                            ArrayList arrayList6 = b0VarD.f1450k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            b0VarD.f1449j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof n) {
                                ((n) layoutParams2).f1494c = z7;
                            }
                        }
                        if (z8) {
                            recyclerView.detachViewFromParent(view4);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        r.a aVarA2 = this.f1509g.a(b0VarD.f1446f);
                        long j13 = aVarA2.f1502d;
                        if (j13 != 0) {
                            nanoTime4 = (nanoTime4 / j8) + ((j13 / j8) * j7);
                        }
                        aVarA2.f1502d = nanoTime4;
                        AccessibilityManager accessibilityManager = recyclerView.U;
                        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                            WeakHashMap<View, n0> weakHashMap3 = f0.f14480a;
                            z9 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            androidx.recyclerview.widget.x xVar2 = recyclerView.G0;
                            if (xVar2 != null) {
                                x.a aVar4 = xVar2.f1722e;
                                if (aVar4 != null) {
                                    View.AccessibilityDelegate accessibilityDelegateD = f0.d(view4);
                                    u0.a aVar5 = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a.C0093a ? ((a.C0093a) accessibilityDelegateD).f14448a : new u0.a(accessibilityDelegateD);
                                    if (aVar5 != null && aVar5 != aVar4) {
                                        aVar4.f1724e.put(view4, aVar5);
                                    }
                                }
                                f0.m(view4, aVar4);
                            }
                        } else {
                            z9 = true;
                        }
                        if (xVar.f1532g) {
                            b0VarD.f1447g = i6;
                        }
                        z10 = z9;
                    } else {
                        z10 = false;
                        z9 = z7;
                    }
                }
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                }
                nVar.f1492a = b0VarD;
                if (!z6) {
                    z9 = false;
                }
                nVar.f1495d = z9;
                return b0VarD;
            }
            b0VarD.f1447g = i6;
            z9 = z7;
            z10 = false;
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            nVar.f1492a = b0VarD;
            if (!z6) {
            }
            nVar.f1495d = z9;
            return b0VarD;
        }

        public final void m(b0 b0Var) {
            if (b0Var.f1454o) {
                this.f1504b.remove(b0Var);
            } else {
                this.f1503a.remove(b0Var);
            }
            b0Var.f1453n = null;
            b0Var.f1454o = false;
            b0Var.f1449j &= -33;
        }

        public final void n() {
            m mVar = RecyclerView.this.F;
            this.f1508f = this.f1507e + (mVar != null ? mVar.f1480j : 0);
            ArrayList<b0> arrayList = this.f1505c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1508f; size--) {
                h(size);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface t {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class u extends g {
        public u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            recyclerView.f1433z0.f1531f = true;
            recyclerView.Y(true);
            if (recyclerView.f1426w.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i6) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f1426w;
            ArrayList<a.C0018a> arrayList = aVar.f1576b;
            arrayList.add(aVar.h(4, i6, 1));
            aVar.f1580f |= 4;
            if (arrayList.size() == 1) {
                if (!RecyclerView.X0 || !recyclerView.M || !recyclerView.L) {
                    recyclerView.T = true;
                    recyclerView.requestLayout();
                } else {
                    a aVar2 = recyclerView.A;
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    recyclerView.postOnAnimation(aVar2);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class v extends b1.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public Parcelable f1511u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new v[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1511u = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // b1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeParcelable(this.f1511u, 0);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class w {

        /* renamed from: a, reason: collision with root package name */
        public int f1512a = -1;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f1513b;

        /* renamed from: c, reason: collision with root package name */
        public m f1514c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1515d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1516e;

        /* renamed from: f, reason: collision with root package name */
        public View f1517f;

        /* renamed from: g, reason: collision with root package name */
        public final a f1518g;
        public boolean h;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f1519a;

            /* renamed from: b, reason: collision with root package name */
            public int f1520b;

            /* renamed from: c, reason: collision with root package name */
            public int f1521c;

            /* renamed from: d, reason: collision with root package name */
            public int f1522d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f1523e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f1524f;

            /* renamed from: g, reason: collision with root package name */
            public int f1525g;

            public final void a(RecyclerView recyclerView) {
                int i6 = this.f1522d;
                if (i6 >= 0) {
                    this.f1522d = -1;
                    recyclerView.Q(i6);
                    this.f1524f = false;
                    return;
                }
                if (!this.f1524f) {
                    this.f1525g = 0;
                    return;
                }
                Interpolator interpolator = this.f1523e;
                if (interpolator != null && this.f1521c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i7 = this.f1521c;
                if (i7 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f1427w0.c(this.f1519a, this.f1520b, i7, interpolator);
                int i8 = this.f1525g + 1;
                this.f1525g = i8;
                if (i8 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f1524f = false;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public interface b {
            PointF a(int i6);
        }

        public w() {
            a aVar = new a();
            aVar.f1522d = -1;
            aVar.f1524f = false;
            aVar.f1525g = 0;
            aVar.f1519a = 0;
            aVar.f1520b = 0;
            aVar.f1521c = Integer.MIN_VALUE;
            aVar.f1523e = null;
            this.f1518g = aVar;
        }

        public PointF a(int i6) {
            Object obj = this.f1514c;
            if (obj instanceof b) {
                return ((b) obj).a(i6);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i6, int i7) {
            PointF pointFA;
            RecyclerView recyclerView = this.f1513b;
            if (this.f1512a == -1 || recyclerView == null) {
                f();
            }
            if (this.f1515d && this.f1517f == null && this.f1514c != null && (pointFA = a(this.f1512a)) != null) {
                float f6 = pointFA.x;
                if (f6 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.f0((int) Math.signum(f6), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f1515d = false;
            View view = this.f1517f;
            a aVar = this.f1518g;
            if (view != null) {
                this.f1513b.getClass();
                b0 b0VarM = RecyclerView.M(view);
                if ((b0VarM != null ? b0VarM.b() : -1) == this.f1512a) {
                    View view2 = this.f1517f;
                    x xVar = recyclerView.f1433z0;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1517f = null;
                }
            }
            if (this.f1516e) {
                x xVar2 = recyclerView.f1433z0;
                c(i6, i7, aVar);
                boolean z6 = aVar.f1522d >= 0;
                aVar.a(recyclerView);
                if (z6 && this.f1516e) {
                    this.f1515d = true;
                    recyclerView.f1427w0.b();
                }
            }
        }

        public abstract void c(int i6, int i7, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (this.f1516e) {
                this.f1516e = false;
                d();
                this.f1513b.f1433z0.f1526a = -1;
                this.f1517f = null;
                this.f1512a = -1;
                this.f1515d = false;
                m mVar = this.f1514c;
                if (mVar.f1476e == this) {
                    mVar.f1476e = null;
                }
                this.f1514c = null;
                this.f1513b = null;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class x {

        /* renamed from: a, reason: collision with root package name */
        public int f1526a;

        /* renamed from: b, reason: collision with root package name */
        public int f1527b;

        /* renamed from: c, reason: collision with root package name */
        public int f1528c;

        /* renamed from: d, reason: collision with root package name */
        public int f1529d;

        /* renamed from: e, reason: collision with root package name */
        public int f1530e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1531f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1532g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1533i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1534j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1535k;

        /* renamed from: l, reason: collision with root package name */
        public int f1536l;

        /* renamed from: m, reason: collision with root package name */
        public long f1537m;

        /* renamed from: n, reason: collision with root package name */
        public int f1538n;

        public final void a(int i6) {
            if ((this.f1529d & i6) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f1529d));
        }

        public final int b() {
            return this.f1532g ? this.f1527b - this.f1528c : this.f1530e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f1526a + ", mData=null, mItemCount=" + this.f1530e + ", mIsMeasuring=" + this.f1533i + ", mPreviousLayoutItemCount=" + this.f1527b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1528c + ", mStructureChanged=" + this.f1531f + ", mInPreLayout=" + this.f1532g + ", mRunSimpleAnimations=" + this.f1534j + ", mRunPredictiveAnimations=" + this.f1535k + '}';
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class y extends i {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class z {
    }

    static {
        Class cls = Integer.TYPE;
        Z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1400a1 = new c();
        f1401b1 = new y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.htmltoapk.template.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView recyclerViewG = G(viewGroup.getChildAt(i6));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static b0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f1492a;
    }

    private u0.n getScrollingChildHelper() {
        if (this.I0 == null) {
            this.I0 = new u0.n(this);
        }
        return this.I0;
    }

    public static void l(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f1442b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == b0Var.f1441a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            b0Var.f1442b = null;
        }
    }

    public static int o(int i6, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i7) {
        if (i6 > 0 && edgeEffect != null && y0.b.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(y0.b.b(edgeEffect, ((-i6) * 4.0f) / i7, 0.5f) * ((-i7) / 4.0f));
            if (iRound != i6) {
                edgeEffect.finish();
            }
            return i6 - iRound;
        }
        if (i6 >= 0 || edgeEffect2 == null || y0.b.a(edgeEffect2) == 0.0f) {
            return i6;
        }
        float f6 = i7;
        int iRound2 = Math.round(y0.b.b(edgeEffect2, (i6 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
        if (iRound2 != i6) {
            edgeEffect2.finish();
        }
        return i6 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z6) {
        S0 = z6;
    }

    public static void setVerboseLoggingEnabled(boolean z6) {
        T0 = z6;
    }

    public final void A() {
        if (this.f1406e0 != null) {
            return;
        }
        ((y) this.f1404c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1406e0 = edgeEffect;
        if (this.f1432z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.E + ", layout:" + this.F + ", context:" + getContext();
    }

    public final void C(x xVar) {
        if (getScrollState() != 2) {
            xVar.getClass();
            return;
        }
        OverScroller overScroller = this.f1427w0.f1435u;
        overScroller.getFinalX();
        overScroller.getCurrX();
        xVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<p> arrayList = this.J;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = arrayList.get(i6);
            if (pVar.b(motionEvent) && action != 3) {
                this.K = pVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int iE = this.f1428x.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < iE; i8++) {
            b0 b0VarM = M(this.f1428x.d(i8));
            if (!b0VarM.o()) {
                int iB = b0VarM.b();
                if (iB < i6) {
                    i6 = iB;
                }
                if (iB > i7) {
                    i7 = iB;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public final b0 H(int i6) {
        b0 b0Var = null;
        if (this.V) {
            return null;
        }
        int iH = this.f1428x.h();
        for (int i7 = 0; i7 < iH; i7++) {
            b0 b0VarM = M(this.f1428x.g(i7));
            if (b0VarM != null && !b0VarM.h() && J(b0VarM) == i6) {
                if (!this.f1428x.f1590c.contains(b0VarM.f1441a)) {
                    return b0VarM;
                }
                b0Var = b0VarM;
            }
        }
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.recyclerview.widget.a0, androidx.recyclerview.widget.u] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.recyclerview.widget.RecyclerView$m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(int i6, int i7) {
        int iMax;
        int i8;
        a0 a0Var;
        int i9;
        float f6;
        float f7;
        int i10;
        boolean z6;
        boolean z7;
        int minFlingVelocity;
        boolean z8;
        androidx.recyclerview.widget.t tVar;
        int iH;
        PointF pointFA;
        int i11;
        m mVar = this.F;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.Q) {
            ?? D = mVar.d();
            boolean zE = this.F.e();
            int i12 = this.f1418r0;
            int i13 = (!D == true || Math.abs(i6) < i12) ? 0 : i6;
            int iMax2 = (!zE || Math.abs(i7) < i12) ? 0 : i7;
            if (i13 != 0 || iMax2 != 0) {
                if (i13 == 0) {
                    iMax = 0;
                    if (iMax2 == 0) {
                        i8 = iMax2;
                        iMax2 = 0;
                        a0Var = this.f1427w0;
                        i9 = this.f1419s0;
                        if (iMax == 0 || iMax2 != 0) {
                            int i14 = -i9;
                            iMax = Math.max(i14, Math.min(iMax, i9));
                            iMax2 = Math.max(i14, Math.min(iMax2, i9));
                            a0Var.a(iMax, iMax2);
                        }
                        if (i13 == 0 || i8 != 0) {
                            f6 = i13;
                            f7 = i8;
                            if (!dispatchNestedPreFling(f6, f7)) {
                                boolean z9 = D == true || zE;
                                dispatchNestedFling(f6, f7, z9);
                                o oVar = this.f1417q0;
                                if (oVar != null) {
                                    androidx.recyclerview.widget.a0 a0Var2 = (androidx.recyclerview.widget.a0) oVar;
                                    ?? layoutManager = a0Var2.f1584a.getLayoutManager();
                                    if (layoutManager == 0 || a0Var2.f1584a.getAdapter() == null || ((Math.abs(i8) <= (minFlingVelocity = a0Var2.f1584a.getMinFlingVelocity()) && Math.abs(i13) <= minFlingVelocity) || !((z8 = layoutManager instanceof w.b)))) {
                                        i10 = D;
                                        z6 = false;
                                    } else {
                                        ?? r42 = (androidx.recyclerview.widget.u) a0Var2;
                                        if (z8) {
                                            z6 = false;
                                            tVar = new androidx.recyclerview.widget.t(r42, r42.f1584a.getContext());
                                        } else {
                                            z6 = false;
                                            tVar = null;
                                        }
                                        if (tVar == null) {
                                            i10 = D;
                                        } else {
                                            int iB = layoutManager.B();
                                            if (iB != 0) {
                                                androidx.recyclerview.widget.s sVarG = layoutManager.e() ? r42.g(layoutManager) : layoutManager.d() ? r42.f(layoutManager) : null;
                                                if (sVarG == null) {
                                                    i10 = D;
                                                    z7 = true;
                                                } else {
                                                    int iV = layoutManager.v();
                                                    z7 = true;
                                                    ?? r02 = z6;
                                                    int i15 = Integer.MIN_VALUE;
                                                    int i16 = Integer.MAX_VALUE;
                                                    View view = null;
                                                    View view2 = null;
                                                    int i17 = D;
                                                    while (r02 < iV) {
                                                        int i18 = i17;
                                                        View viewU = layoutManager.u(r02);
                                                        if (viewU == null) {
                                                            i11 = r02;
                                                        } else {
                                                            i11 = r02;
                                                            int iD = androidx.recyclerview.widget.u.d(viewU, sVarG);
                                                            if (iD <= 0 && iD > i15) {
                                                                i15 = iD;
                                                                view2 = viewU;
                                                            }
                                                            if (iD >= 0 && iD < i16) {
                                                                i16 = iD;
                                                                view = viewU;
                                                            }
                                                        }
                                                        i17 = i18;
                                                        r02 = i11 + 1;
                                                    }
                                                    i10 = i17;
                                                    boolean z10 = (!layoutManager.d() ? i8 > 0 : i13 > 0) ? z6 : true;
                                                    if (z10 && view != null) {
                                                        iH = m.H(view);
                                                    } else if (z10 || view2 == null) {
                                                        if (z10) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            iH = (((!z8 || (pointFA = ((w.b) layoutManager).a(layoutManager.B() + (-1))) == null || ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) >= 0 && (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) >= 0)) ? z6 : true) == z10 ? -1 : 1) + m.H(view);
                                                            if (iH < 0 || iH >= iB) {
                                                            }
                                                        }
                                                    } else {
                                                        iH = m.H(view2);
                                                    }
                                                    if (iH != -1) {
                                                        tVar.f1512a = iH;
                                                        layoutManager.A0(tVar);
                                                        return z7;
                                                    }
                                                }
                                                iH = -1;
                                                if (iH != -1) {
                                                }
                                            }
                                        }
                                    }
                                    z7 = true;
                                }
                                if (!z9) {
                                    return z6;
                                }
                                boolean z11 = z7;
                                getScrollingChildHelper().g(zE ? i10 | 2 : i10, z11 ? 1 : 0);
                                int i19 = -i9;
                                a0Var.a(Math.max(i19, Math.min(i13, i9)), Math.max(i19, Math.min(i8, i9)));
                                return z11;
                            }
                        } else if (iMax != 0 || iMax2 != 0) {
                            return true;
                        }
                    } else {
                        EdgeEffect edgeEffect = this.f1406e0;
                        if (edgeEffect == null || y0.b.a(edgeEffect) == 0.0f) {
                            EdgeEffect edgeEffect2 = this.f1408g0;
                            if (edgeEffect2 != null && y0.b.a(edgeEffect2) != 0.0f) {
                                if (h0(this.f1408g0, iMax2, getHeight())) {
                                    this.f1408g0.onAbsorb(iMax2);
                                    iMax2 = 0;
                                }
                                i8 = 0;
                                a0Var = this.f1427w0;
                                i9 = this.f1419s0;
                                if (iMax == 0) {
                                    int i142 = -i9;
                                    iMax = Math.max(i142, Math.min(iMax, i9));
                                    iMax2 = Math.max(i142, Math.min(iMax2, i9));
                                    a0Var.a(iMax, iMax2);
                                    if (i13 == 0) {
                                        f6 = i13;
                                        f7 = i8;
                                        if (!dispatchNestedPreFling(f6, f7)) {
                                        }
                                    }
                                }
                            }
                            i8 = iMax2;
                            iMax2 = 0;
                            a0Var = this.f1427w0;
                            i9 = this.f1419s0;
                            if (iMax == 0) {
                            }
                        } else {
                            int i20 = -iMax2;
                            if (h0(this.f1406e0, i20, getHeight())) {
                                this.f1406e0.onAbsorb(i20);
                                iMax2 = 0;
                            }
                            i8 = 0;
                            a0Var = this.f1427w0;
                            i9 = this.f1419s0;
                            if (iMax == 0) {
                            }
                        }
                    }
                } else {
                    EdgeEffect edgeEffect3 = this.f1405d0;
                    if (edgeEffect3 == null || y0.b.a(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f1407f0;
                        if (edgeEffect4 != null && y0.b.a(edgeEffect4) != 0.0f) {
                            if (h0(this.f1407f0, i13, getWidth())) {
                                this.f1407f0.onAbsorb(i13);
                                i13 = 0;
                            }
                            iMax = i13;
                            i13 = 0;
                            if (iMax2 == 0) {
                            }
                        }
                        iMax = 0;
                        if (iMax2 == 0) {
                        }
                    } else {
                        int i21 = -i13;
                        if (h0(this.f1405d0, i21, getWidth())) {
                            this.f1405d0.onAbsorb(i21);
                            i13 = 0;
                        }
                        iMax = i13;
                        i13 = 0;
                        if (iMax2 == 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int J(b0 b0Var) {
        if ((b0Var.f1449j & 524) == 0 && b0Var.e()) {
            int i6 = b0Var.f1443c;
            ArrayList<a.C0018a> arrayList = this.f1426w.f1576b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                a.C0018a c0018a = arrayList.get(i7);
                int i8 = c0018a.f1581a;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int i9 = c0018a.f1582b;
                        if (i9 <= i6) {
                            int i10 = c0018a.f1583c;
                            if (i9 + i10 <= i6) {
                                i6 -= i10;
                            }
                        } else {
                            continue;
                        }
                    } else if (i8 == 8) {
                        int i11 = c0018a.f1582b;
                        if (i11 == i6) {
                            i6 = c0018a.f1583c;
                        } else {
                            if (i11 < i6) {
                                i6--;
                            }
                            if (c0018a.f1583c <= i6) {
                                i6++;
                            }
                        }
                    }
                } else if (c0018a.f1582b <= i6) {
                    i6 += c0018a.f1583c;
                }
            }
            return i6;
        }
        return -1;
    }

    public final long K(b0 b0Var) {
        return this.E.f1460b ? b0Var.f1445e : b0Var.f1443c;
    }

    public final b0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z6 = nVar.f1494c;
        Rect rect = nVar.f1493b;
        if (!z6 || (this.f1433z0.f1532g && (nVar.f1492a.k() || nVar.f1492a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.I;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Rect rect2 = this.B;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i6).getClass();
            ((n) view.getLayoutParams()).f1492a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f1494c = false;
        return rect;
    }

    public final boolean O() {
        return !this.N || this.V || this.f1426w.g();
    }

    public final boolean P() {
        return this.f1402a0 > 0;
    }

    public final void Q(int i6) {
        if (this.F == null) {
            return;
        }
        setScrollState(2);
        this.F.p0(i6);
        awakenScrollBars();
    }

    public final void R() {
        int iH = this.f1428x.h();
        for (int i6 = 0; i6 < iH; i6++) {
            ((n) this.f1428x.g(i6).getLayoutParams()).f1494c = true;
        }
        ArrayList<b0> arrayList = this.f1422u.f1505c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) arrayList.get(i7).f1441a.getLayoutParams();
            if (nVar != null) {
                nVar.f1494c = true;
            }
        }
    }

    public final void S(int i6, int i7, boolean z6) {
        int i8 = i6 + i7;
        int iH = this.f1428x.h();
        for (int i9 = 0; i9 < iH; i9++) {
            b0 b0VarM = M(this.f1428x.g(i9));
            if (b0VarM != null && !b0VarM.o()) {
                int i10 = b0VarM.f1443c;
                x xVar = this.f1433z0;
                if (i10 >= i8) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i9 + " holder " + b0VarM + " now at position " + (b0VarM.f1443c - i7));
                    }
                    b0VarM.l(-i7, z6);
                    xVar.f1531f = true;
                } else if (i10 >= i6) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i9 + " holder " + b0VarM + " now REMOVED");
                    }
                    b0VarM.a(8);
                    b0VarM.l(-i7, z6);
                    b0VarM.f1443c = i6 - 1;
                    xVar.f1531f = true;
                }
            }
        }
        s sVar = this.f1422u;
        ArrayList<b0> arrayList = sVar.f1505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = arrayList.get(size);
            if (b0Var != null) {
                int i11 = b0Var.f1443c;
                if (i11 >= i8) {
                    if (T0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + b0Var + " now at position " + (b0Var.f1443c - i7));
                    }
                    b0Var.l(-i7, z6);
                } else if (i11 >= i6) {
                    b0Var.a(8);
                    sVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.f1402a0++;
    }

    public final void U(boolean z6) {
        int i6;
        AccessibilityManager accessibilityManager;
        int i7 = this.f1402a0 - 1;
        this.f1402a0 = i7;
        if (i7 < 1) {
            if (S0 && i7 < 0) {
                throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1402a0 = 0;
            if (z6) {
                int i8 = this.S;
                this.S = 0;
                if (i8 != 0 && (accessibilityManager = this.U) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.M0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.f1441a.getParent() == this && !b0Var.o() && (i6 = b0Var.f1456q) != -1) {
                        View view = b0Var.f1441a;
                        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                        view.setImportantForAccessibility(i6);
                        b0Var.f1456q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1411j0) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.f1411j0 = motionEvent.getPointerId(i6);
            int x6 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f1415n0 = x6;
            this.f1413l0 = x6;
            int y2 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f1416o0 = y2;
            this.f1414m0 = y2;
        }
    }

    public final void W() {
        if (this.F0 || !this.L) {
            return;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        postOnAnimation(this.N0);
        this.F0 = true;
    }

    public final void X() {
        boolean z6;
        boolean z7 = false;
        if (this.V) {
            androidx.recyclerview.widget.a aVar = this.f1426w;
            aVar.k(aVar.f1576b);
            aVar.k(aVar.f1577c);
            aVar.f1580f = 0;
            if (this.W) {
                this.F.Z();
            }
        }
        if (this.f1409h0 == null || !this.F.B0()) {
            this.f1426w.c();
        } else {
            this.f1426w.j();
        }
        boolean z8 = this.C0 || this.D0;
        boolean z9 = this.N && this.f1409h0 != null && ((z6 = this.V) || z8 || this.F.f1477f) && (!z6 || this.E.f1460b);
        x xVar = this.f1433z0;
        xVar.f1534j = z9;
        if (z9 && z8 && !this.V && this.f1409h0 != null && this.F.B0()) {
            z7 = true;
        }
        xVar.f1535k = z7;
    }

    public final void Y(boolean z6) {
        this.W = z6 | this.W;
        this.V = true;
        int iH = this.f1428x.h();
        for (int i6 = 0; i6 < iH; i6++) {
            b0 b0VarM = M(this.f1428x.g(i6));
            if (b0VarM != null && !b0VarM.o()) {
                b0VarM.a(6);
            }
        }
        R();
        s sVar = this.f1422u;
        ArrayList<b0> arrayList = sVar.f1505c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            b0 b0Var = arrayList.get(i7);
            if (b0Var != null) {
                b0Var.a(6);
                b0Var.a(1024);
            }
        }
        e eVar = RecyclerView.this.E;
        if (eVar == null || !eVar.f1460b) {
            sVar.g();
        }
    }

    public final void Z(b0 b0Var, j.b bVar) {
        b0Var.f1449j &= -8193;
        boolean z6 = this.f1433z0.h;
        c0 c0Var = this.f1430y;
        if (z6 && b0Var.k() && !b0Var.h() && !b0Var.o()) {
            c0Var.f1604b.d(K(b0Var), b0Var);
        }
        w.g<b0, c0.a> gVar = c0Var.f1603a;
        c0.a aVarA = gVar.get(b0Var);
        if (aVarA == null) {
            aVarA = c0.a.a();
            gVar.put(b0Var, aVarA);
        }
        aVarA.f1607b = bVar;
        aVarA.f1606a |= 4;
    }

    public final int a0(float f6, int i6) {
        float height = f6 / getHeight();
        float width = i6 / getWidth();
        EdgeEffect edgeEffect = this.f1405d0;
        float f7 = 0.0f;
        if (edgeEffect == null || y0.b.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1407f0;
            if (edgeEffect2 != null && y0.b.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1407f0.onRelease();
                } else {
                    float fB = y0.b.b(this.f1407f0, width, height);
                    if (y0.b.a(this.f1407f0) == 0.0f) {
                        this.f1407f0.onRelease();
                    }
                    f7 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f1405d0.onRelease();
            } else {
                float f8 = -y0.b.b(this.f1405d0, -width, 1.0f - height);
                if (y0.b.a(this.f1405d0) == 0.0f) {
                    this.f1405d0.onRelease();
                }
                f7 = f8;
            }
            invalidate();
        }
        return Math.round(f7 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i7) {
        m mVar = this.F;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i6, i7);
    }

    public final int b0(float f6, int i6) {
        float width = f6 / getWidth();
        float height = i6 / getHeight();
        EdgeEffect edgeEffect = this.f1406e0;
        float f7 = 0.0f;
        if (edgeEffect == null || y0.b.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f1408g0;
            if (edgeEffect2 != null && y0.b.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1408g0.onRelease();
                } else {
                    float fB = y0.b.b(this.f1408g0, height, 1.0f - width);
                    if (y0.b.a(this.f1408g0) == 0.0f) {
                        this.f1408g0.onRelease();
                    }
                    f7 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1406e0.onRelease();
            } else {
                float f8 = -y0.b.b(this.f1406e0, -height, width);
                if (y0.b.a(this.f1406e0) == 0.0f) {
                    this.f1406e0.onRelease();
                }
                f7 = f8;
            }
            invalidate();
        }
        return Math.round(f7 * getHeight());
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.B;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f1494c) {
                Rect rect2 = nVar.f1493b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.F.m0(this, view, this.B, !this.N, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.F.f((n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.F;
        if (mVar != null && mVar.d()) {
            return this.F.j(this.f1433z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.F;
        if (mVar != null && mVar.d()) {
            return this.F.k(this.f1433z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.F;
        if (mVar != null && mVar.d()) {
            return this.F.l(this.f1433z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.F;
        if (mVar != null && mVar.e()) {
            return this.F.m(this.f1433z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.F;
        if (mVar != null && mVar.e()) {
            return this.F.n(this.f1433z0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.F;
        if (mVar != null && mVar.e()) {
            return this.F.o(this.f1433z0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.f1412k0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        l0(0);
        EdgeEffect edgeEffect = this.f1405d0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f1405d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1406e0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f1406e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1407f0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f1407f0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1408g0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f1408g0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return getScrollingChildHelper().a(f6, f7, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().d(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        ArrayList<l> arrayList = this.I;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).d(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1405d0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1432z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1405d0;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f1406e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1432z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1406e0;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f1407f0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1432z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1407f0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f1408g0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1432z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1408g0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f1409h0 == null || arrayList.size() <= 0 || !this.f1409h0.f()) ? z6 : true) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(int i6, int i7, MotionEvent motionEvent, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        boolean z7;
        p();
        e eVar = this.E;
        int[] iArr = this.L0;
        if (eVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(i6, i7, iArr);
            i9 = iArr[0];
            i10 = iArr[1];
            i11 = i6 - i9;
            i12 = i7 - i10;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.I.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i9, i10, i11, i12, this.J0, i8, iArr);
        int i13 = iArr[0];
        int i14 = i11 - i13;
        int i15 = iArr[1];
        int i16 = i12 - i15;
        boolean z8 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.f1415n0;
        int[] iArr2 = this.J0;
        int i18 = iArr2[0];
        this.f1415n0 = i17 - i18;
        int i19 = this.f1416o0;
        int i20 = iArr2[1];
        this.f1416o0 = i19 - i20;
        int[] iArr3 = this.K0;
        iArr3[0] = iArr3[0] + i18;
        iArr3[1] = iArr3[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z6 = true;
            } else {
                float x6 = motionEvent.getX();
                float f6 = i14;
                float y2 = motionEvent.getY();
                float f7 = i16;
                if (f6 < 0.0f) {
                    y();
                    z6 = true;
                    y0.b.b(this.f1405d0, (-f6) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z6 = true;
                    if (f6 > 0.0f) {
                        z();
                        y0.b.b(this.f1407f0, f6 / getWidth(), y2 / getHeight());
                    } else {
                        z7 = false;
                        if (f7 >= 0.0f) {
                            A();
                            y0.b.b(this.f1406e0, (-f7) / getHeight(), x6 / getWidth());
                        } else {
                            if (f7 > 0.0f) {
                                x();
                                y0.b.b(this.f1408g0, f7 / getHeight(), 1.0f - (x6 / getWidth()));
                            }
                            if (z7 || f6 != 0.0f || f7 != 0.0f) {
                                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z7 = z6;
                        if (z7) {
                            WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
                z7 = z6;
                if (f7 >= 0.0f) {
                }
                z7 = z6;
                if (z7) {
                }
            }
            n(i6, i7);
        } else {
            z6 = true;
        }
        if (i9 != 0 || i10 != 0) {
            w(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z8 && i9 == 0 && i10 == 0) {
            return false;
        }
        return z6;
    }

    public final void f0(int i6, int i7, int[] iArr) {
        b0 b0Var;
        j0();
        T();
        int i8 = q0.j.f14103a;
        Trace.beginSection("RV Scroll");
        x xVar = this.f1433z0;
        C(xVar);
        s sVar = this.f1422u;
        int iO0 = i6 != 0 ? this.F.o0(i6, sVar, xVar) : 0;
        int iQ0 = i7 != 0 ? this.F.q0(i7, sVar, xVar) : 0;
        Trace.endSection();
        androidx.recyclerview.widget.b bVar = this.f1428x;
        int iE = bVar.e();
        for (int i9 = 0; i9 < iE; i9++) {
            View viewD = bVar.d(i9);
            b0 b0VarL = L(viewD);
            if (b0VarL != null && (b0Var = b0VarL.f1448i) != null) {
                View view = b0Var.f1441a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        k0(false);
        if (iArr != null) {
            iArr[0] = iO0;
            iArr[1] = iQ0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i6) {
        View viewT;
        int i7;
        char c7;
        boolean z6;
        this.F.getClass();
        boolean z7 = true;
        boolean z8 = (this.E == null || this.F == null || P() || this.Q) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        x xVar = this.f1433z0;
        s sVar = this.f1422u;
        if (!z8 || (i6 != 2 && i6 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i6);
            if (viewFindNextFocus == null && z8) {
                p();
                if (D(view) != null) {
                    j0();
                    viewT = this.F.T(view, i6, sVar, xVar);
                    k0(false);
                }
                return null;
            }
            viewT = viewFindNextFocus;
            if (viewT == null && !viewT.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i6);
                }
                c0(viewT, null);
                return view;
            }
            if (viewT == null || viewT == this || viewT == view) {
                z7 = false;
            } else if (D(viewT) == null) {
                z7 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.B;
                rect.set(0, 0, width, height);
                int width2 = viewT.getWidth();
                int height2 = viewT.getHeight();
                Rect rect2 = this.C;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewT, rect2);
                int i8 = this.F.C() == 1 ? -1 : 1;
                int i9 = rect.left;
                int i10 = rect2.left;
                if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
                    i7 = 1;
                } else {
                    int i11 = rect.right;
                    int i12 = rect2.right;
                    i7 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? -1 : 0;
                }
                int i13 = rect.top;
                int i14 = rect2.top;
                if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
                    c7 = 1;
                } else {
                    int i15 = rect.bottom;
                    int i16 = rect2.bottom;
                    c7 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? (char) 65535 : (char) 0;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 17) {
                            if (i6 != 33) {
                                if (i6 != 66) {
                                    if (i6 != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i6);
                                        throw new IllegalArgumentException(androidx.activity.m.c(this, sb));
                                    }
                                    if (c7 <= 0) {
                                    }
                                } else if (i7 <= 0) {
                                }
                            } else if (c7 >= 0) {
                            }
                        } else if (i7 >= 0) {
                        }
                    } else if (c7 <= 0 && (c7 != 0 || i7 * i8 <= 0)) {
                    }
                } else if (c7 >= 0 && (c7 != 0 || i7 * i8 >= 0)) {
                }
            }
            return z7 ? viewT : super.focusSearch(view, i6);
        }
        if (this.F.e()) {
            if (focusFinder.findNextFocus(this, view, i6 == 2 ? 130 : 33) == null) {
                z6 = true;
            }
            if (!z6 && this.F.d()) {
                z6 = focusFinder.findNextFocus(this, view, !((this.F.C() != 1) ^ (i6 != 2)) ? 66 : 17) != null;
            }
            if (z6) {
                p();
                if (D(view) != null) {
                    j0();
                    this.F.T(view, i6, sVar, xVar);
                    k0(false);
                }
                return null;
            }
            viewT = focusFinder.findNextFocus(this, view, i6);
            if (viewT == null) {
            }
            if (viewT == null) {
                z7 = false;
            }
            if (z7) {
            }
        }
        z6 = false;
        if (!z6) {
            if (focusFinder.findNextFocus(this, view, !((this.F.C() != 1) ^ (i6 != 2)) ? 66 : 17) != null) {
            }
        }
        if (z6) {
        }
        viewT = focusFinder.findNextFocus(this, view, i6);
        if (viewT == null) {
        }
        if (viewT == null) {
        }
        if (z7) {
        }
    }

    public final void g0(int i6) {
        androidx.recyclerview.widget.o oVar;
        if (this.Q) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f1427w0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f1435u.abortAnimation();
        m mVar = this.F;
        if (mVar != null && (oVar = mVar.f1476e) != null) {
            oVar.f();
        }
        m mVar2 = this.F;
        if (mVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar2.p0(i6);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.F;
        if (mVar != null) {
            return mVar.r();
        }
        throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.F;
        if (mVar != null) {
            return mVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.E;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.F;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        return super.getChildDrawingOrder(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1432z;
    }

    public androidx.recyclerview.widget.x getCompatAccessibilityDelegate() {
        return this.G0;
    }

    public i getEdgeEffectFactory() {
        return this.f1404c0;
    }

    public j getItemAnimator() {
        return this.f1409h0;
    }

    public int getItemDecorationCount() {
        return this.I.size();
    }

    public m getLayoutManager() {
        return this.F;
    }

    public int getMaxFlingVelocity() {
        return this.f1419s0;
    }

    public int getMinFlingVelocity() {
        return this.f1418r0;
    }

    public long getNanoTime() {
        if (Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public o getOnFlingListener() {
        return this.f1417q0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1425v0;
    }

    public r getRecycledViewPool() {
        return this.f1422u.c();
    }

    public int getScrollState() {
        return this.f1410i0;
    }

    public final void h(b0 b0Var) {
        View view = b0Var.f1441a;
        boolean z6 = view.getParent() == this;
        this.f1422u.m(L(view));
        if (b0Var.j()) {
            this.f1428x.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f1428x.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f1428x;
        int iIndexOfChild = bVar.f1588a.f1719a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            bVar.f1589b.h(iIndexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i6, int i7) {
        if (i6 > 0) {
            return true;
        }
        float fA = y0.b.a(edgeEffect) * i7;
        float fAbs = Math.abs(-i6) * 0.35f;
        float f6 = this.s * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d7 = V0;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * dLog) * ((double) f6))) < fA;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(l lVar) {
        m mVar = this.F;
        if (mVar != null) {
            mVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.I;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        R();
        requestLayout();
    }

    public final void i0(int i6, int i7, boolean z6) {
        m mVar = this.F;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.Q) {
            return;
        }
        if (!mVar.d()) {
            i6 = 0;
        }
        if (!this.F.e()) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (z6) {
            int i8 = i6 != 0 ? 1 : 0;
            if (i7 != 0) {
                i8 |= 2;
            }
            getScrollingChildHelper().g(i8, 1);
        }
        this.f1427w0.c(i6, i7, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.L;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.Q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f14519d;
    }

    public final void j(q qVar) {
        if (this.B0 == null) {
            this.B0 = new ArrayList();
        }
        this.B0.add(qVar);
    }

    public final void j0() {
        int i6 = this.O + 1;
        this.O = i6;
        if (i6 != 1 || this.Q) {
            return;
        }
        this.P = false;
    }

    public final void k(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1403b0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.activity.m.c(this, new StringBuilder(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))));
        }
    }

    public final void k0(boolean z6) {
        if (this.O < 1) {
            if (S0) {
                throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.O = 1;
        }
        if (!z6 && !this.Q) {
            this.P = false;
        }
        if (this.O == 1) {
            if (z6 && this.P && !this.Q && this.F != null && this.E != null) {
                r();
            }
            if (!this.Q) {
                this.P = false;
            }
        }
        this.O--;
    }

    public final void l0(int i6) {
        getScrollingChildHelper().h(i6);
    }

    public final void m() {
        int iH = this.f1428x.h();
        for (int i6 = 0; i6 < iH; i6++) {
            b0 b0VarM = M(this.f1428x.g(i6));
            if (!b0VarM.o()) {
                b0VarM.f1444d = -1;
                b0VarM.f1447g = -1;
            }
        }
        s sVar = this.f1422u;
        ArrayList<b0> arrayList = sVar.f1503a;
        ArrayList<b0> arrayList2 = sVar.f1505c;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            b0 b0Var = arrayList2.get(i7);
            b0Var.f1444d = -1;
            b0Var.f1447g = -1;
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            b0 b0Var2 = arrayList.get(i8);
            b0Var2.f1444d = -1;
            b0Var2.f1447g = -1;
        }
        ArrayList<b0> arrayList3 = sVar.f1504b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                b0 b0Var3 = sVar.f1504b.get(i9);
                b0Var3.f1444d = -1;
                b0Var3.f1447g = -1;
            }
        }
    }

    public final void n(int i6, int i7) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f1405d0;
        if (edgeEffect == null || edgeEffect.isFinished() || i6 <= 0) {
            zIsFinished = false;
        } else {
            this.f1405d0.onRelease();
            zIsFinished = this.f1405d0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1407f0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f1407f0.onRelease();
            zIsFinished |= this.f1407f0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1406e0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.f1406e0.onRelease();
            zIsFinished |= this.f1406e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1408g0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.f1408g0.onRelease();
            zIsFinished |= this.f1408g0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f1402a0 = 0;
        this.L = true;
        this.N = this.N && !isLayoutRequested();
        this.f1422u.e();
        m mVar = this.F;
        if (mVar != null) {
            mVar.f1478g = true;
            mVar.R(this);
        }
        this.F0 = false;
        if (Y0) {
            ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.f1682w;
            androidx.recyclerview.widget.m mVar2 = threadLocal.get();
            this.f1429x0 = mVar2;
            if (mVar2 == null) {
                this.f1429x0 = new androidx.recyclerview.widget.m();
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    androidx.recyclerview.widget.m mVar3 = this.f1429x0;
                    mVar3.f1685u = (long) (1.0E9f / refreshRate);
                    threadLocal.set(mVar3);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    androidx.recyclerview.widget.m mVar32 = this.f1429x0;
                    mVar32.f1685u = (long) (1.0E9f / refreshRate);
                    threadLocal.set(mVar32);
                }
            }
            ArrayList<RecyclerView> arrayList = this.f1429x0.s;
            if (S0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        androidx.recyclerview.widget.o oVar;
        super.onDetachedFromWindow();
        j jVar = this.f1409h0;
        if (jVar != null) {
            jVar.e();
        }
        int i6 = 0;
        setScrollState(0);
        a0 a0Var = this.f1427w0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f1435u.abortAnimation();
        m mVar2 = this.F;
        if (mVar2 != null && (oVar = mVar2.f1476e) != null) {
            oVar.f();
        }
        this.L = false;
        m mVar3 = this.F;
        if (mVar3 != null) {
            mVar3.f1478g = false;
            mVar3.S(this);
        }
        this.M0.clear();
        removeCallbacks(this.N0);
        this.f1430y.getClass();
        while (c0.a.f1605d.c() != null) {
        }
        s sVar = this.f1422u;
        ArrayList<b0> arrayList = sVar.f1505c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a1.a.c(arrayList.get(i7).f1441a);
        }
        sVar.f(RecyclerView.this.E, false);
        while (i6 < getChildCount()) {
            int i8 = i6 + 1;
            View childAt = getChildAt(i6);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a1.c cVar = (a1.c) childAt.getTag(com.htmltoapk.template.R.id.pooling_container_listener_holder_tag);
            if (cVar == null) {
                cVar = new a1.c();
                childAt.setTag(com.htmltoapk.template.R.id.pooling_container_listener_holder_tag, cVar);
            }
            ArrayList<a1.b> arrayList2 = cVar.f6a;
            for (int iB = e5.l.b(arrayList2); -1 < iB; iB--) {
                arrayList2.get(iB).a();
            }
            i6 = i8;
        }
        if (!Y0 || (mVar = this.f1429x0) == null) {
            return;
        }
        boolean zRemove = mVar.s.remove(this);
        if (S0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1429x0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.I;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float axisValue;
        m mVar;
        if (this.F != null && !this.Q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f6 = this.F.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.F.d() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f6 != 0.0f || axisValue != 0.0f) {
                    int i6 = (int) (axisValue * this.f1421t0);
                    int i7 = (int) (f6 * this.f1423u0);
                    mVar = this.F;
                    if (mVar != null) {
                        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return false;
                    }
                    if (!this.Q) {
                        int[] iArr = this.L0;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        boolean zD = mVar.d();
                        boolean zE = this.F.e();
                        int i8 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                        float y2 = motionEvent.getY();
                        float x6 = motionEvent.getX();
                        int iA0 = i6 - a0(y2, i6);
                        int iB0 = i7 - b0(x6, i7);
                        getScrollingChildHelper().g(i8, 1);
                        if (u(zD ? iA0 : 0, zE ? iB0 : 0, this.L0, this.J0, 1)) {
                            iA0 -= iArr[0];
                            iB0 -= iArr[1];
                        }
                        e0(zD ? iA0 : 0, zE ? iB0 : 0, motionEvent, 1);
                        androidx.recyclerview.widget.m mVar2 = this.f1429x0;
                        if (mVar2 != null && (iA0 != 0 || iB0 != 0)) {
                            mVar2.a(this, iA0, iB0);
                        }
                        l0(1);
                    }
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.F.e()) {
                    f6 = -axisValue2;
                    if (f6 != 0.0f) {
                        int i62 = (int) (axisValue * this.f1421t0);
                        int i72 = (int) (f6 * this.f1423u0);
                        mVar = this.F;
                        if (mVar != null) {
                        }
                    }
                } else {
                    if (this.F.d()) {
                        axisValue = axisValue2;
                        f6 = 0.0f;
                    } else {
                        f6 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f6 != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        if (!this.Q) {
            this.K = null;
            if (E(motionEvent)) {
                d0();
                setScrollState(0);
                return true;
            }
            m mVar = this.F;
            if (mVar != null) {
                boolean zD = mVar.d();
                boolean zE = this.F.e();
                if (this.f1412k0 == null) {
                    this.f1412k0 = VelocityTracker.obtain();
                }
                this.f1412k0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.R) {
                        this.R = false;
                    }
                    this.f1411j0 = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f1415n0 = x6;
                    this.f1413l0 = x6;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1416o0 = y2;
                    this.f1414m0 = y2;
                    EdgeEffect edgeEffect = this.f1405d0;
                    if (edgeEffect == null || y0.b.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z6 = false;
                    } else {
                        y0.b.b(this.f1405d0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z6 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f1407f0;
                    boolean z8 = z6;
                    if (edgeEffect2 != null) {
                        z8 = z6;
                        if (y0.b.a(edgeEffect2) != 0.0f) {
                            z8 = z6;
                            if (!canScrollHorizontally(1)) {
                                y0.b.b(this.f1407f0, 0.0f, motionEvent.getY() / getHeight());
                                z8 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.f1406e0;
                    boolean z9 = z8;
                    if (edgeEffect3 != null) {
                        z9 = z8;
                        if (y0.b.a(edgeEffect3) != 0.0f) {
                            z9 = z8;
                            if (!canScrollVertically(-1)) {
                                y0.b.b(this.f1406e0, 0.0f, motionEvent.getX() / getWidth());
                                z9 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.f1408g0;
                    boolean z10 = z9;
                    if (edgeEffect4 != null) {
                        z10 = z9;
                        if (y0.b.a(edgeEffect4) != 0.0f) {
                            z10 = z9;
                            if (!canScrollVertically(1)) {
                                y0.b.b(this.f1408g0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z10 = true;
                            }
                        }
                    }
                    if (z10 || this.f1410i0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        l0(1);
                    }
                    int[] iArr = this.K0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i6 = zD;
                    if (zE) {
                        i6 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i6, 0);
                } else if (actionMasked == 1) {
                    this.f1412k0.clear();
                    l0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1411j0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1411j0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f1410i0 != 1) {
                        int i7 = x7 - this.f1413l0;
                        int i8 = y6 - this.f1414m0;
                        if (zD == 0 || Math.abs(i7) <= this.p0) {
                            z7 = false;
                        } else {
                            this.f1415n0 = x7;
                            z7 = true;
                        }
                        if (zE && Math.abs(i8) > this.p0) {
                            this.f1416o0 = y6;
                            z7 = true;
                        }
                        if (z7) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1411j0 = motionEvent.getPointerId(actionIndex);
                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1415n0 = x8;
                    this.f1413l0 = x8;
                    int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1416o0 = y7;
                    this.f1414m0 = y7;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.f1410i0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10 = q0.j.f14103a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.N = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        m mVar = this.F;
        if (mVar == null) {
            q(i6, i7);
            return;
        }
        boolean zL = mVar.L();
        boolean z6 = false;
        x xVar = this.f1433z0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.F.f1473b.q(i6, i7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.O0 = z6;
            if (z6 || this.E == null) {
                return;
            }
            if (xVar.f1529d == 1) {
                s();
            }
            this.F.s0(i6, i7);
            xVar.f1533i = true;
            t();
            this.F.u0(i6, i7);
            if (this.F.x0()) {
                this.F.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                xVar.f1533i = true;
                t();
                this.F.u0(i6, i7);
            }
            this.P0 = getMeasuredWidth();
            this.Q0 = getMeasuredHeight();
            return;
        }
        if (this.M) {
            this.F.f1473b.q(i6, i7);
            return;
        }
        if (this.T) {
            j0();
            T();
            X();
            U(true);
            if (xVar.f1535k) {
                xVar.f1532g = true;
            } else {
                this.f1426w.c();
                xVar.f1532g = false;
            }
            this.T = false;
            k0(false);
        } else if (xVar.f1535k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        e eVar = this.E;
        if (eVar != null) {
            xVar.f1530e = eVar.a();
        } else {
            xVar.f1530e = 0;
        }
        j0();
        this.F.f1473b.q(i6, i7);
        k0(false);
        xVar.f1532g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f1424v = vVar;
        super.onRestoreInstanceState(vVar.s);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f1424v;
        if (vVar2 != null) {
            vVar.f1511u = vVar2.f1511u;
            return vVar;
        }
        m mVar = this.F;
        if (mVar != null) {
            vVar.f1511u = mVar.g0();
            return vVar;
        }
        vVar.f1511u = null;
        return vVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 == i8 && i7 == i9) {
            return;
        }
        this.f1408g0 = null;
        this.f1406e0 = null;
        this.f1407f0 = null;
        this.f1405d0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[PHI: r1
      0x00fd: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:50:0x00e6, B:54:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE;
        boolean z6;
        if (!this.Q && !this.R) {
            p pVar = this.K;
            if (pVar == null) {
                zE = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                pVar.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.K = null;
                }
                zE = true;
            }
            if (zE) {
                d0();
                setScrollState(0);
                return true;
            }
            m mVar = this.F;
            if (mVar != null) {
                boolean zD = mVar.d();
                boolean zE2 = this.F.e();
                if (this.f1412k0 == null) {
                    this.f1412k0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.K0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.f1411j0 = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f1415n0 = x6;
                    this.f1413l0 = x6;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.f1416o0 = y2;
                    this.f1414m0 = y2;
                    int i6 = zD;
                    if (zE2) {
                        i6 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i6, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f1412k0.addMovement(motionEventObtain);
                        this.f1412k0.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, this.f1419s0);
                        float f6 = zD != 0 ? -this.f1412k0.getXVelocity(this.f1411j0) : 0.0f;
                        float f7 = zE2 ? -this.f1412k0.getYVelocity(this.f1411j0) : 0.0f;
                        if ((f6 == 0.0f && f7 == 0.0f) || !I((int) f6, (int) f7)) {
                            setScrollState(0);
                        }
                        d0();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1411j0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1411j0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f1415n0 - x7;
                        int iMax2 = this.f1416o0 - y6;
                        if (this.f1410i0 != 1) {
                            if (zD == 0) {
                                z6 = false;
                                if (zE2) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.p0) : Math.min(0, iMax2 + this.p0);
                                    if (iMax2 != 0) {
                                        z6 = true;
                                    }
                                }
                                if (z6) {
                                    setScrollState(1);
                                }
                            } else {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.p0) : Math.min(0, iMax + this.p0);
                                if (iMax != 0) {
                                    z6 = true;
                                }
                                if (zE2) {
                                }
                                if (z6) {
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.f1410i0 == 1) {
                            int[] iArr2 = this.L0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iA0 = iMax - a0(motionEvent.getY(), iMax);
                            int iB0 = iMax2 - b0(motionEvent.getX(), iMax2);
                            boolean zU = u(zD != 0 ? iA0 : 0, zE2 ? iB0 : 0, this.L0, this.J0, 0);
                            int[] iArr3 = this.J0;
                            if (zU) {
                                iA0 -= iArr2[0];
                                iB0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i7 = iA0;
                            int i8 = iB0;
                            this.f1415n0 = x7 - iArr3[0];
                            this.f1416o0 = y6 - iArr3[1];
                            if (e0(zD != 0 ? i7 : 0, zE2 ? i8 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.m mVar2 = this.f1429x0;
                            if (mVar2 != null && (i7 != 0 || i8 != 0)) {
                                mVar2.a(this, i7, i8);
                            }
                        }
                    } else if (actionMasked == 3) {
                        d0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f1411j0 = motionEvent.getPointerId(actionIndex);
                        int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f1415n0 = x8;
                        this.f1413l0 = x8;
                        int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f1416o0 = y7;
                        this.f1414m0 = y7;
                    } else if (actionMasked == 6) {
                        V(motionEvent);
                    }
                }
                this.f1412k0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.N || this.V) {
            int i6 = q0.j.f14103a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        androidx.recyclerview.widget.a aVar = this.f1426w;
        if (aVar.g()) {
            int i7 = aVar.f1580f;
            if ((i7 & 4) == 0 || (i7 & 11) != 0) {
                if (aVar.g()) {
                    int i8 = q0.j.f14103a;
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i9 = q0.j.f14103a;
            Trace.beginSection("RV PartialInvalidate");
            j0();
            T();
            aVar.j();
            if (!this.P) {
                androidx.recyclerview.widget.b bVar = this.f1428x;
                int iE = bVar.e();
                int i10 = 0;
                while (true) {
                    if (i10 < iE) {
                        b0 b0VarM = M(bVar.d(i10));
                        if (b0VarM != null && !b0VarM.o() && b0VarM.k()) {
                            r();
                            break;
                        }
                        i10++;
                    } else {
                        aVar.b();
                        break;
                    }
                }
            }
            k0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i6, int i7) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        setMeasuredDimension(m.g(i6, paddingRight, getMinimumWidth()), m.g(i7, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0396  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        boolean z6;
        b0 b0Var;
        View viewFindViewById;
        boolean z7;
        j.b bVar;
        ?? r32;
        RecyclerView recyclerView;
        boolean zG;
        boolean z8;
        if (this.E == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.F == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        x xVar = this.f1433z0;
        boolean z9 = false;
        xVar.f1533i = false;
        boolean z10 = true;
        boolean z11 = this.O0 && !(this.P0 == getWidth() && this.Q0 == getHeight());
        this.P0 = 0;
        this.Q0 = 0;
        this.O0 = false;
        if (xVar.f1529d == 1) {
            s();
            this.F.r0(this);
            t();
        } else {
            androidx.recyclerview.widget.a aVar = this.f1426w;
            if ((aVar.f1577c.isEmpty() || aVar.f1576b.isEmpty()) && !z11 && this.F.f1484n == getWidth() && this.F.f1485o == getHeight()) {
                this.F.r0(this);
            } else {
                this.F.r0(this);
                t();
            }
        }
        xVar.a(4);
        j0();
        T();
        xVar.f1529d = 1;
        boolean z12 = xVar.f1534j;
        s sVar = this.f1422u;
        c0 c0Var = this.f1430y;
        if (z12) {
            int iE = this.f1428x.e() - 1;
            while (iE >= 0) {
                b0 b0VarM = M(this.f1428x.d(iE));
                if (b0VarM.o()) {
                    z8 = z10;
                } else {
                    long jK = K(b0VarM);
                    this.f1409h0.getClass();
                    j.b bVar2 = new j.b();
                    bVar2.a(b0VarM);
                    w.d<b0> dVar = c0Var.f1604b;
                    w.g<b0, c0.a> gVar = c0Var.f1603a;
                    b0 b0VarB = dVar.b(jK);
                    if (b0VarB == null || b0VarB.o()) {
                        z8 = z10;
                        c0Var.a(b0VarM, bVar2);
                    } else {
                        z8 = z10;
                        c0.a aVar2 = gVar.get(b0VarB);
                        boolean z13 = (aVar2 == null || (aVar2.f1606a & 1) == 0) ? false : z8;
                        c0.a aVar3 = gVar.get(b0VarM);
                        boolean z14 = (aVar3 == null || (aVar3.f1606a & 1) == 0) ? false : z8;
                        if (z13 && b0VarB == b0VarM) {
                            c0Var.a(b0VarM, bVar2);
                        } else {
                            j.b bVarB = c0Var.b(b0VarB, 4);
                            c0Var.a(b0VarM, bVar2);
                            j.b bVarB2 = c0Var.b(b0VarM, 8);
                            if (bVarB == null) {
                                int iE2 = this.f1428x.e();
                                for (int i6 = 0; i6 < iE2; i6++) {
                                    b0 b0VarM2 = M(this.f1428x.d(i6));
                                    if (b0VarM2 != b0VarM && K(b0VarM2) == jK) {
                                        e eVar = this.E;
                                        if (eVar == null || !eVar.f1460b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(b0VarM2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(b0VarM);
                                            throw new IllegalStateException(androidx.activity.m.c(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(b0VarM2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(b0VarM);
                                        throw new IllegalStateException(androidx.activity.m.c(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0VarB + " cannot be found but it is necessary for " + b0VarM + B());
                            } else {
                                b0VarB.n(false);
                                if (z13) {
                                    h(b0VarB);
                                }
                                if (b0VarB != b0VarM) {
                                    if (z14) {
                                        h(b0VarM);
                                    }
                                    b0VarB.h = b0VarM;
                                    h(b0VarB);
                                    sVar.m(b0VarB);
                                    b0VarM.n(false);
                                    b0VarM.f1448i = b0VarB;
                                }
                                if (this.f1409h0.a(b0VarB, b0VarM, bVarB, bVarB2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
                iE--;
                z10 = z8;
            }
            z6 = z10;
            w.g<b0, c0.a> gVar2 = c0Var.f1603a;
            int i7 = gVar2.f14850u - 1;
            while (i7 >= 0) {
                b0 b0VarF = gVar2.f(i7);
                c0.a aVarG = gVar2.g(i7);
                int i8 = aVarG.f1606a;
                int i9 = i8 & 3;
                d dVar2 = this.R0;
                if (i9 == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.F.k0(b0VarF.f1441a, recyclerView2.f1422u);
                    r32 = z9;
                } else if ((i8 & 1) != 0) {
                    j.b bVar3 = aVarG.f1607b;
                    if (bVar3 == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.F.k0(b0VarF.f1441a, recyclerView3.f1422u);
                        r32 = z9;
                    } else {
                        dVar2.b(b0VarF, bVar3, aVarG.f1608c);
                        r32 = z9;
                    }
                } else if ((i8 & 14) == 14) {
                    dVar2.a(b0VarF, aVarG.f1607b, aVarG.f1608c);
                    r32 = z9;
                } else if ((i8 & 12) == 12) {
                    j.b bVar4 = aVarG.f1607b;
                    j.b bVar5 = aVarG.f1608c;
                    dVar2.getClass();
                    b0VarF.n(z9);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (!recyclerView4.V) {
                        androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView4.f1409h0;
                        zVar.getClass();
                        int i10 = bVar4.f1469a;
                        int i11 = bVar5.f1469a;
                        if (i10 == i11 && bVar4.f1470b == bVar5.f1470b) {
                            zVar.c(b0VarF);
                            recyclerView = recyclerView4;
                            zG = false;
                        } else {
                            recyclerView = recyclerView4;
                            zG = zVar.g(b0VarF, i10, bVar4.f1470b, i11, bVar5.f1470b);
                        }
                        if (zG) {
                            recyclerView.W();
                        }
                    } else if (recyclerView4.f1409h0.a(b0VarF, b0VarF, bVar4, bVar5)) {
                        recyclerView4.W();
                    }
                    r32 = 0;
                } else {
                    if ((i8 & 4) != 0) {
                        bVar = null;
                        dVar2.b(b0VarF, aVarG.f1607b, null);
                    } else {
                        bVar = null;
                        if ((i8 & 8) != 0) {
                            dVar2.a(b0VarF, aVarG.f1607b, aVarG.f1608c);
                        }
                    }
                    r32 = 0;
                    aVarG.f1606a = r32;
                    aVarG.f1607b = bVar;
                    aVarG.f1608c = bVar;
                    c0.a.f1605d.d(aVarG);
                    i7--;
                    z9 = false;
                }
                bVar = null;
                aVarG.f1606a = r32;
                aVarG.f1607b = bVar;
                aVarG.f1608c = bVar;
                c0.a.f1605d.d(aVarG);
                i7--;
                z9 = false;
            }
        } else {
            z6 = true;
        }
        View view = null;
        this.F.j0(sVar);
        xVar.f1527b = xVar.f1530e;
        this.V = false;
        this.W = false;
        xVar.f1534j = false;
        xVar.f1535k = false;
        this.F.f1477f = false;
        ArrayList<b0> arrayList = sVar.f1504b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m mVar = this.F;
        if (mVar.f1481k) {
            mVar.f1480j = 0;
            mVar.f1481k = false;
            sVar.n();
        }
        this.F.e0(xVar);
        boolean z15 = z6;
        U(z15);
        k0(false);
        c0Var.f1603a.clear();
        c0Var.f1604b.a();
        int[] iArr = this.H0;
        int i12 = iArr[0];
        int i13 = iArr[z15 ? 1 : 0];
        F(iArr);
        if ((iArr[0] == i12 && iArr[z15 ? 1 : 0] == i13) ? false : true) {
            w(0, 0);
        }
        if (this.f1425v0 && this.E != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (this.f1428x.f1590c.contains(getFocusedChild())) {
                    long j6 = xVar.f1537m;
                    if (j6 != -1 && (z7 = this.E.f1460b) && z7) {
                        int iH = this.f1428x.h();
                        int i14 = 0;
                        b0Var = null;
                        while (true) {
                            if (i14 >= iH) {
                                break;
                            }
                            b0 b0VarM3 = M(this.f1428x.g(i14));
                            if (b0VarM3 != null && !b0VarM3.h() && b0VarM3.f1445e == j6) {
                                if (!this.f1428x.f1590c.contains(b0VarM3.f1441a)) {
                                    b0Var = b0VarM3;
                                    break;
                                }
                                b0Var = b0VarM3;
                            }
                            i14++;
                        }
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        View view2 = b0Var.f1441a;
                        if (!this.f1428x.f1590c.contains(view2) && view2.hasFocusable()) {
                            view = view2;
                        } else if (this.f1428x.e() > 0) {
                            int i15 = xVar.f1536l;
                            int i16 = i15 != -1 ? i15 : 0;
                            int iB = xVar.b();
                            for (int i17 = i16; i17 < iB; i17++) {
                                b0 b0VarH = H(i17);
                                if (b0VarH == null) {
                                    break;
                                }
                                View view3 = b0VarH.f1441a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                    break;
                                }
                            }
                            int iMin = Math.min(iB, i16) - 1;
                            while (true) {
                                if (iMin < 0) {
                                    break;
                                }
                                b0 b0VarH2 = H(iMin);
                                if (b0VarH2 == null) {
                                    break;
                                }
                                View view4 = b0VarH2.f1441a;
                                if (view4.hasFocusable()) {
                                    view = view4;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        if (view != null) {
                            int i18 = xVar.f1538n;
                            if (i18 != -1 && (viewFindViewById = view.findViewById(i18)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
            }
        }
        xVar.f1537m = -1L;
        xVar.f1536l = -1;
        xVar.f1538n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        b0 b0VarM = M(view);
        if (b0VarM != null) {
            if (b0VarM.j()) {
                b0VarM.f1449j &= -257;
            } else if (!b0VarM.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(b0VarM);
                throw new IllegalArgumentException(androidx.activity.m.c(this, sb));
            }
        } else if (S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(androidx.activity.m.c(this, sb2));
        }
        view.clearAnimation();
        b0 b0VarM2 = M(view);
        e eVar = this.E;
        if (eVar != null && b0VarM2 != null) {
            eVar.f(b0VarM2);
        }
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.o oVar = this.F.f1476e;
        if ((oVar == null || !oVar.f1516e) && !P() && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.F.m0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList<p> arrayList = this.J;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O != 0 || this.Q) {
            this.P = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int iJ;
        c0.a aVar;
        View viewD;
        x xVar = this.f1433z0;
        xVar.a(1);
        C(xVar);
        xVar.f1533i = false;
        j0();
        c0 c0Var = this.f1430y;
        w.g<b0, c0.a> gVar = c0Var.f1603a;
        w.g<b0, c0.a> gVar2 = c0Var.f1603a;
        gVar.clear();
        w.d<b0> dVar = c0Var.f1604b;
        dVar.a();
        T();
        X();
        b0 b0VarL = null;
        View focusedChild = (this.f1425v0 && hasFocus() && this.E != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewD = D(focusedChild)) != null) {
            b0VarL = L(viewD);
        }
        if (b0VarL == null) {
            xVar.f1537m = -1L;
            xVar.f1536l = -1;
            xVar.f1538n = -1;
        } else {
            xVar.f1537m = this.E.f1460b ? b0VarL.f1445e : -1L;
            if (!this.V) {
                if (b0VarL.h()) {
                    iJ = b0VarL.f1444d;
                } else {
                    RecyclerView recyclerView = b0VarL.f1457r;
                    iJ = recyclerView == null ? -1 : recyclerView.J(b0VarL);
                }
                xVar.f1536l = iJ;
                View focusedChild2 = b0VarL.f1441a;
                int id = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id = focusedChild2.getId();
                    }
                }
                xVar.f1538n = id;
            }
        }
        xVar.h = xVar.f1534j && this.D0;
        this.D0 = false;
        this.C0 = false;
        xVar.f1532g = xVar.f1535k;
        xVar.f1530e = this.E.a();
        F(this.H0);
        if (xVar.f1534j) {
            int iE = this.f1428x.e();
            for (int i6 = 0; i6 < iE; i6++) {
                b0 b0VarM = M(this.f1428x.d(i6));
                if (!b0VarM.o() && (!b0VarM.f() || this.E.f1460b)) {
                    j jVar = this.f1409h0;
                    j.b(b0VarM);
                    b0VarM.c();
                    jVar.getClass();
                    j.b bVar = new j.b();
                    bVar.a(b0VarM);
                    c0.a aVarA = gVar2.get(b0VarM);
                    if (aVarA == null) {
                        aVarA = c0.a.a();
                        gVar2.put(b0VarM, aVarA);
                    }
                    aVarA.f1607b = bVar;
                    aVarA.f1606a |= 4;
                    if (xVar.h && b0VarM.k() && !b0VarM.h() && !b0VarM.o() && !b0VarM.f()) {
                        dVar.d(K(b0VarM), b0VarM);
                    }
                }
            }
        }
        if (xVar.f1535k) {
            int iH = this.f1428x.h();
            for (int i7 = 0; i7 < iH; i7++) {
                b0 b0VarM2 = M(this.f1428x.g(i7));
                if (S0 && b0VarM2.f1443c == -1 && !b0VarM2.h()) {
                    throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!b0VarM2.o() && b0VarM2.f1444d == -1) {
                    b0VarM2.f1444d = b0VarM2.f1443c;
                }
            }
            boolean z6 = xVar.f1531f;
            xVar.f1531f = false;
            this.F.d0(this.f1422u, xVar);
            xVar.f1531f = z6;
            for (int i8 = 0; i8 < this.f1428x.e(); i8++) {
                b0 b0VarM3 = M(this.f1428x.d(i8));
                if (!b0VarM3.o() && ((aVar = gVar2.get(b0VarM3)) == null || (aVar.f1606a & 4) == 0)) {
                    j.b(b0VarM3);
                    boolean z7 = (b0VarM3.f1449j & 8192) != 0;
                    j jVar2 = this.f1409h0;
                    b0VarM3.c();
                    jVar2.getClass();
                    j.b bVar2 = new j.b();
                    bVar2.a(b0VarM3);
                    if (z7) {
                        Z(b0VarM3, bVar2);
                    } else {
                        c0.a aVarA2 = gVar2.get(b0VarM3);
                        if (aVarA2 == null) {
                            aVarA2 = c0.a.a();
                            gVar2.put(b0VarM3, aVarA2);
                        }
                        aVarA2.f1606a |= 2;
                        aVarA2.f1607b = bVar2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        k0(false);
        xVar.f1529d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i6, int i7) {
        m mVar = this.F;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.Q) {
            return;
        }
        boolean zD = mVar.d();
        boolean zE = this.F.e();
        if (zD || zE) {
            if (!zD) {
                i6 = 0;
            }
            if (!zE) {
                i7 = 0;
            }
            e0(i6, i7, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.S |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.x xVar) {
        this.G0 = xVar;
        f0.m(this, xVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.E;
        u uVar = this.f1420t;
        if (eVar2 != null) {
            eVar2.f1459a.unregisterObserver(uVar);
            this.E.getClass();
        }
        j jVar = this.f1409h0;
        if (jVar != null) {
            jVar.e();
        }
        m mVar = this.F;
        s sVar = this.f1422u;
        if (mVar != null) {
            mVar.i0(sVar);
            this.F.j0(sVar);
        }
        sVar.f1503a.clear();
        sVar.g();
        androidx.recyclerview.widget.a aVar = this.f1426w;
        aVar.k(aVar.f1576b);
        aVar.k(aVar.f1577c);
        aVar.f1580f = 0;
        e<?> eVar3 = this.E;
        this.E = eVar;
        if (eVar != null) {
            eVar.f1459a.registerObserver(uVar);
        }
        m mVar2 = this.F;
        if (mVar2 != null) {
            mVar2.Q();
        }
        e eVar4 = this.E;
        sVar.f1503a.clear();
        sVar.g();
        sVar.f(eVar3, true);
        r rVarC = sVar.c();
        if (eVar3 != null) {
            rVarC.f1497b--;
        }
        if (rVarC.f1497b == 0) {
            SparseArray<r.a> sparseArray = rVarC.f1496a;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                r.a aVarValueAt = sparseArray.valueAt(i6);
                ArrayList<b0> arrayList = aVarValueAt.f1499a;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    b0 b0Var = arrayList.get(i7);
                    i7++;
                    a1.a.c(b0Var.f1441a);
                }
                aVarValueAt.f1499a.clear();
            }
        }
        if (eVar4 != null) {
            rVarC.f1497b++;
        }
        sVar.e();
        this.f1433z0.f1531f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f1432z) {
            this.f1408g0 = null;
            this.f1406e0 = null;
            this.f1407f0 = null;
            this.f1405d0 = null;
        }
        this.f1432z = z6;
        super.setClipToPadding(z6);
        if (this.N) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.f1404c0 = iVar;
        this.f1408g0 = null;
        this.f1406e0 = null;
        this.f1407f0 = null;
        this.f1405d0 = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.M = z6;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.f1409h0;
        if (jVar2 != null) {
            jVar2.e();
            this.f1409h0.f1463a = null;
        }
        this.f1409h0 = jVar;
        if (jVar != null) {
            jVar.f1463a = this.E0;
        }
    }

    public void setItemViewCacheSize(int i6) {
        s sVar = this.f1422u;
        sVar.f1507e = i6;
        sVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(m mVar) {
        androidx.recyclerview.widget.o oVar;
        if (mVar == this.F) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f1427w0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f1435u.abortAnimation();
        m mVar2 = this.F;
        if (mVar2 != null && (oVar = mVar2.f1476e) != null) {
            oVar.f();
        }
        m mVar3 = this.F;
        s sVar = this.f1422u;
        if (mVar3 != null) {
            j jVar = this.f1409h0;
            if (jVar != null) {
                jVar.e();
            }
            this.F.i0(sVar);
            this.F.j0(sVar);
            sVar.f1503a.clear();
            sVar.g();
            if (this.L) {
                m mVar4 = this.F;
                mVar4.f1478g = false;
                mVar4.S(this);
            }
            this.F.v0(null);
            this.F = null;
        } else {
            sVar.f1503a.clear();
            sVar.g();
        }
        androidx.recyclerview.widget.b bVar = this.f1428x;
        RecyclerView recyclerView = bVar.f1588a.f1719a;
        bVar.f1589b.g();
        ArrayList arrayList = bVar.f1590c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0VarM = M((View) arrayList.get(size));
            if (b0VarM != null) {
                int i6 = b0VarM.f1455p;
                if (recyclerView.P()) {
                    b0VarM.f1456q = i6;
                    recyclerView.M0.add(b0VarM);
                } else {
                    View view = b0VarM.f1441a;
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    view.setImportantForAccessibility(i6);
                }
                b0VarM.f1455p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            b0 b0VarM2 = M(childAt);
            e eVar = recyclerView.E;
            if (eVar != null && b0VarM2 != null) {
                eVar.f(b0VarM2);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.F = mVar;
        if (mVar != null) {
            if (mVar.f1473b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(mVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.activity.m.c(mVar.f1473b, sb));
            }
            mVar.v0(this);
            if (this.L) {
                m mVar5 = this.F;
                mVar5.f1478g = true;
                mVar5.R(this);
            }
        }
        sVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        u0.n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f14519d) {
            ViewGroup viewGroup = scrollingChildHelper.f14518c;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.d.l(viewGroup);
        }
        scrollingChildHelper.f14519d = z6;
    }

    public void setOnFlingListener(o oVar) {
        this.f1417q0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.A0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f1425v0 = z6;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f1422u;
        RecyclerView recyclerView = RecyclerView.this;
        sVar.f(recyclerView.E, false);
        if (sVar.f1509g != null) {
            r2.f1497b--;
        }
        sVar.f1509g = rVar;
        if (rVar != null && recyclerView.getAdapter() != null) {
            sVar.f1509g.f1497b++;
        }
        sVar.e();
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.G = tVar;
    }

    public void setScrollState(int i6) {
        androidx.recyclerview.widget.o oVar;
        if (i6 == this.f1410i0) {
            return;
        }
        if (T0) {
            Log.d("RecyclerView", "setting scroll state to " + i6 + " from " + this.f1410i0, new Exception());
        }
        this.f1410i0 = i6;
        if (i6 != 2) {
            a0 a0Var = this.f1427w0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f1435u.abortAnimation();
            m mVar = this.F;
            if (mVar != null && (oVar = mVar.f1476e) != null) {
                oVar.f();
            }
        }
        m mVar2 = this.F;
        if (mVar2 != null) {
            mVar2.h0(i6);
        }
        q qVar = this.A0;
        if (qVar != null) {
            qVar.a(this, i6);
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) this.B0.get(size)).a(this, i6);
            }
        }
    }

    public void setScrollingTouchSlop(int i6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 == 1) {
                this.p0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
        }
        this.p0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        this.f1422u.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        androidx.recyclerview.widget.o oVar;
        if (z6 != this.Q) {
            k("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.Q = false;
                if (this.P && this.F != null && this.E != null) {
                    requestLayout();
                }
                this.P = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.Q = true;
            this.R = true;
            setScrollState(0);
            a0 a0Var = this.f1427w0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f1435u.abortAnimation();
            m mVar = this.F;
            if (mVar == null || (oVar = mVar.f1476e) == null) {
                return;
            }
            oVar.f();
        }
    }

    public final void t() {
        j0();
        T();
        x xVar = this.f1433z0;
        xVar.a(6);
        this.f1426w.c();
        xVar.f1530e = this.E.a();
        xVar.f1528c = 0;
        if (this.f1424v != null) {
            e eVar = this.E;
            int iOrdinal = eVar.f1461c.ordinal();
            if (iOrdinal == 1 ? eVar.a() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f1424v.f1511u;
                if (parcelable != null) {
                    this.F.f0(parcelable);
                }
                this.f1424v = null;
            }
        }
        xVar.f1532g = false;
        this.F.d0(this.f1422u, xVar);
        xVar.f1531f = false;
        xVar.f1534j = xVar.f1534j && this.f1409h0 != null;
        xVar.f1529d = 4;
        U(true);
        k0(false);
    }

    public final boolean u(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2, i8);
    }

    public final void v(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().d(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    public final void w(int i6, int i7) {
        this.f1403b0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i7);
        q qVar = this.A0;
        if (qVar != null) {
            qVar.b(this, i6, i7);
        }
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) this.B0.get(size)).b(this, i6, i7);
            }
        }
        this.f1403b0--;
    }

    public final void x() {
        if (this.f1408g0 != null) {
            return;
        }
        ((y) this.f1404c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1408g0 = edgeEffect;
        if (this.f1432z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f1405d0 != null) {
            return;
        }
        ((y) this.f1404c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1405d0 = edgeEffect;
        if (this.f1432z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1407f0 != null) {
            return;
        }
        ((y) this.f1404c0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1407f0 = edgeEffect;
        if (this.f1432z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i6) throws NoSuchMethodException, SecurityException {
        float fA;
        char c7;
        int i7;
        boolean z6;
        char c8;
        int i8;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i6);
        this.f1420t = new u();
        this.f1422u = new s();
        this.f1430y = new c0();
        this.A = new a();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new RectF();
        this.H = new ArrayList();
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.O = 0;
        this.V = false;
        this.W = false;
        this.f1402a0 = 0;
        this.f1403b0 = 0;
        this.f1404c0 = f1401b1;
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k();
        kVar.f1463a = null;
        kVar.f1464b = new ArrayList<>();
        kVar.f1465c = 120L;
        kVar.f1466d = 120L;
        kVar.f1467e = 250L;
        kVar.f1468f = 250L;
        kVar.f1725g = true;
        kVar.h = new ArrayList<>();
        kVar.f1633i = new ArrayList<>();
        kVar.f1634j = new ArrayList<>();
        kVar.f1635k = new ArrayList<>();
        kVar.f1636l = new ArrayList<>();
        kVar.f1637m = new ArrayList<>();
        kVar.f1638n = new ArrayList<>();
        kVar.f1639o = new ArrayList<>();
        kVar.f1640p = new ArrayList<>();
        kVar.f1641q = new ArrayList<>();
        kVar.f1642r = new ArrayList<>();
        this.f1409h0 = kVar;
        this.f1410i0 = 0;
        this.f1411j0 = -1;
        this.f1421t0 = Float.MIN_VALUE;
        this.f1423u0 = Float.MIN_VALUE;
        this.f1425v0 = true;
        this.f1427w0 = new a0();
        this.f1431y0 = Y0 ? new m.b() : null;
        x xVar = new x();
        xVar.f1526a = -1;
        xVar.f1527b = 0;
        xVar.f1528c = 0;
        xVar.f1529d = 1;
        xVar.f1530e = 0;
        xVar.f1531f = false;
        xVar.f1532g = false;
        xVar.h = false;
        xVar.f1533i = false;
        xVar.f1534j = false;
        xVar.f1535k = false;
        this.f1433z0 = xVar;
        this.C0 = false;
        this.D0 = false;
        k kVar2 = new k();
        this.E0 = kVar2;
        this.F0 = false;
        this.H0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new ArrayList();
        this.N0 = new b();
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.p0 = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = u0.g0.f14497a;
            fA = g0.a.a(viewConfiguration);
        } else {
            fA = u0.g0.a(viewConfiguration, context);
        }
        this.f1421t0 = fA;
        this.f1423u0 = i9 >= 26 ? g0.a.b(viewConfiguration) : u0.g0.a(viewConfiguration, context);
        this.f1418r0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1419s0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.s = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1409h0.f1463a = kVar2;
        this.f1426w = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.w(this));
        this.f1428x = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.v(this));
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        if ((i9 >= 26 ? f0.f.a(this) : 0) == 0 && i9 >= 26) {
            f0.f.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.U = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.x(this));
        int[] iArr = t1.a.f14404a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        f0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i6, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1432z = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(androidx.activity.m.c(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c8 = 2;
            z6 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i8 = i6;
            c7 = 3;
            i7 = 4;
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.htmltoapk.template.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.htmltoapk.template.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.htmltoapk.template.R.dimen.fastscroll_margin));
        } else {
            c7 = 3;
            i7 = 4;
            z6 = 1;
            c8 = 2;
            i8 = i6;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(Z0);
                        Object[] objArr2 = new Object[i7];
                        objArr2[0] = context;
                        objArr2[z6] = attributeSet;
                        objArr2[c8] = Integer.valueOf(i8);
                        objArr2[c7] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e6) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e7) {
                            e7.initCause(e6);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                        }
                    }
                    constructor.setAccessible(z6);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e8);
                } catch (ClassNotFoundException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e9);
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e10);
                } catch (InstantiationException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e11);
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                }
            }
        }
        int[] iArr2 = U0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i8, 0);
        f0.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i8, 0);
        boolean z7 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
        setTag(com.htmltoapk.template.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public b0 f1492a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f1493b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1494c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1495d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1493b = new Rect();
            this.f1494c = true;
            this.f1495d = false;
        }

        public n(int i6, int i7) {
            super(i6, i7);
            this.f1493b = new Rect();
            this.f1494c = true;
            this.f1495d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1493b = new Rect();
            this.f1494c = true;
            this.f1495d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1493b = new Rect();
            this.f1494c = true;
            this.f1495d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f1493b = new Rect();
            this.f1494c = true;
            this.f1495d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.F;
        if (mVar != null) {
            return mVar.t(layoutParams);
        }
        throw new IllegalStateException(androidx.activity.m.c(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class g {
        public void a() {
        }

        public void b(int i6) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f1472a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f1473b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.recyclerview.widget.b0 f1474c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.recyclerview.widget.b0 f1475d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.o f1476e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1477f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1478g;
        public final boolean h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f1479i;

        /* renamed from: j, reason: collision with root package name */
        public int f1480j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1481k;

        /* renamed from: l, reason: collision with root package name */
        public int f1482l;

        /* renamed from: m, reason: collision with root package name */
        public int f1483m;

        /* renamed from: n, reason: collision with root package name */
        public int f1484n;

        /* renamed from: o, reason: collision with root package name */
        public int f1485o;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements b0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a(View view) {
                return (view.getLeft() - ((n) view.getLayoutParams()).f1493b.left) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b() {
                return m.this.E();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f1484n - mVar.F();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View d(int i6) {
                return m.this.u(i6);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return view.getRight() + ((n) view.getLayoutParams()).f1493b.right + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class b implements b0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a(View view) {
                return (view.getTop() - ((n) view.getLayoutParams()).f1493b.top) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b() {
                return m.this.G();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int c() {
                m mVar = m.this;
                return mVar.f1485o - mVar.D();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View d(int i6) {
                return m.this.u(i6);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return view.getBottom() + ((n) view.getLayoutParams()).f1493b.bottom + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f1488a;

            /* renamed from: b, reason: collision with root package name */
            public int f1489b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f1490c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f1491d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f1474c = new androidx.recyclerview.widget.b0(aVar);
            this.f1475d = new androidx.recyclerview.widget.b0(bVar);
            this.f1477f = false;
            this.f1478g = false;
            this.h = true;
            this.f1479i = true;
        }

        public static int A(View view) {
            Rect rect = ((n) view.getLayoutParams()).f1493b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int H(View view) {
            return ((n) view.getLayoutParams()).f1492a.b();
        }

        public static c I(Context context, AttributeSet attributeSet, int i6, int i7) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t1.a.f14404a, i6, i7);
            cVar.f1488a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.f1489b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.f1490c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.f1491d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean M(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (i8 > 0 && i6 != i8) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i6;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i6;
            }
            return true;
        }

        public static void N(View view, int i6, int i7, int i8, int i9) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f1493b;
            view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public static int g(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int w(boolean z6, int i6, int i7, int i8, int i9) {
            int iMax = Math.max(0, i6 - i8);
            if (z6) {
                if (i9 < 0) {
                    if (i9 != -1 || (i7 != Integer.MIN_VALUE && (i7 == 0 || i7 != 1073741824))) {
                        i7 = 0;
                        i9 = 0;
                    } else {
                        i9 = iMax;
                    }
                }
                i7 = 1073741824;
            } else if (i9 >= 0) {
                i7 = 1073741824;
            } else if (i9 != -1) {
                if (i9 == -2) {
                    if (i7 == Integer.MIN_VALUE || i7 == 1073741824) {
                        i9 = iMax;
                        i7 = Integer.MIN_VALUE;
                    } else {
                        i9 = iMax;
                        i7 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i9, i7);
        }

        public static int z(View view) {
            Rect rect = ((n) view.getLayoutParams()).f1493b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @SuppressLint({"UnknownNullness"})
        public final void A0(androidx.recyclerview.widget.o oVar) {
            androidx.recyclerview.widget.o oVar2 = this.f1476e;
            if (oVar2 != null && oVar != oVar2 && oVar2.f1516e) {
                oVar2.f();
            }
            this.f1476e = oVar;
            RecyclerView recyclerView = this.f1473b;
            a0 a0Var = recyclerView.f1427w0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f1435u.abortAnimation();
            if (oVar.h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f1513b = recyclerView;
            oVar.f1514c = this;
            int i6 = oVar.f1512a;
            if (i6 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f1433z0.f1526a = i6;
            oVar.f1516e = true;
            oVar.f1515d = true;
            oVar.f1517f = recyclerView.F.q(i6);
            oVar.f1513b.f1427w0.b();
            oVar.h = true;
        }

        public final int B() {
            RecyclerView recyclerView = this.f1473b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public boolean B0() {
            return false;
        }

        public final int C() {
            RecyclerView recyclerView = this.f1473b;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            return recyclerView.getLayoutDirection();
        }

        public final int D() {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int G() {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int J(s sVar, x xVar) {
            return -1;
        }

        public final void K(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f1493b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f1473b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1473b.D;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean L() {
            return false;
        }

        public void O(int i6) {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                int iE = recyclerView.f1428x.e();
                for (int i7 = 0; i7 < iE; i7++) {
                    recyclerView.f1428x.d(i7).offsetLeftAndRight(i6);
                }
            }
        }

        public void P(int i6) {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                int iE = recyclerView.f1428x.e();
                for (int i7 = 0; i7 < iE; i7++) {
                    recyclerView.f1428x.d(i7).offsetTopAndBottom(i6);
                }
            }
        }

        public View T(View view, int i6, s sVar, x xVar) {
            return null;
        }

        public void U(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1473b;
            s sVar = recyclerView.f1422u;
            x xVar = recyclerView.f1433z0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1473b.canScrollVertically(-1) && !this.f1473b.canScrollHorizontally(-1) && !this.f1473b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            e eVar = this.f1473b.E;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.a());
            }
        }

        public void V(s sVar, x xVar, v0.b bVar) {
            if (this.f1473b.canScrollVertically(-1) || this.f1473b.canScrollHorizontally(-1)) {
                bVar.a(8192);
                bVar.j(true);
            }
            if (this.f1473b.canScrollVertically(1) || this.f1473b.canScrollHorizontally(1)) {
                bVar.a(4096);
                bVar.j(true);
            }
            bVar.f14729a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(sVar, xVar), x(sVar, xVar), false, 0));
        }

        public final void W(View view, v0.b bVar) {
            b0 b0VarM = RecyclerView.M(view);
            if (b0VarM == null || b0VarM.h()) {
                return;
            }
            androidx.recyclerview.widget.b bVar2 = this.f1472a;
            if (bVar2.f1590c.contains(b0VarM.f1441a)) {
                return;
            }
            RecyclerView recyclerView = this.f1473b;
            X(recyclerView.f1422u, recyclerView.f1433z0, view, bVar);
        }

        public final void b(View view, int i6, boolean z6) {
            b0 b0VarM = RecyclerView.M(view);
            if (z6 || b0VarM.h()) {
                w.g<b0, c0.a> gVar = this.f1473b.f1430y.f1603a;
                c0.a aVarA = gVar.get(b0VarM);
                if (aVarA == null) {
                    aVarA = c0.a.a();
                    gVar.put(b0VarM, aVarA);
                }
                aVarA.f1606a |= 1;
            } else {
                this.f1473b.f1430y.c(b0VarM);
            }
            n nVar = (n) view.getLayoutParams();
            if (b0VarM.p() || b0VarM.i()) {
                if (b0VarM.i()) {
                    b0VarM.f1453n.m(b0VarM);
                } else {
                    b0VarM.f1449j &= -33;
                }
                this.f1472a.b(view, i6, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f1473b) {
                    androidx.recyclerview.widget.b bVar = this.f1472a;
                    b.a aVar = bVar.f1589b;
                    int iIndexOfChild = bVar.f1588a.f1719a.indexOfChild(view);
                    int iB = (iIndexOfChild == -1 || aVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - aVar.b(iIndexOfChild);
                    if (i6 == -1) {
                        i6 = this.f1472a.e();
                    }
                    if (iB == -1) {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.f1473b.indexOfChild(view));
                        throw new IllegalStateException(androidx.activity.m.c(this.f1473b, sb));
                    }
                    if (iB != i6) {
                        m mVar = this.f1473b.F;
                        View viewU = mVar.u(iB);
                        if (viewU == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + mVar.f1473b.toString());
                        }
                        mVar.u(iB);
                        mVar.f1472a.c(iB);
                        n nVar2 = (n) viewU.getLayoutParams();
                        b0 b0VarM2 = RecyclerView.M(viewU);
                        if (b0VarM2.h()) {
                            w.g<b0, c0.a> gVar2 = mVar.f1473b.f1430y.f1603a;
                            c0.a aVarA2 = gVar2.get(b0VarM2);
                            if (aVarA2 == null) {
                                aVarA2 = c0.a.a();
                                gVar2.put(b0VarM2, aVarA2);
                            }
                            aVarA2.f1606a = 1 | aVarA2.f1606a;
                        } else {
                            mVar.f1473b.f1430y.c(b0VarM2);
                        }
                        mVar.f1472a.b(viewU, i6, nVar2, b0VarM2.h());
                    }
                } else {
                    this.f1472a.a(view, i6, false);
                    nVar.f1494c = true;
                    androidx.recyclerview.widget.o oVar = this.f1476e;
                    if (oVar != null && oVar.f1516e) {
                        oVar.f1513b.getClass();
                        b0 b0VarM3 = RecyclerView.M(view);
                        if ((b0VarM3 != null ? b0VarM3.b() : -1) == oVar.f1512a) {
                            oVar.f1517f = view;
                            if (RecyclerView.T0) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (nVar.f1495d) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + nVar.f1492a);
                }
                b0VarM.f1441a.invalidate();
                nVar.f1495d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void c(String str) {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                recyclerView.k(str);
            }
        }

        public boolean d() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void d0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean e() {
            return false;
        }

        public boolean f(n nVar) {
            return nVar != null;
        }

        public Parcelable g0() {
            return null;
        }

        public final void i0(s sVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                if (!RecyclerView.M(u(iV)).o()) {
                    View viewU = u(iV);
                    l0(iV);
                    sVar.i(viewU);
                }
            }
        }

        public int j(x xVar) {
            return 0;
        }

        public final void j0(s sVar) {
            ArrayList<b0> arrayList = sVar.f1503a;
            int size = arrayList.size();
            for (int i6 = size - 1; i6 >= 0; i6--) {
                View view = arrayList.get(i6).f1441a;
                b0 b0VarM = RecyclerView.M(view);
                if (!b0VarM.o()) {
                    b0VarM.n(false);
                    if (b0VarM.j()) {
                        this.f1473b.removeDetachedView(view, false);
                    }
                    j jVar = this.f1473b.f1409h0;
                    if (jVar != null) {
                        jVar.d(b0VarM);
                    }
                    b0VarM.n(true);
                    b0 b0VarM2 = RecyclerView.M(view);
                    b0VarM2.f1453n = null;
                    b0VarM2.f1454o = false;
                    b0VarM2.f1449j &= -33;
                    sVar.j(b0VarM2);
                }
            }
            arrayList.clear();
            ArrayList<b0> arrayList2 = sVar.f1504b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f1473b.invalidate();
            }
        }

        public int k(x xVar) {
            return 0;
        }

        public final void k0(View view, s sVar) {
            androidx.recyclerview.widget.b bVar = this.f1472a;
            androidx.recyclerview.widget.v vVar = bVar.f1588a;
            int i6 = bVar.f1591d;
            if (i6 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i6 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                bVar.f1591d = 1;
                bVar.f1592e = view;
                int iIndexOfChild = vVar.f1719a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (bVar.f1589b.f(iIndexOfChild)) {
                        bVar.j(view);
                    }
                    vVar.a(iIndexOfChild);
                }
                bVar.f1591d = 0;
                bVar.f1592e = null;
                sVar.i(view);
            } catch (Throwable th) {
                bVar.f1591d = 0;
                bVar.f1592e = null;
                throw th;
            }
        }

        public int l(x xVar) {
            return 0;
        }

        public final void l0(int i6) {
            if (u(i6) != null) {
                androidx.recyclerview.widget.b bVar = this.f1472a;
                androidx.recyclerview.widget.v vVar = bVar.f1588a;
                int i7 = bVar.f1591d;
                if (i7 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i7 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iF = bVar.f(i6);
                    View childAt = vVar.f1719a.getChildAt(iF);
                    if (childAt != null) {
                        bVar.f1591d = 1;
                        bVar.f1592e = childAt;
                        if (bVar.f1589b.f(iF)) {
                            bVar.j(childAt);
                        }
                        vVar.a(iF);
                    }
                    bVar.f1591d = 0;
                    bVar.f1592e = null;
                } catch (Throwable th) {
                    bVar.f1591d = 0;
                    bVar.f1592e = null;
                    throw th;
                }
            }
        }

        public int m(x xVar) {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
            int iE = E();
            int iG = G();
            int iF = this.f1484n - F();
            int iD = this.f1485o - D();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i6 = left - iE;
            int iMin = Math.min(0, i6);
            int i7 = top - iG;
            int iMin2 = Math.min(0, i7);
            int i8 = iWidth - iF;
            int iMax = Math.max(0, i8);
            int iMax2 = Math.max(0, iHeight - iD);
            if (C() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i6, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i8);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i7, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i9 = iArr[0];
            int i10 = iArr[1];
            if (z7) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int iE2 = E();
                    int iG2 = G();
                    int iF2 = this.f1484n - F();
                    int iD2 = this.f1485o - D();
                    Rect rect2 = this.f1473b.B;
                    y(focusedChild, rect2);
                    if (rect2.left - i9 < iF2 && rect2.right - i9 > iE2 && rect2.top - i10 < iD2 && rect2.bottom - i10 > iG2) {
                    }
                }
            } else if (i9 != 0 || i10 != 0) {
                if (z6) {
                    recyclerView.scrollBy(i9, i10);
                    return true;
                }
                recyclerView.i0(i9, i10, false);
                return true;
            }
            return false;
        }

        public int n(x xVar) {
            return 0;
        }

        public final void n0() {
            RecyclerView recyclerView = this.f1473b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int o(x xVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int o0(int i6, s sVar, x xVar) {
            return 0;
        }

        public final void p(s sVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                View viewU = u(iV);
                b0 b0VarM = RecyclerView.M(viewU);
                if (b0VarM.o()) {
                    if (RecyclerView.T0) {
                        Log.d("RecyclerView", "ignoring view " + b0VarM);
                    }
                } else if (!b0VarM.f() || b0VarM.h() || this.f1473b.E.f1460b) {
                    u(iV);
                    this.f1472a.c(iV);
                    sVar.k(viewU);
                    this.f1473b.f1430y.c(b0VarM);
                } else {
                    l0(iV);
                    sVar.j(b0VarM);
                }
            }
        }

        public void p0(int i6) {
            if (RecyclerView.T0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public View q(int i6) {
            int iV = v();
            for (int i7 = 0; i7 < iV; i7++) {
                View viewU = u(i7);
                b0 b0VarM = RecyclerView.M(viewU);
                if (b0VarM != null && b0VarM.b() == i6 && !b0VarM.o() && (this.f1473b.f1433z0.f1532g || !b0VarM.h())) {
                    return viewU;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public int q0(int i6, s sVar, x xVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract n r();

        public final void r0(RecyclerView recyclerView) {
            s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        @SuppressLint({"UnknownNullness"})
        public n s(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void s0(int i6, int i7) {
            this.f1484n = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            this.f1482l = mode;
            if (mode == 0 && !RecyclerView.W0) {
                this.f1484n = 0;
            }
            this.f1485o = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f1483m = mode2;
            if (mode2 != 0 || RecyclerView.W0) {
                return;
            }
            this.f1485o = 0;
        }

        @SuppressLint({"UnknownNullness"})
        public n t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public void t0(Rect rect, int i6, int i7) {
            int iF = F() + E() + rect.width();
            int iD = D() + G() + rect.height();
            RecyclerView recyclerView = this.f1473b;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            this.f1473b.setMeasuredDimension(g(i6, iF, recyclerView.getMinimumWidth()), g(i7, iD, this.f1473b.getMinimumHeight()));
        }

        public final View u(int i6) {
            androidx.recyclerview.widget.b bVar = this.f1472a;
            if (bVar != null) {
                return bVar.d(i6);
            }
            return null;
        }

        public final void u0(int i6, int i7) {
            int iV = v();
            if (iV == 0) {
                this.f1473b.q(i6, i7);
                return;
            }
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < iV; i12++) {
                View viewU = u(i12);
                Rect rect = this.f1473b.B;
                y(viewU, rect);
                int i13 = rect.left;
                if (i13 < i11) {
                    i11 = i13;
                }
                int i14 = rect.right;
                if (i14 > i8) {
                    i8 = i14;
                }
                int i15 = rect.top;
                if (i15 < i9) {
                    i9 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i10) {
                    i10 = i16;
                }
            }
            this.f1473b.B.set(i11, i9, i8, i10);
            t0(this.f1473b.B, i6, i7);
        }

        public final int v() {
            androidx.recyclerview.widget.b bVar = this.f1472a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void v0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f1473b = null;
                this.f1472a = null;
                this.f1484n = 0;
                this.f1485o = 0;
            } else {
                this.f1473b = recyclerView;
                this.f1472a = recyclerView.f1428x;
                this.f1484n = recyclerView.getWidth();
                this.f1485o = recyclerView.getHeight();
            }
            this.f1482l = 1073741824;
            this.f1483m = 1073741824;
        }

        public final boolean w0(View view, int i6, int i7, n nVar) {
            return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) nVar).width) && M(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public int x(s sVar, x xVar) {
            return -1;
        }

        public boolean x0() {
            return false;
        }

        public void y(View view, Rect rect) {
            boolean z6 = RecyclerView.S0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f1493b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public final boolean y0(View view, int i6, int i7, n nVar) {
            return (this.h && M(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) nVar).width) && M(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void z0(RecyclerView recyclerView, int i6) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void Q() {
        }

        public void Z() {
        }

        public void R(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void S(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void e0(x xVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void f0(Parcelable parcelable) {
        }

        public void h0(int i6) {
        }

        public void Y(int i6, int i7) {
        }

        public void a0(int i6, int i7) {
        }

        public void b0(int i6, int i7) {
        }

        public void c0(int i6, int i7) {
        }

        @SuppressLint({"UnknownNullness"})
        public void i(int i6, m.b bVar) {
        }

        public void X(s sVar, x xVar, View view, v0.b bVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void h(int i6, int i7, x xVar, m.b bVar) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class e<VH extends b0> {

        /* renamed from: a, reason: collision with root package name */
        public final f f1459a = new f();

        /* renamed from: b, reason: collision with root package name */
        public boolean f1460b = false;

        /* renamed from: c, reason: collision with root package name */
        public final a f1461c = a.s;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class a {
            public static final a s;

            /* renamed from: t, reason: collision with root package name */
            public static final /* synthetic */ a[] f1462t;

            static {
                a aVar = new a("ALLOW", 0);
                s = aVar;
                f1462t = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f1462t.clone();
            }
        }

        public abstract int a();

        public long b(int i6) {
            return -1L;
        }

        public abstract void c(VH vh, int i6);

        public abstract b0 d(ViewGroup viewGroup);

        public void e(VH vh) {
        }

        public void f(VH vh) {
        }

        public void g(VH vh) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class l {
        public void c(Canvas canvas, RecyclerView recyclerView) {
        }

        public void d(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class q {
        public void a(RecyclerView recyclerView, int i6) {
        }

        public void b(RecyclerView recyclerView, int i6, int i7) {
        }
    }
}
