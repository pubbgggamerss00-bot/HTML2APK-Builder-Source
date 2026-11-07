package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class m0 extends z5.a {
    @Override // z5.a
    public final void migrate(i6.b bVar) throws SQLException {
        bVar.n("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
