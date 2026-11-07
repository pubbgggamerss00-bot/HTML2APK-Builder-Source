package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ j s;

    public o(j jVar) {
        this.s = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.s;
        j.e eVar = jVar.f12264r0;
        j.e eVar2 = j.e.s;
        j.e eVar3 = j.e.f12275t;
        if (eVar == eVar3) {
            jVar.F(eVar2);
        } else if (eVar == eVar2) {
            jVar.F(eVar3);
        }
        jVar.G(jVar.W);
    }
}
