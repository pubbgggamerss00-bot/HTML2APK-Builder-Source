package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ua0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EditText f9508t;

    public ua0(JsPromptResult jsPromptResult, EditText editText) {
        this.s = jsPromptResult;
        this.f9508t = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        this.s.confirm(this.f9508t.getText().toString());
    }
}
