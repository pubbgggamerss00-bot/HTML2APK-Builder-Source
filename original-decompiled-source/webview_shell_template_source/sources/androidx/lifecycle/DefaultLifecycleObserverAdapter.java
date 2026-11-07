package androidx.lifecycle;

import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements k {
    public final c s;

    /* renamed from: t, reason: collision with root package name */
    public final k f1261t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1262a;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1262a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(c cVar, k kVar) {
        this.s = cVar;
        this.f1261t = kVar;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) {
        int i6 = a.f1262a[aVar.ordinal()];
        c cVar = this.s;
        switch (i6) {
            case 2:
                cVar.onStart(mVar);
                break;
            case 3:
                cVar.onResume(mVar);
                break;
            case 4:
                cVar.onPause(mVar);
                break;
            case 5:
                cVar.onStop(mVar);
                break;
            case 6:
                cVar.onDestroy(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.f1261t;
        if (kVar != null) {
            kVar.a(mVar, aVar);
        }
    }
}
