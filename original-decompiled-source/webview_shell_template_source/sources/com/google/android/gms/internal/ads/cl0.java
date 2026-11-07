package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzba;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class cl0 implements om0, zr1 {
    public final /* synthetic */ Context s;

    public /* synthetic */ cl0(Context context) {
        this.s = context;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(Object obj) {
        if (((Boolean) lp.f6814j.c()).booleanValue()) {
            mn.a(this.s);
        }
    }

    public Object b() {
        bg1 bg1Var = bq.D;
        if (bg1Var.f3169a) {
            return Boolean.TRUE;
        }
        Context applicationContext = this.s.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!bg1Var.f3169a) {
            bg1Var.f3169a = true;
            yg1 yg1VarB = yg1.b();
            yg1VarB.getClass();
            yg1VarB.f10975b = new og1(new Handler(), applicationContext, yg1VarB);
            boolean z6 = applicationContext instanceof Application;
            if (z6) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(qg1.f8382v);
            }
            bq.H = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = gh1.f5045a;
            gh1.f5047c = applicationContext.getResources().getDisplayMetrics().density;
            gh1.f5045a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new hh1(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            wg1.f10196t.s = applicationContext.getApplicationContext();
            pg1 pg1Var = pg1.f8065e;
            tg1 tg1Var = pg1Var.f8068c;
            if (!pg1Var.f8067b) {
                if (z6) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(tg1Var);
                }
                tg1Var.f9277u = pg1Var;
                tg1Var.s = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                tg1Var.f9276t = runningAppProcessInfo.importance == 100;
                pg1Var.f8069d = tg1Var.f9276t;
                pg1Var.f8067b = true;
            }
            ah1.f2759d.f2760a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new zg1(), intentFilter);
        }
        return Boolean.valueOf(bg1Var.f3169a);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        if (((Boolean) lp.h.c()).booleanValue() && (th instanceof zzba)) {
            mn.a(this.s);
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((bl0) obj).e(this.s);
    }
}
