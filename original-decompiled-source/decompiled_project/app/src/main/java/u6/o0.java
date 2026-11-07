package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class o0 extends z5.a {
    @Override // z5.a
    public final void migrate(i6.b bVar) throws SQLException {
        bVar.n("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
