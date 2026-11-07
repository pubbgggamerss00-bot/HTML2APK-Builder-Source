package j2;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f14970a = new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 10.0f, 10.0f);

    public static final p.y a(q2.v vVar) {
        q2.t tVarA = vVar.a();
        i2.e0 e0Var = tVarA.f21810c;
        if (!e0Var.x() || !e0Var.m()) {
            p.y yVar = p.j.f20648a;
            kotlin.jvm.internal.r.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return yVar;
        }
        p.y yVar2 = new p.y(48);
        p1.e eVarE = tVarA.e();
        b(new Region(Math.round(eVarE.f21131a), Math.round(eVarE.f21132b), Math.round(eVarE.f21133c), Math.round(eVarE.f21134d)), tVarA, yVar2, tVarA, new Region());
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[EDGE_INSN: B:41:0x00ca->B:44:0x00e0 BREAK  A[LOOP:1: B:38:0x00bf->B:42:0x00cd]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Region region, q2.t tVar, p.y<w4> yVar, q2.t tVar2, Region region2) {
        p1.e eVar;
        i2.e0 e0Var;
        i2.j jVarB;
        int i10 = tVar.f21814g;
        i2.e0 e0Var2 = tVar2.f21810c;
        int i11 = tVar2.f21814g;
        boolean z10 = (e0Var2.x() && e0Var2.m()) ? false : true;
        if (!region.isEmpty() || i11 == i10) {
            if (!z10 || tVar2.f21812e) {
                i2.j jVar = tVar2.f21808a;
                q2.l lVar = tVar2.f21811d;
                if (lVar.f21801c && (jVarB = q2.u.b(e0Var2)) != null) {
                    jVar = jVarB;
                }
                d.c cVarB = jVar.B();
                boolean z11 = q2.m.a(lVar, q2.k.f21774b) != null;
                if (cVarB.f1144a.f1157p) {
                    if (z11) {
                        i2.g1 g1VarD = i2.k.d(cVarB, 8);
                        if (!g1VarD.l1().f1157p) {
                            eVar = p1.e.f21130e;
                            break;
                        }
                        g2.v vVarC = g2.w.c(g1VarD);
                        p1.b bVar = g1VarD.E;
                        if (bVar == null) {
                            bVar = new p1.b();
                            g1VarD.E = bVar;
                        }
                        long jM0 = g1VarD.M0(g1VarD.i1());
                        int i12 = (int) (jM0 >> 32);
                        bVar.f21125a = -Float.intBitsToFloat(i12);
                        int i13 = (int) (jM0 & BodyPartID.bodyIdMax);
                        bVar.f21126b = -Float.intBitsToFloat(i13);
                        bVar.f21127c = Float.intBitsToFloat(i12) + g1VarD.g0();
                        bVar.f21128d = Float.intBitsToFloat(i13) + g1VarD.e0();
                        while (g1VarD != vVarC) {
                            g1VarD.O1(bVar, false, true);
                            if (bVar.b()) {
                                eVar = p1.e.f21130e;
                                break;
                            } else {
                                g1VarD = g1VarD.f13878s;
                                kotlin.jvm.internal.r.b(g1VarD);
                            }
                        }
                        eVar = new p1.e(bVar.f21125a, bVar.f21126b, bVar.f21127c, bVar.f21128d);
                    } else {
                        i2.g1 g1VarD2 = i2.k.d(cVarB, 8);
                        eVar = g2.w.c(g1VarD2).N(g1VarD2, true);
                    }
                }
                int iRound = Math.round(eVar.f21131a);
                int iRound2 = Math.round(eVar.f21132b);
                int iRound3 = Math.round(eVar.f21133c);
                int iRound4 = Math.round(eVar.f21134d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (tVar2.f21812e) {
                        q2.t tVarJ = tVar2.j();
                        p1.e eVarE = (tVarJ == null || (e0Var = tVarJ.f21810c) == null || !e0Var.x()) ? f14970a : tVarJ.e();
                        yVar.h(i11, new w4(tVar2, new Rect(Math.round(eVarE.f21131a), Math.round(eVarE.f21132b), Math.round(eVarE.f21133c), Math.round(eVarE.f21134d))));
                        return;
                    } else {
                        if (i11 == -1) {
                            yVar.h(i11, new w4(tVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                yVar.h(i11, new w4(tVar2, region2.getBounds()));
                List listH = q2.t.h(4, tVar2);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    if (!((q2.t) listH.get(size)).i().f21799a.b(q2.w.f21844y)) {
                        b(region, tVar, yVar, (q2.t) listH.get(size), region2);
                    }
                }
                if (e(tVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final t2.h0 c(q2.l lVar) {
        eh.l lVar2;
        ArrayList arrayList = new ArrayList();
        q2.a aVar = (q2.a) q2.m.a(lVar, q2.k.f21773a);
        if (aVar == null || (lVar2 = (eh.l) aVar.f21753b) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (t2.h0) arrayList.get(0);
    }

    public static final boolean d(q2.t tVar) {
        i2.g1 g1VarC = tVar.c();
        q2.l lVar = tVar.f21811d;
        if (g1VarC != null ? g1VarC.E1() : false) {
            return true;
        }
        q2.c0<List<String>> c0Var = q2.w.f21820a;
        if (lVar.f21799a.b(q2.w.f21834o)) {
            return true;
        }
        return lVar.f21799a.b(q2.w.f21833n);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(q2.t tVar) {
        if (!d(tVar)) {
            q2.l lVar = tVar.f21811d;
            if (lVar.f21801c) {
                return true;
            }
            p.l0<q2.c0<?>, Object> l0Var = lVar.f21799a;
            Object[] objArr = l0Var.f20738b;
            Object[] objArr2 = l0Var.f20739c;
            long[] jArr = l0Var.f20737a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                Object obj2 = objArr2[i13];
                                if (((q2.c0) obj).f21760c) {
                                    return true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return false;
    }

    public static final i3.b f(n1 n1Var, int i10) {
        Object next;
        Iterator<T> it = n1Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i2.e0) ((Map.Entry) next).getKey()).f13810b == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (i3.b) entry.getValue();
        }
        return null;
    }

    public static final String g(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
