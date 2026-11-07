package o1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import d5.j;
import g5.d;
import i5.e;
import i5.g;
import p5.p;
import q1.h;
import q1.i;
import y5.i0;
import y5.o0;
import y5.x;
import y5.y;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: o1.a$a, reason: collision with other inner class name */
    public static final class C0081a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final h.a f13997a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: o1.a$a$a, reason: collision with other inner class name */
        public static final class C0082a extends g implements p<x, d<? super Integer>, Object> {

            /* renamed from: w, reason: collision with root package name */
            public int f13998w;

            public C0082a(d<? super C0082a> dVar) {
                super(dVar);
            }

            @Override // i5.a
            public final d a(d dVar, Object obj) {
                return C0081a.this.new C0082a(dVar);
            }

            @Override // p5.p
            public final Object b(x xVar, d<? super Integer> dVar) {
                return ((C0082a) a(dVar, xVar)).d(j.f12745a);
            }

            @Override // i5.a
            public final Object d(Object obj) throws Throwable {
                int i6 = this.f13998w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d5.e.b(obj);
                    return obj;
                }
                d5.e.b(obj);
                h.a aVar = C0081a.this.f13997a;
                this.f13998w = 1;
                Object objB = aVar.b(this);
                h5.a aVar2 = h5.a.s;
                return objB == aVar2 ? aVar2 : objB;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: o1.a$a$b */
        public static final class b extends g implements p<x, d<? super j>, Object> {

            /* renamed from: w, reason: collision with root package name */
            public int f14000w;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Uri f14002y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ InputEvent f14003z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Uri uri, InputEvent inputEvent, d<? super b> dVar) {
                super(dVar);
                this.f14002y = uri;
                this.f14003z = inputEvent;
            }

            @Override // i5.a
            public final d a(d dVar, Object obj) {
                return C0081a.this.new b(this.f14002y, this.f14003z, dVar);
            }

            @Override // p5.p
            public final Object b(x xVar, d<? super j> dVar) {
                return ((b) a(dVar, xVar)).d(j.f12745a);
            }

            @Override // i5.a
            public final Object d(Object obj) throws Throwable {
                int i6 = this.f14000w;
                if (i6 == 0) {
                    d5.e.b(obj);
                    h.a aVar = C0081a.this.f13997a;
                    this.f14000w = 1;
                    Object objC = aVar.c(this.f14002y, this.f14003z, this);
                    h5.a aVar2 = h5.a.s;
                    if (objC == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d5.e.b(obj);
                }
                return j.f12745a;
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: o1.a$a$c */
        public static final class c extends g implements p<x, d<? super j>, Object> {

            /* renamed from: w, reason: collision with root package name */
            public int f14004w;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Uri f14006y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, d<? super c> dVar) {
                super(dVar);
                this.f14006y = uri;
            }

            @Override // i5.a
            public final d a(d dVar, Object obj) {
                return C0081a.this.new c(this.f14006y, dVar);
            }

            @Override // p5.p
            public final Object b(x xVar, d<? super j> dVar) {
                return ((c) a(dVar, xVar)).d(j.f12745a);
            }

            @Override // i5.a
            public final Object d(Object obj) throws Throwable {
                int i6 = this.f14004w;
                if (i6 == 0) {
                    d5.e.b(obj);
                    h.a aVar = C0081a.this.f13997a;
                    this.f14004w = 1;
                    Object objD = aVar.d(this.f14006y, this);
                    h5.a aVar2 = h5.a.s;
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d5.e.b(obj);
                }
                return j.f12745a;
            }
        }

        public C0081a(h.a aVar) {
            this.f13997a = aVar;
        }

        public c5.a<j> b(q1.a aVar) {
            kotlin.jvm.internal.j.e("deletionRequest", aVar);
            throw null;
        }

        public c5.a<Integer> c() {
            return n1.b.a(o0.a(y.a(i0.f15349a), new C0082a(null)));
        }

        public c5.a<j> d(Uri uri, InputEvent inputEvent) {
            kotlin.jvm.internal.j.e("attributionSource", uri);
            return n1.b.a(o0.a(y.a(i0.f15349a), new b(uri, inputEvent, null)));
        }

        public c5.a<j> e(Uri uri) {
            kotlin.jvm.internal.j.e("trigger", uri);
            return n1.b.a(o0.a(y.a(i0.f15349a), new c(uri, null)));
        }

        public c5.a<j> f(i iVar) {
            kotlin.jvm.internal.j.e("request", iVar);
            throw null;
        }

        public c5.a<j> g(q1.j jVar) {
            kotlin.jvm.internal.j.e("request", jVar);
            throw null;
        }
    }

    public static final C0081a a(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i6 = Build.VERSION.SDK_INT;
        m1.a aVar = m1.a.f13879a;
        sb.append(i6 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        h.a aVar2 = (i6 >= 30 ? aVar.a() : 0) >= 5 ? new h.a(context) : null;
        if (aVar2 != null) {
            return new C0081a(aVar2);
        }
        return null;
    }
}
