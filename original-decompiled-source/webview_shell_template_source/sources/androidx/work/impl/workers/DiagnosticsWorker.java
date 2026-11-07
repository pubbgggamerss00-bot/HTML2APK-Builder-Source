package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.camera.camera2.internal.i0;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.k;
import com.google.android.gms.ads.mediation.customevent.b;
import com.google.android.gms.internal.ads.ni0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import r2.e;
import r2.l;
import r2.m;
import r2.s;
import r2.u;
import v1.i;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String s = k.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(ni0 ni0Var, ni0 ni0Var2, b bVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            l lVar = (l) obj;
            e eVarA = bVar.a(lVar.f14280a);
            Integer numValueOf = eVarA != null ? Integer.valueOf(eVarA.f14273b) : null;
            String str = lVar.f14280a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ni0Var.f7447t;
            i iVarA = i.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                iVarA.e(1);
            } else {
                iVarA.f(1, str);
            }
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(iVarA);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                iVarA.h();
                ArrayList arrayListG = ni0Var2.g(lVar.f14280a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListG);
                String str2 = lVar.f14280a;
                String str3 = lVar.f14282c;
                String strName = lVar.f14281b.name();
                StringBuilder sbA = i0.a("\n", str2, "\t ", str3, "\t ");
                sbA.append(numValueOf);
                sbA.append("\t ");
                sbA.append(strName);
                sbA.append("\t ");
                sbA.append(strJoin);
                sbA.append("\t ");
                sbA.append(strJoin2);
                sbA.append("\t");
                sb.append(sbA.toString());
            } catch (Throwable th) {
                cursorG.close();
                iVarA.h();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() throws Throwable {
        i iVar;
        b bVar;
        ni0 ni0Var;
        ni0 ni0Var2;
        int i6;
        WorkDatabase workDatabase = j2.k.b(getApplicationContext()).f13476c;
        m mVarN = workDatabase.n();
        ni0 ni0VarL = workDatabase.l();
        ni0 ni0VarO = workDatabase.o();
        b bVarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        s sVar = (s) mVarN;
        sVar.getClass();
        i iVarA = i.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        iVarA.c(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = sVar.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            int iC = b0.c(cursorG, "required_network_type");
            int iC2 = b0.c(cursorG, "requires_charging");
            int iC3 = b0.c(cursorG, "requires_device_idle");
            int iC4 = b0.c(cursorG, "requires_battery_not_low");
            int iC5 = b0.c(cursorG, "requires_storage_not_low");
            int iC6 = b0.c(cursorG, "trigger_content_update_delay");
            int iC7 = b0.c(cursorG, "trigger_max_content_delay");
            int iC8 = b0.c(cursorG, "content_uri_triggers");
            int iC9 = b0.c(cursorG, "id");
            int iC10 = b0.c(cursorG, "state");
            int iC11 = b0.c(cursorG, "worker_class_name");
            iVar = iVarA;
            try {
                int iC12 = b0.c(cursorG, "input_merger_class_name");
                int iC13 = b0.c(cursorG, "input");
                int iC14 = b0.c(cursorG, "output");
                int iC15 = b0.c(cursorG, "initial_delay");
                int iC16 = b0.c(cursorG, "interval_duration");
                int iC17 = b0.c(cursorG, "flex_duration");
                int iC18 = b0.c(cursorG, "run_attempt_count");
                int iC19 = b0.c(cursorG, "backoff_policy");
                int iC20 = b0.c(cursorG, "backoff_delay_duration");
                int iC21 = b0.c(cursorG, "period_start_time");
                int iC22 = b0.c(cursorG, "minimum_retention_duration");
                int iC23 = b0.c(cursorG, "schedule_requested_at");
                int iC24 = b0.c(cursorG, "run_in_foreground");
                int iC25 = b0.c(cursorG, "out_of_quota_policy");
                int i7 = iC14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iC9);
                    int i8 = iC9;
                    String string2 = cursorG.getString(iC11);
                    int i9 = iC11;
                    d dVar = new d();
                    int i10 = iC;
                    dVar.f1764a = u.c(cursorG.getInt(iC));
                    dVar.f1765b = cursorG.getInt(iC2) != 0;
                    dVar.f1766c = cursorG.getInt(iC3) != 0;
                    dVar.f1767d = cursorG.getInt(iC4) != 0;
                    dVar.f1768e = cursorG.getInt(iC5) != 0;
                    int i11 = iC2;
                    int i12 = iC3;
                    dVar.f1769f = cursorG.getLong(iC6);
                    dVar.f1770g = cursorG.getLong(iC7);
                    dVar.h = u.a(cursorG.getBlob(iC8));
                    l lVar = new l(string, string2);
                    lVar.f14281b = u.e(cursorG.getInt(iC10));
                    lVar.f14283d = cursorG.getString(iC12);
                    lVar.f14284e = f.a(cursorG.getBlob(iC13));
                    int i13 = i7;
                    lVar.f14285f = f.a(cursorG.getBlob(i13));
                    int i14 = iC10;
                    int i15 = iC15;
                    lVar.f14286g = cursorG.getLong(i15);
                    int i16 = iC16;
                    int i17 = iC12;
                    lVar.h = cursorG.getLong(i16);
                    int i18 = iC4;
                    int i19 = iC17;
                    lVar.f14287i = cursorG.getLong(i19);
                    int i20 = iC18;
                    lVar.f14289k = cursorG.getInt(i20);
                    int i21 = iC19;
                    int i22 = iC13;
                    lVar.f14290l = u.b(cursorG.getInt(i21));
                    int i23 = iC20;
                    lVar.f14291m = cursorG.getLong(i23);
                    int i24 = iC21;
                    lVar.f14292n = cursorG.getLong(i24);
                    int i25 = iC22;
                    lVar.f14293o = cursorG.getLong(i25);
                    int i26 = iC23;
                    lVar.f14294p = cursorG.getLong(i26);
                    int i27 = iC24;
                    lVar.f14295q = cursorG.getInt(i27) != 0;
                    int i28 = iC25;
                    lVar.f14296r = u.d(cursorG.getInt(i28));
                    lVar.f14288j = dVar;
                    arrayList.add(lVar);
                    iC18 = i20;
                    iC12 = i17;
                    iC16 = i16;
                    iC21 = i24;
                    iC4 = i18;
                    i7 = i13;
                    iC24 = i27;
                    iC2 = i11;
                    iC15 = i15;
                    iC13 = i22;
                    iC17 = i19;
                    iC19 = i21;
                    iC22 = i25;
                    iC20 = i23;
                    iC11 = i9;
                    iC = i10;
                    iC25 = i28;
                    iC23 = i26;
                    iC10 = i14;
                    iC9 = i8;
                    iC3 = i12;
                }
                cursorG.close();
                iVar.h();
                ArrayList arrayListD = sVar.d();
                ArrayList arrayListB = sVar.b();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = s;
                if (zIsEmpty) {
                    bVar = bVarK;
                    ni0Var = ni0VarL;
                    ni0Var2 = ni0VarO;
                    i6 = 0;
                } else {
                    i6 = 0;
                    k.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
                    bVar = bVarK;
                    ni0Var = ni0VarL;
                    ni0Var2 = ni0VarO;
                    k.c().d(str, a(ni0Var, ni0Var2, bVar, arrayList), new Throwable[0]);
                }
                if (!arrayListD.isEmpty()) {
                    k.c().d(str, "Running work:\n\n", new Throwable[i6]);
                    k.c().d(str, a(ni0Var, ni0Var2, bVar, arrayListD), new Throwable[i6]);
                }
                if (!arrayListB.isEmpty()) {
                    k.c().d(str, "Enqueued work:\n\n", new Throwable[i6]);
                    k.c().d(str, a(ni0Var, ni0Var2, bVar, arrayListB), new Throwable[i6]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                iVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = iVarA;
        }
    }
}
