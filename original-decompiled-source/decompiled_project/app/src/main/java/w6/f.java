package w6;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c7.j;
import d7.b0;
import d7.u;
import e7.c;
import gb.h;
import java.util.ArrayList;
import t6.s;
import u6.q0;
import u6.r;
import u6.s0;
import u6.t0;
import u6.y;

/* loaded from: classes.dex */
public final class f implements u6.e {

    /* renamed from: l, reason: collision with root package name */
    public static final String f31303l = s.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f31304a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.b f31305b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f31306c;

    /* renamed from: d, reason: collision with root package name */
    public final r f31307d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f31308e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.b f31309f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31310g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f31311h;

    /* renamed from: j, reason: collision with root package name */
    public SystemAlarmService f31312j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f31313k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.a aVarB;
            c cVar;
            synchronized (f.this.f31310g) {
                f fVar = f.this;
                fVar.f31311h = (Intent) fVar.f31310g.get(0);
            }
            Intent intent = f.this.f31311h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = f.this.f31311h.getIntExtra("KEY_START_ID", 0);
                s sVarD = s.d();
                String str = f.f31303l;
                sVarD.a(str, "Processing command " + f.this.f31311h + ", " + intExtra);
                PowerManager.WakeLock wakeLockA = u.a(f.this.f31304a, action + " (" + intExtra + ")");
                try {
                    s.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.acquire();
                    f fVar2 = f.this;
                    fVar2.f31309f.a(intExtra, fVar2.f31311h, fVar2);
                    s.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    aVarB = f.this.f31305b.b();
                    cVar = new c(f.this);
                } catch (Throwable th2) {
                    try {
                        s sVarD2 = s.d();
                        String str2 = f.f31303l;
                        sVarD2.c(str2, "Unexpected error in onHandleIntent", th2);
                        s.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        aVarB = f.this.f31305b.b();
                        cVar = new c(f.this);
                    } catch (Throwable th3) {
                        s.d().a(f.f31303l, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        f.this.f31305b.b().execute(new c(f.this));
                        throw th3;
                    }
                }
                aVarB.execute(cVar);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f f31315a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f31316b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31317c;

        public b(int i10, Intent intent, f fVar) {
            this.f31315a = fVar;
            this.f31316b = intent;
            this.f31317c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f31315a.a(this.f31316b, this.f31317c);
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f f31318a;

        public c(f fVar) {
            this.f31318a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x0094, B:31:0x0088, B:32:0x0089, B:34:0x0091, B:39:0x0098, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            f fVar = this.f31318a;
            s sVarD = s.d();
            String str = f.f31303l;
            sVarD.a(str, "Checking if commands are complete.");
            f.c();
            synchronized (fVar.f31310g) {
                try {
                    if (fVar.f31311h != null) {
                        s.d().a(str, "Removing command " + fVar.f31311h);
                        if (!((Intent) fVar.f31310g.remove(0)).equals(fVar.f31311h)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        fVar.f31311h = null;
                    }
                    d7.s sVarC = fVar.f31305b.c();
                    w6.b bVar = fVar.f31309f;
                    synchronized (bVar.f31280c) {
                        zIsEmpty = bVar.f31279b.isEmpty();
                    }
                    if (zIsEmpty && fVar.f31310g.isEmpty()) {
                        synchronized (sVarC.f7397d) {
                            zIsEmpty2 = sVarC.f7394a.isEmpty();
                        }
                        if (zIsEmpty2) {
                            s.d().a(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = fVar.f31312j;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        }
                    } else if (!fVar.f31310g.isEmpty()) {
                        fVar.d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public f(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f31304a = applicationContext;
        y yVar = new y(new h());
        t0 t0VarB = t0.b(systemAlarmService);
        this.f31308e = t0VarB;
        this.f31309f = new w6.b(applicationContext, t0VarB.f29337b.f3119d, yVar);
        this.f31306c = new b0(t0VarB.f29337b.f3122g);
        r rVar = t0VarB.f29341f;
        this.f31307d = rVar;
        e7.b bVar = t0VarB.f29339d;
        this.f31305b = bVar;
        this.f31313k = new s0(rVar, bVar);
        rVar.a(this);
        this.f31310g = new ArrayList();
        this.f31311h = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i10) {
        s sVarD = s.d();
        String str = f31303l;
        sVarD.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f31310g) {
                try {
                    ArrayList arrayList = this.f31310g;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f31310g) {
            try {
                boolean zIsEmpty = this.f31310g.isEmpty();
                this.f31310g.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // u6.e
    public final void b(j jVar, boolean z10) {
        c.a aVarB = this.f31305b.b();
        String str = w6.b.f31277f;
        Intent intent = new Intent(this.f31304a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        w6.b.d(intent, jVar);
        aVarB.execute(new b(0, intent, this));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = u.a(this.f31304a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f31308e.f29339d.d(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
