package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l0 implements WorkTagDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f5011b;

    public l0(WorkDatabase_Impl workDatabase_Impl) {
        this.f5010a = workDatabase_Impl;
        this.f5011b = new j0(workDatabase_Impl);
        new k0(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final void a(WorkTag workTag) {
        WorkDatabase_Impl workDatabase_Impl = this.f5010a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f5011b.e(workTag);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final ArrayList b(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f5010a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }
}
