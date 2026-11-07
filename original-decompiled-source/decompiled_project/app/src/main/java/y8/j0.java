package y8;

import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.io.File;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.keystore.KeystoreManagerScreenKt$KeystoreItem$6$1", f = "KeystoreManagerScreen.kt", l = {890}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public n1 f34153a;

    /* renamed from: b, reason: collision with root package name */
    public int f34154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f34155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<pg.n<String, String>> f34156d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.keystore.KeystoreManagerScreenKt$KeystoreItem$6$1$1", f = "KeystoreManagerScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends String, ? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KeystoreEntity f34157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeystoreEntity keystoreEntity, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f34157a = keystoreEntity;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f34157a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends String, ? extends String>> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            KeystoreHelper keystoreHelper = KeystoreHelper.INSTANCE;
            KeystoreEntity keystoreEntity = this.f34157a;
            return keystoreHelper.getCertificateFingerprints(new File(keystoreEntity.getPath()), keystoreEntity.getPassword(), keystoreEntity.getKeyAlias());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(KeystoreEntity keystoreEntity, n1<pg.n<String, String>> n1Var, tg.e<? super j0> eVar) {
        super(2, eVar);
        this.f34155c = keystoreEntity;
        this.f34156d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new j0(this.f34155c, this.f34156d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((j0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        n1<pg.n<String, String>> n1Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f34154b;
        if (i10 == 0) {
            pg.q.b(obj);
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar2 = new a(this.f34155c, null);
            n1<pg.n<String, String>> n1Var2 = this.f34156d;
            this.f34153a = n1Var2;
            this.f34154b = 1;
            obj = ph.h.e(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            n1Var = n1Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1Var = this.f34153a;
            pg.q.b(obj);
        }
        n1Var.setValue((pg.n) obj);
        return pg.f0.f21461a;
    }
}
