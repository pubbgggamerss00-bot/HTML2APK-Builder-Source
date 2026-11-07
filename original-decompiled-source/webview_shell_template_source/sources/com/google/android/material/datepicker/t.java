package com.google.android.material.datepicker;

import android.view.View;
import com.htmltoapk.template.WebViewActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12288t;

    public /* synthetic */ t(int i6, Object obj) {
        this.s = i6;
        this.f12288t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.s) {
            case 0:
                v vVar = (v) this.f12288t;
                vVar.f12294b1.setEnabled(vVar.E().g());
                vVar.Z0.toggle();
                vVar.O0 = vVar.O0 == 1 ? 0 : 1;
                vVar.I(vVar.Z0);
                vVar.J(vVar.Z0);
                vVar.H();
                break;
            case 1:
                ((WebViewActivity) this.f12288t).closePopupWebView();
                break;
            case 2:
                ((p5.a) this.f12288t).a();
                break;
            default:
                ((y4.k) this.f12288t).t();
                break;
        }
    }
}
