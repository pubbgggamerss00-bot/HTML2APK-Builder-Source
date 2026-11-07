package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class d1 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f5953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, Looper looper) {
        super(looper);
        this.f5953a = f1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) message.obj;
        synchronized (this.f5953a.f5959c) {
            try {
                f1 f1Var = this.f5953a.f5957a;
                com.google.android.gms.common.internal.p.f(f1Var);
                if (iVar == null) {
                    f1Var.b(new Status(13, "Transform returned null", null, null));
                } else if (iVar instanceof x0) {
                    f1Var.b(null);
                } else {
                    synchronized (f1Var.f5959c) {
                        f1Var.f5958b = iVar;
                        f1Var.c();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
