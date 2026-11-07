package l2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.v0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.HashMap;
import l2.e;
import r2.l;
import r2.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements j2.b {

    /* renamed from: v, reason: collision with root package name */
    public static final String f13821v = k.e("CommandHandler");
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f13822t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final Object f13823u = new Object();

    public b(Context context) {
        this.s = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // j2.b
    public final void c(String str, boolean z6) {
        synchronized (this.f13823u) {
            try {
                j2.b bVar = (j2.b) this.f13822t.remove(str);
                if (bVar != null) {
                    bVar.c(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i6, Intent intent, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            k.c().a(f13821v, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.s;
            c cVar = new c(context, i6, eVar);
            n2.d dVar = cVar.f13826b;
            ArrayList arrayListE = ((s) eVar.f13837w.f13476c.n()).e();
            String str = ConstraintProxy.f1804a;
            int size = arrayListE.size();
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayListE.get(i7);
                i7++;
                androidx.work.d dVar2 = ((l) obj).f14288j;
                z6 |= dVar2.f1767d;
                z7 |= dVar2.f1765b;
                z8 |= dVar2.f1768e;
                z9 |= dVar2.f1764a != androidx.work.l.s;
                if (z6 && z7 && z8 && z9) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1805a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
            context.sendBroadcast(intent2);
            dVar.b(arrayListE);
            ArrayList arrayList = new ArrayList(arrayListE.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListE.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayListE.get(i8);
                i8++;
                l lVar = (l) obj2;
                String str3 = lVar.f14280a;
                if (jCurrentTimeMillis >= lVar.a() && (!lVar.b() || dVar.a(str3))) {
                    arrayList.add(lVar);
                }
            }
            int size3 = arrayList.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                String str4 = ((l) obj3).f14280a;
                Intent intentA = a(context, str4);
                k.c().a(c.f13824c, v0.b("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                eVar.e(new e.b(cVar.f13825a, intentA, eVar));
            }
            dVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k.c().a(f13821v, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
            eVar.f13837w.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            k.c().b(f13821v, v0.b("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f13823u) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        k kVarC = k.c();
                        String str5 = f13821v;
                        kVarC.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f13822t.containsKey(string)) {
                            k.c().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            d dVar3 = new d(this.s, i6, string, eVar);
                            this.f13822t.put(string, dVar3);
                            dVar3.d();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    k.c().f(f13821v, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z10 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                k.c().a(f13821v, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
                c(string2, z10);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            k.c().a(f13821v, k0.a("Handing stopWork work for ", string3), new Throwable[0]);
            eVar.f13837w.g(string3);
            Context context2 = this.s;
            j2.k kVar = eVar.f13837w;
            String str6 = a.f13820a;
            com.google.android.gms.ads.mediation.customevent.b bVarK = kVar.f13476c.k();
            r2.e eVarA = bVarK.a(string3);
            if (eVarA != null) {
                a.a(context2, string3, eVarA.f14273b);
                k.c().a(a.f13820a, v0.b("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                bVarK.e(string3);
            }
            eVar.c(string3, false);
            return;
        }
        Context context3 = this.s;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k kVarC2 = k.c();
        String str7 = f13821v;
        kVarC2.a(str7, k0.a("Handling schedule work for ", string4), new Throwable[0]);
        j2.k kVar2 = eVar.f13837w;
        WorkDatabase workDatabase = kVar2.f13476c;
        workDatabase.c();
        try {
            l lVarI = ((s) workDatabase.n()).i(string4);
            if (lVarI == null) {
                k.c().f(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (lVarI.f14281b.a()) {
                k.c().f(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = lVarI.a();
            if (lVarI.b()) {
                k.c().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, kVar2, string4, jA);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                eVar.e(new e.b(i6, intent3, eVar));
            } else {
                k.c().a(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, kVar2, string4, jA);
            }
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
