package j6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import e9.w0;
import i6.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class f implements i6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15171b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15172c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Object f15173d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f15174e;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f15175a;

    public static final class a {
    }

    static {
        pg.k kVar = pg.k.f21467b;
        f15173d = w0.a(kVar, new d());
        f15174e = w0.a(kVar, new e());
    }

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f15175a = sQLiteDatabase;
    }

    @Override // i6.b
    public final Cursor B(i6.e eVar) {
        final b bVar = new b(eVar);
        Cursor cursorRawQueryWithFactory = this.f15175a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: j6.c
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) bVar.f(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.l(), f15172c, null);
        r.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // i6.b
    public final void G(Object[] objArr) throws SQLException {
        this.f15175a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // i6.b
    public final void H() {
        this.f15175a.setTransactionSuccessful();
    }

    @Override // i6.b
    public final void I() {
        this.f15175a.beginTransactionNonExclusive();
    }

    @Override // i6.b
    public final Cursor Q(String str) {
        return B(new i6.a(str));
    }

    @Override // i6.b
    public final void U() {
        this.f15175a.endTransaction();
    }

    @Override // i6.b
    public final Cursor X(final i6.e eVar, CancellationSignal cancellationSignal) {
        Cursor cursorRawQueryWithFactory = this.f15175a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: j6.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r.b(sQLiteQuery);
                eVar.h(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.l(), f15172c, null, cancellationSignal);
        r.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15175a.close();
    }

    @Override // i6.b
    public final boolean h0() {
        return this.f15175a.inTransaction();
    }

    @Override // i6.b
    public final void i() {
        this.f15175a.beginTransaction();
    }

    @Override // i6.b
    public final boolean isOpen() {
        return this.f15175a.isOpen();
    }

    @Override // i6.b
    public final void n(String sql) throws SQLException {
        r.e(sql, "sql");
        this.f15175a.execSQL(sql);
    }

    @Override // i6.b
    public final boolean n0() {
        return this.f15175a.isWriteAheadLoggingEnabled();
    }

    @Override // i6.b
    public final i6.f r(String sql) throws SQLException {
        r.e(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f15175a.compileStatement(sql);
        r.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new k(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pg.j] */
    @Override // i6.b
    public final void u() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r12 = f15174e;
        if (((Method) r12.getValue()) != null) {
            ?? r22 = f15173d;
            if (((Method) r22.getValue()) != null) {
                Method method = (Method) r12.getValue();
                r.b(method);
                Method method2 = (Method) r22.getValue();
                r.b(method2);
                Object objInvoke = method2.invoke(this.f15175a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        i();
    }

    @Override // i6.b
    public final int w0(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f15171b[3]);
        sb.append("WorkSpec SET ");
        int i10 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i10 > 0 ? "," : "");
            sb.append(str);
            objArr2[i10] = contentValues.get(str);
            sb.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        i6.f fVarR = r(sb.toString());
        a.C0131a.a(fVarR, objArr2);
        return ((k) fVarR).f15203b.executeUpdateDelete();
    }
}
