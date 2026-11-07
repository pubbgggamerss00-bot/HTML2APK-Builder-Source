package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import pa.c;

/* loaded from: classes2.dex */
public final class zzr extends g {
    private static final a.g zza;
    private static final a.AbstractC0063a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }

    public final Task<Integer> checkPermissionState() {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzac.zza};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6059d = 1564;
        return doRead(aVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        p.f(str);
        p.a("The package name cannot be empty.", !str.isEmpty());
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzac.zza};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6059d = 1565;
        return doRead(aVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzac.zza};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6059d = 1563;
        return doWrite(aVarA.a());
    }

    public zzr(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }
}
