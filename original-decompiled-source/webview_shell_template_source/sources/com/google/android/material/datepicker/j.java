package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.w70;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.v;
import com.htmltoapk.template.R;
import l.e1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j<S> extends e0<S> {
    public AccessibilityManager A0;
    public androidx.recyclerview.widget.u B0;
    public boolean C0;

    /* renamed from: m0, reason: collision with root package name */
    public int f12260m0;

    /* renamed from: n0, reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f12261n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f12262o0;
    public f p0;

    /* renamed from: q0, reason: collision with root package name */
    public y f12263q0;

    /* renamed from: r0, reason: collision with root package name */
    public e f12264r0;

    /* renamed from: s0, reason: collision with root package name */
    public com.google.android.material.datepicker.c f12265s0;

    /* renamed from: t0, reason: collision with root package name */
    public RecyclerView f12266t0;

    /* renamed from: u0, reason: collision with root package name */
    public RecyclerView f12267u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f12268v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f12269w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f12270x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f12271y0;

    /* renamed from: z0, reason: collision with root package name */
    public MaterialButton f12272z0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends u0.a {
        @Override // u0.a
        public final void d(View view, v0.b bVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends g0 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i6, int i7) {
            super(i6);
            this.E = i7;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(RecyclerView.x xVar, int[] iArr) {
            int i6 = this.E;
            j jVar = j.this;
            if (i6 == 0) {
                iArr[0] = jVar.f12267u0.getWidth();
                iArr[1] = jVar.f12267u0.getWidth();
            } else {
                iArr[0] = jVar.f12267u0.getHeight();
                iArr[1] = jVar.f12267u0.getHeight();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c {
        public c() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d {
        public d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e {
        public static final e s;

        /* renamed from: t, reason: collision with root package name */
        public static final e f12275t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ e[] f12276u;

        static {
            e eVar = new e("DAY", 0);
            s = eVar;
            e eVar2 = new e("YEAR", 1);
            f12275t = eVar2;
            f12276u = new e[]{eVar, eVar2};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f12276u.clone();
        }
    }

    public static boolean D(j jVar, boolean z6) {
        y yVar;
        if (jVar.C0) {
            return false;
        }
        if (jVar.f12267u0.getScrollState() != 0) {
            return true;
        }
        c0 c0Var = (c0) jVar.f12267u0.getAdapter();
        if (c0Var == null || (yVar = jVar.f12263q0) == null) {
            return false;
        }
        int i6 = c0Var.i(yVar) + (z6 ? 1 : -1);
        if (i6 < 0 || i6 >= c0Var.f12244d.f12225y) {
            return false;
        }
        c0Var.f12250k = z6 ? 2 : 1;
        jVar.E(c0Var.h(i6));
        return true;
    }

    @Override // com.google.android.material.datepicker.e0
    public final void C(v.a aVar) {
        this.f12253l0.add(aVar);
    }

    public final void E(y yVar) {
        c0 c0Var = (c0) this.f12267u0.getAdapter();
        int i6 = c0Var.i(yVar);
        AccessibilityManager accessibilityManager = this.A0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int i7 = i6 - c0Var.i(this.f12263q0);
            boolean z6 = Math.abs(i7) > 3;
            boolean z7 = i7 > 0;
            this.f12263q0 = yVar;
            if (z6 && z7) {
                this.f12267u0.g0(i6 - 3);
                this.f12267u0.post(new w70(i6, 1, this));
            } else if (z6) {
                this.f12267u0.g0(i6 + 3);
                this.f12267u0.post(new w70(i6, 1, this));
            } else {
                this.f12267u0.post(new w70(i6, 1, this));
            }
        } else {
            this.f12263q0 = yVar;
            this.f12267u0.g0(i6);
        }
        H();
        I(i6);
    }

    public final void F(e eVar) {
        this.f12264r0 = eVar;
        if (eVar == e.f12275t) {
            this.f12266t0.getLayoutManager().p0(this.f12263q0.f12304u - ((k0) this.f12266t0.getAdapter()).f12278d.f12262o0.s.f12304u);
            this.f12270x0.setVisibility(0);
            this.f12271y0.setVisibility(8);
            this.f12268v0.setVisibility(8);
            this.f12269w0.setVisibility(8);
            return;
        }
        if (eVar == e.s) {
            this.f12270x0.setVisibility(8);
            this.f12271y0.setVisibility(0);
            this.f12268v0.setVisibility(0);
            this.f12269w0.setVisibility(0);
            E(this.f12263q0);
        }
    }

    public final void G(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.f12264r0;
        if (eVar == e.f12275t) {
            u0.f0.n(view, g(R.string.mtrl_picker_pane_title_year_view));
        } else if (eVar == e.s) {
            u0.f0.n(view, g(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void H() {
        y yVar;
        c0 c0Var = (c0) this.f12267u0.getAdapter();
        if (c0Var != null) {
            RecyclerView.f fVar = c0Var.f1459a;
            if (this.C0 || (yVar = this.f12263q0) == null || yVar.equals(c0Var.f12249j)) {
                return;
            }
            int i6 = c0Var.i(c0Var.f12249j);
            c0Var.f12249j = yVar;
            int i7 = c0Var.i(yVar);
            fVar.c(i6);
            fVar.c(i7);
        }
    }

    public final void I(int i6) {
        View view = this.f12269w0;
        if (view != null) {
            view.setEnabled(i6 + 1 < this.f12267u0.getAdapter().a());
        }
        View view2 = this.f12268v0;
        if (view2 != null) {
            view2.setEnabled(i6 - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.k
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f1197x;
        }
        this.f12260m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f12261n0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f12262o0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.p0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f12263q0 = (y) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.k
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i6;
        int i7;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(d(), this.f12260m0);
        this.f12265s0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.A0 = (AccessibilityManager) y().getSystemService("accessibility");
        y yVar = this.f12262o0.s;
        boolean zG = v.G(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.C0 = zG;
        if (zG) {
            i6 = R.layout.mtrl_calendar_vertical;
            i7 = 1;
        } else {
            i6 = R.layout.mtrl_calendar_horizontal;
            i7 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i6, viewGroup, false);
        Resources resources = y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i8 = z.f12309y;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i8 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i8) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        u0.f0.m(gridView, new a());
        int i9 = this.f12262o0.f12223w;
        gridView.setAdapter((ListAdapter) (i9 > 0 ? new g(i9) : new g()));
        gridView.setNumColumns(yVar.f12305v);
        gridView.setEnabled(false);
        this.f12267u0 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f12267u0.setLayoutManager(new b(i7, i7));
        this.f12267u0.setTag("MONTHS_VIEW_GROUP_TAG");
        c0 c0Var = new c0(contextThemeWrapper, this.f12261n0, this.f12262o0, this.p0, new c(), new d());
        this.f12267u0.setAdapter(c0Var);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f12266t0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f12266t0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f12266t0.setAdapter(new k0(this));
            this.f12266t0.i(new l(this));
        }
        if (!this.C0) {
            androidx.recyclerview.widget.u uVar = new androidx.recyclerview.widget.u();
            this.B0 = uVar;
            uVar.a(this.f12267u0);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f12272z0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            u0.f0.m(this.f12272z0, new m(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f12268v0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            e1.a(this.f12268v0, g(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f12269w0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            e1.a(this.f12269w0, g(R.string.mtrl_picker_next_month_tooltip));
            this.f12270x0 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f12271y0 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            F(e.s);
            this.f12272z0.setText(this.f12263q0.n());
            this.f12267u0.j(new n(this, c0Var));
            this.f12272z0.setOnClickListener(new o(this));
            this.f12269w0.setOnClickListener(new h(this, c0Var));
            this.f12268v0.setOnClickListener(new i(this, c0Var));
            I(c0Var.i(this.f12263q0));
        }
        this.f12267u0.g0(c0Var.i(this.f12263q0));
        u0.f0.m(this.f12267u0, new k());
        G(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.k
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f12260m0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f12261n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12262o0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.p0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12263q0);
    }
}
