package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.g0;
import androidx.work.impl.WorkDatabase_Impl;
import i6.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import rg.b;

@pg.d
/* loaded from: classes.dex */
public final class l0 extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public c f3009b;

    /* renamed from: c, reason: collision with root package name */
    public final List<g0.b> f3010c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase_Impl.a f3011d;

    @pg.d
    public static abstract class a {
    }

    @pg.d
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3012a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3013b;

        public b(boolean z10, String str) {
            this.f3012a = z10;
            this.f3013b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c configuration, WorkDatabase_Impl.a aVar) {
        super(23);
        kotlin.jvm.internal.r.e(configuration, "configuration");
        this.f3010c = configuration.f2861e;
        this.f3009b = configuration;
        this.f3011d = aVar;
    }

    @Override // i6.c.a
    public final void b(j6.f fVar) {
    }

    @Override // i6.c.a
    public final void c(j6.f fVar) throws IOException, SQLException {
        Cursor cursorB = fVar.B(new i6.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z10 = false;
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) == 0) {
                    z10 = true;
                }
            }
            cursorB.close();
            WorkDatabase_Impl.a aVar = this.f3011d;
            aVar.a(fVar);
            if (!z10) {
                b bVarB = aVar.b(fVar);
                if (!bVarB.f3012a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f3013b);
                }
            }
            fVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            fVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = WorkDatabase_Impl.this.mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g0.b) it.next()).getClass();
                }
            }
            List<g0.b> list2 = this.f3010c;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((g0.b) it2.next()).getClass();
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ah.c.a(cursorB, th2);
                throw th3;
            }
        }
    }

    @Override // i6.c.a
    public final void d(j6.f fVar, int i10, int i11) throws IOException, SQLException {
        f(fVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // i6.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(j6.f fVar) throws IOException, SQLException {
        boolean z10;
        Cursor cursorB = fVar.B(new i6.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            cursorB.close();
            WorkDatabase_Impl.a aVar = this.f3011d;
            if (z10) {
                cursorB = fVar.B(new i6.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorB.moveToFirst() ? cursorB.getString(0) : null;
                    cursorB.close();
                    if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                        throw new IllegalStateException(m3.a.a("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                    }
                } finally {
                }
            } else {
                b bVarB = aVar.b(fVar);
                if (!bVarB.f3012a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f3013b);
                }
                fVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                fVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            }
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            workDatabase_Impl.mDatabase = fVar;
            fVar.n("PRAGMA foreign_keys = ON");
            workDatabase_Impl.internalInitInvalidationTracker(fVar);
            List list = workDatabase_Impl.mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g0.b) it.next()).a(fVar);
                }
            }
            List<g0.b> list2 = this.f3010c;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((g0.b) it2.next()).a(fVar);
                }
            }
            this.f3009b = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i6.c.a
    public final void f(j6.f fVar, int i10, int i11) throws IOException, SQLException {
        c cVar = this.f3009b;
        WorkDatabase_Impl.a aVar = this.f3011d;
        if (cVar != null) {
            g0.e eVar = cVar.f2860d;
            eVar.getClass();
            List<z5.a> listA = b6.l.a(eVar, i10, i11);
            if (listA != null) {
                b6.c.b(new y5.a(fVar));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    ((z5.a) it.next()).migrate(new y5.a(fVar));
                }
                b bVarB = aVar.b(fVar);
                if (bVarB.f3012a) {
                    fVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    fVar.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarB.f3013b);
                }
            }
        }
        c cVar2 = this.f3009b;
        if (cVar2 == null || b6.l.b(cVar2, i10, i11)) {
            throw new IllegalStateException(r1.f.a(i10, i11, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (cVar2.f2875s) {
            Cursor cursorB = fVar.B(new i6.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                rg.b bVarB2 = c0.g0.b();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    kotlin.jvm.internal.r.b(string);
                    if (!mh.t.p(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        bVarB2.add(new pg.n(string, Boolean.valueOf(kotlin.jvm.internal.r.a(cursorB.getString(1), "view"))));
                    }
                }
                rg.b bVarA = c0.g0.a(bVarB2);
                cursorB.close();
                ListIterator listIterator = bVarA.listIterator(0);
                while (true) {
                    b.C0262b c0262b = (b.C0262b) listIterator;
                    if (!c0262b.hasNext()) {
                        break;
                    }
                    pg.n nVar = (pg.n) c0262b.next();
                    String str = (String) nVar.f21469a;
                    if (((Boolean) nVar.f21470b).booleanValue()) {
                        fVar.n("DROP VIEW IF EXISTS " + str);
                    } else {
                        fVar.n("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            fVar.n("DROP TABLE IF EXISTS `Dependency`");
            fVar.n("DROP TABLE IF EXISTS `WorkSpec`");
            fVar.n("DROP TABLE IF EXISTS `WorkTag`");
            fVar.n("DROP TABLE IF EXISTS `SystemIdInfo`");
            fVar.n("DROP TABLE IF EXISTS `WorkName`");
            fVar.n("DROP TABLE IF EXISTS `WorkProgress`");
            fVar.n("DROP TABLE IF EXISTS `Preference`");
            List list = WorkDatabase_Impl.this.mCallbacks;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((g0.b) it2.next()).getClass();
                }
            }
        }
        List<g0.b> list2 = this.f3010c;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                ((g0.b) it3.next()).getClass();
            }
        }
        aVar.a(fVar);
    }
}
