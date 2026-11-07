package qd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class b1 implements rd.t, rd.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f22663a;

    public b1(FirebaseAuth firebaseAuth) {
        this.f22663a = firebaseAuth;
    }

    @Override // rd.w0
    public final void a(zzahn zzahnVar, p pVar) throws JSONException {
        FirebaseAuth firebaseAuth = this.f22663a;
        firebaseAuth.getClass();
        FirebaseAuth.f(firebaseAuth, pVar, zzahnVar, true, true);
    }

    @Override // rd.t
    public final void zza(Status status) {
        int i10 = status.f5910a;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.f22663a.c();
        }
    }
}
