package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements DependencyDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4998b;

    public b(WorkDatabase_Impl workDatabase_Impl) {
        this.f4997a = workDatabase_Impl;
        this.f4998b = new a(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final void a(Dependency dependency) {
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f4998b.e(dependency);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final ArrayList b(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
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

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean c(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            boolean z10 = false;
            if (cursorQuery.moveToFirst()) {
                z10 = cursorQuery.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean d(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f4997a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            boolean z10 = false;
            if (cursorQuery.moveToFirst()) {
                z10 = cursorQuery.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }
}
