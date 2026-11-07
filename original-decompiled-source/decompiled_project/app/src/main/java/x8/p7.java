package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$renameProject$1", f = "HomeViewModel.kt", l = {531}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(j6 j6Var, ProjectEntity projectEntity, String str, tg.e<? super p7> eVar) {
        super(2, eVar);
        this.f33084b = j6Var;
        this.f33085c = projectEntity;
        this.f33086d = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new p7(this.f33084b, this.f33085c, this.f33086d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33083a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.s sVar = this.f33084b.f32775b;
            ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(this.f33085c, 0L, this.f33086d, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -3, -1, 7, null);
            this.f33083a = 1;
            if (sVar.c(projectEntityCopy$default, this) == aVar) {
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
