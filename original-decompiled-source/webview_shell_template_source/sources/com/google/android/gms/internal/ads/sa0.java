package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sa0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult s;

    public sa0(JsPromptResult jsPromptResult) {
        this.s = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.s.cancel();
    }
}
