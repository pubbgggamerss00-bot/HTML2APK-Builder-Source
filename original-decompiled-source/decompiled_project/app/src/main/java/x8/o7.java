package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$renameFolder$1", f = "HomeViewModel.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f33057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(j6 j6Var, FolderEntity folderEntity, String str, tg.e<? super o7> eVar) {
        super(2, eVar);
        this.f33056b = j6Var;
        this.f33057c = folderEntity;
        this.f33058d = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o7(this.f33056b, this.f33057c, this.f33058d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33055a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.i iVar = this.f33056b.f32779f;
            this.f33055a = 1;
            Object objUpdate = iVar.f18469a.update(FolderEntity.copy$default(this.f33057c, 0L, this.f33058d, 0, 0L, 13, null), this);
            if (objUpdate != aVar) {
                objUpdate = pg.f0.f21461a;
            }
            if (objUpdate == aVar) {
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
