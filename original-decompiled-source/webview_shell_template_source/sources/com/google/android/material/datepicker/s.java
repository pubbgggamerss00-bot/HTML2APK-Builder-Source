package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12287t;

    public /* synthetic */ s(int i6, Object obj) {
        this.s = i6;
        this.f12287t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.s) {
            case 0:
                v vVar = (v) this.f12287t;
                Iterator<View.OnClickListener> it = vVar.C0.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                vVar.C(false, false);
                break;
            default:
                ((p5.a) this.f12287t).a();
                break;
        }
    }
}
