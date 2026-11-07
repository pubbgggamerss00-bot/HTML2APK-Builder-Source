package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements SystemIdInfoDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5001a;

    /* renamed from: b, reason: collision with root package name */
    public final f f5002b;

    /* renamed from: c, reason: collision with root package name */
    public final g f5003c;

    /* renamed from: d, reason: collision with root package name */
    public final h f5004d;

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f5001a = workDatabase_Impl;
        this.f5002b = new f(workDatabase_Impl);
        this.f5003c = new g(workDatabase_Impl);
        this.f5004d = new h(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final ArrayList a() {
        androidx.room.m0 m0VarP = androidx.room.m0.p(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f5001a;
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void b(SystemIdInfo systemIdInfo) {
        WorkDatabase_Impl workDatabase_Impl = this.f5001a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f5002b.e(systemIdInfo);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final SystemIdInfo c(int i10, String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        m0VarP.o(1, str);
        m0VarP.d(2, i10);
        WorkDatabase_Impl workDatabase_Impl = this.f5001a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            return cursorQuery.moveToFirst() ? new SystemIdInfo(cursorQuery.getString(b6.b.a(cursorQuery, "work_spec_id")), cursorQuery.getInt(b6.b.a(cursorQuery, "generation")), cursorQuery.getInt(b6.b.a(cursorQuery, "system_id"))) : null;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void f(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5001a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        g gVar = this.f5003c;
        i6.f fVarA = gVar.a();
        fVarA.o(1, str);
        fVarA.d(2, i10);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                fVarA.q();
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        } finally {
            gVar.c(fVarA);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5001a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        h hVar = this.f5004d;
        i6.f fVarA = hVar.a();
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
            hVar.c(fVarA);
        }
    }
}
