package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6008a;

    public k1(int i10) {
        this.f6008a = i10;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(j0 j0Var) throws DeadObjectException;

    public abstract void d(z zVar, boolean z10);
}
