package u6;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends vg.i implements eh.r<sh.g<? super Boolean>, Throwable, Long, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29255a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f29256b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f29257c;

    @Override // eh.r
    public final Object f(sh.g<? super Boolean> gVar, Throwable th2, Long l10, tg.e<? super Boolean> eVar) {
        long jLongValue = l10.longValue();
        a0 a0Var = new a0(4, eVar);
        a0Var.f29256b = th2;
        a0Var.f29257c = jLongValue;
        return a0Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29255a;
        if (i10 == 0) {
            pg.q.b(obj);
            Throwable th2 = this.f29256b;
            long j10 = this.f29257c;
            t6.s.d().c(c0.f29267a, "Cannot check for unfinished work", th2);
            long jMin = Math.min(j10 * 30000, c0.f29268b);
            this.f29255a = 1;
            if (ph.t0.b(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return Boolean.TRUE;
    }
}
