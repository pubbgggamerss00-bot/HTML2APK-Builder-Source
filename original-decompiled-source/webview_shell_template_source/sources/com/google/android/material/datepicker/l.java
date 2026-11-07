package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends RecyclerView.l {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f12280a = i0.e(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f12281b = i0.e(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12282c;

    public l(j jVar) {
        this.f12282c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof k0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            k0 k0Var = (k0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            j jVar = this.f12282c;
            for (t0.b<Long, Long> bVar : jVar.f12261n0.c()) {
                Long l4 = bVar.f14401a;
                Long l6 = bVar.f14402b;
                if (l4 != null && l6 != null) {
                    long jLongValue = l4.longValue();
                    Calendar calendar = this.f12280a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = l6.longValue();
                    Calendar calendar2 = this.f12281b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i6 = calendar.get(1) - k0Var.f12278d.f12262o0.s.f12304u;
                    int i7 = calendar2.get(1) - k0Var.f12278d.f12262o0.s.f12304u;
                    View viewQ = gridLayoutManager.q(i6);
                    View viewQ2 = gridLayoutManager.q(i7);
                    int i8 = gridLayoutManager.F;
                    int i9 = i6 / i8;
                    int i10 = i7 / i8;
                    for (int i11 = i9; i11 <= i10; i11++) {
                        View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i11);
                        if (viewQ3 != null) {
                            int top = viewQ3.getTop() + jVar.f12265s0.f12240d.f12230a.top;
                            int bottom = viewQ3.getBottom() - jVar.f12265s0.f12240d.f12230a.bottom;
                            canvas.drawRect((i11 != i9 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), top, (i11 != i10 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), bottom, jVar.f12265s0.h);
                        }
                    }
                }
            }
        }
    }
}
