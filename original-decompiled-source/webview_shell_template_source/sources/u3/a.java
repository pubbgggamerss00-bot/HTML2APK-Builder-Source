package u3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.ni;
import d3.e;
import e3.b0;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.f<f> implements t3.f {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14596c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.internal.c f14597d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f14598e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14599f;

    public a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.f14596c = true;
        this.f14597d = cVar;
        this.f14598e = bundle;
        this.f14599f = cVar.f2420g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.f
    public final void a(b0 b0Var) throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountM;
        try {
            Account account = this.f14597d.f2414a;
            if (account == null) {
                account = new Account(com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT, "com.google");
            }
            if (com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT.equals(account.name)) {
                Context context = getContext();
                ReentrantLock reentrantLock = b3.a.f1988c;
                com.google.android.gms.common.internal.l.f(context);
                ReentrantLock reentrantLock2 = b3.a.f1988c;
                reentrantLock2.lock();
                try {
                    if (b3.a.f1989d == null) {
                        b3.a.f1989d = new b3.a(context.getApplicationContext());
                    }
                    b3.a aVar = b3.a.f1989d;
                    reentrantLock2.unlock();
                    String strA = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = aVar.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountM = GoogleSignInAccount.m(strA2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountM = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountM = null;
            }
            Integer num = this.f14599f;
            com.google.android.gms.common.internal.l.f(num);
            a0 a0Var = new a0(2, account, num.intValue(), googleSignInAccountM);
            f fVar = (f) getService();
            i iVar = new i(1, a0Var);
            fVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(fVar.f14012t);
            int i6 = o3.c.f14013a;
            parcelObtain.writeInt(1);
            iVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(b0Var);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                fVar.s.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                b0Var.f12859t.post(new ni(7, b0Var, new k(1, new c3.b(8, null, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }

    @Override // t3.f
    public final void c() {
        connect(new b.d());
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
        com.google.android.gms.common.internal.c cVar = this.f14597d;
        boolean zEquals = getContext().getPackageName().equals(cVar.f2417d);
        Bundle bundle = this.f14598e;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", cVar.f2417d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.b
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

    @Override // com.google.android.gms.common.internal.b, d3.a.e
    public final boolean requiresSignIn() {
        return this.f14596c;
    }
}
