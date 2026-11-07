package l2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.camera.camera2.internal.k0;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l2.e;
import r2.l;
import s2.n;
import s2.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements n2.c, j2.b, s.b {
    public static final String B = k.e("DelayMetCommandHandler");
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13827t;

    /* renamed from: u, reason: collision with root package name */
    public final String f13828u;

    /* renamed from: v, reason: collision with root package name */
    public final e f13829v;

    /* renamed from: w, reason: collision with root package name */
    public final n2.d f13830w;

    /* renamed from: z, reason: collision with root package name */
    public PowerManager.WakeLock f13833z;
    public boolean A = false;

    /* renamed from: y, reason: collision with root package name */
    public int f13832y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Object f13831x = new Object();

    public d(Context context, int i6, String str, e eVar) {
        this.s = context;
        this.f13827t = i6;
        this.f13829v = eVar;
        this.f13828u = str;
        this.f13830w = new n2.d(context, eVar.f13834t, this);
    }

    @Override // s2.s.b
    public final void a(String str) {
        k.c().a(B, k0.a("Exceeded time limits on execution for ", str), new Throwable[0]);
        g();
    }

    public final void b() {
        synchronized (this.f13831x) {
            try {
                this.f13830w.c();
                this.f13829v.f13835u.b(this.f13828u);
                PowerManager.WakeLock wakeLock = this.f13833z;
                if (wakeLock != null && wakeLock.isHeld()) {
                    k.c().a(B, "Releasing wakelock " + this.f13833z + " for WorkSpec " + this.f13828u, new Throwable[0]);
                    this.f13833z.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        k.c().a(B, "onExecuted " + str + ", " + z6, new Throwable[0]);
        b();
        int i6 = this.f13827t;
        e eVar = this.f13829v;
        Context context = this.s;
        if (z6) {
            eVar.e(new e.b(i6, b.b(context, this.f13828u), eVar));
        }
        if (this.A) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            eVar.e(new e.b(i6, intent, eVar));
        }
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13828u;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f13827t);
        sb.append(")");
        this.f13833z = n.a(this.s, sb.toString());
        k kVarC = k.c();
        PowerManager.WakeLock wakeLock = this.f13833z;
        String str2 = B;
        kVarC.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f13833z.acquire();
        l lVarI = ((r2.s) this.f13829v.f13837w.f13476c.n()).i(str);
        if (lVarI == null) {
            g();
            return;
        }
        boolean zB = lVarI.b();
        this.A = zB;
        if (zB) {
            this.f13830w.b(Collections.singletonList(lVarI));
        } else {
            k.c().a(str2, k0.a("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // n2.c
    public final void e(ArrayList arrayList) {
        g();
    }

    @Override // n2.c
    public final void f(List<String> list) {
        if (list.contains(this.f13828u)) {
            synchronized (this.f13831x) {
                try {
                    if (this.f13832y == 0) {
                        this.f13832y = 1;
                        k.c().a(B, "onAllConstraintsMet for " + this.f13828u, new Throwable[0]);
                        if (this.f13829v.f13836v.g(this.f13828u, null)) {
                            this.f13829v.f13835u.a(this.f13828u, this);
                        } else {
                            b();
                        }
                    } else {
                        k.c().a(B, "Already started work for " + this.f13828u, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f13831x) {
            try {
                if (this.f13832y < 2) {
                    this.f13832y = 2;
                    k kVarC = k.c();
                    String str = B;
                    kVarC.a(str, "Stopping work for WorkSpec " + this.f13828u, new Throwable[0]);
                    Context context = this.s;
                    String str2 = this.f13828u;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    e eVar = this.f13829v;
                    eVar.e(new e.b(this.f13827t, intent, eVar));
                    if (this.f13829v.f13836v.d(this.f13828u)) {
                        k.c().a(str, "WorkSpec " + this.f13828u + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = b.b(this.s, this.f13828u);
                        e eVar2 = this.f13829v;
                        eVar2.e(new e.b(this.f13827t, intentB, eVar2));
                    } else {
                        k.c().a(str, "Processor does not have WorkSpec " + this.f13828u + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    k.c().a(B, "Already stopped work for " + this.f13828u, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
