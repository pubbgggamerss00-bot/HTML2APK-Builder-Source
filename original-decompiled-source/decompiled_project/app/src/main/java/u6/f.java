package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class f extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f29291a = new f(11, 12);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
