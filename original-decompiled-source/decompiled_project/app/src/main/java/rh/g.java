package rh;

import pg.f0;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m<Object> f23602a = new m<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f23603b = uh.w.b(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f23604c = uh.w.b(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final uh.v f23605d = new uh.v("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final uh.v f23606e = new uh.v("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final uh.v f23607f = new uh.v("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final uh.v f23608g = new uh.v("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final uh.v f23609h = new uh.v("POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final uh.v f23610i = new uh.v("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final uh.v f23611j = new uh.v("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final uh.v f23612k = new uh.v("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final uh.v f23613l = new uh.v("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final uh.v f23614m = new uh.v("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final uh.v f23615n = new uh.v("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final uh.v f23616o = new uh.v("FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final uh.v f23617p = new uh.v("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final uh.v f23618q = new uh.v("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final uh.v f23619r = new uh.v("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final uh.v f23620s = new uh.v("NO_CLOSE_CAUSE");

    public static final <T> boolean a(ph.k<? super T> kVar, T t3, eh.q<? super Throwable, ? super T, ? super tg.h, f0> qVar) {
        uh.v vVarM = kVar.m(t3, qVar);
        if (vVarM == null) {
            return false;
        }
        kVar.w(vVarM);
        return true;
    }
}
