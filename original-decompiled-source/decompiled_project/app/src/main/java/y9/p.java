package y9;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import y9.s;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements s.a {
    @Override // y9.s.a
    public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
