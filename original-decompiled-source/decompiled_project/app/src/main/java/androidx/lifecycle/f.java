package androidx.lifecycle;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2273b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2274a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2274a = iArr;
        }
    }

    public f(e defaultLifecycleObserver, r rVar) {
        kotlin.jvm.internal.r.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2272a = defaultLifecycleObserver;
        this.f2273b = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        int i10 = a.f2274a[aVar.ordinal()];
        e eVar = this.f2272a;
        switch (i10) {
            case 1:
                eVar.getClass();
                break;
            case 2:
                eVar.N(tVar);
                break;
            case 3:
                eVar.h(tVar);
                break;
            case 4:
                eVar.getClass();
                break;
            case 5:
                eVar.z(tVar);
                break;
            case 6:
                eVar.M(tVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new pg.l();
        }
        r rVar = this.f2273b;
        if (rVar != null) {
            rVar.l(tVar, aVar);
        }
    }
}
