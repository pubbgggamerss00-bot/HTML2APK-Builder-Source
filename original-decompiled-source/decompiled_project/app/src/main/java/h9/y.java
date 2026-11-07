package h9;

import android.content.Context;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystorePasswordStorage;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$createKeystore$2", f = "KeystoreViewModel.kt", l = {73, 76, 80}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public KeystoreEntity f12884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12885b;

    /* renamed from: c, reason: collision with root package name */
    public int f12886c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f12889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f12891h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f12892j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f12893k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y8.u0 f12894l;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$createKeystore$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y8.u0 f12895a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f12896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y8.u0 u0Var, Object obj, tg.e eVar) {
            super(2, eVar);
            this.f12895a = u0Var;
            this.f12896b = obj;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12895a, this.f12896b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            this.f12895a.invoke(new pg.p(this.f12896b));
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10, Context context, String str, String str2, x xVar, boolean z10, y8.u0 u0Var, tg.e eVar) {
        super(2, eVar);
        this.f12888e = i10;
        this.f12889f = context;
        this.f12890g = str;
        this.f12891h = str2;
        this.f12892j = xVar;
        this.f12893k = z10;
        this.f12894l = u0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y yVar = new y(this.f12888e, this.f12889f, this.f12890g, this.f12891h, this.f12892j, this.f12893k, this.f12894l, eVar);
        yVar.f12887d = obj;
        return yVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        if (ph.h.e(r3, r4, r29) != r2) goto L34;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        boolean z10;
        Object objF;
        x xVar;
        KeystoreEntity keystoreEntity;
        Object objG;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12886c;
        try {
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (i10 == 0) {
            pg.q.b(obj);
            int i11 = this.f12888e;
            Context context = this.f12889f;
            String str = this.f12890g;
            String str2 = this.f12891h;
            x xVar2 = this.f12892j;
            boolean z11 = this.f12893k;
            KeystoreHelper keystoreHelper = KeystoreHelper.INSTANCE;
            keystoreHelper.validateValidityYears(i11);
            String strGenerateRandomPassword = new KeystorePasswordStorage(context).generateRandomPassword();
            String absolutePath = keystoreHelper.createCustomKeystore(context, str, str2, strGenerateRandomPassword, i11, "keystore_" + System.currentTimeMillis() + KeystoreStorage.FILE_EXTENSION).getAbsolutePath();
            kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
            z10 = z11;
            KeystoreEntity keystoreEntity2 = new KeystoreEntity(0L, str, absolutePath, str2, str, "RSA", false, null, strGenerateRandomPassword, 0L, 705, null);
            n8.l lVar = xVar2.f12857b;
            this.f12887d = xVar2;
            this.f12884a = keystoreEntity2;
            this.f12885b = z10;
            this.f12886c = 1;
            objF = lVar.f(keystoreEntity2, this);
            if (objF == aVar) {
                return aVar;
            }
            xVar = xVar2;
            keystoreEntity = keystoreEntity2;
        } else if (i10 == 1) {
            boolean z12 = this.f12885b;
            KeystoreEntity keystoreEntity3 = this.f12884a;
            xVar = (x) this.f12887d;
            pg.q.b(obj);
            z10 = z12;
            keystoreEntity = keystoreEntity3;
            objF = obj;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            objG = ((pg.p) obj).f21471a;
            pg.q.b(objG);
            objA = pg.f0.f21461a;
            wh.c cVar = ph.z0.f21632a;
            qh.g gVar = uh.o.f29764a;
            a aVar2 = new a(this.f12894l, objA, null);
            this.f12887d = null;
            this.f12884a = null;
            this.f12886c = 3;
        }
        long jLongValue = ((Number) objF).longValue();
        if (z10) {
            KeystoreEntity keystoreEntityCopy = keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : jLongValue, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : null, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : false, (759 & 128) != 0 ? keystoreEntity.publicUri : null, (759 & 256) != 0 ? keystoreEntity.keyPassword : null, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L);
            n8.l lVar2 = xVar.f12857b;
            this.f12887d = null;
            this.f12884a = null;
            this.f12886c = 2;
            objG = lVar2.g(keystoreEntityCopy, this);
            if (objG == aVar) {
                return aVar;
            }
            pg.q.b(objG);
        }
        objA = pg.f0.f21461a;
        wh.c cVar2 = ph.z0.f21632a;
        qh.g gVar2 = uh.o.f29764a;
        a aVar22 = new a(this.f12894l, objA, null);
        this.f12887d = null;
        this.f12884a = null;
        this.f12886c = 3;
    }
}
