package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6864a;

    public e(FirebaseAuth firebaseAuth) {
        this.f6864a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = this.f6864a;
        Iterator it = firebaseAuth.f6830d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(firebaseAuth);
        }
    }
}
