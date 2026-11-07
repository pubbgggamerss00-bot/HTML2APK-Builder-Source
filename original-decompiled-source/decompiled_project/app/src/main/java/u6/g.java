package u6;

import android.database.SQLException;

/* loaded from: classes.dex */
public final class g extends z5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f29295a = new g(12, 13);

    @Override // z5.a
    public final void migrate(i6.b db2) throws SQLException {
        kotlin.jvm.internal.r.e(db2, "db");
        db2.n("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.n("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
