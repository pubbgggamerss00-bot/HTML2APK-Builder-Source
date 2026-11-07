package n8;

import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$insertKeystore$2", f = "KeystoreRepository.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.p<ph.i0, tg.e<? super Long>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f18548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(KeystoreEntity keystoreEntity, l lVar, tg.e eVar) {
        super(2, eVar);
        this.f18547b = lVar;
        this.f18548c = keystoreEntity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n(this.f18548c, this.f18547b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Long> eVar) {
        return ((n) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18546a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        l lVar = this.f18547b;
        KeystoreDao keystoreDao = lVar.f18502a;
        KeystoreEntity keystoreEntityB = l.b(lVar, this.f18548c);
        this.f18546a = 1;
        Object objInsert = keystoreDao.insert(keystoreEntityB, this);
        return objInsert == aVar ? aVar : objInsert;
    }
}
