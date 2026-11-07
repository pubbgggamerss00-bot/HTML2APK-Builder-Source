package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements WorkNameDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5008a;

    /* renamed from: b, reason: collision with root package name */
    public final k f5009b;

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f5008a = workDatabase_Impl;
        this.f5009b = new k(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final void a(WorkName workName) {
        WorkDatabase_Impl workDatabase_Impl = this.f5008a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f5009b.e(workName);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final ArrayList b(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT name FROM workname WHERE work_spec_id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f5008a;
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
