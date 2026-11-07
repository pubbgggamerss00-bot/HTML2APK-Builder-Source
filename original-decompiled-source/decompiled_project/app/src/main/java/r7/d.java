package r7;

import android.graphics.Bitmap;
import g7.k;
import g7.l;
import g7.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import pg.n;
import qg.k0;
import r7.c;
import w7.m;
import x7.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t f23224a;

    public d(t tVar, w7.a aVar) {
        this.f23224a = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r1.equals(r19.toString()) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c.C0257c a(w7.f fVar, c.b bVar, x7.h hVar, x7.f fVar2) {
        boolean zB;
        int iAbs;
        w7.c cVar = fVar.f31336i;
        x7.c cVar2 = fVar.f31344q;
        if (cVar.f31323a) {
            c cVarC = this.f23224a.c();
            c.C0257c c0257cA = cVarC != null ? cVarC.a(bVar) : null;
            if (c0257cA != null) {
                l lVar = c0257cA.f23222a;
                g7.a aVar = lVar instanceof g7.a ? (g7.a) lVar : null;
                if (aVar == null) {
                    zB = true;
                } else {
                    Bitmap.Config config = aVar.f11477a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zB = w7.a.b(fVar, config);
                }
                if (zB) {
                    String str = bVar.f23221b.get("coil#size");
                    if (str == null) {
                        Object obj = c0257cA.f23223b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!r.a(hVar, x7.h.f32198c) && cVar2 != x7.c.f32186b)) {
                            int iA = lVar.a();
                            int height = lVar.getHeight();
                            x7.h hVar2 = lVar instanceof g7.a ? (x7.h) k.a(fVar, w7.g.f31388b) : x7.h.f32198c;
                            x7.a aVar2 = hVar.f32199a;
                            int i10 = aVar2 instanceof a.C0326a ? ((a.C0326a) aVar2).f32183a : Integer.MAX_VALUE;
                            x7.a aVar3 = hVar2.f32199a;
                            int iMin = Math.min(i10, aVar3 instanceof a.C0326a ? ((a.C0326a) aVar3).f32183a : Integer.MAX_VALUE);
                            x7.a aVar4 = hVar.f32200b;
                            int i11 = aVar4 instanceof a.C0326a ? ((a.C0326a) aVar4).f32183a : Integer.MAX_VALUE;
                            x7.a aVar5 = hVar2.f32200b;
                            int iMin2 = Math.min(i11, aVar5 instanceof a.C0326a ? ((a.C0326a) aVar5).f32183a : Integer.MAX_VALUE);
                            double d10 = iMin / iA;
                            c.C0257c c0257c = c0257cA;
                            double d11 = iMin2 / height;
                            int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? x7.f.f32191b : fVar2).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    throw new pg.l();
                                }
                                if (d10 < d11) {
                                    iAbs = Math.abs(iMin - iA);
                                } else {
                                    iAbs = Math.abs(iMin2 - height);
                                    d10 = d11;
                                }
                            } else if (d10 > d11) {
                                iAbs = Math.abs(iMin - iA);
                            } else {
                                iAbs = Math.abs(iMin2 - height);
                                d10 = d11;
                            }
                            if (iAbs <= 1) {
                                return c0257c;
                            }
                            int iOrdinal2 = cVar2.ordinal();
                            if (iOrdinal2 == 0) {
                                if (d10 == 1.0d) {
                                    return c0257c;
                                }
                                return null;
                            }
                            if (iOrdinal2 != 1) {
                                throw new pg.l();
                            }
                            if (d10 <= 1.0d) {
                                return c0257c;
                            }
                            return null;
                        }
                    }
                    return c0257cA;
                }
            }
        }
        return null;
    }

    public final c.b b(w7.f fVar, Object obj, m mVar, g7.h hVar) {
        String strA;
        Map<String, String> map = fVar.f31331d;
        List<n<p7.c<? extends Object>, kh.c<? extends Object>>> list = this.f23224a.f11528d.f11489c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            n<p7.c<? extends Object>, kh.c<? extends Object>> nVar = list.get(i10);
            p7.c<? extends Object> cVar = nVar.f21469a;
            if (nVar.f21470b.i(obj)) {
                r.c(cVar, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                strA = cVar.a(obj, mVar);
                if (strA != null) {
                    break;
                }
            }
            i10++;
        }
        if (strA == null) {
            return null;
        }
        if (((List) k.a(fVar, w7.g.f31387a)).isEmpty()) {
            return new c.b(strA, map);
        }
        LinkedHashMap linkedHashMapK = k0.k(map);
        linkedHashMapK.put("coil#size", mVar.f31402b.toString());
        return new c.b(strA, linkedHashMapK);
    }
}
