package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$2$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f33119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(FolderEntity folderEntity, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f33119a = folderEntity;
        this.f33120b = n1Var;
        this.f33121c = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r3(this.f33119a, this.f33120b, this.f33121c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        boolean z10 = g5.f32665a;
        x0.n1<Long> n1Var = this.f33120b;
        if (n1Var.getValue() != null && !((List) this.f33121c.getValue()).isEmpty() && this.f33119a == null) {
            n1Var.setValue(null);
        }
        return pg.f0.f21461a;
    }
}
