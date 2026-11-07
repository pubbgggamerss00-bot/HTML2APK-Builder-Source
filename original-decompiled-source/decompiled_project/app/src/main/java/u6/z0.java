package u6;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import e7.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;
import ph.u1;
import ph.v1;
import t6.s;
import tg.h;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkSpec f29365a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29366b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29367c;

    /* renamed from: d, reason: collision with root package name */
    public final e7.c f29368d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.a f29369e;

    /* renamed from: f, reason: collision with root package name */
    public final l5.c f29370f;

    /* renamed from: g, reason: collision with root package name */
    public final r f29371g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkDatabase f29372h;

    /* renamed from: i, reason: collision with root package name */
    public final WorkSpecDao f29373i;

    /* renamed from: j, reason: collision with root package name */
    public final DependencyDao f29374j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f29375k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29376l;

    /* renamed from: m, reason: collision with root package name */
    public final u1 f29377m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.work.a f29378a;

        /* renamed from: b, reason: collision with root package name */
        public final e7.c f29379b;

        /* renamed from: c, reason: collision with root package name */
        public final r f29380c;

        /* renamed from: d, reason: collision with root package name */
        public final WorkDatabase f29381d;

        /* renamed from: e, reason: collision with root package name */
        public final WorkSpec f29382e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f29383f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f29384g;

        public a(Context context, androidx.work.a configuration, e7.c cVar, r rVar, WorkDatabase workDatabase, WorkSpec workSpec, ArrayList arrayList) {
            kotlin.jvm.internal.r.e(context, "context");
            kotlin.jvm.internal.r.e(configuration, "configuration");
            this.f29378a = configuration;
            this.f29379b = cVar;
            this.f29380c = rVar;
            this.f29381d = workDatabase;
            this.f29382e = workSpec;
            this.f29383f = arrayList;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.r.d(applicationContext, "context.applicationContext");
            this.f29384g = applicationContext;
            new WorkerParameters.a();
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f29385a = new c.a.C0047a();

            public a(int i10) {
            }
        }

        /* renamed from: u6.z0$b$b, reason: collision with other inner class name */
        public static final class C0300b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final c.a f29386a;

            public C0300b(c.a aVar) {
                this.f29386a = aVar;
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f29387a;

            public c(int i10) {
                this.f29387a = i10;
            }

            public /* synthetic */ c(Object obj) {
                this(-256);
            }
        }
    }

    public z0(a aVar) {
        WorkSpec workSpec = aVar.f29382e;
        this.f29365a = workSpec;
        this.f29366b = aVar.f29384g;
        String str = workSpec.f3167a;
        this.f29367c = str;
        this.f29368d = aVar.f29379b;
        androidx.work.a aVar2 = aVar.f29378a;
        this.f29369e = aVar2;
        this.f29370f = aVar2.f3119d;
        this.f29371g = aVar.f29380c;
        WorkDatabase workDatabase = aVar.f29381d;
        this.f29372h = workDatabase;
        this.f29373i = workDatabase.workSpecDao();
        this.f29374j = workDatabase.dependencyDao();
        ArrayList arrayList = aVar.f29383f;
        this.f29375k = arrayList;
        this.f29376l = b.o.a(e.e.a("Work [ id=", str, ", tags={ "), qg.x.I(arrayList, ",", null, null, null, 62), " } ]");
        this.f29377m = v1.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z0 z0Var, vg.c cVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        c1 c1Var;
        WorkSpec workSpec;
        c1 c1Var2;
        ug.a aVar;
        androidx.work.b bVar;
        Boolean shouldExit;
        t6.k kVar;
        int i10;
        final z0 z0Var2 = z0Var;
        String str = z0Var2.f29367c;
        e7.c cVar2 = z0Var2.f29368d;
        WorkDatabase workDatabase = z0Var2.f29372h;
        androidx.work.a aVar2 = z0Var2.f29369e;
        WorkSpec workSpec2 = z0Var2.f29365a;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i11 = c1Var.f29272d;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                c1Var.f29272d = i11 - PKIFailureInfo.systemUnavail;
            } else {
                c1Var = new c1(z0Var2, cVar);
            }
        }
        Object objE = c1Var.f29270b;
        ug.a aVar3 = ug.a.f29706a;
        int i12 = c1Var.f29272d;
        try {
            if (i12 == 0) {
                pg.q.b(objE);
                c2.y yVar = aVar2.f3128m;
                t6.g gVar = aVar2.f3120e;
                yVar.getClass();
                boolean zB = m6.a.b();
                String str2 = workSpec2.f3190x;
                String str3 = workSpec2.f3169c;
                String className = workSpec2.f3170d;
                androidx.work.b bVar2 = workSpec2.f3171e;
                if (!zB || str2 == null) {
                    workSpec = workSpec2;
                } else {
                    c2.y yVar2 = aVar2.f3128m;
                    int iHashCode = workSpec2.hashCode();
                    yVar2.getClass();
                    workSpec = workSpec2;
                    if (Build.VERSION.SDK_INT >= 29) {
                        m6.b.a(iHashCode, m6.a.c(str2));
                    } else {
                        String strC = m6.a.c(str2);
                        try {
                            if (m6.a.f17670c == null) {
                                i10 = iHashCode;
                                bVar = bVar2;
                                try {
                                    aVar = aVar3;
                                    c1Var2 = c1Var;
                                    try {
                                        m6.a.f17670c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    } catch (Exception e10) {
                                        e = e10;
                                        m6.a.a("asyncTraceBegin", e);
                                        shouldExit = (Boolean) workDatabase.runInTransaction(new Callable() { // from class: u6.x0
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                z0 z0Var3 = this.f29359a;
                                                WorkSpec workSpec3 = z0Var3.f29365a;
                                                t6.c0 c0Var = workSpec3.f3168b;
                                                String str4 = workSpec3.f3169c;
                                                t6.c0 c0Var2 = t6.c0.f27994a;
                                                if (c0Var != c0Var2) {
                                                    String str5 = g1.f29296a;
                                                    t6.s.d().a(str5, str4 + " is not in ENQUEUED state. Nothing more to do");
                                                    return Boolean.TRUE;
                                                }
                                                if (workSpec3.c() || (workSpec3.f3168b == c0Var2 && workSpec3.f3177k > 0)) {
                                                    z0Var3.f29370f.getClass();
                                                    if (System.currentTimeMillis() < workSpec3.a()) {
                                                        t6.s.d().a(g1.f29296a, "Delaying execution for " + str4 + " because it is being executed before schedule.");
                                                        return Boolean.TRUE;
                                                    }
                                                }
                                                return Boolean.FALSE;
                                            }
                                        });
                                        kotlin.jvm.internal.r.d(shouldExit, "shouldExit");
                                        if (!shouldExit.booleanValue()) {
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    c1Var2 = c1Var;
                                    aVar = aVar3;
                                    m6.a.a("asyncTraceBegin", e);
                                    shouldExit = (Boolean) workDatabase.runInTransaction(new Callable() { // from class: u6.x0
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            z0 z0Var3 = this.f29359a;
                                            WorkSpec workSpec3 = z0Var3.f29365a;
                                            t6.c0 c0Var = workSpec3.f3168b;
                                            String str4 = workSpec3.f3169c;
                                            t6.c0 c0Var2 = t6.c0.f27994a;
                                            if (c0Var != c0Var2) {
                                                String str5 = g1.f29296a;
                                                t6.s.d().a(str5, str4 + " is not in ENQUEUED state. Nothing more to do");
                                                return Boolean.TRUE;
                                            }
                                            if (workSpec3.c() || (workSpec3.f3168b == c0Var2 && workSpec3.f3177k > 0)) {
                                                z0Var3.f29370f.getClass();
                                                if (System.currentTimeMillis() < workSpec3.a()) {
                                                    t6.s.d().a(g1.f29296a, "Delaying execution for " + str4 + " because it is being executed before schedule.");
                                                    return Boolean.TRUE;
                                                }
                                            }
                                            return Boolean.FALSE;
                                        }
                                    });
                                    kotlin.jvm.internal.r.d(shouldExit, "shouldExit");
                                    if (!shouldExit.booleanValue()) {
                                    }
                                }
                            } else {
                                c1Var2 = c1Var;
                                aVar = aVar3;
                                i10 = iHashCode;
                                bVar = bVar2;
                            }
                            m6.a.f17670c.invoke(null, Long.valueOf(m6.a.f17668a), strC, Integer.valueOf(i10));
                        } catch (Exception e12) {
                            e = e12;
                            c1Var2 = c1Var;
                            aVar = aVar3;
                            bVar = bVar2;
                        }
                        shouldExit = (Boolean) workDatabase.runInTransaction(new Callable() { // from class: u6.x0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                z0 z0Var3 = this.f29359a;
                                WorkSpec workSpec3 = z0Var3.f29365a;
                                t6.c0 c0Var = workSpec3.f3168b;
                                String str4 = workSpec3.f3169c;
                                t6.c0 c0Var2 = t6.c0.f27994a;
                                if (c0Var != c0Var2) {
                                    String str5 = g1.f29296a;
                                    t6.s.d().a(str5, str4 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (workSpec3.c() || (workSpec3.f3168b == c0Var2 && workSpec3.f3177k > 0)) {
                                    z0Var3.f29370f.getClass();
                                    if (System.currentTimeMillis() < workSpec3.a()) {
                                        t6.s.d().a(g1.f29296a, "Delaying execution for " + str4 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            }
                        });
                        kotlin.jvm.internal.r.d(shouldExit, "shouldExit");
                        if (!shouldExit.booleanValue()) {
                            return new b.c((Object) null);
                        }
                        if (!workSpec.c()) {
                            aVar2.f3121f.getClass();
                            kotlin.jvm.internal.r.e(className, "className");
                            String str4 = t6.l.f28035a;
                            try {
                                Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                                kotlin.jvm.internal.r.c(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                                kVar = (t6.k) objNewInstance;
                            } catch (Exception e13) {
                                t6.s.d().c(t6.l.f28035a, "Trouble instantiating ".concat(className), e13);
                                kVar = null;
                            }
                            if (kVar == null) {
                                t6.s.d().b(g1.f29296a, "Could not create Input Merger ".concat(className));
                                return new b.a(0);
                            }
                            kVar.a(qg.x.O(z0Var2.f29373i.v(str), c0.g0.c(bVar)));
                        }
                        UUID uuidFromString = UUID.fromString(str);
                        ArrayList arrayList = z0Var2.f29375k;
                        ExecutorService executorService = aVar2.f3116a;
                        wh.c cVar3 = aVar2.f3117b;
                        d7.z zVar = new d7.z(workDatabase, z0Var2.f29371g, cVar2);
                        WorkerParameters workerParameters = new WorkerParameters();
                        workerParameters.f3111a = uuidFromString;
                        new HashSet(arrayList);
                        workerParameters.f3112b = executorService;
                        workerParameters.f3113c = cVar3;
                        try {
                            androidx.work.c cVarR = gVar.R(z0Var2.f29366b, str3, workerParameters);
                            cVarR.f3136d = true;
                            h.a aVar4 = c1Var2.getContext().get(s1.a.f21589a);
                            kotlin.jvm.internal.r.b(aVar4);
                            s1 s1Var = (s1) aVar4;
                            s1Var.invokeOnCompletion(new d1(cVarR, zB, str2, z0Var2));
                            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: u6.y0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    boolean z10;
                                    z0 z0Var3 = this.f29362a;
                                    WorkSpecDao workSpecDao = z0Var3.f29373i;
                                    String str5 = z0Var3.f29367c;
                                    if (workSpecDao.r(str5) == t6.c0.f27994a) {
                                        workSpecDao.x(t6.c0.f27995b, str5);
                                        workSpecDao.w(str5);
                                        workSpecDao.p(-256, str5);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                }
                            });
                            kotlin.jvm.internal.r.d(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
                            if (!((Boolean) objRunInTransaction).booleanValue()) {
                                return new b.c((Object) null);
                            }
                            Object obj = null;
                            if (s1Var.isCancelled()) {
                                return new b.c(obj);
                            }
                            c.a aVar5 = cVar2.f8401d;
                            kotlin.jvm.internal.r.d(aVar5, "workTaskExecutor.getMainThreadExecutor()");
                            ph.g0 g0VarG = bg.b.g(aVar5);
                            e1 e1Var = new e1(z0Var2, cVarR, zVar, null);
                            c1 c1Var3 = c1Var2;
                            c1Var3.f29269a = z0Var2;
                            c1Var3.f29272d = 1;
                            objE = ph.h.e(g0VarG, e1Var, c1Var3);
                            ug.a aVar6 = aVar;
                            if (objE == aVar6) {
                                return aVar6;
                            }
                        } catch (Throwable unused) {
                            String str5 = g1.f29296a;
                            t6.s.d().b(str5, "Could not create Worker " + str3);
                            return new b.a(0);
                        }
                    }
                }
                c1Var2 = c1Var;
                aVar = aVar3;
                bVar = bVar2;
                shouldExit = (Boolean) workDatabase.runInTransaction(new Callable() { // from class: u6.x0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        z0 z0Var3 = this.f29359a;
                        WorkSpec workSpec3 = z0Var3.f29365a;
                        t6.c0 c0Var = workSpec3.f3168b;
                        String str42 = workSpec3.f3169c;
                        t6.c0 c0Var2 = t6.c0.f27994a;
                        if (c0Var != c0Var2) {
                            String str52 = g1.f29296a;
                            t6.s.d().a(str52, str42 + " is not in ENQUEUED state. Nothing more to do");
                            return Boolean.TRUE;
                        }
                        if (workSpec3.c() || (workSpec3.f3168b == c0Var2 && workSpec3.f3177k > 0)) {
                            z0Var3.f29370f.getClass();
                            if (System.currentTimeMillis() < workSpec3.a()) {
                                t6.s.d().a(g1.f29296a, "Delaying execution for " + str42 + " because it is being executed before schedule.");
                                return Boolean.TRUE;
                            }
                        }
                        return Boolean.FALSE;
                    }
                });
                kotlin.jvm.internal.r.d(shouldExit, "shouldExit");
                if (!shouldExit.booleanValue()) {
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z0Var2 = c1Var.f29269a;
                pg.q.b(objE);
            }
            c.a result = (c.a) objE;
            kotlin.jvm.internal.r.d(result, "result");
            return new b.C0300b(result);
        } catch (CancellationException e14) {
            String str6 = g1.f29296a;
            t6.s sVarD = t6.s.d();
            String strA = b.o.a(new StringBuilder(), z0Var2.f29376l, " was cancelled");
            if (((s.a) sVarD).f28051c <= 4) {
                Log.i(str6, strA, e14);
            }
            throw e14;
        } catch (Throwable th2) {
            t6.s.d().c(g1.f29296a, b.o.a(new StringBuilder(), z0Var2.f29376l, " failed because it threw an exception/error"), th2);
            z0Var2.f29369e.getClass();
            return new b.a(0);
        }
    }

    public final void b(int i10) {
        WorkSpecDao workSpecDao = this.f29373i;
        t6.c0 c0Var = t6.c0.f27994a;
        String str = this.f29367c;
        workSpecDao.x(c0Var, str);
        this.f29370f.getClass();
        workSpecDao.n(str, System.currentTimeMillis());
        workSpecDao.k(this.f29365a.f3188v, str);
        workSpecDao.e(str, -1L);
        workSpecDao.p(i10, str);
    }

    public final void c() {
        this.f29370f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkSpecDao workSpecDao = this.f29373i;
        String str = this.f29367c;
        workSpecDao.n(str, jCurrentTimeMillis);
        workSpecDao.x(t6.c0.f27994a, str);
        workSpecDao.t(str);
        workSpecDao.k(this.f29365a.f3188v, str);
        workSpecDao.d(str);
        workSpecDao.e(str, -1L);
    }

    public final void d(c.a result) {
        kotlin.jvm.internal.r.e(result, "result");
        String str = this.f29367c;
        ArrayList arrayListK = qg.p.k(str);
        while (true) {
            boolean zIsEmpty = arrayListK.isEmpty();
            WorkSpecDao workSpecDao = this.f29373i;
            if (zIsEmpty) {
                androidx.work.b bVar = ((c.a.C0047a) result).f3137a;
                kotlin.jvm.internal.r.d(bVar, "failure.outputData");
                workSpecDao.k(this.f29365a.f3188v, str);
                workSpecDao.m(str, bVar);
                return;
            }
            String str2 = (String) qg.t.t(arrayListK);
            if (workSpecDao.r(str2) != t6.c0.f27999f) {
                workSpecDao.x(t6.c0.f27997d, str2);
            }
            arrayListK.addAll(this.f29374j.b(str2));
        }
    }
}
