package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class o extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f29308a = new o(8, 9);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
