package f9;

import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;

/* loaded from: classes.dex */
public final class wa implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f10858a;

    public wa(KeystoreEntity keystoreEntity) {
        this.f10858a = keystoreEntity;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.ff.b(this.f10858a.getAlias(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
        }
        return pg.f0.f21461a;
    }
}
