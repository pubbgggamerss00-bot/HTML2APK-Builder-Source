package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ s00 s;

    public r00(s00 s00Var) {
        this.s = s00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) throws JSONException {
        this.s.m("Operation denied by user.");
    }
}
