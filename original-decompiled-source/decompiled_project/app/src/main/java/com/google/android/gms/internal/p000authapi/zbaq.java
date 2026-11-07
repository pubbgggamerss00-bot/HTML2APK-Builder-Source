package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ga.b;
import ga.c;
import ga.e;
import ga.f;
import ga.f0;
import ga.k;
import ga.l;
import java.util.Iterator;
import java.util.Set;
import qa.d;

/* loaded from: classes2.dex */
public final class zbaq extends g implements k {
    private static final a.g zba;
    private static final a.AbstractC0063a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(Activity activity, f0 f0Var) {
        super(activity, (a<f0>) zbc, f0Var, g.a.f5924c);
        this.zbd = zbat.zba();
    }

    @Override // ga.k
    public final Task<c> beginSignIn(b bVar) {
        p.f(bVar);
        new b.d(false);
        b.a.C0103a c0103aD = b.a.d();
        c0103aD.f11873a = false;
        c0103aD.a();
        new b.c(null, false, null);
        new b.C0104b(false, null);
        b.a aVar = bVar.f11859b;
        p.f(aVar);
        b.d dVar = bVar.f11858a;
        p.f(dVar);
        b.c cVar = bVar.f11863f;
        p.f(cVar);
        b.C0104b c0104b = bVar.f11864g;
        p.f(c0104b);
        final b bVar2 = new b(dVar, aVar, this.zbd, bVar.f11861d, bVar.f11862e, cVar, c0104b, bVar.f11865h);
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{new pa.c("auth_api_credentials_begin_sign_in", 8L)};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbam zbamVar = new zbam(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                b bVar3 = bVar2;
                p.f(bVar3);
                zbwVar.zbc(zbamVar, bVar3);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1553;
        return doRead(aVarA.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws com.google.android.gms.common.api.b {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f5907g);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : d.a(byteArrayExtra, creator));
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f5909j);
        }
        if (!status.d()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new com.google.android.gms.common.api.b(Status.f5907g);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final e eVar) {
        p.f(eVar);
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zbas.zbh};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zba(eVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        aVarA.f6059d = 1653;
        return doRead(aVarA.a());
    }

    @Override // ga.k
    public final l getSignInCredentialFromIntent(Intent intent) throws com.google.android.gms.common.api.b {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f5907g);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : d.a(byteArrayExtra, creator));
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f5909j);
        }
        if (!status.d()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        Parcelable.Creator<l> creator2 = l.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        l lVar = (l) (byteArrayExtra2 != null ? d.a(byteArrayExtra2, creator2) : null);
        if (lVar != null) {
            return lVar;
        }
        throw new com.google.android.gms.common.api.b(Status.f5907g);
    }

    @Override // ga.k
    public final Task<PendingIntent> getSignInIntent(f fVar) {
        p.f(fVar);
        String str = fVar.f11883a;
        p.f(str);
        String str2 = fVar.f11886d;
        final f fVar2 = new f(str, fVar.f11884b, this.zbd, str2, fVar.f11887e, fVar.f11888f);
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zbas.zbf};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zbao zbaoVar = new zbao(this.zba, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                f fVar3 = fVar2;
                p.f(fVar3);
                zbwVar.zbe(zbaoVar, fVar3);
            }
        };
        aVarA.f6059d = 1555;
        return doRead(aVarA.a());
    }

    @Override // ga.k
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = h.f5927a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.g.a();
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zbas.zbb};
        aVarA.f6056a = new q() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zba.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        aVarA.f6057b = false;
        aVarA.f6059d = 1554;
        return doWrite(aVarA.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(e eVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), eVar, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(Context context, f0 f0Var) {
        super(context, (a<f0>) zbc, f0Var, g.a.f5924c);
        this.zbd = zbat.zba();
    }
}
