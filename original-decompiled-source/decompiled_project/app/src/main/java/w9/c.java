package w9;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import m0.r;
import r9.h;
import r9.j;
import r9.n;
import r9.u;
import s9.l;
import x9.w;
import z9.b;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f31465f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final w f31466a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31467b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.e f31468c;

    /* renamed from: d, reason: collision with root package name */
    public final y9.d f31469d;

    /* renamed from: e, reason: collision with root package name */
    public final z9.b f31470e;

    public c(Executor executor, s9.e eVar, w wVar, y9.d dVar, z9.b bVar) {
        this.f31467b = executor;
        this.f31468c = eVar;
        this.f31466a = wVar;
        this.f31469d = dVar;
        this.f31470e = bVar;
    }

    @Override // w9.e
    public final void a(final j jVar, final h hVar, final r rVar) {
        this.f31467b.execute(new Runnable(jVar, rVar, hVar) { // from class: w9.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f31460b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f31461c;

            {
                this.f31461c = hVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final c cVar = this.f31459a;
                final j jVar2 = this.f31460b;
                String str = jVar2.f23291a;
                h hVar2 = this.f31461c;
                Logger logger = c.f31465f;
                try {
                    l lVar = cVar.f31468c.get(str);
                    if (lVar != null) {
                        final h hVarB = lVar.b(hVar2);
                        cVar.f31470e.p(new b.a() { // from class: w9.b
                            @Override // z9.b.a
                            public final Object f() {
                                n nVar = hVarB;
                                c cVar2 = cVar;
                                y9.d dVar = cVar2.f31469d;
                                j jVar3 = jVar2;
                                dVar.C0(jVar3, nVar);
                                cVar2.f31466a.b(jVar3, 1);
                                return null;
                            }
                        });
                        return;
                    }
                    String str2 = "Transport backend '" + str + "' is not registered";
                    logger.warning(str2);
                    new IllegalArgumentException(str2);
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                }
            }
        });
    }
}
