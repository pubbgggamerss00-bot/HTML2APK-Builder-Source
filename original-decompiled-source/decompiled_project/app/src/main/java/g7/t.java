package g7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import b8.t;
import g7.f;
import g7.h;
import g7.j;
import j7.c;
import j7.v;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import l7.a;
import l7.b;
import l7.c;
import l7.d;
import l7.g;
import l7.h;
import l7.i;
import l7.l;
import l7.n;
import l7.o;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.j0;
import ph.s1;
import ph.v1;
import tg.h;
import w7.f;

/* loaded from: classes.dex */
public final class t implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11524f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f11525a;

    /* renamed from: b, reason: collision with root package name */
    public final uh.c f11526b = j0.a(h.a.C0291a.c(ah.l.a(), new a0(CoroutineExceptionHandler.a.f16343a)));

    /* renamed from: c, reason: collision with root package name */
    public final w7.a f11527c;

    /* renamed from: d, reason: collision with root package name */
    public final f f11528d;

    /* renamed from: e, reason: collision with root package name */
    public volatile /* synthetic */ int f11529e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11530a;

        /* renamed from: b, reason: collision with root package name */
        public final f.b f11531b;

        /* renamed from: c, reason: collision with root package name */
        public final pg.s f11532c;

        /* renamed from: d, reason: collision with root package name */
        public final pg.s f11533d;

        /* renamed from: e, reason: collision with root package name */
        public final f f11534e;

        public a(Context context, f.b bVar, pg.s sVar, pg.s sVar2, f fVar) {
            this.f11530a = context;
            this.f11531b = bVar;
            this.f11532c = sVar;
            this.f11533d = sVar2;
            this.f11534e = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!kotlin.jvm.internal.r.a(this.f11530a, aVar.f11530a) || !this.f11531b.equals(aVar.f11531b) || !this.f11532c.equals(aVar.f11532c) || !this.f11533d.equals(aVar.f11533d)) {
                return false;
            }
            Object obj2 = h.b.f11503a;
            return obj2.equals(obj2) && this.f11534e.equals(aVar.f11534e);
        }

        public final int hashCode() {
            return (this.f11534e.hashCode() + ((h.b.f11503a.hashCode() + ((this.f11533d.hashCode() + ((this.f11532c.hashCode() + ((this.f11531b.hashCode() + (this.f11530a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        }

        public final String toString() {
            return "Options(application=" + this.f11530a + ", defaults=" + this.f11531b + ", memoryCacheLazy=" + this.f11532c + ", diskCacheLazy=" + this.f11533d + ", eventListenerFactory=" + h.b.f11503a + ", componentRegistry=" + this.f11534e + ", logger=null)";
        }
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(t.class, "e");
    }

    public t(a aVar) {
        this.f11525a = aVar;
        b8.a aVar2 = new b8.a(this);
        w7.a aVar3 = new w7.a(this, aVar2);
        this.f11527c = aVar3;
        f.a aVar4 = new f.a(aVar.f11534e);
        f.b bVar = aVar.f11531b;
        Object obj = bVar.f31377n.f11510a.get(q.f11520a);
        boolean zBooleanValue = ((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue();
        ArrayList arrayList = aVar4.f11498e;
        if (zBooleanValue) {
            aVar4.f11497d.add(new y());
            arrayList.add(new z());
        }
        aVar4.b(new q7.a(), kotlin.jvm.internal.h0.a(Uri.class));
        aVar4.b(new q7.e(), kotlin.jvm.internal.h0.a(Integer.class));
        pg.n nVar = new pg.n(new p7.a(), kotlin.jvm.internal.h0.a(h0.class));
        ArrayList arrayList2 = aVar4.f11496c;
        arrayList2.add(nVar);
        aVar4.a(new a.C0167a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.a(new g.a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.a(new o.a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.a(new i.a(), kotlin.jvm.internal.h0.a(Drawable.class));
        aVar4.a(new b.a(), kotlin.jvm.internal.h0.a(Bitmap.class));
        j.b<Integer> bVar2 = r.f11521a;
        Object obj2 = bVar.f31377n.f11510a.get(r.f11521a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i10 = yh.j.f34421a;
        yh.i iVar = new yh.i(iIntValue);
        int i11 = Build.VERSION.SDK_INT;
        Object obj3 = j7.n.f15232a;
        if (i11 >= 29) {
            Object obj4 = bVar.f31377n.f11510a.get(r.f11523c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = bVar.f31377n.f11510a.get(r.f11522b);
                j7.n nVar2 = (j7.n) (obj5 == null ? obj3 : obj5);
                if (nVar2.equals(obj3) || nVar2.equals(j7.n.f15233b)) {
                    arrayList.add(new e(new v.a(iVar)));
                }
            }
        }
        Object obj6 = bVar.f31377n.f11510a.get(r.f11522b);
        arrayList.add(new e(new c.b(iVar, (j7.n) (obj6 != null ? obj6 : obj3))));
        aVar4.b(new q7.b(), kotlin.jvm.internal.h0.a(File.class));
        aVar4.a(new n.a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.a(new d.a(), kotlin.jvm.internal.h0.a(ByteBuffer.class));
        aVar4.b(new q7.f(), kotlin.jvm.internal.h0.a(String.class));
        aVar4.b(new q7.d(), kotlin.jvm.internal.h0.a(hi.b0.class));
        arrayList2.add(new pg.n(new p7.b(), kotlin.jvm.internal.h0.a(h0.class)));
        arrayList2.add(new pg.n(new p7.d(), kotlin.jvm.internal.h0.a(h0.class)));
        aVar4.a(new l.a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.a(new c.a(), kotlin.jvm.internal.h0.a(byte[].class));
        aVar4.a(new h.a(), kotlin.jvm.internal.h0.a(h0.class));
        aVar4.f11494a.add(new o7.a(this, aVar2, aVar3));
        this.f11528d = aVar4.c();
    }

    @Override // g7.p
    public final Object a(w7.f fVar, vg.c cVar) {
        return ((fVar.f31330c instanceof y7.b) || (fVar.f31342o instanceof x7.l) || ((androidx.lifecycle.l) k.a(fVar, w7.h.f31395e)) != null) ? j0.c(new v(this, null, fVar), cVar) : b(fVar, 1, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01af, code lost:
    
        if (r5.c(r0) == r8) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01be A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x021a, B:136:0x0220, B:140:0x023c, B:139:0x022f, B:141:0x0240, B:143:0x0244, B:146:0x0250, B:147:0x0255, B:27:0x006f, B:118:0x01b7, B:120:0x01be, B:122:0x01c8, B:123:0x01d2, B:124:0x01d5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0220 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x021a, B:136:0x0220, B:140:0x023c, B:139:0x022f, B:141:0x0240, B:143:0x0244, B:146:0x0250, B:147:0x0255, B:27:0x006f, B:118:0x01b7, B:120:0x01be, B:122:0x01c8, B:123:0x01d2, B:124:0x01d5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x021a, B:136:0x0220, B:140:0x023c, B:139:0x022f, B:141:0x0240, B:143:0x0244, B:146:0x0250, B:147:0x0255, B:27:0x006f, B:118:0x01b7, B:120:0x01be, B:122:0x01c8, B:123:0x01d2, B:124:0x01d5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026a A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #3 {all -> 0x0277, blocks: (B:154:0x0266, B:156:0x026a, B:161:0x0279, B:162:0x0281), top: B:170:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0279 A[Catch: all -> 0x0277, TRY_ENTER, TryCatch #3 {all -> 0x0277, blocks: (B:154:0x0266, B:156:0x026a, B:161:0x0279, B:162:0x0281), top: B:170:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [g7.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [g7.h, g7.h$a] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [g7.h] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [w7.n] */
    /* JADX WARN: Type inference failed for: r5v4, types: [w7.n] */
    /* JADX WARN: Type inference failed for: r5v8, types: [w7.n] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [g7.t] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(w7.f fVar, int i10, vg.c cVar) {
        w wVar;
        ?? r62;
        ?? r52;
        w7.n jVar;
        t tVar;
        x7.c cVar2;
        x7.f fVar2;
        ImageView.ScaleType scaleType;
        w7.n nVar;
        h hVar;
        y7.a aVar;
        h hVar2;
        w7.f fVar3;
        t tVar2;
        l lVar;
        w7.f fVar4;
        t tVar3;
        w7.n nVar2;
        h hVar3;
        w7.i iVar;
        w7.f fVarA = fVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.f11552h;
            r52 = -2147483648;
            r62 = i11 & PKIFailureInfo.systemUnavail;
            if (r62 != 0) {
                wVar.f11552h = i11 - PKIFailureInfo.systemUnavail;
            } else {
                wVar = new w(this, cVar);
            }
        }
        w wVar2 = wVar;
        Object objB = wVar2.f11550f;
        ug.a aVar2 = ug.a.f29706a;
        ?? r32 = wVar2.f11552h;
        try {
            if (r32 == 0) {
                pg.q.b(objB);
                s1 s1VarF = v1.f(wVar2.getContext());
                boolean z10 = i10 == 0;
                w7.a aVar3 = this.f11527c;
                aVar3.getClass();
                y7.a aVar4 = fVarA.f31330c;
                if (aVar4 instanceof y7.b) {
                    androidx.lifecycle.l lVarA = (androidx.lifecycle.l) k.a(fVarA, w7.h.f31395e);
                    if (lVarA == null) {
                        lVarA = w7.a.a(fVarA);
                    }
                    jVar = new w7.q(aVar3.f31319a, fVarA, (y7.b) aVar4, lVarA, s1VarF);
                } else {
                    androidx.lifecycle.l lVarA2 = (androidx.lifecycle.l) k.a(fVarA, w7.h.f31395e);
                    if (lVarA2 == null) {
                        lVarA2 = z10 ? w7.a.a(fVarA) : null;
                    }
                    jVar = lVarA2 != null ? new w7.j(lVarA2, s1VarF) : new w7.b(s1VarF);
                }
                r52 = jVar;
                r52.a();
                aVar3.getClass();
                f.a aVarA = w7.f.a(fVarA);
                y7.a aVar5 = fVarA.f31330c;
                aVarA.f31349b = aVar3.f31319a.f11525a.f11531b;
                f.c cVar3 = fVarA.f31346s;
                x7.i eVar = cVar3.f31384g;
                if (eVar == null) {
                    if (aVar5 instanceof y7.b) {
                        View viewA = ((y7.b) aVar5).a();
                        eVar = ((viewA instanceof ImageView) && ((scaleType = ((ImageView) viewA).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? x7.i.f32201a : new x7.e(viewA);
                    } else {
                        eVar = x7.i.f32201a;
                    }
                    aVarA.f31359l = eVar;
                }
                if (cVar3.f31385h == null) {
                    y7.b bVar = aVar5 instanceof y7.b ? (y7.b) aVar5 : null;
                    View viewA2 = bVar != null ? bVar.a() : null;
                    ImageView imageView = viewA2 instanceof ImageView ? (ImageView) viewA2 : null;
                    if (imageView != null) {
                        Bitmap.Config[] configArr = b8.t.f3682a;
                        ImageView.ScaleType scaleType2 = imageView.getScaleType();
                        int i12 = scaleType2 == null ? -1 : t.a.f3684a[scaleType2.ordinal()];
                        fVar2 = (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) ? x7.f.f32191b : x7.f.f32190a;
                    } else {
                        fVar2 = fVarA.f31343p;
                    }
                    aVarA.f31360m = fVar2;
                }
                if (cVar3.f31386i == null) {
                    if (cVar3.f31384g == null && kotlin.jvm.internal.r.a(eVar, x7.i.f32201a)) {
                        cVar2 = x7.c.f32186b;
                    } else {
                        if ((aVar5 instanceof y7.b) && (eVar instanceof x7.l)) {
                            y7.b bVar2 = (y7.b) aVar5;
                            if ((bVar2.a() instanceof ImageView) && bVar2.a() == ((x7.l) eVar).a()) {
                                cVar2 = x7.c.f32186b;
                            }
                        }
                        cVar2 = x7.c.f32185a;
                    }
                    aVarA.f31361n = cVar2;
                }
                fVarA = aVarA.a();
                r32 = h.f11502a;
                try {
                    if (kotlin.jvm.internal.r.a(fVarA.f31329b, w7.k.f31400a)) {
                        throw new w7.l("The request's data is null.");
                    }
                    r52.start();
                    if (i10 == 0) {
                        wVar2.f11545a = this;
                        wVar2.f11546b = r52;
                        wVar2.f11547c = fVarA;
                        wVar2.f11548d = r32;
                        wVar2.f11552h = 1;
                    }
                    tVar = this;
                    hVar = r32;
                    nVar = r52;
                    fVarA.getClass();
                    aVar = fVarA.f31330c;
                    if (aVar != null) {
                    }
                    hVar.getClass();
                    x7.i iVar2 = fVarA.f31342o;
                    wVar2.f11545a = tVar;
                    wVar2.f11546b = nVar;
                    wVar2.f11547c = fVarA;
                    wVar2.f11548d = hVar;
                    wVar2.f11549e = null;
                    wVar2.f11552h = 2;
                    objB = iVar2.b(wVar2);
                    if (objB != aVar2) {
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    r62 = this;
                    if (!(th instanceof CancellationException)) {
                    }
                }
            } else {
                if (r32 == 1) {
                    h hVar4 = wVar2.f11548d;
                    fVarA = wVar2.f11547c;
                    w7.n nVar3 = wVar2.f11546b;
                    tVar = wVar2.f11545a;
                    pg.q.b(objB);
                    hVar = hVar4;
                    nVar = nVar3;
                    fVarA.getClass();
                    aVar = fVarA.f31330c;
                    if (aVar != null) {
                        l lVarInvoke = fVarA.f31339l.invoke(fVarA);
                        if (lVarInvoke == null) {
                            lVarInvoke = fVarA.f31347t.f31371h.invoke(fVarA);
                        }
                        aVar.b(lVarInvoke);
                    }
                    hVar.getClass();
                    x7.i iVar22 = fVarA.f31342o;
                    wVar2.f11545a = tVar;
                    wVar2.f11546b = nVar;
                    wVar2.f11547c = fVarA;
                    wVar2.f11548d = hVar;
                    wVar2.f11549e = null;
                    wVar2.f11552h = 2;
                    objB = iVar22.b(wVar2);
                    if (objB != aVar2) {
                        hVar2 = hVar;
                        fVar3 = fVarA;
                        tVar2 = tVar;
                        lVar = null;
                        r52 = nVar;
                        x7.h hVar5 = (x7.h) objB;
                        hVar2.getClass();
                        tg.h hVar6 = fVar3.f31333f;
                        x xVar = new x(fVar3, tVar2, hVar5, hVar2, lVar, null);
                        r32 = hVar2;
                        wVar2.f11545a = tVar2;
                        wVar2.f11546b = r52;
                        wVar2.f11547c = fVar3;
                        wVar2.f11548d = r32;
                        wVar2.f11549e = null;
                        wVar2.f11552h = 3;
                        objB = ph.h.e(hVar6, xVar, wVar2);
                        if (objB != aVar2) {
                        }
                    }
                    return aVar2;
                }
                if (r32 != 2) {
                    if (r32 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h hVar7 = wVar2.f11548d;
                    fVar4 = wVar2.f11547c;
                    w7.n nVar4 = wVar2.f11546b;
                    t tVar4 = wVar2.f11545a;
                    pg.q.b(objB);
                    hVar3 = hVar7;
                    nVar2 = nVar4;
                    tVar3 = tVar4;
                    iVar = (w7.i) objB;
                    if (!(iVar instanceof w7.o)) {
                        w7.o oVar = (w7.o) iVar;
                        y7.a aVar6 = fVar4.f31330c;
                        tVar3.getClass();
                        w7.f fVar5 = oVar.f31412b;
                        if (aVar6 instanceof a8.d) {
                            ((a8.c) k.a(fVar5, w7.h.f31391a)).a((a8.d) aVar6, oVar);
                        }
                        hVar3.getClass();
                    } else {
                        if (!(iVar instanceof w7.e)) {
                            throw new pg.l();
                        }
                        tVar3.d((w7.e) iVar, fVar4.f31330c, hVar3);
                    }
                    return iVar;
                }
                l lVar2 = wVar2.f11549e;
                h hVar8 = wVar2.f11548d;
                w7.f fVar6 = wVar2.f11547c;
                w7.n nVar5 = wVar2.f11546b;
                t tVar5 = wVar2.f11545a;
                try {
                    pg.q.b(objB);
                    lVar = lVar2;
                    hVar2 = hVar8;
                    fVar3 = fVar6;
                    r52 = nVar5;
                    tVar2 = tVar5;
                    try {
                        x7.h hVar52 = (x7.h) objB;
                        hVar2.getClass();
                        tg.h hVar62 = fVar3.f31333f;
                        x xVar2 = new x(fVar3, tVar2, hVar52, hVar2, lVar, null);
                        r32 = hVar2;
                        try {
                            wVar2.f11545a = tVar2;
                            wVar2.f11546b = r52;
                            wVar2.f11547c = fVar3;
                            wVar2.f11548d = r32;
                            wVar2.f11549e = null;
                            wVar2.f11552h = 3;
                            objB = ph.h.e(hVar62, xVar2, wVar2);
                            if (objB != aVar2) {
                                fVar4 = fVar3;
                                tVar3 = tVar2;
                                hVar3 = r32;
                                nVar2 = r52;
                                iVar = (w7.i) objB;
                                if (!(iVar instanceof w7.o)) {
                                }
                                return iVar;
                            }
                            return aVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            fVarA = fVar3;
                            r62 = tVar2;
                            try {
                                if (!(th instanceof CancellationException)) {
                                }
                            } finally {
                                r52.b();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r32 = hVar2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r32 = hVar8;
                    fVarA = fVar6;
                    r52 = nVar5;
                    r62 = tVar5;
                    if (!(th instanceof CancellationException)) {
                        w7.e eVarA = b8.s.a(fVarA, th);
                        r62.d(eVarA, fVarA.f31330c, r32);
                        return eVarA;
                    }
                    a aVar7 = r62.f11525a;
                    r32.getClass();
                    fVarA.getClass();
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final r7.c c() {
        return (r7.c) this.f11525a.f11532c.getValue();
    }

    public final void d(w7.e eVar, y7.a aVar, h hVar) {
        w7.f fVar = eVar.f31326b;
        if (aVar instanceof a8.d) {
            ((a8.c) k.a(fVar, w7.h.f31391a)).a((a8.d) aVar, eVar);
        }
        hVar.getClass();
        fVar.getClass();
    }
}
