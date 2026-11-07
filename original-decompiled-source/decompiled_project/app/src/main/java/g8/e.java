package g8;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements FirebaseAuth.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11565a;

    public /* synthetic */ e(p pVar) {
        this.f11565a = pVar;
    }

    @Override // com.google.firebase.auth.FirebaseAuth.a
    public final void a(FirebaseAuth firebaseAuth) {
        p pVar = this.f11565a;
        pVar.f11601e.setValue(pVar.d());
        if (firebaseAuth.f6832f == null) {
            pVar.f11603g.setValue(null);
        } else {
            pVar.l();
        }
    }
}
