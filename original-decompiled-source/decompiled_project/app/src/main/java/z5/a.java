package z5;

import i6.b;
import kotlin.jvm.internal.r;
import pg.m;

/* loaded from: classes.dex */
public abstract class a {
    public final int endVersion;
    public final int startVersion;

    public a(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public void migrate(b db2) {
        r.e(db2, "db");
        throw new m("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(h6.b connection) {
        r.e(connection, "connection");
        if (connection instanceof y5.a) {
            migrate(((y5.a) connection).f33939a);
            return;
        }
        throw new m("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
