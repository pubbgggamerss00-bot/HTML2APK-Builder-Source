package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f12236t;

    public b0(c0 c0Var, MaterialCalendarGridView materialCalendarGridView) {
        this.f12236t = c0Var;
        this.s = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.s;
        z zVarB = materialCalendarGridView.b();
        if (i6 < zVarB.d() || i6 > zVarB.g()) {
            return;
        }
        j.c cVar = this.f12236t.f12247g;
        long jLongValue = materialCalendarGridView.b().getItem(i6).longValue();
        j jVar = j.this;
        if (jVar.f12262o0.f12221u.f(jLongValue)) {
            jVar.f12261n0.a();
            Iterator it = jVar.f12253l0.iterator();
            while (it.hasNext()) {
                ((d0) it.next()).a(jVar.f12261n0.j());
            }
            jVar.f12267u0.getAdapter().f1459a.b();
            RecyclerView recyclerView = jVar.f12266t0;
            if (recyclerView != null) {
                recyclerView.getAdapter().f1459a.b();
            }
        }
    }
}
