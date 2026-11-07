package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i1 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final u f5989b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f5990c;

    /* renamed from: d, reason: collision with root package name */
    public final s f5991d;

    public i1(int i10, u uVar, TaskCompletionSource taskCompletionSource, s sVar) {
        super(i10);
        this.f5990c = taskCompletionSource;
        this.f5989b = uVar;
        this.f5991d = sVar;
        if (i10 == 2 && uVar.f6054b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        ((a) this.f5991d).getClass();
        this.f5990c.trySetException(b3.a.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        this.f5990c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(j0 j0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f5990c;
        try {
            u uVar = this.f5989b;
            ((b1) uVar).f5944d.f6056a.accept(j0Var.f5993b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(k1.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void d(z zVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = zVar.f6073b;
        TaskCompletionSource taskCompletionSource = this.f5990c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new y(zVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean f(j0 j0Var) {
        return this.f5989b.f6054b;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final pa.c[] g(j0 j0Var) {
        return this.f5989b.f6053a;
    }
}
