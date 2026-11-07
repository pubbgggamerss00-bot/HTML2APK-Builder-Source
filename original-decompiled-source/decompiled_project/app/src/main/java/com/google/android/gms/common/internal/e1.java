package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
public final class e1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f6118a;

    public /* synthetic */ e1(f1 f1Var) {
        this.f6118a = f1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f6118a.f6135d) {
                try {
                    c1 c1Var = (c1) message.obj;
                    d1 d1Var = (d1) this.f6118a.f6135d.get(c1Var);
                    if (d1Var != null && d1Var.f6103a.isEmpty()) {
                        if (d1Var.f6105c) {
                            d1Var.f6109g.f6137f.removeMessages(1, d1Var.f6107e);
                            f1 f1Var = d1Var.f6109g;
                            f1Var.f6138g.b(f1Var.f6136e, d1Var);
                            d1Var.f6105c = false;
                            d1Var.f6104b = 2;
                        }
                        this.f6118a.f6135d.remove(c1Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f6118a.f6135d) {
            try {
                c1 c1Var2 = (c1) message.obj;
                d1 d1Var2 = (d1) this.f6118a.f6135d.get(c1Var2);
                if (d1Var2 != null && d1Var2.f6104b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c1Var2)), new Exception());
                    ComponentName componentName = d1Var2.f6108f;
                    if (componentName == null) {
                        c1Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c1Var2.f6088b;
                        p.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    d1Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
