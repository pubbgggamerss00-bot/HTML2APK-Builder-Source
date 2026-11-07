package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.x;
import c2.y;
import d7.c;
import java.util.UUID;
import kotlin.jvm.internal.r;
import t6.a0;
import t6.s;
import u6.t0;

/* loaded from: classes.dex */
public class SystemForegroundService extends x {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3156e = s.f("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public boolean f3157b;

    /* renamed from: c, reason: collision with root package name */
    public b7.b f3158c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f3159d;

    public static class a {
        public static void a(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
            systemForegroundService.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
            try {
                systemForegroundService.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                s sVarD = s.d();
                String str = SystemForegroundService.f3156e;
                if (((s.a) sVarD).f28051c <= 5) {
                    Log.w(str, "Unable to start foreground service", e10);
                }
            } catch (SecurityException e11) {
                s sVarD2 = s.d();
                String str2 = SystemForegroundService.f3156e;
                if (((s.a) sVarD2).f28051c <= 5) {
                    Log.w(str2, "Unable to start foreground service", e11);
                }
            }
        }
    }

    public final void a() {
        this.f3159d = (NotificationManager) getApplicationContext().getSystemService("notification");
        b7.b bVar = new b7.b(getApplicationContext());
        this.f3158c = bVar;
        if (bVar.f3664j != null) {
            s.d().b(b7.b.f3655k, "A callback already exists.");
        } else {
            bVar.f3664j = this;
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3158c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f3157b;
        String str = f3156e;
        if (z10) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f3158c.e();
            a();
            this.f3157b = false;
        }
        if (intent == null) {
            return 3;
        }
        b7.b bVar = this.f3158c;
        bVar.getClass();
        String str2 = b7.b.f3655k;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            s.d().e(str2, "Started foreground service " + intent);
            bVar.f3657b.d(new b7.a(bVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            s.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.f3664j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f3157b = true;
            s.d().a(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        s.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        t0 t0Var = bVar.f3656a;
        UUID id2 = UUID.fromString(stringExtra);
        t0Var.getClass();
        r.e(id2, "id");
        y yVar = t0Var.f29337b.f3128m;
        d7.s sVarC = t0Var.f29339d.c();
        r.d(sVarC, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        a0.a(yVar, "CancelWorkById", sVarC, new c(t0Var, id2));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f3158c.f(2048);
    }

    public final void onTimeout(int i10, int i11) {
        this.f3158c.f(i11);
    }
}
