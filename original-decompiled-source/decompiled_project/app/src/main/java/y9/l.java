package y9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import c2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import r9.h;
import u9.a;
import u9.c;
import y9.l;
import z9.b;

/* loaded from: classes.dex */
public final class l implements d, z9.b, c {

    /* renamed from: f, reason: collision with root package name */
    public static final o9.b f34338f = new o9.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final s f34339a;

    /* renamed from: b, reason: collision with root package name */
    public final aa.a f34340b;

    /* renamed from: c, reason: collision with root package name */
    public final aa.a f34341c;

    /* renamed from: d, reason: collision with root package name */
    public final y9.a f34342d;

    /* renamed from: e, reason: collision with root package name */
    public final og.a<String> f34343e;

    public interface a<T, U> {
        U apply(T t3);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f34344a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34345b;

        public b(String str, String str2) {
            this.f34344a = str;
            this.f34345b = str2;
        }
    }

    public l(aa.a aVar, aa.a aVar2, y9.a aVar3, s sVar, og.a<String> aVar4) {
        this.f34339a = sVar;
        this.f34340b = aVar;
        this.f34341c = aVar2;
        this.f34342d = aVar3;
        this.f34343e = aVar4;
    }

    public static Long M(SQLiteDatabase sQLiteDatabase, r9.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f23291a, String.valueOf(ba.a.a(jVar.f23293c))));
        byte[] bArr = jVar.f23292b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String d0(Iterable<f> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T e0(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // y9.d
    public final y9.b C0(final r9.j jVar, final r9.n nVar) {
        o9.c cVar = jVar.f23293c;
        String strG = nVar.g();
        String str = jVar.f23291a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + cVar + ", name=" + strG + " for destination " + str);
        }
        long jLongValue = ((Long) N(new a() { // from class: y9.k
            @Override // y9.l.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                l lVar = this.f34335a;
                long jSimpleQueryForLong = lVar.E().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar.E().compileStatement("PRAGMA page_count").simpleQueryForLong();
                a aVar = lVar.f34342d;
                long jE = aVar.e();
                r9.n nVar2 = nVar;
                if (jSimpleQueryForLong >= jE) {
                    lVar.h(1L, nVar2.g(), c.a.CACHE_FULL);
                    return -1L;
                }
                r9.j jVar2 = jVar;
                Long lM = l.M(sQLiteDatabase, jVar2);
                if (lM != null) {
                    jInsert = lM.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar2.f23291a);
                    contentValues.put("priority", Integer.valueOf(ba.a.a(jVar2.f23293c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar2.f23292b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = aVar.d();
                byte[] bArr2 = nVar2.d().f23303b;
                boolean z10 = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", nVar2.g());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar2.h()));
                contentValues2.put("payload_encoding", nVar2.d().f23302a.f19062a);
                contentValues2.put("code", nVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(bArr2.length / iD);
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * iD, Math.min(i10 * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(nVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new y9.b(jLongValue, jVar, nVar);
    }

    public final SQLiteDatabase E() {
        s sVar = this.f34339a;
        Objects.requireNonNull(sVar);
        aa.a aVar = this.f34341c;
        long jA = aVar.a();
        while (true) {
            try {
                return sVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f34342d.a() + jA) {
                    throw new z9.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // y9.d
    public final void J(final long j10, final r9.j jVar) {
        N(new a() { // from class: y9.i
            @Override // y9.l.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                r9.j jVar2 = jVar;
                String str = jVar2.f23291a;
                o9.c cVar = jVar2.f23293c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(ba.a.a(cVar))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(ba.a.a(cVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    public final <T> T N(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseE = E();
        sQLiteDatabaseE.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseE);
            sQLiteDatabaseE.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // y9.d
    public final boolean R(r9.j jVar) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseE = E();
        sQLiteDatabaseE.beginTransaction();
        try {
            Long lM = M(sQLiteDatabaseE, jVar);
            if (lM == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = E().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            sQLiteDatabaseE.setTransactionSuccessful();
            sQLiteDatabaseE.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th3) {
            sQLiteDatabaseE.endTransaction();
            throw th3;
        }
    }

    @Override // y9.d
    public final long T(r9.r rVar) {
        Cursor cursorRawQuery = E().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.a(), String.valueOf(ba.a.a(rVar.c()))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public final ArrayList Z(SQLiteDatabase sQLiteDatabase, r9.j jVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lM = M(sQLiteDatabase, jVar);
        if (lM == null) {
            return arrayList;
        }
        e0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM.toString()}, null, null, null, String.valueOf(i10)), new t6.m(this, arrayList, jVar));
        return arrayList;
    }

    @Override // y9.d
    public final int a() {
        final long jA = this.f34340b.a() - this.f34342d.b();
        return ((Integer) N(new a() { // from class: y9.g
            @Override // y9.l.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                l lVar = this.f34326a;
                lVar.getClass();
                String[] strArr = {String.valueOf(jA)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        lVar.h(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), c.a.MESSAGE_TOO_OLD);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34339a.close();
    }

    @Override // y9.c
    public final void h(final long j10, final String str, final c.a aVar) {
        N(new a() { // from class: y9.j
            @Override // y9.l.a
            public final Object apply(Object obj) throws SQLException {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i10 = aVar.f29655a;
                String string = Integer.toString(i10);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z10 = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j11 = j10;
                    if (z10) {
                        sQLiteDatabase.execSQL(u.a("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?", j11), new String[]{str2, Integer.toString(i10)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i10));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
        });
    }

    @Override // y9.d
    public final void k(Iterable<f> iterable) {
        if (iterable.iterator().hasNext()) {
            E().compileStatement("DELETE FROM events WHERE _id in " + d0(iterable)).execute();
        }
    }

    @Override // y9.c
    public final void l() {
        SQLiteDatabase sQLiteDatabaseE = E();
        sQLiteDatabaseE.beginTransaction();
        try {
            sQLiteDatabaseE.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseE.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f34340b.a()).execute();
            sQLiteDatabaseE.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // z9.b
    public final <T> T p(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseE = E();
        aa.a aVar2 = this.f34341c;
        long jA = aVar2.a();
        while (true) {
            try {
                sQLiteDatabaseE.beginTransaction();
                try {
                    T tF = aVar.f();
                    sQLiteDatabaseE.setTransactionSuccessful();
                    return tF;
                } finally {
                    sQLiteDatabaseE.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar2.a() >= this.f34342d.a() + jA) {
                    throw new z9.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // y9.d
    public final void r0(Iterable<f> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d0(iterable);
            SQLiteDatabase sQLiteDatabaseE = E();
            sQLiteDatabaseE.beginTransaction();
            try {
                sQLiteDatabaseE.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        h(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), c.a.MAX_RETRIES_REACHED);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseE.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseE.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseE.endTransaction();
            }
        }
    }

    @Override // y9.d
    public final Iterable v(final r9.j jVar) {
        return (Iterable) N(new a() { // from class: y9.h
            @Override // y9.l.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                l lVar = this.f34328a;
                a aVar = lVar.f34342d;
                int iC = aVar.c();
                r9.j jVar2 = jVar;
                ArrayList arrayListZ = lVar.Z(sQLiteDatabase, jVar2, iC);
                for (o9.c cVar : o9.c.values()) {
                    if (cVar != jVar2.f23293c) {
                        int iC2 = aVar.c() - arrayListZ.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        String strA = jVar2.a();
                        if (strA == null) {
                            throw new NullPointerException("Null backendName");
                        }
                        if (cVar == null) {
                            throw new NullPointerException("Null priority");
                        }
                        arrayListZ.addAll(lVar.Z(sQLiteDatabase, new r9.j(strA, jVar2.b(), cVar), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i10 = 0; i10 < arrayListZ.size(); i10++) {
                    sb.append(((f) arrayListZ.get(i10)).b());
                    if (i10 < arrayListZ.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        long j10 = cursorQuery.getLong(0);
                        Set hashSet = (Set) map.get(Long.valueOf(j10));
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(Long.valueOf(j10), hashSet);
                        }
                        hashSet.add(new l.b(cursorQuery.getString(1), cursorQuery.getString(2)));
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                }
                cursorQuery.close();
                ListIterator listIterator = arrayListZ.listIterator();
                while (listIterator.hasNext()) {
                    f fVar = (f) listIterator.next();
                    if (map.containsKey(Long.valueOf(fVar.b()))) {
                        h.a aVarI = fVar.a().i();
                        for (l.b bVar : (Set) map.get(Long.valueOf(fVar.b()))) {
                            aVarI.a(bVar.f34344a, bVar.f34345b);
                        }
                        listIterator.set(new b(fVar.b(), fVar.c(), aVarI.b()));
                    }
                }
                return arrayListZ;
            }
        });
    }

    @Override // y9.d
    public final List x() {
        SQLiteDatabase sQLiteDatabaseE = E();
        sQLiteDatabaseE.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    o9.c cVarB = ba.a.b(cursorRawQuery.getInt(2));
                    String string2 = cursorRawQuery.getString(3);
                    arrayList.add(new r9.j(string, string2 == null ? null : Base64.decode(string2, 0), cVarB));
                }
                cursorRawQuery.close();
                sQLiteDatabaseE.setTransactionSuccessful();
                return arrayList;
            } catch (Throwable th2) {
                cursorRawQuery.close();
                throw th2;
            }
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // y9.c
    public final u9.a z() {
        int i10 = u9.a.f29635e;
        a.C0302a c0302a = new a.C0302a();
        c0302a.f29640a = null;
        c0302a.f29641b = new ArrayList();
        c0302a.f29642c = null;
        c0302a.f29643d = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseE = E();
        sQLiteDatabaseE.beginTransaction();
        try {
            u9.a aVar = (u9.a) e0(sQLiteDatabaseE.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new l4.c(this, map, c0302a));
            sQLiteDatabaseE.setTransactionSuccessful();
            return aVar;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }
}
