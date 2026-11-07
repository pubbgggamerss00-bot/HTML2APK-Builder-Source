package u0;

import u0.x;

@vg.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w extends vg.i implements eh.q<m, c0<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f29169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.g f29170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, androidx.compose.foundation.gestures.g gVar, tg.e eVar) {
        super(3, eVar);
        this.f29169b = xVar;
        this.f29170c = gVar;
    }

    @Override // eh.q
    public final Object b(m mVar, c0<Object> c0Var, tg.e<? super pg.f0> eVar) {
        return new w(this.f29169b, this.f29170c, eVar).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29168a;
        if (i10 == 0) {
            pg.q.b(obj);
            x.a aVar2 = this.f29169b.f29175a;
            this.f29168a = 1;
            if (this.f29170c.invoke(aVar2, this) == aVar) {
                return aVar;
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
