package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class e1 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f5955b;

    public e1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f5955b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        this.f5955b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        this.f5955b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(j0 j0Var) throws DeadObjectException {
        try {
            h(j0Var);
        } catch (DeadObjectException e10) {
            a(k1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(k1.e(e11));
        } catch (RuntimeException e12) {
            this.f5955b.trySetException(e12);
        }
    }

    public abstract void h(j0 j0Var) throws RemoteException;
}
