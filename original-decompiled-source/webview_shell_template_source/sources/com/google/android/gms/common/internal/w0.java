package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w0 implements Handler.Callback {
    public final /* synthetic */ x0 s;

    public /* synthetic */ w0(x0 x0Var) {
        this.s = x0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 == 0) {
            x0 x0Var = this.s;
            synchronized (x0Var.f2499d) {
                try {
                    u0 u0Var = (u0) message.obj;
                    v0 v0Var = (v0) x0Var.f2499d.get(u0Var);
                    if (v0Var != null && v0Var.f2490a.isEmpty()) {
                        if (v0Var.f2492c) {
                            u0 u0Var2 = v0Var.f2494e;
                            x0 x0Var2 = v0Var.f2496g;
                            x0Var2.f2501f.removeMessages(1, u0Var2);
                            x0Var2.f2502g.b(x0Var2.f2500e, v0Var);
                            v0Var.f2492c = false;
                            v0Var.f2491b = 2;
                        }
                        x0Var.f2499d.remove(u0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i6 != 1) {
            return false;
        }
        x0 x0Var3 = this.s;
        synchronized (x0Var3.f2499d) {
            try {
                u0 u0Var3 = (u0) message.obj;
                v0 v0Var2 = (v0) x0Var3.f2499d.get(u0Var3);
                if (v0Var2 != null && v0Var2.f2491b == 3) {
                    String strValueOf = String.valueOf(u0Var3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = v0Var2.f2495f;
                    if (componentName == null) {
                        u0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = u0Var3.f2488b;
                        l.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    v0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
