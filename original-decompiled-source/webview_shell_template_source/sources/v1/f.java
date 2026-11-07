package v1;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.camera.camera2.internal.s0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f14751j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f14753b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f14754c;

    /* renamed from: f, reason: collision with root package name */
    public volatile a2.e f14757f;

    /* renamed from: g, reason: collision with root package name */
    public final b f14758g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f14755d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f14756e = false;

    @SuppressLint({"RestrictedApi"})
    public final n.b<c, d> h = new n.b<>();

    /* renamed from: i, reason: collision with root package name */
    public final a f14759i = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, Integer> f14752a = new HashMap<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        public final HashSet a() {
            HashSet hashSet = new HashSet();
            Cursor cursorG = f.this.f14754c.g(new i2.h("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorG.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorG.getInt(0)));
                } catch (Throwable th) {
                    cursorG.close();
                    throw th;
                }
            }
            cursorG.close();
            if (!hashSet.isEmpty()) {
                f.this.f14757f.e();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00af A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            ReentrantReadWriteLock.ReadLock lock = f.this.f14754c.h.readLock();
            HashSet hashSetA = null;
            try {
                try {
                    lock.lock();
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } catch (SQLiteException e6) {
                e = e6;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                lock.unlock();
                if (hashSetA == null) {
                    return;
                } else {
                    return;
                }
            } catch (IllegalStateException e7) {
                e = e7;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                lock.unlock();
                if (hashSetA == null) {
                }
            }
            if (!f.this.a()) {
                lock.unlock();
                return;
            }
            if (!f.this.f14755d.compareAndSet(true, false)) {
                lock.unlock();
                return;
            }
            if (((a2.a) f.this.f14754c.f14767c.g()).s.inTransaction()) {
                lock.unlock();
                return;
            }
            WorkDatabase_Impl workDatabase_Impl = f.this.f14754c;
            if (workDatabase_Impl.f14770f) {
                a2.a aVar = (a2.a) workDatabase_Impl.f14767c.g();
                aVar.a();
                try {
                    hashSetA = a();
                    aVar.f();
                    aVar.b();
                } catch (Throwable th2) {
                    aVar.b();
                    throw th2;
                }
            } else {
                hashSetA = a();
            }
            lock.unlock();
            if (hashSetA == null || hashSetA.isEmpty()) {
                return;
            }
            synchronized (f.this.h) {
                try {
                    b.e eVar = (b.e) f.this.h.iterator();
                    if (eVar.hasNext()) {
                        ((d) ((Map.Entry) eVar.next()).getValue()).getClass();
                        throw null;
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f14760a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f14761b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f14762c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14763d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14764e;

        public b(int i6) {
            long[] jArr = new long[i6];
            this.f14760a = jArr;
            boolean[] zArr = new boolean[i6];
            this.f14761b = zArr;
            this.f14762c = new int[i6];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (this.f14763d && !this.f14764e) {
                        int length = this.f14760a.length;
                        int i6 = 0;
                        while (true) {
                            int i7 = 1;
                            if (i6 >= length) {
                                this.f14764e = true;
                                this.f14763d = false;
                                return this.f14762c;
                            }
                            boolean z6 = this.f14760a[i6] > 0;
                            boolean[] zArr = this.f14761b;
                            if (z6 != zArr[i6]) {
                                int[] iArr = this.f14762c;
                                if (!z6) {
                                    i7 = 2;
                                }
                                iArr[i6] = i7;
                            } else {
                                this.f14762c[i6] = 0;
                            }
                            zArr[i6] = z6;
                            i6++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
    }

    public f(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f14754c = workDatabase_Impl;
        this.f14758g = new b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f14753b = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str = strArr[i6];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f14752a.put(lowerCase, Integer.valueOf(i6));
            String str2 = (String) map.get(strArr[i6]);
            if (str2 != null) {
                this.f14753b[i6] = str2.toLowerCase(locale);
            } else {
                this.f14753b[i6] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f14752a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f14752a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        a2.a aVar = this.f14754c.f14765a;
        if (aVar == null || !aVar.s.isOpen()) {
            return false;
        }
        if (!this.f14756e) {
            this.f14754c.f14767c.g();
        }
        if (this.f14756e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(z1.a aVar, int i6) throws SQLException {
        a2.a aVar2 = (a2.a) aVar;
        aVar2.c(s0.a(i6, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f14753b[i6];
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = f14751j[i7];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i6);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar2.c(sb.toString());
        }
    }

    public final void c(z1.a aVar) {
        if (((a2.a) aVar).s.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f14754c.h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f14758g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    a2.a aVar2 = (a2.a) aVar;
                    aVar2.a();
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            int i7 = iArrA[i6];
                            if (i7 == 1) {
                                b(aVar, i6);
                            } else if (i7 == 2) {
                                String str = this.f14753b[i6];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f14751j;
                                for (int i8 = 0; i8 < 3; i8++) {
                                    String str2 = strArr[i8];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    ((a2.a) aVar).c(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            aVar2.b();
                            throw th;
                        }
                    }
                    aVar2.f();
                    aVar2.b();
                    b bVar = this.f14758g;
                    synchronized (bVar) {
                        bVar.f14764e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e6) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
                return;
            }
        }
    }
}
