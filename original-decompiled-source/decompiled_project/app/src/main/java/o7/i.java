package o7;

import android.graphics.Bitmap;
import b8.t;
import g7.s;
import java.util.List;
import o7.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.v1;
import qg.o;
import w7.m;

/* loaded from: classes.dex */
public final class i {
    /* JADX WARN: Path cross not found for [B:30:0x0085, B:24:0x006f], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d7 -> B:41:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a.C0215a c0215a, w7.f fVar, m mVar, g7.h hVar, vg.c cVar) {
        h hVar2;
        List list;
        int i10;
        Bitmap bitmapA;
        a.C0215a c0215a2;
        int size;
        h hVar3;
        g7.h hVar4;
        m mVar2;
        w7.f fVar2;
        if (cVar instanceof h) {
            hVar2 = (h) cVar;
            int i11 = hVar2.f19047j;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                hVar2.f19047j = i11 - PKIFailureInfo.systemUnavail;
            } else {
                hVar2 = new h(cVar);
            }
        }
        Object obj = hVar2.f19046h;
        ug.a aVar = ug.a.f29706a;
        int i12 = hVar2.f19047j;
        if (i12 == 0) {
            q.b(obj);
            list = (List) g7.k.a(fVar, w7.g.f31387a);
            if (list.isEmpty()) {
                return c0215a;
            }
            g7.l lVar = c0215a.f18981a;
            boolean z10 = lVar instanceof g7.a;
            if (!z10 && !((Boolean) g7.k.a(fVar, w7.g.f31390d)).booleanValue()) {
                return c0215a;
            }
            i10 = 0;
            if (z10) {
                bitmapA = ((g7.a) lVar).f11477a;
                Bitmap.Config config = bitmapA.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (!o.r(t.f3682a, config)) {
                }
                hVar.getClass();
                c0215a2 = c0215a;
                size = list.size();
                hVar3 = hVar2;
                hVar4 = hVar;
                mVar2 = mVar;
                fVar2 = fVar;
                if (i10 >= size) {
                }
            }
            bitmapA = b8.e.a(s.a(lVar, mVar.f31401a.getResources()), (Bitmap.Config) g7.k.b(mVar, w7.h.f31392b), mVar.f31402b, mVar.f31403c, mVar.f31404d == x7.c.f32186b);
            hVar.getClass();
            c0215a2 = c0215a;
            size = list.size();
            hVar3 = hVar2;
            hVar4 = hVar;
            mVar2 = mVar;
            fVar2 = fVar;
            if (i10 >= size) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = hVar2.f19045g;
            int i13 = hVar2.f19044f;
            List list2 = hVar2.f19043e;
            g7.h hVar5 = hVar2.f19042d;
            m mVar3 = hVar2.f19041c;
            w7.f fVar3 = hVar2.f19040b;
            a.C0215a c0215a3 = hVar2.f19039a;
            q.b(obj);
            h hVar6 = hVar2;
            List list3 = list2;
            fVar2 = fVar3;
            h hVar7 = hVar6;
            g7.h hVar8 = hVar5;
            mVar2 = mVar3;
            v1.e(hVar7.getContext());
            a.C0215a c0215a4 = c0215a3;
            i10 = i13 + 1;
            c0215a2 = c0215a4;
            h hVar9 = hVar7;
            bitmapA = (Bitmap) obj;
            list = list3;
            hVar4 = hVar8;
            hVar3 = hVar9;
            if (i10 >= size) {
                z7.a aVar2 = (z7.a) list.get(i10);
                x7.h hVar10 = mVar2.f31402b;
                hVar3.f19039a = c0215a2;
                hVar3.f19040b = fVar2;
                hVar3.f19041c = mVar2;
                hVar3.f19042d = hVar4;
                hVar3.f19043e = list;
                hVar3.f19044f = i10;
                hVar3.f19045g = size;
                hVar3.f19047j = 1;
                Object objB = aVar2.b();
                if (objB == aVar) {
                    return aVar;
                }
                int i14 = i10;
                c0215a3 = c0215a2;
                i13 = i14;
                g7.h hVar11 = hVar4;
                list3 = list;
                obj = objB;
                hVar7 = hVar3;
                hVar8 = hVar11;
                v1.e(hVar7.getContext());
                a.C0215a c0215a42 = c0215a3;
                i10 = i13 + 1;
                c0215a2 = c0215a42;
                h hVar92 = hVar7;
                bitmapA = (Bitmap) obj;
                list = list3;
                hVar4 = hVar8;
                hVar3 = hVar92;
                if (i10 >= size) {
                    hVar4.getClass();
                    return new a.C0215a(new g7.a(bitmapA), c0215a2.f18982b, c0215a2.f18983c, c0215a2.f18984d);
                }
            }
        }
    }
}
