package d7;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import c9.t1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import t6.c0;
import t6.e0;
import u6.d0;
import u6.t0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7386a = t6.s.f("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(d0 d0Var) throws IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        List<? extends e0> list;
        WorkDatabase workDatabase;
        boolean z13;
        Iterator<? extends e0> it;
        boolean z14;
        long j10;
        boolean z15;
        boolean z16;
        c0 c0Var;
        c0 c0Var2;
        HashSet hashSetA = d0.a(d0Var);
        final t0 t0Var = d0Var.f29275a;
        List<? extends e0> list2 = d0Var.f29277c;
        String[] strArr = (String[]) hashSetA.toArray(new String[0]);
        t6.i iVar = d0Var.f29276b;
        t0Var.f29337b.f3119d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final WorkDatabase workDatabase2 = t0Var.f29338c;
        boolean z17 = strArr != null && strArr.length > 0;
        c0 c0Var3 = c0.f27999f;
        c0 c0Var4 = c0.f27997d;
        if (z17) {
            z11 = false;
            z12 = false;
            z10 = true;
            for (String str : strArr) {
                WorkSpec workSpecS = workDatabase2.workSpecDao().s(str);
                if (workSpecS == null) {
                    t6.s.d().b(f7386a, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    z14 = false;
                    break;
                }
                c0 c0Var5 = workSpecS.f3168b;
                z10 &= c0Var5 == c0.f27996c;
                if (c0Var5 == c0Var4) {
                    z12 = true;
                } else if (c0Var5 == c0Var3) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (zIsEmpty || z17) {
            list = list2;
            workDatabase = workDatabase2;
            z13 = false;
            it = list.iterator();
            while (it.hasNext()) {
                e0 next = it.next();
                WorkSpec workSpec = next.f28014b;
                UUID uuid = next.f28013a;
                if (!z17 || z10) {
                    workSpec.f3180n = jCurrentTimeMillis;
                } else if (z12) {
                    workSpec.f3168b = c0Var4;
                } else if (z11) {
                    workSpec.f3168b = c0Var3;
                } else {
                    workSpec.f3168b = c0.f27998e;
                }
                boolean z18 = workSpec.f3168b == c0.f27994a ? true : z13;
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                boolean z19 = z18;
                List<u6.t> schedulers = t0Var.f29340e;
                t0 t0Var2 = t0Var;
                kotlin.jvm.internal.r.e(schedulers, "schedulers");
                androidx.work.b bVar = workSpec.f3171e;
                boolean zB = bVar.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                Iterator<? extends e0> it2 = it;
                boolean zB2 = bVar.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                boolean zB3 = bVar.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (!zB && zB2 && zB3) {
                    String str2 = workSpec.f3169c;
                    j10 = jCurrentTimeMillis;
                    b.a aVar = new b.a();
                    aVar.a(bVar.f3130a);
                    LinkedHashMap linkedHashMap = aVar.f3131a;
                    linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                    androidx.work.b bVar2 = new androidx.work.b(linkedHashMap);
                    b.C0046b.b(bVar2);
                    String id2 = workSpec.f3167a;
                    c0 state = workSpec.f3168b;
                    String inputMergerClassName = workSpec.f3170d;
                    androidx.work.b output = workSpec.f3172f;
                    z15 = zIsEmpty;
                    z16 = z17;
                    long j11 = workSpec.f3173g;
                    long j12 = workSpec.f3174h;
                    long j13 = workSpec.f3175i;
                    t6.e constraints = workSpec.f3176j;
                    int i10 = workSpec.f3177k;
                    t6.a backoffPolicy = workSpec.f3178l;
                    c0Var = c0Var3;
                    c0Var2 = c0Var4;
                    long j14 = workSpec.f3179m;
                    long j15 = workSpec.f3180n;
                    long j16 = workSpec.f3181o;
                    long j17 = workSpec.f3182p;
                    boolean z20 = workSpec.f3183q;
                    t6.b0 outOfQuotaPolicy = workSpec.f3184r;
                    int i11 = workSpec.f3185s;
                    int i12 = workSpec.f3186t;
                    long j18 = workSpec.f3187u;
                    int i13 = workSpec.f3188v;
                    int i14 = workSpec.f3189w;
                    String str3 = workSpec.f3190x;
                    kotlin.jvm.internal.r.e(id2, "id");
                    kotlin.jvm.internal.r.e(state, "state");
                    kotlin.jvm.internal.r.e(inputMergerClassName, "inputMergerClassName");
                    kotlin.jvm.internal.r.e(output, "output");
                    kotlin.jvm.internal.r.e(constraints, "constraints");
                    kotlin.jvm.internal.r.e(backoffPolicy, "backoffPolicy");
                    kotlin.jvm.internal.r.e(outOfQuotaPolicy, "outOfQuotaPolicy");
                    workSpec = new WorkSpec(id2, state, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", inputMergerClassName, bVar2, output, j11, j12, j13, constraints, i10, backoffPolicy, j14, j15, j16, j17, z20, outOfQuotaPolicy, i11, i12, j18, i13, i14, str3);
                } else {
                    j10 = jCurrentTimeMillis;
                    z15 = zIsEmpty;
                    z16 = z17;
                    c0Var = c0Var3;
                    c0Var2 = c0Var4;
                }
                workSpecDao.j(workSpec);
                if (z16) {
                    for (String str4 : strArr) {
                        String string = uuid.toString();
                        kotlin.jvm.internal.r.d(string, "id.toString()");
                        workDatabase.dependencyDao().a(new Dependency(string, str4));
                    }
                }
                WorkTagDao workTagDao = workDatabase.workTagDao();
                String string2 = uuid.toString();
                kotlin.jvm.internal.r.d(string2, "id.toString()");
                workTagDao.c(string2, next.f28015c);
                if (!z15) {
                    WorkNameDao workNameDao = workDatabase.workNameDao();
                    kotlin.jvm.internal.r.d(uuid.toString(), "id.toString()");
                    kotlin.jvm.internal.r.e(null, "name");
                    workNameDao.a(new WorkName());
                }
                z13 = z19;
                t0Var = t0Var2;
                zIsEmpty = z15;
                it = it2;
                jCurrentTimeMillis = j10;
                z17 = z16;
                c0Var3 = c0Var;
                c0Var4 = c0Var2;
            }
            z14 = z13;
        } else {
            ArrayList arrayListI = workDatabase2.workSpecDao().i();
            if (!arrayListI.isEmpty()) {
                t6.i iVar2 = t6.i.f28025b;
                t6.i iVar3 = t6.i.f28026c;
                if (iVar == iVar2 || iVar == iVar3) {
                    list = list2;
                    DependencyDao dependencyDao = workDatabase2.dependencyDao();
                    ?? arrayList = new ArrayList();
                    int size = arrayListI.size();
                    workDatabase = workDatabase2;
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayListI.get(i15);
                        int i16 = i15 + 1;
                        ((WorkSpec.a) obj).getClass();
                        if (!dependencyDao.d(null)) {
                            arrayList.add(null);
                            z10 &= false;
                        }
                        i15 = i16;
                    }
                    if (iVar == iVar3 && (z11 || z12)) {
                        WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
                        ArrayList arrayListI2 = workSpecDao2.i();
                        int size2 = arrayListI2.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj2 = arrayListI2.get(i17);
                            i17++;
                            ((WorkSpec.a) obj2).getClass();
                            workSpecDao2.a(null);
                        }
                        arrayList = Collections.EMPTY_LIST;
                        z11 = false;
                        z12 = false;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z17 = strArr.length > 0;
                } else {
                    if (iVar == t6.i.f28024a) {
                        int size3 = arrayListI.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            Object obj3 = arrayListI.get(i18);
                            i18++;
                            ((WorkSpec.a) obj3).getClass();
                        }
                    }
                    kotlin.jvm.internal.r.e(null, "name");
                    workDatabase2.runInTransaction(new Runnable() { // from class: d7.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArrayList arrayListB = workDatabase2.workSpecDao().b();
                            int size4 = arrayListB.size();
                            int i19 = 0;
                            while (i19 < size4) {
                                Object obj4 = arrayListB.get(i19);
                                i19++;
                                t1.a(t0Var, (String) obj4);
                            }
                        }
                    });
                    WorkSpecDao workSpecDao3 = workDatabase2.workSpecDao();
                    int size4 = arrayListI.size();
                    int i19 = 0;
                    while (i19 < size4) {
                        Object obj4 = arrayListI.get(i19);
                        i19++;
                        ((WorkSpec.a) obj4).getClass();
                        workSpecDao3.a(null);
                        list2 = list2;
                    }
                    list = list2;
                    workDatabase = workDatabase2;
                    z13 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    z14 = z13;
                }
            }
            z13 = false;
            it = list.iterator();
            while (it.hasNext()) {
            }
            z14 = z13;
        }
        d0Var.f29280f = true;
        return z14;
    }
}
