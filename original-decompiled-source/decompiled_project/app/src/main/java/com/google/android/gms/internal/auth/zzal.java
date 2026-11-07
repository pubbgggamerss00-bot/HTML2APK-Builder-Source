package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import da.a;

/* loaded from: classes2.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final i<Object> addWorkAccount(h hVar, String str) {
        return hVar.b(new zzae(this, a.f7669a, hVar, str));
    }

    public final i<l> removeWorkAccount(h hVar, Account account) {
        return hVar.b(new zzag(this, a.f7669a, hVar, account));
    }

    public final void setWorkAuthenticatorEnabled(h hVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(hVar, z10);
    }

    public final i<l> setWorkAuthenticatorEnabledWithResult(h hVar, boolean z10) {
        return hVar.b(new zzac(this, a.f7669a, hVar, z10));
    }
}
