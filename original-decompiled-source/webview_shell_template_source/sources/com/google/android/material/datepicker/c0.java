package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.htmltoapk.template.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends RecyclerView.e<a> {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.datepicker.a f12244d;

    /* renamed from: e, reason: collision with root package name */
    public final d<?> f12245e;

    /* renamed from: f, reason: collision with root package name */
    public final f f12246f;

    /* renamed from: g, reason: collision with root package name */
    public final j.c f12247g;
    public final j.d h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12248i;

    /* renamed from: j, reason: collision with root package name */
    public y f12249j;

    /* renamed from: k, reason: collision with root package name */
    public int f12250k = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends RecyclerView.b0 {

        /* renamed from: u, reason: collision with root package name */
        public final TextView f12251u;

        /* renamed from: v, reason: collision with root package name */
        public final MaterialCalendarGridView f12252v;

        public a(LinearLayout linearLayout, boolean z6) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f12251u = textView;
            WeakHashMap<View, n0> weakHashMap = u0.f0.f14480a;
            new u0.e0(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.f12252v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z6) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public c0(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, f fVar, j.c cVar, j.d dVar2) {
        y yVar = aVar.s;
        y yVar2 = aVar.f12220t;
        y yVar3 = aVar.f12222v;
        if (yVar.s.compareTo(yVar3.s) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (yVar3.s.compareTo(yVar2.s) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f12248i = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * z.f12309y) + (v.G(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f12244d = aVar;
        this.f12245e = dVar;
        this.f12246f = fVar;
        this.f12247g = cVar;
        this.h = dVar2;
        this.f12249j = yVar3;
        if (this.f1459a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1460b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f12244d.f12225y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i6) {
        Calendar calendarC = i0.c(this.f12244d.s.s);
        calendarC.add(2, i6);
        calendarC.set(5, 1);
        Calendar calendarC2 = i0.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void c(RecyclerView.b0 b0Var, int i6) throws Resources.NotFoundException {
        a aVar = (a) b0Var;
        com.google.android.material.datepicker.a aVar2 = this.f12244d;
        Calendar calendarC = i0.c(aVar2.s.s);
        calendarC.add(2, i6);
        y yVar = new y(calendarC);
        aVar.f12251u.setText(yVar.n());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f12252v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !yVar.equals(materialCalendarGridView.b().s)) {
            z zVar = new z(yVar, this.f12245e, aVar2, this.f12246f);
            materialCalendarGridView.setNumColumns(yVar.f12305v);
            materialCalendarGridView.setAdapter((ListAdapter) zVar);
        } else {
            materialCalendarGridView.invalidate();
            z zVarB = materialCalendarGridView.b();
            d<?> dVar = zVarB.f12311t;
            Iterator<Long> it = zVarB.f12312u.iterator();
            while (it.hasNext()) {
                zVarB.i(materialCalendarGridView, it.next().longValue());
            }
            if (dVar != null) {
                Iterator<Long> it2 = dVar.i().iterator();
                while (it2.hasNext()) {
                    zVarB.i(materialCalendarGridView, it2.next().longValue());
                }
                zVarB.f12312u = dVar.i();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new b0(this, materialCalendarGridView));
        materialCalendarGridView.f12219u = this.h;
        boolean zG = v.G(aVar.f1441a.getContext(), android.R.attr.windowFullscreen);
        if (zG || yVar.equals(this.f12249j)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (zG || !yVar.equals(this.f12249j)) {
            return;
        }
        final int i7 = this.f12250k;
        this.f12250k = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.a0
            @Override // java.lang.Runnable
            public final void run() {
                int i8;
                int iB;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i8 = i7) == 0) {
                    return;
                }
                z zVarB2 = materialCalendarGridView2.b();
                if (i8 == 1) {
                    iB = zVarB2.c(zVarB2.g() + 1);
                    if (iB == -1) {
                        iB = zVarB2.g();
                    }
                } else {
                    iB = zVarB2.b(zVarB2.d() - 1);
                    if (iB == -1) {
                        iB = zVarB2.d();
                    }
                }
                materialCalendarGridView2.setSelection(iB);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!v.G(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f12248i));
        return new a(linearLayout, true);
    }

    public final y h(int i6) {
        Calendar calendarC = i0.c(this.f12244d.s.s);
        calendarC.add(2, i6);
        return new y(calendarC);
    }

    public final int i(y yVar) {
        return this.f12244d.s.o(yVar);
    }
}
