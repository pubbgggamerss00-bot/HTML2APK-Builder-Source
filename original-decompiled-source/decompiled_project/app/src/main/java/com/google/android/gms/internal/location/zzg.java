package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

/* loaded from: classes2.dex */
public final class zzg {
    public final i<Status> removeActivityUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zze(this, hVar, pendingIntent));
    }

    public final i<Status> requestActivityUpdates(h hVar, long j10, PendingIntent pendingIntent) {
        return hVar.b(new zzd(this, hVar, j10, pendingIntent));
    }
}
