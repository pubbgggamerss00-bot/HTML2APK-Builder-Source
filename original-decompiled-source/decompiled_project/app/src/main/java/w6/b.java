package w6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import c7.i0;
import c7.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t6.s;
import t6.t;
import u6.x;
import u6.y;
import w6.f;
import y6.l;
import y6.n;

/* loaded from: classes.dex */
public final class b implements u6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final String f31277f = s.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f31278a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f31279b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f31280c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final t6.b f31281d;

    /* renamed from: e, reason: collision with root package name */
    public final y f31282e;

    public b(Context context, l5.c cVar, y yVar) {
        this.f31278a = context;
        this.f31281d = cVar;
        this.f31282e = yVar;
    }

    public static j c(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f5006a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f5007b);
    }

    public final void a(int i10, Intent intent, f fVar) {
        List<x> listB;
        ArrayList arrayList;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f31277f, "Handling constraints changed " + intent);
            Context context = this.f31278a;
            c cVar = new c(context, this.f31281d, i10, fVar);
            ArrayList arrayListL = fVar.f31308e.f29338c.workSpecDao().l();
            String str = ConstraintProxy.f3141a;
            int size = arrayListL.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListL.get(i11);
                i11++;
                t6.e eVar = ((WorkSpec) obj).f3176j;
                z10 |= eVar.f28006e;
                z11 |= eVar.f28004c;
                z12 |= eVar.f28007f;
                z13 |= eVar.f28002a != t.f28052a;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3142a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            ArrayList arrayList2 = new ArrayList(arrayListL.size());
            long jA = cVar.f31284a.a();
            int size2 = arrayListL.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayListL.get(i12);
                i12++;
                WorkSpec workSpec = (WorkSpec) obj2;
                if (jA >= workSpec.a()) {
                    if (workSpec.b()) {
                        ArrayList arrayList3 = cVar.f31286c.f33987a;
                        ArrayList arrayList4 = new ArrayList();
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj3 = arrayList3.get(i13);
                            i13++;
                            ArrayList arrayList5 = arrayListL;
                            if (((z6.e) obj3).c(workSpec)) {
                                arrayList4.add(obj3);
                            }
                            arrayListL = arrayList5;
                        }
                        arrayList = arrayListL;
                        if (!arrayList4.isEmpty()) {
                            s.d().a(n.f34000a, "Work " + workSpec.f3167a + " constrained by " + qg.x.I(arrayList4, null, null, null, l.a.f33988a, 31));
                        }
                        if (arrayList4.isEmpty()) {
                        }
                    } else {
                        arrayList = arrayListL;
                    }
                    arrayList2.add(workSpec);
                } else {
                    arrayList = arrayListL;
                }
                arrayListL = arrayList;
            }
            int size4 = arrayList2.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList2.get(i14);
                i14++;
                WorkSpec workSpec2 = (WorkSpec) obj4;
                String str3 = workSpec2.f3167a;
                j jVarA = i0.a(workSpec2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, jVarA);
                s.d().a(c.f31283d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                fVar.f31305b.b().execute(new f.b(cVar.f31285b, intent3, fVar));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f31277f, "Handling reschedule " + intent + ", " + i10);
            fVar.f31308e.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f31277f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f31278a;
            j jVarC = c(intent);
            s sVarD = s.d();
            String str4 = f31277f;
            sVarD.a(str4, "Handling schedule work for " + jVarC);
            WorkDatabase workDatabase = fVar.f31308e.f29338c;
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpecS = workDatabase.workSpecDao().s(jVarC.f5006a);
                if (workSpecS == null) {
                    s.d().g(str4, "Skipping scheduling " + jVarC + " because it's no longer in the DB");
                    return;
                }
                if (workSpecS.f3168b.a()) {
                    s.d().g(str4, "Skipping scheduling " + jVarC + "because it is finished.");
                    return;
                }
                long jA2 = workSpecS.a();
                if (workSpecS.b()) {
                    s.d().a(str4, "Opportunistically setting an alarm for " + jVarC + "at " + jA2);
                    a.b(context2, workDatabase, jVarC, jA2);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    fVar.f31305b.b().execute(new f.b(i10, intent4, fVar));
                } else {
                    s.d().a(str4, "Setting up Alarms for " + jVarC + "at " + jA2);
                    a.b(context2, workDatabase, jVarC, jA2);
                }
                workDatabase.setTransactionSuccessful();
                return;
            } finally {
                workDatabase.endTransaction();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f31280c) {
                try {
                    j jVarC2 = c(intent);
                    s sVarD2 = s.d();
                    String str5 = f31277f;
                    sVarD2.a(str5, "Handing delay met for " + jVarC2);
                    if (this.f31279b.containsKey(jVarC2)) {
                        s.d().a(str5, "WorkSpec " + jVarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        e eVar2 = new e(this.f31278a, i10, fVar, this.f31282e.d(jVarC2));
                        this.f31279b.put(jVarC2, eVar2);
                        eVar2.f();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f31277f, "Ignoring intent " + intent);
                return;
            }
            j jVarC3 = c(intent);
            boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f31277f, "Handling onExecutionCompleted " + intent + ", " + i10);
            b(jVarC3, z14);
            return;
        }
        y yVar = this.f31282e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i15 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList6 = new ArrayList(1);
            x xVarC = yVar.c(new j(string, i15));
            listB = arrayList6;
            if (xVarC != null) {
                arrayList6.add(xVarC);
                listB = arrayList6;
            }
        } else {
            listB = yVar.b(string);
        }
        for (x xVar : listB) {
            s.d().a(f31277f, "Handing stopWork work for " + string);
            fVar.f31313k.b(xVar);
            Context context3 = this.f31278a;
            WorkDatabase workDatabase2 = fVar.f31308e.f29338c;
            j jVar = xVar.f29358a;
            String str6 = a.f31276a;
            SystemIdInfoDao systemIdInfoDao = workDatabase2.systemIdInfoDao();
            SystemIdInfo systemIdInfoE = systemIdInfoDao.e(jVar);
            if (systemIdInfoE != null) {
                a.a(context3, jVar, systemIdInfoE.f3166c);
                s.d().a(a.f31276a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                systemIdInfoDao.d(jVar);
            }
            fVar.b(xVar.f29358a, false);
        }
    }

    @Override // u6.e
    public final void b(j jVar, boolean z10) {
        synchronized (this.f31280c) {
            try {
                e eVar = (e) this.f31279b.remove(jVar);
                this.f31282e.c(jVar);
                if (eVar != null) {
                    eVar.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
