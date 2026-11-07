package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ha.a;
import pa.c;

/* loaded from: classes2.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // ha.a
    public final Task<Void> startSmsRetriever() {
        u.a aVarA = u.a();
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6058c = new c[]{zzac.zzc};
        aVarA.f6059d = 1567;
        return doWrite(aVarA.a());
    }

    @Override // ha.a
    public final Task<Void> startSmsUserConsent(final String str) {
        u.a aVarA = u.a();
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6058c = new c[]{zzac.zzd};
        aVarA.f6059d = 1568;
        return doWrite(aVarA.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
