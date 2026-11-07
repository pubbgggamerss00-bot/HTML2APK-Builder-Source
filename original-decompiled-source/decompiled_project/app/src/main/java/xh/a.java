package xh;

import eh.q;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r;
import pg.f0;
import ph.t0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a extends p implements q<b, j<?>, Object, f0> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33572a = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // eh.q
    public final f0 b(b bVar, j<?> jVar, Object obj) {
        b bVar2 = bVar;
        j<?> jVar2 = jVar;
        long j10 = bVar2.f33573a;
        if (j10 <= 0) {
            jVar2.e(f0.f21461a);
        } else {
            androidx.credentials.playservices.controllers.identityauth.createpassword.a aVar = new androidx.credentials.playservices.controllers.identityauth.createpassword.a(1, jVar2, bVar2);
            r.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            h hVar = (h) jVar2;
            tg.h hVar2 = hVar.f33582a;
            hVar.f33584c = t0.c(hVar2).z(j10, aVar, hVar2);
        }
        return f0.f21461a;
    }
}
