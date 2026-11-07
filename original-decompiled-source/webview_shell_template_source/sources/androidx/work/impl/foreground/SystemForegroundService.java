package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import com.google.android.gms.internal.ads.x70;
import java.util.UUID;
import q2.b;
import s2.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1815x = k.e("SystemFgService");

    /* renamed from: t, reason: collision with root package name */
    public Handler f1816t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1817u;

    /* renamed from: v, reason: collision with root package name */
    public b f1818v;

    /* renamed from: w, reason: collision with root package name */
    public NotificationManager f1819w;

    public final void a() {
        this.f1816t = new Handler(Looper.getMainLooper());
        this.f1819w = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f1818v = bVar;
        if (bVar.A != null) {
            k.c().b(b.B, "A callback already exists.", new Throwable[0]);
        } else {
            bVar.A = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1818v.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        boolean z6 = this.f1817u;
        String str = f1815x;
        if (z6) {
            k.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1818v.g();
            a();
            this.f1817u = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f1818v;
        j2.k kVar = bVar.s;
        String str2 = b.B;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            k.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = kVar.f13476c;
            ((u2.b) bVar.f14105t).a(new x70(bVar, workDatabase, stringExtra));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            k.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            kVar.f13477d.a(new a(kVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        k.c().d(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = bVar.A;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f1817u = true;
        k.c().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
