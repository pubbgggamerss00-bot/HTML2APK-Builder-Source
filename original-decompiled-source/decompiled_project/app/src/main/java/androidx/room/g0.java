package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.r;
import androidx.room.t0;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import i0.u2;
import i6.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import ph.j1;
import ph.n2;
import ph.s1;
import tg.f;
import tg.h;

/* loaded from: classes.dex */
public abstract class g0 {
    public static final c Companion = new c();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private a6.a autoCloser;
    private z connectionManager;
    private ph.i0 coroutineScope;
    private Executor internalQueryExecutor;
    private m internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile i6.b mDatabase;
    private tg.h transactionContext;
    private final w5.a closeBarrier = new w5.a(new f(0, this, g0.class, "onClosed", "onClosed()V", 0));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<kh.c<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static class a<T extends g0> {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.internal.h f2921a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f2922b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2923c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f2924d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f2925e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f2926f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f2927g;

        /* renamed from: h, reason: collision with root package name */
        public u6.e0 f2928h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2929i;

        /* renamed from: j, reason: collision with root package name */
        public final d f2930j;

        /* renamed from: k, reason: collision with root package name */
        public final long f2931k;

        /* renamed from: l, reason: collision with root package name */
        public final e f2932l;

        /* renamed from: m, reason: collision with root package name */
        public final LinkedHashSet f2933m;

        /* renamed from: n, reason: collision with root package name */
        public final LinkedHashSet f2934n;

        /* renamed from: o, reason: collision with root package name */
        public final ArrayList f2935o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f2936p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f2937q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f2938r;

        public a(Context context, Class<T> cls, String str) {
            kotlin.jvm.internal.r.e(context, "context");
            this.f2924d = new ArrayList();
            this.f2925e = new ArrayList();
            this.f2930j = d.f2939a;
            this.f2931k = -1L;
            this.f2932l = new e();
            this.f2933m = new LinkedHashSet();
            this.f2934n = new LinkedHashSet();
            this.f2935o = new ArrayList();
            this.f2936p = true;
            this.f2938r = true;
            this.f2921a = kotlin.jvm.internal.h0.a(cls);
            this.f2922b = context;
            this.f2923c = str;
        }

        public final void a(z5.a... aVarArr) {
            for (z5.a aVar : aVarArr) {
                Integer numValueOf = Integer.valueOf(aVar.startVersion);
                LinkedHashSet linkedHashSet = this.f2934n;
                linkedHashSet.add(numValueOf);
                linkedHashSet.add(Integer.valueOf(aVar.endVersion));
            }
            z5.a[] migrations = (z5.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            e eVar = this.f2932l;
            eVar.getClass();
            kotlin.jvm.internal.r.e(migrations, "migrations");
            for (z5.a aVar2 : migrations) {
                eVar.a(aVar2);
            }
        }

        public final T b() throws ClassNotFoundException {
            String name;
            String str;
            Executor executor = this.f2926f;
            if (executor == null && this.f2927g == null) {
                n.a aVar = n.b.f18284c;
                this.f2927g = aVar;
                this.f2926f = aVar;
            } else if (executor != null && this.f2927g == null) {
                this.f2927g = executor;
            } else if (executor == null) {
                this.f2926f = this.f2927g;
            }
            LinkedHashSet migrationStartAndEndVersions = this.f2934n;
            kotlin.jvm.internal.r.e(migrationStartAndEndVersions, "migrationStartAndEndVersions");
            LinkedHashSet migrationsNotRequiredFrom = this.f2933m;
            kotlin.jvm.internal.r.e(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
            if (!migrationStartAndEndVersions.isEmpty()) {
                Iterator it = migrationStartAndEndVersions.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(j2.y.a(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                    }
                }
            }
            c.InterfaceC0132c iVar = this.f2928h;
            if (iVar == null) {
                iVar = new j6.i();
            }
            c.InterfaceC0132c interfaceC0132c = iVar;
            if (this.f2931k > 0) {
                if (this.f2923c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            boolean z10 = this.f2929i;
            d dVar = this.f2930j;
            dVar.getClass();
            Context context = this.f2922b;
            kotlin.jvm.internal.r.e(context, "context");
            if (dVar == d.f2939a) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                dVar = (activityManager == null || activityManager.isLowRamDevice()) ? d.f2940b : d.f2941c;
            }
            d dVar2 = dVar;
            Executor executor2 = this.f2926f;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f2927g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            androidx.room.c cVar = new androidx.room.c(context, this.f2923c, interfaceC0132c, this.f2932l, this.f2924d, z10, dVar2, executor2, executor3, null, this.f2936p, this.f2937q, migrationsNotRequiredFrom, null, null, null, this.f2925e, this.f2935o, false, null, null);
            cVar.f2878v = this.f2938r;
            Class clsC = b3.e.c(this.f2921a);
            Package r52 = clsC.getPackage();
            if (r52 == null || (name = r52.getName()) == null) {
                name = "";
            }
            String canonicalName = clsC.getCanonicalName();
            kotlin.jvm.internal.r.b(canonicalName);
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                kotlin.jvm.internal.r.d(canonicalName, "substring(...)");
            }
            String strConcat = mh.t.m(canonicalName, '.', '_').concat("_Impl");
            try {
                if (name.length() == 0) {
                    str = strConcat;
                } else {
                    str = name + '.' + strConcat;
                }
                Class<?> cls = Class.forName(str, true, clsC.getClassLoader());
                kotlin.jvm.internal.r.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
                T t3 = (T) cls.getDeclaredConstructor(null).newInstance(null);
                t3.init(cVar);
                return t3;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("Cannot find implementation for " + clsC.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(f0.b(clsC, new StringBuilder("Cannot access the constructor ")), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(f0.b(clsC, new StringBuilder("Failed to create an instance of ")), e12);
            }
        }
    }

    public static abstract class b {
        public void a(i6.b db2) {
            kotlin.jvm.internal.r.e(db2, "db");
        }
    }

    public static final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2939a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f2940b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f2941c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ d[] f2942d;

        static {
            d dVar = new d("AUTOMATIC", 0);
            f2939a = dVar;
            d dVar2 = new d("TRUNCATE", 1);
            f2940b = dVar2;
            d dVar3 = new d("WRITE_AHEAD_LOGGING", 2);
            f2941c = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            f2942d = dVarArr;
            u2.e(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f2942d.clone();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f2943a = new LinkedHashMap();

        public final void a(z5.a migration) {
            kotlin.jvm.internal.r.e(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Integer numValueOf = Integer.valueOf(i10);
            LinkedHashMap linkedHashMap = this.f2943a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() throws Exception {
            ((g0) this.receiver).onClosed();
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {507}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f2944a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2946c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f2947d;

        @vg.e(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {508, 509, 511, 517, 518, 519}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<t0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f2948a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f2949b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g0 f2950c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f2951d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String[] f2952e;

            @vg.e(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {BinaryXmlFormat.RES_TABLE_TYPE_TYPE, 515}, m = "invokeSuspend")
            /* renamed from: androidx.room.g0$g$a$a, reason: collision with other inner class name */
            public static final class C0040a extends vg.i implements eh.p<s0<pg.f0>, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public String[] f2953a;

                /* renamed from: b, reason: collision with root package name */
                public int f2954b;

                /* renamed from: c, reason: collision with root package name */
                public int f2955c;

                /* renamed from: d, reason: collision with root package name */
                public int f2956d;

                /* renamed from: e, reason: collision with root package name */
                public /* synthetic */ Object f2957e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f2958f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String[] f2959g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0040a(boolean z10, String[] strArr, tg.e<? super C0040a> eVar) {
                    super(2, eVar);
                    this.f2958f = z10;
                    this.f2959g = strArr;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    C0040a c0040a = new C0040a(this.f2958f, this.f2959g, eVar);
                    c0040a.f2957e = obj;
                    return c0040a;
                }

                @Override // eh.p
                public final Object invoke(s0<pg.f0> s0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0040a) create(s0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
                
                    if (androidx.room.v0.a(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
                
                    if (androidx.room.v0.a(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:20:0x0073). Please report as a decompilation issue!!! */
                @Override // vg.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    s0 s0Var;
                    s0 s0Var2;
                    int length;
                    int i10;
                    String[] strArr;
                    ug.a aVar = ug.a.f29706a;
                    int i11 = this.f2956d;
                    if (i11 == 0) {
                        pg.q.b(obj);
                        s0Var = (s0) this.f2957e;
                        if (this.f2958f) {
                            this.f2957e = s0Var;
                            this.f2956d = 1;
                        }
                    } else if (i11 == 1) {
                        s0Var = (s0) this.f2957e;
                        pg.q.b(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        length = this.f2955c;
                        i10 = this.f2954b;
                        strArr = this.f2953a;
                        s0Var2 = (s0) this.f2957e;
                        pg.q.b(obj);
                        i10++;
                        if (i10 < length) {
                            return pg.f0.f21461a;
                        }
                        String str = "DELETE FROM `" + strArr[i10] + '`';
                        this.f2957e = s0Var2;
                        this.f2953a = strArr;
                        this.f2954b = i10;
                        this.f2955c = length;
                        this.f2956d = 2;
                    }
                    String[] strArr2 = this.f2959g;
                    s0Var2 = s0Var;
                    length = strArr2.length;
                    i10 = 0;
                    strArr = strArr2;
                    if (i10 < length) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, boolean z10, String[] strArr, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f2950c = g0Var;
                this.f2951d = z10;
                this.f2952e = strArr;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f2950c, this.f2951d, this.f2952e, eVar);
                aVar.f2949b = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(t0 t0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(t0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
            
                if (androidx.room.v0.a(r1, "VACUUM", r8) != r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[PHI: r1
              0x006f: PHI (r1v7 androidx.room.t0) = (r1v4 androidx.room.t0), (r1v4 androidx.room.t0), (r1v9 androidx.room.t0) binds: [B:17:0x005d, B:19:0x006c, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r1
              0x0086: PHI (r1v10 androidx.room.t0) = (r1v7 androidx.room.t0), (r1v12 androidx.room.t0) binds: [B:22:0x0083, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[PHI: r1 r9
              0x0092: PHI (r1v13 androidx.room.t0) = (r1v10 androidx.room.t0), (r1v15 androidx.room.t0) binds: [B:25:0x008f, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x0092: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:25:0x008f, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                t0 t0Var;
                t0.a aVar;
                C0040a c0040a;
                ug.a aVar2 = ug.a.f29706a;
                int i10 = this.f2948a;
                g0 g0Var = this.f2950c;
                switch (i10) {
                    case 0:
                        pg.q.b(obj);
                        t0 t0Var2 = (t0) this.f2949b;
                        this.f2949b = t0Var2;
                        this.f2948a = 1;
                        Object objB = t0Var2.b(this);
                        if (objB != aVar2) {
                            t0Var = t0Var2;
                            obj = objB;
                            if (((Boolean) obj).booleanValue()) {
                                m invalidationTracker = g0Var.getInvalidationTracker();
                                this.f2949b = t0Var;
                                this.f2948a = 2;
                                if (invalidationTracker.a(this) != aVar2) {
                                    aVar = t0.a.f3089b;
                                    c0040a = new C0040a(this.f2951d, this.f2952e, null);
                                    this.f2949b = t0Var;
                                    this.f2948a = 3;
                                    if (t0Var.c(aVar, c0040a, this) != aVar2) {
                                        this.f2949b = t0Var;
                                        this.f2948a = 4;
                                        obj = t0Var.b(this);
                                        if (obj != aVar2) {
                                            if (!((Boolean) obj).booleanValue()) {
                                                this.f2949b = t0Var;
                                                this.f2948a = 5;
                                                if (v0.a(t0Var, "PRAGMA wal_checkpoint(FULL)", this) != aVar2) {
                                                    this.f2949b = null;
                                                    this.f2948a = 6;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return pg.f0.f21461a;
                        }
                        return aVar2;
                    case 1:
                        t0Var = (t0) this.f2949b;
                        pg.q.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return pg.f0.f21461a;
                    case 2:
                        t0Var = (t0) this.f2949b;
                        pg.q.b(obj);
                        aVar = t0.a.f3089b;
                        c0040a = new C0040a(this.f2951d, this.f2952e, null);
                        this.f2949b = t0Var;
                        this.f2948a = 3;
                        if (t0Var.c(aVar, c0040a, this) != aVar2) {
                        }
                        return aVar2;
                    case 3:
                        t0Var = (t0) this.f2949b;
                        pg.q.b(obj);
                        this.f2949b = t0Var;
                        this.f2948a = 4;
                        obj = t0Var.b(this);
                        if (obj != aVar2) {
                        }
                        return aVar2;
                    case 4:
                        t0Var = (t0) this.f2949b;
                        pg.q.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return pg.f0.f21461a;
                    case 5:
                        t0Var = (t0) this.f2949b;
                        pg.q.b(obj);
                        this.f2949b = null;
                        this.f2948a = 6;
                        break;
                    case 6:
                        pg.q.b(obj);
                        m invalidationTracker2 = g0Var.getInvalidationTracker();
                        invalidationTracker2.f3016c.e(invalidationTracker2.f3019f, invalidationTracker2.f3020g);
                        return pg.f0.f21461a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, String[] strArr, tg.e<? super g> eVar) {
            super(2, eVar);
            this.f2946c = z10;
            this.f2947d = strArr;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return g0.this.new g(this.f2946c, this.f2947d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f2944a;
            if (i10 == 0) {
                pg.q.b(obj);
                g0 g0Var = g0.this;
                z zVar = g0Var.connectionManager;
                if (zVar == null) {
                    kotlin.jvm.internal.r.h("connectionManager");
                    throw null;
                }
                a aVar2 = new a(g0Var, this.f2946c, this.f2947d, null);
                this.f2944a = 1;
                if (zVar.f3102f.o0(false, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    private static final pg.f0 beginTransaction$lambda$8(g0 g0Var, i6.b it) {
        kotlin.jvm.internal.r.e(it, "it");
        g0Var.internalBeginTransaction();
        return pg.f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i6.c createConnectionManager$lambda$1(g0 g0Var, androidx.room.c config) {
        kotlin.jvm.internal.r.e(config, "config");
        return g0Var.createOpenHelper(config);
    }

    private static final pg.f0 endTransaction$lambda$9(g0 g0Var, i6.b it) {
        kotlin.jvm.internal.r.e(it, "it");
        g0Var.internalEndTransaction();
        return pg.f0.f21461a;
    }

    @pg.d
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @pg.d
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        i6.b bVarP = getOpenHelper().P();
        if (!bVarP.h0()) {
            m invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            x5.o.a(new p(invalidationTracker, null));
        }
        if (bVarP.n0()) {
            bVarP.I();
        } else {
            bVarP.i();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().P().U();
        if (inTransaction()) {
            return;
        }
        m invalidationTracker = getInvalidationTracker();
        invalidationTracker.f3016c.e(invalidationTracker.f3019f, invalidationTracker.f3020g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() throws Exception {
        ph.i0 i0Var = this.coroutineScope;
        if (i0Var == null) {
            kotlin.jvm.internal.r.h("coroutineScope");
            throw null;
        }
        ph.j0.b(i0Var, null);
        r rVar = getInvalidationTracker().f3022i;
        if (rVar != null && rVar.f3059e.compareAndSet(false, true)) {
            m mVar = rVar.f3056b;
            r.b observer = rVar.f3063i;
            kotlin.jvm.internal.r.e(observer, "observer");
            ReentrantLock reentrantLock = mVar.f3018e;
            reentrantLock.lock();
            try {
                v vVar = (v) mVar.f3017d.remove(observer);
                if (vVar != null) {
                    a1 a1Var = mVar.f3016c;
                    int[] tableIds = vVar.f3093b;
                    a1Var.getClass();
                    kotlin.jvm.internal.r.e(tableIds, "tableIds");
                    if (a1Var.f2843h.b(tableIds)) {
                        x5.o.a(new o(mVar, null));
                    }
                }
                try {
                    i iVar = rVar.f3061g;
                    if (iVar != null) {
                        iVar.E(rVar.f3064j, rVar.f3060f);
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
                }
                rVar.f3057c.unbindService(rVar.f3065k);
            } finally {
                reentrantLock.unlock();
            }
        }
        z zVar = this.connectionManager;
        if (zVar != null) {
            zVar.f3102f.close();
        } else {
            kotlin.jvm.internal.r.h("connectionManager");
            throw null;
        }
    }

    public static /* synthetic */ Cursor query$default(g0 g0Var, i6.e eVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return g0Var.query(eVar, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pg.f0 runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return pg.f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(eh.a aVar, h6.b it) {
        kotlin.jvm.internal.r.e(it, "it");
        return aVar.invoke();
    }

    private final <T extends i6.c> T unwrapOpenHelper(i6.c cVar) {
        if (cVar == null) {
            return null;
        }
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final void addTypeConverter$room_runtime_release(kh.c<?> kclass, Object converter) {
        kotlin.jvm.internal.r.e(kclass, "kclass");
        kotlin.jvm.internal.r.e(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @pg.d
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public abstract void clearAllTables();

    public void close() throws Exception {
        w5.a aVar = this.closeBarrier;
        synchronized (aVar) {
            if (aVar.f31269c.compareAndSet(false, true)) {
                pg.f0 f0Var = pg.f0.f21461a;
                while (aVar.f31268b.get() != 0) {
                }
                aVar.f31267a.invoke();
            }
        }
    }

    public i6.f compileStatement(String sql) {
        kotlin.jvm.internal.r.e(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().P().r(sql);
    }

    public List<z5.a> createAutoMigrations(Map<kh.c<Object>, Object> autoMigrationSpecs) {
        kotlin.jvm.internal.r.e(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qg.j0.a(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(b3.e.c((kh.c) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final z createConnectionManager$room_runtime_release(androidx.room.c configuration) {
        j0 j0Var;
        kotlin.jvm.internal.r.e(configuration, "configuration");
        try {
            k0 k0VarCreateOpenDelegate = createOpenDelegate();
            kotlin.jvm.internal.r.c(k0VarCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            j0Var = (j0) k0VarCreateOpenDelegate;
        } catch (pg.m unused) {
            j0Var = null;
        }
        return j0Var == null ? new z(configuration, new e0(this, 0)) : new z(configuration, j0Var);
    }

    public abstract m createInvalidationTracker();

    public k0 createOpenDelegate() {
        throw new pg.m();
    }

    @pg.d
    public i6.c createOpenHelper(androidx.room.c config) {
        kotlin.jvm.internal.r.e(config, "config");
        throw new pg.m();
    }

    @pg.d
    public void endTransaction() {
        internalEndTransaction();
    }

    @pg.d
    public List<z5.a> getAutoMigrations(Map<Class<Object>, Object> autoMigrationSpecs) {
        kotlin.jvm.internal.r.e(autoMigrationSpecs, "autoMigrationSpecs");
        return qg.z.f22752a;
    }

    public final w5.a getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    public final ph.i0 getCoroutineScope() {
        ph.i0 i0Var = this.coroutineScope;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.r.h("coroutineScope");
        throw null;
    }

    public m getInvalidationTracker() {
        m mVar = this.internalTracker;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.r.h("internalTracker");
        throw null;
    }

    public i6.c getOpenHelper() {
        z zVar = this.connectionManager;
        if (zVar == null) {
            kotlin.jvm.internal.r.h("connectionManager");
            throw null;
        }
        i6.c cVarJ = zVar.j();
        if (cVarJ != null) {
            return cVarJ;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final tg.h getQueryContext() {
        ph.i0 i0Var = this.coroutineScope;
        if (i0Var != null) {
            return i0Var.getCoroutineContext();
        }
        kotlin.jvm.internal.r.h("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.r.h("internalQueryExecutor");
        throw null;
    }

    public Set<kh.c<Object>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(qg.p.h(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            kotlin.jvm.internal.r.e(cls, "<this>");
            arrayList.add(kotlin.jvm.internal.h0.a(cls));
        }
        return qg.x.h0(arrayList);
    }

    @pg.d
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return qg.b0.f22711a;
    }

    public Map<kh.c<?>, List<kh.c<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iA = qg.j0.a(qg.p.h(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            kotlin.jvm.internal.r.e(cls, "<this>");
            kotlin.jvm.internal.h hVarA = kotlin.jvm.internal.h0.a(cls);
            ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
            for (Class cls2 : list) {
                kotlin.jvm.internal.r.e(cls2, "<this>");
                arrayList.add(kotlin.jvm.internal.h0.a(cls2));
            }
            linkedHashMap.put(hVarA, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<kh.c<?>, List<kh.c<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return qg.a0.f22708a;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final tg.h getTransactionContext$room_runtime_release() {
        tg.h hVar = this.transactionContext;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.r.h("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.r.h("internalTransactionExecutor");
        throw null;
    }

    @pg.d
    public <T> T getTypeConverter(Class<T> klass) {
        kotlin.jvm.internal.r.e(klass, "klass");
        return (T) this.typeConverters.get(kotlin.jvm.internal.h0.a(klass));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        z zVar = this.connectionManager;
        if (zVar != null) {
            return zVar.j() != null;
        }
        kotlin.jvm.internal.r.h("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().P().h0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(androidx.room.c configuration) {
        Executor y0Var;
        tg.h coroutineContext;
        boolean zContainsKey;
        int i10;
        int i11;
        kotlin.jvm.internal.r.e(configuration, "configuration");
        String str = configuration.f2858b;
        Intent intent = configuration.f2866j;
        tg.h hVar = configuration.f2877u;
        this.useTempTrackingTable = configuration.f2878v;
        this.connectionManager = createConnectionManager$room_runtime_release(configuration);
        this.internalTracker = createInvalidationTracker();
        e eVar = configuration.f2860d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<kh.c<Object>> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List<Object> list = configuration.f2874r;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<kh.c<Object>> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i12 = -1;
            if (!it.hasNext()) {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i13 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            break;
                        } else if (i13 < 0) {
                            break;
                        } else {
                            size2 = i13;
                        }
                    }
                }
                for (z5.a aVar : createAutoMigrations(linkedHashMap)) {
                    int i14 = aVar.startVersion;
                    int i15 = aVar.endVersion;
                    LinkedHashMap linkedHashMap2 = eVar.f2943a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                        if (map == null) {
                            map = qg.a0.f22708a;
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i15));
                    } else {
                        zContainsKey = false;
                    }
                    if (!zContainsKey) {
                        eVar.a(aVar);
                    }
                }
                Map<kh.c<?>, List<kh.c<?>>> requiredTypeConverterClassesMap$room_runtime_release = getRequiredTypeConverterClassesMap$room_runtime_release();
                List<Object> list2 = configuration.f2873q;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<kh.c<?>, List<kh.c<?>>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
                    kh.c<?> key = entry.getKey();
                    for (kh.c<?> cVar : entry.getValue()) {
                        int size3 = list2.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i16 = size3 - 1;
                                if (cVar.i(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                } else if (i16 < 0) {
                                    break;
                                } else {
                                    size3 = i16;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cVar.a() + ") for " + key.a() + " is missing in the database configuration.").toString());
                        }
                        addTypeConverter$room_runtime_release(cVar, list2.get(size3));
                    }
                }
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i17 = size4 - 1;
                        if (!zArr2[size4]) {
                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        }
                        if (i17 < 0) {
                            break;
                        } else {
                            size4 = i17;
                        }
                    }
                }
                if (hVar != null) {
                    h.a aVar2 = hVar.get(f.a.f28767a);
                    kotlin.jvm.internal.r.c(aVar2, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                    ph.g0 g0Var = (ph.g0) aVar2;
                    j1 j1Var = g0Var instanceof j1 ? (j1) g0Var : null;
                    if (j1Var == null || (y0Var = j1Var.H0()) == null) {
                        y0Var = new ph.y0(g0Var);
                    }
                    this.internalQueryExecutor = y0Var;
                    this.internalTransactionExecutor = new r0(y0Var);
                    this.coroutineScope = ph.j0.a(hVar.plus(new n2((s1) hVar.get(s1.a.f21589a))));
                    if (inCompatibilityMode$room_runtime_release()) {
                        ph.i0 i0Var = this.coroutineScope;
                        if (i0Var == null) {
                            kotlin.jvm.internal.r.h("coroutineScope");
                            throw null;
                        }
                        coroutineContext = i0Var.getCoroutineContext().plus(g0Var.G0(1));
                    } else {
                        ph.i0 i0Var2 = this.coroutineScope;
                        if (i0Var2 == null) {
                            kotlin.jvm.internal.r.h("coroutineScope");
                            throw null;
                        }
                        coroutineContext = i0Var2.getCoroutineContext();
                    }
                    this.transactionContext = coroutineContext;
                } else {
                    this.internalQueryExecutor = configuration.f2864h;
                    this.internalTransactionExecutor = new r0(configuration.f2865i);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        kotlin.jvm.internal.r.h("internalQueryExecutor");
                        throw null;
                    }
                    uh.c cVarA = ph.j0.a(h.a.C0291a.c(bg.b.g(executor), ah.l.a()));
                    this.coroutineScope = cVarA;
                    tg.h hVar2 = cVarA.f29723a;
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        kotlin.jvm.internal.r.h("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = hVar2.plus(bg.b.g(executor2));
                }
                this.allowMainThreadQueries = configuration.f2862f;
                z zVar = this.connectionManager;
                if (zVar == null) {
                    kotlin.jvm.internal.r.h("connectionManager");
                    throw null;
                }
                i6.c cVarJ = zVar.j();
                if (cVarJ == null) {
                    cVarJ = null;
                    break;
                }
                while (!(cVarJ instanceof a6.c)) {
                    if (!(cVarJ instanceof androidx.room.d)) {
                        cVarJ = null;
                        break;
                    }
                    cVarJ = ((androidx.room.d) cVarJ).h();
                }
                z zVar2 = this.connectionManager;
                if (zVar2 == null) {
                    kotlin.jvm.internal.r.h("connectionManager");
                    throw null;
                }
                i6.c cVarJ2 = zVar2.j();
                if (cVarJ2 == null) {
                    cVarJ2 = null;
                    break;
                }
                while (!(cVarJ2 instanceof a6.b)) {
                    if (!(cVarJ2 instanceof androidx.room.d)) {
                        cVarJ2 = null;
                        break;
                    }
                    cVarJ2 = ((androidx.room.d) cVarJ2).h();
                }
                if (((a6.b) cVarJ2) != null) {
                    if (this.coroutineScope != null) {
                        throw null;
                    }
                    kotlin.jvm.internal.r.h("coroutineScope");
                    throw null;
                }
                if (intent != null) {
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    m invalidationTracker = getInvalidationTracker();
                    Context context = configuration.f2857a;
                    invalidationTracker.getClass();
                    kotlin.jvm.internal.r.e(context, "context");
                    invalidationTracker.f3021h = intent;
                    invalidationTracker.f3022i = new r(context, str, invalidationTracker);
                    return;
                }
                return;
            }
            kh.c<Object> next = it.next();
            int size5 = list.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i18 = size5 - 1;
                    i10 = i12;
                    if (next.i(list.get(size5))) {
                        zArr[size5] = true;
                        i11 = size5;
                        break;
                    } else {
                        if (i18 < 0) {
                            break;
                        }
                        size5 = i18;
                        i12 = i10;
                    }
                }
            } else {
                i10 = -1;
            }
            i11 = i10;
            if (i11 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.a() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, list.get(i11));
        }
    }

    @pg.d
    public void internalInitInvalidationTracker(i6.b db2) {
        kotlin.jvm.internal.r.e(db2, "db");
        internalInitInvalidationTracker(new y5.a(db2));
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        z zVar = this.connectionManager;
        if (zVar == null) {
            kotlin.jvm.internal.r.h("connectionManager");
            throw null;
        }
        i6.b bVar = zVar.f3103g;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal() {
        z zVar = this.connectionManager;
        if (zVar == null) {
            kotlin.jvm.internal.r.h("connectionManager");
            throw null;
        }
        i6.b bVar = zVar.f3103g;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z10, String... tableNames) {
        kotlin.jvm.internal.r.e(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        x5.o.a(new g(z10, tableNames, null));
    }

    public final Cursor query(i6.e query) {
        kotlin.jvm.internal.r.e(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        kotlin.jvm.internal.r.e(body, "body");
        runInTransaction(new b0(body, 0));
    }

    @pg.d
    public void setTransactionSuccessful() {
        getOpenHelper().P().H();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z10, eh.p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar, tg.e<? super R> eVar) {
        z zVar = this.connectionManager;
        if (zVar != null) {
            return zVar.f3102f.o0(z10, pVar, eVar);
        }
        kotlin.jvm.internal.r.h("connectionManager");
        throw null;
    }

    public final void internalInitInvalidationTracker(h6.b connection) {
        kotlin.jvm.internal.r.e(connection, "connection");
        m invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        a1 a1Var = invalidationTracker.f3016c;
        a1Var.getClass();
        h6.d dVarB0 = connection.B0("PRAGMA query_only");
        try {
            dVarB0.t0();
            boolean z10 = dVarB0.getBoolean();
            ch.a.a(dVarB0, null);
            if (!z10) {
                h6.a.a("PRAGMA temp_store = MEMORY", connection);
                h6.a.a("PRAGMA recursive_triggers = 1", connection);
                h6.a.a("DROP TABLE IF EXISTS room_table_modification_log", connection);
                if (a1Var.f2839d) {
                    h6.a.a("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", connection);
                } else {
                    h6.a.a(mh.t.n("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""), connection);
                }
                s sVar = a1Var.f2843h;
                ReentrantLock reentrantLock = sVar.f3077a;
                reentrantLock.lock();
                try {
                    sVar.f3080d = true;
                    pg.f0 f0Var = pg.f0.f21461a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.f3023j) {
                try {
                    r rVar = invalidationTracker.f3022i;
                    if (rVar != null) {
                        Intent intent = invalidationTracker.f3021h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        rVar.a(intent);
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
        }
    }

    public Cursor query(String query, Object[] objArr) {
        kotlin.jvm.internal.r.e(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().P().B(new i6.a(query, objArr));
    }

    public <V> V runInTransaction(Callable<V> body) {
        kotlin.jvm.internal.r.e(body, "body");
        return (V) runInTransaction(new c0(body, 0));
    }

    private final <T> T runInTransaction(eh.a<? extends T> aVar) {
        if (inCompatibilityMode$room_runtime_release()) {
            beginTransaction();
            try {
                T tInvoke = aVar.invoke();
                setTransactionSuccessful();
                return tInvoke;
            } finally {
                endTransaction();
            }
        }
        d0 d0Var = new d0(aVar);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return (T) x5.o.a(new b6.d(this, d0Var, null));
    }

    public final <T> T getTypeConverter(kh.c<T> klass) {
        kotlin.jvm.internal.r.e(klass, "klass");
        T t3 = (T) this.typeConverters.get(klass);
        kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t3;
    }

    public Cursor query(i6.e query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.r.e(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().P().X(query, cancellationSignal);
        }
        return getOpenHelper().P().B(query);
    }
}
