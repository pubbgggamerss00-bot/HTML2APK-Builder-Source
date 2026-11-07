package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ z00 s;

    public y00(z00 z00Var) {
        this.s = z00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) throws JSONException {
        this.s.m("User canceled the download.");
    }
}
