package androidx.room;

import androidx.room.g0;
import androidx.room.j0;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import pg.p;
import rg.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2830a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2831b;

    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public final class C0039a implements h6.c {

        /* renamed from: a, reason: collision with root package name */
        public final h6.c f2832a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f2833b;

        public C0039a(z zVar, h6.c actual) {
            kotlin.jvm.internal.r.e(actual, "actual");
            this.f2833b = zVar;
            this.f2832a = actual;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0096, B:46:0x009d, B:24:0x0056), top: B:67:0x0048, outer: #0, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0096, B:46:0x009d, B:24:0x0056), top: B:67:0x0048, outer: #0, inners: #5 }] */
        @Override // h6.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final h6.b a(String fileName) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            kotlin.jvm.internal.r.e(fileName, "fileName");
            boolean zEquals = fileName.equals(":memory:");
            z zVar = this.f2833b;
            if (!zEquals) {
                fileName = zVar.f3099c.f2857a.getDatabasePath(fileName).getAbsolutePath();
                kotlin.jvm.internal.r.b(fileName);
            }
            boolean z10 = true;
            w5.b bVar = new w5.b(fileName, (zVar.f2830a || zVar.f2831b || fileName.equals(":memory:")) ? false : true);
            ReentrantLock reentrantLock = bVar.f31272a;
            reentrantLock.lock();
            w5.c cVar = bVar.f31273b;
            if (cVar != null) {
                try {
                    cVar.a();
                    try {
                        try {
                            if (!zVar.f2831b) {
                                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                            }
                            h6.b bVarA = this.f2832a.a(fileName);
                            if (zVar.f2830a) {
                                if (zVar.d().f2863g == g0.d.f2941c) {
                                    h6.a.a("PRAGMA synchronous = NORMAL", bVarA);
                                } else {
                                    h6.a.a("PRAGMA synchronous = FULL", bVarA);
                                }
                                a.b(bVarA);
                                zVar.e().onOpen(bVarA);
                            } else {
                                try {
                                    zVar.f2831b = true;
                                    a.a(zVar, bVarA);
                                    zVar.f2831b = false;
                                } catch (Throwable th2) {
                                    zVar.f2831b = false;
                                    throw th2;
                                }
                            }
                            if (cVar != null && (fileChannel2 = cVar.f31275b) != null) {
                                try {
                                    fileChannel2.close();
                                    cVar.f31275b = null;
                                } finally {
                                }
                            }
                            return bVarA;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        if (cVar != null && (fileChannel = cVar.f31275b) != null) {
                            try {
                                fileChannel.close();
                                cVar.f31275b = null;
                            } finally {
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z10 = false;
                }
            } else {
                if (!zVar.f2831b) {
                }
            }
            try {
                if (z10) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + fileName + "'. Was a proper path / name used in Room's database builder?", th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final void a(z zVar, h6.b bVar) throws Throwable {
        Object objA;
        j0 j0Var = zVar.f3100d;
        g0.d dVar = zVar.f3099c.f2863g;
        g0.d dVar2 = g0.d.f2941c;
        if (dVar == dVar2) {
            h6.a.a("PRAGMA journal_mode = WAL", bVar);
        } else {
            h6.a.a("PRAGMA journal_mode = TRUNCATE", bVar);
        }
        if (zVar.d().f2863g == dVar2) {
            h6.a.a("PRAGMA synchronous = NORMAL", bVar);
        } else {
            h6.a.a("PRAGMA synchronous = FULL", bVar);
        }
        b(bVar);
        h6.d dVarB0 = bVar.B0("PRAGMA user_version");
        try {
            dVarB0.t0();
            int i10 = (int) dVarB0.getLong(0);
            ch.a.a(dVarB0, null);
            if (i10 != j0Var.getVersion()) {
                h6.a.a("BEGIN EXCLUSIVE TRANSACTION", bVar);
                try {
                    if (i10 == 0) {
                        zVar.f(bVar);
                    } else {
                        zVar.g(bVar, i10, j0Var.getVersion());
                    }
                    h6.a.a("PRAGMA user_version = " + j0Var.getVersion(), bVar);
                    objA = pg.f0.f21461a;
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (!(objA instanceof p.a)) {
                    h6.a.a("END TRANSACTION", bVar);
                }
                Throwable thA = pg.p.a(objA);
                if (thA != null) {
                    h6.a.a("ROLLBACK TRANSACTION", bVar);
                    throw thA;
                }
            }
            zVar.h(bVar);
        } finally {
        }
    }

    public static void b(h6.b bVar) {
        h6.d dVarB0 = bVar.B0("PRAGMA busy_timeout");
        try {
            dVarB0.t0();
            long j10 = dVarB0.getLong(0);
            ch.a.a(dVarB0, null);
            if (j10 < 3000) {
                h6.a.a("PRAGMA busy_timeout = 3000", bVar);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ch.a.a(dVarB0, th2);
                throw th3;
            }
        }
    }

    public abstract List<g0.b> c();

    public abstract c d();

    public abstract j0 e();

    public final void f(h6.b connection) {
        kotlin.jvm.internal.r.e(connection, "connection");
        h6.d dVarB0 = connection.B0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (dVarB0.t0()) {
                if (dVarB0.getLong(0) == 0) {
                    z10 = true;
                }
            }
            ch.a.a(dVarB0, null);
            e().createAllTables(connection);
            if (!z10) {
                j0.a aVarOnValidateSchema = e().onValidateSchema(connection);
                if (!aVarOnValidateSchema.f3004a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarOnValidateSchema.f3005b).toString());
                }
            }
            i(connection);
            e().onCreate(connection);
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                ((g0.b) it.next()).getClass();
                if (connection instanceof y5.a) {
                    i6.b db2 = ((y5.a) connection).f33939a;
                    kotlin.jvm.internal.r.e(db2, "db");
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(h6.b connection, int i10, int i11) {
        kotlin.jvm.internal.r.e(connection, "connection");
        List<z5.a> listA = b6.l.a(d().f2860d, i10, i11);
        if (listA != null) {
            e().onPreMigrate(connection);
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                ((z5.a) it.next()).migrate(connection);
            }
            j0.a aVarOnValidateSchema = e().onValidateSchema(connection);
            if (aVarOnValidateSchema.f3004a) {
                e().onPostMigrate(connection);
                i(connection);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + aVarOnValidateSchema.f3005b).toString());
            }
        }
        if (b6.l.b(d(), i10, i11)) {
            throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().f2875s) {
            h6.d dVarB0 = connection.B0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                rg.b bVarB = c0.g0.b();
                while (dVarB0.t0()) {
                    String strW = dVarB0.W(0);
                    if (!mh.t.p(strW, "sqlite_", false) && !strW.equals("android_metadata")) {
                        bVarB.add(new pg.n(strW, Boolean.valueOf(kotlin.jvm.internal.r.a(dVarB0.W(1), "view"))));
                    }
                }
                rg.b bVarA = c0.g0.a(bVarB);
                ch.a.a(dVarB0, null);
                ListIterator listIterator = bVarA.listIterator(0);
                while (true) {
                    b.C0262b c0262b = (b.C0262b) listIterator;
                    if (!c0262b.hasNext()) {
                        break;
                    }
                    pg.n nVar = (pg.n) c0262b.next();
                    String str = (String) nVar.f21469a;
                    if (((Boolean) nVar.f21470b).booleanValue()) {
                        h6.a.a("DROP VIEW IF EXISTS " + str, connection);
                    } else {
                        h6.a.a("DROP TABLE IF EXISTS " + str, connection);
                    }
                }
            } finally {
            }
        } else {
            e().dropAllTables(connection);
        }
        Iterator<T> it2 = c().iterator();
        while (it2.hasNext()) {
            ((g0.b) it2.next()).getClass();
            if (connection instanceof y5.a) {
                i6.b db2 = ((y5.a) connection).f33939a;
                kotlin.jvm.internal.r.e(db2, "db");
            }
        }
        e().createAllTables(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(h6.b connection) {
        boolean z10;
        Object objA;
        j0.a aVarOnValidateSchema;
        kotlin.jvm.internal.r.e(connection, "connection");
        h6.d dVarB0 = connection.B0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (dVarB0.t0()) {
                z10 = dVarB0.getLong(0) != 0;
            }
            ch.a.a(dVarB0, null);
            if (z10) {
                dVarB0 = connection.B0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strW = dVarB0.t0() ? dVarB0.W(0) : null;
                    ch.a.a(dVarB0, null);
                    if (!kotlin.jvm.internal.r.a(e().getIdentityHash(), strW) && !kotlin.jvm.internal.r.a(e().getLegacyIdentityHash(), strW)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + e().getIdentityHash() + ", found: " + strW).toString());
                    }
                } finally {
                }
            } else {
                h6.a.a("BEGIN EXCLUSIVE TRANSACTION", connection);
                try {
                    aVarOnValidateSchema = e().onValidateSchema(connection);
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (!aVarOnValidateSchema.f3004a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarOnValidateSchema.f3005b).toString());
                }
                e().onPostMigrate(connection);
                i(connection);
                objA = pg.f0.f21461a;
                if (!(objA instanceof p.a)) {
                    h6.a.a("END TRANSACTION", connection);
                }
                Throwable thA = pg.p.a(objA);
                if (thA != null) {
                    h6.a.a("ROLLBACK TRANSACTION", connection);
                    throw thA;
                }
            }
            e().onOpen(connection);
            for (g0.b bVar : c()) {
                bVar.getClass();
                if (connection instanceof y5.a) {
                    bVar.a(((y5.a) connection).f33939a);
                }
            }
            this.f2830a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void i(h6.b bVar) {
        h6.a.a("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", bVar);
        String hash = e().getIdentityHash();
        kotlin.jvm.internal.r.e(hash, "hash");
        h6.a.a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')", bVar);
    }
}
