package y6;

import a7.p;
import android.content.Context;
import android.net.ConnectivityManager;
import eh.q;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import qg.o;
import y6.b;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33987a;

    public final class a extends s implements eh.l<z6.e, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33988a = new a(1);

        @Override // eh.l
        public final CharSequence invoke(z6.e eVar) {
            z6.e it = eVar;
            r.e(it, "it");
            return it.getClass().getSimpleName();
        }
    }

    public final class b implements sh.f<y6.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sh.f[] f33989a;

        public static final class a extends s implements eh.a<y6.b[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sh.f[] f33990a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sh.f[] fVarArr) {
                super(0);
                this.f33990a = fVarArr;
            }

            @Override // eh.a
            public final y6.b[] invoke() {
                return new y6.b[this.f33990a.length];
            }
        }

        @vg.e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
        /* renamed from: y6.l$b$b, reason: collision with other inner class name */
        public static final class C0346b extends vg.i implements q<sh.g<? super y6.b>, y6.b[], tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f33991a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ sh.g f33992b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f33993c;

            @Override // eh.q
            public final Object b(sh.g<? super y6.b> gVar, y6.b[] bVarArr, tg.e<? super f0> eVar) {
                C0346b c0346b = new C0346b(3, eVar);
                c0346b.f33992b = gVar;
                c0346b.f33993c = bVarArr;
                return c0346b.invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                y6.b bVar;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f33991a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    sh.g gVar = this.f33992b;
                    y6.b[] bVarArr = (y6.b[]) this.f33993c;
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!r.a(bVar, b.a.f33959a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f33959a;
                    }
                    this.f33991a = 1;
                    if (gVar.c(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                return f0.f21461a;
            }
        }

        public b(sh.f[] fVarArr) {
            this.f33989a = fVarArr;
        }

        @Override // sh.f
        public final Object b(sh.g<? super y6.b> gVar, tg.e eVar) {
            sh.f[] fVarArr = this.f33989a;
            Object objA = th.n.a(new a(fVarArr), new C0346b(3, null), gVar, eVar, fVarArr);
            return objA == ug.a.f29706a ? objA : f0.f21461a;
        }
    }

    public l(p trackers) {
        r.e(trackers, "trackers");
        z6.c cVar = new z6.c(trackers.f99b);
        z6.d dVar = new z6.d(trackers.f100c);
        z6.j jVar = new z6.j(trackers.f102e);
        a7.i<g> iVar = trackers.f101d;
        z6.f fVar = new z6.f(iVar);
        z6.i iVar2 = new z6.i(iVar);
        z6.h hVar = new z6.h(iVar);
        z6.g gVar = new z6.g(iVar);
        Context context = trackers.f98a;
        String str = n.f34000a;
        r.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        r.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f33987a = o.s(new z6.e[]{cVar, dVar, jVar, fVar, iVar2, hVar, gVar, new f((ConnectivityManager) systemService)});
    }
}
