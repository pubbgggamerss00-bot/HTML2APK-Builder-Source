package r2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.l;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f14299a;

    /* renamed from: b, reason: collision with root package name */
    public final n f14300b;

    /* renamed from: c, reason: collision with root package name */
    public final o f14301c;

    /* renamed from: d, reason: collision with root package name */
    public final p f14302d;

    /* renamed from: e, reason: collision with root package name */
    public final q f14303e;

    /* renamed from: f, reason: collision with root package name */
    public final j f14304f;

    /* renamed from: g, reason: collision with root package name */
    public final k f14305g;
    public final g h;

    /* renamed from: i, reason: collision with root package name */
    public final r f14306i;

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f14299a = workDatabase_Impl;
        this.f14300b = new n(workDatabase_Impl);
        this.f14301c = new o(workDatabase_Impl);
        this.f14302d = new p(workDatabase_Impl);
        this.f14303e = new q(workDatabase_Impl);
        this.f14304f = new j(workDatabase_Impl, 1);
        this.f14305g = new k(workDatabase_Impl, 1);
        this.h = new g(workDatabase_Impl, 1);
        this.f14306i = new r(workDatabase_Impl);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        o oVar = this.f14301c;
        a2.e eVarA = oVar.a();
        if (str == null) {
            eVarA.c(1);
        } else {
            eVarA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            eVarA.e();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            oVar.c(eVarA);
        }
    }

    public final ArrayList b() throws Throwable {
        v1.i iVar;
        v1.i iVarA = v1.i.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        iVarA.c(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
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
            int iC12 = b0.c(cursorG, "input_merger_class_name");
            int iC13 = b0.c(cursorG, "input");
            iVar = iVarA;
            try {
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
                int i6 = iC14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iC9);
                    int i7 = iC9;
                    String string2 = cursorG.getString(iC11);
                    int i8 = iC11;
                    androidx.work.d dVar = new androidx.work.d();
                    int i9 = iC;
                    dVar.f1764a = u.c(cursorG.getInt(iC));
                    dVar.f1765b = cursorG.getInt(iC2) != 0;
                    dVar.f1766c = cursorG.getInt(iC3) != 0;
                    dVar.f1767d = cursorG.getInt(iC4) != 0;
                    dVar.f1768e = cursorG.getInt(iC5) != 0;
                    int i10 = iC2;
                    dVar.f1769f = cursorG.getLong(iC6);
                    dVar.f1770g = cursorG.getLong(iC7);
                    dVar.h = u.a(cursorG.getBlob(iC8));
                    l lVar = new l(string, string2);
                    lVar.f14281b = u.e(cursorG.getInt(iC10));
                    lVar.f14283d = cursorG.getString(iC12);
                    lVar.f14284e = androidx.work.f.a(cursorG.getBlob(iC13));
                    int i11 = i6;
                    lVar.f14285f = androidx.work.f.a(cursorG.getBlob(i11));
                    int i12 = iC13;
                    i6 = i11;
                    int i13 = iC15;
                    lVar.f14286g = cursorG.getLong(i13);
                    iC15 = i13;
                    int i14 = iC3;
                    int i15 = iC16;
                    lVar.h = cursorG.getLong(i15);
                    iC16 = i15;
                    int i16 = iC17;
                    lVar.f14287i = cursorG.getLong(i16);
                    int i17 = iC18;
                    lVar.f14289k = cursorG.getInt(i17);
                    int i18 = iC19;
                    iC18 = i17;
                    lVar.f14290l = u.b(cursorG.getInt(i18));
                    iC17 = i16;
                    int i19 = iC20;
                    lVar.f14291m = cursorG.getLong(i19);
                    iC20 = i19;
                    int i20 = iC21;
                    lVar.f14292n = cursorG.getLong(i20);
                    iC21 = i20;
                    int i21 = iC22;
                    lVar.f14293o = cursorG.getLong(i21);
                    iC22 = i21;
                    int i22 = iC23;
                    lVar.f14294p = cursorG.getLong(i22);
                    int i23 = iC24;
                    lVar.f14295q = cursorG.getInt(i23) != 0;
                    int i24 = iC25;
                    iC24 = i23;
                    lVar.f14296r = u.d(cursorG.getInt(i24));
                    lVar.f14288j = dVar;
                    arrayList.add(lVar);
                    iC19 = i18;
                    iC3 = i14;
                    iC25 = i24;
                    iC23 = i22;
                    iC13 = i12;
                    iC9 = i7;
                    iC11 = i8;
                    iC = i9;
                    iC2 = i10;
                }
                cursorG.close();
                iVar.h();
                return arrayList;
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

    public final ArrayList c(int i6) throws Throwable {
        v1.i iVar;
        v1.i iVarA = v1.i.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        iVarA.c(1, i6);
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
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
            int iC12 = b0.c(cursorG, "input_merger_class_name");
            int iC13 = b0.c(cursorG, "input");
            iVar = iVarA;
            try {
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
                    androidx.work.d dVar = new androidx.work.d();
                    int i10 = iC;
                    dVar.f1764a = u.c(cursorG.getInt(iC));
                    dVar.f1765b = cursorG.getInt(iC2) != 0;
                    dVar.f1766c = cursorG.getInt(iC3) != 0;
                    dVar.f1767d = cursorG.getInt(iC4) != 0;
                    dVar.f1768e = cursorG.getInt(iC5) != 0;
                    int i11 = iC2;
                    dVar.f1769f = cursorG.getLong(iC6);
                    dVar.f1770g = cursorG.getLong(iC7);
                    dVar.h = u.a(cursorG.getBlob(iC8));
                    l lVar = new l(string, string2);
                    lVar.f14281b = u.e(cursorG.getInt(iC10));
                    lVar.f14283d = cursorG.getString(iC12);
                    lVar.f14284e = androidx.work.f.a(cursorG.getBlob(iC13));
                    int i12 = i7;
                    lVar.f14285f = androidx.work.f.a(cursorG.getBlob(i12));
                    int i13 = iC15;
                    int i14 = iC13;
                    i7 = i12;
                    lVar.f14286g = cursorG.getLong(i13);
                    int i15 = iC3;
                    int i16 = iC16;
                    lVar.h = cursorG.getLong(i16);
                    iC16 = i16;
                    int i17 = iC17;
                    lVar.f14287i = cursorG.getLong(i17);
                    int i18 = iC18;
                    lVar.f14289k = cursorG.getInt(i18);
                    int i19 = iC19;
                    iC18 = i18;
                    lVar.f14290l = u.b(cursorG.getInt(i19));
                    iC17 = i17;
                    int i20 = iC20;
                    lVar.f14291m = cursorG.getLong(i20);
                    iC20 = i20;
                    int i21 = iC21;
                    lVar.f14292n = cursorG.getLong(i21);
                    iC21 = i21;
                    int i22 = iC22;
                    lVar.f14293o = cursorG.getLong(i22);
                    iC22 = i22;
                    int i23 = iC23;
                    lVar.f14294p = cursorG.getLong(i23);
                    int i24 = iC24;
                    lVar.f14295q = cursorG.getInt(i24) != 0;
                    int i25 = iC25;
                    iC24 = i24;
                    lVar.f14296r = u.d(cursorG.getInt(i25));
                    lVar.f14288j = dVar;
                    arrayList.add(lVar);
                    iC19 = i19;
                    iC3 = i15;
                    iC13 = i14;
                    iC25 = i25;
                    iC23 = i23;
                    iC15 = i13;
                    iC9 = i8;
                    iC11 = i9;
                    iC = i10;
                    iC2 = i11;
                }
                cursorG.close();
                iVar.h();
                return arrayList;
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

    public final ArrayList d() throws Throwable {
        v1.i iVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        v1.i iVarA = v1.i.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            iC = b0.c(cursorG, "required_network_type");
            iC2 = b0.c(cursorG, "requires_charging");
            iC3 = b0.c(cursorG, "requires_device_idle");
            iC4 = b0.c(cursorG, "requires_battery_not_low");
            iC5 = b0.c(cursorG, "requires_storage_not_low");
            iC6 = b0.c(cursorG, "trigger_content_update_delay");
            iC7 = b0.c(cursorG, "trigger_max_content_delay");
            iC8 = b0.c(cursorG, "content_uri_triggers");
            iC9 = b0.c(cursorG, "id");
            iC10 = b0.c(cursorG, "state");
            iC11 = b0.c(cursorG, "worker_class_name");
            iC12 = b0.c(cursorG, "input_merger_class_name");
            iC13 = b0.c(cursorG, "input");
            iVar = iVarA;
        } catch (Throwable th) {
            th = th;
            iVar = iVarA;
        }
        try {
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
            int i6 = iC14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iC9);
                int i7 = iC9;
                String string2 = cursorG.getString(iC11);
                int i8 = iC11;
                androidx.work.d dVar = new androidx.work.d();
                int i9 = iC;
                dVar.f1764a = u.c(cursorG.getInt(iC));
                dVar.f1765b = cursorG.getInt(iC2) != 0;
                dVar.f1766c = cursorG.getInt(iC3) != 0;
                dVar.f1767d = cursorG.getInt(iC4) != 0;
                dVar.f1768e = cursorG.getInt(iC5) != 0;
                int i10 = iC2;
                dVar.f1769f = cursorG.getLong(iC6);
                dVar.f1770g = cursorG.getLong(iC7);
                dVar.h = u.a(cursorG.getBlob(iC8));
                l lVar = new l(string, string2);
                lVar.f14281b = u.e(cursorG.getInt(iC10));
                lVar.f14283d = cursorG.getString(iC12);
                lVar.f14284e = androidx.work.f.a(cursorG.getBlob(iC13));
                int i11 = i6;
                lVar.f14285f = androidx.work.f.a(cursorG.getBlob(i11));
                int i12 = iC13;
                i6 = i11;
                int i13 = iC15;
                lVar.f14286g = cursorG.getLong(i13);
                iC15 = i13;
                int i14 = iC3;
                int i15 = iC16;
                lVar.h = cursorG.getLong(i15);
                iC16 = i15;
                int i16 = iC17;
                lVar.f14287i = cursorG.getLong(i16);
                int i17 = iC18;
                lVar.f14289k = cursorG.getInt(i17);
                int i18 = iC19;
                iC18 = i17;
                lVar.f14290l = u.b(cursorG.getInt(i18));
                iC17 = i16;
                int i19 = iC20;
                lVar.f14291m = cursorG.getLong(i19);
                iC20 = i19;
                int i20 = iC21;
                lVar.f14292n = cursorG.getLong(i20);
                iC21 = i20;
                int i21 = iC22;
                lVar.f14293o = cursorG.getLong(i21);
                iC22 = i21;
                int i22 = iC23;
                lVar.f14294p = cursorG.getLong(i22);
                int i23 = iC24;
                lVar.f14295q = cursorG.getInt(i23) != 0;
                int i24 = iC25;
                iC24 = i23;
                lVar.f14296r = u.d(cursorG.getInt(i24));
                lVar.f14288j = dVar;
                arrayList.add(lVar);
                iC19 = i18;
                iC3 = i14;
                iC25 = i24;
                iC23 = i22;
                iC13 = i12;
                iC9 = i7;
                iC11 = i8;
                iC = i9;
                iC2 = i10;
            }
            cursorG.close();
            iVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            iVar.h();
            throw th;
        }
    }

    public final ArrayList e() {
        v1.i iVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        v1.i iVarA = v1.i.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            iC = b0.c(cursorG, "required_network_type");
            iC2 = b0.c(cursorG, "requires_charging");
            iC3 = b0.c(cursorG, "requires_device_idle");
            iC4 = b0.c(cursorG, "requires_battery_not_low");
            iC5 = b0.c(cursorG, "requires_storage_not_low");
            iC6 = b0.c(cursorG, "trigger_content_update_delay");
            iC7 = b0.c(cursorG, "trigger_max_content_delay");
            iC8 = b0.c(cursorG, "content_uri_triggers");
            iC9 = b0.c(cursorG, "id");
            iC10 = b0.c(cursorG, "state");
            iC11 = b0.c(cursorG, "worker_class_name");
            iC12 = b0.c(cursorG, "input_merger_class_name");
            iC13 = b0.c(cursorG, "input");
            iVar = iVarA;
        } catch (Throwable th) {
            th = th;
            iVar = iVarA;
        }
        try {
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
            int i6 = iC14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iC9);
                int i7 = iC9;
                String string2 = cursorG.getString(iC11);
                int i8 = iC11;
                androidx.work.d dVar = new androidx.work.d();
                int i9 = iC;
                dVar.f1764a = u.c(cursorG.getInt(iC));
                dVar.f1765b = cursorG.getInt(iC2) != 0;
                dVar.f1766c = cursorG.getInt(iC3) != 0;
                dVar.f1767d = cursorG.getInt(iC4) != 0;
                dVar.f1768e = cursorG.getInt(iC5) != 0;
                int i10 = iC2;
                dVar.f1769f = cursorG.getLong(iC6);
                dVar.f1770g = cursorG.getLong(iC7);
                dVar.h = u.a(cursorG.getBlob(iC8));
                l lVar = new l(string, string2);
                lVar.f14281b = u.e(cursorG.getInt(iC10));
                lVar.f14283d = cursorG.getString(iC12);
                lVar.f14284e = androidx.work.f.a(cursorG.getBlob(iC13));
                int i11 = i6;
                lVar.f14285f = androidx.work.f.a(cursorG.getBlob(i11));
                int i12 = iC13;
                i6 = i11;
                int i13 = iC15;
                lVar.f14286g = cursorG.getLong(i13);
                iC15 = i13;
                int i14 = iC3;
                int i15 = iC16;
                lVar.h = cursorG.getLong(i15);
                iC16 = i15;
                int i16 = iC17;
                lVar.f14287i = cursorG.getLong(i16);
                int i17 = iC18;
                lVar.f14289k = cursorG.getInt(i17);
                int i18 = iC19;
                iC18 = i17;
                lVar.f14290l = u.b(cursorG.getInt(i18));
                iC17 = i16;
                int i19 = iC20;
                lVar.f14291m = cursorG.getLong(i19);
                iC20 = i19;
                int i20 = iC21;
                lVar.f14292n = cursorG.getLong(i20);
                iC21 = i20;
                int i21 = iC22;
                lVar.f14293o = cursorG.getLong(i21);
                iC22 = i21;
                int i22 = iC23;
                lVar.f14294p = cursorG.getLong(i22);
                int i23 = iC24;
                lVar.f14295q = cursorG.getInt(i23) != 0;
                int i24 = iC25;
                iC24 = i23;
                lVar.f14296r = u.d(cursorG.getInt(i24));
                lVar.f14288j = dVar;
                arrayList.add(lVar);
                iC19 = i18;
                iC3 = i14;
                iC25 = i24;
                iC23 = i22;
                iC13 = i12;
                iC9 = i7;
                iC11 = i8;
                iC = i9;
                iC2 = i10;
            }
            cursorG.close();
            iVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            iVar.h();
            throw th;
        }
    }

    public final androidx.work.p f(String str) {
        v1.i iVarA = v1.i.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            iVarA.e(1);
        } else {
            iVarA.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            return cursorG.moveToFirst() ? u.e(cursorG.getInt(0)) : null;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public final ArrayList g() {
        v1.i iVarA = v1.i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        iVarA.e(1);
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public final ArrayList h() {
        v1.i iVarA = v1.i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        iVarA.f(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public final l i(String str) {
        v1.i iVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        l lVar;
        v1.i iVarA = v1.i.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            iVarA.e(1);
        } else {
            iVarA.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            iC = b0.c(cursorG, "required_network_type");
            iC2 = b0.c(cursorG, "requires_charging");
            iC3 = b0.c(cursorG, "requires_device_idle");
            iC4 = b0.c(cursorG, "requires_battery_not_low");
            iC5 = b0.c(cursorG, "requires_storage_not_low");
            iC6 = b0.c(cursorG, "trigger_content_update_delay");
            iC7 = b0.c(cursorG, "trigger_max_content_delay");
            iC8 = b0.c(cursorG, "content_uri_triggers");
            iC9 = b0.c(cursorG, "id");
            iC10 = b0.c(cursorG, "state");
            iC11 = b0.c(cursorG, "worker_class_name");
            iC12 = b0.c(cursorG, "input_merger_class_name");
            iC13 = b0.c(cursorG, "input");
            iVar = iVarA;
        } catch (Throwable th) {
            th = th;
            iVar = iVarA;
        }
        try {
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
            if (cursorG.moveToFirst()) {
                String string = cursorG.getString(iC9);
                String string2 = cursorG.getString(iC11);
                androidx.work.d dVar = new androidx.work.d();
                dVar.f1764a = u.c(cursorG.getInt(iC));
                dVar.f1765b = cursorG.getInt(iC2) != 0;
                dVar.f1766c = cursorG.getInt(iC3) != 0;
                dVar.f1767d = cursorG.getInt(iC4) != 0;
                dVar.f1768e = cursorG.getInt(iC5) != 0;
                dVar.f1769f = cursorG.getLong(iC6);
                dVar.f1770g = cursorG.getLong(iC7);
                dVar.h = u.a(cursorG.getBlob(iC8));
                lVar = new l(string, string2);
                lVar.f14281b = u.e(cursorG.getInt(iC10));
                lVar.f14283d = cursorG.getString(iC12);
                lVar.f14284e = androidx.work.f.a(cursorG.getBlob(iC13));
                lVar.f14285f = androidx.work.f.a(cursorG.getBlob(iC14));
                lVar.f14286g = cursorG.getLong(iC15);
                lVar.h = cursorG.getLong(iC16);
                lVar.f14287i = cursorG.getLong(iC17);
                lVar.f14289k = cursorG.getInt(iC18);
                lVar.f14290l = u.b(cursorG.getInt(iC19));
                lVar.f14291m = cursorG.getLong(iC20);
                lVar.f14292n = cursorG.getLong(iC21);
                lVar.f14293o = cursorG.getLong(iC22);
                lVar.f14294p = cursorG.getLong(iC23);
                lVar.f14295q = cursorG.getInt(iC24) != 0;
                lVar.f14296r = u.d(cursorG.getInt(iC25));
                lVar.f14288j = dVar;
            } else {
                lVar = null;
            }
            cursorG.close();
            iVar.h();
            return lVar;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            iVar.h();
            throw th;
        }
    }

    public final ArrayList j() {
        v1.i iVarA = v1.i.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        iVarA.e(1);
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            int iC = b0.c(cursorG, "id");
            int iC2 = b0.c(cursorG, "state");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                l.a aVar = new l.a();
                aVar.f14297a = cursorG.getString(iC);
                aVar.f14298b = u.e(cursorG.getInt(iC2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    public final int k(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        j jVar = this.f14304f;
        a2.e eVarA = jVar.a();
        if (str == null) {
            eVarA.c(1);
        } else {
            eVarA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iExecuteUpdateDelete = eVarA.f19t.executeUpdateDelete();
            workDatabase_Impl.h();
            return iExecuteUpdateDelete;
        } finally {
            workDatabase_Impl.f();
            jVar.c(eVarA);
        }
    }

    public final int l(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        g gVar = this.h;
        a2.e eVarA = gVar.a();
        eVarA.b(1, j6);
        if (str == null) {
            eVarA.c(2);
        } else {
            eVarA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iExecuteUpdateDelete = eVarA.f19t.executeUpdateDelete();
            workDatabase_Impl.h();
            return iExecuteUpdateDelete;
        } finally {
            workDatabase_Impl.f();
            gVar.c(eVarA);
        }
    }

    public final int m(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        k kVar = this.f14305g;
        a2.e eVarA = kVar.a();
        if (str == null) {
            eVarA.c(1);
        } else {
            eVarA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iExecuteUpdateDelete = eVarA.f19t.executeUpdateDelete();
            workDatabase_Impl.h();
            return iExecuteUpdateDelete;
        } finally {
            workDatabase_Impl.f();
            kVar.c(eVarA);
        }
    }

    public final void n(String str, androidx.work.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        p pVar = this.f14302d;
        a2.e eVarA = pVar.a();
        byte[] bArrC = androidx.work.f.c(fVar);
        if (bArrC == null) {
            eVarA.c(1);
        } else {
            eVarA.a(1, bArrC);
        }
        if (str == null) {
            eVarA.c(2);
        } else {
            eVarA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            eVarA.e();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            pVar.c(eVarA);
        }
    }

    public final void o(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        q qVar = this.f14303e;
        a2.e eVarA = qVar.a();
        eVarA.b(1, j6);
        if (str == null) {
            eVarA.c(2);
        } else {
            eVarA.d(2, str);
        }
        workDatabase_Impl.c();
        try {
            eVarA.e();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            qVar.c(eVarA);
        }
    }

    public final int p(androidx.work.p pVar, String... strArr) throws SQLException {
        WorkDatabase_Impl workDatabase_Impl = this.f14299a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            sb.append("?");
            if (i6 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((a2.a) workDatabase_Impl.f14767c.g()).s.compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, u.f(pVar));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i7);
            } else {
                sQLiteStatementCompileStatement.bindString(i7, str);
            }
            i7++;
        }
        workDatabase_Impl.c();
        try {
            int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
            return iExecuteUpdateDelete;
        } finally {
            workDatabase_Impl.f();
        }
    }
}
