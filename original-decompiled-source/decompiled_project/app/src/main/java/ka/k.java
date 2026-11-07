package ka;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes2.dex */
public final class k extends l {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.l createFailedResult(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(a.b bVar) throws RemoteException {
        g gVar = (g) bVar;
        r rVar = (r) gVar.getService();
        j jVar = new j(this);
        GoogleSignInOptions googleSignInOptions = gVar.f16237a;
        Parcel parcelZba = rVar.zba();
        zbc.zbd(parcelZba, jVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        rVar.zbb(103, parcelZba);
    }
}
