package l9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.util.ProjectFolderImporter$import$5", f = "ProjectFolderImporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f16838a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(File file, tg.e<? super i0> eVar) {
        super(2, eVar);
        this.f16838a = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i0(this.f16838a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
        return ((i0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return Boolean.valueOf(ah.l.f(this.f16838a));
    }
}
