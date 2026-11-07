package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c0.g0;
import kotlin.jvm.internal.r;
import t6.s;
import t6.v;
import u6.t0;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3155a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        s sVarD = s.d();
        String str = f3155a;
        sVarD.a(str, "Requesting diagnostics");
        try {
            r.e(context, "context");
            t0 t0VarB = t0.b(context);
            r.d(t0VarB, "getInstance(context)");
            t0VarB.a(g0.c(v.a()));
        } catch (IllegalStateException e10) {
            s.d().c(str, "WorkManager is not initialized", e10);
        }
    }
}
