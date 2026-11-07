package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.ads.nu0;
import com.google.android.gms.internal.ads.t71;
import com.google.android.gms.internal.ads.u71;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.f0;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public e f14524a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public s0 f14527a;

        public abstract void a(r0 r0Var);

        public abstract void b(r0 r0Var);

        public abstract s0 c(s0 s0Var, List<r0> list);

        public abstract a d(r0 r0Var, a aVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f14528e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final j1.a f14529f = new j1.a();

        /* renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f14530g = new DecelerateInterpolator(1.5f);
        public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f14531a;

            /* renamed from: b, reason: collision with root package name */
            public s0 f14532b;

            /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
            /* renamed from: u0.r0$c$a$a, reason: collision with other inner class name */
            public class C0095a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r0 f14533a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f14534b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s0 f14535c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f14536d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f14537e;

                public C0095a(r0 r0Var, s0 s0Var, s0 s0Var2, int i6, View view) {
                    this.f14533a = r0Var;
                    this.f14534b = s0Var;
                    this.f14535c = s0Var2;
                    this.f14536d = i6;
                    this.f14537e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    r0 r0Var = this.f14533a;
                    e eVar = r0Var.f14524a;
                    eVar.e(animatedFraction);
                    s0 s0Var = this.f14534b;
                    s0.l lVar = s0Var.f14553a;
                    float fC = eVar.c();
                    PathInterpolator pathInterpolator = c.f14528e;
                    int i6 = Build.VERSION.SDK_INT;
                    s0.e dVar = i6 >= 34 ? new s0.d(s0Var) : i6 >= 30 ? new s0.c(s0Var) : i6 >= 29 ? new s0.b(s0Var) : new s0.a(s0Var);
                    for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                        if ((this.f14536d & i7) == 0) {
                            dVar.c(i7, lVar.f(i7));
                        } else {
                            m0.b bVarF = lVar.f(i7);
                            m0.b bVarF2 = this.f14535c.f14553a.f(i7);
                            float f6 = 1.0f - fC;
                            dVar.c(i7, s0.e(bVarF, (int) (((bVarF.f13854a - bVarF2.f13854a) * f6) + 0.5d), (int) (((bVarF.f13855b - bVarF2.f13855b) * f6) + 0.5d), (int) (((bVarF.f13856c - bVarF2.f13856c) * f6) + 0.5d), (int) (((bVarF.f13857d - bVarF2.f13857d) * f6) + 0.5d)));
                        }
                    }
                    c.h(this.f14537e, dVar.b(), Collections.singletonList(r0Var));
                }
            }

            /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r0 f14538a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f14539b;

                public b(View view, r0 r0Var) {
                    this.f14538a = r0Var;
                    this.f14539b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    r0 r0Var = this.f14538a;
                    r0Var.f14524a.e(1.0f);
                    c.f(this.f14539b, r0Var);
                }
            }

            /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
            /* renamed from: u0.r0$c$a$c, reason: collision with other inner class name */
            public class RunnableC0096c implements Runnable {
                public final /* synthetic */ View s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r0 f14540t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ a f14541u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f14542v;

                public RunnableC0096c(View view, r0 r0Var, a aVar, ValueAnimator valueAnimator) {
                    this.s = view;
                    this.f14540t = r0Var;
                    this.f14541u = aVar;
                    this.f14542v = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.s, this.f14540t, this.f14541u);
                    this.f14542v.start();
                }
            }

            public a(View view, b bVar) {
                s0 s0VarB;
                this.f14531a = bVar;
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                s0 s0VarA = f0.e.a(view);
                if (s0VarA != null) {
                    int i6 = Build.VERSION.SDK_INT;
                    s0VarB = (i6 >= 34 ? new s0.d(s0VarA) : i6 >= 30 ? new s0.c(s0VarA) : i6 >= 29 ? new s0.b(s0VarA) : new s0.a(s0VarA)).b();
                } else {
                    s0VarB = null;
                }
                this.f14532b = s0VarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int[] iArr;
                boolean z6;
                if (!view.isLaidOut()) {
                    this.f14532b = s0.g(view, windowInsets);
                    return c.j(view, windowInsets);
                }
                s0 s0VarG = s0.g(view, windowInsets);
                s0.l lVar = s0VarG.f14553a;
                if (this.f14532b == null) {
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    this.f14532b = f0.e.a(view);
                }
                if (this.f14532b == null) {
                    this.f14532b = s0VarG;
                    return c.j(view, windowInsets);
                }
                b bVarK = c.k(view);
                if (bVarK != null && Objects.equals(bVarK.f14527a, s0VarG)) {
                    return c.j(view, windowInsets);
                }
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                s0 s0Var = this.f14532b;
                int i6 = 1;
                while (i6 <= 512) {
                    m0.b bVarF = lVar.f(i6);
                    m0.b bVarF2 = s0Var.f14553a.f(i6);
                    int i7 = bVarF.f13854a;
                    int i8 = bVarF.f13857d;
                    int i9 = bVarF.f13856c;
                    int i10 = bVarF.f13855b;
                    int i11 = bVarF2.f13854a;
                    int i12 = bVarF2.f13857d;
                    int i13 = bVarF2.f13856c;
                    int i14 = bVarF2.f13855b;
                    if (i7 > i11 || i10 > i14 || i9 > i13 || i8 > i12) {
                        iArr = iArr2;
                        z6 = true;
                    } else {
                        iArr = iArr2;
                        z6 = false;
                    }
                    if (z6 != (i7 < i11 || i10 < i14 || i9 < i13 || i8 < i12)) {
                        if (z6) {
                            iArr[0] = iArr[0] | i6;
                        } else {
                            iArr3[0] = iArr3[0] | i6;
                        }
                    }
                    i6 <<= 1;
                    iArr2 = iArr;
                }
                int i15 = iArr2[0];
                int i16 = iArr3[0];
                int i17 = i15 | i16;
                if (i17 == 0) {
                    this.f14532b = s0VarG;
                    return c.j(view, windowInsets);
                }
                s0 s0Var2 = this.f14532b;
                r0 r0Var = new r0(i17, (i15 & 8) != 0 ? c.f14528e : (i16 & 8) != 0 ? c.f14529f : (i15 & 519) != 0 ? c.f14530g : (i16 & 519) != 0 ? c.h : null, (i17 & 8) != 0 ? 160L : 250L);
                r0Var.f14524a.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(r0Var.f14524a.b());
                m0.b bVarF3 = lVar.f(i17);
                m0.b bVarF4 = s0Var2.f14553a.f(i17);
                int iMin = Math.min(bVarF3.f13854a, bVarF4.f13854a);
                int i18 = bVarF3.f13855b;
                int i19 = bVarF4.f13855b;
                int iMin2 = Math.min(i18, i19);
                int i20 = bVarF3.f13856c;
                int i21 = bVarF4.f13856c;
                int iMin3 = Math.min(i20, i21);
                int i22 = bVarF3.f13857d;
                int i23 = bVarF4.f13857d;
                a aVar = new a(m0.b.c(iMin, iMin2, iMin3, Math.min(i22, i23)), m0.b.c(Math.max(bVarF3.f13854a, bVarF4.f13854a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)));
                c.g(view, r0Var, s0VarG, false);
                duration.addUpdateListener(new C0095a(r0Var, s0VarG, s0Var2, i17, view));
                duration.addListener(new b(view, r0Var));
                u.a(view, new RunnableC0096c(view, r0Var, aVar, duration));
                this.f14532b = s0VarG;
                return c.j(view, windowInsets);
            }
        }

        public static void f(View view, r0 r0Var) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.a(r0Var);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    f(viewGroup.getChildAt(i6), r0Var);
                }
            }
        }

        public static void g(View view, r0 r0Var, s0 s0Var, boolean z6) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.f14527a = s0Var;
                if (!z6) {
                    bVarK.b(r0Var);
                    z6 = true;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    g(viewGroup.getChildAt(i6), r0Var, s0Var, z6);
                }
            }
        }

        public static void h(View view, s0 s0Var, List<r0> list) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.c(s0Var, list);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    h(viewGroup.getChildAt(i6), s0Var, list);
                }
            }
        }

        public static void i(View view, r0 r0Var, a aVar) {
            b bVarK = k(view);
            if (bVarK != null) {
                bVarK.d(r0Var, aVar);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    i(viewGroup.getChildAt(i6), r0Var, aVar);
                }
            }
        }

        public static WindowInsets j(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f14531a;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f14543e;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f14544a;

            /* renamed from: b, reason: collision with root package name */
            public List<r0> f14545b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList<r0> f14546c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, r0> f14547d;

            public a(b bVar) {
                super(0);
                this.f14547d = new HashMap<>();
                this.f14544a = bVar;
            }

            public final r0 a(WindowInsetsAnimation windowInsetsAnimation) {
                r0 r0Var = this.f14547d.get(windowInsetsAnimation);
                if (r0Var == null) {
                    r0Var = new r0(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        r0Var.f14524a = new d(windowInsetsAnimation);
                    }
                    this.f14547d.put(windowInsetsAnimation, r0Var);
                }
                return r0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f14544a.a(a(windowInsetsAnimation));
                this.f14547d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f14544a.b(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<r0> arrayList = this.f14546c;
                if (arrayList == null) {
                    ArrayList<r0> arrayList2 = new ArrayList<>(list.size());
                    this.f14546c = arrayList2;
                    this.f14545b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationD = nu0.d(list.get(size));
                    r0 r0VarA = a(windowInsetsAnimationD);
                    r0VarA.f14524a.e(windowInsetsAnimationD.getFraction());
                    this.f14546c.add(r0VarA);
                }
                return this.f14544a.c(s0.g(null, windowInsets), this.f14545b).f();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a aVarD = this.f14544a.d(a(windowInsetsAnimation), new a(bounds));
                aVarD.getClass();
                u71.g();
                return com.google.android.gms.internal.ads.k.d(aVarD.f14525a.e(), aVarD.f14526b.e());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f14543e = windowInsetsAnimation;
        }

        @Override // u0.r0.e
        public final float a() {
            return this.f14543e.getAlpha();
        }

        @Override // u0.r0.e
        public final long b() {
            return this.f14543e.getDurationMillis();
        }

        @Override // u0.r0.e
        public final float c() {
            return this.f14543e.getInterpolatedFraction();
        }

        @Override // u0.r0.e
        public final int d() {
            return this.f14543e.getTypeMask();
        }

        @Override // u0.r0.e
        public final void e(float f6) {
            this.f14543e.setFraction(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f14548a;

        /* renamed from: b, reason: collision with root package name */
        public float f14549b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f14550c;

        /* renamed from: d, reason: collision with root package name */
        public final long f14551d;

        public e(int i6, Interpolator interpolator, long j6) {
            this.f14548a = i6;
            this.f14550c = interpolator;
            this.f14551d = j6;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.f14551d;
        }

        public float c() {
            Interpolator interpolator = this.f14550c;
            return interpolator != null ? interpolator.getInterpolation(this.f14549b) : this.f14549b;
        }

        public int d() {
            return this.f14548a;
        }

        public void e(float f6) {
            this.f14549b = f6;
        }
    }

    public r0(int i6, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f14524a = new d(t71.c(i6, interpolator, j6));
        } else {
            this.f14524a = new c(i6, interpolator, j6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m0.b f14525a;

        /* renamed from: b, reason: collision with root package name */
        public final m0.b f14526b;

        public a(m0.b bVar, m0.b bVar2) {
            this.f14525a = bVar;
            this.f14526b = bVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f14525a + " upper=" + this.f14526b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f14525a = m0.b.d(bounds.getLowerBound());
            this.f14526b = m0.b.d(bounds.getUpperBound());
        }
    }
}
