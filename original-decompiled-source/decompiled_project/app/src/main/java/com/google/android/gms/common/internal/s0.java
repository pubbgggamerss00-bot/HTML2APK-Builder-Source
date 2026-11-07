package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzh;

/* loaded from: classes2.dex */
public final class s0 extends zzh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(b bVar, Looper looper) {
        super(looper);
        this.f6194a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f6194a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                t0 t0Var = (t0) message.obj;
                t0Var.getClass();
                t0Var.b();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || ((i11 == 4 && !this.f6194a.enableLocalFallback()) || message.what == 5)) && !this.f6194a.isConnecting()) {
            t0 t0Var2 = (t0) message.obj;
            t0Var2.getClass();
            t0Var2.b();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.f6194a.zzC = new pa.a(message.arg2);
            if (b.zzo(this.f6194a)) {
                b bVar = this.f6194a;
                if (!bVar.zzD) {
                    bVar.zzp(3, null);
                    return;
                }
            }
            b bVar2 = this.f6194a;
            pa.a aVar = bVar2.zzC != null ? bVar2.zzC : new pa.a(8);
            this.f6194a.zzc.a(aVar);
            this.f6194a.onConnectionFailed(aVar);
            return;
        }
        if (i12 == 5) {
            b bVar3 = this.f6194a;
            pa.a aVar2 = bVar3.zzC != null ? bVar3.zzC : new pa.a(8);
            this.f6194a.zzc.a(aVar2);
            this.f6194a.onConnectionFailed(aVar2);
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            pa.a aVar3 = new pa.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f6194a.zzc.a(aVar3);
            this.f6194a.onConnectionFailed(aVar3);
            return;
        }
        if (i12 == 6) {
            this.f6194a.zzp(5, null);
            b bVar4 = this.f6194a;
            if (bVar4.zzw != null) {
                bVar4.zzw.c(message.arg2);
            }
            this.f6194a.onConnectionSuspended(message.arg2);
            b.zzn(this.f6194a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f6194a.isConnected()) {
            t0 t0Var3 = (t0) message.obj;
            t0Var3.getClass();
            t0Var3.b();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", j2.y.a(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        t0 t0Var4 = (t0) message.obj;
        synchronized (t0Var4) {
            try {
                bool = t0Var4.f6197a;
                if (t0Var4.f6198b) {
                    Log.w("GmsClient", "Callback proxy " + t0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            t0Var4.a(bool);
        }
        synchronized (t0Var4) {
            t0Var4.f6198b = true;
        }
        t0Var4.b();
    }
}
