package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import androidx.room.l0;
import androidx.room.m;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import b6.p;
import c7.e;
import c7.i;
import c7.l;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import i6.b;
import i6.c;
import j6.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.r;
import u6.i0;
import u6.j0;
import u6.k0;
import u6.m0;
import u6.n0;
import u6.o0;
import u6.p0;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile DependencyDao _dependencyDao;
    private volatile PreferenceDao _preferenceDao;
    private volatile RawWorkInfoDao _rawWorkInfoDao;
    private volatile SystemIdInfoDao _systemIdInfoDao;
    private volatile WorkNameDao _workNameDao;
    private volatile WorkProgressDao _workProgressDao;
    private volatile WorkSpecDao _workSpecDao;
    private volatile WorkTagDao _workTagDao;

    public class a extends l0.a {
        public a() {
        }

        public final void a(f fVar) throws SQLException {
            fVar.n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            fVar.n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            fVar.n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            fVar.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            fVar.n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fVar.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            fVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            fVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        public final l0.b b(f fVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new p.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new p.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new p.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            p pVar = new p("Dependency", map, hashSet, hashSet2);
            p pVarA = p.a(fVar, "Dependency");
            if (!pVar.equals(pVarA)) {
                return new l0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + pVar + "\n Found:\n" + pVarA);
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new p.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new p.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new p.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new p.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new p.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new p.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new p.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new p.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new p.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new p.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new p.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new p.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new p.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            map2.put("minimum_retention_duration", new p.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new p.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new p.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new p.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new p.a("period_count", "INTEGER", true, 0, d.L0, 1));
            map2.put("generation", new p.a("generation", "INTEGER", true, 0, d.L0, 1));
            map2.put("next_schedule_time_override", new p.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new p.a("next_schedule_time_override_generation", "INTEGER", true, 0, d.L0, 1));
            map2.put("stop_reason", new p.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new p.a("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new p.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new p.a("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new p.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new p.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new p.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new p.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new p.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new p.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new p.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new p.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new p.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            p pVar2 = new p("WorkSpec", map2, hashSet3, hashSet4);
            p pVarA2 = p.a(fVar, "WorkSpec");
            if (!pVar2.equals(pVarA2)) {
                return new l0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + pVar2 + "\n Found:\n" + pVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new p.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new p.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p pVar3 = new p("WorkTag", map3, hashSet5, hashSet6);
            p pVarA3 = p.a(fVar, "WorkTag");
            if (!pVar3.equals(pVarA3)) {
                return new l0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + pVar3 + "\n Found:\n" + pVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new p.a("generation", "INTEGER", true, 2, d.L0, 1));
            map4.put("system_id", new p.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p pVar4 = new p("SystemIdInfo", map4, hashSet7, new HashSet(0));
            p pVarA4 = p.a(fVar, "SystemIdInfo");
            if (!pVar4.equals(pVarA4)) {
                return new l0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + pVar4 + "\n Found:\n" + pVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new p.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new p.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            p pVar5 = new p("WorkName", map5, hashSet8, hashSet9);
            p pVarA5 = p.a(fVar, "WorkName");
            if (!pVar5.equals(pVarA5)) {
                return new l0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + pVar5 + "\n Found:\n" + pVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new p.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new p.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new p.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            p pVar6 = new p("WorkProgress", map6, hashSet10, new HashSet(0));
            p pVarA6 = p.a(fVar, "WorkProgress");
            if (!pVar6.equals(pVarA6)) {
                return new l0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + pVar6 + "\n Found:\n" + pVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new p.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new p.a("long_value", "INTEGER", false, 0, null, 1));
            p pVar7 = new p("Preference", map7, new HashSet(0), new HashSet(0));
            p pVarA7 = p.a(fVar, "Preference");
            if (pVar7.equals(pVarA7)) {
                return new l0.b(true, null);
            }
            return new l0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + pVar7 + "\n Found:\n" + pVarA7);
        }
    }

    @Override // androidx.room.g0
    public void clearAllTables() throws SQLException {
        super.assertNotMainThread();
        b bVarP = super.getOpenHelper().P();
        try {
            super.beginTransaction();
            bVarP.n("PRAGMA defer_foreign_keys = TRUE");
            bVarP.n("DELETE FROM `Dependency`");
            bVarP.n("DELETE FROM `WorkSpec`");
            bVarP.n("DELETE FROM `WorkTag`");
            bVarP.n("DELETE FROM `SystemIdInfo`");
            bVarP.n("DELETE FROM `WorkName`");
            bVarP.n("DELETE FROM `WorkProgress`");
            bVarP.n("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            bVarP.Q("PRAGMA wal_checkpoint(FULL)").close();
            if (!bVarP.h0()) {
                bVarP.n("VACUUM");
            }
        }
    }

    @Override // androidx.room.g0
    public m createInvalidationTracker() {
        return new m(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.g0
    public c createOpenHelper(androidx.room.c cVar) {
        l0 l0Var = new l0(cVar, new a());
        Context context = cVar.f2857a;
        r.e(context, "context");
        return cVar.f2859c.a(new c.b(context, cVar.f2858b, l0Var, false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public DependencyDao dependencyDao() {
        DependencyDao dependencyDao;
        if (this._dependencyDao != null) {
            return this._dependencyDao;
        }
        synchronized (this) {
            try {
                if (this._dependencyDao == null) {
                    this._dependencyDao = new c7.b(this);
                }
                dependencyDao = this._dependencyDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dependencyDao;
    }

    @Override // androidx.room.g0
    public List<z5.a> getAutoMigrations(Map<Class<Object>, Object> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i0(13, 14));
        arrayList.add(new j0());
        arrayList.add(new k0(16, 17));
        arrayList.add(new u6.l0(17, 18));
        arrayList.add(new m0(18, 19));
        arrayList.add(new n0());
        arrayList.add(new o0(20, 21));
        arrayList.add(new p0(22, 23));
        return arrayList;
    }

    @Override // androidx.room.g0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.g0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(WorkSpecDao.class, list);
        map.put(DependencyDao.class, list);
        map.put(WorkTagDao.class, list);
        map.put(SystemIdInfoDao.class, list);
        map.put(WorkNameDao.class, list);
        map.put(WorkProgressDao.class, list);
        map.put(PreferenceDao.class, list);
        map.put(RawWorkInfoDao.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public PreferenceDao preferenceDao() {
        PreferenceDao preferenceDao;
        if (this._preferenceDao != null) {
            return this._preferenceDao;
        }
        synchronized (this) {
            try {
                if (this._preferenceDao == null) {
                    this._preferenceDao = new c7.d(this);
                }
                preferenceDao = this._preferenceDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return preferenceDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public RawWorkInfoDao rawWorkInfoDao() {
        RawWorkInfoDao rawWorkInfoDao;
        if (this._rawWorkInfoDao != null) {
            return this._rawWorkInfoDao;
        }
        synchronized (this) {
            try {
                if (this._rawWorkInfoDao == null) {
                    this._rawWorkInfoDao = new e();
                }
                rawWorkInfoDao = this._rawWorkInfoDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rawWorkInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao systemIdInfoDao() {
        SystemIdInfoDao systemIdInfoDao;
        if (this._systemIdInfoDao != null) {
            return this._systemIdInfoDao;
        }
        synchronized (this) {
            try {
                if (this._systemIdInfoDao == null) {
                    this._systemIdInfoDao = new i(this);
                }
                systemIdInfoDao = this._systemIdInfoDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkNameDao workNameDao() {
        WorkNameDao workNameDao;
        if (this._workNameDao != null) {
            return this._workNameDao;
        }
        synchronized (this) {
            try {
                if (this._workNameDao == null) {
                    this._workNameDao = new l(this);
                }
                workNameDao = this._workNameDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return workNameDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkProgressDao workProgressDao() {
        WorkProgressDao workProgressDao;
        if (this._workProgressDao != null) {
            return this._workProgressDao;
        }
        synchronized (this) {
            try {
                if (this._workProgressDao == null) {
                    this._workProgressDao = new c7.p(this);
                }
                workProgressDao = this._workProgressDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return workProgressDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkSpecDao workSpecDao() {
        WorkSpecDao workSpecDao;
        if (this._workSpecDao != null) {
            return this._workSpecDao;
        }
        synchronized (this) {
            try {
                if (this._workSpecDao == null) {
                    this._workSpecDao = new androidx.work.impl.model.a(this);
                }
                workSpecDao = this._workSpecDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return workSpecDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkTagDao workTagDao() {
        WorkTagDao workTagDao;
        if (this._workTagDao != null) {
            return this._workTagDao;
        }
        synchronized (this) {
            try {
                if (this._workTagDao == null) {
                    this._workTagDao = new c7.l0(this);
                }
                workTagDao = this._workTagDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return workTagDao;
    }
}
