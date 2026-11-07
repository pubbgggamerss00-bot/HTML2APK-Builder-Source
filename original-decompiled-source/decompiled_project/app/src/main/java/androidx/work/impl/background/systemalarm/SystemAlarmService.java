package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.x;
import d7.u;
import d7.v;
import java.util.LinkedHashMap;
import java.util.Map;
import pg.f0;
import t6.s;
import w6.f;

/* loaded from: classes.dex */
public class SystemAlarmService extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3147d = s.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public f f3148b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3149c;

    public final void a() {
        this.f3149c = true;
        s.d().a(f3147d, "All commands completed in dispatcher");
        String str = u.f7404a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (v.f7405a) {
            linkedHashMap.putAll(v.f7406b);
            f0 f0Var = f0.f21461a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(u.f7404a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f fVar = new f(this);
        this.f3148b = fVar;
        if (fVar.f31312j != null) {
            s.d().b(f.f31303l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            fVar.f31312j = this;
        }
        this.f3149c = false;
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3149c = true;
        f fVar = this.f3148b;
        fVar.getClass();
        s.d().a(f.f31303l, "Destroying SystemAlarmDispatcher");
        fVar.f31307d.e(fVar);
        fVar.f31312j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3149c) {
            s.d().e(f3147d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            f fVar = this.f3148b;
            fVar.getClass();
            s sVarD = s.d();
            String str = f.f31303l;
            sVarD.a(str, "Destroying SystemAlarmDispatcher");
            fVar.f31307d.e(fVar);
            fVar.f31312j = null;
            f fVar2 = new f(this);
            this.f3148b = fVar2;
            if (fVar2.f31312j != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                fVar2.f31312j = this;
            }
            this.f3149c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3148b.a(intent, i11);
        return 3;
    }
}
