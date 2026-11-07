package b9;

import android.graphics.Bitmap;
import b9.a3;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfThumbnails$load$3", f = "PdfThumbnails.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b3 extends vg.i implements eh.p<ph.i0, tg.e<? super Bitmap>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3 f3761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(a3 a3Var, int i10, tg.e<? super b3> eVar) {
        super(2, eVar);
        this.f3761a = a3Var;
        this.f3762b = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b3(this.f3761a, this.f3762b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Bitmap> eVar) {
        return ((b3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        a3 a3Var = this.f3761a;
        a3.a aVar2 = a3Var.f3735g;
        int i10 = this.f3762b;
        Bitmap bitmap = aVar2.get(new Integer(i10));
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapH = a3.h(a3Var, i10, 240);
        if (bitmapH == null) {
            return null;
        }
        a3Var.f3735g.put(new Integer(i10), bitmapH);
        return bitmapH;
    }
}
