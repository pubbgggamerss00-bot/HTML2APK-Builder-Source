package q1;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.camera.camera2.internal.compat.r;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class h {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final MeasurementManager f14104a;

        public a(Context context) {
            Object systemService = context.getSystemService((Class<Object>) c.b());
            kotlin.jvm.internal.j.d("context.getSystemService…:class.java\n            )", systemService);
            this.f14104a = r.a(systemService);
        }

        public Object a(q1.a aVar, g5.d<? super d5.j> dVar) {
            new y5.f(a1.a.f(dVar)).m();
            e.c();
            throw null;
        }

        public Object b(g5.d<? super Integer> dVar) {
            y5.f fVar = new y5.f(a1.a.f(dVar));
            fVar.m();
            this.f14104a.getMeasurementApiStatus(new g(), new q0.d(fVar));
            return fVar.l();
        }

        public Object c(Uri uri, InputEvent inputEvent, g5.d<? super d5.j> dVar) {
            y5.f fVar = new y5.f(a1.a.f(dVar));
            fVar.m();
            this.f14104a.registerSource(uri, inputEvent, new g(), new q0.d(fVar));
            Object objL = fVar.l();
            return objL == h5.a.s ? objL : d5.j.f12745a;
        }

        public Object d(Uri uri, g5.d<? super d5.j> dVar) {
            y5.f fVar = new y5.f(a1.a.f(dVar));
            fVar.m();
            this.f14104a.registerTrigger(uri, new g(), new q0.d(fVar));
            Object objL = fVar.l();
            return objL == h5.a.s ? objL : d5.j.f12745a;
        }

        public Object e(i iVar, g5.d<? super d5.j> dVar) {
            new y5.f(a1.a.f(dVar)).m();
            f.c();
            throw null;
        }

        public Object f(j jVar, g5.d<? super d5.j> dVar) {
            new y5.f(a1.a.f(dVar)).m();
            b.b();
            throw null;
        }
    }
}
