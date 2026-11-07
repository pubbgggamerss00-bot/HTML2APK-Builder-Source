package ph;

import java.util.concurrent.CancellationException;
import ph.s1;

/* loaded from: classes2.dex */
public final class e2 extends tg.a implements s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e2 f21526b = new e2(s1.a.f21589a);

    @Override // ph.s1
    @pg.d
    public final r attachChild(t tVar) {
        return f2.f21533a;
    }

    @Override // ph.s1
    @pg.d
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // ph.s1
    @pg.d
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // ph.s1
    @pg.d
    public final /* synthetic */ boolean cancel(Throwable th2) {
        throw null;
    }

    @Override // ph.s1
    @pg.d
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // ph.s1
    public final lh.g<s1> getChildren() {
        return lh.d.f17062a;
    }

    @Override // ph.s1
    public final xh.c getOnJoin() {
        throw null;
    }

    @Override // ph.s1
    public final s1 getParent() {
        throw null;
    }

    @Override // ph.s1
    @pg.d
    public final b1 invokeOnCompletion(eh.l<? super Throwable, pg.f0> lVar) {
        return f2.f21533a;
    }

    @Override // ph.s1
    public final boolean isActive() {
        return true;
    }

    @Override // ph.s1
    public final boolean isCancelled() {
        return false;
    }

    @Override // ph.s1
    public final boolean isCompleted() {
        return false;
    }

    @Override // ph.s1
    @pg.d
    public final Object join(tg.e<? super pg.f0> eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ph.s1
    @pg.d
    public final s1 plus(s1 s1Var) {
        throw null;
    }

    @Override // ph.s1
    @pg.d
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // ph.s1
    @pg.d
    public final b1 invokeOnCompletion(boolean z10, boolean z11, eh.l<? super Throwable, pg.f0> lVar) {
        return f2.f21533a;
    }
}
