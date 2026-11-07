package u0;

import com.yalantis.ucrop.view.CropImageView;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import s.m2;
import x.o;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m2<f3.h> f29005a;

    /* renamed from: b, reason: collision with root package name */
    public static final m2<f3.h> f29006b;

    /* renamed from: c, reason: collision with root package name */
    public static final m2<f3.h> f29007c;

    static {
        s.w wVar = new s.w(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 0.6f, 1.0f);
        f29005a = new m2<>(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, s.d0.f23703a, 2);
        f29006b = new m2<>(150, wVar, 2);
        f29007c = new m2<>(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, wVar, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 s.m2<f3.h>) = 
      (r1v0 s.m2<f3.h>)
      (r1v0 s.m2<f3.h>)
      (r1v0 s.m2<f3.h>)
      (r1v4 s.m2<f3.h>)
      (r1v4 s.m2<f3.h>)
      (r1v4 s.m2<f3.h>)
      (r1v4 s.m2<f3.h>)
     binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s.b bVar, float f10, x.k kVar, x.k kVar2, vg.c cVar) {
        m2<f3.h> m2Var;
        m2<f3.h> m2Var2 = null;
        if (kVar2 != null) {
            boolean z10 = kVar2 instanceof o.b;
            m2Var = f29005a;
            if (z10 || (kVar2 instanceof x.b) || (kVar2 instanceof x.i) || (kVar2 instanceof x.e)) {
                m2Var2 = m2Var;
            }
        } else if (kVar != null) {
            boolean z11 = kVar instanceof o.b;
            m2Var = f29006b;
            if (!z11 && !(kVar instanceof x.b)) {
                if (kVar instanceof x.i) {
                    m2Var2 = f29007c;
                } else if (kVar instanceof x.e) {
                }
            }
        }
        m2<f3.h> m2Var3 = m2Var2;
        if (m2Var3 != null) {
            Object objC = s.b.c(bVar, new f3.h(f10), m2Var3, null, cVar, 12);
            return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
        }
        Object objF = bVar.f(new f3.h(f10), cVar);
        return objF == ug.a.f29706a ? objF : pg.f0.f21461a;
    }
}
