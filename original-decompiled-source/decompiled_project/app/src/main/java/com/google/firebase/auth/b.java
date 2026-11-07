package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import qd.p;
import rd.g0;

/* loaded from: classes2.dex */
public final class b extends g0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f6855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6858f;

    public b(FirebaseAuth firebaseAuth, String str, boolean z10, p pVar, String str2, String str3) {
        this.f6853a = str;
        this.f6854b = z10;
        this.f6855c = pVar;
        this.f6856d = str2;
        this.f6857e = str3;
        this.f6858f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    @Override // rd.g0
    public final Task<Object> b(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f6853a;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z10 = this.f6854b;
        FirebaseAuth firebaseAuth = this.f6858f;
        if (!z10) {
            return firebaseAuth.f6831e.zzb(firebaseAuth.f6827a, this.f6853a, this.f6856d, this.f6857e, str, firebaseAuth.new d());
        }
        zzach zzachVar = firebaseAuth.f6831e;
        id.e eVar = firebaseAuth.f6827a;
        p pVar = this.f6855c;
        com.google.android.gms.common.internal.p.f(pVar);
        return zzachVar.zzb(eVar, pVar, this.f6853a, this.f6856d, this.f6857e, str, firebaseAuth.new c());
    }
}
