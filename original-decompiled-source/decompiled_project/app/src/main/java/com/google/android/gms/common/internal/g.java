package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class g<T extends IInterface> extends b<T> implements a.f {
    private static volatile Executor zaa;
    private final d zab;
    private final Set zac;
    private final Account zad;

    public g(Context context, Handler handler, int i10, d dVar) {
        super(context, handler, h.a(context), pa.d.f21387d, i10, null, null);
        p.f(dVar);
        this.zab = dVar;
        this.zad = dVar.f6090a;
        this.zac = zaa(dVar.f6092c);
    }

    private final Set zaa(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.b
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final d getClientSettings() {
        return this.zab;
    }

    public pa.c[] getRequiredFeatures() {
        return new pa.c[0];
    }

    @Override // com.google.android.gms.common.internal.b
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    public g(Context context, Looper looper, int i10, d dVar) {
        this(context, looper, h.a(context), pa.d.f21387d, i10, dVar, null, null);
    }

    @Deprecated
    public g(Context context, Looper looper, int i10, d dVar, h.a aVar, h.b bVar) {
        this(context, looper, i10, dVar, (com.google.android.gms.common.api.internal.f) aVar, (com.google.android.gms.common.api.internal.n) bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, Looper looper, int i10, d dVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        f1 f1VarA = h.a(context);
        pa.d dVar2 = pa.d.f21387d;
        p.f(fVar);
        p.f(nVar);
        this(context, looper, f1VarA, dVar2, i10, dVar, fVar, nVar);
    }

    public g(Context context, Looper looper, h hVar, pa.d dVar, int i10, d dVar2, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        super(context, looper, hVar, dVar, i10, fVar == null ? null : new c0(fVar), nVar != null ? new d0(nVar) : null, dVar2.f6095f);
        this.zab = dVar2;
        this.zad = dVar2.f6090a;
        this.zac = zaa(dVar2.f6092c);
    }
}
