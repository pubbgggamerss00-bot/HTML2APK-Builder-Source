package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class k extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f29303a = new k(3, 4);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
