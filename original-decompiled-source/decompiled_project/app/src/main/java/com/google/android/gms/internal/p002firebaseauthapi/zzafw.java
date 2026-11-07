package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import m3.a;

/* loaded from: classes2.dex */
final class zzafw implements OnFailureListener {
    public zzafw(zzafu zzafuVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzafu.zza.c(a.a("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
