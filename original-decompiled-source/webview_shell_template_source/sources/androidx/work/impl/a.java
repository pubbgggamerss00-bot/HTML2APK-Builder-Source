package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0021a f1795a = new C0021a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final b f1796b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final c f1797c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static final d f1798d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static final e f1799e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final f f1800f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final g f1801g = new g(11, 12);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public class C0021a extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            a2.a aVar2 = (a2.a) aVar;
            aVar2.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar2.c("DROP TABLE IF EXISTS alarmInfo");
            aVar2.c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            ((a2.a) aVar).c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            a2.a aVar2 = (a2.a) aVar;
            aVar2.c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar2.c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            ((a2.a) aVar).c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            ((a2.a) aVar).c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            ((a2.a) aVar).c("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class g extends w1.a {
        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            ((a2.a) aVar).c("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h extends w1.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f1802c;

        public h(Context context, int i6, int i7) {
            super(i6, i7);
            this.f1802c = context;
        }

        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            if (this.f14863b < 10) {
                this.f1802c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            } else {
                ((a2.a) aVar).s.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i extends w1.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f1803c;

        public i(Context context) {
            super(9, 10);
            this.f1803c = context;
        }

        @Override // w1.a
        public final void a(z1.a aVar) throws SQLException {
            a2.a aVar2 = (a2.a) aVar;
            aVar2.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SQLiteDatabase sQLiteDatabase = aVar2.s;
            Context context = this.f1803c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j7 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                aVar2.a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j7)});
                    sharedPreferences.edit().clear().apply();
                    aVar2.f();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i6 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i7 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar2.a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i6)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i7)});
                    sharedPreferences2.edit().clear().apply();
                    aVar2.f();
                } finally {
                }
            }
        }
    }
}
