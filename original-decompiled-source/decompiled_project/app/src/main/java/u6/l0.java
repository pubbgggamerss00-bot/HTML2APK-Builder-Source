package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class l0 extends z5.a {
    @Override // z5.a
    public final void migrate(i6.b bVar) throws SQLException {
        bVar.n("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        bVar.n("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
