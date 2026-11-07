package x8;

import android.net.Uri;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$createPdfDocument$1", f = "HomeViewModel.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q6 extends vg.i implements eh.l<tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f33106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(j6 j6Var, Uri uri, tg.e<? super q6> eVar) {
        super(1, eVar);
        this.f33105b = j6Var;
        this.f33106c = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new q6(this.f33105b, this.f33106c, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super ProjectEntity> eVar) {
        return ((q6) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33104a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        j6 j6Var = this.f33105b;
        n8.g gVar = j6Var.f32778e;
        Uri uri = this.f33106c;
        n8.i iVar = j6Var.f32779f;
        Long l10 = iVar.f18471c;
        iVar.f18471c = null;
        this.f33104a = 1;
        gVar.getClass();
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new n8.d(gVar, uri, l10, null), this);
        return objE == aVar ? aVar : objE;
    }
}
