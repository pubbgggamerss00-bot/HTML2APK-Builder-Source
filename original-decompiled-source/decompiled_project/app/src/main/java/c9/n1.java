package c9;

import android.graphics.Bitmap;
import b9.a3;
import x0.c2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$thumbnail$bitmap$2$1", f = "PdfEditorScreen.kt", l = {403}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n1 extends vg.i implements eh.p<c2<Bitmap>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5145a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f5147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f5148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(a3 a3Var, b bVar, tg.e<? super n1> eVar) {
        super(2, eVar);
        this.f5147c = a3Var;
        this.f5148d = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n1 n1Var = new n1(this.f5147c, this.f5148d, eVar);
        n1Var.f5146b = obj;
        return n1Var;
    }

    @Override // eh.p
    public final Object invoke(c2<Bitmap> c2Var, tg.e<? super pg.f0> eVar) {
        return ((n1) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        c2 c2Var;
        Bitmap bitmap;
        c2 c2Var2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f5145a;
        if (i10 == 0) {
            pg.q.b(obj);
            c2Var = (c2) this.f5146b;
            if (c2Var.getValue() == 0) {
                a3 a3Var = this.f5147c;
                if (a3Var != null) {
                    int i11 = this.f5148d.f5059c;
                    this.f5146b = c2Var;
                    this.f5145a = 1;
                    Object objP = a3Var.p(i11, this);
                    if (objP == aVar) {
                        return aVar;
                    }
                    c2Var2 = c2Var;
                    obj = objP;
                } else {
                    bitmap = null;
                    c2Var.setValue(bitmap);
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2Var2 = (c2) this.f5146b;
        pg.q.b(obj);
        c2 c2Var3 = c2Var2;
        bitmap = (Bitmap) obj;
        c2Var = c2Var3;
        c2Var.setValue(bitmap);
        return pg.f0.f21461a;
    }
}
