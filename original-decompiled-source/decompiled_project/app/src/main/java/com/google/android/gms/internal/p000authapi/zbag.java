package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.d;
import ga.h;
import ga.i;
import ga.j;
import ga.t;
import java.util.ArrayList;
import java.util.List;
import pa.c;

/* loaded from: classes2.dex */
public final class zbag extends g implements d {
    private static final a.g zba;
    private static final a.AbstractC0063a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(Activity activity, t tVar) {
        super(activity, (a<t>) zbc, tVar, g.a.f5924c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.f5907g;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : qa.d.a(byteArrayExtra, creator));
        return status == null ? Status.f5907g : status;
    }

    public final Task<h> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        p.f(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.f5850d;
        String str = saveAccountLinkingTokenRequest.f5849c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f5847a;
        String str2 = saveAccountLinkingTokenRequest.f5848b;
        int i10 = saveAccountLinkingTokenRequest.f5852f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f5851e);
        String str3 = this.zbd;
        p.a("Consent PendingIntent cannot be null", pendingIntent != null);
        p.a("Invalid tokenType", "auth_code".equals(str2));
        p.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        p.a("scopes cannot be null", list != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i10);
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zbas.zbg};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbae zbaeVar = new zbae(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                p.f(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1535;
        return doRead(aVarA.a());
    }

    @Override // ga.d
    public final Task<j> savePassword(i iVar) {
        p.f(iVar);
        final i iVar2 = new i(iVar.f11890a, this.zbd, iVar.f11892c);
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zbas.zbe};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbaf zbafVar = new zbaf(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                i iVar3 = iVar2;
                p.f(iVar3);
                zbnVar.zbd(zbafVar, iVar3);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1536;
        return doRead(aVarA.a());
    }

    public zbag(Context context, t tVar) {
        super(context, (a<t>) zbc, tVar, g.a.f5924c);
        this.zbd = zbat.zba();
    }
}
