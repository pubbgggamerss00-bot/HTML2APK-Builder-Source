package p2;

import com.yalantis.ucrop.view.CropImageView;
import tg.h;

/* loaded from: classes.dex */
public final class i implements j1.i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f21172a = new i();

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // j1.i
    public final float p() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}
