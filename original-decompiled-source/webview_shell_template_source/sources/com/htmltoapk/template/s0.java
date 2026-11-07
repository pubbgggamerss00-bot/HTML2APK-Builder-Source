package com.htmltoapk.template;

import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f12600t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12601u;

    public /* synthetic */ s0(KeyEvent.Callback callback, Object obj, int i6) {
        this.s = i6;
        this.f12600t = callback;
        this.f12601u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.s) {
            case 0:
                IosDialogHelper.showExitConfirmation$lambda$2((Dialog) this.f12600t, (p5.a) this.f12601u, view);
                break;
            default:
                ((w2.l0) this.f12600t).i((ImageButton) this.f12601u);
                break;
        }
    }
}
