package q8;

import android.os.SystemClock;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x8.w2;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final ph.i0 f22428a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f22429b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f22430c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.u1 f22431d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.u1 f22432e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.u1 f22433f;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f22434g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f22435h;

    /* renamed from: i, reason: collision with root package name */
    public long f22436i;

    /* renamed from: j, reason: collision with root package name */
    public final a f22437j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f22438k;

    public w0(ph.i0 scope) {
        kotlin.jvm.internal.r.e(scope, "scope");
        this.f22428a = scope;
        this.f22429b = bg.b.h(null);
        this.f22430c = bg.b.h(new q1.b1(q1.b1.f21654h));
        this.f22431d = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f22432e = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f22433f = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f22434g = bg.b.h(null);
        this.f22437j = new a();
        this.f22438k = bg.b.h(null);
    }

    public final boolean a(String fromId, String toId) {
        kotlin.jvm.internal.r.e(fromId, "fromId");
        kotlin.jvm.internal.r.e(toId, "toId");
        f0 f0Var = this.f22435h;
        if (f0Var == null || !kotlin.jvm.internal.r.a(f0Var.f22197a, fromId) || SystemClock.uptimeMillis() - this.f22436i >= 1000) {
            f0Var = null;
        }
        if (f0Var != null) {
            return true;
        }
        f0 f0Var2 = (f0) this.f22437j.get(toId);
        return kotlin.jvm.internal.r.a(f0Var2 != null ? f0Var2.f22197a : null, fromId);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[PHI: r14
      0x0048: PHI (r14v15 q8.w0) = (r14v14 q8.w0), (r14v29 q8.w0) binds: [B:37:0x00f1, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[PHI: r14
      0x00db: PHI (r14v14 q8.w0) = (r14v11 q8.w0), (r14v28 q8.w0) binds: [B:34:0x00d8, B:23:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p1.e eVar, long j10, float f10, boolean z10, String str, w2.a aVar, vg.c cVar) throws Throwable {
        v0 v0Var;
        w2.a aVar2;
        w0 w0Var;
        w0 w0Var2;
        w2.a aVar3;
        r0 r0Var;
        p8.d dVar;
        final w0 w0Var3;
        w0 w0Var4;
        s.m2 m2VarD;
        eh.p pVar;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i10 = v0Var.f22420e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                v0Var.f22420e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                v0Var = new v0(this, cVar);
            }
        }
        Object obj = v0Var.f22418c;
        ug.a aVar4 = ug.a.f29706a;
        int i11 = v0Var.f22420e;
        if (i11 == 0) {
            pg.q.b(obj);
            this.f22434g.setValue(str);
            this.f22429b.setValue(eVar);
            this.f22430c.setValue(new q1.b1(j10));
            this.f22431d.e(f10);
            this.f22433f.e(1.0f);
            x0.u1 u1Var = this.f22432e;
            if (!z10) {
                u1Var.e(CropImageView.DEFAULT_ASPECT_RATIO);
                s.m2 m2VarD2 = s.m.d(380, 0, s.d0.f23703a, 2);
                eh.p pVar2 = new eh.p() { // from class: q8.q0
                    @Override // eh.p
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        this.f22365a.f22432e.e(fFloatValue);
                        return pg.f0.f21461a;
                    }
                };
                v0Var.f22416a = this;
                v0Var.f22417b = aVar;
                v0Var.f22420e = 1;
                if (s.w1.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, m2VarD2, pVar2, v0Var, 4) != aVar4) {
                    aVar2 = aVar;
                    w0Var = this;
                }
                return aVar4;
            }
            u1Var.e(1.0f);
            w0Var2 = this;
            aVar3 = aVar;
            aVar3.invoke();
            r0Var = new r0();
            v0Var.f22416a = w0Var2;
            v0Var.f22417b = null;
            v0Var.f22420e = 2;
            if (x0.f1.a(v0Var.getContext()).f0(r0Var, v0Var) != aVar4) {
                dVar = new p8.d(1);
                v0Var.f22416a = w0Var2;
                v0Var.f22420e = 3;
                if (x0.f1.a(v0Var.getContext()).f0(dVar, v0Var) != aVar4) {
                }
            }
            return aVar4;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                w0Var2 = v0Var.f22416a;
                pg.q.b(obj);
                dVar = new p8.d(1);
                v0Var.f22416a = w0Var2;
                v0Var.f22420e = 3;
                if (x0.f1.a(v0Var.getContext()).f0(dVar, v0Var) != aVar4) {
                    w0Var3 = w0Var2;
                    m2VarD = s.m.d(220, 0, null, 6);
                    pVar = new eh.p() { // from class: q8.s0
                        @Override // eh.p
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            this.f22380a.f22433f.e(fFloatValue);
                            return pg.f0.f21461a;
                        }
                    };
                    v0Var.f22416a = w0Var3;
                    v0Var.f22420e = 4;
                    if (s.w1.c(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, m2VarD, pVar, v0Var, 4) != aVar4) {
                    }
                }
                return aVar4;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var4 = v0Var.f22416a;
                try {
                    pg.q.b(obj);
                    w0Var4.f22433f.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22432e.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22434g.setValue(null);
                    return pg.f0.f21461a;
                } catch (Throwable th2) {
                    th = th2;
                    w0Var4.f22433f.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22432e.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22434g.setValue(null);
                    throw th;
                }
            }
            w0Var2 = v0Var.f22416a;
            pg.q.b(obj);
            w0Var3 = w0Var2;
            try {
                m2VarD = s.m.d(220, 0, null, 6);
                pVar = new eh.p() { // from class: q8.s0
                    @Override // eh.p
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        this.f22380a.f22433f.e(fFloatValue);
                        return pg.f0.f21461a;
                    }
                };
                v0Var.f22416a = w0Var3;
                v0Var.f22420e = 4;
                if (s.w1.c(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, m2VarD, pVar, v0Var, 4) != aVar4) {
                    w0Var4 = w0Var3;
                    w0Var4.f22433f.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22432e.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0Var4.f22434g.setValue(null);
                    return pg.f0.f21461a;
                }
                return aVar4;
            } catch (Throwable th3) {
                th = th3;
                w0Var4 = w0Var3;
                w0Var4.f22433f.e(CropImageView.DEFAULT_ASPECT_RATIO);
                w0Var4.f22432e.e(CropImageView.DEFAULT_ASPECT_RATIO);
                w0Var4.f22434g.setValue(null);
                throw th;
            }
        }
        aVar2 = v0Var.f22417b;
        w0Var = v0Var.f22416a;
        pg.q.b(obj);
        aVar3 = aVar2;
        w0Var2 = w0Var;
        aVar3.invoke();
        r0Var = new r0();
        v0Var.f22416a = w0Var2;
        v0Var.f22417b = null;
        v0Var.f22420e = 2;
        if (x0.f1.a(v0Var.getContext()).f0(r0Var, v0Var) != aVar4) {
        }
        return aVar4;
    }

    public final boolean c(String fromId, String toId) {
        kotlin.jvm.internal.r.e(fromId, "fromId");
        kotlin.jvm.internal.r.e(toId, "toId");
        f0 f0Var = (f0) this.f22437j.get(fromId);
        boolean zA = kotlin.jvm.internal.r.a(f0Var != null ? f0Var.f22197a : null, toId);
        if (!zA) {
            fromId = null;
        }
        this.f22438k.setValue(fromId);
        return zA;
    }

    public static final class a extends LinkedHashMap<String, f0> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof f0) {
                return super.containsValue((f0) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return (f0) super.get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (f0) super.getOrDefault((String) obj, (f0) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return (f0) super.remove((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, f0> entry) {
            return super.size() > 32;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof f0)) {
                return super.remove((String) obj, (f0) obj2);
            }
            return false;
        }
    }
}
