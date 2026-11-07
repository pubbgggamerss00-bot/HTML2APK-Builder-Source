package cc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class o extends n {
    @Override // cc.n, dc.j
    public final void x(Bundle bundle) throws RemoteException {
        super.x(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f5380b;
        if (i10 != 0) {
            taskCompletionSource.trySetException(new ec.a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
