package qd;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class z {
    private static final sa.a zza = new sa.a("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        sa.a aVar = zza;
        Log.i(aVar.f24792a, aVar.d("Sms auto retrieval timed-out.", new Object[0]));
    }

    public void onCodeSent(String str, y yVar) {
    }

    public abstract void onVerificationCompleted(x xVar);

    public abstract void onVerificationFailed(id.j jVar);
}
