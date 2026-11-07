package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class l extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f29304a = new l(4, 5);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
