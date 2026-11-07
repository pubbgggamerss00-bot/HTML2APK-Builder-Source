package ka;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.g0;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class o extends zbb {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws JSONException, RemoteException {
        BasePendingResult basePendingResultB;
        BasePendingResult basePendingResultB2;
        String strD;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            s sVar = (s) this;
            sVar.b();
            n.a(sVar.f16243a).b();
            return true;
        }
        s sVar2 = (s) this;
        sVar2.b();
        RevocationBoundService revocationBoundService = sVar2.f16243a;
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f5866l;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsD = null;
            } else {
                try {
                    googleSignInOptionsD = GoogleSignInOptions.d(strD);
                } catch (JSONException unused) {
                }
            }
        }
        com.google.android.gms.common.internal.p.f(googleSignInOptionsD);
        ja.a aVar = new ja.a(revocationBoundService, ea.a.f8631a, googleSignInOptionsD, new g.a(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            com.google.android.gms.common.api.h hVarAsGoogleApiClient = aVar.asGoogleApiClient();
            Context applicationContext = aVar.getApplicationContext();
            boolean z10 = aVar.a() == 3;
            m.f16240a.a("Revoking access", new Object[0]);
            String strD3 = b.a(applicationContext).d("refreshToken");
            m.a(applicationContext);
            if (!z10) {
                basePendingResultB2 = hVarAsGoogleApiClient.b(new k(hVarAsGoogleApiClient));
            } else if (strD3 == null) {
                sa.a aVar2 = e.f16232c;
                Status status = new Status(4, null, null, null);
                com.google.android.gms.common.internal.p.a("Status code must not be SUCCESS", !status.d());
                basePendingResultB2 = new com.google.android.gms.common.api.q(status);
                basePendingResultB2.setResult(status);
            } else {
                e eVar = new e(strD3);
                new Thread(eVar).start();
                basePendingResultB2 = eVar.f16234b;
            }
            c6.b bVar = new c6.b();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResultB2.addStatusListener(new g0(basePendingResultB2, taskCompletionSource, bVar));
            taskCompletionSource.getTask();
        } else {
            com.google.android.gms.common.api.h hVarAsGoogleApiClient2 = aVar.asGoogleApiClient();
            Context applicationContext2 = aVar.getApplicationContext();
            boolean z11 = aVar.a() == 3;
            m.f16240a.a("Signing out", new Object[0]);
            m.a(applicationContext2);
            if (z11) {
                Status status2 = Status.f5905e;
                com.google.android.gms.common.internal.p.g(status2, "Result must not be null");
                basePendingResultB = new com.google.android.gms.common.api.internal.t(hVarAsGoogleApiClient2);
                basePendingResultB.setResult(status2);
            } else {
                basePendingResultB = hVarAsGoogleApiClient2.b(new i(hVarAsGoogleApiClient2));
            }
            c6.b bVar2 = new c6.b();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            basePendingResultB.addStatusListener(new g0(basePendingResultB, taskCompletionSource2, bVar2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
