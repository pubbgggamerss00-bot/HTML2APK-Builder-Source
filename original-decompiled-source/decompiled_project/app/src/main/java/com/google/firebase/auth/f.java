package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6865a;

    public f(FirebaseAuth firebaseAuth, le.b bVar) {
        this.f6865a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = this.f6865a;
        Iterator it = firebaseAuth.f6829c.iterator();
        while (it.hasNext()) {
            ((rd.a) it.next()).a();
        }
        Iterator it2 = firebaseAuth.f6828b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a();
        }
    }
}
