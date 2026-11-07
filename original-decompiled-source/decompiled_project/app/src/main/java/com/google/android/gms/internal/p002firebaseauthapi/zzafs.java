package com.google.android.gms.internal.p002firebaseauthapi;

import id.j;
import qd.x;
import qd.y;
import qd.z;

/* loaded from: classes2.dex */
final class zzafs extends z {
    private final /* synthetic */ z zza;
    private final /* synthetic */ String zzb;

    public zzafs(z zVar, String str) {
        this.zza = zVar;
        this.zzb = str;
    }

    @Override // qd.z
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // qd.z
    public final void onCodeSent(String str, y yVar) {
        this.zza.onCodeSent(str, yVar);
    }

    @Override // qd.z
    public final void onVerificationCompleted(x xVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(xVar);
    }

    @Override // qd.z
    public final void onVerificationFailed(j jVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(jVar);
    }
}
