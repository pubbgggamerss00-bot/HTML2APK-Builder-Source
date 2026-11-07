package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ s00 s;

    public q00(s00 s00Var) {
        this.s = s00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        s00 s00Var = this.s;
        data.putExtra("title", s00Var.f8755x);
        data.putExtra("eventLocation", s00Var.B);
        data.putExtra("description", s00Var.A);
        long j6 = s00Var.f8756y;
        if (j6 > -1) {
            data.putExtra("beginTime", j6);
        }
        long j7 = s00Var.f8757z;
        if (j7 > -1) {
            data.putExtra("endTime", j7);
        }
        data.setFlags(268435456);
        zzv.zzq();
        zzs.zzT(s00Var.f8754w, data);
    }
}
