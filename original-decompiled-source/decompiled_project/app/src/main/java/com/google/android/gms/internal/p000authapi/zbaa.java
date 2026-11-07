package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.z;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.n;
import ga.o;
import java.util.List;
import pa.c;
import qa.d;

/* loaded from: classes2.dex */
public final class zbaa extends g {
    private static final a.g zba;
    private static final a.AbstractC0063a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Activity activity, n nVar) {
        a aVar = zbc;
        String str = nVar.f11905a;
        if (str != null) {
            p.d(str);
        }
        String strZba = zbat.zba();
        p.d(strZba);
        super(activity, (a<n>) aVar, new n(strZba), g.a.f5924c);
    }

    public final Task<ga.a> authorize(AuthorizationRequest authorizationRequest) {
        Bundle bundle;
        Object obj;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        boolean z12;
        int i10;
        p.f(authorizationRequest);
        List list = authorizationRequest.f5838a;
        p.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        Bundle bundle2 = authorizationRequest.f5846j;
        String str3 = null;
        if (bundle2 != null) {
            Bundle bundle3 = null;
            for (String str4 : bundle2.keySet()) {
                String string = bundle2.getString(str4);
                int[] iArrB = z.b(2);
                int length = iArrB.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i10 = 0;
                        break;
                    }
                    i10 = iArrB[i11];
                    if (o.a(i10).equals(str4)) {
                        break;
                    }
                    i11++;
                }
                if (string != null && i10 != 0) {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putString(o.a(i10), string);
                }
            }
            bundle = bundle3;
        } else {
            bundle = null;
        }
        boolean z13 = authorizationRequest.f5845h;
        String str5 = authorizationRequest.f5843f;
        Account account = authorizationRequest.f5842e;
        String str6 = authorizationRequest.f5839b;
        if (str5 != null) {
            p.d(str5);
        } else {
            str5 = null;
        }
        if (account == null) {
            account = null;
        }
        if (!authorizationRequest.f5841d || str6 == null) {
            obj = str6;
            str = str5;
            z10 = false;
        } else {
            str3 = str6;
            obj = str3;
            str = str5;
            z10 = true;
        }
        if (!authorizationRequest.f5840c || obj == null) {
            str2 = str3;
            z11 = false;
            z12 = false;
        } else {
            p.a("two different server client ids provided", str3 == null || str3.equals(obj));
            z11 = true;
            z12 = z13;
            str2 = obj;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z11, z10, account, str, ((n) getApiOptions()).f11905a, z12, bundle);
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zbas.zbc};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                zbz zbzVar = new zbz(this.zba, (TaskCompletionSource) obj3);
                zbk zbkVar = (zbk) ((zbg) obj2).getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                p.f(authorizationRequest3);
                zbkVar.zbc(zbzVar, authorizationRequest3);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1534;
        return doRead(aVarA.a());
    }

    public final ga.a getAuthorizationResultFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f5907g);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : d.a(byteArrayExtra, creator));
        if (status == null) {
            throw new b(Status.f5909j);
        }
        if (!status.d()) {
            throw new b(status);
        }
        Parcelable.Creator<ga.a> creator2 = ga.a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        ga.a aVar = (ga.a) (byteArrayExtra2 != null ? d.a(byteArrayExtra2, creator2) : null);
        if (aVar != null) {
            return aVar;
        }
        throw new b(Status.f5907g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaa(Context context, n nVar) {
        a aVar = zbc;
        String str = nVar.f11905a;
        if (str != null) {
            p.d(str);
        }
        String strZba = zbat.zba();
        p.d(strZba);
        super(context, (a<n>) aVar, new n(strZba), g.a.f5924c);
    }
}
