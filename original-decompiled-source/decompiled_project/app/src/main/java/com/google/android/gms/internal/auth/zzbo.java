package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.b;
import ea.c;
import ia.a;

/* loaded from: classes2.dex */
public final class zzbo extends g {
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f8632a, cVar == null ? c.f8633b : cVar, g.a.f5924c);
    }

    public final Task<String> getSpatulaHeader() {
        u.a aVarA = u.a();
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6059d = 1520;
        return doRead(aVarA.a());
    }

    public final Task<ia.b> performProxyRequest(final a aVar) {
        u.a aVarA = u.a();
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzbo zzboVar = this.zza;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        aVarA.f6059d = 1518;
        return doWrite(aVarA.a());
    }

    public zzbo(Context context, c cVar) {
        super(context, b.f8632a, cVar == null ? c.f8633b : cVar, g.a.f5924c);
    }
}
