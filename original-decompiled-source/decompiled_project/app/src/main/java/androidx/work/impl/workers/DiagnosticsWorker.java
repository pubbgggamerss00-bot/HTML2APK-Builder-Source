package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import f7.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import t6.s;
import u6.t0;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        r.e(context, "context");
        r.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final c.a.C0048c c() {
        t0 t0VarB = t0.b(this.f3133a);
        r.d(t0VarB, "getInstance(applicationContext)");
        WorkDatabase workDatabase = t0VarB.f29338c;
        r.d(workDatabase, "workManager.workDatabase");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkNameDao workNameDao = workDatabase.workNameDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        t0VarB.f29337b.f3119d.getClass();
        ArrayList arrayListG = workSpecDao.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListO = workSpecDao.o();
        ArrayList arrayListC = workSpecDao.c();
        if (!arrayListG.isEmpty()) {
            s sVarD = s.d();
            String str = a.f8869a;
            sVarD.e(str, "Recently completed work:\n\n");
            s.d().e(str, a.a(workNameDao, workTagDao, systemIdInfoDao, arrayListG));
        }
        if (!arrayListO.isEmpty()) {
            s sVarD2 = s.d();
            String str2 = a.f8869a;
            sVarD2.e(str2, "Running work:\n\n");
            s.d().e(str2, a.a(workNameDao, workTagDao, systemIdInfoDao, arrayListO));
        }
        if (!arrayListC.isEmpty()) {
            s sVarD3 = s.d();
            String str3 = a.f8869a;
            sVarD3.e(str3, "Enqueued work:\n\n");
            s.d().e(str3, a.a(workNameDao, workTagDao, systemIdInfoDao, arrayListC));
        }
        return new c.a.C0048c();
    }
}
