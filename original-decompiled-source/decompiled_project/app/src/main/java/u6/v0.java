package u6;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;

/* loaded from: classes.dex */
public final class v0 extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context) {
        super(9, 10);
        kotlin.jvm.internal.r.e(context, "context");
        this.f29355a = context;
    }

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f29355a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            db2.i();
            try {
                db2.G(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                db2.G(new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                db2.H();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            db2.i();
            try {
                db2.G(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                db2.G(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences2.edit().clear().apply();
                db2.H();
            } finally {
            }
        }
    }
}
