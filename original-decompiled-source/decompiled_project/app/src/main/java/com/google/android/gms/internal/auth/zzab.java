package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import ca.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import pa.c;

/* loaded from: classes2.dex */
final class zzab extends g implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0063a zzb;
    private static final a zzc;
    private static final sa.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = new sa.a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.d() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(b3.a.b(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{ca.g.f5352c};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        aVarA.f6059d = 1513;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        p.g(bVar, "request cannot be null.");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{ca.g.f5351b};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        aVarA.f6059d = 1515;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        p.g(account, "Account name cannot be null!");
        p.e(str, "Scope cannot be null!");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{ca.g.f5352c};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        aVarA.f6059d = 1512;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        p.g(account, "account cannot be null.");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{ca.g.f5351b};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        aVarA.f6059d = 1517;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        p.g(str, "Client package name cannot be null!");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{ca.g.f5351b};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        aVarA.f6059d = 1514;
        return doWrite(aVarA.a());
    }
}
