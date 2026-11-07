package com.basitce.htmltoapk.util;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class LauncherNameService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        List<String> list = a.f5832a;
        Context applicationContext = getApplicationContext();
        r.d(applicationContext, "getApplicationContext(...)");
        a.a(applicationContext);
        stopSelf();
    }
}
