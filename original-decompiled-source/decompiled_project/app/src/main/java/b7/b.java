package b7;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkSpec;
import c7.i0;
import c7.j;
import d7.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ph.s1;
import t6.s;
import u6.e;
import u6.t0;
import u6.x;
import y6.b;
import y6.h;
import y6.l;

/* loaded from: classes.dex */
public final class b implements h, e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3655k = s.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final t0 f3656a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.b f3657b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3658c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f3659d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f3660e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3661f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3662g;

    /* renamed from: h, reason: collision with root package name */
    public final l f3663h;

    /* renamed from: j, reason: collision with root package name */
    public SystemForegroundService f3664j;

    public b(Context context) {
        t0 t0VarB = t0.b(context);
        this.f3656a = t0VarB;
        this.f3657b = t0VarB.f29339d;
        this.f3659d = null;
        this.f3660e = new LinkedHashMap();
        this.f3662g = new HashMap();
        this.f3661f = new HashMap();
        this.f3663h = new l(t0VarB.f29345j);
        t0VarB.f29341f.a(this);
    }

    public static Intent c(Context context, j jVar, t6.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f5006a);
        intent.putExtra("KEY_GENERATION", jVar.f5007b);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f28029a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f28030b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f28031c);
        return intent;
    }

    @Override // y6.h
    public final void a(WorkSpec workSpec, y6.b bVar) {
        if (bVar instanceof b.C0345b) {
            String str = workSpec.f3167a;
            s.d().a(f3655k, "Constraints unmet for WorkSpec " + str);
            j jVarA = i0.a(workSpec);
            int i10 = ((b.C0345b) bVar).f33960a;
            t0 t0Var = this.f3656a;
            t0Var.f29339d.d(new t(t0Var.f29341f, new x(jVarA), true, i10));
        }
    }

    @Override // u6.e
    public final void b(j jVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f3658c) {
            try {
                s1 s1Var = ((WorkSpec) this.f3661f.remove(jVar)) != null ? (s1) this.f3662g.remove(jVar) : null;
                if (s1Var != null) {
                    s1Var.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t6.j jVar2 = (t6.j) this.f3660e.remove(jVar);
        if (jVar.equals(this.f3659d)) {
            if (this.f3660e.size() > 0) {
                Iterator it = this.f3660e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f3659d = (j) entry.getKey();
                if (this.f3664j != null) {
                    t6.j jVar3 = (t6.j) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f3664j;
                    int i10 = jVar3.f28029a;
                    int i11 = jVar3.f28030b;
                    Notification notification = jVar3.f28031c;
                    systemForegroundService.getClass();
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 31) {
                        SystemForegroundService.b.a(systemForegroundService, i10, notification, i11);
                    } else if (i12 >= 29) {
                        SystemForegroundService.a.a(systemForegroundService, i10, notification, i11);
                    } else {
                        systemForegroundService.startForeground(i10, notification);
                    }
                    this.f3664j.f3159d.cancel(jVar3.f28029a);
                }
            } else {
                this.f3659d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f3664j;
        if (jVar2 == null || systemForegroundService2 == null) {
            return;
        }
        s.d().a(f3655k, "Removing Notification (id: " + jVar2.f28029a + ", workSpecId: " + jVar + ", notificationType: " + jVar2.f28030b);
        systemForegroundService2.f3159d.cancel(jVar2.f28029a);
    }

    public final void d(Intent intent) {
        if (this.f3664j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s.d().a(f3655k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        t6.j jVar2 = new t6.j(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f3660e;
        linkedHashMap.put(jVar, jVar2);
        t6.j jVar3 = (t6.j) linkedHashMap.get(this.f3659d);
        if (jVar3 == null) {
            this.f3659d = jVar;
        } else {
            this.f3664j.f3159d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((t6.j) ((Map.Entry) it.next()).getValue()).f28030b;
                }
                jVar2 = new t6.j(jVar3.f28029a, jVar3.f28031c, i10);
            } else {
                jVar2 = jVar3;
            }
        }
        SystemForegroundService systemForegroundService = this.f3664j;
        int i11 = jVar2.f28029a;
        int i12 = jVar2.f28030b;
        Notification notification2 = jVar2.f28031c;
        systemForegroundService.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i11, notification2, i12);
        } else if (i13 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i11, notification2, i12);
        } else {
            systemForegroundService.startForeground(i11, notification2);
        }
    }

    public final void e() {
        this.f3664j = null;
        synchronized (this.f3658c) {
            try {
                Iterator it = this.f3662g.values().iterator();
                while (it.hasNext()) {
                    ((s1) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3656a.f29341f.e(this);
    }

    public final void f(int i10) {
        s.d().e(f3655k, "Foreground service timed out, FGS type: " + i10);
        for (Map.Entry entry : this.f3660e.entrySet()) {
            if (((t6.j) entry.getValue()).f28030b == i10) {
                j jVar = (j) entry.getKey();
                t0 t0Var = this.f3656a;
                t0Var.f29339d.d(new t(t0Var.f29341f, new x(jVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f3664j;
        if (systemForegroundService != null) {
            systemForegroundService.f3157b = true;
            s.d().a(SystemForegroundService.f3156e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
        }
    }
}
