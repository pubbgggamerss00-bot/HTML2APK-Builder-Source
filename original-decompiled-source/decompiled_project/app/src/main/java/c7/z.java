package c7;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class z implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.m0 f5015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.a f5016b;

    public z(androidx.work.impl.model.a aVar, androidx.room.m0 m0Var) {
        this.f5016b = aVar;
        this.f5015a = m0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        Boolean boolValueOf;
        Cursor cursorQuery = this.f5016b.f3193a.query(this.f5015a, (CancellationSignal) null);
        try {
            if (cursorQuery.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorQuery.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            cursorQuery.close();
            return boolValueOf;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f5015a.z();
    }
}
