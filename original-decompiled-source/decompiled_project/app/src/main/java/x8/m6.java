package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$convertToApp$1", f = "HomeViewModel.kt", l = {424}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m6 extends vg.i implements eh.l<tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(j6 j6Var, ProjectEntity projectEntity, tg.e<? super m6> eVar) {
        super(1, eVar);
        this.f32936b = j6Var;
        this.f32937c = projectEntity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new m6(this.f32936b, this.f32937c, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super ProjectEntity> eVar) {
        return ((m6) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32935a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        n8.g gVar = this.f32936b.f32778e;
        this.f32935a = 1;
        gVar.getClass();
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new n8.a(this.f32937c, gVar, null), this);
        return objE == aVar ? aVar : objE;
    }
}
