package l7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g7.s;
import g7.t;
import l7.k;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f16738a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16739b;

    public static final class a implements k.a<Bitmap> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            return new b((Bitmap) obj, mVar);
        }
    }

    public b(Bitmap bitmap, w7.m mVar) {
        this.f16738a = bitmap;
        this.f16739b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        return new m(s.b(new BitmapDrawable(this.f16739b.f31401a.getResources(), this.f16738a)), false, j7.f.f15221b);
    }
}
