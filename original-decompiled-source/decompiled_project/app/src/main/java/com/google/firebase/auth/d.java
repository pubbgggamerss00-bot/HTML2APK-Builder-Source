package com.google.firebase.auth;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g8.e f6862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6863b;

    public d(FirebaseAuth firebaseAuth, g8.e eVar) {
        this.f6862a = eVar;
        this.f6863b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6862a.a(this.f6863b);
    }
}
