package t8;

import android.graphics.Bitmap;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$onIconRendered$2", f = "AiSessionViewModel.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f28416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(m3 m3Var, long j10, Bitmap bitmap, tg.e<? super q3> eVar) {
        super(2, eVar);
        this.f28414b = m3Var;
        this.f28415c = j10;
        this.f28416d = bitmap;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q3(this.f28414b, this.f28415c, this.f28416d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f28413a;
        if (i10 == 0) {
            pg.q.b(obj);
            h8.m mVar = this.f28414b.f28309d;
            this.f28413a = 1;
            mVar.getClass();
            wh.c cVar = ph.z0.f21632a;
            Object objE = ph.h.e(wh.b.f31563c, new h8.q(mVar, this.f28415c, this.f28416d, null), this);
            if (objE != obj2) {
                objE = pg.f0.f21461a;
            }
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
