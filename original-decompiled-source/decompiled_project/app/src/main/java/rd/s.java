package rd;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f23426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23427b;

    public s(p pVar, String str) {
        this.f23427b = pVar;
        com.google.android.gms.common.internal.p.d(str);
        this.f23426a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(id.e.e(this.f23426a));
        qd.p pVar = firebaseAuth.f6832f;
        if (pVar != null) {
            Task<qd.q> taskD = firebaseAuth.d(pVar, true);
            p.f23413e.e("Token refreshing started", new Object[0]);
            taskD.addOnFailureListener(new r(this));
        }
    }
}
