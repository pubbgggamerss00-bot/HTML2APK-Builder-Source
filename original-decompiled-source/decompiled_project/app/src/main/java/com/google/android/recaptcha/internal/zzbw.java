package com.google.android.recaptcha.internal;

import eh.l;
import eh.p;
import java.util.concurrent.CancellationException;
import lh.g;
import ph.b1;
import ph.p0;
import ph.r;
import ph.s1;
import ph.t;
import ph.u;
import tg.h;

/* loaded from: classes2.dex */
public final class zzbw implements p0 {
    private final /* synthetic */ u zza;

    public zzbw(u uVar) {
        this.zza = uVar;
    }

    @Override // ph.s1
    public final r attachChild(t tVar) {
        return this.zza.attachChild(tVar);
    }

    @Override // ph.p0
    public final Object await(tg.e eVar) {
        return this.zza.await(eVar);
    }

    @Override // ph.s1
    @pg.d
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // tg.h
    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    @Override // tg.h
    public final h.a get(h.b bVar) {
        return this.zza.get(bVar);
    }

    @Override // ph.s1
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // ph.s1
    public final g getChildren() {
        return this.zza.getChildren();
    }

    @Override // ph.p0
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // ph.p0
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // tg.h.a
    public final h.b getKey() {
        return this.zza.getKey();
    }

    @Override // ph.p0
    public final xh.e getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // ph.s1
    public final xh.c getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // ph.s1
    public final s1 getParent() {
        return this.zza.getParent();
    }

    @Override // ph.s1
    public final b1 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // ph.s1
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // ph.s1
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // ph.s1
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // ph.s1
    public final Object join(tg.e eVar) {
        return this.zza.join(eVar);
    }

    @Override // tg.h
    public final h minusKey(h.b bVar) {
        return this.zza.minusKey(bVar);
    }

    @Override // ph.s1
    @pg.d
    public final s1 plus(s1 s1Var) {
        return this.zza.plus(s1Var);
    }

    @Override // ph.s1
    public final boolean start() {
        return this.zza.start();
    }

    @Override // ph.s1
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // ph.s1
    public final b1 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return this.zza.invokeOnCompletion(z10, z11, lVar);
    }

    @Override // tg.h
    public final h plus(h hVar) {
        return this.zza.plus(hVar);
    }

    @Override // ph.s1
    @pg.d
    public final /* synthetic */ boolean cancel(Throwable th2) {
        return this.zza.cancel(th2);
    }
}
