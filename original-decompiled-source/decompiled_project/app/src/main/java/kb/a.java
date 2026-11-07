package kb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.h0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public final class a extends com.google.android.gms.common.internal.g<f> implements jb.f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16244e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16245a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.internal.d f16246b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16247c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16248d;

    public a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Bundle bundle, h.a aVar, h.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f16245a = true;
        this.f16246b = dVar;
        this.f16247c = bundle;
        this.f16248d = dVar.f6097h;
    }

    @Override // jb.f
    public final void a() {
        connect(new b.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jb.f
    public final void b(a1 a1Var) {
        try {
            Account account = this.f16246b.f6090a;
            if (account == null) {
                account = new Account(com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT, "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT.equals(account.name) ? ka.b.a(getContext()).b() : null;
            Integer num = this.f16248d;
            p.f(num);
            h0 h0Var = new h0(2, account, num.intValue(), googleSignInAccountB);
            f fVar = (f) getService();
            i iVar = new i(1, h0Var);
            Parcel parcelZaa = fVar.zaa();
            zac.zac(parcelZaa, iVar);
            zac.zad(parcelZaa, a1Var);
            fVar.zac(12, parcelZaa);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                a1Var.f5932b.post(new z0(a1Var, new k(1, new pa.a(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.common.internal.d dVar = this.f16246b;
        boolean zEquals = getContext().getPackageName().equals(dVar.f6094e);
        Bundle bundle = this.f16247c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", dVar.f6094e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f16245a;
    }
}
