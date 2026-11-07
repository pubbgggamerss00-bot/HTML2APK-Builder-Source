package y3;

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
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import y3.i1;
import y3.q0;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public e f33904a;

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public i1 f33907a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33908b;

        public b(int i10) {
            this.f33908b = i10;
        }

        public void a(x0 x0Var) {
        }

        public void b() {
        }

        public abstract i1 d(i1 i1Var, List<x0> list);

        public abstract a e(a aVar);
    }

    public static class c extends e {

        /* renamed from: d, reason: collision with root package name */
        public static final PathInterpolator f33909d = new PathInterpolator(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);

        /* renamed from: e, reason: collision with root package name */
        public static final g5.a f33910e = new g5.a();

        /* renamed from: f, reason: collision with root package name */
        public static final DecelerateInterpolator f33911f = new DecelerateInterpolator(1.5f);

        /* renamed from: g, reason: collision with root package name */
        public static final AccelerateInterpolator f33912g = new AccelerateInterpolator(1.5f);

        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f33913a;

            /* renamed from: b, reason: collision with root package name */
            public i1 f33914b;

            /* renamed from: y3.x0$c$a$a, reason: collision with other inner class name */
            public class C0342a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x0 f33915a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i1 f33916b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i1 f33917c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f33918d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f33919e;

                public C0342a(x0 x0Var, i1 i1Var, i1 i1Var2, int i10, View view) {
                    this.f33915a = x0Var;
                    this.f33916b = i1Var;
                    this.f33917c = i1Var2;
                    this.f33918d = i10;
                    this.f33919e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    x0 x0Var = this.f33915a;
                    e eVar = x0Var.f33904a;
                    eVar.c(animatedFraction);
                    i1 i1Var = this.f33916b;
                    i1.q qVar = i1Var.f33825a;
                    float fB = eVar.b();
                    PathInterpolator pathInterpolator = c.f33909d;
                    int i10 = Build.VERSION.SDK_INT;
                    i1.h gVar = i10 >= 36 ? new i1.g(i1Var) : i10 >= 35 ? new i1.f(i1Var) : i10 >= 34 ? new i1.e(i1Var) : i10 >= 31 ? new i1.d(i1Var) : i10 >= 30 ? new i1.c(i1Var) : i10 >= 29 ? new i1.b(i1Var) : new i1.a(i1Var);
                    for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                        if ((this.f33918d & i11) == 0) {
                            gVar.d(i11, qVar.i(i11));
                        } else {
                            r3.f fVarI = qVar.i(i11);
                            r3.f fVarI2 = this.f33917c.f33825a.i(i11);
                            float f10 = 1.0f - fB;
                            gVar.d(i11, i1.a(fVarI, (int) (((fVarI.f23163a - fVarI2.f23163a) * f10) + 0.5d), (int) (((fVarI.f23164b - fVarI2.f23164b) * f10) + 0.5d), (int) (((fVarI.f23165c - fVarI2.f23165c) * f10) + 0.5d), (int) (((fVarI.f23166d - fVarI2.f23166d) * f10) + 0.5d)));
                        }
                    }
                    c.f(this.f33919e, gVar.b(), Collections.singletonList(x0Var));
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x0 f33920a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f33921b;

                public b(View view, x0 x0Var) {
                    this.f33920a = x0Var;
                    this.f33921b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    x0 x0Var = this.f33920a;
                    x0Var.f33904a.c(1.0f);
                    c.d(this.f33921b, x0Var);
                }
            }

            /* renamed from: y3.x0$c$a$c, reason: collision with other inner class name */
            public class RunnableC0343c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f33922a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x0 f33923b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f33924c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f33925d;

                public RunnableC0343c(View view, x0 x0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f33922a = view;
                    this.f33923b = x0Var;
                    this.f33924c = aVar;
                    this.f33925d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.g(this.f33922a, this.f33923b, this.f33924c);
                    this.f33925d.start();
                }
            }

            public a(View view, b bVar) {
                i1 i1VarB;
                this.f33913a = bVar;
                Field field = q0.f33885a;
                i1 i1VarA = q0.d.a(view);
                if (i1VarA != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    i1VarB = (i10 >= 36 ? new i1.g(i1VarA) : i10 >= 35 ? new i1.f(i1VarA) : i10 >= 34 ? new i1.e(i1VarA) : i10 >= 31 ? new i1.d(i1VarA) : i10 >= 30 ? new i1.c(i1VarA) : i10 >= 29 ? new i1.b(i1VarA) : new i1.a(i1VarA)).b();
                } else {
                    i1VarB = null;
                }
                this.f33914b = i1VarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int[] iArr;
                boolean z10;
                if (!view.isLaidOut()) {
                    this.f33914b = i1.c(windowInsets, view);
                    PathInterpolator pathInterpolator = c.f33909d;
                    return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
                }
                i1 i1VarC = i1.c(windowInsets, view);
                i1.q qVar = i1VarC.f33825a;
                if (this.f33914b == null) {
                    Field field = q0.f33885a;
                    this.f33914b = q0.d.a(view);
                }
                if (this.f33914b == null) {
                    this.f33914b = i1VarC;
                    PathInterpolator pathInterpolator2 = c.f33909d;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    b bVarH = c.h(view);
                    if (bVarH == null || !Objects.equals(bVarH.f33907a, i1VarC)) {
                        int[] iArr2 = new int[1];
                        int[] iArr3 = new int[1];
                        i1 i1Var = this.f33914b;
                        int i10 = 1;
                        while (i10 <= 512) {
                            r3.f fVarI = qVar.i(i10);
                            r3.f fVarI2 = i1Var.f33825a.i(i10);
                            int i11 = fVarI.f23163a;
                            int i12 = fVarI.f23166d;
                            int i13 = fVarI.f23165c;
                            int i14 = fVarI.f23164b;
                            int i15 = fVarI2.f23163a;
                            int i16 = fVarI2.f23166d;
                            int[] iArr4 = iArr2;
                            int i17 = fVarI2.f23165c;
                            int i18 = fVarI2.f23164b;
                            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                                iArr = iArr3;
                                z10 = true;
                            } else {
                                iArr = iArr3;
                                z10 = false;
                            }
                            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                                if (z10) {
                                    iArr4[0] = iArr4[0] | i10;
                                } else {
                                    iArr[0] = iArr[0] | i10;
                                }
                            }
                            i10 <<= 1;
                            iArr2 = iArr4;
                            iArr3 = iArr;
                        }
                        int i19 = iArr2[0];
                        int i20 = iArr3[0];
                        int i21 = i19 | i20;
                        if (i21 == 0) {
                            this.f33914b = i1VarC;
                            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                                return view.onApplyWindowInsets(windowInsets);
                            }
                        } else {
                            i1 i1Var2 = this.f33914b;
                            x0 x0Var = new x0(i21, (i19 & 8) != 0 ? c.f33909d : (i20 & 8) != 0 ? c.f33910e : (i19 & 519) != 0 ? c.f33911f : (i20 & 519) != 0 ? c.f33912g : null, (i21 & 8) != 0 ? 160L : 250L);
                            x0Var.f33904a.c(CropImageView.DEFAULT_ASPECT_RATIO);
                            ValueAnimator duration = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f).setDuration(x0Var.f33904a.a());
                            r3.f fVarI3 = qVar.i(i21);
                            r3.f fVarI4 = i1Var2.f33825a.i(i21);
                            int iMin = Math.min(fVarI3.f23163a, fVarI4.f23163a);
                            int i22 = fVarI3.f23164b;
                            int i23 = fVarI4.f23164b;
                            int iMin2 = Math.min(i22, i23);
                            int i24 = fVarI3.f23165c;
                            int i25 = fVarI4.f23165c;
                            int iMin3 = Math.min(i24, i25);
                            int i26 = fVarI3.f23166d;
                            int i27 = fVarI4.f23166d;
                            a aVar = new a(r3.f.b(iMin, iMin2, iMin3, Math.min(i26, i27)), r3.f.b(Math.max(fVarI3.f23163a, fVarI4.f23163a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
                            c.e(view, x0Var, i1VarC, false);
                            duration.addUpdateListener(new C0342a(x0Var, i1VarC, i1Var2, i21, view));
                            duration.addListener(new b(view, x0Var));
                            x.a(view, new RunnableC0343c(view, x0Var, aVar, duration));
                            this.f33914b = i1VarC;
                            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                                return view.onApplyWindowInsets(windowInsets);
                            }
                        }
                    } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
                return windowInsets;
            }
        }

        public static void d(View view, x0 x0Var) {
            b bVarH = h(view);
            if (bVarH != null) {
                bVarH.a(x0Var);
                if (bVarH.f33908b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    d(viewGroup.getChildAt(i10), x0Var);
                }
            }
        }

        public static void e(View view, x0 x0Var, i1 i1Var, boolean z10) {
            b bVarH = h(view);
            if (bVarH != null) {
                bVarH.f33907a = i1Var;
                if (!z10) {
                    bVarH.b();
                    z10 = bVarH.f33908b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), x0Var, i1Var, z10);
                }
            }
        }

        public static void f(View view, i1 i1Var, List<x0> list) {
            b bVarH = h(view);
            if (bVarH != null) {
                i1Var = bVarH.d(i1Var, list);
                if (bVarH.f33908b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), i1Var, list);
                }
            }
        }

        public static void g(View view, x0 x0Var, a aVar) {
            b bVarH = h(view);
            if (bVarH != null) {
                bVarH.e(aVar);
                if (bVarH.f33908b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), x0Var, aVar);
                }
            }
        }

        public static b h(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f33913a;
            }
            return null;
        }
    }

    public static class d extends e {

        /* renamed from: d, reason: collision with root package name */
        public final WindowInsetsAnimation f33926d;

        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f33927a;

            /* renamed from: b, reason: collision with root package name */
            public List<x0> f33928b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList<x0> f33929c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, x0> f33930d;

            public a(b bVar) {
                super(bVar.f33908b);
                this.f33930d = new HashMap<>();
                this.f33927a = bVar;
            }

            public final x0 a(WindowInsetsAnimation windowInsetsAnimation) {
                x0 x0Var = this.f33930d.get(windowInsetsAnimation);
                if (x0Var != null) {
                    return x0Var;
                }
                x0 x0Var2 = new x0(0, null, 0L);
                x0Var2.f33904a = new d(windowInsetsAnimation);
                this.f33930d.put(windowInsetsAnimation, x0Var2);
                return x0Var2;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f33927a.a(a(windowInsetsAnimation));
                this.f33930d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                a(windowInsetsAnimation);
                this.f33927a.b();
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<x0> arrayList = this.f33929c;
                if (arrayList == null) {
                    ArrayList<x0> arrayList2 = new ArrayList<>(list.size());
                    this.f33929c = arrayList2;
                    this.f33928b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = g1.a(list.get(size));
                    x0 x0VarA = a(windowInsetsAnimationA);
                    x0VarA.f33904a.c(windowInsetsAnimationA.getFraction());
                    this.f33929c.add(x0VarA);
                }
                return this.f33927a.d(i1.c(windowInsets, null), this.f33928b).b();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a(windowInsetsAnimation);
                a aVarE = this.f33927a.e(new a(bounds));
                aVarE.getClass();
                f1.a();
                return e1.a(aVarE.f33905a.d(), aVarE.f33906b.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f33926d = windowInsetsAnimation;
        }

        @Override // y3.x0.e
        public final long a() {
            return this.f33926d.getDurationMillis();
        }

        @Override // y3.x0.e
        public final float b() {
            return this.f33926d.getInterpolatedFraction();
        }

        @Override // y3.x0.e
        public final void c(float f10) {
            this.f33926d.setFraction(f10);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f33931a;

        /* renamed from: b, reason: collision with root package name */
        public final Interpolator f33932b;

        /* renamed from: c, reason: collision with root package name */
        public final long f33933c;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f33932b = interpolator;
            this.f33933c = j10;
        }

        public long a() {
            return this.f33933c;
        }

        public float b() {
            Interpolator interpolator = this.f33932b;
            return interpolator != null ? interpolator.getInterpolation(this.f33931a) : this.f33931a;
        }

        public void c(float f10) {
            this.f33931a = f10;
        }
    }

    public x0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f33904a = new d(d1.a(i10, interpolator, j10));
        } else {
            this.f33904a = new c(i10, interpolator, j10);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r3.f f33905a;

        /* renamed from: b, reason: collision with root package name */
        public final r3.f f33906b;

        public a(r3.f fVar, r3.f fVar2) {
            this.f33905a = fVar;
            this.f33906b = fVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f33905a + " upper=" + this.f33906b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f33905a = r3.f.c(bounds.getLowerBound());
            this.f33906b = r3.f.c(bounds.getUpperBound());
        }
    }
}
