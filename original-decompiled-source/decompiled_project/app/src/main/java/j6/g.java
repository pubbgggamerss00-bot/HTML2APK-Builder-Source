package j6;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import e9.w0;
import h9.v;
import i0.u2;
import i6.c;
import j6.g;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.r;
import pg.b0;
import pg.l;
import pg.s;

/* loaded from: classes.dex */
public final class g implements i6.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15177b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f15178c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15179d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15180e;

    /* renamed from: f, reason: collision with root package name */
    public final s f15181f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15182g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public f f15183a = null;
    }

    public static final class b extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f15184h = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Context f15185a;

        /* renamed from: b, reason: collision with root package name */
        public final a f15186b;

        /* renamed from: c, reason: collision with root package name */
        public final c.a f15187c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15188d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15189e;

        /* renamed from: f, reason: collision with root package name */
        public final k6.a f15190f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15191g;

        public static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final EnumC0144b f15192a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f15193b;

            public a(EnumC0144b enumC0144b, Throwable th2) {
                super(th2);
                this.f15192a = enumC0144b;
                this.f15193b = th2;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f15193b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: j6.g$b$b, reason: collision with other inner class name */
        public static final class EnumC0144b {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0144b f15194a;

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0144b f15195b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0144b f15196c;

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0144b f15197d;

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0144b f15198e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ EnumC0144b[] f15199f;

            static {
                EnumC0144b enumC0144b = new EnumC0144b("ON_CONFIGURE", 0);
                f15194a = enumC0144b;
                EnumC0144b enumC0144b2 = new EnumC0144b("ON_CREATE", 1);
                f15195b = enumC0144b2;
                EnumC0144b enumC0144b3 = new EnumC0144b("ON_UPGRADE", 2);
                f15196c = enumC0144b3;
                EnumC0144b enumC0144b4 = new EnumC0144b("ON_DOWNGRADE", 3);
                f15197d = enumC0144b4;
                EnumC0144b enumC0144b5 = new EnumC0144b("ON_OPEN", 4);
                f15198e = enumC0144b5;
                EnumC0144b[] enumC0144bArr = {enumC0144b, enumC0144b2, enumC0144b3, enumC0144b4, enumC0144b5};
                f15199f = enumC0144bArr;
                u2.e(enumC0144bArr);
            }

            public EnumC0144b() {
                throw null;
            }

            public static EnumC0144b valueOf(String str) {
                return (EnumC0144b) Enum.valueOf(EnumC0144b.class, str);
            }

            public static EnumC0144b[] values() {
                return (EnumC0144b[]) f15199f.clone();
            }
        }

        public static final class c {
            public static f a(a refHolder, SQLiteDatabase sQLiteDatabase) {
                r.e(refHolder, "refHolder");
                f fVar = refHolder.f15183a;
                if (fVar != null && fVar.f15175a.equals(sQLiteDatabase)) {
                    return fVar;
                }
                f fVar2 = new f(sQLiteDatabase);
                refHolder.f15183a = fVar2;
                return fVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, final a aVar, final c.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f14169a, new DatabaseErrorHandler() { // from class: j6.h
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i10 = g.b.f15184h;
                    r.b(sQLiteDatabase);
                    f fVarA = g.b.c.a(aVar, sQLiteDatabase);
                    callback.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + fVarA + ".path");
                    SQLiteDatabase sQLiteDatabase2 = fVarA.f15175a;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            c.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object second = ((Pair) it.next()).second;
                                    r.d(second, "second");
                                    c.a.a((String) second);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    c.a.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        fVarA.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            r.e(context, "context");
            r.e(callback, "callback");
            this.f15185a = context;
            this.f15186b = aVar;
            this.f15187c = callback;
            this.f15188d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                r.d(string, "toString(...)");
            } else {
                string = str;
            }
            this.f15190f = new k6.a(string, context.getCacheDir(), false);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() throws IOException {
            k6.a aVar = this.f15190f;
            try {
                aVar.a(aVar.f16002a);
                super.close();
                this.f15186b.f15183a = null;
                this.f15191g = false;
            } finally {
                aVar.b();
            }
        }

        public final i6.b h(boolean z10) throws IOException {
            k6.a aVar = this.f15190f;
            try {
                aVar.a((this.f15191g || getDatabaseName() == null) ? false : true);
                this.f15189e = false;
                SQLiteDatabase sQLiteDatabaseL = l(z10);
                if (!this.f15189e) {
                    f fVarA = c.a(this.f15186b, sQLiteDatabaseL);
                    aVar.b();
                    return fVarA;
                }
                close();
                i6.b bVarH = h(z10);
                aVar.b();
                return bVarH;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }

        public final SQLiteDatabase l(boolean z10) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f15191g;
            Context context = this.f15185a;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z10) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    r.b(writableDatabase);
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                r.b(readableDatabase3);
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z10) {
                        readableDatabase2 = getWritableDatabase();
                        r.b(readableDatabase2);
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        r.b(readableDatabase2);
                    }
                    return readableDatabase2;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        int iOrdinal = aVar.f15192a.ordinal();
                        th = aVar.f15193b;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            throw th;
                        }
                        if (iOrdinal != 4) {
                            throw new l();
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f15188d) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z10) {
                            readableDatabase = getWritableDatabase();
                            r.b(readableDatabase);
                        } else {
                            readableDatabase = getReadableDatabase();
                            r.b(readableDatabase);
                        }
                        return readableDatabase;
                    } catch (a e10) {
                        throw e10.f15193b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db2) {
            r.e(db2, "db");
            boolean z10 = this.f15189e;
            c.a aVar = this.f15187c;
            if (!z10 && aVar.f14169a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(c.a(this.f15186b, db2));
            } catch (Throwable th2) {
                throw new a(EnumC0144b.f15194a, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            r.e(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f15187c.c(c.a(this.f15186b, sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(EnumC0144b.f15195b, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            r.e(db2, "db");
            this.f15189e = true;
            try {
                this.f15187c.d(c.a(this.f15186b, db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(EnumC0144b.f15197d, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db2) {
            r.e(db2, "db");
            if (!this.f15189e) {
                try {
                    this.f15187c.e(c.a(this.f15186b, db2));
                } catch (Throwable th2) {
                    throw new a(EnumC0144b.f15198e, th2);
                }
            }
            this.f15191g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            r.e(sqLiteDatabase, "sqLiteDatabase");
            this.f15189e = true;
            try {
                this.f15187c.f(c.a(this.f15186b, sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(EnumC0144b.f15196c, th2);
            }
        }
    }

    public g(Context context, String str, c.a callback, boolean z10, boolean z11) {
        r.e(context, "context");
        r.e(callback, "callback");
        this.f15176a = context;
        this.f15177b = str;
        this.f15178c = callback;
        this.f15179d = z10;
        this.f15180e = z11;
        this.f15181f = w0.b(new v(this, 1));
    }

    @Override // i6.c
    public final i6.b P() {
        return ((b) this.f15181f.getValue()).h(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f15181f.f21477b != b0.f21449a) {
            ((b) this.f15181f.getValue()).close();
        }
    }

    @Override // i6.c
    public final String getDatabaseName() {
        return this.f15177b;
    }

    @Override // i6.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f15181f.f21477b != b0.f21449a) {
            ((b) this.f15181f.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f15182g = z10;
    }
}
