package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.k;
import java.util.HashMap;
import java.util.WeakHashMap;
import l2.e;
import s2.n;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService {

    /* renamed from: v, reason: collision with root package name */
    public static final String f1809v = k.e("SystemAlarmService");

    /* renamed from: t, reason: collision with root package name */
    public e f1810t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1811u;

    public final void a() {
        this.f1811u = true;
        k.c().a(f1809v, "All commands completed in dispatcher", new Throwable[0]);
        String str = n.f14372a;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = n.f14373b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                k.c().f(n.f14372a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e eVar = new e(this);
        this.f1810t = eVar;
        if (eVar.B != null) {
            k.c().b(e.C, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.B = this;
        }
        this.f1811u = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1811u = true;
        this.f1810t.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        if (this.f1811u) {
            k.c().d(f1809v, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1810t.d();
            e eVar = new e(this);
            this.f1810t = eVar;
            if (eVar.B != null) {
                k.c().b(e.C, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                eVar.B = this;
            }
            this.f1811u = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1810t.a(intent, i7);
        return 3;
    }
}
