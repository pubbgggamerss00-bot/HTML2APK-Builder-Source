package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;

/* loaded from: classes.dex */
public final class d implements PreferenceDao {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f4999a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5000b;

    public d(WorkDatabase_Impl workDatabase_Impl) {
        this.f4999a = workDatabase_Impl;
        this.f5000b = new c(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final Long a(String str) {
        androidx.room.m0 m0VarP = androidx.room.m0.p(1, "SELECT long_value FROM Preference where `key`=?");
        m0VarP.o(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f4999a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorQuery = workDatabase_Impl.query(m0VarP, (CancellationSignal) null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQuery.close();
            m0VarP.z();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final void b(Preference preference) {
        WorkDatabase_Impl workDatabase_Impl = this.f4999a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f5000b.e(preference);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }
}
