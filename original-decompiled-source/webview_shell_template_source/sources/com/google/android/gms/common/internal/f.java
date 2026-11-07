package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import d3.a;
import d3.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f<T extends IInterface> extends b<T> implements a.e {

    /* renamed from: a, reason: collision with root package name */
    public final Set<Scope> f2444a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f2445b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, int i6, c cVar, e.a aVar, e.b bVar) {
        x0 x0VarA = g.a(context);
        c3.g gVar = c3.g.f2182d;
        l.f(aVar);
        l.f(bVar);
        super(context, looper, x0VarA, gVar, i6, new w(aVar), new x(bVar), cVar.f2418e);
        this.f2445b = cVar.f2414a;
        Set<Scope> set = cVar.f2416c;
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2444a = set;
    }

    @Override // d3.a.e
    public final Set<Scope> b() {
        return requiresSignIn() ? this.f2444a : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account getAccount() {
        return this.f2445b;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Set<Scope> getScopes() {
        return this.f2444a;
    }
}
