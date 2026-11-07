package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k0 extends p3.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b bVar, Looper looper) {
        super(looper);
        this.f2462a = bVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        l0 l0Var;
        b bVar = this.f2462a;
        if (bVar.zzd.get() != message.arg1) {
            int i6 = message.what;
            if ((i6 == 2 || i6 == 1 || i6 == 7) && (l0Var = (l0) message.obj) != null) {
                synchronized (l0Var) {
                    l0Var.f2463a = null;
                }
                b bVar2 = l0Var.f2465c;
                synchronized (bVar2.zzj()) {
                    bVar2.zzj().remove(l0Var);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !bVar.enableLocalFallback()) || message.what == 5)) && !bVar.isConnecting()) {
            l0 l0Var2 = (l0) message.obj;
            if (l0Var2 != null) {
                synchronized (l0Var2) {
                    l0Var2.f2463a = null;
                }
                b bVar3 = l0Var2.f2465c;
                synchronized (bVar3.zzj()) {
                    bVar3.zzj().remove(l0Var2);
                }
                return;
            }
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            bVar.zzn(new c3.b(message.arg2, null, null));
            if (bVar.zzg() && !bVar.zzo()) {
                bVar.zzd(3, null);
                return;
            }
            c3.b bVarZzm = bVar.zzm() != null ? bVar.zzm() : new c3.b(8, null, null);
            bVar.zzc.a(bVarZzm);
            bVar.onConnectionFailed(bVarZzm);
            return;
        }
        if (i8 == 5) {
            c3.b bVarZzm2 = bVar.zzm() != null ? bVar.zzm() : new c3.b(8, null, null);
            bVar.zzc.a(bVarZzm2);
            bVar.onConnectionFailed(bVarZzm2);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            c3.b bVar4 = new c3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            bVar.zzc.a(bVar4);
            bVar.onConnectionFailed(bVar4);
            return;
        }
        if (i8 == 6) {
            bVar.zzd(5, null);
            if (bVar.zzk() != null) {
                bVar.zzk().n(message.arg2);
            }
            bVar.onConnectionSuspended(message.arg2);
            bVar.zze(5, 1, null);
            return;
        }
        if (i8 == 2 && !bVar.isConnected()) {
            l0 l0Var3 = (l0) message.obj;
            if (l0Var3 != null) {
                synchronized (l0Var3) {
                    l0Var3.f2463a = null;
                }
                b bVar5 = l0Var3.f2465c;
                synchronized (bVar5.zzj()) {
                    bVar5.zzj().remove(l0Var3);
                }
                return;
            }
            return;
        }
        int i9 = message.what;
        if (i9 != 2 && i9 != 1 && i9 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i9);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        l0 l0Var4 = (l0) message.obj;
        synchronized (l0Var4) {
            try {
                bool = l0Var4.f2463a;
                if (l0Var4.f2464b) {
                    String string = l0Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            l0Var4.a(bool);
        }
        synchronized (l0Var4) {
            l0Var4.f2464b = true;
        }
        synchronized (l0Var4) {
            l0Var4.f2463a = null;
        }
        b bVar6 = l0Var4.f2465c;
        synchronized (bVar6.zzj()) {
            bVar6.zzj().remove(l0Var4);
        }
    }
}
