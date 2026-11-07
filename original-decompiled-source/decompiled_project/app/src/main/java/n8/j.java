package n8;

import android.net.Uri;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$deleteKeystore$2", f = "KeystoreRepository.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f18479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f18480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(KeystoreEntity keystoreEntity, l lVar, tg.e<? super j> eVar) {
        super(2, eVar);
        this.f18479b = keystoreEntity;
        this.f18480c = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new j(this.f18479b, this.f18480c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((j) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18478a;
        if (i10 == 0) {
            pg.q.b(obj);
            KeystoreEntity keystoreEntity = this.f18479b;
            boolean zIsPersisted = keystoreEntity.isPersisted();
            l lVar = this.f18480c;
            if (zIsPersisted && keystoreEntity.getPublicUri() != null) {
                KeystoreStorage keystoreStorage = KeystoreStorage.INSTANCE;
                Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = lVar.f18503b;
                Uri uri = Uri.parse(keystoreEntity.getPublicUri());
                kotlin.jvm.internal.r.d(uri, "parse(...)");
                keystoreStorage.deletePersistedKeystore(hilt_HtmlToApkApplication, uri);
            }
            new File(keystoreEntity.getPath()).delete();
            KeystoreDao keystoreDao = lVar.f18502a;
            this.f18478a = 1;
            if (keystoreDao.delete(keystoreEntity, this) == aVar) {
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
