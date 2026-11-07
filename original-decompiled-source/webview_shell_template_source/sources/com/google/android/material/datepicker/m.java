package com.google.android.material.datepicker;

import android.view.View;
import com.htmltoapk.template.R;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f12283d;

    public m(j jVar) {
        this.f12283d = jVar;
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        this.f14446a.onInitializeAccessibilityNodeInfo(view, bVar.f14729a);
        j jVar = this.f12283d;
        bVar.b(new b.a(16, jVar.f12271y0.getVisibility() == 0 ? jVar.g(R.string.mtrl_picker_toggle_to_year_selection) : jVar.g(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
