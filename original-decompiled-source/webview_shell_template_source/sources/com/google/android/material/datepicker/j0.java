package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.j;
import java.util.Calendar;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j0 implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k0 f12277t;

    public j0(k0 k0Var, int i6) {
        this.f12277t = k0Var;
        this.s = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j<?> jVar = this.f12277t.f12278d;
        y yVarL = y.l(this.s, jVar.f12263q0.f12303t);
        a aVar = jVar.f12262o0;
        y yVar = aVar.f12220t;
        y yVar2 = aVar.s;
        Calendar calendar = yVarL.s;
        if (calendar.compareTo(yVar2.s) < 0) {
            yVarL = yVar2;
        } else if (calendar.compareTo(yVar.s) > 0) {
            yVarL = yVar;
        }
        jVar.E(yVarL);
        jVar.F(j.e.s);
        MaterialButton materialButton = jVar.f12272z0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
