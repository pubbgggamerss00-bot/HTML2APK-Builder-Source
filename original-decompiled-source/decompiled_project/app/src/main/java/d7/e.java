package d7;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.g0;
import t6.e0;
import u6.d0;

/* loaded from: classes.dex */
public final class e {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, d0 d0Var) {
        int i10;
        kotlin.jvm.internal.r.e(workDatabase, "workDatabase");
        kotlin.jvm.internal.r.e(configuration, "configuration");
        ArrayList arrayListK = qg.p.k(d0Var);
        int i11 = 0;
        while (!arrayListK.isEmpty()) {
            List<? extends e0> list = ((d0) qg.t.t(arrayListK)).f29277c;
            kotlin.jvm.internal.r.d(list, "current.work");
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((e0) it.next()).f28014b.f3176j.b() && (i10 = i10 + 1) < 0) {
                        qg.p.n();
                        throw null;
                    }
                }
            }
            i11 += i10;
        }
        if (i11 == 0) {
            return;
        }
        int iY = workDatabase.workSpecDao().y();
        int i12 = configuration.f3125j;
        if (iY + i11 > i12) {
            throw new IllegalArgumentException(x0.a.a(g0.a(i12, iY, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }
}
