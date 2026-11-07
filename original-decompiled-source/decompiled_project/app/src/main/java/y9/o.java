package y9;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import y9.s;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements s.a {
    @Override // y9.s.a
    public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
