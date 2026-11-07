package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import qd.p;
import rd.g0;
import rd.u0;
import rd.w0;

/* loaded from: classes2.dex */
public final class a extends g0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f6850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qd.d f6851c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6852d;

    public a(FirebaseAuth firebaseAuth, boolean z10, p pVar, qd.d dVar) {
        this.f6849a = z10;
        this.f6850b = pVar;
        this.f6851c = dVar;
        this.f6852d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    @Override // rd.g0
    public final Task<Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z10 = this.f6849a;
        qd.d dVar = this.f6851c;
        FirebaseAuth firebaseAuth = this.f6852d;
        if (!z10) {
            return firebaseAuth.f6831e.zza(firebaseAuth.f6827a, dVar, str, (w0) firebaseAuth.new d());
        }
        zzach zzachVar = firebaseAuth.f6831e;
        id.e eVar = firebaseAuth.f6827a;
        p pVar = this.f6850b;
        com.google.android.gms.common.internal.p.f(pVar);
        return zzachVar.zzb(eVar, pVar, dVar, str, (u0) firebaseAuth.new c());
    }
}
