package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class p0 extends z5.a {
    @Override // z5.a
    public final void migrate(i6.b bVar) throws SQLException {
        bVar.n("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
