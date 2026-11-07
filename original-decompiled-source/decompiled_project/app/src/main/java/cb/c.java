package cb;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class c extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5356a;

    public c(TaskCompletionSource taskCompletionSource) {
        this.f5356a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) throws RemoteException {
        v.a(status, pendingIntent, this.f5356a);
    }
}
