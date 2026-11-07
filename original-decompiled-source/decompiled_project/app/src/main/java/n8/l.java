package n8;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystorePasswordStorage;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;
import th.r;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final KeystoreDao f18502a;

    /* renamed from: b, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f18503b;

    /* renamed from: c, reason: collision with root package name */
    public final yh.c f18504c = new yh.c();

    /* renamed from: d, reason: collision with root package name */
    public final KeystorePasswordStorage f18505d;

    public static final class a implements sh.f<List<? extends KeystoreEntity>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.f f18506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f18507b;

        /* renamed from: n8.l$a$a, reason: collision with other inner class name */
        public static final class C0198a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sh.g f18508a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f18509b;

            @vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$getAllKeystores$$inlined$map$1$2", f = "KeystoreRepository.kt", l = {50}, m = "emit")
            /* renamed from: n8.l$a$a$a, reason: collision with other inner class name */
            public static final class C0199a extends vg.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f18510a;

                /* renamed from: b, reason: collision with root package name */
                public int f18511b;

                public C0199a(tg.e eVar) {
                    super(eVar);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    this.f18510a = obj;
                    this.f18511b |= PKIFailureInfo.systemUnavail;
                    return C0198a.this.c(null, this);
                }
            }

            public C0198a(sh.g gVar, l lVar) {
                this.f18508a = gVar;
                this.f18509b = lVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // sh.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, tg.e eVar) {
                C0199a c0199a;
                if (eVar instanceof C0199a) {
                    c0199a = (C0199a) eVar;
                    int i10 = c0199a.f18511b;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        c0199a.f18511b = i10 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0199a = new C0199a(eVar);
                    }
                }
                Object obj2 = c0199a.f18510a;
                ug.a aVar = ug.a.f29706a;
                int i11 = c0199a.f18511b;
                if (i11 == 0) {
                    pg.q.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(l.a(this.f18509b, (KeystoreEntity) it.next()));
                    }
                    c0199a.f18511b = 1;
                    if (this.f18508a.c(arrayList, c0199a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj2);
                }
                return pg.f0.f21461a;
            }
        }

        public a(sh.f fVar, l lVar) {
            this.f18506a = fVar;
            this.f18507b = lVar;
        }

        @Override // sh.f
        public final Object b(sh.g<? super List<? extends KeystoreEntity>> gVar, tg.e eVar) {
            Object objB = this.f18506a.b(new C0198a(gVar, this.f18507b), eVar);
            return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
        }
    }

    public l(KeystoreDao keystoreDao, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication) {
        this.f18502a = keystoreDao;
        this.f18503b = hilt_HtmlToApkApplication;
        this.f18505d = new KeystorePasswordStorage(hilt_HtmlToApkApplication);
    }

    public static final KeystoreEntity a(l lVar, KeystoreEntity keystoreEntity) {
        KeystorePasswordStorage keystorePasswordStorage = lVar.f18505d;
        try {
            String strDecrypt = keystorePasswordStorage.decrypt(keystoreEntity.getPassword());
            String keyPassword = keystoreEntity.getKeyPassword();
            String strDecrypt2 = null;
            if (keyPassword != null) {
                if (mh.x.A(keyPassword)) {
                    keyPassword = null;
                }
                if (keyPassword != null) {
                    strDecrypt2 = keystorePasswordStorage.decrypt(keyPassword);
                }
            }
            return keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : 0L, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : strDecrypt, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : false, (759 & 128) != 0 ? keystoreEntity.publicUri : null, (759 & 256) != 0 ? keystoreEntity.keyPassword : strDecrypt2 == null ? strDecrypt : strDecrypt2, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L);
        } catch (Exception unused) {
            return keystoreEntity;
        }
    }

    public static final KeystoreEntity b(l lVar, KeystoreEntity keystoreEntity) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        KeystorePasswordStorage keystorePasswordStorage = lVar.f18505d;
        String strEncrypt = keystorePasswordStorage.encrypt(keystoreEntity.getPassword());
        String keyPassword = keystoreEntity.getKeyPassword();
        return keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : 0L, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : strEncrypt, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : false, (759 & 128) != 0 ? keystoreEntity.publicUri : null, (759 & 256) != 0 ? keystoreEntity.keyPassword : keyPassword != null ? keystorePasswordStorage.encrypt(keyPassword) : null, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L);
    }

    public final sh.f<List<KeystoreEntity>> e() {
        sh.f aVar = new a(this.f18502a.getAll(), this);
        wh.c cVar = ph.z0.f21632a;
        wh.b bVar = wh.b.f31563c;
        if (bVar.get(s1.a.f21589a) == null) {
            return bVar.equals(tg.i.f28768a) ? aVar : aVar instanceof th.r ? r.a.a((th.r) aVar, bVar, 0, null, 6) : new th.j(aVar, bVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + bVar).toString());
    }

    public final Object f(KeystoreEntity keystoreEntity, vg.c cVar) {
        wh.c cVar2 = ph.z0.f21632a;
        return ph.h.e(wh.b.f31563c, new n(keystoreEntity, this, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(KeystoreEntity keystoreEntity, vg.c cVar) throws Throwable {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f18555c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f18555c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(this, cVar);
            }
        }
        Object objE = oVar.f18553a;
        ug.a aVar = ug.a.f29706a;
        int i11 = oVar.f18555c;
        if (i11 == 0) {
            pg.q.b(objE);
            wh.c cVar2 = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            p pVar = new p(keystoreEntity, this, null);
            oVar.f18555c = 1;
            objE = ph.h.e(bVar, pVar, oVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objE);
        }
        return ((pg.p) objE).f21471a;
    }

    public final Object h(KeystoreEntity keystoreEntity, vg.i iVar) throws Throwable {
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new r(keystoreEntity, this, null), iVar);
        return objE == ug.a.f29706a ? objE : pg.f0.f21461a;
    }
}
