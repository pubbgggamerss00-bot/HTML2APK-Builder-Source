package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity s;

    public c(Activity activity) {
        this.s = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(this.s, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
