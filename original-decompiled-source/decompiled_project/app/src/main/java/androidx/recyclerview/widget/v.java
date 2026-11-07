package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
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
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.y;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import p.b1;
import p.g0;
import p.i0;
import y3.a;
import y3.q0;

/* loaded from: classes.dex */
public class v extends ViewGroup implements y3.p {
    public static boolean C0 = false;
    public static boolean D0 = false;
    public static final int[] E0 = {R.attr.nestedScrollingEnabled};
    public static final float F0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean G0 = true;
    public static final boolean H0 = true;
    public static final Class<?>[] I0;
    public static final b J0;
    public static final x K0;
    public boolean A;
    public int A0;
    public boolean B;
    public final c B0;
    public int C;
    public final AccessibilityManager D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public h I;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public i O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final float f2657a;

    /* renamed from: a0, reason: collision with root package name */
    public n f2658a0;

    /* renamed from: b, reason: collision with root package name */
    public final t f2659b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f2660b0;

    /* renamed from: c, reason: collision with root package name */
    public final r f2661c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f2662c0;

    /* renamed from: d, reason: collision with root package name */
    public u f2663d;

    /* renamed from: d0, reason: collision with root package name */
    public final float f2664d0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.a f2665e;

    /* renamed from: e0, reason: collision with root package name */
    public final float f2666e0;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.b f2667f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f2668f0;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f2669g;

    /* renamed from: g0, reason: collision with root package name */
    public final z f2670g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2671h;

    /* renamed from: h0, reason: collision with root package name */
    public androidx.recyclerview.widget.m f2672h0;

    /* renamed from: i0, reason: collision with root package name */
    public final m.b f2673i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f2674j;

    /* renamed from: j0, reason: collision with root package name */
    public final w f2675j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2676k;

    /* renamed from: k0, reason: collision with root package name */
    public p f2677k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f2678l;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayList f2679l0;

    /* renamed from: m, reason: collision with root package name */
    public d f2680m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2681m0;

    /* renamed from: n, reason: collision with root package name */
    public l f2682n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2683n0;

    /* renamed from: o0, reason: collision with root package name */
    public final j f2684o0;

    /* renamed from: p, reason: collision with root package name */
    public s f2685p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2686p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2687q;

    /* renamed from: q0, reason: collision with root package name */
    public androidx.recyclerview.widget.y f2688q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList<k> f2689r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f2690r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<o> f2691s;

    /* renamed from: s0, reason: collision with root package name */
    public y3.q f2692s0;

    /* renamed from: t, reason: collision with root package name */
    public o f2693t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f2694t0;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f2695u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2696v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f2697v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2698w;

    /* renamed from: w0, reason: collision with root package name */
    public final ArrayList f2699w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2700x;

    /* renamed from: x0, reason: collision with root package name */
    public final a f2701x0;

    /* renamed from: y, reason: collision with root package name */
    public int f2702y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2703y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2704z;

    /* renamed from: z0, reason: collision with root package name */
    public int f2705z0;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z10;
            v vVar = v.this;
            i iVar = vVar.O;
            if (iVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) iVar;
                long j10 = kVar.f2734d;
                ArrayList<a0> arrayList = kVar.f2565h;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar.f2567j;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar.f2568k;
                boolean zIsEmpty3 = arrayList3.isEmpty();
                ArrayList<a0> arrayList4 = kVar.f2566i;
                boolean zIsEmpty4 = arrayList4.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        a0 a0Var = arrayList.get(i10);
                        i10++;
                        a0 a0Var2 = a0Var;
                        View view = a0Var2.f2708a;
                        ArrayList<a0> arrayList5 = arrayList;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        kVar.f2574q.add(a0Var2);
                        viewPropertyAnimatorAnimate.setDuration(j10).alpha(CropImageView.DEFAULT_ASPECT_RATIO).setListener(new androidx.recyclerview.widget.f(view, viewPropertyAnimatorAnimate, kVar, a0Var2)).start();
                        arrayList = arrayList5;
                        zIsEmpty = zIsEmpty;
                        zIsEmpty2 = zIsEmpty2;
                    }
                    boolean z11 = zIsEmpty;
                    boolean z12 = zIsEmpty2;
                    arrayList.clear();
                    if (!z12) {
                        ArrayList<k.b> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList2);
                        kVar.f2570m.add(arrayList6);
                        arrayList2.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList6);
                        if (z11) {
                            cVar.run();
                        } else {
                            View view2 = arrayList6.get(0).f2582a.f2708a;
                            Field field = q0.f33885a;
                            view2.postOnAnimationDelayed(cVar, j10);
                        }
                    }
                    if (!zIsEmpty3) {
                        ArrayList<k.a> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList3);
                        kVar.f2571n.add(arrayList7);
                        arrayList3.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList7);
                        if (z11) {
                            dVar.run();
                        } else {
                            View view3 = arrayList7.get(0).f2576a.f2708a;
                            Field field2 = q0.f33885a;
                            view3.postOnAnimationDelayed(dVar, j10);
                        }
                    }
                    if (zIsEmpty4) {
                        z10 = false;
                    } else {
                        ArrayList<a0> arrayList8 = new ArrayList<>();
                        arrayList8.addAll(arrayList4);
                        kVar.f2569l.add(arrayList8);
                        arrayList4.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList8);
                        if (z11 && z12 && zIsEmpty3) {
                            eVar.run();
                            z10 = false;
                        } else {
                            if (z11) {
                                j10 = 0;
                            }
                            long jMax = Math.max(!z12 ? kVar.f2735e : 0L, zIsEmpty3 ? 0L : kVar.f2736f) + j10;
                            z10 = false;
                            View view4 = arrayList8.get(0).f2708a;
                            Field field3 = q0.f33885a;
                            view4.postOnAnimationDelayed(eVar, jMax);
                        }
                    }
                }
            }
            vVar.f2686p0 = z10;
        }
    }

    public static abstract class a0 {

        /* renamed from: s, reason: collision with root package name */
        public static final List<Object> f2707s = Collections.EMPTY_LIST;

        /* renamed from: a, reason: collision with root package name */
        public final View f2708a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<v> f2709b;

        /* renamed from: i, reason: collision with root package name */
        public int f2716i;

        /* renamed from: q, reason: collision with root package name */
        public v f2724q;

        /* renamed from: r, reason: collision with root package name */
        public d<? extends a0> f2725r;

        /* renamed from: c, reason: collision with root package name */
        public int f2710c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f2711d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f2712e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f2713f = -1;

        /* renamed from: g, reason: collision with root package name */
        public a0 f2714g = null;

        /* renamed from: h, reason: collision with root package name */
        public a0 f2715h = null;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f2717j = null;

        /* renamed from: k, reason: collision with root package name */
        public final List<Object> f2718k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f2719l = 0;

        /* renamed from: m, reason: collision with root package name */
        public r f2720m = null;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2721n = false;

        /* renamed from: o, reason: collision with root package name */
        public int f2722o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f2723p = -1;

        public a0(View view) {
            this.f2708a = view;
        }

        public final void a(int i10) {
            this.f2716i = i10 | this.f2716i;
        }

        public final int b() {
            int i10 = this.f2713f;
            return i10 == -1 ? this.f2710c : i10;
        }

        public final List<Object> c() {
            ArrayList arrayList;
            return ((this.f2716i & 1024) != 0 || (arrayList = this.f2717j) == null || arrayList.size() == 0) ? f2707s : this.f2718k;
        }

        public final boolean d() {
            return (this.f2716i & 1) != 0;
        }

        public final boolean e() {
            return (this.f2716i & 4) != 0;
        }

        public final boolean f() {
            if ((this.f2716i & 16) != 0) {
                return false;
            }
            Field field = q0.f33885a;
            return !this.f2708a.hasTransientState();
        }

        public final boolean g() {
            return (this.f2716i & 8) != 0;
        }

        public final boolean h() {
            return this.f2720m != null;
        }

        public final boolean i() {
            return (this.f2716i & 256) != 0;
        }

        public final boolean j() {
            return (this.f2716i & 2) != 0;
        }

        public final void k(int i10, boolean z10) {
            if (this.f2711d == -1) {
                this.f2711d = this.f2710c;
            }
            if (this.f2713f == -1) {
                this.f2713f = this.f2710c;
            }
            if (z10) {
                this.f2713f += i10;
            }
            this.f2710c += i10;
            View view = this.f2708a;
            if (view.getLayoutParams() != null) {
                ((m) view.getLayoutParams()).f2763c = true;
            }
        }

        public final void l() {
            if (v.C0 && i()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f2716i = 0;
            this.f2710c = -1;
            this.f2711d = -1;
            this.f2713f = -1;
            this.f2719l = 0;
            this.f2714g = null;
            this.f2715h = null;
            ArrayList arrayList = this.f2717j;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f2716i &= -1025;
            this.f2722o = 0;
            this.f2723p = -1;
            v.j(this);
        }

        public final void m(boolean z10) {
            int i10 = this.f2719l;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2719l = i11;
            if (i11 < 0) {
                this.f2719l = 0;
                if (v.C0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2716i |= 16;
            } else if (z10 && i11 == 0) {
                this.f2716i &= -17;
            }
            if (v.D0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        public final boolean n() {
            return (this.f2716i & 128) != 0;
        }

        public final boolean o() {
            return (this.f2716i & 32) != 0;
        }

        public final String toString() {
            StringBuilder sbA = v5.b.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbA.append(Integer.toHexString(hashCode()));
            sbA.append(" position=");
            sbA.append(this.f2710c);
            sbA.append(" id=-1, oldPos=");
            sbA.append(this.f2711d);
            sbA.append(", pLpos:");
            sbA.append(this.f2713f);
            StringBuilder sb = new StringBuilder(sbA.toString());
            if (h()) {
                sb.append(" scrap ");
                sb.append(this.f2721n ? "[changeScrap]" : "[attachedScrap]");
            }
            if (e()) {
                sb.append(" invalid");
            }
            if (!d()) {
                sb.append(" unbound");
            }
            if ((this.f2716i & 2) != 0) {
                sb.append(" update");
            }
            if (g()) {
                sb.append(" removed");
            }
            if (n()) {
                sb.append(" ignored");
            }
            if (i()) {
                sb.append(" tmpDetached");
            }
            if (!f()) {
                sb.append(" not recyclable(" + this.f2719l + ")");
            }
            if ((this.f2716i & 512) != 0 || e()) {
                sb.append(" undefined adapter position");
            }
            if (this.f2708a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c {
        public c() {
        }

        public final void a(a0 a0Var, i.b bVar, i.b bVar2) {
            boolean zG;
            int i10;
            int i11;
            a0Var.m(false);
            v vVar = v.this;
            androidx.recyclerview.widget.a0 a0Var2 = (androidx.recyclerview.widget.a0) vVar.O;
            a0Var2.getClass();
            if (bVar == null || ((i10 = bVar.f2737a) == (i11 = bVar2.f2737a) && bVar.f2738b == bVar2.f2738b)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) a0Var2;
                kVar.l(a0Var);
                a0Var.f2708a.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                kVar.f2566i.add(a0Var);
                zG = true;
            } else {
                zG = a0Var2.g(a0Var, i10, bVar.f2738b, i11, bVar2.f2738b);
            }
            if (zG) {
                vVar.T();
            }
        }

        public final void b(a0 a0Var, i.b bVar, i.b bVar2) {
            boolean zG;
            v vVar = v.this;
            vVar.f2661c.m(a0Var);
            vVar.g(a0Var);
            a0Var.m(false);
            androidx.recyclerview.widget.a0 a0Var2 = (androidx.recyclerview.widget.a0) vVar.O;
            a0Var2.getClass();
            int i10 = bVar.f2737a;
            int i11 = bVar.f2738b;
            View view = a0Var.f2708a;
            int left = bVar2 == null ? view.getLeft() : bVar2.f2737a;
            int top = bVar2 == null ? view.getTop() : bVar2.f2738b;
            if (a0Var.g() || (i10 == left && i11 == top)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) a0Var2;
                kVar.l(a0Var);
                kVar.f2565h.add(a0Var);
                zG = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zG = a0Var2.g(a0Var, i10, i11, left, top);
            }
            if (zG) {
                vVar.T();
            }
        }
    }

    public static abstract class d<VH extends a0> {

        /* renamed from: a, reason: collision with root package name */
        public final e f2727a = new e();

        /* renamed from: b, reason: collision with root package name */
        public final a f2728b = a.f2729a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2729a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ a[] f2730b;

            static {
                a aVar = new a("ALLOW", 0);
                f2729a = aVar;
                f2730b = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f2730b.clone();
            }
        }

        public abstract int a();

        public abstract void b(VH vh, int i10);

        public abstract a0 c(v vVar);

        public void d(VH vh) {
        }

        public void e(VH vh) {
        }

        public abstract void f(VH vh);
    }

    public static class e extends Observable<f> {
        public final void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
    }

    public static class h {
    }

    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public j f2731a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f2732b;

        /* renamed from: c, reason: collision with root package name */
        public long f2733c;

        /* renamed from: d, reason: collision with root package name */
        public long f2734d;

        /* renamed from: e, reason: collision with root package name */
        public long f2735e;

        /* renamed from: f, reason: collision with root package name */
        public long f2736f;

        public interface a {
            void a();
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f2737a;

            /* renamed from: b, reason: collision with root package name */
            public int f2738b;

            public final void a(a0 a0Var) {
                View view = a0Var.f2708a;
                this.f2737a = view.getLeft();
                this.f2738b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(a0 a0Var) {
            v vVar;
            int i10 = a0Var.f2716i;
            if (a0Var.e() || (i10 & 4) != 0 || (vVar = a0Var.f2724q) == null) {
                return;
            }
            vVar.H(a0Var);
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, b bVar, b bVar2);

        /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(a0 a0Var) {
            j jVar = this.f2731a;
            if (jVar != null) {
                v vVar = v.this;
                boolean z10 = true;
                a0Var.m(true);
                View view = a0Var.f2708a;
                if (a0Var.f2714g != null && a0Var.f2715h == null) {
                    a0Var.f2714g = null;
                }
                a0Var.f2715h = null;
                if ((a0Var.f2716i & 16) != 0) {
                    return;
                }
                r rVar = vVar.f2661c;
                vVar.f0();
                androidx.recyclerview.widget.b bVar = vVar.f2667f;
                b.a aVar = bVar.f2513b;
                androidx.recyclerview.widget.w wVar = bVar.f2512a;
                int i10 = bVar.f2515d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        bVar.f2515d = 2;
                        int iIndexOfChild = wVar.f2818a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            bVar.j(view);
                        } else if (aVar.d(iIndexOfChild)) {
                            aVar.f(iIndexOfChild);
                            bVar.j(view);
                            wVar.a(iIndexOfChild);
                        }
                        if (z10) {
                            a0 a0VarJ = v.J(view);
                            rVar.m(a0VarJ);
                            rVar.j(a0VarJ);
                            if (v.D0) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + vVar);
                            }
                        }
                        vVar.g0(!z10);
                        if (z10 && a0Var.i()) {
                            vVar.removeDetachedView(view, false);
                            return;
                        }
                    } finally {
                        bVar.f2515d = 0;
                    }
                }
                if (bVar.f2516e != view) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z10 = false;
                if (z10) {
                }
                vVar.g0(!z10);
                if (z10) {
                }
            }
        }

        public abstract void d(a0 a0Var);

        public abstract void e();

        public abstract boolean f();
    }

    public class j {
        public j() {
        }
    }

    public static abstract class k {
        public void c(Canvas canvas, v vVar) {
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f2740a;

        /* renamed from: b, reason: collision with root package name */
        public v f2741b;

        /* renamed from: c, reason: collision with root package name */
        public final c0 f2742c;

        /* renamed from: d, reason: collision with root package name */
        public final c0 f2743d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.o f2744e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2745f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2746g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f2747h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f2748i;

        /* renamed from: j, reason: collision with root package name */
        public int f2749j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2750k;

        /* renamed from: l, reason: collision with root package name */
        public int f2751l;

        /* renamed from: m, reason: collision with root package name */
        public int f2752m;

        /* renamed from: n, reason: collision with root package name */
        public int f2753n;

        /* renamed from: o, reason: collision with root package name */
        public int f2754o;

        public class a implements c0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int a(View view) {
                return (view.getLeft() - ((m) view.getLayoutParams()).f2762b.left) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int b() {
                return l.this.E();
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int c() {
                l lVar = l.this;
                return lVar.f2753n - lVar.F();
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final View d(int i10) {
                return l.this.u(i10);
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int e(View view) {
                return view.getRight() + ((m) view.getLayoutParams()).f2762b.right + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements c0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int a(View view) {
                return (view.getTop() - ((m) view.getLayoutParams()).f2762b.top) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int b() {
                return l.this.G();
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int c() {
                l lVar = l.this;
                return lVar.f2754o - lVar.D();
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final View d(int i10) {
                return l.this.u(i10);
            }

            @Override // androidx.recyclerview.widget.c0.b
            public final int e(View view) {
                return view.getBottom() + ((m) view.getLayoutParams()).f2762b.bottom + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f2757a;

            /* renamed from: b, reason: collision with root package name */
            public int f2758b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f2759c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2760d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f2742c = new c0(aVar);
            this.f2743d = new c0(bVar);
            this.f2745f = false;
            this.f2746g = false;
            this.f2747h = true;
            this.f2748i = true;
        }

        public static int A(View view) {
            Rect rect = ((m) view.getLayoutParams()).f2762b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int H(View view) {
            return ((m) view.getLayoutParams()).f2761a.b();
        }

        public static c I(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5.a.f29254a, i10, i11);
            cVar.f2757a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.f2758b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.f2759c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.f2760d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean M(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static void N(View view, int i10, int i11, int i12, int i13) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f2762b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public static int g(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int w(boolean z10, int i10, int i11, int i12, int i13) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 < 0) {
                    if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                        i11 = 0;
                        i13 = 0;
                    } else {
                        i13 = iMax;
                    }
                }
                i11 = 1073741824;
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1) {
                if (i13 == -2) {
                    if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                        i13 = iMax;
                        i11 = Integer.MIN_VALUE;
                    } else {
                        i13 = iMax;
                        i11 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public static int z(View view) {
            Rect rect = ((m) view.getLayoutParams()).f2762b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public boolean A0() {
            return false;
        }

        public final int B() {
            v vVar = this.f2741b;
            d adapter = vVar != null ? vVar.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public final int C() {
            v vVar = this.f2741b;
            Field field = q0.f33885a;
            return vVar.getLayoutDirection();
        }

        public final int D() {
            v vVar = this.f2741b;
            if (vVar != null) {
                return vVar.getPaddingBottom();
            }
            return 0;
        }

        public final int E() {
            v vVar = this.f2741b;
            if (vVar != null) {
                return vVar.getPaddingLeft();
            }
            return 0;
        }

        public final int F() {
            v vVar = this.f2741b;
            if (vVar != null) {
                return vVar.getPaddingRight();
            }
            return 0;
        }

        public final int G() {
            v vVar = this.f2741b;
            if (vVar != null) {
                return vVar.getPaddingTop();
            }
            return 0;
        }

        public int J(r rVar, w wVar) {
            return -1;
        }

        public final void K(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f2762b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f2741b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2741b.f2678l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean L() {
            return false;
        }

        public void O(int i10) {
            v vVar = this.f2741b;
            if (vVar != null) {
                int iE = vVar.f2667f.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    vVar.f2667f.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void P(int i10) {
            v vVar = this.f2741b;
            if (vVar != null) {
                int iE = vVar.f2667f.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    vVar.f2667f.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void Q() {
        }

        public void R(v vVar) {
        }

        public void S(v vVar) {
        }

        public View T(View view, int i10, r rVar, w wVar) {
            return null;
        }

        public void U(AccessibilityEvent accessibilityEvent) {
            v vVar = this.f2741b;
            r rVar = vVar.f2661c;
            w wVar = vVar.f2675j0;
            if (vVar == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!vVar.canScrollVertically(1) && !this.f2741b.canScrollVertically(-1) && !this.f2741b.canScrollHorizontally(-1) && !this.f2741b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            d dVar = this.f2741b.f2680m;
            if (dVar != null) {
                accessibilityEvent.setItemCount(dVar.a());
            }
        }

        public void V(r rVar, w wVar, z3.j jVar) {
            if (this.f2741b.canScrollVertically(-1) || this.f2741b.canScrollHorizontally(-1)) {
                jVar.a(8192);
                jVar.h();
            }
            if (this.f2741b.canScrollVertically(1) || this.f2741b.canScrollHorizontally(1)) {
                jVar.a(4096);
                jVar.h();
            }
            jVar.f34725a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(rVar, wVar), x(rVar, wVar), false, 0));
        }

        public final void W(View view, z3.j jVar) {
            a0 a0VarJ = v.J(view);
            if (a0VarJ == null || a0VarJ.g()) {
                return;
            }
            androidx.recyclerview.widget.b bVar = this.f2740a;
            if (bVar.f2514c.contains(a0VarJ.f2708a)) {
                return;
            }
            v vVar = this.f2741b;
            X(vVar.f2661c, vVar.f2675j0, view, jVar);
        }

        public void X(r rVar, w wVar, View view, z3.j jVar) {
        }

        public void Y(int i10, int i11) {
        }

        public void Z() {
        }

        public void a0(int i10, int i11) {
        }

        public final void b(View view, int i10, boolean z10) {
            a0 a0VarJ = v.J(view);
            if (z10 || a0VarJ.g()) {
                b1<a0, d0.a> b1Var = this.f2741b.f2669g.f2534a;
                d0.a aVarA = b1Var.get(a0VarJ);
                if (aVarA == null) {
                    aVarA = d0.a.a();
                    b1Var.put(a0VarJ, aVarA);
                }
                aVarA.f2537a |= 1;
            } else {
                this.f2741b.f2669g.c(a0VarJ);
            }
            m mVar = (m) view.getLayoutParams();
            if (a0VarJ.o() || a0VarJ.h()) {
                if (a0VarJ.h()) {
                    a0VarJ.f2720m.m(a0VarJ);
                } else {
                    a0VarJ.f2716i &= -33;
                }
                this.f2740a.b(view, i10, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f2741b) {
                    androidx.recyclerview.widget.b bVar = this.f2740a;
                    b.a aVar = bVar.f2513b;
                    int iIndexOfChild = bVar.f2512a.f2818a.indexOfChild(view);
                    int iB = (iIndexOfChild == -1 || aVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - aVar.b(iIndexOfChild);
                    if (i10 == -1) {
                        i10 = this.f2740a.e();
                    }
                    if (iB == -1) {
                        StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.f2741b.indexOfChild(view));
                        throw new IllegalStateException(v5.a.a(this.f2741b, sb));
                    }
                    if (iB != i10) {
                        l lVar = this.f2741b.f2682n;
                        View viewU = lVar.u(iB);
                        if (viewU == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + lVar.f2741b.toString());
                        }
                        lVar.u(iB);
                        lVar.f2740a.c(iB);
                        m mVar2 = (m) viewU.getLayoutParams();
                        a0 a0VarJ2 = v.J(viewU);
                        if (a0VarJ2.g()) {
                            b1<a0, d0.a> b1Var2 = lVar.f2741b.f2669g.f2534a;
                            d0.a aVarA2 = b1Var2.get(a0VarJ2);
                            if (aVarA2 == null) {
                                aVarA2 = d0.a.a();
                                b1Var2.put(a0VarJ2, aVarA2);
                            }
                            aVarA2.f2537a = 1 | aVarA2.f2537a;
                        } else {
                            lVar.f2741b.f2669g.c(a0VarJ2);
                        }
                        lVar.f2740a.b(viewU, i10, mVar2, a0VarJ2.g());
                    }
                } else {
                    this.f2740a.a(view, i10, false);
                    mVar.f2763c = true;
                    androidx.recyclerview.widget.o oVar = this.f2744e;
                    if (oVar != null && oVar.f2786e) {
                        oVar.f2783b.getClass();
                        a0 a0VarJ3 = v.J(view);
                        if ((a0VarJ3 != null ? a0VarJ3.b() : -1) == oVar.f2782a) {
                            oVar.f2787f = view;
                            if (v.D0) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (mVar.f2764d) {
                if (v.D0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + mVar.f2761a);
                }
                a0VarJ.f2708a.invalidate();
                mVar.f2764d = false;
            }
        }

        public void b0(int i10, int i11) {
        }

        public void c(String str) {
            v vVar = this.f2741b;
            if (vVar != null) {
                vVar.i(str);
            }
        }

        public void c0(int i10, int i11) {
        }

        public boolean d() {
            return false;
        }

        public void d0(r rVar, w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean e() {
            return false;
        }

        public void e0(w wVar) {
        }

        public boolean f(m mVar) {
            return mVar != null;
        }

        public void f0(Parcelable parcelable) {
        }

        public Parcelable g0() {
            return null;
        }

        public void h(int i10, int i11, w wVar, m.b bVar) {
        }

        public void h0(int i10) {
        }

        public void i(int i10, m.b bVar) {
        }

        public final void i0(r rVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                if (!v.J(u(iV)).n()) {
                    View viewU = u(iV);
                    l0(iV);
                    rVar.i(viewU);
                }
            }
        }

        public int j(w wVar) {
            return 0;
        }

        public final void j0(r rVar) {
            ArrayList<a0> arrayList = rVar.f2772a;
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = arrayList.get(i10).f2708a;
                a0 a0VarJ = v.J(view);
                if (!a0VarJ.n()) {
                    a0VarJ.m(false);
                    if (a0VarJ.i()) {
                        this.f2741b.removeDetachedView(view, false);
                    }
                    i iVar = this.f2741b.O;
                    if (iVar != null) {
                        iVar.d(a0VarJ);
                    }
                    a0VarJ.m(true);
                    a0 a0VarJ2 = v.J(view);
                    a0VarJ2.f2720m = null;
                    a0VarJ2.f2721n = false;
                    a0VarJ2.f2716i &= -33;
                    rVar.j(a0VarJ2);
                }
            }
            arrayList.clear();
            ArrayList<a0> arrayList2 = rVar.f2773b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f2741b.invalidate();
            }
        }

        public int k(w wVar) {
            return 0;
        }

        public final void k0(View view, r rVar) {
            androidx.recyclerview.widget.b bVar = this.f2740a;
            androidx.recyclerview.widget.w wVar = bVar.f2512a;
            int i10 = bVar.f2515d;
            if (i10 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                bVar.f2515d = 1;
                bVar.f2516e = view;
                int iIndexOfChild = wVar.f2818a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (bVar.f2513b.f(iIndexOfChild)) {
                        bVar.j(view);
                    }
                    wVar.a(iIndexOfChild);
                }
                bVar.f2515d = 0;
                bVar.f2516e = null;
                rVar.i(view);
            } catch (Throwable th2) {
                bVar.f2515d = 0;
                bVar.f2516e = null;
                throw th2;
            }
        }

        public int l(w wVar) {
            return 0;
        }

        public final void l0(int i10) {
            if (u(i10) != null) {
                androidx.recyclerview.widget.b bVar = this.f2740a;
                androidx.recyclerview.widget.w wVar = bVar.f2512a;
                int i11 = bVar.f2515d;
                if (i11 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i11 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iF = bVar.f(i10);
                    View childAt = wVar.f2818a.getChildAt(iF);
                    if (childAt != null) {
                        bVar.f2515d = 1;
                        bVar.f2516e = childAt;
                        if (bVar.f2513b.f(iF)) {
                            bVar.j(childAt);
                        }
                        wVar.a(iF);
                    }
                    bVar.f2515d = 0;
                    bVar.f2516e = null;
                } catch (Throwable th2) {
                    bVar.f2515d = 0;
                    bVar.f2516e = null;
                    throw th2;
                }
            }
        }

        public int m(w wVar) {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m0(v vVar, View view, Rect rect, boolean z10, boolean z11) {
            int iE = E();
            int iG = G();
            int iF = this.f2753n - F();
            int iD = this.f2754o - D();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iE;
            int iMin = Math.min(0, i10);
            int i11 = top - iG;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iF;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iD);
            if (C() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i13 = iArr[0];
            int i14 = iArr[1];
            if (z11) {
                View focusedChild = vVar.getFocusedChild();
                if (focusedChild != null) {
                    int iE2 = E();
                    int iG2 = G();
                    int iF2 = this.f2753n - F();
                    int iD2 = this.f2754o - D();
                    Rect rect2 = this.f2741b.f2674j;
                    y(focusedChild, rect2);
                    if (rect2.left - i13 < iF2 && rect2.right - i13 > iE2 && rect2.top - i14 < iD2 && rect2.bottom - i14 > iG2) {
                    }
                }
            } else if (i13 != 0 || i14 != 0) {
                if (z10) {
                    vVar.scrollBy(i13, i14);
                    return true;
                }
                vVar.e0(i13, i14, false);
                return true;
            }
            return false;
        }

        public int n(w wVar) {
            return 0;
        }

        public final void n0() {
            v vVar = this.f2741b;
            if (vVar != null) {
                vVar.requestLayout();
            }
        }

        public int o(w wVar) {
            return 0;
        }

        public int o0(int i10, r rVar, w wVar) {
            return 0;
        }

        public final void p(r rVar) {
            for (int iV = v() - 1; iV >= 0; iV--) {
                View viewU = u(iV);
                a0 a0VarJ = v.J(viewU);
                if (a0VarJ.n()) {
                    if (v.D0) {
                        Log.d("RecyclerView", "ignoring view " + a0VarJ);
                    }
                } else if (!a0VarJ.e() || a0VarJ.g()) {
                    u(iV);
                    this.f2740a.c(iV);
                    rVar.k(viewU);
                    this.f2741b.f2669g.c(a0VarJ);
                } else {
                    this.f2741b.f2680m.getClass();
                    l0(iV);
                    rVar.j(a0VarJ);
                }
            }
        }

        public void p0(int i10) {
            if (v.D0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public View q(int i10) {
            int iV = v();
            for (int i11 = 0; i11 < iV; i11++) {
                View viewU = u(i11);
                a0 a0VarJ = v.J(viewU);
                if (a0VarJ != null && a0VarJ.b() == i10 && !a0VarJ.n() && (this.f2741b.f2675j0.f2803g || !a0VarJ.g())) {
                    return viewU;
                }
            }
            return null;
        }

        public int q0(int i10, r rVar, w wVar) {
            return 0;
        }

        public abstract m r();

        public final void r0(v vVar) {
            s0(View.MeasureSpec.makeMeasureSpec(vVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vVar.getHeight(), 1073741824));
        }

        public m s(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public final void s0(int i10, int i11) {
            this.f2753n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2751l = mode;
            if (mode == 0 && !v.G0) {
                this.f2753n = 0;
            }
            this.f2754o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2752m = mode2;
            if (mode2 != 0 || v.G0) {
                return;
            }
            this.f2754o = 0;
        }

        public m t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public void t0(Rect rect, int i10, int i11) {
            int iF = F() + E() + rect.width();
            int iD = D() + G() + rect.height();
            v vVar = this.f2741b;
            Field field = q0.f33885a;
            this.f2741b.setMeasuredDimension(g(i10, iF, vVar.getMinimumWidth()), g(i11, iD, this.f2741b.getMinimumHeight()));
        }

        public final View u(int i10) {
            androidx.recyclerview.widget.b bVar = this.f2740a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public final void u0(int i10, int i11) {
            int iV = v();
            if (iV == 0) {
                this.f2741b.o(i10, i11);
                return;
            }
            int i12 = PKIFailureInfo.systemUnavail;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iV; i16++) {
                View viewU = u(i16);
                Rect rect = this.f2741b.f2674j;
                y(viewU, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f2741b.f2674j.set(i15, i13, i12, i14);
            t0(this.f2741b.f2674j, i10, i11);
        }

        public final int v() {
            androidx.recyclerview.widget.b bVar = this.f2740a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void v0(v vVar) {
            if (vVar == null) {
                this.f2741b = null;
                this.f2740a = null;
                this.f2753n = 0;
                this.f2754o = 0;
            } else {
                this.f2741b = vVar;
                this.f2740a = vVar.f2667f;
                this.f2753n = vVar.getWidth();
                this.f2754o = vVar.getHeight();
            }
            this.f2751l = 1073741824;
            this.f2752m = 1073741824;
        }

        public final boolean w0(View view, int i10, int i11, m mVar) {
            return (!view.isLayoutRequested() && this.f2747h && M(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && M(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public int x(r rVar, w wVar) {
            return -1;
        }

        public boolean x0() {
            return false;
        }

        public void y(View view, Rect rect) {
            boolean z10 = v.C0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f2762b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public final boolean y0(View view, int i10, int i11, m mVar) {
            return (this.f2747h && M(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && M(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public final void z0(androidx.recyclerview.widget.o oVar) {
            androidx.recyclerview.widget.o oVar2 = this.f2744e;
            if (oVar2 != null && oVar != oVar2 && oVar2.f2786e) {
                oVar2.f();
            }
            this.f2744e = oVar;
            v vVar = this.f2741b;
            z zVar = vVar.f2670g0;
            v.this.removeCallbacks(zVar);
            zVar.f2813c.abortAnimation();
            if (oVar.f2789h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f2783b = vVar;
            oVar.f2784c = this;
            int i10 = oVar.f2782a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            vVar.f2675j0.f2797a = i10;
            oVar.f2786e = true;
            oVar.f2785d = true;
            oVar.f2787f = vVar.f2682n.q(i10);
            oVar.f2783b.f2670g0.b();
            oVar.f2789h = true;
        }
    }

    public static abstract class n {
    }

    public interface o {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);
    }

    public static abstract class p {
        public void a(v vVar, int i10) {
        }

        public void b(v vVar, int i10, int i11) {
        }
    }

    public static class q {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray<a> f2765a;

        /* renamed from: b, reason: collision with root package name */
        public int f2766b;

        /* renamed from: c, reason: collision with root package name */
        public Set<d<?>> f2767c;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<a0> f2768a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public int f2769b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f2770c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f2771d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f2765a;
            a aVar = sparseArray.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i10, aVar2);
            return aVar2;
        }
    }

    public final class r {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<a0> f2772a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a0> f2773b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<a0> f2774c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a0> f2775d;

        /* renamed from: e, reason: collision with root package name */
        public int f2776e;

        /* renamed from: f, reason: collision with root package name */
        public int f2777f;

        /* renamed from: g, reason: collision with root package name */
        public q f2778g;

        public r() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f2772a = arrayList;
            this.f2773b = null;
            this.f2774c = new ArrayList<>();
            this.f2775d = Collections.unmodifiableList(arrayList);
            this.f2776e = 2;
            this.f2777f = 2;
        }

        public final void a(a0 a0Var, boolean z10) {
            v.j(a0Var);
            View view = a0Var.f2708a;
            v vVar = v.this;
            androidx.recyclerview.widget.y yVar = vVar.f2688q0;
            if (yVar != null) {
                y.a aVar = yVar.f2821e;
                q0.h(view, aVar != null ? (y3.a) aVar.f2823e.remove(view) : null);
            }
            if (z10) {
                s sVar = vVar.f2685p;
                ArrayList arrayList = vVar.f2687q;
                if (sVar != null) {
                    sVar.a();
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s) arrayList.get(i10)).a();
                }
                d dVar = vVar.f2680m;
                if (dVar != null) {
                    dVar.f(a0Var);
                }
                if (vVar.f2675j0 != null) {
                    vVar.f2669g.d(a0Var);
                }
                if (v.D0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + a0Var);
                }
            }
            a0Var.f2725r = null;
            a0Var.f2724q = null;
            q qVarC = c();
            qVarC.getClass();
            int i11 = a0Var.f2712e;
            ArrayList<a0> arrayList2 = qVarC.a(i11).f2768a;
            if (qVarC.f2765a.get(i11).f2769b <= arrayList2.size()) {
                p4.a.a(view);
            } else {
                if (v.C0 && arrayList2.contains(a0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                a0Var.l();
                arrayList2.add(a0Var);
            }
        }

        public final int b(int i10) {
            v vVar = v.this;
            if (i10 >= 0 && i10 < vVar.f2675j0.b()) {
                return !vVar.f2675j0.f2803g ? i10 : vVar.f2665e.e(i10, 0);
            }
            StringBuilder sbB = i0.b(i10, "invalid position ", ". State item count is ");
            sbB.append(vVar.f2675j0.b());
            sbB.append(vVar.z());
            throw new IndexOutOfBoundsException(sbB.toString());
        }

        public final q c() {
            if (this.f2778g == null) {
                q qVar = new q();
                qVar.f2765a = new SparseArray<>();
                qVar.f2766b = 0;
                qVar.f2767c = Collections.newSetFromMap(new IdentityHashMap());
                this.f2778g = qVar;
                e();
            }
            return this.f2778g;
        }

        public final View d(int i10) {
            return l(i10, Long.MAX_VALUE).f2708a;
        }

        public final void e() {
            v vVar;
            d<?> dVar;
            q qVar = this.f2778g;
            if (qVar == null || (dVar = (vVar = v.this).f2680m) == null || !vVar.f2696v) {
                return;
            }
            qVar.f2767c.add(dVar);
        }

        public final void f(d<?> dVar, boolean z10) {
            q qVar = this.f2778g;
            if (qVar != null) {
                SparseArray<q.a> sparseArray = qVar.f2765a;
                Set<d<?>> set = qVar.f2767c;
                set.remove(dVar);
                if (set.size() != 0 || z10) {
                    return;
                }
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList<a0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f2768a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        p4.a.a(arrayList.get(i11).f2708a);
                    }
                }
            }
        }

        public final void g() {
            ArrayList<a0> arrayList = this.f2774c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (v.H0) {
                m.b bVar = v.this.f2673i0;
                int[] iArr = bVar.f2626c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2627d = 0;
            }
        }

        public final void h(int i10) {
            if (v.D0) {
                a5.a.a(i10, "Recycling cached view at index ", "RecyclerView");
            }
            ArrayList<a0> arrayList = this.f2774c;
            a0 a0Var = arrayList.get(i10);
            if (v.D0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + a0Var);
            }
            a(a0Var, true);
            arrayList.remove(i10);
        }

        public final void i(View view) {
            a0 a0VarJ = v.J(view);
            boolean zI = a0VarJ.i();
            v vVar = v.this;
            if (zI) {
                vVar.removeDetachedView(view, false);
            }
            if (a0VarJ.h()) {
                a0VarJ.f2720m.m(a0VarJ);
            } else if (a0VarJ.o()) {
                a0VarJ.f2716i &= -33;
            }
            j(a0VarJ);
            if (vVar.O == null || a0VarJ.f()) {
                return;
            }
            vVar.O.d(a0VarJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
        
            r6 = r6 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(a0 a0Var) {
            boolean z10;
            boolean z11;
            int i10;
            v vVar = v.this;
            m.b bVar = vVar.f2673i0;
            boolean zH = a0Var.h();
            View view = a0Var.f2708a;
            boolean z12 = true;
            if (zH || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(a0Var.h());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(vVar.z());
                throw new IllegalArgumentException(sb.toString());
            }
            if (a0Var.i()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(a0Var);
                throw new IllegalArgumentException(v5.a.a(vVar, sb2));
            }
            if (a0Var.n()) {
                throw new IllegalArgumentException(v5.a.a(vVar, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((a0Var.f2716i & 16) == 0) {
                Field field = q0.f33885a;
                z10 = view.hasTransientState();
            }
            boolean z13 = v.C0;
            ArrayList<a0> arrayList = this.f2774c;
            if (z13 && arrayList.contains(a0Var)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(a0Var);
                throw new IllegalArgumentException(v5.a.a(vVar, sb3));
            }
            if (a0Var.f()) {
                if (this.f2777f <= 0 || (a0Var.f2716i & 526) != 0) {
                    z11 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f2777f && size > 0) {
                        h(0);
                        size--;
                    }
                    if (v.H0 && size > 0) {
                        int i11 = a0Var.f2710c;
                        if (bVar.f2626c != null) {
                            int i12 = bVar.f2627d * 2;
                            for (int i13 = 0; i13 < i12; i13 += 2) {
                                if (bVar.f2626c[i13] == i11) {
                                    break;
                                }
                            }
                            i10 = size - 1;
                            loop1: while (i10 >= 0) {
                                int i14 = arrayList.get(i10).f2710c;
                                if (bVar.f2626c == null) {
                                    break;
                                }
                                int i15 = bVar.f2627d * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (bVar.f2626c[i16] == i14) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i10 + 1;
                        } else {
                            i10 = size - 1;
                            loop1: while (i10 >= 0) {
                            }
                            size = i10 + 1;
                        }
                    }
                    arrayList.add(size, a0Var);
                    z11 = true;
                }
                if (z11) {
                    z12 = false;
                } else {
                    a(a0Var, true);
                }
                z = z11;
            } else {
                if (v.D0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + vVar.z());
                }
                z12 = false;
            }
            vVar.f2669g.d(a0Var);
            if (z || z12 || !z10) {
                return;
            }
            p4.a.a(view);
            a0Var.f2725r = null;
            a0Var.f2724q = null;
        }

        public final void k(View view) {
            i iVar;
            a0 a0VarJ = v.J(view);
            int i10 = a0VarJ.f2716i & 12;
            v vVar = v.this;
            if (i10 == 0 && a0VarJ.j() && (iVar = vVar.O) != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) iVar;
                if (a0VarJ.c().isEmpty() && kVar.f2511g && !a0VarJ.e()) {
                    if (this.f2773b == null) {
                        this.f2773b = new ArrayList<>();
                    }
                    a0VarJ.f2720m = this;
                    a0VarJ.f2721n = true;
                    this.f2773b.add(a0VarJ);
                    return;
                }
            }
            if (a0VarJ.e() && !a0VarJ.g()) {
                vVar.f2680m.getClass();
                throw new IllegalArgumentException(v5.a.a(vVar, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            a0VarJ.f2720m = this;
            a0VarJ.f2721n = false;
            this.f2772a.add(a0VarJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0369  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x038b  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0394  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x039a  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x03e4  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x03fa  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x0536  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x0540  */
        /* JADX WARN: Removed duplicated region for block: B:317:0x0556 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:319:0x055a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a0 l(int i10, long j10) {
            a0 a0VarRemove;
            boolean z10;
            int i11;
            long j11;
            long j12;
            int i12;
            int i13;
            ViewGroup.LayoutParams layoutParams;
            m mVar;
            int i14;
            v vVarE;
            View view;
            boolean z11;
            int size;
            v vVar = v.this;
            w wVar = vVar.f2675j0;
            if (i10 < 0 || i10 >= wVar.b()) {
                StringBuilder sbA = g0.a(i10, i10, "Invalid item position ", "(", "). Item count:");
                sbA.append(wVar.b());
                sbA.append(vVar.z());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (wVar.f2803g) {
                ArrayList<a0> arrayList = this.f2773b;
                if (arrayList == null || (size = arrayList.size()) == 0) {
                    a0VarRemove = null;
                    z10 = a0VarRemove == null;
                } else {
                    for (int i15 = 0; i15 < size; i15++) {
                        a0VarRemove = this.f2773b.get(i15);
                        if (!a0VarRemove.o() && a0VarRemove.b() == i10) {
                            a0VarRemove.a(32);
                            break;
                        }
                    }
                    vVar.f2680m.getClass();
                    a0VarRemove = null;
                    if (a0VarRemove == null) {
                    }
                }
                if (a0VarRemove == null) {
                    ArrayList<a0> arrayList2 = this.f2772a;
                    int size2 = arrayList2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        a0 a0Var = arrayList2.get(i16);
                        if (!a0Var.o() && a0Var.b() == i10 && !a0Var.e() && (wVar.f2803g || !a0Var.g())) {
                            a0Var.a(32);
                            a0VarRemove = a0Var;
                            break;
                        }
                    }
                    ArrayList arrayList3 = vVar.f2667f.f2514c;
                    int size3 = arrayList3.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) arrayList3.get(i17);
                        a0 a0VarJ = v.J(view);
                        if (a0VarJ.b() == i10 && !a0VarJ.e() && !a0VarJ.g()) {
                            break;
                        }
                        i17++;
                    }
                    if (view != null) {
                        a0 a0VarJ2 = v.J(view);
                        androidx.recyclerview.widget.b bVar = vVar.f2667f;
                        b.a aVar = bVar.f2513b;
                        int iIndexOfChild = bVar.f2512a.f2818a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!aVar.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        aVar.a(iIndexOfChild);
                        bVar.j(view);
                        androidx.recyclerview.widget.b bVar2 = vVar.f2667f;
                        b.a aVar2 = bVar2.f2513b;
                        int iIndexOfChild2 = bVar2.f2512a.f2818a.indexOfChild(view);
                        int iB = (iIndexOfChild2 == -1 || aVar2.d(iIndexOfChild2)) ? -1 : iIndexOfChild2 - aVar2.b(iIndexOfChild2);
                        if (iB == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(a0VarJ2);
                            throw new IllegalStateException(v5.a.a(vVar, sb));
                        }
                        vVar.f2667f.c(iB);
                        k(view);
                        a0VarJ2.a(8224);
                        a0VarRemove = a0VarJ2;
                    } else {
                        ArrayList<a0> arrayList4 = this.f2774c;
                        int size4 = arrayList4.size();
                        for (int i18 = 0; i18 < size4; i18++) {
                            a0 a0Var2 = arrayList4.get(i18);
                            if (!a0Var2.e() && a0Var2.b() == i10) {
                                View view2 = a0Var2.f2708a;
                                if (view2.getParent() == null || view2.getParent() == a0Var2.f2724q) {
                                    arrayList4.remove(i18);
                                    if (v.D0) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + a0Var2);
                                    }
                                    a0VarRemove = a0Var2;
                                }
                            }
                        }
                        a0VarRemove = null;
                    }
                    if (a0VarRemove != null) {
                        if (!a0VarRemove.g()) {
                            int i19 = a0VarRemove.f2710c;
                            if (i19 < 0 || i19 >= vVar.f2680m.a()) {
                                StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb2.append(a0VarRemove);
                                throw new IndexOutOfBoundsException(v5.a.a(vVar, sb2));
                            }
                            if (!wVar.f2803g) {
                                vVar.f2680m.getClass();
                                if (a0VarRemove.f2712e != 0) {
                                    z11 = false;
                                } else {
                                    vVar.f2680m.getClass();
                                    z11 = true;
                                }
                            }
                        } else {
                            if (v.C0 && !wVar.f2803g) {
                                throw new IllegalStateException(v5.a.a(vVar, new StringBuilder("should not receive a removed view unless it is pre layout")));
                            }
                            z11 = wVar.f2803g;
                        }
                        if (z11) {
                            z10 = true;
                        } else {
                            a0VarRemove.a(4);
                            if (a0VarRemove.h()) {
                                vVar.removeDetachedView(a0VarRemove.f2708a, false);
                                a0VarRemove.f2720m.m(a0VarRemove);
                            } else if (a0VarRemove.o()) {
                                a0VarRemove.f2716i &= -33;
                            }
                            j(a0VarRemove);
                            a0VarRemove = null;
                        }
                    }
                }
                if (a0VarRemove != null) {
                    int iE = vVar.f2665e.e(i10, 0);
                    if (iE >= 0) {
                        j11 = 3;
                        if (iE < vVar.f2680m.a()) {
                            vVar.f2680m.getClass();
                            vVar.f2680m.getClass();
                            if (a0VarRemove == null) {
                                if (v.D0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                                }
                                q.a aVar3 = c().f2765a.get(0);
                                if (aVar3 != null) {
                                    ArrayList<a0> arrayList5 = aVar3.f2768a;
                                    if (arrayList5.isEmpty()) {
                                        a0VarRemove = null;
                                        if (a0VarRemove != null) {
                                        }
                                    } else {
                                        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                                            a0 a0Var3 = arrayList5.get(size5);
                                            View view3 = a0Var3.f2708a;
                                            if (!((view3.getParent() == null || view3.getParent() == a0Var3.f2724q) ? false : true)) {
                                                a0VarRemove = arrayList5.remove(size5);
                                                break;
                                            }
                                        }
                                        a0VarRemove = null;
                                        if (a0VarRemove != null) {
                                            a0VarRemove.l();
                                            boolean z12 = v.C0;
                                        }
                                    }
                                }
                                View view4 = a0VarRemove.f2708a;
                                if (z10 && !wVar.f2803g) {
                                    i14 = a0VarRemove.f2716i;
                                    if (((i14 & 8192) == 0 ? i11 : 0) != 0) {
                                        a0VarRemove.f2716i = i14 & (-8193);
                                        if (wVar.f2806j) {
                                            i.b(a0VarRemove);
                                            i iVar = vVar.O;
                                            a0VarRemove.c();
                                            iVar.getClass();
                                            i.b bVar3 = new i.b();
                                            bVar3.a(a0VarRemove);
                                            vVar.V(a0VarRemove, bVar3);
                                        }
                                    }
                                }
                                if (wVar.f2803g || !a0VarRemove.d()) {
                                    if (a0VarRemove.d()) {
                                        if (((a0VarRemove.f2716i & 2) != 0 ? i11 : 0) != 0 || a0VarRemove.e()) {
                                        }
                                        layoutParams = view4.getLayoutParams();
                                        if (layoutParams != null) {
                                            mVar = (m) vVar.generateDefaultLayoutParams();
                                            view4.setLayoutParams(mVar);
                                        } else if (vVar.checkLayoutParams(layoutParams)) {
                                            mVar = (m) layoutParams;
                                        } else {
                                            mVar = (m) vVar.generateLayoutParams(layoutParams);
                                            view4.setLayoutParams(mVar);
                                        }
                                        mVar.f2761a = a0VarRemove;
                                        mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
                                        return a0VarRemove;
                                    }
                                    if (!v.C0 && a0VarRemove.g()) {
                                        StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                        sb3.append(a0VarRemove);
                                        throw new IllegalStateException(v5.a.a(vVar, sb3));
                                    }
                                    int iE2 = vVar.f2665e.e(i10, 0);
                                    a0VarRemove.f2725r = null;
                                    a0VarRemove.f2724q = vVar;
                                    int i20 = a0VarRemove.f2712e;
                                    long nanoTime = vVar.getNanoTime();
                                    if (j10 == Long.MAX_VALUE) {
                                        long j13 = this.f2778g.a(i20).f2771d;
                                        if (j13 == 0 || j13 + nanoTime < j10) {
                                            if (a0VarRemove.i()) {
                                                vVar.attachViewToParent(view4, vVar.getChildCount(), view4.getLayoutParams());
                                                i12 = i11;
                                            } else {
                                                i12 = 0;
                                            }
                                            d<? extends a0> dVar = vVar.f2680m;
                                            dVar.getClass();
                                            int i21 = a0VarRemove.f2725r == null ? i11 : 0;
                                            if (i21 != 0) {
                                                a0VarRemove.f2710c = iE2;
                                                a0VarRemove.f2716i = (a0VarRemove.f2716i & (-520)) | i11;
                                                int i22 = u3.i.f29248a;
                                                Trace.beginSection("RV OnBindView");
                                            }
                                            a0VarRemove.f2725r = dVar;
                                            if (v.C0) {
                                                if (view4.getParent() == null) {
                                                    Field field = q0.f33885a;
                                                    if (view4.isAttachedToWindow() != a0VarRemove.i()) {
                                                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + a0VarRemove.i() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + a0VarRemove);
                                                    }
                                                }
                                                if (view4.getParent() == null) {
                                                    Field field2 = q0.f33885a;
                                                    if (view4.isAttachedToWindow()) {
                                                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + a0VarRemove);
                                                    }
                                                }
                                            }
                                            a0VarRemove.c();
                                            dVar.b(a0VarRemove, iE2);
                                            if (i21 != 0) {
                                                ArrayList arrayList6 = a0VarRemove.f2717j;
                                                if (arrayList6 != null) {
                                                    arrayList6.clear();
                                                }
                                                a0VarRemove.f2716i &= -1025;
                                                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                                                if (layoutParams2 instanceof m) {
                                                    ((m) layoutParams2).f2763c = true;
                                                }
                                            }
                                            if (i12 != 0) {
                                                vVar.detachViewFromParent(view4);
                                            }
                                            long nanoTime2 = vVar.getNanoTime() - nanoTime;
                                            q.a aVarA = this.f2778g.a(a0VarRemove.f2712e);
                                            long j14 = aVarA.f2771d;
                                            if (j14 != 0) {
                                                nanoTime2 = (nanoTime2 / j12) + ((j14 / j12) * j11);
                                            }
                                            aVarA.f2771d = nanoTime2;
                                            AccessibilityManager accessibilityManager = vVar.D;
                                            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                                                Field field3 = q0.f33885a;
                                                i11 = 1;
                                                if (view4.getImportantForAccessibility() == 0) {
                                                    view4.setImportantForAccessibility(1);
                                                }
                                                androidx.recyclerview.widget.y yVar = vVar.f2688q0;
                                                if (yVar != null) {
                                                    y.a aVar4 = yVar.f2821e;
                                                    if (aVar4 != null) {
                                                        View.AccessibilityDelegate accessibilityDelegateA = q0.a(view4);
                                                        y3.a aVar5 = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a.C0340a ? ((a.C0340a) accessibilityDelegateA).f33787a : new y3.a(accessibilityDelegateA);
                                                        if (aVar5 != null && aVar5 != aVar4) {
                                                            aVar4.f2823e.put(view4, aVar5);
                                                        }
                                                    }
                                                    q0.h(view4, aVar4);
                                                }
                                            } else {
                                                i11 = 1;
                                            }
                                            if (wVar.f2803g) {
                                                a0VarRemove.f2713f = i10;
                                            }
                                            i13 = i11;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                    layoutParams = view4.getLayoutParams();
                                    if (layoutParams != null) {
                                    }
                                    mVar.f2761a = a0VarRemove;
                                    mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
                                    return a0VarRemove;
                                }
                                a0VarRemove.f2713f = i10;
                                i13 = 0;
                                layoutParams = view4.getLayoutParams();
                                if (layoutParams != null) {
                                }
                                mVar.f2761a = a0VarRemove;
                                mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
                                return a0VarRemove;
                            }
                            if (a0VarRemove == null) {
                                long nanoTime3 = vVar.getNanoTime();
                                if (j10 != Long.MAX_VALUE) {
                                    j12 = 4;
                                    long j15 = this.f2778g.a(0).f2770c;
                                    if (!(j15 == 0 || j15 + nanoTime3 < j10)) {
                                        return null;
                                    }
                                } else {
                                    j12 = 4;
                                }
                                d dVar2 = vVar.f2680m;
                                dVar2.getClass();
                                try {
                                    int i23 = u3.i.f29248a;
                                    Trace.beginSection("RV CreateView");
                                    a0 a0VarC = dVar2.c(vVar);
                                    View view5 = a0VarC.f2708a;
                                    if (view5.getParent() != null) {
                                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                    }
                                    a0VarC.f2712e = 0;
                                    Trace.endSection();
                                    if (v.H0 && (vVarE = v.E(view5)) != null) {
                                        a0VarC.f2709b = new WeakReference<>(vVarE);
                                    }
                                    long nanoTime4 = vVar.getNanoTime() - nanoTime3;
                                    q.a aVarA2 = this.f2778g.a(0);
                                    i11 = 1;
                                    long j16 = aVarA2.f2770c;
                                    if (j16 != 0) {
                                        nanoTime4 = (nanoTime4 / j12) + ((j16 / j12) * 3);
                                    }
                                    aVarA2.f2770c = nanoTime4;
                                    if (v.D0) {
                                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                    }
                                    a0VarRemove = a0VarC;
                                    View view42 = a0VarRemove.f2708a;
                                    if (z10) {
                                        i14 = a0VarRemove.f2716i;
                                        if (((i14 & 8192) == 0 ? i11 : 0) != 0) {
                                        }
                                    }
                                    if (wVar.f2803g) {
                                        if (a0VarRemove.d()) {
                                        }
                                        if (!v.C0) {
                                        }
                                        int iE22 = vVar.f2665e.e(i10, 0);
                                        a0VarRemove.f2725r = null;
                                        a0VarRemove.f2724q = vVar;
                                        int i202 = a0VarRemove.f2712e;
                                        long nanoTime5 = vVar.getNanoTime();
                                        if (j10 == Long.MAX_VALUE) {
                                        }
                                    }
                                    layoutParams = view42.getLayoutParams();
                                    if (layoutParams != null) {
                                    }
                                    mVar.f2761a = a0VarRemove;
                                    mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
                                    return a0VarRemove;
                                } finally {
                                    int i24 = u3.i.f29248a;
                                    Trace.endSection();
                                }
                            }
                            i11 = 1;
                        }
                    }
                    StringBuilder sbA2 = g0.a(i10, iE, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    sbA2.append(wVar.b());
                    sbA2.append(vVar.z());
                    throw new IndexOutOfBoundsException(sbA2.toString());
                }
                i11 = 1;
                j11 = 3;
                j12 = 4;
                View view422 = a0VarRemove.f2708a;
                if (z10) {
                }
                if (wVar.f2803g) {
                }
                layoutParams = view422.getLayoutParams();
                if (layoutParams != null) {
                }
                mVar.f2761a = a0VarRemove;
                mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
                return a0VarRemove;
            }
            a0VarRemove = null;
            if (a0VarRemove == null) {
            }
            if (a0VarRemove != null) {
            }
            j12 = 4;
            View view4222 = a0VarRemove.f2708a;
            if (z10) {
            }
            if (wVar.f2803g) {
            }
            layoutParams = view4222.getLayoutParams();
            if (layoutParams != null) {
            }
            mVar.f2761a = a0VarRemove;
            mVar.f2764d = (z10 || i13 == 0) ? 0 : i11;
            return a0VarRemove;
        }

        public final void m(a0 a0Var) {
            if (a0Var.f2721n) {
                this.f2773b.remove(a0Var);
            } else {
                this.f2772a.remove(a0Var);
            }
            a0Var.f2720m = null;
            a0Var.f2721n = false;
            a0Var.f2716i &= -33;
        }

        public final void n() {
            l lVar = v.this.f2682n;
            this.f2777f = this.f2776e + (lVar != null ? lVar.f2749j : 0);
            ArrayList<a0> arrayList = this.f2774c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2777f; size--) {
                h(size);
            }
        }
    }

    public interface s {
        void a();
    }

    public class t extends f {
        public t() {
        }

        @Override // androidx.recyclerview.widget.v.f
        public final void a() {
            v vVar = v.this;
            vVar.i(null);
            vVar.f2675j0.f2802f = true;
            vVar.U(true);
            if (vVar.f2665e.f()) {
                return;
            }
            vVar.requestLayout();
        }
    }

    public static class u extends q4.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f2781c;

        public class a implements Parcelable.ClassLoaderCreator<u> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new u[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new u(parcel, null);
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2781c = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        @Override // q4.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f2781c, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$v, reason: collision with other inner class name */
    public static abstract class AbstractC0038v {

        /* renamed from: a, reason: collision with root package name */
        public int f2782a = -1;

        /* renamed from: b, reason: collision with root package name */
        public v f2783b;

        /* renamed from: c, reason: collision with root package name */
        public l f2784c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2785d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2786e;

        /* renamed from: f, reason: collision with root package name */
        public View f2787f;

        /* renamed from: g, reason: collision with root package name */
        public final a f2788g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2789h;

        /* renamed from: androidx.recyclerview.widget.v$v$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f2790a;

            /* renamed from: b, reason: collision with root package name */
            public int f2791b;

            /* renamed from: c, reason: collision with root package name */
            public int f2792c;

            /* renamed from: d, reason: collision with root package name */
            public int f2793d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f2794e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f2795f;

            /* renamed from: g, reason: collision with root package name */
            public int f2796g;

            public final void a(v vVar) {
                int i10 = this.f2793d;
                if (i10 >= 0) {
                    this.f2793d = -1;
                    vVar.N(i10);
                    this.f2795f = false;
                    return;
                }
                if (!this.f2795f) {
                    this.f2796g = 0;
                    return;
                }
                Interpolator interpolator = this.f2794e;
                if (interpolator != null && this.f2792c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i11 = this.f2792c;
                if (i11 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                vVar.f2670g0.c(this.f2790a, this.f2791b, i11, interpolator);
                int i12 = this.f2796g + 1;
                this.f2796g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f2795f = false;
            }
        }

        /* renamed from: androidx.recyclerview.widget.v$v$b */
        public interface b {
            PointF a(int i10);
        }

        public AbstractC0038v() {
            a aVar = new a();
            aVar.f2793d = -1;
            aVar.f2795f = false;
            aVar.f2796g = 0;
            aVar.f2790a = 0;
            aVar.f2791b = 0;
            aVar.f2792c = PKIFailureInfo.systemUnavail;
            aVar.f2794e = null;
            this.f2788g = aVar;
        }

        public final PointF a(int i10) {
            Object obj = this.f2784c;
            if (obj instanceof b) {
                return ((b) obj).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF pointFA;
            v vVar = this.f2783b;
            if (this.f2782a == -1 || vVar == null) {
                f();
            }
            if (this.f2785d && this.f2787f == null && this.f2784c != null && (pointFA = a(this.f2782a)) != null) {
                float f10 = pointFA.x;
                if (f10 != CropImageView.DEFAULT_ASPECT_RATIO || pointFA.y != CropImageView.DEFAULT_ASPECT_RATIO) {
                    vVar.b0((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f2785d = false;
            View view = this.f2787f;
            a aVar = this.f2788g;
            if (view != null) {
                this.f2783b.getClass();
                a0 a0VarJ = v.J(view);
                if ((a0VarJ != null ? a0VarJ.b() : -1) == this.f2782a) {
                    View view2 = this.f2787f;
                    w wVar = vVar.f2675j0;
                    e(view2, aVar);
                    aVar.a(vVar);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2787f = null;
                }
            }
            if (this.f2786e) {
                w wVar2 = vVar.f2675j0;
                c(i10, i11, aVar);
                boolean z10 = aVar.f2793d >= 0;
                aVar.a(vVar);
                if (z10 && this.f2786e) {
                    this.f2785d = true;
                    vVar.f2670g0.b();
                }
            }
        }

        public abstract void c(int i10, int i11, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (this.f2786e) {
                this.f2786e = false;
                d();
                this.f2783b.f2675j0.f2797a = -1;
                this.f2787f = null;
                this.f2782a = -1;
                this.f2785d = false;
                l lVar = this.f2784c;
                if (lVar.f2744e == this) {
                    lVar.f2744e = null;
                }
                this.f2784c = null;
                this.f2783b = null;
            }
        }
    }

    public static class w {

        /* renamed from: a, reason: collision with root package name */
        public int f2797a;

        /* renamed from: b, reason: collision with root package name */
        public int f2798b;

        /* renamed from: c, reason: collision with root package name */
        public int f2799c;

        /* renamed from: d, reason: collision with root package name */
        public int f2800d;

        /* renamed from: e, reason: collision with root package name */
        public int f2801e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2802f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2803g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2804h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2805i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2806j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2807k;

        /* renamed from: l, reason: collision with root package name */
        public int f2808l;

        /* renamed from: m, reason: collision with root package name */
        public long f2809m;

        /* renamed from: n, reason: collision with root package name */
        public int f2810n;

        public final void a(int i10) {
            if ((this.f2800d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2800d));
        }

        public final int b() {
            return this.f2803g ? this.f2798b - this.f2799c : this.f2801e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f2797a + ", mData=null, mItemCount=" + this.f2801e + ", mIsMeasuring=" + this.f2805i + ", mPreviousLayoutItemCount=" + this.f2798b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2799c + ", mStructureChanged=" + this.f2802f + ", mInPreLayout=" + this.f2803g + ", mRunSimpleAnimations=" + this.f2806j + ", mRunPredictiveAnimations=" + this.f2807k + '}';
        }
    }

    public static class x extends h {
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f2811a;

        /* renamed from: b, reason: collision with root package name */
        public int f2812b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f2813c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f2814d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2815e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2816f;

        public z() {
            b bVar = v.J0;
            this.f2814d = bVar;
            this.f2815e = false;
            this.f2816f = false;
            this.f2813c = new OverScroller(v.this.getContext(), bVar);
        }

        public final void a(int i10, int i11) {
            v vVar = v.this;
            vVar.setScrollState(2);
            this.f2812b = 0;
            this.f2811a = 0;
            Interpolator interpolator = this.f2814d;
            b bVar = v.J0;
            if (interpolator != bVar) {
                this.f2814d = bVar;
                this.f2813c = new OverScroller(vVar.getContext(), bVar);
            }
            this.f2813c.fling(0, 0, i10, i11, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f2815e) {
                this.f2816f = true;
                return;
            }
            v vVar = v.this;
            vVar.removeCallbacks(this);
            Field field = q0.f33885a;
            vVar.postOnAnimation(this);
        }

        public final void c(int i10, int i11, int i12, Interpolator interpolator) {
            v vVar = v.this;
            if (i12 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i10);
                int iAbs2 = Math.abs(i11);
                boolean z10 = iAbs > iAbs2;
                int width = z10 ? vVar.getWidth() : vVar.getHeight();
                if (!z10) {
                    iAbs = iAbs2;
                }
                i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = v.J0;
            }
            if (this.f2814d != interpolator) {
                this.f2814d = interpolator;
                this.f2813c = new OverScroller(vVar.getContext(), interpolator);
            }
            this.f2812b = 0;
            this.f2811a = 0;
            vVar.setScrollState(2);
            this.f2813c.startScroll(0, 0, i10, i11, i13);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            v vVar = v.this;
            int[] iArr = vVar.f2697v0;
            if (vVar.f2682n == null) {
                vVar.removeCallbacks(this);
                this.f2813c.abortAnimation();
                return;
            }
            this.f2816f = false;
            this.f2815e = true;
            vVar.n();
            OverScroller overScroller = this.f2813c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.f2811a;
                int i15 = currY - this.f2812b;
                this.f2811a = currX;
                this.f2812b = currY;
                int iM = v.m(i14, vVar.K, vVar.M, vVar.getWidth());
                int iM2 = v.m(i15, vVar.L, vVar.N, vVar.getHeight());
                int[] iArr2 = vVar.f2697v0;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (vVar.s(iM, iArr2, iM2, 1, null)) {
                    iM -= iArr[0];
                    iM2 -= iArr[1];
                }
                if (vVar.getOverScrollMode() != 2) {
                    vVar.l(iM, iM2);
                }
                if (vVar.f2680m != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    vVar.b0(iM, iM2, iArr);
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    int i18 = iM - i16;
                    int i19 = iM2 - i17;
                    androidx.recyclerview.widget.o oVar = vVar.f2682n.f2744e;
                    if (oVar != null && !oVar.f2785d && oVar.f2786e) {
                        int iB = vVar.f2675j0.b();
                        if (iB == 0) {
                            oVar.f();
                        } else if (oVar.f2782a >= iB) {
                            oVar.f2782a = iB - 1;
                            oVar.b(i16, i17);
                        } else {
                            oVar.b(i16, i17);
                        }
                    }
                    i11 = i19;
                    i13 = i17;
                    i10 = i18;
                    i12 = i16;
                } else {
                    i10 = iM;
                    i11 = iM2;
                    i12 = 0;
                    i13 = 0;
                }
                if (!vVar.f2689r.isEmpty()) {
                    vVar.invalidate();
                }
                int[] iArr3 = vVar.f2697v0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                vVar.t(i12, null, i13, i10, i11, iArr3, 1);
                int i20 = i10 - iArr[0];
                int i21 = i11 - iArr[1];
                if (i12 != 0 || i13 != 0) {
                    vVar.u(i12, i13);
                }
                if (!vVar.awakenScrollBars()) {
                    vVar.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
                androidx.recyclerview.widget.o oVar2 = vVar.f2682n.f2744e;
                if ((oVar2 == null || !oVar2.f2785d) && z10) {
                    if (vVar.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i22 = i20 < 0 ? -currVelocity : i20 > 0 ? currVelocity : 0;
                        if (i21 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i21 <= 0) {
                            currVelocity = 0;
                        }
                        if (i22 < 0) {
                            vVar.w();
                            if (vVar.K.isFinished()) {
                                vVar.K.onAbsorb(-i22);
                            }
                        } else if (i22 > 0) {
                            vVar.x();
                            if (vVar.M.isFinished()) {
                                vVar.M.onAbsorb(i22);
                            }
                        }
                        if (currVelocity < 0) {
                            vVar.y();
                            if (vVar.L.isFinished()) {
                                vVar.L.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            vVar.v();
                            if (vVar.N.isFinished()) {
                                vVar.N.onAbsorb(currVelocity);
                            }
                        }
                        if (i22 != 0 || currVelocity != 0) {
                            Field field = q0.f33885a;
                            vVar.postInvalidateOnAnimation();
                        }
                    }
                    if (v.H0) {
                        m.b bVar = vVar.f2673i0;
                        int[] iArr4 = bVar.f2626c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f2627d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.m mVar = vVar.f2672h0;
                    if (mVar != null) {
                        mVar.a(vVar, i12, i13);
                    }
                }
            }
            androidx.recyclerview.widget.o oVar3 = vVar.f2682n.f2744e;
            if (oVar3 != null && oVar3.f2785d) {
                oVar3.b(0, 0);
            }
            this.f2815e = false;
            if (!this.f2816f) {
                vVar.setScrollState(0);
                vVar.h0(1);
            } else {
                vVar.removeCallbacks(this);
                Field field2 = q0.f33885a;
                vVar.postOnAnimation(this);
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        I0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        J0 = new b();
        K0 = new x();
    }

    public v(Context context) throws Resources.NotFoundException, NoSuchMethodException, SecurityException {
        char c10;
        int i10;
        char c11;
        int i11;
        Constructor constructor;
        Object[] objArr;
        super(context, null, com.basitce.htmltoapk.R.attr.recyclerViewStyle);
        this.f2659b = new t();
        this.f2661c = new r();
        this.f2669g = new d0();
        this.f2674j = new Rect();
        this.f2676k = new Rect();
        this.f2678l = new RectF();
        this.f2687q = new ArrayList();
        this.f2689r = new ArrayList<>();
        this.f2691s = new ArrayList<>();
        this.f2702y = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = K0;
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k();
        kVar.f2731a = null;
        kVar.f2732b = new ArrayList<>();
        kVar.f2733c = 120L;
        kVar.f2734d = 120L;
        kVar.f2735e = 250L;
        kVar.f2736f = 250L;
        kVar.f2511g = true;
        kVar.f2565h = new ArrayList<>();
        kVar.f2566i = new ArrayList<>();
        kVar.f2567j = new ArrayList<>();
        kVar.f2568k = new ArrayList<>();
        kVar.f2569l = new ArrayList<>();
        kVar.f2570m = new ArrayList<>();
        kVar.f2571n = new ArrayList<>();
        kVar.f2572o = new ArrayList<>();
        kVar.f2573p = new ArrayList<>();
        kVar.f2574q = new ArrayList<>();
        kVar.f2575r = new ArrayList<>();
        this.O = kVar;
        this.P = 0;
        this.Q = -1;
        this.f2664d0 = Float.MIN_VALUE;
        this.f2666e0 = Float.MIN_VALUE;
        this.f2668f0 = true;
        this.f2670g0 = new z();
        this.f2673i0 = H0 ? new m.b() : null;
        w wVar = new w();
        wVar.f2797a = -1;
        wVar.f2798b = 0;
        wVar.f2799c = 0;
        wVar.f2800d = 1;
        wVar.f2801e = 0;
        wVar.f2802f = false;
        wVar.f2803g = false;
        wVar.f2804h = false;
        wVar.f2805i = false;
        wVar.f2806j = false;
        wVar.f2807k = false;
        this.f2675j0 = wVar;
        this.f2681m0 = false;
        this.f2683n0 = false;
        j jVar = new j();
        this.f2684o0 = jVar;
        this.f2686p0 = false;
        this.f2690r0 = new int[2];
        this.f2694t0 = new int[2];
        this.f2695u0 = new int[2];
        this.f2697v0 = new int[2];
        this.f2699w0 = new ArrayList();
        this.f2701x0 = new a();
        this.f2705z0 = 0;
        this.A0 = 0;
        this.B0 = new c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f2664d0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f2666e0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f2660b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2662c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2657a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.f2731a = jVar;
        this.f2665e = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.x(this));
        this.f2667f = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.w(this));
        Field field = q0.f33885a;
        if (q0.e.a(this) == 0) {
            q0.e.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.y(this));
        int[] iArr = u5.a.f29254a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, com.basitce.htmltoapk.R.attr.recyclerViewStyle, 0);
        q0.g(this, context, iArr, null, typedArrayObtainStyledAttributes, com.basitce.htmltoapk.R.attr.recyclerViewStyle);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        }
        this.f2671h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(v5.a.a(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c10 = 3;
            int dimensionPixelSize = resources.getDimensionPixelSize(com.basitce.htmltoapk.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.basitce.htmltoapk.R.dimen.fastscroll_minimum_range);
            c11 = 2;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.basitce.htmltoapk.R.dimen.fastscroll_margin);
            i11 = 4;
            i10 = com.basitce.htmltoapk.R.attr.recyclerViewStyle;
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            c10 = 3;
            i10 = com.basitce.htmltoapk.R.attr.recyclerViewStyle;
            c11 = 2;
            i11 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = v.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(I0);
                        objArr = new Object[i11];
                        objArr[0] = context;
                        objArr[1] = null;
                        objArr[c11] = Integer.valueOf(i10);
                        objArr[c10] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw null;
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (ClassCastException unused) {
                    throw null;
                } catch (ClassNotFoundException unused2) {
                    throw null;
                } catch (IllegalAccessException unused3) {
                    throw null;
                } catch (InstantiationException unused4) {
                    throw null;
                } catch (InvocationTargetException unused5) {
                    throw null;
                }
            }
        }
        int[] iArr2 = E0;
        int i12 = i10;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, iArr2, i12, 0);
        q0.g(this, context, iArr2, null, typedArrayObtainStyledAttributes2, i12);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.basitce.htmltoapk.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static v E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof v) {
            return (v) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            v vVarE = E(viewGroup.getChildAt(i10));
            if (vVarE != null) {
                return vVarE;
            }
        }
        return null;
    }

    public static a0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f2761a;
    }

    private y3.q getScrollingChildHelper() {
        if (this.f2692s0 == null) {
            this.f2692s0 = new y3.q(this);
        }
        return this.f2692s0;
    }

    public static void j(a0 a0Var) {
        WeakReference<v> weakReference = a0Var.f2709b;
        if (weakReference != null) {
            v vVar = weakReference.get();
            while (vVar != null) {
                if (vVar == a0Var.f2708a) {
                    return;
                }
                Object parent = vVar.getParent();
                vVar = parent instanceof View ? (View) parent : null;
            }
            a0Var.f2709b = null;
        }
    }

    public static int m(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && c4.b.a(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
            int iRound = Math.round(c4.b.b(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || c4.b.a(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(c4.b.b(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        C0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        D0 = z10;
    }

    public final void A(w wVar) {
        if (getScrollState() != 2) {
            wVar.getClass();
            return;
        }
        OverScroller overScroller = this.f2670g0.f2813c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        wVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View B(View view) {
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

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<o> arrayList = this.f2691s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = arrayList.get(i10);
            if (oVar.b(motionEvent) && action != 3) {
                this.f2693t = oVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int iE = this.f2667f.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = PKIFailureInfo.systemUnavail;
        for (int i12 = 0; i12 < iE; i12++) {
            a0 a0VarJ = J(this.f2667f.d(i12));
            if (!a0VarJ.n()) {
                int iB = a0VarJ.b();
                if (iB < i10) {
                    i10 = iB;
                }
                if (iB > i11) {
                    i11 = iB;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final a0 F(int i10) {
        a0 a0Var = null;
        if (this.E) {
            return null;
        }
        int iH = this.f2667f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            a0 a0VarJ = J(this.f2667f.g(i11));
            if (a0VarJ != null && !a0VarJ.g() && H(a0VarJ) == i10) {
                if (!this.f2667f.f2514c.contains(a0VarJ.f2708a)) {
                    return a0VarJ;
                }
                a0Var = a0VarJ;
            }
        }
        return a0Var;
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
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.recyclerview.widget.b0, androidx.recyclerview.widget.u] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.recyclerview.widget.v$l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(int i10, int i11) {
        int iMax;
        int i12;
        z zVar;
        int i13;
        float f10;
        float f11;
        int i14;
        boolean z10;
        boolean z11;
        int minFlingVelocity;
        boolean z12;
        androidx.recyclerview.widget.t tVar;
        int iH;
        PointF pointFA;
        int i15;
        l lVar = this.f2682n;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.A) {
            ?? D = lVar.d();
            boolean zE = this.f2682n.e();
            int i16 = this.f2660b0;
            int i17 = (!D == true || Math.abs(i10) < i16) ? 0 : i10;
            int iMax2 = (!zE || Math.abs(i11) < i16) ? 0 : i11;
            if (i17 != 0 || iMax2 != 0) {
                if (i17 == 0) {
                    iMax = 0;
                    if (iMax2 == 0) {
                        i12 = iMax2;
                        iMax2 = 0;
                        zVar = this.f2670g0;
                        i13 = this.f2662c0;
                        if (iMax == 0 || iMax2 != 0) {
                            int i18 = -i13;
                            iMax = Math.max(i18, Math.min(iMax, i13));
                            iMax2 = Math.max(i18, Math.min(iMax2, i13));
                            zVar.a(iMax, iMax2);
                        }
                        if (i17 == 0 || i12 != 0) {
                            f10 = i17;
                            f11 = i12;
                            if (!dispatchNestedPreFling(f10, f11)) {
                                boolean z13 = D == true || zE;
                                dispatchNestedFling(f10, f11, z13);
                                n nVar = this.f2658a0;
                                if (nVar != null) {
                                    b0 b0Var = (b0) nVar;
                                    ?? layoutManager = b0Var.f2519a.getLayoutManager();
                                    if (layoutManager == 0 || b0Var.f2519a.getAdapter() == null || ((Math.abs(i12) <= (minFlingVelocity = b0Var.f2519a.getMinFlingVelocity()) && Math.abs(i17) <= minFlingVelocity) || !((z12 = layoutManager instanceof AbstractC0038v.b)))) {
                                        i14 = D;
                                        z10 = false;
                                    } else {
                                        ?? r42 = (androidx.recyclerview.widget.u) b0Var;
                                        if (z12) {
                                            z10 = false;
                                            tVar = new androidx.recyclerview.widget.t(r42, r42.f2519a.getContext());
                                        } else {
                                            z10 = false;
                                            tVar = null;
                                        }
                                        if (tVar == null) {
                                            i14 = D;
                                        } else {
                                            int iB = layoutManager.B();
                                            if (iB != 0) {
                                                androidx.recyclerview.widget.s sVarF = layoutManager.e() ? r42.f(layoutManager) : layoutManager.d() ? r42.e(layoutManager) : null;
                                                if (sVarF == null) {
                                                    i14 = D;
                                                    z11 = true;
                                                } else {
                                                    int iV = layoutManager.v();
                                                    z11 = true;
                                                    ?? r02 = z10;
                                                    int i19 = Integer.MIN_VALUE;
                                                    int i20 = Integer.MAX_VALUE;
                                                    View view = null;
                                                    View view2 = null;
                                                    int i21 = D;
                                                    while (r02 < iV) {
                                                        int i22 = i21;
                                                        View viewU = layoutManager.u(r02);
                                                        if (viewU == null) {
                                                            i15 = r02;
                                                        } else {
                                                            i15 = r02;
                                                            int iC = androidx.recyclerview.widget.u.c(viewU, sVarF);
                                                            if (iC <= 0 && iC > i19) {
                                                                i19 = iC;
                                                                view2 = viewU;
                                                            }
                                                            if (iC >= 0 && iC < i20) {
                                                                i20 = iC;
                                                                view = viewU;
                                                            }
                                                        }
                                                        i21 = i22;
                                                        r02 = i15 + 1;
                                                    }
                                                    i14 = i21;
                                                    boolean z14 = (!layoutManager.d() ? i12 > 0 : i17 > 0) ? z10 : true;
                                                    if (z14 && view != null) {
                                                        iH = l.H(view);
                                                    } else if (z14 || view2 == null) {
                                                        if (z14) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            iH = (((!z12 || (pointFA = ((AbstractC0038v.b) layoutManager).a(layoutManager.B() + (-1))) == null || ((pointFA.x > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (pointFA.x == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) >= 0 && (pointFA.y > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (pointFA.y == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) >= 0)) ? z10 : true) == z14 ? -1 : 1) + l.H(view);
                                                            if (iH < 0 || iH >= iB) {
                                                            }
                                                        }
                                                    } else {
                                                        iH = l.H(view2);
                                                    }
                                                    if (iH != -1) {
                                                        tVar.f2782a = iH;
                                                        layoutManager.z0(tVar);
                                                        return z11;
                                                    }
                                                }
                                                iH = -1;
                                                if (iH != -1) {
                                                }
                                            }
                                        }
                                    }
                                    z11 = true;
                                }
                                if (!z13) {
                                    return z10;
                                }
                                boolean z15 = z11;
                                getScrollingChildHelper().g(zE ? i14 | 2 : i14, z15 ? 1 : 0);
                                int i23 = -i13;
                                zVar.a(Math.max(i23, Math.min(i17, i13)), Math.max(i23, Math.min(i12, i13)));
                                return z15;
                            }
                        } else if (iMax != 0 || iMax2 != 0) {
                            return true;
                        }
                    } else {
                        EdgeEffect edgeEffect = this.L;
                        if (edgeEffect == null || c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
                            EdgeEffect edgeEffect2 = this.N;
                            if (edgeEffect2 != null && c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                                if (d0(this.N, iMax2, getHeight())) {
                                    this.N.onAbsorb(iMax2);
                                    iMax2 = 0;
                                }
                                i12 = 0;
                                zVar = this.f2670g0;
                                i13 = this.f2662c0;
                                if (iMax == 0) {
                                    int i182 = -i13;
                                    iMax = Math.max(i182, Math.min(iMax, i13));
                                    iMax2 = Math.max(i182, Math.min(iMax2, i13));
                                    zVar.a(iMax, iMax2);
                                    if (i17 == 0) {
                                        f10 = i17;
                                        f11 = i12;
                                        if (!dispatchNestedPreFling(f10, f11)) {
                                        }
                                    }
                                }
                            }
                            i12 = iMax2;
                            iMax2 = 0;
                            zVar = this.f2670g0;
                            i13 = this.f2662c0;
                            if (iMax == 0) {
                            }
                        } else {
                            int i24 = -iMax2;
                            if (d0(this.L, i24, getHeight())) {
                                this.L.onAbsorb(i24);
                                iMax2 = 0;
                            }
                            i12 = 0;
                            zVar = this.f2670g0;
                            i13 = this.f2662c0;
                            if (iMax == 0) {
                            }
                        }
                    }
                } else {
                    EdgeEffect edgeEffect3 = this.K;
                    if (edgeEffect3 == null || c4.b.a(edgeEffect3) == CropImageView.DEFAULT_ASPECT_RATIO) {
                        EdgeEffect edgeEffect4 = this.M;
                        if (edgeEffect4 != null && c4.b.a(edgeEffect4) != CropImageView.DEFAULT_ASPECT_RATIO) {
                            if (d0(this.M, i17, getWidth())) {
                                this.M.onAbsorb(i17);
                                i17 = 0;
                            }
                            iMax = i17;
                            i17 = 0;
                            if (iMax2 == 0) {
                            }
                        }
                        iMax = 0;
                        if (iMax2 == 0) {
                        }
                    } else {
                        int i25 = -i17;
                        if (d0(this.K, i25, getWidth())) {
                            this.K.onAbsorb(i25);
                            i17 = 0;
                        }
                        iMax = i17;
                        i17 = 0;
                        if (iMax2 == 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int H(a0 a0Var) {
        if ((a0Var.f2716i & 524) == 0 && a0Var.d()) {
            int i10 = a0Var.f2710c;
            ArrayList<a.C0037a> arrayList = this.f2665e.f2504b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.C0037a c0037a = arrayList.get(i11);
                int i12 = c0037a.f2508a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = c0037a.f2509b;
                        if (i13 <= i10) {
                            int i14 = c0037a.f2510c;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = c0037a.f2509b;
                        if (i15 == i10) {
                            i10 = c0037a.f2510c;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (c0037a.f2510c <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (c0037a.f2509b <= i10) {
                    i10 += c0037a.f2510c;
                }
            }
            return i10;
        }
        return -1;
    }

    public final a0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        m mVar = (m) view.getLayoutParams();
        boolean z10 = mVar.f2763c;
        Rect rect = mVar.f2762b;
        if (!z10 || (this.f2675j0.f2803g && (mVar.f2761a.j() || mVar.f2761a.e()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<k> arrayList = this.f2689r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f2674j;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).getClass();
            ((m) view.getLayoutParams()).f2761a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f2763c = false;
        return rect;
    }

    public final boolean L() {
        return !this.f2700x || this.E || this.f2665e.f();
    }

    public final boolean M() {
        return this.G > 0;
    }

    public final void N(int i10) {
        if (this.f2682n == null) {
            return;
        }
        setScrollState(2);
        this.f2682n.p0(i10);
        awakenScrollBars();
    }

    public final void O() {
        int iH = this.f2667f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((m) this.f2667f.g(i10).getLayoutParams()).f2763c = true;
        }
        ArrayList<a0> arrayList = this.f2661c.f2774c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11).f2708a.getLayoutParams();
            if (mVar != null) {
                mVar.f2763c = true;
            }
        }
    }

    public final void P(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.f2667f.h();
        for (int i13 = 0; i13 < iH; i13++) {
            a0 a0VarJ = J(this.f2667f.g(i13));
            if (a0VarJ != null && !a0VarJ.n()) {
                int i14 = a0VarJ.f2710c;
                w wVar = this.f2675j0;
                if (i14 >= i12) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + a0VarJ + " now at position " + (a0VarJ.f2710c - i11));
                    }
                    a0VarJ.k(-i11, z10);
                    wVar.f2802f = true;
                } else if (i14 >= i10) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + a0VarJ + " now REMOVED");
                    }
                    a0VarJ.a(8);
                    a0VarJ.k(-i11, z10);
                    a0VarJ.f2710c = i10 - 1;
                    wVar.f2802f = true;
                }
            }
        }
        r rVar = this.f2661c;
        ArrayList<a0> arrayList = rVar.f2774c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = arrayList.get(size);
            if (a0Var != null) {
                int i15 = a0Var.f2710c;
                if (i15 >= i12) {
                    if (D0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + a0Var + " now at position " + (a0Var.f2710c - i11));
                    }
                    a0Var.k(-i11, z10);
                } else if (i15 >= i10) {
                    a0Var.a(8);
                    rVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void Q() {
        this.G++;
    }

    public final void R(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.G - 1;
        this.G = i11;
        if (i11 < 1) {
            if (C0 && i11 < 0) {
                throw new IllegalStateException(v5.a.a(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.G = 0;
            if (z10) {
                int i12 = this.C;
                this.C = 0;
                if (i12 != 0 && (accessibilityManager = this.D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f2699w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var.f2708a.getParent() == this && !a0Var.n() && (i10 = a0Var.f2723p) != -1) {
                        View view = a0Var.f2708a;
                        Field field = q0.f33885a;
                        view.setImportantForAccessibility(i10);
                        a0Var.f2723p = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.U = x10;
            this.S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.V = y10;
            this.T = y10;
        }
    }

    public final void T() {
        if (this.f2686p0 || !this.f2696v) {
            return;
        }
        Field field = q0.f33885a;
        postOnAnimation(this.f2701x0);
        this.f2686p0 = true;
    }

    public final void U(boolean z10) {
        this.F = z10 | this.F;
        this.E = true;
        int iH = this.f2667f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            a0 a0VarJ = J(this.f2667f.g(i10));
            if (a0VarJ != null && !a0VarJ.n()) {
                a0VarJ.a(6);
            }
        }
        O();
        r rVar = this.f2661c;
        ArrayList<a0> arrayList = rVar.f2774c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = arrayList.get(i11);
            if (a0Var != null) {
                a0Var.a(6);
                a0Var.a(1024);
            }
        }
        rVar.g();
    }

    public final void V(a0 a0Var, i.b bVar) {
        a0Var.f2716i &= -8193;
        boolean z10 = this.f2675j0.f2804h;
        d0 d0Var = this.f2669g;
        if (z10 && a0Var.j() && !a0Var.g() && !a0Var.n()) {
            this.f2680m.getClass();
            d0Var.f2535b.d(a0Var, a0Var.f2710c);
        }
        b1<a0, d0.a> b1Var = d0Var.f2534a;
        d0.a aVarA = b1Var.get(a0Var);
        if (aVarA == null) {
            aVarA = d0.a.a();
            b1Var.put(a0Var, aVarA);
        }
        aVarA.f2538b = bVar;
        aVarA.f2537a |= 4;
    }

    public final int W(float f10, int i10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.K;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (canScrollHorizontally(1)) {
                    this.M.onRelease();
                } else {
                    float fB = c4.b.b(this.M, width, height);
                    if (c4.b.a(this.M) == CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.M.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                float f12 = -c4.b.b(this.K, -width, 1.0f - height);
                if (c4.b.a(this.K) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    public final int X(float f10, int i10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.L;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.N;
            if (edgeEffect2 != null && c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (canScrollVertically(1)) {
                    this.N.onRelease();
                } else {
                    float fB = c4.b.b(this.N, height, 1.0f - width);
                    if (c4.b.a(this.N) == CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.N.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                float f12 = -c4.b.b(this.L, -height, width);
                if (c4.b.a(this.L) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public final void Y(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2674j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f2763c) {
                Rect rect2 = mVar.f2762b;
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
        this.f2682n.m0(this, view, this.f2674j, !this.f2700x, view2 == null);
    }

    public final void Z() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        h0(0);
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            Field field = q0.f33885a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        n();
        d dVar = this.f2680m;
        int[] iArr = this.f2697v0;
        if (dVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            b0(i10, i11, iArr);
            i13 = iArr[0];
            int i17 = iArr[1];
            i16 = i11 - i17;
            i15 = i10 - i13;
            i14 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f2689r.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        t(i13, this.f2694t0, i14, i15, i16, iArr, i12);
        int i18 = iArr[0];
        int i19 = i15 - i18;
        int i20 = iArr[1];
        int i21 = i16 - i20;
        boolean z12 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.U;
        int[] iArr2 = this.f2694t0;
        int i23 = iArr2[0];
        this.U = i22 - i23;
        int i24 = this.V;
        int i25 = iArr2[1];
        this.V = i24 - i25;
        int[] iArr3 = this.f2695u0;
        iArr3[0] = iArr3[0] + i23;
        iArr3[1] = iArr3[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & ItemType.STRING_DATA_ITEM) == 8194) {
                z10 = true;
            } else {
                float x10 = motionEvent.getX();
                float f10 = i19;
                float y10 = motionEvent.getY();
                float f11 = i21;
                if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    w();
                    z10 = true;
                    c4.b.b(this.K, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    z10 = true;
                    if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        x();
                        c4.b.b(this.M, f10 / getWidth(), y10 / getHeight());
                    } else {
                        z11 = false;
                        if (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            y();
                            c4.b.b(this.L, (-f11) / getHeight(), x10 / getWidth());
                        } else {
                            if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                                v();
                                c4.b.b(this.N, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                            }
                            if (z11 || f10 != CropImageView.DEFAULT_ASPECT_RATIO || f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
                                Field field = q0.f33885a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z11 = z10;
                        if (z11) {
                            Field field2 = q0.f33885a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
                z11 = z10;
                if (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                z11 = z10;
                if (z11) {
                }
            }
            l(i10, i11);
        } else {
            z10 = true;
        }
        if (i13 != 0 || i14 != 0) {
            u(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z12 && i13 == 0 && i14 == 0) {
            return false;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        l lVar = this.f2682n;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10, int i11, int[] iArr) {
        a0 a0Var;
        f0();
        Q();
        int i12 = u3.i.f29248a;
        Trace.beginSection("RV Scroll");
        w wVar = this.f2675j0;
        A(wVar);
        r rVar = this.f2661c;
        int iO0 = i10 != 0 ? this.f2682n.o0(i10, rVar, wVar) : 0;
        int iQ0 = i11 != 0 ? this.f2682n.q0(i11, rVar, wVar) : 0;
        Trace.endSection();
        androidx.recyclerview.widget.b bVar = this.f2667f;
        int iE = bVar.e();
        for (int i13 = 0; i13 < iE; i13++) {
            View viewD = bVar.d(i13);
            a0 a0VarI = I(viewD);
            if (a0VarI != null && (a0Var = a0VarI.f2715h) != null) {
                View view = a0Var.f2708a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        g0(false);
        if (iArr != null) {
            iArr[0] = iO0;
            iArr[1] = iQ0;
        }
    }

    public final void c0(int i10) {
        androidx.recyclerview.widget.o oVar;
        if (this.A) {
            return;
        }
        setScrollState(0);
        z zVar = this.f2670g0;
        v.this.removeCallbacks(zVar);
        zVar.f2813c.abortAnimation();
        l lVar = this.f2682n;
        if (lVar != null && (oVar = lVar.f2744e) != null) {
            oVar.f();
        }
        l lVar2 = this.f2682n;
        if (lVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar2.p0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f2682n.f((m) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.d()) {
            return this.f2682n.j(this.f2675j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.d()) {
            return this.f2682n.k(this.f2675j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.d()) {
            return this.f2682n.l(this.f2675j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.e()) {
            return this.f2682n.m(this.f2675j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.e()) {
            return this.f2682n.n(this.f2675j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l lVar = this.f2682n;
        if (lVar != null && lVar.e()) {
            return this.f2682n.o(this.f2675j0);
        }
        return 0;
    }

    public final boolean d0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fA = c4.b.a(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f2657a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = F0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fA;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, iArr, i11, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, iArr, i11, i12, i13, null, 0);
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
        boolean z10;
        super.draw(canvas);
        ArrayList<k> arrayList = this.f2689r;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2671h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, CropImageView.DEFAULT_ASPECT_RATIO);
            EdgeEffect edgeEffect2 = this.K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2671h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2671h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2671h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.O == null || arrayList.size() <= 0 || !this.O.f()) ? z10 : true) {
            Field field = q0.f33885a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(int i10, int i11, boolean z10) {
        l lVar = this.f2682n;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A) {
            return;
        }
        if (!lVar.d()) {
            i10 = 0;
        }
        if (!this.f2682n.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.f2670g0.c(i10, i11, PKIFailureInfo.systemUnavail, null);
    }

    public final void f0() {
        int i10 = this.f2702y + 1;
        this.f2702y = i10;
        if (i10 != 1 || this.A) {
            return;
        }
        this.f2704z = false;
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
    public final View focusSearch(View view, int i10) {
        View viewT;
        int i11;
        char c10;
        boolean z10;
        this.f2682n.getClass();
        boolean z11 = true;
        boolean z12 = (this.f2680m == null || this.f2682n == null || M() || this.A) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        w wVar = this.f2675j0;
        r rVar = this.f2661c;
        if (!z12 || (i10 != 2 && i10 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z12) {
                n();
                if (B(view) != null) {
                    f0();
                    viewT = this.f2682n.T(view, i10, rVar, wVar);
                    g0(false);
                }
                return null;
            }
            viewT = viewFindNextFocus;
            if (viewT == null && !viewT.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i10);
                }
                Y(viewT, null);
                return view;
            }
            if (viewT == null || viewT == this || viewT == view) {
                z11 = false;
            } else if (B(viewT) == null) {
                z11 = false;
            } else if (view != null && B(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2674j;
                rect.set(0, 0, width, height);
                int width2 = viewT.getWidth();
                int height2 = viewT.getHeight();
                Rect rect2 = this.f2676k;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewT, rect2);
                int i12 = this.f2682n.C() == 1 ? -1 : 1;
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                    i11 = 1;
                } else {
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                    c10 = 1;
                } else {
                    int i19 = rect.bottom;
                    int i20 = rect2.bottom;
                    c10 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (char) 65535 : (char) 0;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 != 66) {
                                    if (i10 != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i10);
                                        throw new IllegalArgumentException(v5.a.a(this, sb));
                                    }
                                    if (c10 <= 0) {
                                    }
                                } else if (i11 <= 0) {
                                }
                            } else if (c10 >= 0) {
                            }
                        } else if (i11 >= 0) {
                        }
                    } else if (c10 <= 0 && (c10 != 0 || i11 * i12 <= 0)) {
                    }
                } else if (c10 >= 0 && (c10 != 0 || i11 * i12 >= 0)) {
                }
            }
            return z11 ? viewT : super.focusSearch(view, i10);
        }
        if (this.f2682n.e()) {
            if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                z10 = true;
            }
            if (!z10 && this.f2682n.d()) {
                z10 = focusFinder.findNextFocus(this, view, !((this.f2682n.C() != 1) ^ (i10 != 2)) ? 66 : 17) != null;
            }
            if (z10) {
                n();
                if (B(view) != null) {
                    f0();
                    this.f2682n.T(view, i10, rVar, wVar);
                    g0(false);
                }
                return null;
            }
            viewT = focusFinder.findNextFocus(this, view, i10);
            if (viewT == null) {
            }
            if (viewT == null) {
                z11 = false;
            }
            if (z11) {
            }
        }
        z10 = false;
        if (!z10) {
            if (focusFinder.findNextFocus(this, view, !((this.f2682n.C() != 1) ^ (i10 != 2)) ? 66 : 17) != null) {
            }
        }
        if (z10) {
        }
        viewT = focusFinder.findNextFocus(this, view, i10);
        if (viewT == null) {
        }
        if (viewT == null) {
        }
        if (z11) {
        }
    }

    public final void g(a0 a0Var) {
        View view = a0Var.f2708a;
        boolean z10 = view.getParent() == this;
        this.f2661c.m(I(view));
        if (a0Var.i()) {
            this.f2667f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f2667f.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f2667f;
        int iIndexOfChild = bVar.f2512a.f2818a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            bVar.f2513b.h(iIndexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void g0(boolean z10) {
        if (this.f2702y < 1) {
            if (C0) {
                throw new IllegalStateException(v5.a.a(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f2702y = 1;
        }
        if (!z10 && !this.A) {
            this.f2704z = false;
        }
        if (this.f2702y == 1) {
            if (z10 && this.f2704z && !this.A && this.f2682n != null && this.f2680m != null) {
                p();
            }
            if (!this.A) {
                this.f2704z = false;
            }
        }
        this.f2702y--;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f2682n;
        if (lVar != null) {
            return lVar.r();
        }
        throw new IllegalStateException(v5.a.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f2682n;
        if (lVar != null) {
            return lVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(v5.a.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.f2680m;
    }

    @Override // android.view.View
    public int getBaseline() {
        l lVar = this.f2682n;
        if (lVar == null) {
            return super.getBaseline();
        }
        lVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2671h;
    }

    public androidx.recyclerview.widget.y getCompatAccessibilityDelegate() {
        return this.f2688q0;
    }

    public h getEdgeEffectFactory() {
        return this.I;
    }

    public i getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.f2689r.size();
    }

    public l getLayoutManager() {
        return this.f2682n;
    }

    public int getMaxFlingVelocity() {
        return this.f2662c0;
    }

    public int getMinFlingVelocity() {
        return this.f2660b0;
    }

    public long getNanoTime() {
        if (H0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public n getOnFlingListener() {
        return this.f2658a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2668f0;
    }

    public q getRecycledViewPool() {
        return this.f2661c.c();
    }

    public int getScrollState() {
        return this.P;
    }

    public final void h(p pVar) {
        if (this.f2679l0 == null) {
            this.f2679l0 = new ArrayList();
        }
        this.f2679l0.add(pVar);
    }

    public final void h0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (M()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(v5.a.a(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(v5.a.a(this, new StringBuilder(""))));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2696v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f33883d;
    }

    public final void k() {
        int iH = this.f2667f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            a0 a0VarJ = J(this.f2667f.g(i10));
            if (!a0VarJ.n()) {
                a0VarJ.f2711d = -1;
                a0VarJ.f2713f = -1;
            }
        }
        r rVar = this.f2661c;
        ArrayList<a0> arrayList = rVar.f2772a;
        ArrayList<a0> arrayList2 = rVar.f2774c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = arrayList2.get(i11);
            a0Var.f2711d = -1;
            a0Var.f2713f = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a0 a0Var2 = arrayList.get(i12);
            a0Var2.f2711d = -1;
            a0Var2.f2713f = -1;
        }
        ArrayList<a0> arrayList3 = rVar.f2773b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a0 a0Var3 = rVar.f2773b.get(i13);
                a0Var3.f2711d = -1;
                a0Var3.f2713f = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.K.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            Field field = q0.f33885a;
            postInvalidateOnAnimation();
        }
    }

    public final void n() {
        if (!this.f2700x || this.E) {
            int i10 = u3.i.f29248a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
            return;
        }
        androidx.recyclerview.widget.a aVar = this.f2665e;
        if (aVar.f()) {
            aVar.getClass();
            if (aVar.f()) {
                int i11 = u3.i.f29248a;
                Trace.beginSection("RV FullInvalidate");
                p();
                Trace.endSection();
            }
        }
    }

    public final void o(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = q0.f33885a;
        setMeasuredDimension(l.g(i10, paddingRight, getMinimumWidth()), l.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.G = 0;
        this.f2696v = true;
        this.f2700x = this.f2700x && !isLayoutRequested();
        this.f2661c.e();
        l lVar = this.f2682n;
        if (lVar != null) {
            lVar.f2746g = true;
            lVar.R(this);
        }
        this.f2686p0 = false;
        if (H0) {
            ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.f2618e;
            androidx.recyclerview.widget.m mVar = threadLocal.get();
            this.f2672h0 = mVar;
            if (mVar == null) {
                this.f2672h0 = new androidx.recyclerview.widget.m();
                Field field = q0.f33885a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    androidx.recyclerview.widget.m mVar2 = this.f2672h0;
                    mVar2.f2622c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(mVar2);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    androidx.recyclerview.widget.m mVar22 = this.f2672h0;
                    mVar22.f2622c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(mVar22);
                }
            }
            ArrayList<v> arrayList = this.f2672h0.f2620a;
            if (C0 && arrayList.contains(this)) {
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
        i iVar = this.O;
        if (iVar != null) {
            iVar.e();
        }
        int i10 = 0;
        setScrollState(0);
        z zVar = this.f2670g0;
        v.this.removeCallbacks(zVar);
        zVar.f2813c.abortAnimation();
        l lVar = this.f2682n;
        if (lVar != null && (oVar = lVar.f2744e) != null) {
            oVar.f();
        }
        this.f2696v = false;
        l lVar2 = this.f2682n;
        if (lVar2 != null) {
            lVar2.f2746g = false;
            lVar2.S(this);
        }
        this.f2699w0.clear();
        removeCallbacks(this.f2701x0);
        this.f2669g.getClass();
        while (d0.a.f2536d.a() != null) {
        }
        r rVar = this.f2661c;
        ArrayList<a0> arrayList = rVar.f2774c;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p4.a.a(arrayList.get(i11).f2708a);
        }
        rVar.f(v.this.f2680m, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList<p4.b> arrayList2 = p4.a.b(childAt).f21187a;
            for (int i13 = qg.p.i(arrayList2); -1 < i13; i13--) {
                arrayList2.get(i13).a();
            }
            i10 = i12;
        }
        if (!H0 || (mVar = this.f2672h0) == null) {
            return;
        }
        boolean zRemove = mVar.f2620a.remove(this);
        if (C0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f2672h0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<k> arrayList = this.f2689r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).getClass();
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
        float f10;
        float axisValue;
        l lVar;
        if (this.f2682n != null && !this.A && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f2682n.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2682n.d() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f10 != CropImageView.DEFAULT_ASPECT_RATIO || axisValue != CropImageView.DEFAULT_ASPECT_RATIO) {
                    int i10 = (int) (axisValue * this.f2664d0);
                    int i11 = (int) (f10 * this.f2666e0);
                    lVar = this.f2682n;
                    if (lVar != null) {
                        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return false;
                    }
                    if (!this.A) {
                        int[] iArr = this.f2697v0;
                        iArr[0] = 0;
                        iArr[1] = 0;
                        boolean zD = lVar.d();
                        boolean zE = this.f2682n.e();
                        int i12 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                        float y10 = motionEvent.getY();
                        float x10 = motionEvent.getX();
                        int iW = i10 - W(y10, i10);
                        int iX = i11 - X(x10, i11);
                        getScrollingChildHelper().g(i12, 1);
                        if (s(zD ? iW : 0, this.f2697v0, zE ? iX : 0, 1, this.f2694t0)) {
                            iW -= iArr[0];
                            iX -= iArr[1];
                        }
                        a0(zD ? iW : 0, zE ? iX : 0, motionEvent, 1);
                        androidx.recyclerview.widget.m mVar = this.f2672h0;
                        if (mVar != null && (iW != 0 || iX != 0)) {
                            mVar.a(this, iW, iX);
                        }
                        h0(1);
                    }
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2682n.e()) {
                    f10 = -axisValue2;
                    if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        int i102 = (int) (axisValue * this.f2664d0);
                        int i112 = (int) (f10 * this.f2666e0);
                        lVar = this.f2682n;
                        if (lVar != null) {
                        }
                    }
                } else {
                    if (this.f2682n.d()) {
                        axisValue = axisValue2;
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.A) {
            this.f2693t = null;
            if (C(motionEvent)) {
                Z();
                setScrollState(0);
                return true;
            }
            l lVar = this.f2682n;
            if (lVar != null) {
                boolean zD = lVar.d();
                boolean zE = this.f2682n.e();
                if (this.R == null) {
                    this.R = VelocityTracker.obtain();
                }
                this.R.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.B) {
                        this.B = false;
                    }
                    this.Q = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.U = x10;
                    this.S = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.V = y10;
                    this.T = y10;
                    EdgeEffect edgeEffect = this.K;
                    if (edgeEffect == null || c4.b.a(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO || canScrollHorizontally(-1)) {
                        z10 = false;
                    } else {
                        c4.b.b(this.K, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    }
                    EdgeEffect edgeEffect2 = this.M;
                    boolean z12 = z10;
                    if (edgeEffect2 != null) {
                        z12 = z10;
                        if (c4.b.a(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                            z12 = z10;
                            if (!canScrollHorizontally(1)) {
                                c4.b.b(this.M, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getY() / getHeight());
                                z12 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.L;
                    boolean z13 = z12;
                    if (edgeEffect3 != null) {
                        z13 = z12;
                        if (c4.b.a(edgeEffect3) != CropImageView.DEFAULT_ASPECT_RATIO) {
                            z13 = z12;
                            if (!canScrollVertically(-1)) {
                                c4.b.b(this.L, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getX() / getWidth());
                                z13 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.N;
                    boolean z14 = z13;
                    if (edgeEffect4 != null) {
                        z14 = z13;
                        if (c4.b.a(edgeEffect4) != CropImageView.DEFAULT_ASPECT_RATIO) {
                            z14 = z13;
                            if (!canScrollVertically(1)) {
                                c4.b.b(this.N, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / getWidth()));
                                z14 = true;
                            }
                        }
                    }
                    if (z14 || this.P == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        h0(1);
                    }
                    int[] iArr = this.f2695u0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zD;
                    if (zE) {
                        i10 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else if (actionMasked == 1) {
                    this.R.clear();
                    h0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.P != 1) {
                        int i11 = x11 - this.S;
                        int i12 = y11 - this.T;
                        if (zD == 0 || Math.abs(i11) <= this.W) {
                            z11 = false;
                        } else {
                            this.U = x11;
                            z11 = true;
                        }
                        if (zE && Math.abs(i12) > this.W) {
                            this.V = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    Z();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.Q = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.U = x12;
                    this.S = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.V = y12;
                    this.T = y12;
                } else if (actionMasked == 6) {
                    S(motionEvent);
                }
                if (this.P == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = u3.i.f29248a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.f2700x = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l lVar = this.f2682n;
        if (lVar == null) {
            o(i10, i11);
            return;
        }
        boolean zL = lVar.L();
        boolean z10 = false;
        w wVar = this.f2675j0;
        if (!zL) {
            if (this.f2698w) {
                this.f2682n.f2741b.o(i10, i11);
                return;
            }
            if (wVar.f2807k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d dVar = this.f2680m;
            if (dVar != null) {
                wVar.f2801e = dVar.a();
            } else {
                wVar.f2801e = 0;
            }
            f0();
            this.f2682n.f2741b.o(i10, i11);
            g0(false);
            wVar.f2803g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f2682n.f2741b.o(i10, i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z10 = true;
        }
        this.f2703y0 = z10;
        if (z10 || this.f2680m == null) {
            return;
        }
        if (wVar.f2800d == 1) {
            q();
        }
        this.f2682n.s0(i10, i11);
        wVar.f2805i = true;
        r();
        this.f2682n.u0(i10, i11);
        if (this.f2682n.x0()) {
            this.f2682n.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            wVar.f2805i = true;
            r();
            this.f2682n.u0(i10, i11);
        }
        this.f2705z0 = getMeasuredWidth();
        this.A0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.f2663d = uVar;
        super.onRestoreInstanceState(uVar.f21914a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.f2663d;
        if (uVar2 != null) {
            uVar.f2781c = uVar2.f2781c;
            return uVar;
        }
        l lVar = this.f2682n;
        if (lVar != null) {
            uVar.f2781c = lVar.g0();
            return uVar;
        }
        uVar.f2781c = null;
        return uVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
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
        boolean zC;
        boolean z10;
        if (!this.A && !this.B) {
            o oVar = this.f2693t;
            if (oVar == null) {
                zC = motionEvent.getAction() == 0 ? false : C(motionEvent);
            } else {
                oVar.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f2693t = null;
                }
                zC = true;
            }
            if (zC) {
                Z();
                setScrollState(0);
                return true;
            }
            l lVar = this.f2682n;
            if (lVar != null) {
                boolean zD = lVar.d();
                boolean zE = this.f2682n.e();
                if (this.R == null) {
                    this.R = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f2695u0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.Q = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.U = x10;
                    this.S = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.V = y10;
                    this.T = y10;
                    int i10 = zD;
                    if (zE) {
                        i10 = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.R.addMovement(motionEventObtain);
                        this.R.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, this.f2662c0);
                        float f10 = zD != 0 ? -this.R.getXVelocity(this.Q) : 0.0f;
                        float f11 = zE ? -this.R.getYVelocity(this.Q) : 0.0f;
                        if ((f10 == CropImageView.DEFAULT_ASPECT_RATIO && f11 == CropImageView.DEFAULT_ASPECT_RATIO) || !G((int) f10, (int) f11)) {
                            setScrollState(0);
                        }
                        Z();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.U - x11;
                        int iMax2 = this.V - y11;
                        if (this.P != 1) {
                            if (zD == 0) {
                                z10 = false;
                                if (zE) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.W) : Math.min(0, iMax2 + this.W);
                                    if (iMax2 != 0) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    setScrollState(1);
                                }
                            } else {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.W) : Math.min(0, iMax + this.W);
                                if (iMax != 0) {
                                    z10 = true;
                                }
                                if (zE) {
                                }
                                if (z10) {
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.P == 1) {
                            int[] iArr2 = this.f2697v0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iW = iMax - W(motionEvent.getY(), iMax);
                            int iX = iMax2 - X(motionEvent.getX(), iMax2);
                            boolean zS = s(zD != 0 ? iW : 0, this.f2697v0, zE ? iX : 0, 0, this.f2694t0);
                            int[] iArr3 = this.f2694t0;
                            if (zS) {
                                iW -= iArr2[0];
                                iX -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i11 = iW;
                            int i12 = iX;
                            this.U = x11 - iArr3[0];
                            this.V = y11 - iArr3[1];
                            if (a0(zD != 0 ? i11 : 0, zE ? i12 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.m mVar = this.f2672h0;
                            if (mVar != null && (i11 != 0 || i12 != 0)) {
                                mVar.a(this, i11, i12);
                            }
                        }
                    } else if (actionMasked == 3) {
                        Z();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.Q = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.U = x12;
                        this.S = x12;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.V = y12;
                        this.T = y12;
                    } else if (actionMasked == 6) {
                        S(motionEvent);
                    }
                }
                this.R.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0328  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        boolean z10;
        View viewFindViewById;
        i.b bVar;
        ?? r32;
        v vVar;
        boolean zG;
        boolean z11;
        int i10;
        if (this.f2680m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2682n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        w wVar = this.f2675j0;
        boolean z12 = false;
        wVar.f2805i = false;
        boolean z13 = true;
        boolean z14 = this.f2703y0 && !(this.f2705z0 == getWidth() && this.A0 == getHeight());
        this.f2705z0 = 0;
        this.A0 = 0;
        this.f2703y0 = false;
        if (wVar.f2800d == 1) {
            q();
            this.f2682n.r0(this);
            r();
        } else {
            androidx.recyclerview.widget.a aVar = this.f2665e;
            if ((aVar.f2505c.isEmpty() || aVar.f2504b.isEmpty()) && !z14 && this.f2682n.f2753n == getWidth() && this.f2682n.f2754o == getHeight()) {
                this.f2682n.r0(this);
            } else {
                this.f2682n.r0(this);
                r();
            }
        }
        int i11 = 4;
        wVar.a(4);
        f0();
        Q();
        wVar.f2800d = 1;
        boolean z15 = wVar.f2806j;
        r rVar = this.f2661c;
        d0 d0Var = this.f2669g;
        if (z15) {
            int iE = this.f2667f.e() - 1;
            while (iE >= 0) {
                a0 a0VarJ = J(this.f2667f.d(iE));
                if (a0VarJ.n()) {
                    z11 = z13;
                } else {
                    this.f2680m.getClass();
                    long j10 = a0VarJ.f2710c;
                    this.O.getClass();
                    i.b bVar2 = new i.b();
                    bVar2.a(a0VarJ);
                    p.q<a0> qVar = d0Var.f2535b;
                    b1<a0, d0.a> b1Var = d0Var.f2534a;
                    a0 a0VarB = qVar.b(j10);
                    if (a0VarB == null || a0VarB.n()) {
                        z11 = z13;
                        d0Var.a(a0VarJ, bVar2);
                    } else {
                        z11 = z13;
                        d0.a aVar2 = b1Var.get(a0VarB);
                        boolean z16 = (aVar2 == null || (aVar2.f2537a & 1) == 0) ? false : z11;
                        d0.a aVar3 = b1Var.get(a0VarJ);
                        boolean z17 = (aVar3 == null || (aVar3.f2537a & 1) == 0) ? false : z11;
                        if (z16 && a0VarB == a0VarJ) {
                            d0Var.a(a0VarJ, bVar2);
                        } else {
                            i.b bVarB = d0Var.b(a0VarB, i11);
                            d0Var.a(a0VarJ, bVar2);
                            i.b bVarB2 = d0Var.b(a0VarJ, 8);
                            if (bVarB == null) {
                                int iE2 = this.f2667f.e();
                                int i12 = 0;
                                while (i12 < iE2) {
                                    a0 a0VarJ2 = J(this.f2667f.d(i12));
                                    if (a0VarJ2 == a0VarJ) {
                                        i10 = iE2;
                                    } else {
                                        this.f2680m.getClass();
                                        i10 = iE2;
                                        if (a0VarJ2.f2710c == j10) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(a0VarJ2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(a0VarJ);
                                            throw new IllegalStateException(v5.a.a(this, sb));
                                        }
                                    }
                                    i12++;
                                    iE2 = i10;
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + a0VarB + " cannot be found but it is necessary for " + a0VarJ + z());
                            } else {
                                a0VarB.m(false);
                                if (z16) {
                                    g(a0VarB);
                                }
                                if (a0VarB != a0VarJ) {
                                    if (z17) {
                                        g(a0VarJ);
                                    }
                                    a0VarB.f2714g = a0VarJ;
                                    g(a0VarB);
                                    rVar.m(a0VarB);
                                    a0VarJ.m(false);
                                    a0VarJ.f2715h = a0VarB;
                                }
                                if (this.O.a(a0VarB, a0VarJ, bVarB, bVarB2)) {
                                    T();
                                }
                            }
                        }
                    }
                }
                iE--;
                z13 = z11;
                i11 = 4;
            }
            z10 = z13;
            b1<a0, d0.a> b1Var2 = d0Var.f2534a;
            int i13 = b1Var2.f20576c - 1;
            while (i13 >= 0) {
                a0 a0VarH = b1Var2.h(i13);
                d0.a aVarI = b1Var2.i(i13);
                int i14 = aVarI.f2537a;
                int i15 = i14 & 3;
                c cVar = this.B0;
                if (i15 == 3) {
                    v vVar2 = v.this;
                    vVar2.f2682n.k0(a0VarH.f2708a, vVar2.f2661c);
                    r32 = z12;
                } else if ((i14 & 1) != 0) {
                    i.b bVar3 = aVarI.f2538b;
                    if (bVar3 == null) {
                        v vVar3 = v.this;
                        vVar3.f2682n.k0(a0VarH.f2708a, vVar3.f2661c);
                        r32 = z12;
                    } else {
                        cVar.b(a0VarH, bVar3, aVarI.f2539c);
                        r32 = z12;
                    }
                } else if ((i14 & 14) == 14) {
                    cVar.a(a0VarH, aVarI.f2538b, aVarI.f2539c);
                    r32 = z12;
                } else if ((i14 & 12) == 12) {
                    i.b bVar4 = aVarI.f2538b;
                    i.b bVar5 = aVarI.f2539c;
                    cVar.getClass();
                    a0VarH.m(z12);
                    v vVar4 = v.this;
                    if (!vVar4.E) {
                        androidx.recyclerview.widget.a0 a0Var = (androidx.recyclerview.widget.a0) vVar4.O;
                        a0Var.getClass();
                        int i16 = bVar4.f2737a;
                        int i17 = bVar5.f2737a;
                        if (i16 == i17 && bVar4.f2738b == bVar5.f2738b) {
                            a0Var.c(a0VarH);
                            vVar = vVar4;
                            zG = false;
                        } else {
                            vVar = vVar4;
                            zG = a0Var.g(a0VarH, i16, bVar4.f2738b, i17, bVar5.f2738b);
                        }
                        if (zG) {
                            vVar.T();
                        }
                    } else if (vVar4.O.a(a0VarH, a0VarH, bVar4, bVar5)) {
                        vVar4.T();
                    }
                    r32 = 0;
                } else {
                    if ((i14 & 4) != 0) {
                        bVar = null;
                        cVar.b(a0VarH, aVarI.f2538b, null);
                    } else {
                        bVar = null;
                        if ((i14 & 8) != 0) {
                            cVar.a(a0VarH, aVarI.f2538b, aVarI.f2539c);
                        }
                    }
                    r32 = 0;
                    aVarI.f2537a = r32;
                    aVarI.f2538b = bVar;
                    aVarI.f2539c = bVar;
                    d0.a.f2536d.b(aVarI);
                    i13--;
                    z12 = false;
                }
                bVar = null;
                aVarI.f2537a = r32;
                aVarI.f2538b = bVar;
                aVarI.f2539c = bVar;
                d0.a.f2536d.b(aVarI);
                i13--;
                z12 = false;
            }
        } else {
            z10 = true;
        }
        View view = null;
        this.f2682n.j0(rVar);
        wVar.f2798b = wVar.f2801e;
        this.E = false;
        this.F = false;
        wVar.f2806j = false;
        wVar.f2807k = false;
        this.f2682n.f2745f = false;
        ArrayList<a0> arrayList = rVar.f2773b;
        if (arrayList != null) {
            arrayList.clear();
        }
        l lVar = this.f2682n;
        if (lVar.f2750k) {
            lVar.f2749j = 0;
            lVar.f2750k = false;
            rVar.n();
        }
        this.f2682n.e0(wVar);
        boolean z18 = z10;
        R(z18);
        g0(false);
        d0Var.f2534a.clear();
        d0Var.f2535b.a();
        int[] iArr = this.f2690r0;
        int i18 = iArr[0];
        int i19 = iArr[z18 ? 1 : 0];
        D(iArr);
        if ((iArr[0] == i18 && iArr[z18 ? 1 : 0] == i19) ? false : true) {
            u(0, 0);
        }
        if (this.f2668f0 && this.f2680m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (this.f2667f.f2514c.contains(getFocusedChild())) {
                    if (wVar.f2809m != -1) {
                        this.f2680m.getClass();
                    }
                    if (this.f2667f.e() > 0) {
                        int i20 = wVar.f2808l;
                        int i21 = i20 != -1 ? i20 : 0;
                        int iB = wVar.b();
                        for (int i22 = i21; i22 < iB; i22++) {
                            a0 a0VarF = F(i22);
                            if (a0VarF == null) {
                                break;
                            }
                            View view2 = a0VarF.f2708a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                        int iMin = Math.min(iB, i21) - 1;
                        while (true) {
                            if (iMin < 0) {
                                break;
                            }
                            a0 a0VarF2 = F(iMin);
                            if (a0VarF2 == null) {
                                break;
                            }
                            View view3 = a0VarF2.f2708a;
                            if (view3.hasFocusable()) {
                                view = view3;
                                break;
                            }
                            iMin--;
                        }
                    }
                    if (view != null) {
                        int i23 = wVar.f2810n;
                        if (i23 != -1 && (viewFindViewById = view.findViewById(i23)) != null && viewFindViewById.isFocusable()) {
                            view = viewFindViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
        }
        wVar.f2809m = -1L;
        wVar.f2808l = -1;
        wVar.f2810n = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        p.q<a0> qVar;
        b1<a0, d0.a> b1Var;
        boolean z10;
        int iH;
        d0.a aVar;
        p.q<a0> qVar2;
        b1<a0, d0.a> b1Var2;
        View viewB;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        p.q<a0> qVar3;
        b1<a0, d0.a> b1Var3;
        boolean z14;
        boolean z15;
        a.C0037a c0037aG;
        int i10;
        int i11;
        a.C0037a c0037a;
        w wVar = this.f2675j0;
        wVar.a(1);
        A(wVar);
        wVar.f2805i = false;
        f0();
        d0 d0Var = this.f2669g;
        b1<a0, d0.a> b1Var4 = d0Var.f2534a;
        b1<a0, d0.a> b1Var5 = d0Var.f2534a;
        b1Var4.clear();
        p.q<a0> qVar4 = d0Var.f2535b;
        qVar4.a();
        Q();
        if (this.E) {
            androidx.recyclerview.widget.a aVar2 = this.f2665e;
            aVar2.i(aVar2.f2504b);
            aVar2.i(aVar2.f2505c);
            if (this.F) {
                this.f2682n.Z();
            }
        }
        if (this.O == null || !this.f2682n.A0()) {
            qVar = qVar4;
            b1Var = b1Var5;
            this.f2665e.b();
        } else {
            androidx.recyclerview.widget.a aVar3 = this.f2665e;
            x3.c cVar = aVar3.f2503a;
            androidx.recyclerview.widget.x xVar = aVar3.f2506d;
            androidx.recyclerview.widget.p pVar = aVar3.f2507e;
            ArrayList<a.C0037a> arrayList = aVar3.f2504b;
            pVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z16 = false;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (arrayList.get(size).f2508a == 8) {
                        if (z16) {
                            break;
                        }
                    } else {
                        z16 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i12 = size + 1;
                androidx.recyclerview.widget.a aVar4 = pVar.f2650a;
                x3.c cVar2 = aVar4.f2503a;
                a.C0037a c0037a2 = arrayList.get(size);
                a.C0037a c0037a3 = arrayList.get(i12);
                androidx.recyclerview.widget.p pVar2 = pVar;
                int i13 = c0037a3.f2508a;
                if (i13 != 1) {
                    a.C0037a c0037aG2 = null;
                    if (i13 == 2) {
                        qVar3 = qVar4;
                        b1Var3 = b1Var5;
                        int i14 = c0037a2.f2509b;
                        int i15 = c0037a2.f2510c;
                        if (i14 < i15) {
                            if (c0037a3.f2509b == i14 && c0037a3.f2510c == i15 - i14) {
                                z14 = false;
                                z15 = true;
                            } else {
                                z14 = false;
                                z15 = false;
                            }
                        } else if (c0037a3.f2509b == i15 + 1 && c0037a3.f2510c == i14 - i15) {
                            z14 = true;
                            z15 = true;
                        } else {
                            z14 = true;
                            z15 = false;
                        }
                        int i16 = c0037a3.f2509b;
                        if (i15 < i16) {
                            c0037a3.f2509b = i16 - 1;
                        } else {
                            int i17 = c0037a3.f2510c;
                            if (i15 < i16 + i17) {
                                c0037a3.f2510c = i17 - 1;
                                c0037a2.f2508a = 2;
                                c0037a2.f2510c = 1;
                                if (c0037a3.f2510c == 0) {
                                    arrayList.remove(i12);
                                    cVar2.b(c0037a3);
                                }
                            }
                        }
                        int i18 = c0037a2.f2509b;
                        int i19 = c0037a3.f2509b;
                        if (i18 <= i19) {
                            c0037a3.f2509b = i19 + 1;
                        } else {
                            int i20 = i19 + c0037a3.f2510c;
                            if (i18 < i20) {
                                c0037aG2 = aVar4.g(2, i18 + 1, i20 - i18);
                                c0037a3.f2510c = c0037a2.f2509b - c0037a3.f2509b;
                            }
                        }
                        a.C0037a c0037a4 = c0037aG2;
                        if (z15) {
                            arrayList.set(size, c0037a3);
                            arrayList.remove(i12);
                            cVar2.b(c0037a2);
                        } else {
                            if (z14) {
                                if (c0037a4 != null) {
                                    int i21 = c0037a2.f2509b;
                                    if (i21 > c0037a4.f2509b) {
                                        c0037a2.f2509b = i21 - c0037a4.f2510c;
                                    }
                                    int i22 = c0037a2.f2510c;
                                    if (i22 > c0037a4.f2509b) {
                                        c0037a2.f2510c = i22 - c0037a4.f2510c;
                                    }
                                }
                                int i23 = c0037a2.f2509b;
                                if (i23 > c0037a3.f2509b) {
                                    c0037a2.f2509b = i23 - c0037a3.f2510c;
                                }
                                int i24 = c0037a2.f2510c;
                                if (i24 > c0037a3.f2509b) {
                                    c0037a2.f2510c = i24 - c0037a3.f2510c;
                                }
                            } else {
                                if (c0037a4 != null) {
                                    int i25 = c0037a2.f2509b;
                                    if (i25 >= c0037a4.f2509b) {
                                        c0037a2.f2509b = i25 - c0037a4.f2510c;
                                    }
                                    int i26 = c0037a2.f2510c;
                                    if (i26 >= c0037a4.f2509b) {
                                        c0037a2.f2510c = i26 - c0037a4.f2510c;
                                    }
                                }
                                int i27 = c0037a2.f2509b;
                                if (i27 >= c0037a3.f2509b) {
                                    c0037a2.f2509b = i27 - c0037a3.f2510c;
                                }
                                int i28 = c0037a2.f2510c;
                                if (i28 >= c0037a3.f2509b) {
                                    c0037a2.f2510c = i28 - c0037a3.f2510c;
                                }
                            }
                            arrayList.set(size, c0037a3);
                            if (c0037a2.f2509b != c0037a2.f2510c) {
                                arrayList.set(i12, c0037a2);
                            } else {
                                arrayList.remove(i12);
                            }
                            if (c0037a4 != null) {
                                arrayList.add(size, c0037a4);
                            }
                        }
                    } else if (i13 != 4) {
                        qVar3 = qVar4;
                        b1Var3 = b1Var5;
                    } else {
                        int i29 = c0037a2.f2510c;
                        int i30 = c0037a3.f2509b;
                        if (i29 < i30) {
                            c0037a3.f2509b = i30 - 1;
                        } else {
                            int i31 = c0037a3.f2510c;
                            if (i29 < i30 + i31) {
                                c0037a3.f2510c = i31 - 1;
                                qVar3 = qVar4;
                                c0037aG = aVar4.g(4, c0037a2.f2509b, 1);
                            }
                            i10 = c0037a2.f2509b;
                            i11 = c0037a3.f2509b;
                            if (i10 > i11) {
                                c0037a3.f2509b = i11 + 1;
                            } else {
                                int i32 = i11 + c0037a3.f2510c;
                                if (i10 < i32) {
                                    int i33 = i32 - i10;
                                    b1Var3 = b1Var5;
                                    c0037aG2 = aVar4.g(4, i10 + 1, i33);
                                    c0037a3.f2510c -= i33;
                                }
                                c0037a = c0037aG2;
                                arrayList.set(i12, c0037a2);
                                if (c0037a3.f2510c > 0) {
                                    arrayList.set(size, c0037a3);
                                } else {
                                    arrayList.remove(size);
                                    cVar2.b(c0037a3);
                                }
                                if (c0037aG != null) {
                                    arrayList.add(size, c0037aG);
                                }
                                if (c0037a != null) {
                                    arrayList.add(size, c0037a);
                                }
                            }
                            b1Var3 = b1Var5;
                            c0037a = c0037aG2;
                            arrayList.set(i12, c0037a2);
                            if (c0037a3.f2510c > 0) {
                            }
                            if (c0037aG != null) {
                            }
                            if (c0037a != null) {
                            }
                        }
                        qVar3 = qVar4;
                        c0037aG = null;
                        i10 = c0037a2.f2509b;
                        i11 = c0037a3.f2509b;
                        if (i10 > i11) {
                        }
                        b1Var3 = b1Var5;
                        c0037a = c0037aG2;
                        arrayList.set(i12, c0037a2);
                        if (c0037a3.f2510c > 0) {
                        }
                        if (c0037aG != null) {
                        }
                        if (c0037a != null) {
                        }
                    }
                } else {
                    qVar3 = qVar4;
                    b1Var3 = b1Var5;
                    int i34 = c0037a2.f2510c;
                    int i35 = c0037a3.f2509b;
                    int i36 = i34 < i35 ? -1 : 0;
                    int i37 = c0037a2.f2509b;
                    if (i37 < i35) {
                        i36++;
                    }
                    if (i35 <= i37) {
                        c0037a2.f2509b = i37 + c0037a3.f2510c;
                    }
                    int i38 = c0037a3.f2509b;
                    if (i38 <= i34) {
                        c0037a2.f2510c = i34 + c0037a3.f2510c;
                    }
                    c0037a3.f2509b = i38 + i36;
                    arrayList.set(size, c0037a3);
                    arrayList.set(i12, c0037a2);
                }
                pVar = pVar2;
                qVar4 = qVar3;
                b1Var5 = b1Var3;
            }
            qVar = qVar4;
            b1Var = b1Var5;
            int size2 = arrayList.size();
            for (int i39 = 0; i39 < size2; i39++) {
                a.C0037a c0037aG3 = arrayList.get(i39);
                int i40 = c0037aG3.f2508a;
                if (i40 == 1) {
                    aVar3.h(c0037aG3);
                } else if (i40 == 2) {
                    int i41 = c0037aG3.f2509b;
                    int i42 = c0037aG3.f2510c + i41;
                    int i43 = i41;
                    int i44 = 0;
                    char c11 = 65535;
                    while (i43 < i42) {
                        if (xVar.b(i43) != null || aVar3.a(i43)) {
                            if (c11 == 0) {
                                aVar3.c(aVar3.g(2, i41, i44));
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z12;
                            c10 = 1;
                        } else {
                            if (c11 == 1) {
                                aVar3.h(aVar3.g(2, i41, i44));
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c10 = 0;
                        }
                        if (z13) {
                            i43 -= i44;
                            i42 -= i44;
                            i44 = 1;
                        } else {
                            i44++;
                        }
                        i43++;
                        c11 = c10;
                    }
                    if (i44 != c0037aG3.f2510c) {
                        cVar.b(c0037aG3);
                        c0037aG3 = aVar3.g(2, i41, i44);
                    }
                    if (c11 == 0) {
                        aVar3.c(c0037aG3);
                    } else {
                        aVar3.h(c0037aG3);
                    }
                } else if (i40 == 4) {
                    int i45 = c0037aG3.f2509b;
                    int i46 = c0037aG3.f2510c + i45;
                    int i47 = i45;
                    int i48 = 0;
                    char c12 = 65535;
                    while (i45 < i46) {
                        if (xVar.b(i45) != null || aVar3.a(i45)) {
                            if (c12 == 0) {
                                aVar3.c(aVar3.g(4, i47, i48));
                                i47 = i45;
                                i48 = 0;
                            }
                            c12 = 1;
                        } else {
                            if (c12 == 1) {
                                aVar3.h(aVar3.g(4, i47, i48));
                                i47 = i45;
                                i48 = 0;
                            }
                            c12 = 0;
                        }
                        i48++;
                        i45++;
                    }
                    if (i48 != c0037aG3.f2510c) {
                        cVar.b(c0037aG3);
                        c0037aG3 = aVar3.g(4, i47, i48);
                    }
                    if (c12 == 0) {
                        aVar3.c(c0037aG3);
                    } else {
                        aVar3.h(c0037aG3);
                    }
                } else if (i40 == 8) {
                    aVar3.h(c0037aG3);
                }
            }
            arrayList.clear();
        }
        boolean z17 = this.f2681m0 || this.f2683n0;
        if (!this.f2700x || this.O == null || (!(z11 = this.E) && !z17 && !this.f2682n.f2745f)) {
            z10 = false;
        } else if (z11) {
            this.f2680m.getClass();
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar2 = this.f2675j0;
        wVar2.f2806j = z10;
        wVar2.f2807k = z10 && z17 && !this.E && this.O != null && this.f2682n.A0();
        a0 a0VarI = null;
        View focusedChild = (this.f2668f0 && hasFocus() && this.f2680m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewB = B(focusedChild)) != null) {
            a0VarI = I(viewB);
        }
        if (a0VarI == null) {
            wVar.f2809m = -1L;
            wVar.f2808l = -1;
            wVar.f2810n = -1;
        } else {
            this.f2680m.getClass();
            wVar.f2809m = -1L;
            if (!this.E) {
                if (a0VarI.g()) {
                    iH = a0VarI.f2711d;
                } else {
                    v vVar = a0VarI.f2724q;
                    iH = vVar == null ? -1 : vVar.H(a0VarI);
                }
                wVar.f2808l = iH;
                View focusedChild2 = a0VarI.f2708a;
                int id2 = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id2 = focusedChild2.getId();
                    }
                }
                wVar.f2810n = id2;
            }
        }
        wVar.f2804h = wVar.f2806j && this.f2683n0;
        this.f2683n0 = false;
        this.f2681m0 = false;
        wVar.f2803g = wVar.f2807k;
        wVar.f2801e = this.f2680m.a();
        D(this.f2690r0);
        if (wVar.f2806j) {
            int iE = this.f2667f.e();
            int i49 = 0;
            while (i49 < iE) {
                a0 a0VarJ = J(this.f2667f.d(i49));
                if (a0VarJ.n()) {
                    qVar2 = qVar;
                    b1Var2 = b1Var;
                } else if (a0VarJ.e()) {
                    this.f2680m.getClass();
                    qVar2 = qVar;
                    b1Var2 = b1Var;
                } else {
                    i iVar = this.O;
                    i.b(a0VarJ);
                    a0VarJ.c();
                    iVar.getClass();
                    i.b bVar = new i.b();
                    bVar.a(a0VarJ);
                    b1Var2 = b1Var;
                    d0.a aVarA = b1Var2.get(a0VarJ);
                    if (aVarA == null) {
                        aVarA = d0.a.a();
                        b1Var2.put(a0VarJ, aVarA);
                    }
                    aVarA.f2538b = bVar;
                    aVarA.f2537a |= 4;
                    if (!wVar.f2804h || !a0VarJ.j() || a0VarJ.g() || a0VarJ.n() || a0VarJ.e()) {
                        qVar2 = qVar;
                    } else {
                        this.f2680m.getClass();
                        qVar2 = qVar;
                        qVar2.d(a0VarJ, a0VarJ.f2710c);
                    }
                }
                i49++;
                qVar = qVar2;
                b1Var = b1Var2;
            }
        }
        b1<a0, d0.a> b1Var6 = b1Var;
        if (wVar.f2807k) {
            int iH2 = this.f2667f.h();
            for (int i50 = 0; i50 < iH2; i50++) {
                a0 a0VarJ2 = J(this.f2667f.g(i50));
                if (C0 && a0VarJ2.f2710c == -1 && !a0VarJ2.g()) {
                    throw new IllegalStateException(v5.a.a(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!a0VarJ2.n() && a0VarJ2.f2711d == -1) {
                    a0VarJ2.f2711d = a0VarJ2.f2710c;
                }
            }
            boolean z18 = wVar.f2802f;
            wVar.f2802f = false;
            this.f2682n.d0(this.f2661c, wVar);
            wVar.f2802f = z18;
            for (int i51 = 0; i51 < this.f2667f.e(); i51++) {
                a0 a0VarJ3 = J(this.f2667f.d(i51));
                if (!a0VarJ3.n() && ((aVar = b1Var6.get(a0VarJ3)) == null || (aVar.f2537a & 4) == 0)) {
                    i.b(a0VarJ3);
                    boolean z19 = (a0VarJ3.f2716i & 8192) != 0;
                    i iVar2 = this.O;
                    a0VarJ3.c();
                    iVar2.getClass();
                    i.b bVar2 = new i.b();
                    bVar2.a(a0VarJ3);
                    if (z19) {
                        V(a0VarJ3, bVar2);
                    } else {
                        d0.a aVarA2 = b1Var6.get(a0VarJ3);
                        if (aVarA2 == null) {
                            aVarA2 = d0.a.a();
                            b1Var6.put(a0VarJ3, aVarA2);
                        }
                        aVarA2.f2537a |= 2;
                        aVarA2.f2538b = bVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        R(true);
        g0(false);
        wVar.f2800d = 2;
    }

    public final void r() {
        f0();
        Q();
        w wVar = this.f2675j0;
        wVar.a(6);
        this.f2665e.b();
        wVar.f2801e = this.f2680m.a();
        wVar.f2799c = 0;
        if (this.f2663d != null) {
            d dVar = this.f2680m;
            int iOrdinal = dVar.f2728b.ordinal();
            if (iOrdinal == 1 ? dVar.a() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f2663d.f2781c;
                if (parcelable != null) {
                    this.f2682n.f0(parcelable);
                }
                this.f2663d = null;
            }
        }
        wVar.f2803g = false;
        this.f2682n.d0(this.f2661c, wVar);
        wVar.f2802f = false;
        wVar.f2806j = wVar.f2806j && this.O != null;
        wVar.f2800d = 4;
        R(true);
        g0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        a0 a0VarJ = J(view);
        if (a0VarJ != null) {
            if (a0VarJ.i()) {
                a0VarJ.f2716i &= -257;
            } else if (!a0VarJ.n()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(a0VarJ);
                throw new IllegalArgumentException(v5.a.a(this, sb));
            }
        } else if (C0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(v5.a.a(this, sb2));
        }
        view.clearAnimation();
        a0 a0VarJ2 = J(view);
        d dVar = this.f2680m;
        if (dVar != null && a0VarJ2 != null) {
            dVar.e(a0VarJ2);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.o oVar = this.f2682n.f2744e;
        if ((oVar == null || !oVar.f2786e) && !M() && view2 != null) {
            Y(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2682n.m0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<o> arrayList = this.f2691s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2702y != 0 || this.A) {
            this.f2704z = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        return getScrollingChildHelper().c(i10, iArr, i11, i12, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        l lVar = this.f2682n;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A) {
            return;
        }
        boolean zD = lVar.d();
        boolean zE = this.f2682n.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            a0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.C |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.y yVar) {
        this.f2688q0 = yVar;
        q0.h(this, yVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.f2680m;
        t tVar = this.f2659b;
        if (dVar2 != null) {
            dVar2.f2727a.unregisterObserver(tVar);
            this.f2680m.getClass();
        }
        i iVar = this.O;
        if (iVar != null) {
            iVar.e();
        }
        l lVar = this.f2682n;
        r rVar = this.f2661c;
        if (lVar != null) {
            lVar.i0(rVar);
            this.f2682n.j0(rVar);
        }
        rVar.f2772a.clear();
        rVar.g();
        androidx.recyclerview.widget.a aVar = this.f2665e;
        aVar.i(aVar.f2504b);
        aVar.i(aVar.f2505c);
        d<?> dVar3 = this.f2680m;
        this.f2680m = dVar;
        if (dVar != null) {
            dVar.f2727a.registerObserver(tVar);
        }
        l lVar2 = this.f2682n;
        if (lVar2 != null) {
            lVar2.Q();
        }
        d dVar4 = this.f2680m;
        rVar.f2772a.clear();
        rVar.g();
        rVar.f(dVar3, true);
        q qVarC = rVar.c();
        if (dVar3 != null) {
            qVarC.f2766b--;
        }
        if (qVarC.f2766b == 0) {
            SparseArray<q.a> sparseArray = qVarC.f2765a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                q.a aVarValueAt = sparseArray.valueAt(i10);
                ArrayList<a0> arrayList = aVarValueAt.f2768a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    a0 a0Var = arrayList.get(i11);
                    i11++;
                    p4.a.a(a0Var.f2708a);
                }
                aVarValueAt.f2768a.clear();
            }
        }
        if (dVar4 != null) {
            qVarC.f2766b++;
        }
        rVar.e();
        this.f2675j0.f2802f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2671h) {
            this.N = null;
            this.L = null;
            this.M = null;
            this.K = null;
        }
        this.f2671h = z10;
        super.setClipToPadding(z10);
        if (this.f2700x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.I = hVar;
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f2698w = z10;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.O;
        if (iVar2 != null) {
            iVar2.e();
            this.O.f2731a = null;
        }
        this.O = iVar;
        if (iVar != null) {
            iVar.f2731a = this.f2684o0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        r rVar = this.f2661c;
        rVar.f2776e = i10;
        rVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(l lVar) {
        androidx.recyclerview.widget.o oVar;
        if (lVar == this.f2682n) {
            return;
        }
        setScrollState(0);
        z zVar = this.f2670g0;
        v.this.removeCallbacks(zVar);
        zVar.f2813c.abortAnimation();
        l lVar2 = this.f2682n;
        if (lVar2 != null && (oVar = lVar2.f2744e) != null) {
            oVar.f();
        }
        l lVar3 = this.f2682n;
        r rVar = this.f2661c;
        if (lVar3 != null) {
            i iVar = this.O;
            if (iVar != null) {
                iVar.e();
            }
            this.f2682n.i0(rVar);
            this.f2682n.j0(rVar);
            rVar.f2772a.clear();
            rVar.g();
            if (this.f2696v) {
                l lVar4 = this.f2682n;
                lVar4.f2746g = false;
                lVar4.S(this);
            }
            this.f2682n.v0(null);
            this.f2682n = null;
        } else {
            rVar.f2772a.clear();
            rVar.g();
        }
        androidx.recyclerview.widget.b bVar = this.f2667f;
        v vVar = bVar.f2512a.f2818a;
        bVar.f2513b.g();
        ArrayList arrayList = bVar.f2514c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0VarJ = J((View) arrayList.get(size));
            if (a0VarJ != null) {
                int i10 = a0VarJ.f2722o;
                if (vVar.M()) {
                    a0VarJ.f2723p = i10;
                    vVar.f2699w0.add(a0VarJ);
                } else {
                    View view = a0VarJ.f2708a;
                    Field field = q0.f33885a;
                    view.setImportantForAccessibility(i10);
                }
                a0VarJ.f2722o = 0;
            }
            arrayList.remove(size);
        }
        int childCount = vVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = vVar.getChildAt(i11);
            a0 a0VarJ2 = J(childAt);
            d dVar = vVar.f2680m;
            if (dVar != null && a0VarJ2 != null) {
                dVar.e(a0VarJ2);
            }
            childAt.clearAnimation();
        }
        vVar.removeAllViews();
        this.f2682n = lVar;
        if (lVar != null) {
            if (lVar.f2741b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(lVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(v5.a.a(lVar.f2741b, sb));
            }
            lVar.v0(this);
            if (this.f2696v) {
                l lVar5 = this.f2682n;
                lVar5.f2746g = true;
                lVar5.R(this);
            }
        }
        rVar.n();
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
    public void setNestedScrollingEnabled(boolean z10) {
        y3.q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f33883d) {
            ViewGroup viewGroup = scrollingChildHelper.f33882c;
            Field field = q0.f33885a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f33883d = z10;
    }

    public void setOnFlingListener(n nVar) {
        this.f2658a0 = nVar;
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.f2677k0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2668f0 = z10;
    }

    public void setRecycledViewPool(q qVar) {
        r rVar = this.f2661c;
        v vVar = v.this;
        rVar.f(vVar.f2680m, false);
        if (rVar.f2778g != null) {
            r2.f2766b--;
        }
        rVar.f2778g = qVar;
        if (qVar != null && vVar.getAdapter() != null) {
            rVar.f2778g.f2766b++;
        }
        rVar.e();
    }

    @Deprecated
    public void setRecyclerListener(s sVar) {
        this.f2685p = sVar;
    }

    public void setScrollState(int i10) {
        androidx.recyclerview.widget.o oVar;
        if (i10 == this.P) {
            return;
        }
        if (D0) {
            StringBuilder sbB = i0.b(i10, "setting scroll state to ", " from ");
            sbB.append(this.P);
            Log.d("RecyclerView", sbB.toString(), new Exception());
        }
        this.P = i10;
        if (i10 != 2) {
            z zVar = this.f2670g0;
            v.this.removeCallbacks(zVar);
            zVar.f2813c.abortAnimation();
            l lVar = this.f2682n;
            if (lVar != null && (oVar = lVar.f2744e) != null) {
                oVar.f();
            }
        }
        l lVar2 = this.f2682n;
        if (lVar2 != null) {
            lVar2.h0(i10);
        }
        p pVar = this.f2677k0;
        if (pVar != null) {
            pVar.a(this, i10);
        }
        ArrayList arrayList = this.f2679l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p) this.f2679l0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(y yVar) {
        this.f2661c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        androidx.recyclerview.widget.o oVar;
        if (z10 != this.A) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.A = false;
                if (this.f2704z && this.f2682n != null && this.f2680m != null) {
                    requestLayout();
                }
                this.f2704z = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0));
            this.A = true;
            this.B = true;
            setScrollState(0);
            z zVar = this.f2670g0;
            v.this.removeCallbacks(zVar);
            zVar.f2813c.abortAnimation();
            l lVar = this.f2682n;
            if (lVar == null || (oVar = lVar.f2744e) == null) {
                return;
            }
            oVar.f();
        }
    }

    public final void t(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        getScrollingChildHelper().d(i10, iArr, i11, i12, i13, iArr2, i14);
    }

    public final void u(int i10, int i11) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        p pVar = this.f2677k0;
        if (pVar != null) {
            pVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f2679l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p) this.f2679l0.get(size)).b(this, i10, i11);
            }
        }
        this.H--;
    }

    public final void v() {
        if (this.N != null) {
            return;
        }
        ((x) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f2671h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void w() {
        if (this.K != null) {
            return;
        }
        ((x) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.f2671h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.M != null) {
            return;
        }
        ((x) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.f2671h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.L != null) {
            return;
        }
        ((x) this.I).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.f2671h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.f2680m + ", layout:" + this.f2682n + ", context:" + getContext();
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public a0 f2761a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f2762b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2763c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2764d;

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2762b = new Rect();
            this.f2763c = true;
            this.f2764d = false;
        }

        public m(int i10, int i11) {
            super(i10, i11);
            this.f2762b = new Rect();
            this.f2763c = true;
            this.f2764d = false;
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2762b = new Rect();
            this.f2763c = true;
            this.f2764d = false;
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2762b = new Rect();
            this.f2763c = true;
            this.f2764d = false;
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
            this.f2762b = new Rect();
            this.f2763c = true;
            this.f2764d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f2682n;
        if (lVar != null) {
            return lVar.t(layoutParams);
        }
        throw new IllegalStateException(v5.a.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
