package m9;

import android.graphics.Bitmap;
import m9.x0;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.b f18016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.c f18018c;

    public /* synthetic */ z0(x0.b bVar, int i10, x0.c cVar) {
        this.f18016a = bVar;
        this.f18017b = i10;
        this.f18018c = cVar;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        kotlin.jvm.internal.r.e(bitmap, "bitmap");
        x0.b bVar = this.f18016a;
        if (bVar.f18004x == this.f18017b) {
            this.f18018c.g(bVar, bitmap);
        }
        return pg.f0.f21461a;
    }
}
