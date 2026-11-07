package x8;

import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$createHtmlDocument$1", f = "HomeViewModel.kt", l = {411}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p6 extends vg.i implements eh.l<tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f33082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(j6 j6Var, Uri uri, tg.e<? super p6> eVar) {
        super(1, eVar);
        this.f33081b = j6Var;
        this.f33082c = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new p6(this.f33081b, this.f33082c, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<? super ProjectEntity> eVar) {
        return ((p6) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33080a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        j6 j6Var = this.f33081b;
        n8.g gVar = j6Var.f32778e;
        Uri uri = this.f33082c;
        String string = j6Var.F().getString(R.string.html_document_default_name);
        kotlin.jvm.internal.r.d(string, "getString(...)");
        n8.i iVar = this.f33081b.f32779f;
        Long l10 = iVar.f18471c;
        iVar.f18471c = null;
        this.f33080a = 1;
        gVar.getClass();
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new n8.c(uri, string, gVar, l10, null), this);
        return objE == aVar ? aVar : objE;
    }
}
