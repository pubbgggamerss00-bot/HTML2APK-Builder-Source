package c7;

import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.WorkProgressDao;

/* loaded from: classes.dex */
public final class p implements WorkProgressDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5012a;

    /* renamed from: b, reason: collision with root package name */
    public final n f5013b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5014c;

    public p(WorkDatabase_Impl workDatabase_Impl) {
        this.f5012a = workDatabase_Impl;
        new m(workDatabase_Impl);
        this.f5013b = new n(workDatabase_Impl);
        this.f5014c = new o(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5012a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        n nVar = this.f5013b;
        i6.f fVarA = nVar.a();
        fVarA.o(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            nVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void b() {
        WorkDatabase_Impl workDatabase_Impl = this.f5012a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        o oVar = this.f5014c;
        i6.f fVarA = oVar.a();
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            oVar.c(fVarA);
        }
    }
}
