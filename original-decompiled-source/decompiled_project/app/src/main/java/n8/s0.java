package n8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s0 implements sh.f<List<? extends Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh.f f18584a;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.g f18585a;

        @vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$special$$inlined$map$1$2", f = "SettingsRepository.kt", l = {50}, m = "emit")
        /* renamed from: n8.s0$a$a, reason: collision with other inner class name */
        public static final class C0200a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f18586a;

            /* renamed from: b, reason: collision with root package name */
            public int f18587b;

            public C0200a(tg.e eVar) {
                super(eVar);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f18586a = obj;
                this.f18587b |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        public a(sh.g gVar) {
            this.f18585a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sh.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Object obj, tg.e eVar) {
            C0200a c0200a;
            if (eVar instanceof C0200a) {
                c0200a = (C0200a) eVar;
                int i10 = c0200a.f18587b;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0200a.f18587b = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0200a = new C0200a(eVar);
                }
            }
            Object obj2 = c0200a.f18586a;
            ug.a aVar = ug.a.f29706a;
            int i11 = c0200a.f18587b;
            if (i11 == 0) {
                pg.q.b(obj2);
                String str = (String) ((v4.e) obj).b(m1.f18520v);
                if (str == null) {
                    str = "";
                }
                List listP = mh.x.P(str, new char[]{','});
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listP.iterator();
                while (it.hasNext()) {
                    Long lH = mh.s.h((String) it.next());
                    if (lH != null) {
                        arrayList.add(lH);
                    }
                }
                List listX = qg.x.x(arrayList);
                c0200a.f18587b = 1;
                if (this.f18585a.c(listX, c0200a) == aVar) {
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

    public s0(sh.f fVar) {
        this.f18584a = fVar;
    }

    @Override // sh.f
    public final Object b(sh.g<? super List<? extends Long>> gVar, tg.e eVar) {
        Object objB = this.f18584a.b(new a(gVar), eVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
