package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import pa.c;

/* loaded from: classes2.dex */
public final class zzv extends g {
    private static final a.g zza;
    private static final a.AbstractC0063a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzac.zzb};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6059d = 1566;
        return doWrite(aVarA.a());
    }

    public zzv(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }
}
