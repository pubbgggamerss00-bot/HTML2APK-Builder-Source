package u0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.fe2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.e;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f14552b;

    /* renamed from: a, reason: collision with root package name */
    public final l f14553a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends b {
        public c() {
        }

        @Override // u0.s0.e
        public void c(int i6, m0.b bVar) {
            this.f14559c.setInsets(n.a(i6), bVar.e());
        }

        public c(s0 s0Var) {
            super(s0Var);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends c {
        public d() {
        }

        @Override // u0.s0.c, u0.s0.e
        public void c(int i6, m0.b bVar) {
            this.f14559c.setInsets(o.a(i6), bVar.e());
        }

        public d(s0 s0Var) {
            super(s0Var);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final s0 f14560a;

        /* renamed from: b, reason: collision with root package name */
        public m0.b[] f14561b;

        public e() {
            this(new s0());
        }

        public final void a() {
            m0.b[] bVarArr = this.f14561b;
            if (bVarArr != null) {
                m0.b bVarF = bVarArr[0];
                m0.b bVarF2 = bVarArr[1];
                s0 s0Var = this.f14560a;
                if (bVarF2 == null) {
                    bVarF2 = s0Var.f14553a.f(2);
                }
                if (bVarF == null) {
                    bVarF = s0Var.f14553a.f(1);
                }
                g(m0.b.a(bVarF, bVarF2));
                m0.b bVar = this.f14561b[m.a(16)];
                if (bVar != null) {
                    f(bVar);
                }
                m0.b bVar2 = this.f14561b[m.a(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                m0.b bVar3 = this.f14561b[m.a(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        public s0 b() {
            throw null;
        }

        public void c(int i6, m0.b bVar) {
            if (this.f14561b == null) {
                this.f14561b = new m0.b[10];
            }
            for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    this.f14561b[m.a(i7)] = bVar;
                }
            }
        }

        public void e(m0.b bVar) {
            throw null;
        }

        public void g(m0.b bVar) {
            throw null;
        }

        public e(s0 s0Var) {
            this.f14560a = s0Var;
        }

        public void d(m0.b bVar) {
        }

        public void f(m0.b bVar) {
        }

        public void h(m0.b bVar) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f extends l {

        /* renamed from: i, reason: collision with root package name */
        public static boolean f14562i = false;

        /* renamed from: j, reason: collision with root package name */
        public static Method f14563j;

        /* renamed from: k, reason: collision with root package name */
        public static Class<?> f14564k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f14565l;

        /* renamed from: m, reason: collision with root package name */
        public static Field f14566m;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f14567c;

        /* renamed from: d, reason: collision with root package name */
        public m0.b[] f14568d;

        /* renamed from: e, reason: collision with root package name */
        public m0.b f14569e;

        /* renamed from: f, reason: collision with root package name */
        public s0 f14570f;

        /* renamed from: g, reason: collision with root package name */
        public m0.b f14571g;
        public int h;

        public f(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f14569e = null;
            this.f14567c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private m0.b t(int i6, boolean z6) {
            m0.b bVarA = m0.b.f13853e;
            for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                if ((i6 & i7) != 0) {
                    bVarA = m0.b.a(bVarA, u(i7, z6));
                }
            }
            return bVarA;
        }

        private m0.b v() {
            s0 s0Var = this.f14570f;
            return s0Var != null ? s0Var.f14553a.i() : m0.b.f13853e;
        }

        private m0.b w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f14562i) {
                x();
            }
            Method method = f14563j;
            if (method != null && f14564k != null && f14565l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f14565l.get(f14566m.get(objInvoke));
                    if (rect != null) {
                        return m0.b.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() throws ClassNotFoundException, SecurityException {
            try {
                f14563j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f14564k = cls;
                f14565l = cls.getDeclaredField("mVisibleInsets");
                f14566m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f14565l.setAccessible(true);
                f14566m.setAccessible(true);
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
            f14562i = true;
        }

        public static boolean z(int i6, int i7) {
            return (i6 & 6) == (i7 & 6);
        }

        @Override // u0.s0.l
        public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            m0.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = m0.b.f13853e;
            }
            y(bVarW);
        }

        @Override // u0.s0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            f fVar = (f) obj;
            return Objects.equals(this.f14571g, fVar.f14571g) && z(this.h, fVar.h);
        }

        @Override // u0.s0.l
        public m0.b f(int i6) {
            return t(i6, false);
        }

        @Override // u0.s0.l
        public m0.b g(int i6) {
            return t(i6, true);
        }

        @Override // u0.s0.l
        public final m0.b k() {
            if (this.f14569e == null) {
                WindowInsets windowInsets = this.f14567c;
                this.f14569e = m0.b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f14569e;
        }

        @Override // u0.s0.l
        public s0 m(int i6, int i7, int i8, int i9) {
            s0 s0VarG = s0.g(null, this.f14567c);
            int i10 = Build.VERSION.SDK_INT;
            e dVar = i10 >= 34 ? new d(s0VarG) : i10 >= 30 ? new c(s0VarG) : i10 >= 29 ? new b(s0VarG) : new a(s0VarG);
            dVar.g(s0.e(k(), i6, i7, i8, i9));
            dVar.e(s0.e(i(), i6, i7, i8, i9));
            return dVar.b();
        }

        @Override // u0.s0.l
        public boolean o() {
            return this.f14567c.isRound();
        }

        @Override // u0.s0.l
        public void p(m0.b[] bVarArr) {
            this.f14568d = bVarArr;
        }

        @Override // u0.s0.l
        public void q(s0 s0Var) {
            this.f14570f = s0Var;
        }

        @Override // u0.s0.l
        public void s(int i6) {
            this.h = i6;
        }

        public m0.b u(int i6, boolean z6) {
            m0.b bVarI;
            int i7;
            m0.b bVar = m0.b.f13853e;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 8) {
                        m0.b[] bVarArr = this.f14568d;
                        bVarI = bVarArr != null ? bVarArr[m.a(8)] : null;
                        if (bVarI != null) {
                            return bVarI;
                        }
                        m0.b bVarK = k();
                        m0.b bVarV = v();
                        int i8 = bVarK.f13857d;
                        if (i8 > bVarV.f13857d) {
                            return m0.b.c(0, 0, 0, i8);
                        }
                        m0.b bVar2 = this.f14571g;
                        if (bVar2 != null && !bVar2.equals(bVar) && (i7 = this.f14571g.f13857d) > bVarV.f13857d) {
                            return m0.b.c(0, 0, 0, i7);
                        }
                    } else {
                        if (i6 == 16) {
                            return j();
                        }
                        if (i6 == 32) {
                            return h();
                        }
                        if (i6 == 64) {
                            return l();
                        }
                        if (i6 == 128) {
                            s0 s0Var = this.f14570f;
                            u0.e eVarE = s0Var != null ? s0Var.f14553a.e() : e();
                            if (eVarE != null) {
                                int i9 = Build.VERSION.SDK_INT;
                                return m0.b.c(i9 >= 28 ? e.a.b(eVarE.f14475a) : 0, i9 >= 28 ? e.a.d(eVarE.f14475a) : 0, i9 >= 28 ? e.a.c(eVarE.f14475a) : 0, i9 >= 28 ? e.a.a(eVarE.f14475a) : 0);
                            }
                        }
                    }
                } else {
                    if (z6) {
                        m0.b bVarV2 = v();
                        m0.b bVarI2 = i();
                        return m0.b.c(Math.max(bVarV2.f13854a, bVarI2.f13854a), 0, Math.max(bVarV2.f13856c, bVarI2.f13856c), Math.max(bVarV2.f13857d, bVarI2.f13857d));
                    }
                    if ((this.h & 2) == 0) {
                        m0.b bVarK2 = k();
                        s0 s0Var2 = this.f14570f;
                        bVarI = s0Var2 != null ? s0Var2.f14553a.i() : null;
                        int iMin = bVarK2.f13857d;
                        if (bVarI != null) {
                            iMin = Math.min(iMin, bVarI.f13857d);
                        }
                        return m0.b.c(bVarK2.f13854a, 0, bVarK2.f13856c, iMin);
                    }
                }
            } else {
                if (z6) {
                    return m0.b.c(0, Math.max(v().f13855b, k().f13855b), 0, 0);
                }
                if ((this.h & 4) == 0) {
                    return m0.b.c(0, k().f13855b, 0, 0);
                }
            }
            return bVar;
        }

        public void y(m0.b bVar) {
            this.f14571g = bVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g extends f {

        /* renamed from: n, reason: collision with root package name */
        public m0.b f14572n;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f14572n = null;
        }

        @Override // u0.s0.l
        public s0 b() {
            return s0.g(null, this.f14567c.consumeStableInsets());
        }

        @Override // u0.s0.l
        public s0 c() {
            return s0.g(null, this.f14567c.consumeSystemWindowInsets());
        }

        @Override // u0.s0.l
        public final m0.b i() {
            if (this.f14572n == null) {
                WindowInsets windowInsets = this.f14567c;
                this.f14572n = m0.b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f14572n;
        }

        @Override // u0.s0.l
        public boolean n() {
            return this.f14567c.isConsumed();
        }

        @Override // u0.s0.l
        public void r(m0.b bVar) {
            this.f14572n = bVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h extends g {
        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // u0.s0.l
        public s0 a() {
            return s0.g(null, this.f14567c.consumeDisplayCutout());
        }

        @Override // u0.s0.l
        public u0.e e() {
            DisplayCutout displayCutout = this.f14567c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new u0.e(displayCutout);
        }

        @Override // u0.s0.f, u0.s0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f14567c, hVar.f14567c) && Objects.equals(this.f14571g, hVar.f14571g) && f.z(this.h, hVar.h);
        }

        @Override // u0.s0.l
        public int hashCode() {
            return this.f14567c.hashCode();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class k extends j {
        public static final s0 s = s0.g(null, WindowInsets.CONSUMED);

        public k(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // u0.s0.j, u0.s0.f, u0.s0.l
        public m0.b f(int i6) {
            return m0.b.d(this.f14567c.getInsets(o.a(i6)));
        }

        @Override // u0.s0.j, u0.s0.f, u0.s0.l
        public m0.b g(int i6) {
            return m0.b.d(this.f14567c.getInsetsIgnoringVisibility(o.a(i6)));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class m {
        public static int a(int i6) {
            if (i6 == 1) {
                return 0;
            }
            if (i6 == 2) {
                return 1;
            }
            if (i6 == 4) {
                return 2;
            }
            if (i6 == 8) {
                return 3;
            }
            if (i6 == 16) {
                return 4;
            }
            if (i6 == 32) {
                return 5;
            }
            if (i6 == 64) {
                return 6;
            }
            if (i6 == 128) {
                return 7;
            }
            if (i6 == 256) {
                return 8;
            }
            if (i6 == 512) {
                return 9;
            }
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class n {
        public static int a(int i6) {
            int iStatusBars;
            int i7 = 0;
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i6 & i8) != 0) {
                    if (i8 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i8 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i8 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i8 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i8 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i8 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i8 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i8 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i7 |= iStatusBars;
                }
            }
            return i7;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class o {
        public static int a(int i6) {
            int iStatusBars;
            int i7 = 0;
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i6 & i8) != 0) {
                    if (i8 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i8 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i8 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i8 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i8 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i8 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i8 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i8 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i8 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i7 |= iStatusBars;
                }
            }
            return i7;
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            f14552b = k.s;
        } else if (i6 >= 30) {
            f14552b = j.f14576r;
        } else {
            f14552b = l.f14577b;
        }
    }

    public s0(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            this.f14553a = new k(this, windowInsets);
            return;
        }
        if (i6 >= 30) {
            this.f14553a = new j(this, windowInsets);
            return;
        }
        if (i6 >= 29) {
            this.f14553a = new i(this, windowInsets);
        } else if (i6 >= 28) {
            this.f14553a = new h(this, windowInsets);
        } else {
            this.f14553a = new g(this, windowInsets);
        }
    }

    public static m0.b e(m0.b bVar, int i6, int i7, int i8, int i9) {
        int iMax = Math.max(0, bVar.f13854a - i6);
        int iMax2 = Math.max(0, bVar.f13855b - i7);
        int iMax3 = Math.max(0, bVar.f13856c - i8);
        int iMax4 = Math.max(0, bVar.f13857d - i9);
        return (iMax == i6 && iMax2 == i7 && iMax3 == i8 && iMax4 == i9) ? bVar : m0.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static s0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        s0 s0Var = new s0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            s0 s0VarA = f0.e.a(view);
            l lVar = s0Var.f14553a;
            lVar.q(s0VarA);
            lVar.d(view.getRootView());
            lVar.s(view.getWindowSystemUiVisibility());
        }
        return s0Var;
    }

    @Deprecated
    public final int a() {
        return this.f14553a.k().f13857d;
    }

    @Deprecated
    public final int b() {
        return this.f14553a.k().f13854a;
    }

    @Deprecated
    public final int c() {
        return this.f14553a.k().f13856c;
    }

    @Deprecated
    public final int d() {
        return this.f14553a.k().f13855b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return Objects.equals(this.f14553a, ((s0) obj).f14553a);
        }
        return false;
    }

    public final WindowInsets f() {
        l lVar = this.f14553a;
        if (lVar instanceof f) {
            return ((f) lVar).f14567c;
        }
        return null;
    }

    public final int hashCode() {
        l lVar = this.f14553a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends e {

        /* renamed from: e, reason: collision with root package name */
        public static Field f14554e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f14555f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f14556g = null;
        public static boolean h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f14557c;

        /* renamed from: d, reason: collision with root package name */
        public m0.b f14558d;

        public a() {
            this.f14557c = i();
        }

        private static WindowInsets i() {
            if (!f14555f) {
                try {
                    f14554e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
                }
                f14555f = true;
            }
            Field field = f14554e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
                }
            }
            if (!h) {
                try {
                    f14556g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = f14556g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
                }
            }
            return null;
        }

        @Override // u0.s0.e
        public s0 b() {
            a();
            s0 s0VarG = s0.g(null, this.f14557c);
            m0.b[] bVarArr = this.f14561b;
            l lVar = s0VarG.f14553a;
            lVar.p(bVarArr);
            lVar.r(this.f14558d);
            return s0VarG;
        }

        @Override // u0.s0.e
        public void e(m0.b bVar) {
            this.f14558d = bVar;
        }

        @Override // u0.s0.e
        public void g(m0.b bVar) {
            WindowInsets windowInsets = this.f14557c;
            if (windowInsets != null) {
                this.f14557c = windowInsets.replaceSystemWindowInsets(bVar.f13854a, bVar.f13855b, bVar.f13856c, bVar.f13857d);
            }
        }

        public a(s0 s0Var) {
            super(s0Var);
            this.f14557c = s0Var.f();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f14559c;

        public b() {
            this.f14559c = androidx.activity.y.f();
        }

        @Override // u0.s0.e
        public s0 b() {
            a();
            s0 s0VarG = s0.g(null, this.f14559c.build());
            s0VarG.f14553a.p(this.f14561b);
            return s0VarG;
        }

        @Override // u0.s0.e
        public void d(m0.b bVar) {
            this.f14559c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // u0.s0.e
        public void e(m0.b bVar) {
            this.f14559c.setStableInsets(bVar.e());
        }

        @Override // u0.s0.e
        public void f(m0.b bVar) {
            this.f14559c.setSystemGestureInsets(bVar.e());
        }

        @Override // u0.s0.e
        public void g(m0.b bVar) {
            this.f14559c.setSystemWindowInsets(bVar.e());
        }

        @Override // u0.s0.e
        public void h(m0.b bVar) {
            this.f14559c.setTappableElementInsets(bVar.e());
        }

        public b(s0 s0Var) {
            WindowInsets.Builder builderF;
            super(s0Var);
            WindowInsets windowInsetsF = s0Var.f();
            if (windowInsetsF != null) {
                builderF = fe2.c(windowInsetsF);
            } else {
                builderF = androidx.activity.y.f();
            }
            this.f14559c = builderF;
        }
    }

    public s0() {
        this.f14553a = new l(this);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i extends h {

        /* renamed from: o, reason: collision with root package name */
        public m0.b f14573o;

        /* renamed from: p, reason: collision with root package name */
        public m0.b f14574p;

        /* renamed from: q, reason: collision with root package name */
        public m0.b f14575q;

        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f14573o = null;
            this.f14574p = null;
            this.f14575q = null;
        }

        @Override // u0.s0.l
        public m0.b h() {
            if (this.f14574p == null) {
                this.f14574p = m0.b.d(this.f14567c.getMandatorySystemGestureInsets());
            }
            return this.f14574p;
        }

        @Override // u0.s0.l
        public m0.b j() {
            if (this.f14573o == null) {
                this.f14573o = m0.b.d(this.f14567c.getSystemGestureInsets());
            }
            return this.f14573o;
        }

        @Override // u0.s0.l
        public m0.b l() {
            if (this.f14575q == null) {
                this.f14575q = m0.b.d(this.f14567c.getTappableElementInsets());
            }
            return this.f14575q;
        }

        @Override // u0.s0.f, u0.s0.l
        public s0 m(int i6, int i7, int i8, int i9) {
            return s0.g(null, this.f14567c.inset(i6, i7, i8, i9));
        }

        @Override // u0.s0.g, u0.s0.l
        public void r(m0.b bVar) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class j extends i {

        /* renamed from: r, reason: collision with root package name */
        public static final s0 f14576r = s0.g(null, WindowInsets.CONSUMED);

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // u0.s0.f, u0.s0.l
        public m0.b f(int i6) {
            return m0.b.d(this.f14567c.getInsets(n.a(i6)));
        }

        @Override // u0.s0.f, u0.s0.l
        public m0.b g(int i6) {
            return m0.b.d(this.f14567c.getInsetsIgnoringVisibility(n.a(i6)));
        }

        @Override // u0.s0.f, u0.s0.l
        public final void d(View view) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        public static final s0 f14577b;

        /* renamed from: a, reason: collision with root package name */
        public final s0 f14578a;

        static {
            int i6 = Build.VERSION.SDK_INT;
            f14577b = (i6 >= 34 ? new d() : i6 >= 30 ? new c() : i6 >= 29 ? new b() : new a()).b().f14553a.a().f14553a.b().f14553a.c();
        }

        public l(s0 s0Var) {
            this.f14578a = s0Var;
        }

        public s0 a() {
            return this.f14578a;
        }

        public s0 b() {
            return this.f14578a;
        }

        public s0 c() {
            return this.f14578a;
        }

        public u0.e e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && Objects.equals(k(), lVar.k()) && Objects.equals(i(), lVar.i()) && Objects.equals(e(), lVar.e());
        }

        public m0.b f(int i6) {
            return m0.b.f13853e;
        }

        public m0.b g(int i6) {
            if ((i6 & 8) == 0) {
                return m0.b.f13853e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public m0.b h() {
            return k();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
        }

        public m0.b i() {
            return m0.b.f13853e;
        }

        public m0.b j() {
            return k();
        }

        public m0.b k() {
            return m0.b.f13853e;
        }

        public m0.b l() {
            return k();
        }

        public s0 m(int i6, int i7, int i8, int i9) {
            return f14577b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void d(View view) {
        }

        public void p(m0.b[] bVarArr) {
        }

        public void q(s0 s0Var) {
        }

        public void r(m0.b bVar) {
        }

        public void s(int i6) {
        }
    }
}
