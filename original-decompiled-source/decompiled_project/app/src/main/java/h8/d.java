package h8;

import android.graphics.Bitmap;
import pg.f0;
import ph.i0;
import ph.z0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiBackgroundTurns$onIconRendered$1", f = "AiBackgroundTurns.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12371a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f12373c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, long j10, Bitmap bitmap, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f12373c = aVar;
        this.f12374d = j10;
        this.f12375e = bitmap;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        d dVar = new d(this.f12373c, this.f12374d, this.f12375e, eVar);
        dVar.f12372b = obj;
        return dVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f12371a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                a aVar = this.f12373c;
                long j10 = this.f12374d;
                Bitmap bitmap = this.f12375e;
                m mVar = aVar.f12343b;
                this.f12371a = 1;
                mVar.getClass();
                wh.c cVar = z0.f21632a;
                Object objE = ph.h.e(wh.b.f31563c, new q(mVar, j10, bitmap, null), this);
                if (objE != obj2) {
                    objE = f0.f21461a;
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
            f0 f0Var = f0.f21461a;
        } catch (Throwable th2) {
            pg.q.a(th2);
        }
        return f0.f21461a;
    }
}
