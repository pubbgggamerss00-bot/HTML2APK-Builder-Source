package ka;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f16238a;

    public h(i iVar) {
        this.f16238a = iVar;
    }

    @Override // ka.d, ka.q
    public final void v(Status status) throws RemoteException {
        this.f16238a.setResult((i) status);
    }
}
