package ka;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class j extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f16239a;

    public j(k kVar) {
        this.f16239a = kVar;
    }

    @Override // ka.d, ka.q
    public final void q(Status status) throws RemoteException {
        this.f16239a.setResult((k) status);
    }
}
