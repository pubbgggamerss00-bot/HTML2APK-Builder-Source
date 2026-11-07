package s2;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.internal.v0;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.n;
import com.google.android.gms.internal.ads.ni0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import r2.l;
import r2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f14357u = androidx.work.k.e("EnqueueRunnable");
    public final j2.g s;

    /* renamed from: t, reason: collision with root package name */
    public final j2.c f14358t = new j2.c();

    public e(j2.g gVar) {
        this.s = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(j2.g gVar) throws Throwable {
        boolean z6;
        boolean z7;
        boolean z8;
        List<? extends androidx.work.r> list;
        boolean z9;
        WorkDatabase workDatabase;
        boolean z10;
        boolean z11;
        Iterator<? extends androidx.work.r> it;
        boolean z12;
        boolean z13;
        Iterator<? extends androidx.work.r> it2;
        UUID uuid;
        WorkDatabase_Impl workDatabase_Impl;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        HashSet hashSetB = j2.g.b(gVar);
        j2.k kVar = gVar.f13462a;
        List<? extends androidx.work.r> list2 = gVar.f13464c;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        androidx.work.g gVar2 = gVar.f13463b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = kVar.f13476c;
        boolean z17 = strArr != null && strArr.length > 0;
        androidx.work.p pVar = androidx.work.p.f1844u;
        androidx.work.p pVar2 = androidx.work.p.f1847x;
        androidx.work.p pVar3 = androidx.work.p.f1845v;
        if (z17) {
            z7 = false;
            z8 = false;
            z6 = true;
            for (String str : strArr) {
                r2.l lVarI = ((r2.s) workDatabase2.n()).i(str);
                if (lVarI == null) {
                    androidx.work.k.c().b(f14357u, v0.b("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    break;
                }
                androidx.work.p pVar4 = lVarI.f14281b;
                z6 &= pVar4 == pVar;
                if (pVar4 == pVar3) {
                    z8 = true;
                } else if (pVar4 == pVar2) {
                    z7 = true;
                }
            }
        } else {
            z6 = true;
            z7 = false;
            z8 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        androidx.work.p pVar5 = androidx.work.p.s;
        if (zIsEmpty || z17) {
            list = list2;
            z9 = zIsEmpty;
            workDatabase = workDatabase2;
            z10 = false;
            z11 = z10;
            boolean z18 = z11;
            for (it = list.iterator(); it.hasNext(); it = it2) {
                androidx.work.r next = it.next();
                r2.l lVar = next.f1850b;
                UUID uuid2 = next.f1849a;
                try {
                    if (!z17 || z6) {
                        if (lVar.c()) {
                            z13 = z18;
                            lVar.f14292n = 0L;
                            if (Build.VERSION.SDK_INT > 25) {
                                androidx.work.d dVar = lVar.f14288j;
                                String str2 = lVar.f14282c;
                                it2 = it;
                                if (!str2.equals(ConstraintTrackingWorker.class.getName()) && (dVar.f1767d || dVar.f1768e)) {
                                    f.a aVar = new f.a();
                                    aVar.a(lVar.f14284e.f1776a);
                                    uuid = uuid2;
                                    aVar.f1777a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                                    lVar.f14282c = ConstraintTrackingWorker.class.getName();
                                    androidx.work.f fVar = new androidx.work.f(aVar.f1777a);
                                    androidx.work.f.c(fVar);
                                    lVar.f14284e = fVar;
                                }
                                z18 = lVar.f14281b == pVar5 ? true : z13;
                                r2.s sVar = (r2.s) workDatabase.n();
                                workDatabase_Impl = sVar.f14299a;
                                workDatabase_Impl.b();
                                workDatabase_Impl.c();
                                sVar.f14300b.e(lVar);
                                workDatabase_Impl.h();
                                if (z17) {
                                    for (String str3 : strArr) {
                                        r2.a aVar2 = new r2.a(uuid.toString(), str3);
                                        ni0 ni0VarI = workDatabase.i();
                                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) ni0VarI.f7447t;
                                        workDatabase_Impl2.b();
                                        workDatabase_Impl2.c();
                                        try {
                                            ((r2.b) ni0VarI.f7448u).e(aVar2);
                                            workDatabase_Impl2.h();
                                            workDatabase_Impl2.f();
                                        } finally {
                                        }
                                    }
                                }
                                for (String str4 : next.f1851c) {
                                    ni0 ni0VarO = workDatabase.o();
                                    t tVar = new t(str4, uuid.toString());
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) ni0VarO.f7447t;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    try {
                                        ((r2.b) ni0VarO.f7448u).e(tVar);
                                        workDatabase_Impl3.h();
                                    } finally {
                                    }
                                }
                                if (!z9) {
                                    ni0 ni0VarL = workDatabase.l();
                                    r2.h hVar = new r2.h(uuid.toString());
                                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) ni0VarL.f7447t;
                                    workDatabase_Impl4.b();
                                    workDatabase_Impl4.c();
                                    try {
                                        ((r2.b) ni0VarL.f7448u).e(hVar);
                                        workDatabase_Impl4.h();
                                    } finally {
                                    }
                                }
                            } else {
                                it2 = it;
                            }
                            uuid = uuid2;
                            if (lVar.f14281b == pVar5) {
                            }
                            r2.s sVar2 = (r2.s) workDatabase.n();
                            workDatabase_Impl = sVar2.f14299a;
                            workDatabase_Impl.b();
                            workDatabase_Impl.c();
                            sVar2.f14300b.e(lVar);
                            workDatabase_Impl.h();
                            if (z17) {
                            }
                            while (r2.hasNext()) {
                            }
                            if (!z9) {
                            }
                        } else {
                            lVar.f14292n = jCurrentTimeMillis;
                        }
                    } else if (z8) {
                        lVar.f14281b = pVar3;
                    } else if (z7) {
                        lVar.f14281b = pVar2;
                    } else {
                        lVar.f14281b = androidx.work.p.f1846w;
                    }
                    sVar2.f14300b.e(lVar);
                    workDatabase_Impl.h();
                    if (z17) {
                    }
                    while (r2.hasNext()) {
                    }
                    if (!z9) {
                    }
                } finally {
                    workDatabase_Impl.f();
                }
                z13 = z18;
                if (Build.VERSION.SDK_INT > 25) {
                }
                uuid = uuid2;
                if (lVar.f14281b == pVar5) {
                }
                r2.s sVar22 = (r2.s) workDatabase.n();
                workDatabase_Impl = sVar22.f14299a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
            }
            z12 = z18;
        } else {
            ArrayList arrayListJ = ((r2.s) workDatabase2.n()).j();
            if (!arrayListJ.isEmpty()) {
                androidx.work.g gVar3 = androidx.work.g.f1778t;
                list = list2;
                androidx.work.g gVar4 = androidx.work.g.f1779u;
                if (gVar2 == gVar3 || gVar2 == gVar4) {
                    ni0 ni0VarI2 = workDatabase2.i();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayListJ.size();
                    z9 = zIsEmpty;
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayListJ.get(i6);
                        int i7 = i6 + 1;
                        l.a aVar3 = (l.a) obj;
                        WorkDatabase workDatabase3 = workDatabase2;
                        String str5 = aVar3.f14297a;
                        ArrayList arrayList3 = arrayListJ;
                        WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) ni0VarI2.f7447t;
                        ni0 ni0Var = ni0VarI2;
                        int i8 = size;
                        v1.i iVarA = v1.i.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str5 == null) {
                            iVarA.e(1);
                        } else {
                            iVarA.f(1, str5);
                        }
                        workDatabase_Impl5.b();
                        Cursor cursorG = workDatabase_Impl5.g(iVarA);
                        try {
                            if (cursorG.moveToFirst()) {
                                z15 = false;
                                if (cursorG.getInt(0) != 0) {
                                    z16 = true;
                                }
                                if (!z16) {
                                    androidx.work.p pVar6 = aVar3.f14298b;
                                    boolean z19 = z6 & (pVar6 == pVar ? true : z15);
                                    if (pVar6 == pVar3) {
                                        z8 = true;
                                    } else if (pVar6 == pVar2) {
                                        z7 = true;
                                    }
                                    arrayList2.add(aVar3.f14297a);
                                    z6 = z19;
                                }
                                workDatabase2 = workDatabase3;
                                i6 = i7;
                                arrayListJ = arrayList3;
                                ni0VarI2 = ni0Var;
                                size = i8;
                            } else {
                                z15 = false;
                            }
                            z16 = z15;
                            if (!z16) {
                            }
                            workDatabase2 = workDatabase3;
                            i6 = i7;
                            arrayListJ = arrayList3;
                            ni0VarI2 = ni0Var;
                            size = i8;
                        } finally {
                            cursorG.close();
                            iVarA.h();
                        }
                    }
                    workDatabase = workDatabase2;
                    z10 = false;
                    if (gVar2 == gVar4 && (z7 || z8)) {
                        r2.s sVar3 = (r2.s) workDatabase.n();
                        ArrayList arrayListJ2 = sVar3.j();
                        int size2 = arrayListJ2.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            Object obj2 = arrayListJ2.get(i9);
                            i9++;
                            sVar3.a(((l.a) obj2).f14297a);
                        }
                        z14 = false;
                        z7 = false;
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        z14 = z8;
                        arrayList = arrayList2;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z17 = strArr.length > 0;
                    z8 = z14;
                } else {
                    if (gVar2 == androidx.work.g.s) {
                        int size3 = arrayListJ.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            Object obj3 = arrayListJ.get(i10);
                            i10++;
                            androidx.work.p pVar7 = ((l.a) obj3).f14298b;
                            if (pVar7 == pVar5 || pVar7 == androidx.work.p.f1843t) {
                                z12 = false;
                            }
                        }
                    }
                    new c(kVar).run();
                    r2.m mVarN = workDatabase2.n();
                    int size4 = arrayListJ.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        Object obj4 = arrayListJ.get(i11);
                        i11++;
                        ((r2.s) mVarN).a(((l.a) obj4).f14297a);
                    }
                    z9 = zIsEmpty;
                    workDatabase = workDatabase2;
                    z11 = true;
                    boolean z182 = z11;
                    while (it.hasNext()) {
                    }
                    z12 = z182;
                }
            }
            z11 = z10;
            boolean z1822 = z11;
            while (it.hasNext()) {
            }
            z12 = z1822;
        }
        gVar.f13467f = true;
        return z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        j2.c cVar = this.f14358t;
        j2.g gVar = this.s;
        j2.k kVar = gVar.f13462a;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(gVar.f13465d);
            HashSet hashSetB = j2.g.b(gVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(gVar.f13465d);
                    z6 = false;
                    break;
                } else if (hashSetB.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + gVar + ")");
            }
            WorkDatabase workDatabase = kVar.f13476c;
            workDatabase.c();
            try {
                boolean zA = a(gVar);
                workDatabase.h();
                if (zA) {
                    h.a(kVar.f13474a, RescheduleReceiver.class, true);
                    j2.f.a(kVar.f13475b, kVar.f13476c, kVar.f13478e);
                }
                cVar.a(androidx.work.n.f1838a);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            cVar.a(new n.a.C0022a(th));
        }
    }
}
