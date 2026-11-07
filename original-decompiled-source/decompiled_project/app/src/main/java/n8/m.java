package n8;

import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$getKeystoreById$2", f = "KeystoreRepository.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends vg.i implements eh.p<ph.i0, tg.e<? super KeystoreEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, long j10, tg.e<? super m> eVar) {
        super(2, eVar);
        this.f18517b = lVar;
        this.f18518c = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new m(this.f18517b, this.f18518c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super KeystoreEntity> eVar) {
        return ((m) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18516a;
        l lVar = this.f18517b;
        if (i10 == 0) {
            pg.q.b(obj);
            KeystoreDao keystoreDao = lVar.f18502a;
            this.f18516a = 1;
            obj = keystoreDao.getById(this.f18518c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        KeystoreEntity keystoreEntity = (KeystoreEntity) obj;
        if (keystoreEntity != null) {
            return l.a(lVar, keystoreEntity);
        }
        return null;
    }
}
