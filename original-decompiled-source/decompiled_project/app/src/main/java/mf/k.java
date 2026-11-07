package mf;

import android.util.Log;
import cf.t;
import cf.u;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import mf.i;
import mf.j;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ve.b0;
import ve.d0;
import ve.p0;
import ve.x;

/* loaded from: classes2.dex */
public final class k implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final p f18201a;

    /* renamed from: f, reason: collision with root package name */
    public final cf.d f18206f;

    /* renamed from: g, reason: collision with root package name */
    public final o f18207g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f18208h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f18209j;

    /* renamed from: k, reason: collision with root package name */
    public final ve.c f18210k;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18203c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18204d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final float[] f18205e = {880.0f, -1000.0f};

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18202b = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:122:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06cc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(cf.d dVar, p pVar, p0 p0Var) throws IOException {
        p0 p0Var2;
        boolean z10;
        a aVar;
        cf.d dVar2;
        byte b10;
        i.b bVar;
        g8.b bVarB;
        cf.d dVar3;
        double d10;
        cf.d dVar4;
        cf.b bVarV0;
        cf.d dVar5;
        this.f18206f = dVar;
        this.f18201a = pVar;
        cf.b bVarV02 = dVar.v0(cf.l.C2);
        int i10 = 0;
        if (bVarV02 instanceof cf.a) {
            cf.a aVar2 = (cf.a) bVarV02;
            int size = aVar2.f5416b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size - 1) {
                    break;
                }
                int i12 = i11 + 1;
                cf.b bVarL0 = aVar2.l0(i11);
                if (bVarL0 instanceof cf.n) {
                    cf.n nVar = (cf.n) bVarL0;
                    int i13 = i11 + 2;
                    cf.b bVarL02 = aVar2.l0(i12);
                    if (bVarL02 instanceof cf.a) {
                        cf.a aVar3 = (cf.a) bVarL02;
                        int iK0 = nVar.k0();
                        int size2 = aVar3.f5416b.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            cf.b bVarL03 = aVar3.l0(i14);
                            if (bVarL03 instanceof cf.n) {
                                this.f18202b.put(Integer.valueOf(iK0 + i14), Float.valueOf(((cf.n) bVarL03).g0()));
                            } else {
                                Log.w("PdfBox-Android", "Expected a number array member, got " + bVarL03);
                            }
                        }
                        i11 = i13;
                    } else {
                        if (i13 >= size) {
                            Log.w("PdfBox-Android", "premature end of widths array");
                            break;
                        }
                        i11 += 3;
                        cf.b bVarL04 = aVar2.l0(i13);
                        if ((bVarL02 instanceof cf.n) && (bVarL04 instanceof cf.n)) {
                            int iK02 = ((cf.n) bVarL02).k0();
                            float fG0 = ((cf.n) bVarL04).g0();
                            for (int iK03 = nVar.k0(); iK03 <= iK02; iK03++) {
                                this.f18202b.put(Integer.valueOf(iK03), Float.valueOf(fG0));
                            }
                        } else {
                            Log.w("PdfBox-Android", "Expected two numbers, got " + bVarL02 + " and " + bVarL04);
                        }
                    }
                } else {
                    Log.w("PdfBox-Android", "Expected a number array member, got " + bVarL0);
                    i11 = i12;
                }
            }
        }
        HashMap map = this.f18204d;
        HashMap map2 = this.f18203c;
        float[] fArr = this.f18205e;
        cf.d dVar6 = this.f18206f;
        cf.b bVarV03 = dVar6.v0(cf.l.f5511r0);
        boolean z11 = true;
        if (bVarV03 instanceof cf.a) {
            cf.a aVar4 = (cf.a) bVarV03;
            cf.b bVarL05 = aVar4.l0(0);
            cf.b bVarL06 = aVar4.l0(1);
            if ((bVarL05 instanceof cf.n) && (bVarL06 instanceof cf.n)) {
                fArr[0] = ((cf.n) bVarL05).g0();
                fArr[1] = ((cf.n) bVarL06).g0();
            }
        }
        cf.b bVarV04 = dVar6.v0(cf.l.D2);
        if (bVarV04 instanceof cf.a) {
            cf.a aVar5 = (cf.a) bVarV04;
            int i15 = 0;
            while (i15 < aVar5.f5416b.size()) {
                cf.n nVar2 = (cf.n) aVar5.l0(i15);
                int i16 = i15 + 1;
                cf.b bVarL07 = aVar5.l0(i16);
                if (bVarL07 instanceof cf.a) {
                    cf.a aVar6 = (cf.a) bVarL07;
                    for (int i17 = i10; i17 < aVar6.f5416b.size(); i17 += 3) {
                        int iK04 = (i17 / 3) + nVar2.k0();
                        cf.n nVar3 = (cf.n) aVar6.l0(i17);
                        cf.n nVar4 = (cf.n) aVar6.l0(i17 + 1);
                        cf.n nVar5 = (cf.n) aVar6.l0(i17 + 2);
                        map2.put(Integer.valueOf(iK04), Float.valueOf(nVar3.g0()));
                        map.put(Integer.valueOf(iK04), new wf.f(nVar4.g0(), nVar5.g0()));
                    }
                } else {
                    int iK05 = nVar2.k0();
                    int iK06 = ((cf.n) bVarL07).k0();
                    cf.n nVar6 = (cf.n) aVar5.l0(i15 + 2);
                    cf.n nVar7 = (cf.n) aVar5.l0(i15 + 3);
                    int i18 = i15 + 4;
                    cf.n nVar8 = (cf.n) aVar5.l0(i18);
                    while (iK05 <= iK06) {
                        map2.put(Integer.valueOf(iK05), Float.valueOf(nVar6.g0()));
                        map.put(Integer.valueOf(iK05), new wf.f(nVar7.g0(), nVar8.g0()));
                        iK05++;
                        z11 = z11;
                    }
                    i16 = i18;
                }
                i15 = i16 + 1;
                z11 = z11;
                i10 = 0;
            }
        }
        boolean z12 = z11;
        new HashSet();
        if (this.f18207g == null && (dVar5 = (cf.d) this.f18206f.v0(cf.l.I0)) != null) {
            this.f18207g = new o(dVar5);
        }
        o oVar = this.f18207g;
        if (p0Var != null) {
            this.f18208h = p0Var;
            this.f18209j = z12;
        } else if (oVar != null) {
            cf.d dVar7 = oVar.f18221a;
            cf.b bVarV05 = dVar7.v0(cf.l.L0);
            jf.h hVar = bVarV05 instanceof t ? new jf.h((t) bVarV05) : null;
            if (hVar == null) {
                cf.b bVarV06 = dVar7.v0(cf.l.M0);
                hVar = bVarV06 instanceof t ? new jf.h((t) bVarV06) : null;
            }
            if (hVar == null) {
                cf.b bVarV07 = dVar7.v0(cf.l.K0);
                hVar = bVarV07 instanceof t ? new jf.h((t) bVarV07) : null;
            }
            if (hVar != null) {
                try {
                    p0Var2 = (d0) new b0(true, false).c(new x(hVar.f15719a.U0()));
                } catch (IOException e10) {
                    e = e10;
                    p0Var2 = null;
                }
                try {
                    if (p0Var2.f30898b.containsKey("CFF ")) {
                        Log.w("PdfBox-Android", "Found CFF/OTF but expected embedded TTF font " + oVar.a());
                    }
                } catch (IOException e11) {
                    e = e11;
                    Log.w("PdfBox-Android", "Could not read embedded OTF for font " + this.f18206f.J0(cf.l.f5529w), e);
                    this.f18209j = p0Var2 == null;
                    if (p0Var2 == null) {
                    }
                    this.f18208h = p0Var2;
                    int i19 = 0;
                    this.f18210k = this.f18208h.f0(false);
                    bVarV0 = this.f18206f.v0(cf.l.M);
                    if (bVarV0 instanceof t) {
                    }
                }
            } else {
                p0Var2 = null;
            }
            this.f18209j = p0Var2 == null;
            if (p0Var2 == null) {
                if (j.f18199a == null) {
                    j.f18199a = j.a.f18200a;
                }
                i iVar = j.f18199a;
                String strJ0 = this.f18206f.J0(cf.l.f5529w);
                if (this.f18207g == null && (dVar4 = (cf.d) this.f18206f.v0(cf.l.I0)) != null) {
                    this.f18207g = new o(dVar4);
                }
                o oVar2 = this.f18207g;
                m mVarA = a();
                d0 d0Var = (d0) iVar.c(f.f18188b, strJ0);
                if (d0Var != null) {
                    aVar = new a(d0Var, null, false);
                } else {
                    p0 p0Var3 = (p0) iVar.c(f.f18187a, strJ0);
                    if (p0Var3 != null) {
                        aVar = new a(null, p0Var3, false);
                    } else if (mVarA != null) {
                        cf.d dVar8 = mVarA.f18219a;
                        String str = dVar8.J0(cf.l.V1) + "-" + mVarA.a();
                        if (str.equals("Adobe-GB1") || str.equals("Adobe-CNS1") || str.equals("Adobe-Japan1") || str.equals("Adobe-Korea1")) {
                            PriorityQueue priorityQueue = new PriorityQueue(20);
                            for (g gVar : iVar.f18193b.values()) {
                                if (gVar.a() == null) {
                                    dVar2 = dVar8;
                                    b10 = 8;
                                    long jC = ((gVar.c() & BodyPartID.bodyIdMax) << 32) | (gVar.b() & BodyPartID.bodyIdMax);
                                    jC = "MalgunGothic-Semilight".equals(gVar.i()) ? jC & (-1441793) : jC;
                                    if ((mVarA.a().equals("GB1") && (jC & 262144) == 262144) || ((mVarA.a().equals("CNS1") && (jC & 1048576) == 1048576) || ((mVarA.a().equals("Japan1") && (jC & 131072) == 131072) || (mVarA.a().equals("Korea1") && ((jC & 524288) == 524288 || (jC & 2097152) == 2097152))))) {
                                        bVar = new i.b(gVar);
                                        bVarB = oVar2.b();
                                        dVar3 = oVar2.f18221a;
                                        if (bVarB != null) {
                                            if (dVar3.F0(cf.l.O0, CropImageView.DEFAULT_ASPECT_RATIO) > CropImageView.DEFAULT_ASPECT_RATIO) {
                                                bVar.f18197a = (1.0d - ((Math.abs(dVar3.F0(r4, CropImageView.DEFAULT_ASPECT_RATIO) - gVar.j()) / 100.0f) * 0.5d)) + bVar.f18197a;
                                            }
                                            priorityQueue.add(bVar);
                                        }
                                    }
                                } else if (gVar.a().f18169a.equals(dVar8.J0(cf.l.V1)) && gVar.a().f18170b.equals(mVarA.a())) {
                                    dVar2 = dVar8;
                                    b10 = 8;
                                    bVar = new i.b(gVar);
                                    bVarB = oVar2.b();
                                    dVar3 = oVar2.f18221a;
                                    if (bVarB != null || gVar.h() == null) {
                                        if (dVar3.F0(cf.l.O0, CropImageView.DEFAULT_ASPECT_RATIO) > CropImageView.DEFAULT_ASPECT_RATIO && gVar.j() > 0) {
                                            bVar.f18197a = (1.0d - ((Math.abs(dVar3.F0(r4, CropImageView.DEFAULT_ASPECT_RATIO) - gVar.j()) / 100.0f) * 0.5d)) + bVar.f18197a;
                                        }
                                    } else {
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange((byte[]) oVar2.b().f11560a, 2, 12);
                                        if (bArrCopyOfRange[0] == ((byte[]) gVar.h().f16945b)[0]) {
                                            if (bArrCopyOfRange[0] == 0) {
                                                d10 = 1.0d;
                                                if (gVar.i().toLowerCase().contains("barcode") || gVar.i().startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K)) {
                                                    u uVar = (u) dVar3.v0(cf.l.J0);
                                                    String string = uVar != null ? uVar.getString() : null;
                                                    string = string == null ? "" : string;
                                                    String strA = oVar2.a();
                                                    String str2 = strA != null ? strA : "";
                                                    if (!string.startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K) && !string.toLowerCase().contains("barcode") && !str2.startsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.K) && !str2.toLowerCase().contains("barcode")) {
                                                    }
                                                }
                                            } else {
                                                d10 = 1.0d;
                                            }
                                            if (bArrCopyOfRange[1] == ((byte[]) gVar.h().f16945b)[1]) {
                                                bVar.f18197a += 2.0d;
                                            } else {
                                                byte b11 = bArrCopyOfRange[1];
                                                if (b11 < 2 || b11 > 5 || ((byte[]) gVar.h().f16945b)[1] < 2 || ((byte[]) gVar.h().f16945b)[1] > 5) {
                                                    byte b12 = bArrCopyOfRange[1];
                                                    if (b12 >= 11 && b12 <= 13 && ((byte[]) gVar.h().f16945b)[1] >= 11 && ((byte[]) gVar.h().f16945b)[1] <= 13) {
                                                        bVar.f18197a += d10;
                                                    } else if (bArrCopyOfRange[1] != 0 && ((byte[]) gVar.h().f16945b)[1] != 0) {
                                                        bVar.f18197a -= d10;
                                                    }
                                                } else {
                                                    bVar.f18197a += d10;
                                                }
                                            }
                                            byte b13 = ((byte[]) gVar.h().f16945b)[2];
                                            int iJ = gVar.j();
                                            byte b14 = iJ != 100 ? iJ != 200 ? iJ != 300 ? iJ != 400 ? iJ != 500 ? iJ != 600 ? iJ != 700 ? iJ != 800 ? iJ != 900 ? (byte) 0 : (byte) 10 : (byte) 9 : b10 : (byte) 7 : (byte) 6 : (byte) 5 : (byte) 4 : (byte) 3 : (byte) 2;
                                            b13 = Math.abs(b13 - b14) > 2 ? b14 : b13;
                                            byte b15 = bArrCopyOfRange[2];
                                            if (b15 == b13) {
                                                bVar.f18197a += 2.0d;
                                            } else if (b15 > 1 && b13 > 1) {
                                                bVar.f18197a = (d10 - (Math.abs(b15 - b13) * 0.5d)) + bVar.f18197a;
                                            }
                                        }
                                    }
                                    priorityQueue.add(bVar);
                                } else {
                                    dVar2 = dVar8;
                                }
                                dVar8 = dVar2;
                            }
                            i.b bVar2 = (i.b) priorityQueue.poll();
                            if (bVar2 != null) {
                                qe.a aVarE = bVar2.f18198b.e();
                                if (aVarE instanceof d0) {
                                    aVar = new a((d0) aVarE, null, true);
                                } else {
                                    z10 = true;
                                    if (aVarE != null) {
                                        aVar = new a(null, aVarE, true);
                                    }
                                }
                                p0 p0Var4 = aVar.f18166a;
                                p0Var2 = p0Var4 == null ? (p0) aVar.f18168c : p0Var4;
                                if (aVar.f18167b) {
                                    Log.w("PdfBox-Android", "Using fallback font " + p0Var2.z() + " for CID-keyed TrueType font " + this.f18206f.J0(cf.l.f5529w));
                                }
                            } else {
                                z10 = true;
                            }
                        } else {
                            z10 = true;
                        }
                        aVar = new a(null, iVar.f18194c, z10);
                        p0 p0Var42 = aVar.f18166a;
                        p0Var2 = p0Var42 == null ? (p0) aVar.f18168c : p0Var42;
                        if (aVar.f18167b) {
                        }
                    }
                }
                p0 p0Var422 = aVar.f18166a;
                p0Var2 = p0Var422 == null ? (p0) aVar.f18168c : p0Var422;
                if (aVar.f18167b) {
                }
            }
            this.f18208h = p0Var2;
        }
        int i192 = 0;
        this.f18210k = this.f18208h.f0(false);
        bVarV0 = this.f18206f.v0(cf.l.M);
        if (bVarV0 instanceof t) {
            return;
        }
        cf.h hVarU0 = ((t) bVarV0).U0();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ef.a.c(hVarU0, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ef.a.b(hVarU0);
        int length = byteArray.length / 2;
        int[] iArr = new int[length];
        for (int i20 = 0; i20 < length; i20++) {
            iArr[i20] = ((byteArray[i192] & 255) << 8) | (byteArray[i192 + 1] & 255);
            i192 += 2;
        }
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f18206f;
    }

    public final m a() {
        cf.b bVarV0 = this.f18206f.v0(cf.l.O);
        if (bVarV0 instanceof cf.d) {
            return new m((cf.d) bVarV0);
        }
        return null;
    }
}
