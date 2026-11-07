package l2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import s2.n;
import s2.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements j2.b {
    public static final String C = k.e("SystemAlarmDispatcher");
    public Intent A;
    public SystemAlarmService B;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final u2.a f13834t;

    /* renamed from: u, reason: collision with root package name */
    public final s f13835u;

    /* renamed from: v, reason: collision with root package name */
    public final j2.d f13836v;

    /* renamed from: w, reason: collision with root package name */
    public final j2.k f13837w;

    /* renamed from: x, reason: collision with root package name */
    public final l2.b f13838x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f13839y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f13840z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar;
            c cVar;
            synchronized (e.this.f13840z) {
                e eVar2 = e.this;
                eVar2.A = (Intent) eVar2.f13840z.get(0);
            }
            Intent intent = e.this.A;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.A.getIntExtra("KEY_START_ID", 0);
                k kVarC = k.c();
                String str = e.C;
                kVarC.a(str, String.format("Processing command %s, %s", e.this.A, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockA = n.a(e.this.s, action + " (" + intExtra + ")");
                try {
                    k.c().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.acquire();
                    e eVar3 = e.this;
                    eVar3.f13838x.d(intExtra, eVar3.A, eVar3);
                    k.c().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.release();
                    eVar = e.this;
                    cVar = new c(eVar);
                } catch (Throwable th) {
                    try {
                        k kVarC2 = k.c();
                        String str2 = e.C;
                        kVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        k.c().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        eVar = e.this;
                        cVar = new c(eVar);
                    } catch (Throwable th2) {
                        k.c().a(e.C, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        e eVar4 = e.this;
                        eVar4.e(new c(eVar4));
                        throw th2;
                    }
                }
                eVar.e(cVar);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b implements Runnable {
        public final e s;

        /* renamed from: t, reason: collision with root package name */
        public final Intent f13841t;

        /* renamed from: u, reason: collision with root package name */
        public final int f13842u;

        public b(int i6, Intent intent, e eVar) {
            this.s = eVar;
            this.f13841t = intent;
            this.f13842u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.a(this.f13841t, this.f13842u);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements Runnable {
        public final e s;

        public c(e eVar) {
            this.s = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0016, B:6:0x001a, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0084, B:35:0x0096, B:31:0x008a, B:32:0x008b, B:34:0x0093, B:39:0x009a, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0016, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            e eVar = this.s;
            k kVarC = k.c();
            String str = e.C;
            kVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
            eVar.b();
            synchronized (eVar.f13840z) {
                try {
                    if (eVar.A != null) {
                        k.c().a(str, String.format("Removing command %s", eVar.A), new Throwable[0]);
                        if (!((Intent) eVar.f13840z.remove(0)).equals(eVar.A)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        eVar.A = null;
                    }
                    s2.k kVar = ((u2.b) eVar.f13834t).f14593a;
                    l2.b bVar = eVar.f13838x;
                    synchronized (bVar.f13823u) {
                        zIsEmpty = bVar.f13822t.isEmpty();
                    }
                    if (zIsEmpty && eVar.f13840z.isEmpty()) {
                        synchronized (kVar.f14364u) {
                            zIsEmpty2 = kVar.s.isEmpty();
                        }
                        if (zIsEmpty2) {
                            k.c().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = eVar.B;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        }
                    } else if (!eVar.f13840z.isEmpty()) {
                        eVar.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public e(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.s = applicationContext;
        this.f13838x = new l2.b(applicationContext);
        this.f13835u = new s();
        j2.k kVarB = j2.k.b(systemAlarmService);
        this.f13837w = kVarB;
        j2.d dVar = kVarB.f13479f;
        this.f13836v = dVar;
        this.f13834t = kVarB.f13477d;
        dVar.a(this);
        this.f13840z = new ArrayList();
        this.A = null;
        this.f13839y = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i6) {
        k kVarC = k.c();
        String str = C;
        int i7 = 0;
        kVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i6)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f13840z) {
                try {
                    ArrayList arrayList = this.f13840z;
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i6);
        synchronized (this.f13840z) {
            try {
                boolean zIsEmpty = this.f13840z.isEmpty();
                this.f13840z.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f13839y.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        String str2 = l2.b.f13821v;
        Intent intent = new Intent(this.s, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        e(new b(0, intent, this));
    }

    public final void d() {
        k.c().a(C, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f13836v.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f13835u.f14392a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.B = null;
    }

    public final void e(Runnable runnable) {
        this.f13839y.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = n.a(this.s, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f13837w.f13477d.a(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
