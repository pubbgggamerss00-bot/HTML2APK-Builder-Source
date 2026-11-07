package n8;

import android.net.Uri;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$persistKeystore$2", f = "KeystoreRepository.kt", l = {EACTags.ELEMENT_LIST}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends vg.i implements eh.p<ph.i0, tg.e<? super pg.p<? extends KeystoreEntity>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18557a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f18559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f18560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(KeystoreEntity keystoreEntity, l lVar, tg.e<? super p> eVar) {
        super(2, eVar);
        this.f18559c = keystoreEntity;
        this.f18560d = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p pVar = new p(this.f18559c, this.f18560d, eVar);
        pVar.f18558b = obj;
        return pVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.p<? extends KeystoreEntity>> eVar) {
        return ((p) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18557a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                KeystoreEntity keystoreEntity = this.f18559c;
                l lVar = this.f18560d;
                File file = new File(keystoreEntity.getPath());
                if (!file.exists()) {
                    throw new IllegalArgumentException("Keystore file not found");
                }
                Uri uriPersistKeystore = KeystoreStorage.INSTANCE.persistKeystore(lVar.f18503b, file, keystoreEntity.getAlias());
                if (uriPersistKeystore == null) {
                    throw new IllegalStateException("Failed to persist keystore");
                }
                KeystoreEntity keystoreEntityCopy = keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : 0L, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : null, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : true, (759 & 128) != 0 ? keystoreEntity.publicUri : uriPersistKeystore.toString(), (759 & 256) != 0 ? keystoreEntity.keyPassword : null, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L);
                this.f18558b = keystoreEntityCopy;
                this.f18557a = 1;
                if (lVar.h(keystoreEntityCopy, this) == aVar) {
                    return aVar;
                }
                objA = keystoreEntityCopy;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objA = (KeystoreEntity) this.f18558b;
                pg.q.b(obj);
            }
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        return new pg.p(objA);
    }
}
