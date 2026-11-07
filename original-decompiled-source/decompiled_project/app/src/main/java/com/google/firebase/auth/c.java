package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import qd.p;
import rd.g0;
import rd.u0;

/* loaded from: classes2.dex */
public final class c extends g0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f6859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd.d f6860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rd.e f6861c;

    public c(rd.e eVar, p pVar, qd.d dVar) {
        this.f6859a = pVar;
        this.f6860b = dVar;
        this.f6861c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    @Override // rd.g0
    public final Task<Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        rd.e eVar = this.f6861c;
        return eVar.f6831e.zza(eVar.f6827a, this.f6859a, (qd.c) this.f6860b, str, (u0) new FirebaseAuth.c());
    }
}
