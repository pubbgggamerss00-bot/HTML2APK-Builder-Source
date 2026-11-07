package g;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.htmltoapk.template.R;
import g.a;
import g.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.g0;
import u0.f0;
import u0.n0;
import u0.p0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s extends g.a implements ActionBarOverlayLayout.d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f13172y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f13173z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f13174a;

    /* renamed from: b, reason: collision with root package name */
    public Context f13175b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f13176c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f13177d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f13178e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f13179f;

    /* renamed from: g, reason: collision with root package name */
    public final View f13180g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public d f13181i;

    /* renamed from: j, reason: collision with root package name */
    public d f13182j;

    /* renamed from: k, reason: collision with root package name */
    public g.c f13183k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13184l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<a.b> f13185m;

    /* renamed from: n, reason: collision with root package name */
    public int f13186n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13187o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13188p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13189q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13190r;
    public j.g s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13191t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13192u;

    /* renamed from: v, reason: collision with root package name */
    public final a f13193v;

    /* renamed from: w, reason: collision with root package name */
    public final b f13194w;

    /* renamed from: x, reason: collision with root package name */
    public final c f13195x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f5.b {
        public a() {
        }

        @Override // u0.o0
        public final void a() {
            View view;
            s sVar = s.this;
            if (sVar.f13187o && (view = sVar.f13180g) != null) {
                view.setTranslationY(0.0f);
                sVar.f13177d.setTranslationY(0.0f);
            }
            sVar.f13177d.setVisibility(8);
            sVar.f13177d.setTransitioning(false);
            sVar.s = null;
            g.c cVar = sVar.f13183k;
            if (cVar != null) {
                cVar.a(sVar.f13182j);
                sVar.f13182j = null;
                sVar.f13183k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = sVar.f13176c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                f0.c.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends f5.b {
        public b() {
        }

        @Override // u0.o0
        public final void a() {
            s sVar = s.this;
            sVar.s = null;
            sVar.f13177d.requestLayout();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c implements p0 {
        public c() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends j.a implements f.a {

        /* renamed from: u, reason: collision with root package name */
        public final Context f13197u;

        /* renamed from: v, reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f13198v;

        /* renamed from: w, reason: collision with root package name */
        public g.c f13199w;

        /* renamed from: x, reason: collision with root package name */
        public WeakReference<View> f13200x;

        public d(Context context, g.c cVar) {
            this.f13197u = context;
            this.f13199w = cVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f180l = 1;
            this.f13198v = fVar;
            fVar.f174e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            g.c cVar = this.f13199w;
            if (cVar != null) {
                return cVar.f13113a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f13199w == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = s.this.f13179f.f13556v;
            if (aVar != null) {
                aVar.l();
            }
        }

        @Override // j.a
        public final void c() {
            s sVar = s.this;
            if (sVar.f13181i != this) {
                return;
            }
            if (sVar.f13188p) {
                sVar.f13182j = this;
                sVar.f13183k = this.f13199w;
            } else {
                this.f13199w.a(this);
            }
            this.f13199w = null;
            sVar.a(false);
            ActionBarContextView actionBarContextView = sVar.f13179f;
            if (actionBarContextView.C == null) {
                actionBarContextView.h();
            }
            sVar.f13176c.setHideOnContentScrollEnabled(sVar.f13192u);
            sVar.f13181i = null;
        }

        @Override // j.a
        public final View d() {
            WeakReference<View> weakReference = this.f13200x;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f13198v;
        }

        @Override // j.a
        public final MenuInflater f() {
            return new j.f(this.f13197u);
        }

        @Override // j.a
        public final CharSequence g() {
            return s.this.f13179f.getSubtitle();
        }

        @Override // j.a
        public final CharSequence h() {
            return s.this.f13179f.getTitle();
        }

        @Override // j.a
        public final void i() {
            if (s.this.f13181i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f13198v;
            fVar.w();
            try {
                this.f13199w.b(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // j.a
        public final boolean j() {
            return s.this.f13179f.K;
        }

        @Override // j.a
        public final void k(View view) {
            s.this.f13179f.setCustomView(view);
            this.f13200x = new WeakReference<>(view);
        }

        @Override // j.a
        public final void l(int i6) {
            m(s.this.f13174a.getResources().getString(i6));
        }

        @Override // j.a
        public final void m(CharSequence charSequence) {
            s.this.f13179f.setSubtitle(charSequence);
        }

        @Override // j.a
        public final void n(int i6) {
            o(s.this.f13174a.getResources().getString(i6));
        }

        @Override // j.a
        public final void o(CharSequence charSequence) {
            s.this.f13179f.setTitle(charSequence);
        }

        @Override // j.a
        public final void p(boolean z6) {
            this.f13381t = z6;
            s.this.f13179f.setTitleOptional(z6);
        }
    }

    public s(Dialog dialog) {
        new ArrayList();
        this.f13185m = new ArrayList<>();
        this.f13186n = 0;
        this.f13187o = true;
        this.f13190r = true;
        this.f13193v = new a();
        this.f13194w = new b();
        this.f13195x = new c();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z6) {
        n0 n0VarM;
        n0 n0VarE;
        if (z6) {
            if (!this.f13189q) {
                this.f13189q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13176c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f13189q) {
            this.f13189q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13176c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        if (!this.f13177d.isLaidOut()) {
            if (z6) {
                this.f13178e.n(4);
                this.f13179f.setVisibility(0);
                return;
            } else {
                this.f13178e.n(0);
                this.f13179f.setVisibility(8);
                return;
            }
        }
        if (z6) {
            n0VarE = this.f13178e.m(4, 100L);
            n0VarM = this.f13179f.e(0, 200L);
        } else {
            n0VarM = this.f13178e.m(0, 200L);
            n0VarE = this.f13179f.e(8, 100L);
        }
        j.g gVar = new j.g();
        ArrayList<n0> arrayList = gVar.f13433a;
        arrayList.add(n0VarE);
        View view = n0VarE.f14521a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = n0VarM.f14521a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(n0VarM);
        gVar.b();
    }

    public final void b(boolean z6) {
        if (z6 == this.f13184l) {
            return;
        }
        this.f13184l = z6;
        ArrayList<a.b> arrayList = this.f13185m;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
    }

    public final Context c() {
        if (this.f13175b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13174a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f13175b = new ContextThemeWrapper(this.f13174a, i6);
            } else {
                this.f13175b = this.f13174a;
            }
        }
        return this.f13175b;
    }

    public final void d(View view) {
        g0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f13176c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof g0) {
            wrapper = (g0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f13178e = wrapper;
        this.f13179f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f13177d = actionBarContainer;
        g0 g0Var = this.f13178e;
        if (g0Var == null || this.f13179f == null || actionBarContainer == null) {
            throw new IllegalStateException(s.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f13174a = g0Var.getContext();
        if ((this.f13178e.o() & 4) != 0) {
            this.h = true;
        }
        Context context = this.f13174a;
        int i6 = context.getApplicationInfo().targetSdkVersion;
        this.f13178e.getClass();
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f13174a.obtainStyledAttributes(null, f.a.f12934a, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13176c;
            if (!actionBarOverlayLayout2.f250y) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f13192u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13177d;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.d.j(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e(boolean z6) {
        if (this.h) {
            return;
        }
        int i6 = z6 ? 4 : 0;
        int iO = this.f13178e.o();
        this.h = true;
        this.f13178e.j((i6 & 4) | (iO & (-5)));
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f13177d.setTabContainer(null);
            this.f13178e.k();
        } else {
            this.f13178e.k();
            this.f13177d.setTabContainer(null);
        }
        this.f13178e.getClass();
        this.f13178e.r(false);
        this.f13176c.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z6) {
        boolean z7 = this.f13188p;
        boolean z8 = this.f13189q;
        final c cVar = this.f13195x;
        View view = this.f13180g;
        if (!z8 && z7) {
            if (this.f13190r) {
                this.f13190r = false;
                j.g gVar = this.s;
                if (gVar != null) {
                    gVar.a();
                }
                int i6 = this.f13186n;
                a aVar = this.f13193v;
                if (i6 != 0 || (!this.f13191t && !z6)) {
                    aVar.a();
                    return;
                }
                this.f13177d.setAlpha(1.0f);
                this.f13177d.setTransitioning(true);
                j.g gVar2 = new j.g();
                float f6 = -this.f13177d.getHeight();
                if (z6) {
                    this.f13177d.getLocationInWindow(new int[]{0, 0});
                    f6 -= r12[1];
                }
                n0 n0VarA = f0.a(this.f13177d);
                n0VarA.e(f6);
                final View view2 = n0VarA.f14521a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: u0.l0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) g.s.this.f13177d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z9 = gVar2.f13437e;
                ArrayList<n0> arrayList = gVar2.f13433a;
                if (!z9) {
                    arrayList.add(n0VarA);
                }
                if (this.f13187o && view != null) {
                    n0 n0VarA2 = f0.a(view);
                    n0VarA2.e(f6);
                    if (!gVar2.f13437e) {
                        arrayList.add(n0VarA2);
                    }
                }
                boolean z10 = gVar2.f13437e;
                if (!z10) {
                    gVar2.f13435c = f13172y;
                }
                if (!z10) {
                    gVar2.f13434b = 250L;
                }
                if (!z10) {
                    gVar2.f13436d = aVar;
                }
                this.s = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.f13190r) {
            return;
        }
        this.f13190r = true;
        j.g gVar3 = this.s;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f13177d.setVisibility(0);
        int i7 = this.f13186n;
        b bVar = this.f13194w;
        if (i7 == 0 && (this.f13191t || z6)) {
            this.f13177d.setTranslationY(0.0f);
            float f7 = -this.f13177d.getHeight();
            if (z6) {
                this.f13177d.getLocationInWindow(new int[]{0, 0});
                f7 -= r12[1];
            }
            this.f13177d.setTranslationY(f7);
            j.g gVar4 = new j.g();
            n0 n0VarA3 = f0.a(this.f13177d);
            n0VarA3.e(0.0f);
            final View view3 = n0VarA3.f14521a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: u0.l0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) g.s.this.f13177d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z11 = gVar4.f13437e;
            ArrayList<n0> arrayList2 = gVar4.f13433a;
            if (!z11) {
                arrayList2.add(n0VarA3);
            }
            if (this.f13187o && view != null) {
                view.setTranslationY(f7);
                n0 n0VarA4 = f0.a(view);
                n0VarA4.e(0.0f);
                if (!gVar4.f13437e) {
                    arrayList2.add(n0VarA4);
                }
            }
            boolean z12 = gVar4.f13437e;
            if (!z12) {
                gVar4.f13435c = f13173z;
            }
            if (!z12) {
                gVar4.f13434b = 250L;
            }
            if (!z12) {
                gVar4.f13436d = bVar;
            }
            this.s = gVar4;
            gVar4.b();
        } else {
            this.f13177d.setAlpha(1.0f);
            this.f13177d.setTranslationY(0.0f);
            if (this.f13187o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13176c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.c.c(actionBarOverlayLayout);
        }
    }

    public s(boolean z6, Activity activity) {
        new ArrayList();
        this.f13185m = new ArrayList<>();
        this.f13186n = 0;
        this.f13187o = true;
        this.f13190r = true;
        this.f13193v = new a();
        this.f13194w = new b();
        this.f13195x = new c();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z6) {
            return;
        }
        this.f13180g = decorView.findViewById(android.R.id.content);
    }
}
