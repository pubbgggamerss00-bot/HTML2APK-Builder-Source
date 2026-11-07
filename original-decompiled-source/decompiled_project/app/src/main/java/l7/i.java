package l7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import g7.s;
import g7.t;
import l7.k;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f16750a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16751b;

    public static final class a implements k.a<Drawable> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            return new i((Drawable) obj, mVar);
        }
    }

    public i(Drawable drawable, w7.m mVar) {
        this.f16750a = drawable;
        this.f16751b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        Bitmap.Config[] configArr = b8.t.f3682a;
        Drawable bitmapDrawable = this.f16750a;
        boolean z10 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof n6.b);
        if (z10) {
            w7.m mVar = this.f16751b;
            bitmapDrawable = new BitmapDrawable(mVar.f31401a.getResources(), b8.e.a(bitmapDrawable, w7.h.a(mVar), mVar.f31402b, mVar.f31403c, mVar.f31404d == x7.c.f32186b));
        }
        return new m(s.b(bitmapDrawable), z10, j7.f.f15221b);
    }
}
