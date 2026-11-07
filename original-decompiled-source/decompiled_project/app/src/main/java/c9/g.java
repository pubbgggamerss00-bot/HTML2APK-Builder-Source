package c9;

import android.graphics.Color;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pg.p;

/* loaded from: classes.dex */
public final class g {
    public static final int a(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[2] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[4] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[5] == 1.0f && fArr[6] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[8] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[9] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[13] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[14] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10) {
        return f10 == 1.0f ? dVar : androidx.compose.ui.graphics.a.b(dVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, true, 126971);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(hf.b bVar, hf.d dVar, int i10, List list, androidx.credentials.playservices.controllers.identityauth.getsigninintent.e eVar) throws IOException {
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        char c10;
        int i12 = i10;
        jf.g gVarA = dVar.a();
        float fA = gVarA.a();
        float fB = gVarA.b();
        cf.a aVar = gVarA.f15718a;
        int i13 = 2;
        float fG0 = ((cf.n) aVar.i0(2)).g0() - gVarA.a();
        float fG02 = ((cf.n) aVar.i0(3)).g0() - gVarA.b();
        int i14 = (((i12 % 360) + 360) % 360) % 180;
        float f14 = i14 == 0 ? fG0 : fG02;
        float f15 = i14 == 0 ? fG02 : fG0;
        hf.e eVar2 = new hf.e(bVar, dVar);
        NumberFormat numberFormat = eVar2.f13018h;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v1 v1Var = (v1) it.next();
                if (v1Var instanceof e) {
                    eVar2.p();
                    if (((e) v1Var).f5087d) {
                        tf.a aVar2 = new tf.a();
                        c10 = 0;
                        cf.d dVar2 = aVar2.f28761a;
                        i11 = i13;
                        dVar2.O0(cf.l.D, new cf.f(0.38f));
                        dVar2.O0(cf.l.A, (cf.l) of.a.f19145b.get(of.a.f19144a));
                        hf.g gVar = eVar2.f13013c;
                        gVar.getClass();
                        gVar.a(cf.l.f5542z0, "gs", aVar2).i0(eVar2.f13012b);
                        eVar2.f13012b.write(32);
                        eVar2.e0("gs");
                    } else {
                        i11 = i13;
                        c10 = 0;
                    }
                    eVar2.M(Color.red(((e) v1Var).f5085b) / 255.0f, Color.green(((e) v1Var).f5085b) / 255.0f, Color.blue(((e) v1Var).f5085b) / 255.0f);
                    eVar2.d0(((e) v1Var).f5086c * f14);
                    eVar2.e0("w");
                    long j10 = 1;
                    String str = numberFormat.format(j10);
                    cf.r rVar = eVar2.f13012b;
                    Charset charset = wf.a.f31520a;
                    rVar.write(str.getBytes(charset));
                    eVar2.f13012b.write(32);
                    eVar2.e0("J");
                    eVar2.f13012b.write(numberFormat.format(j10).getBytes(charset));
                    eVar2.f13012b.write(32);
                    eVar2.e0("j");
                    float[] fArr = ((e) v1Var).f5084a;
                    int length = fArr.length / 2;
                    f10 = fA;
                    f11 = fG0;
                    pg.n nVarD = d(i12, f10, fB, f11, fG02, fArr[c10], fArr[1]);
                    float fFloatValue = ((Number) nVarD.f21469a).floatValue();
                    float fFloatValue2 = ((Number) nVarD.f21470b).floatValue();
                    if (eVar2.f13014d) {
                        throw new IllegalStateException("Error: moveTo is not allowed within a text block.");
                    }
                    eVar2.d0(fFloatValue);
                    eVar2.d0(fFloatValue2);
                    eVar2.e0("m");
                    int i15 = length - 1;
                    float f16 = fFloatValue;
                    int i16 = 1;
                    while (i16 < i15) {
                        int i17 = i16 * 2;
                        float f17 = fFloatValue2;
                        int i18 = i17 + 1;
                        float[] fArr2 = fArr;
                        int i19 = i16;
                        pg.n nVarD2 = d(i10, f10, fB, f11, fG02, fArr[i17], fArr[i18]);
                        float fFloatValue3 = ((Number) nVarD2.f21469a).floatValue();
                        float fFloatValue4 = ((Number) nVarD2.f21470b).floatValue();
                        float f18 = f14;
                        float f19 = i11;
                        float f20 = (fArr2[i17] + fArr2[i17 + 2]) / f19;
                        float f21 = (fArr2[i18] + fArr2[i17 + 3]) / f19;
                        float f22 = f15;
                        pg.n nVarD3 = d(i10, f10, fB, f11, fG02, f20, f21);
                        float fFloatValue5 = ((Number) nVarD3.f21469a).floatValue();
                        fFloatValue2 = ((Number) nVarD3.f21470b).floatValue();
                        float fA2 = org.bouncycastle.jcajce.provider.digest.c.a(fFloatValue3, f16, 0.6666667f, f16);
                        float fA3 = org.bouncycastle.jcajce.provider.digest.c.a(fFloatValue4, f17, 0.6666667f, f17);
                        float fA4 = org.bouncycastle.jcajce.provider.digest.c.a(fFloatValue3, fFloatValue5, 0.6666667f, fFloatValue5);
                        float fA5 = org.bouncycastle.jcajce.provider.digest.c.a(fFloatValue4, fFloatValue2, 0.6666667f, fFloatValue2);
                        if (eVar2.f13014d) {
                            throw new IllegalStateException("Error: curveTo is not allowed within a text block.");
                        }
                        eVar2.d0(fA2);
                        eVar2.d0(fA3);
                        eVar2.d0(fA4);
                        eVar2.d0(fA5);
                        eVar2.d0(fFloatValue5);
                        eVar2.d0(fFloatValue2);
                        eVar2.e0("c");
                        fArr = fArr2;
                        f16 = fFloatValue5;
                        i16 = i19 + 1;
                        f15 = f22;
                        f14 = f18;
                        i11 = 2;
                    }
                    float[] fArr3 = fArr;
                    f12 = f14;
                    f13 = f15;
                    int i20 = length * 2;
                    pg.n nVarD4 = d(i10, f10, fB, f11, fG02, fArr3[i20 - 2], fArr3[i20 - 1]);
                    float fFloatValue6 = ((Number) nVarD4.f21469a).floatValue();
                    float fFloatValue7 = ((Number) nVarD4.f21470b).floatValue();
                    if (eVar2.f13014d) {
                        throw new IllegalStateException("Error: lineTo is not allowed within a text block.");
                    }
                    eVar2.d0(fFloatValue6);
                    eVar2.d0(fFloatValue7);
                    eVar2.e0("l");
                    if (eVar2.f13014d) {
                        throw new IllegalStateException("Error: stroke is not allowed within a text block.");
                    }
                    eVar2.e0(kf.a.f16303b);
                    eVar2.l();
                } else {
                    f10 = fA;
                    f11 = fG0;
                    f12 = f14;
                    f13 = f15;
                    if (!(v1Var instanceof z1)) {
                        throw new pg.l();
                    }
                    float f23 = ((z1) v1Var).f5336e * f12;
                    double radians = Math.toRadians(i10 - ((z1) v1Var).f5337f);
                    float f24 = f12 / f13;
                    eVar2.p();
                    eVar2.E(Color.red(((z1) v1Var).f5335d) / 255.0f, Color.green(((z1) v1Var).f5335d) / 255.0f, Color.blue(((z1) v1Var).f5335d) / 255.0f);
                    if (eVar2.f13014d) {
                        throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
                    }
                    eVar2.e0("BT");
                    eVar2.f13014d = true;
                    eVar2.z((mf.n) eVar.invoke(), f23);
                    int i21 = 0;
                    for (Object obj : mh.x.E(((z1) v1Var).f5334c)) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        String str2 = (String) obj;
                        pg.n nVarA = f.a((z1) v1Var, i21, f24);
                        double d10 = radians;
                        pg.n nVarD5 = d(i10, f10, fB, f11, fG02, ((Number) nVarA.f21469a).floatValue(), ((Number) nVarA.f21470b).floatValue());
                        float fFloatValue8 = ((Number) nVarD5.f21469a).floatValue();
                        float fFloatValue9 = ((Number) nVarD5.f21470b).floatValue();
                        float fCos = (float) Math.cos(d10);
                        float fSin = (float) Math.sin(d10);
                        eVar2.N(new wf.c(fCos, fSin, -fSin, fCos, fFloatValue8, fFloatValue9));
                        eVar2.Z(e((mf.n) eVar.invoke(), str2));
                        i21 = i22;
                        radians = d10;
                    }
                    if (!eVar2.f13014d) {
                        throw new IllegalStateException("Error: You must call beginText() before calling endText.");
                    }
                    eVar2.e0("ET");
                    eVar2.f13014d = false;
                    eVar2.l();
                }
                i12 = i10;
                fG0 = f11;
                f15 = f13;
                f14 = f12;
                i13 = 2;
                fA = f10;
            }
            pg.f0 f0Var = pg.f0.f21461a;
            eVar2.close();
        } finally {
        }
    }

    public static final pg.n d(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        int i11 = ((i10 % 360) + 360) % 360;
        return i11 != 90 ? i11 != 180 ? i11 != 270 ? new pg.n(Float.valueOf((f14 * f12) + f10), Float.valueOf(((1.0f - f15) * f13) + f11)) : new pg.n(Float.valueOf(((1.0f - f15) * f12) + f10), Float.valueOf(((1.0f - f14) * f13) + f11)) : new pg.n(Float.valueOf(((1.0f - f14) * f12) + f10), Float.valueOf((f15 * f13) + f11)) : new pg.n(Float.valueOf((f15 * f12) + f10), Float.valueOf((f14 * f13) + f11));
    }

    public static String e(mf.n nVar, String str) {
        Object objA;
        StringBuilder sb = new StringBuilder();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            char[] chars = Character.toChars(iCodePointAt);
            kotlin.jvm.internal.r.d(chars, "toChars(...)");
            String str2 = new String(chars);
            try {
                objA = nVar.c(str2);
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            if (objA instanceof p.a) {
                str2 = "?";
            }
            sb.append(str2);
            iCharCount += Character.charCount(iCodePointAt);
        }
        return sb.toString();
    }

    public static void f(hf.d dVar) {
        hf.g gVarC = dVar.c();
        cf.d dVar2 = dVar.f13007a;
        if (gVarC != null) {
            dVar.f13008b = gVarC;
            dVar2.P0(cf.l.W1, gVarC);
        }
        jf.g gVarB = dVar.b();
        dVar.f13010d = gVarB;
        if (gVarB == null) {
            dVar2.L0(cf.l.f5512r1);
        } else {
            dVar2.P0(cf.l.f5512r1, gVarB);
        }
        jf.g gVarA = dVar.a();
        if (gVarA == null) {
            dVar2.L0(cf.l.f5447a0);
        } else {
            dVar2.O0(cf.l.f5447a0, gVarA.f15718a);
        }
        dVar2.N0(cf.l.Z1, dVar.d());
    }

    public static final ArrayList g(Map map, eh.l lVar) {
        kotlin.jvm.internal.r.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            p5.q qVar = (p5.q) entry.getValue();
            Boolean bool = qVar != null ? Boolean.FALSE : null;
            kotlin.jvm.internal.r.b(bool);
            if (!bool.booleanValue() && !qVar.f21258b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Hilt_HtmlToApkApplication context, List list, List pages, File file) {
        hf.d dVar;
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(pages, "pages");
        if (pages.isEmpty()) {
            throw new IllegalArgumentException("No pages");
        }
        bf.a.f4214a = context.getApplicationContext().getApplicationContext().getAssets();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                ef.b bVar = new ef.b(false, true, 0L);
                int i11 = hf.b.f12996j;
                ef.c cVar = new ef.c(file2);
                try {
                    ef.g gVar = new ef.g(bVar);
                    try {
                        ff.f fVar = new ff.f(cVar, gVar);
                        fVar.W();
                        arrayList.add(fVar.U());
                    } catch (IOException e10) {
                        ef.a.b(gVar);
                        throw e10;
                    }
                } catch (IOException e11) {
                    ef.a.b(cVar);
                    throw e11;
                }
            }
            Object obj = arrayList.get(0);
            kotlin.jvm.internal.r.d(obj, "get(...)");
            hf.b bVar2 = (hf.b) obj;
            cf.d dVar2 = bVar2.f12997a.f5428f;
            if (dVar2 != null ? dVar2.v0(cf.l.f5530w0) instanceof cf.d : false) {
                bVar2.f13000d = true;
            }
            ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList.get(i12);
                i12++;
                hf.c cVarH = ((hf.b) obj2).h();
                List listC0 = qg.x.c0(new hf.f((cf.d) cVarH.f13005a.v0(cf.l.I1), cVarH.f13006b));
                Iterator it2 = listC0.iterator();
                while (it2.hasNext()) {
                    f((hf.d) it2.next());
                }
                arrayList2.add(listC0);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList(qg.p.h(pages, 10));
            Iterator it3 = pages.iterator();
            while (it3.hasNext()) {
                b bVar3 = (b) it3.next();
                int i13 = bVar3.f5058b;
                if ((i13 == -1 ? 1 : i10) != 0) {
                    dVar = new hf.d(new jf.g(bVar3.f5060d, bVar3.f5061e, i10));
                    dVar.f13007a.N0(cf.l.Z1, i10);
                } else {
                    hf.d dVar3 = (hf.d) ((List) arrayList2.get(i13)).get(bVar3.f5059c);
                    if (i13 == 0 && hashSet.add(dVar3.f13007a)) {
                        dVar = dVar3;
                    } else {
                        kotlin.jvm.internal.r.b(dVar3);
                        cf.d dVar4 = dVar3.f13007a;
                        cf.d dVar5 = new cf.d();
                        dVar5.f5423b = new wf.e();
                        dVar5.g0(dVar4);
                        dVar = new hf.d(dVar5);
                        dVar5.L0(cf.l.K1);
                    }
                }
                cf.d dVar6 = dVar.f13007a;
                cf.l lVar = cf.l.W;
                cf.b bVarV0 = dVar6.v0(lVar);
                cf.a aVar = bVarV0 instanceof cf.a ? (cf.a) bVarV0 : null;
                if (aVar != null) {
                    cf.a aVar2 = new cf.a();
                    int size2 = aVar.f5416b.size();
                    for (int i14 = i10; i14 < size2; i14++) {
                        aVar2.g0(aVar.i0(i14));
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                    dVar6.O0(lVar, aVar2);
                }
                arrayList3.add(new pg.n(dVar, bVar3));
                i10 = 0;
            }
            cf.d dVar7 = (cf.d) bVar2.h().f13005a.v0(cf.l.I1);
            new HashSet();
            if (dVar7 == null) {
                throw new IllegalArgumentException("page tree root cannot be null");
            }
            boolean zEquals = cf.l.H1.equals(dVar7.q0(cf.l.f5532w2));
            cf.d dVar8 = dVar7;
            if (zEquals) {
                cf.a aVar3 = new cf.a();
                aVar3.g0(dVar7);
                cf.d dVar9 = new cf.d();
                dVar9.O0(cf.l.f5477i1, aVar3);
                dVar9.N0(cf.l.X, 1);
                dVar8 = dVar9;
            }
            cf.a aVar4 = new cf.a();
            int size3 = arrayList3.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList3.get(i15);
                i15++;
                hf.d dVar10 = (hf.d) ((pg.n) obj3).f21469a;
                dVar10.f13007a.O0(cf.l.K1, dVar8);
                aVar4.g0(dVar10.f13007a);
            }
            dVar8.O0(cf.l.f5477i1, aVar4);
            dVar8.N0(cf.l.X, arrayList3.size());
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            int size4 = arrayList3.size();
            int i16 = 0;
            while (i16 < size4) {
                Object obj4 = arrayList3.get(i16);
                i16++;
                pg.n nVar = (pg.n) obj4;
                hf.d dVar11 = (hf.d) nVar.f21469a;
                b bVar4 = (b) nVar.f21470b;
                int iD = dVar11.d();
                if (!bVar4.f5063g.isEmpty()) {
                    c(bVar2, dVar11, iD, bVar4.f5063g, new androidx.credentials.playservices.controllers.identityauth.getsigninintent.e(g0Var, bVar2));
                }
                dVar11.f13007a.N0(cf.l.Z1, (((iD + bVar4.f5062f) % 360) + 360) % 360);
            }
            bVar2.z(file);
            int size5 = arrayList.size();
            int i17 = 0;
            while (i17 < size5) {
                int i18 = i17 + 1;
                try {
                    ((hf.b) arrayList.get(i17)).close();
                    pg.f0 f0Var2 = pg.f0.f21461a;
                } catch (Throwable th2) {
                    pg.q.a(th2);
                }
                i17 = i18;
            }
        } catch (Throwable th3) {
            int size6 = arrayList.size();
            int i19 = 0;
            while (i19 < size6) {
                int i20 = i19 + 1;
                try {
                    ((hf.b) arrayList.get(i19)).close();
                    pg.f0 f0Var3 = pg.f0.f21461a;
                } catch (Throwable th4) {
                    pg.q.a(th4);
                }
                i19 = i20;
            }
            throw th3;
        }
    }
}
