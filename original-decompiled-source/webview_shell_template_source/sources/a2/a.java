package a2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import i2.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements z1.a {

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f7t = new String[0];
    public final SQLiteDatabase s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: a2.a$a, reason: collision with other inner class name */
    public class C0004a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z1.c f8a;

        public C0004a(z1.c cVar) {
            this.f8a = cVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f8a.d(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.s = sQLiteDatabase;
    }

    public final void a() {
        this.s.beginTransaction();
    }

    public final void b() {
        this.s.endTransaction();
    }

    public final void c(String str) throws SQLException {
        this.s.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final Cursor d(String str) {
        return e(new h(str));
    }

    public final Cursor e(z1.c cVar) {
        return this.s.rawQueryWithFactory(new C0004a(cVar), cVar.b(), f7t, null);
    }

    public final void f() {
        this.s.setTransactionSuccessful();
    }
}
