package c9;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5298a = 0;

    public static final void a(u6.t0 t0Var, String str) {
        u6.z0 z0VarB;
        WorkDatabase workDatabase = t0Var.f29338c;
        kotlin.jvm.internal.r.d(workDatabase, "workManagerImpl.workDatabase");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        ArrayList arrayListK = qg.p.k(str);
        while (!arrayListK.isEmpty()) {
            String str2 = (String) qg.t.t(arrayListK);
            t6.c0 c0VarR = workSpecDao.r(str2);
            if (c0VarR != t6.c0.f27996c && c0VarR != t6.c0.f27997d) {
                workSpecDao.u(str2);
            }
            arrayListK.addAll(dependencyDao.b(str2));
        }
        u6.r rVar = t0Var.f29341f;
        kotlin.jvm.internal.r.d(rVar, "workManagerImpl.processor");
        synchronized (rVar.f29326k) {
            t6.s.d().a(u6.r.f29315l, "Processor cancelling " + str);
            rVar.f29324i.add(str);
            z0VarB = rVar.b(str);
        }
        u6.r.d(str, z0VarB, 1);
        Iterator<u6.t> it = t0Var.f29340e.iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = nc.n0.f18723a;
            }
        } else {
            if (!(iterable instanceof nc.b1)) {
                return false;
            }
            objComparator = ((nc.b1) iterable).comparator();
        }
        return comparator.equals(objComparator);
    }
}
