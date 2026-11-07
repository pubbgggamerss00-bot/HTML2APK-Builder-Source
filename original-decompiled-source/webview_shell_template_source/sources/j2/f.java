package j2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import r2.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13460a = androidx.work.k.e("Schedulers");

    public static void a(androidx.work.c cVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        r2.m mVarN = workDatabase.n();
        workDatabase.c();
        try {
            s sVar = (s) mVarN;
            ArrayList arrayListC = sVar.c(cVar.h);
            ArrayList arrayListB = sVar.b();
            if (arrayListC.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListC.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayListC.get(i6);
                    i6++;
                    sVar.l(((r2.l) obj).f14280a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListC.size() > 0) {
                r2.l[] lVarArr = (r2.l[]) arrayListC.toArray(new r2.l[arrayListC.size()]);
                for (e eVar : list) {
                    if (eVar.b()) {
                        eVar.a(lVarArr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                r2.l[] lVarArr2 = (r2.l[]) arrayListB.toArray(new r2.l[arrayListB.size()]);
                for (e eVar2 : list) {
                    if (!eVar2.b()) {
                        eVar2.a(lVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
