package u6;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29356a = t6.s.f("Schedulers");

    public static void a(WorkSpecDao workSpecDao, l5.c cVar, List list) {
        if (list.size() > 0) {
            cVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.e(((WorkSpec) it.next()).f3167a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            ArrayList arrayListQ = workSpecDao.q();
            a(workSpecDao, aVar.f3119d, arrayListQ);
            ArrayList arrayListH = workSpecDao.h(aVar.f3126k);
            a(workSpecDao, aVar.f3119d, arrayListH);
            arrayListH.addAll(arrayListQ);
            ArrayList arrayListC = workSpecDao.c();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (arrayListH.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) arrayListH.toArray(new WorkSpec[arrayListH.size()]);
                for (t tVar : list) {
                    if (tVar.d()) {
                        tVar.c(workSpecArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) arrayListC.toArray(new WorkSpec[arrayListC.size()]);
                for (t tVar2 : list) {
                    if (!tVar2.d()) {
                        tVar2.c(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
