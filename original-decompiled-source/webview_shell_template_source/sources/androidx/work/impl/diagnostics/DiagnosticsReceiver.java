package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.k;
import androidx.work.m;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1814a = k.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f1814a;
        k.c().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            j2.k.b(context).a(new m.a(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e6) {
            k.c().b(str, "WorkManager is not initialized", e6);
        }
    }
}
