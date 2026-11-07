package ve;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30815b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f30816c;

    /* renamed from: d, reason: collision with root package name */
    public final p f30817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30819f;

    /* renamed from: g, reason: collision with root package name */
    public int f30820g;

    /* renamed from: h, reason: collision with root package name */
    public int f30821h;

    public h(k0 k0Var, p pVar) throws IOException {
        short s10;
        super((short) -1);
        this.f30815b = new ArrayList();
        this.f30816c = new HashMap();
        int i10 = 0;
        this.f30818e = false;
        this.f30819f = false;
        this.f30820g = -1;
        this.f30821h = -1;
        this.f30817d = pVar;
        do {
            g gVar = new g(k0Var);
            this.f30815b.add(gVar);
            s10 = gVar.f30797e;
        } while ((s10 & 32) != 0);
        if ((s10 & 256) != 0) {
            k0Var.f0(k0Var.i0());
        }
        ArrayList arrayList = this.f30815b;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                int i11 = ((g) obj).f30798f;
                k kVarB = this.f30817d.b(i11);
                if (kVarB != null) {
                    this.f30816c.put(Integer.valueOf(i11), kVarB.f30836c);
                }
            } catch (IOException e10) {
                Log.e("PdfBox-Android", e10.getMessage(), e10);
            }
        }
    }

    @Override // ve.l
    public final int a() {
        if (!this.f30819f) {
            Log.e("PdfBox-Android", "getPointCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f30820g < 0) {
            g gVar = (g) l.b.b(this.f30815b, 1);
            l lVar = (l) this.f30816c.get(Integer.valueOf(gVar.f30798f));
            if (lVar == null) {
                Log.e("PdfBox-Android", "GlyphDescription for index " + gVar.f30798f + " is null, returning 0");
                this.f30820g = 0;
            } else {
                this.f30820g = lVar.a() + gVar.f30793a;
            }
        }
        return this.f30820g;
    }

    @Override // ve.l
    public final short b(int i10) {
        g gVarI = i(i10);
        if (gVarI == null) {
            return (short) 0;
        }
        l lVar = (l) this.f30816c.get(Integer.valueOf(gVarI.f30798f));
        int i11 = i10 - gVarI.f30793a;
        short sB = lVar.b(i11);
        return (short) (Math.round((float) ((lVar.d(i11) * gVarI.f30802j) + (sB * gVarI.f30799g))) + gVarI.f30803k);
    }

    @Override // ve.l
    public final boolean c() {
        return true;
    }

    @Override // ve.l
    public final short d(int i10) {
        g gVarI = i(i10);
        if (gVarI == null) {
            return (short) 0;
        }
        l lVar = (l) this.f30816c.get(Integer.valueOf(gVarI.f30798f));
        int i11 = i10 - gVarI.f30793a;
        short sB = lVar.b(i11);
        return (short) (Math.round((float) ((lVar.d(i11) * gVarI.f30800h) + (sB * gVarI.f30801i))) + gVarI.f30804l);
    }

    @Override // ve.l
    public final int e(int i10) {
        HashMap map;
        g gVar;
        ArrayList arrayList = this.f30815b;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            map = this.f30816c;
            if (i11 >= size) {
                gVar = null;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            gVar = (g) obj;
            l lVar = (l) map.get(Integer.valueOf(gVar.f30798f));
            int i12 = gVar.f30794b;
            if (i12 <= i10 && lVar != null && i10 < lVar.h() + i12) {
                break;
            }
        }
        if (gVar != null) {
            return ((l) map.get(Integer.valueOf(gVar.f30798f))).e(i10 - gVar.f30794b) + gVar.f30793a;
        }
        return 0;
    }

    @Override // ve.l
    public final byte f(int i10) {
        g gVarI = i(i10);
        if (gVarI == null) {
            return (byte) 0;
        }
        return ((l) this.f30816c.get(Integer.valueOf(gVarI.f30798f))).f(i10 - gVarI.f30793a);
    }

    @Override // ve.i, ve.l
    public final void g() {
        if (this.f30819f) {
            return;
        }
        if (this.f30818e) {
            Log.e("PdfBox-Android", "Circular reference in GlyfCompositeDesc");
            return;
        }
        this.f30818e = true;
        ArrayList arrayList = this.f30815b;
        int size = arrayList.size();
        int iA = 0;
        int iH = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            gVar.f30793a = iA;
            gVar.f30794b = iH;
            l lVar = (l) this.f30816c.get(Integer.valueOf(gVar.f30798f));
            if (lVar != null) {
                lVar.g();
                iA += lVar.a();
                iH += lVar.h();
            }
        }
        this.f30819f = true;
        this.f30818e = false;
    }

    @Override // ve.i, ve.l
    public final int h() {
        if (!this.f30819f) {
            Log.e("PdfBox-Android", "getContourCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f30821h < 0) {
            g gVar = (g) l.b.b(this.f30815b, 1);
            l lVar = (l) this.f30816c.get(Integer.valueOf(gVar.f30798f));
            if (lVar == null) {
                Log.e("PdfBox-Android", "missing glyph description for index " + gVar.f30798f);
                this.f30821h = 0;
            } else {
                this.f30821h = lVar.h() + gVar.f30794b;
            }
        }
        return this.f30821h;
    }

    public final g i(int i10) {
        ArrayList arrayList = this.f30815b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g gVar = (g) obj;
            l lVar = (l) this.f30816c.get(Integer.valueOf(gVar.f30798f));
            int i12 = gVar.f30793a;
            if (i12 <= i10 && lVar != null && i10 < lVar.a() + i12) {
                return gVar;
            }
        }
        return null;
    }
}
