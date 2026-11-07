package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class n extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f29306a = new n(7, 8);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
