package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import com.google.android.gms.ads.mediation.customevent.b;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.consent_sdk.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import r2.d;
import r2.g;
import r2.j;
import r2.k;
import r2.m;
import r2.s;
import v1.f;
import v1.h;
import x1.a;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile s f1787l;

    /* renamed from: m, reason: collision with root package name */
    public volatile ni0 f1788m;

    /* renamed from: n, reason: collision with root package name */
    public volatile ni0 f1789n;

    /* renamed from: o, reason: collision with root package name */
    public volatile b f1790o;

    /* renamed from: p, reason: collision with root package name */
    public volatile ni0 f1791p;

    /* renamed from: q, reason: collision with root package name */
    public volatile eu f1792q;

    /* renamed from: r, reason: collision with root package name */
    public volatile v f1793r;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends h.a {
        public a() {
        }

        public final void a(z1.a aVar) throws SQLException {
            a2.a aVar2 = (a2.a) aVar;
            aVar2.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar2.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar2.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar2.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar2.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar2.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar2.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public final h.b b(z1.a aVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new a.C0102a(1, 1, "work_spec_id", "TEXT", null, true));
            map.put("prerequisite_id", new a.C0102a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
            hashSet2.add(new a.d(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
            x1.a aVar2 = new x1.a("Dependency", map, hashSet, hashSet2);
            x1.a aVarA = x1.a.a(aVar, "Dependency");
            if (!aVar2.equals(aVarA)) {
                return new h.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar2 + "\n Found:\n" + aVarA, false);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new a.C0102a(1, 1, "id", "TEXT", null, true));
            map2.put("state", new a.C0102a(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new a.C0102a(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new a.C0102a(0, 1, "input_merger_class_name", "TEXT", null, false));
            map2.put("input", new a.C0102a(0, 1, "input", "BLOB", null, true));
            map2.put("output", new a.C0102a(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new a.C0102a(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new a.C0102a(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new a.C0102a(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new a.C0102a(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new a.C0102a(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new a.C0102a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("period_start_time", new a.C0102a(0, 1, "period_start_time", "INTEGER", null, true));
            map2.put("minimum_retention_duration", new a.C0102a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new a.C0102a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new a.C0102a(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new a.C0102a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("required_network_type", new a.C0102a(0, 1, "required_network_type", "INTEGER", null, false));
            map2.put("requires_charging", new a.C0102a(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new a.C0102a(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new a.C0102a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new a.C0102a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new a.C0102a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new a.C0102a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            map2.put("content_uri_triggers", new a.C0102a(0, 1, "content_uri_triggers", "BLOB", null, false));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new a.d(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
            hashSet4.add(new a.d(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
            x1.a aVar3 = new x1.a("WorkSpec", map2, hashSet3, hashSet4);
            x1.a aVarA2 = x1.a.a(aVar, "WorkSpec");
            if (!aVar3.equals(aVarA2)) {
                return new h.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar3 + "\n Found:\n" + aVarA2, false);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new a.C0102a(1, 1, "tag", "TEXT", null, true));
            map3.put("work_spec_id", new a.C0102a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new a.d(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
            x1.a aVar4 = new x1.a("WorkTag", map3, hashSet5, hashSet6);
            x1.a aVarA3 = x1.a.a(aVar, "WorkTag");
            if (!aVar4.equals(aVarA3)) {
                return new h.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar4 + "\n Found:\n" + aVarA3, false);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new a.C0102a(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("system_id", new a.C0102a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            x1.a aVar5 = new x1.a("SystemIdInfo", map4, hashSet7, new HashSet(0));
            x1.a aVarA4 = x1.a.a(aVar, "SystemIdInfo");
            if (!aVar5.equals(aVarA4)) {
                return new h.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar5 + "\n Found:\n" + aVarA4, false);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new a.C0102a(1, 1, "name", "TEXT", null, true));
            map5.put("work_spec_id", new a.C0102a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new a.d(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
            x1.a aVar6 = new x1.a("WorkName", map5, hashSet8, hashSet9);
            x1.a aVarA5 = x1.a.a(aVar, "WorkName");
            if (!aVar6.equals(aVarA5)) {
                return new h.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar6 + "\n Found:\n" + aVarA5, false);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new a.C0102a(1, 1, "work_spec_id", "TEXT", null, true));
            map6.put("progress", new a.C0102a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            x1.a aVar7 = new x1.a("WorkProgress", map6, hashSet10, new HashSet(0));
            x1.a aVarA6 = x1.a.a(aVar, "WorkProgress");
            if (!aVar7.equals(aVarA6)) {
                return new h.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar7 + "\n Found:\n" + aVarA6, false);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new a.C0102a(1, 1, "key", "TEXT", null, true));
            map7.put("long_value", new a.C0102a(0, 1, "long_value", "INTEGER", null, false));
            x1.a aVar8 = new x1.a("Preference", map7, new HashSet(0), new HashSet(0));
            x1.a aVarA7 = x1.a.a(aVar, "Preference");
            if (aVar8.equals(aVarA7)) {
                return new h.b(null, true);
            }
            return new h.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar8 + "\n Found:\n" + aVarA7, false);
        }
    }

    @Override // v1.g
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // v1.g
    public final z1.b e(v1.a aVar) {
        h hVar = new h(aVar, new a());
        Context context = aVar.f14744b;
        String str = aVar.f14745c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f14743a.a(new b.C0109b(context, str, hVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ni0 i() {
        ni0 ni0Var;
        if (this.f1788m != null) {
            return this.f1788m;
        }
        synchronized (this) {
            try {
                if (this.f1788m == null) {
                    this.f1788m = new ni0(this, 18);
                }
                ni0Var = this.f1788m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ni0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v j() {
        v vVar;
        if (this.f1793r != null) {
            return this.f1793r;
        }
        synchronized (this) {
            try {
                if (this.f1793r == null) {
                    this.f1793r = new v(this);
                }
                vVar = this.f1793r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final com.google.android.gms.ads.mediation.customevent.b k() {
        com.google.android.gms.ads.mediation.customevent.b bVar;
        if (this.f1790o != null) {
            return this.f1790o;
        }
        synchronized (this) {
            try {
                if (this.f1790o == null) {
                    com.google.android.gms.ads.mediation.customevent.b bVar2 = new com.google.android.gms.ads.mediation.customevent.b();
                    bVar2.s = this;
                    bVar2.f2374t = new r2.f(this);
                    bVar2.f2375u = new g(this, 0);
                    this.f1790o = bVar2;
                }
                bVar = this.f1790o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ni0 l() {
        ni0 ni0Var;
        if (this.f1791p != null) {
            return this.f1791p;
        }
        synchronized (this) {
            try {
                if (this.f1791p == null) {
                    this.f1791p = new ni0(this, 19);
                }
                ni0Var = this.f1791p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ni0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eu m() {
        eu euVar;
        if (this.f1792q != null) {
            return this.f1792q;
        }
        synchronized (this) {
            try {
                if (this.f1792q == null) {
                    eu euVar2 = new eu();
                    euVar2.f4395t = this;
                    euVar2.f4396u = new d(this, 1);
                    euVar2.s = new j(this, 0);
                    euVar2.f4397v = new k(this, 0);
                    this.f1792q = euVar2;
                }
                euVar = this.f1792q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return euVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m n() {
        s sVar;
        if (this.f1787l != null) {
            return this.f1787l;
        }
        synchronized (this) {
            try {
                if (this.f1787l == null) {
                    this.f1787l = new s(this);
                }
                sVar = this.f1787l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ni0 o() {
        ni0 ni0Var;
        if (this.f1789n != null) {
            return this.f1789n;
        }
        synchronized (this) {
            try {
                if (this.f1789n == null) {
                    this.f1789n = new ni0(this, 20);
                }
                ni0Var = this.f1789n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ni0Var;
    }
}
