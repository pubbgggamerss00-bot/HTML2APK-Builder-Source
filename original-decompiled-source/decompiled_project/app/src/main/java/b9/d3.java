package b9;

import android.graphics.Bitmap;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfThumbnails$render$2", f = "PdfThumbnails.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d3 extends vg.i implements eh.p<ph.i0, tg.e<? super Bitmap>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3 f3787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(a3 a3Var, int i10, int i11, tg.e<? super d3> eVar) {
        super(2, eVar);
        this.f3787a = a3Var;
        this.f3788b = i10;
        this.f3789c = i11;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new d3(this.f3787a, this.f3788b, this.f3789c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Bitmap> eVar) {
        return ((d3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return a3.h(this.f3787a, this.f3788b, this.f3789c);
    }
}
