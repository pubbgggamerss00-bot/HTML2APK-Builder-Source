package n8;

import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$discoverPersistedKeystores$2", f = "KeystoreRepository.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends vg.i implements eh.p<ph.i0, tg.e<? super List<? extends KeystoreStorage.PersistedKeystore>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public List f18488a;

    /* renamed from: b, reason: collision with root package name */
    public int f18489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f18490c;

    public static final class a implements sh.f<Set<? extends String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.f f18491a;

        /* renamed from: n8.k$a$a, reason: collision with other inner class name */
        public static final class C0195a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sh.g f18492a;

            @vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$discoverPersistedKeystores$2$invokeSuspend$$inlined$map$1$2", f = "KeystoreRepository.kt", l = {50}, m = "emit")
            /* renamed from: n8.k$a$a$a, reason: collision with other inner class name */
            public static final class C0196a extends vg.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f18493a;

                /* renamed from: b, reason: collision with root package name */
                public int f18494b;

                public C0196a(tg.e eVar) {
                    super(eVar);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    this.f18493a = obj;
                    this.f18494b |= PKIFailureInfo.systemUnavail;
                    return C0195a.this.c(null, this);
                }
            }

            public C0195a(sh.g gVar) {
                this.f18492a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // sh.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, tg.e eVar) {
                C0196a c0196a;
                if (eVar instanceof C0196a) {
                    c0196a = (C0196a) eVar;
                    int i10 = c0196a.f18494b;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        c0196a.f18494b = i10 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0196a = new C0196a(eVar);
                    }
                }
                Object obj2 = c0196a.f18493a;
                ug.a aVar = ug.a.f29706a;
                int i11 = c0196a.f18494b;
                if (i11 == 0) {
                    pg.q.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        String publicUri = ((KeystoreEntity) it.next()).getPublicUri();
                        if (publicUri != null) {
                            arrayList.add(publicUri);
                        }
                    }
                    Set setH0 = qg.x.h0(arrayList);
                    c0196a.f18494b = 1;
                    if (this.f18492a.c(setH0, c0196a) == aVar) {
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

        public a(sh.f fVar) {
            this.f18491a = fVar;
        }

        @Override // sh.f
        public final Object b(sh.g<? super Set<? extends String>> gVar, tg.e eVar) {
            Object objB = this.f18491a.b(new C0195a(gVar), eVar);
            return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, tg.e<? super k> eVar) {
        super(2, eVar);
        this.f18490c = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new k(this.f18490c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super List<? extends KeystoreStorage.PersistedKeystore>> eVar) {
        return ((k) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        List<KeystoreStorage.PersistedKeystore> list;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18489b;
        if (i10 == 0) {
            pg.q.b(obj);
            KeystoreStorage keystoreStorage = KeystoreStorage.INSTANCE;
            l lVar = this.f18490c;
            List<KeystoreStorage.PersistedKeystore> listFindPersistedKeystores = keystoreStorage.findPersistedKeystores(lVar.f18503b);
            a aVar2 = new a(lVar.e());
            this.f18488a = listFindPersistedKeystores;
            this.f18489b = 1;
            Object objF = gg.a.f(aVar2, this);
            if (objF == aVar) {
                return aVar;
            }
            list = listFindPersistedKeystores;
            obj = objF;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f18488a;
            pg.q.b(obj);
        }
        Set set = (Set) obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!set.contains(((KeystoreStorage.PersistedKeystore) obj2).getUri().toString())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
