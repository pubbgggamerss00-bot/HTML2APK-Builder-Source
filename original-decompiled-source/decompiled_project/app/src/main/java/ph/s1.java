package ph;

import java.util.concurrent.CancellationException;
import tg.h;

/* loaded from: classes2.dex */
public interface s1 extends h.a {

    public static final class a implements h.b<s1> {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f21589a = new a();
    }

    r attachChild(t tVar);

    @pg.d
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @pg.d
    /* synthetic */ boolean cancel(Throwable th2);

    CancellationException getCancellationException();

    lh.g<s1> getChildren();

    xh.c getOnJoin();

    s1 getParent();

    b1 invokeOnCompletion(eh.l<? super Throwable, pg.f0> lVar);

    b1 invokeOnCompletion(boolean z10, boolean z11, eh.l<? super Throwable, pg.f0> lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(tg.e<? super pg.f0> eVar);

    @pg.d
    s1 plus(s1 s1Var);

    boolean start();
}
