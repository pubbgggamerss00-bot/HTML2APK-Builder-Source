package com.htmltoapk.template;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.j.e("context", context);
        kotlin.jvm.internal.j.e("intent", intent);
        AlarmReceiver.Companion.rescheduleAll(context);
    }
}
