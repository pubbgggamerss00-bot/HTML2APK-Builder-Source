package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import la.b;
import la.d;
import pa.c;

/* loaded from: classes2.dex */
public final class zzaa extends g {
    private static final a.g zza;
    private static final a.AbstractC0063a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new a("Blockstore.API", zzuVar, gVar);
    }

    public zzaa(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }

    public final Task<Boolean> deleteBytes(final la.a aVar) {
        p.g(aVar, "DeleteBytesRequest cannot be null");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zzg};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzf) obj).getService()).zza(new zzy(this.zza, (TaskCompletionSource) obj2), aVar);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1669;
        return doWrite(aVarA.a());
    }

    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zze};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzf) obj).getService()).zzb(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1651;
        return doRead(aVarA.a());
    }

    public final Task<byte[]> retrieveBytes() {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zza};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzf) obj).getService()).zzc(new zzx(this.zza, (TaskCompletionSource) obj2));
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1570;
        return doRead(aVarA.a());
    }

    public final Task<Integer> storeBytes(final d dVar) {
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zzd, zzab.zzf};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzf) obj).getService()).zze(new zzv(this.zza, (TaskCompletionSource) obj2), dVar);
            }
        };
        aVarA.f6059d = 1645;
        aVarA.f6057b = false;
        return doWrite(aVarA.a());
    }

    public final Task<la.c> retrieveBytes(final b bVar) {
        p.g(bVar, "RetrieveBytesRequest cannot be null");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zzh};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzf) obj).getService()).zzd(new zzw(this.zza, (TaskCompletionSource) obj2), bVar);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1668;
        return doRead(aVarA.a());
    }
}
