package p1;

import android.content.Context;
import android.os.Build;
import androidx.camera.camera2.internal.compat.r;
import c6.c;
import d5.j;
import g5.d;
import i5.e;
import i5.g;
import p5.p;
import r1.b;
import r1.f;
import y5.i0;
import y5.o0;
import y5.x;
import y5.y;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: p1.a$a, reason: collision with other inner class name */
    public static final class C0084a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final f f14059a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @e(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: p1.a$a$a, reason: collision with other inner class name */
        public static final class C0085a extends g implements p<x, d<? super b>, Object> {

            /* renamed from: w, reason: collision with root package name */
            public int f14060w;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r1.a f14062y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0085a(r1.a aVar, d<? super C0085a> dVar) {
                super(dVar);
                this.f14062y = aVar;
            }

            @Override // i5.a
            public final d a(d dVar, Object obj) {
                return C0084a.this.new C0085a(this.f14062y, dVar);
            }

            @Override // p5.p
            public final Object b(x xVar, d<? super b> dVar) {
                return ((C0085a) a(dVar, xVar)).d(j.f12745a);
            }

            @Override // i5.a
            public final Object d(Object obj) throws Throwable {
                int i6 = this.f14060w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d5.e.b(obj);
                    return obj;
                }
                d5.e.b(obj);
                f fVar = C0084a.this.f14059a;
                this.f14060w = 1;
                Object objJ = fVar.j(this.f14062y, this);
                h5.a aVar = h5.a.s;
                return objJ == aVar ? aVar : objJ;
            }
        }

        public C0084a(f fVar) {
            this.f14059a = fVar;
        }

        public c5.a<b> b(r1.a aVar) {
            kotlin.jvm.internal.j.e("request", aVar);
            c cVar = i0.f15349a;
            return n1.b.a(o0.a(y.a(b6.p.f2047a), new C0085a(aVar, null)));
        }
    }

    public static final C0084a a(Context context) {
        f dVar;
        int i6 = Build.VERSION.SDK_INT;
        m1.a aVar = m1.a.f13879a;
        if ((i6 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) r.c());
            kotlin.jvm.internal.j.d("context.getSystemService…opicsManager::class.java)", systemService);
            dVar = new r1.e(androidx.camera.camera2.internal.compat.params.a.c(systemService));
        } else {
            if ((i6 >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) r.c());
                kotlin.jvm.internal.j.d("context.getSystemService…opicsManager::class.java)", systemService2);
                dVar = new r1.d(androidx.camera.camera2.internal.compat.params.a.c(systemService2));
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new C0084a(dVar);
        }
        return null;
    }
}
