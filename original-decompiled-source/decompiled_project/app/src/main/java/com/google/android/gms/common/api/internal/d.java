package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
public abstract class d<R extends com.google.android.gms.common.api.l, A extends a.b> extends BasePendingResult<R> implements e<R> {
    private final com.google.android.gms.common.api.a<?> api;
    private final a.c<A> clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public d(a.c<A> cVar, com.google.android.gms.common.api.h hVar) {
        super(hVar);
        com.google.android.gms.common.internal.p.g(hVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.p.f(cVar);
        this.clientKey = cVar;
        this.api = null;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    public abstract void doExecute(A a10) throws RemoteException;

    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.api;
    }

    public final a.c<A> getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(R r10) {
    }

    public final void run(A a10) throws DeadObjectException {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult(e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((d<R, A>) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.h hVar) {
        super(hVar);
        com.google.android.gms.common.internal.p.g(hVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.p.g(aVar, "Api must not be null");
        this.clientKey = aVar.f5915b;
        this.api = aVar;
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.p.a("Failed result must not be success", !status.d());
        R rCreateFailedResult = createFailedResult(status);
        setResult((d<R, A>) rCreateFailedResult);
        onSetFailedResult(rCreateFailedResult);
    }

    public d(BasePendingResult.a<R> aVar) {
        super(aVar);
        this.clientKey = new a.c<>();
        this.api = null;
    }
}
