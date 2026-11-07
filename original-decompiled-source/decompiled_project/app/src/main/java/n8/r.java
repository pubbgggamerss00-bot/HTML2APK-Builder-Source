package n8;

import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$updateKeystore$2", f = "KeystoreRepository.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f18580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(KeystoreEntity keystoreEntity, l lVar, tg.e eVar) {
        super(2, eVar);
        this.f18579b = lVar;
        this.f18580c = keystoreEntity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r(this.f18580c, this.f18579b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18578a;
        if (i10 == 0) {
            pg.q.b(obj);
            l lVar = this.f18579b;
            KeystoreDao keystoreDao = lVar.f18502a;
            KeystoreEntity keystoreEntityB = l.b(lVar, this.f18580c);
            this.f18578a = 1;
            if (keystoreDao.update(keystoreEntityB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
