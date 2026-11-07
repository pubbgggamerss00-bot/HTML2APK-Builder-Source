package a2;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import v1.f;
import v1.g;
import v1.h;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements z1.b {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9t;

    /* renamed from: u, reason: collision with root package name */
    public final b.a f10u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f12w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public a f13x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends SQLiteOpenHelper {
        public final a2.a[] s;

        /* renamed from: t, reason: collision with root package name */
        public final b.a f15t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f16u;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: a2.b$a$a, reason: collision with other inner class name */
        public class C0005a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b.a f17a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a2.a[] f18b;

            public C0005a(b.a aVar, a2.a[] aVarArr) {
                this.f17a = aVar;
                this.f18b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                a2.a aVarA = a.a(this.f18b, sQLiteDatabase);
                this.f17a.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + aVarA.s.getPath());
                SQLiteDatabase sQLiteDatabase2 = aVarA.s;
                if (!sQLiteDatabase2.isOpen()) {
                    b.a.a(sQLiteDatabase2.getPath());
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<Pair<String, String>> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                b.a.a((String) it.next().second);
                            }
                        } else {
                            b.a.a(sQLiteDatabase2.getPath());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    aVarA.close();
                } catch (IOException unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, a2.a[] aVarArr, b.a aVar) {
            super(context, str, null, 12, new C0005a(aVar, aVarArr));
            aVar.getClass();
            this.f15t = aVar;
            this.s = aVarArr;
        }

        public static a2.a a(a2.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a2.a aVar = aVarArr[0];
            if (aVar == null || aVar.s != sQLiteDatabase) {
                aVarArr[0] = new a2.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public final synchronized z1.a b() {
            this.f16u = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f16u) {
                return a(this.s, writableDatabase);
            }
            close();
            return b();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.s[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(this.s, sQLiteDatabase);
            this.f15t.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            boolean z6;
            a2.a aVarA = a(this.s, sQLiteDatabase);
            h hVar = (h) this.f15t;
            WorkDatabase_Impl.a aVar = hVar.f14787b;
            Cursor cursorD = aVarA.d("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                if (cursorD.moveToFirst()) {
                    z6 = cursorD.getInt(0) == 0;
                }
                cursorD.close();
                aVar.a(aVarA);
                if (!z6) {
                    h.b bVarB = aVar.b(aVarA);
                    if (!bVarB.f14788a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f14789b);
                    }
                }
                hVar.c(aVarA);
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i6 = WorkDatabase_Impl.s;
                List<g.b> list = workDatabase_Impl.f14771g;
                if (list != null) {
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        workDatabase_Impl.f14771g.get(i7).getClass();
                    }
                }
            } catch (Throwable th) {
                cursorD.close();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) throws SQLException {
            this.f16u = true;
            ((h) this.f15t).b(a(this.s, sQLiteDatabase), i6, i7);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
            boolean z6;
            if (this.f16u) {
                return;
            }
            b.a aVar = this.f15t;
            a2.a aVarA = a(this.s, sQLiteDatabase);
            h hVar = (h) aVar;
            WorkDatabase_Impl.a aVar2 = hVar.f14787b;
            Cursor cursorD = aVarA.d("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                if (cursorD.moveToFirst()) {
                    z6 = cursorD.getInt(0) != 0;
                }
                cursorD.close();
                if (z6) {
                    Cursor cursorE = aVarA.e(new i2.h("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                    try {
                        String string = cursorE.moveToFirst() ? cursorE.getString(0) : null;
                        cursorE.close();
                        if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                    } catch (Throwable th) {
                        cursorE.close();
                        throw th;
                    }
                } else {
                    h.b bVarB = aVar2.b(aVarA);
                    if (!bVarB.f14788a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f14789b);
                    }
                    hVar.c(aVarA);
                }
                WorkDatabase_Impl.a aVar3 = hVar.f14787b;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i6 = WorkDatabase_Impl.s;
                workDatabase_Impl.f14765a = aVarA;
                aVarA.c("PRAGMA foreign_keys = ON");
                f fVar = WorkDatabase_Impl.this.f14768d;
                synchronized (fVar) {
                    try {
                        if (fVar.f14756e) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            aVarA.c("PRAGMA temp_store = MEMORY;");
                            aVarA.c("PRAGMA recursive_triggers='ON';");
                            aVarA.c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            fVar.c(aVarA);
                            fVar.f14757f = new e(aVarA.s.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                            fVar.f14756e = true;
                        }
                    } finally {
                    }
                }
                List<g.b> list = WorkDatabase_Impl.this.f14771g;
                if (list != null) {
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        WorkDatabase_Impl.this.f14771g.get(i7).a(aVarA);
                    }
                }
                hVar.f14786a = null;
            } catch (Throwable th2) {
                cursorD.close();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
            this.f16u = true;
            this.f15t.b(a(this.s, sQLiteDatabase), i6, i7);
        }
    }

    public b(Context context, String str, b.a aVar, boolean z6) {
        this.s = context;
        this.f9t = str;
        this.f10u = aVar;
        this.f11v = z6;
    }

    public final a a() {
        a aVar;
        synchronized (this.f12w) {
            try {
                if (this.f13x == null) {
                    a2.a[] aVarArr = new a2.a[1];
                    if (this.f9t == null || !this.f11v) {
                        this.f13x = new a(this.s, this.f9t, aVarArr, this.f10u);
                    } else {
                        this.f13x = new a(this.s, new File(this.s.getNoBackupFilesDir(), this.f9t).getAbsolutePath(), aVarArr, this.f10u);
                    }
                    this.f13x.setWriteAheadLoggingEnabled(this.f14y);
                }
                aVar = this.f13x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // z1.b
    public final z1.a g() {
        return a().b();
    }

    @Override // z1.b
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        synchronized (this.f12w) {
            try {
                a aVar = this.f13x;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z6);
                }
                this.f14y = z6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
