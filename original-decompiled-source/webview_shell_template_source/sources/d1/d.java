package d1;

import android.view.View;
import androidx.fragment.app.p;
import d1.a;
import d1.d;
import java.util.ArrayList;
import u4.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d<T extends d<T>> implements a.b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f12679k = new b();

    /* renamed from: l, reason: collision with root package name */
    public static final c f12680l = new c();

    /* renamed from: m, reason: collision with root package name */
    public static final C0044d f12681m = new C0044d();

    /* renamed from: n, reason: collision with root package name */
    public static final e f12682n = new e();

    /* renamed from: o, reason: collision with root package name */
    public static final f f12683o = new f();

    /* renamed from: p, reason: collision with root package name */
    public static final a f12684p = new a();

    /* renamed from: c, reason: collision with root package name */
    public final o f12687c;

    /* renamed from: d, reason: collision with root package name */
    public final p f12688d;
    public final float h;

    /* renamed from: a, reason: collision with root package name */
    public float f12685a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f12686b = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12689e = false;

    /* renamed from: f, reason: collision with root package name */
    public final float f12690f = -3.4028235E38f;

    /* renamed from: g, reason: collision with root package name */
    public long f12691g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<h> f12692i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<i> f12693j = new ArrayList<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getAlpha();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setAlpha(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getScaleX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setScaleX(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getScaleY();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setScaleY(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: d1.d$d, reason: collision with other inner class name */
    public class C0044d extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getRotation();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setRotation(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getRotationX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setRotationX(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f extends j {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final float c(o oVar) {
            return ((View) oVar).getRotationY();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.p
        public final void h(o oVar, float f6) {
            ((View) oVar).setRotationY(f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public float f12694a;

        /* renamed from: b, reason: collision with root package name */
        public float f12695b;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface h {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface i {
        void a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class j extends p {
    }

    public d(o oVar, p pVar) {
        this.f12687c = oVar;
        this.f12688d = pVar;
        if (pVar == f12681m || pVar == f12682n || pVar == f12683o) {
            this.h = 0.1f;
            return;
        }
        if (pVar == f12684p) {
            this.h = 0.00390625f;
        } else if (pVar == f12679k || pVar == f12680l) {
            this.h = 0.002f;
        } else {
            this.h = 1.0f;
        }
    }

    public static d1.a b() {
        ThreadLocal<d1.a> threadLocal = d1.a.f12665i;
        if (threadLocal.get() == null) {
            threadLocal.set(new d1.a(new a.d()));
        }
        return threadLocal.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    @Override // d1.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j6) {
        boolean z6;
        ArrayList<h> arrayList;
        long j7 = this.f12691g;
        int i6 = 0;
        if (j7 == 0) {
            this.f12691g = j6;
            c(this.f12686b);
            return false;
        }
        long j8 = j6 - j7;
        this.f12691g = j6;
        float f6 = b().f12672g;
        long j9 = f6 == 0.0f ? 2147483647L : (long) (j8 / f6);
        d1.e eVar = (d1.e) this;
        if (eVar.s) {
            float f7 = eVar.f12697r;
            if (f7 != Float.MAX_VALUE) {
                eVar.f12696q.f12705i = f7;
                eVar.f12697r = Float.MAX_VALUE;
            }
            eVar.f12686b = (float) eVar.f12696q.f12705i;
            eVar.f12685a = 0.0f;
            eVar.s = false;
        } else {
            if (eVar.f12697r != Float.MAX_VALUE) {
                long j10 = j9 / 2;
                g gVarA = eVar.f12696q.a(eVar.f12686b, eVar.f12685a, j10);
                d1.f fVar = eVar.f12696q;
                fVar.f12705i = eVar.f12697r;
                eVar.f12697r = Float.MAX_VALUE;
                g gVarA2 = fVar.a(gVarA.f12694a, gVarA.f12695b, j10);
                eVar.f12686b = gVarA2.f12694a;
                eVar.f12685a = gVarA2.f12695b;
            } else {
                g gVarA3 = eVar.f12696q.a(eVar.f12686b, eVar.f12685a, j9);
                eVar.f12686b = gVarA3.f12694a;
                eVar.f12685a = gVarA3.f12695b;
            }
            float fMax = Math.max(eVar.f12686b, eVar.f12690f);
            eVar.f12686b = fMax;
            eVar.f12686b = Math.min(fMax, Float.MAX_VALUE);
            float f8 = eVar.f12685a;
            d1.f fVar2 = eVar.f12696q;
            fVar2.getClass();
            if (Math.abs(f8) >= fVar2.f12702e || Math.abs(r3 - ((float) fVar2.f12705i)) >= fVar2.f12701d) {
                z6 = false;
                float fMin = Math.min(this.f12686b, Float.MAX_VALUE);
                this.f12686b = fMin;
                float fMax2 = Math.max(fMin, this.f12690f);
                this.f12686b = fMax2;
                c(fMax2);
                if (z6) {
                    this.f12689e = false;
                    d1.a aVarB = b();
                    aVarB.f12666a.remove(this);
                    ArrayList<a.b> arrayList2 = aVarB.f12667b;
                    int iIndexOf = arrayList2.indexOf(this);
                    if (iIndexOf >= 0) {
                        arrayList2.set(iIndexOf, null);
                        aVarB.f12671f = true;
                    }
                    this.f12691g = 0L;
                    while (true) {
                        arrayList = this.f12692i;
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        if (arrayList.get(i6) != null) {
                            arrayList.get(i6).a();
                        }
                        i6++;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return z6;
            }
            eVar.f12686b = (float) eVar.f12696q.f12705i;
            eVar.f12685a = 0.0f;
        }
        z6 = true;
        float fMin2 = Math.min(this.f12686b, Float.MAX_VALUE);
        this.f12686b = fMin2;
        float fMax22 = Math.max(fMin2, this.f12690f);
        this.f12686b = fMax22;
        c(fMax22);
        if (z6) {
        }
        return z6;
    }

    public final void c(float f6) {
        ArrayList<i> arrayList;
        this.f12688d.h(this.f12687c, f6);
        int i6 = 0;
        while (true) {
            arrayList = this.f12693j;
            if (i6 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i6) != null) {
                arrayList.get(i6).a();
            }
            i6++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
