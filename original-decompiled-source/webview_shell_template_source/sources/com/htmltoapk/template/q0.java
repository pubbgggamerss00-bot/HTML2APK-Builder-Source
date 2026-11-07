package com.htmltoapk.template;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p5.a f12598t;

    public /* synthetic */ q0(p5.a aVar, int i6) {
        this.s = i6;
        this.f12598t = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.s) {
            case 0:
                this.f12598t.a();
                break;
            case 1:
                this.f12598t.a();
                break;
            default:
                ((t0) this.f12598t).a();
                break;
        }
    }
}
