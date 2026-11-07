package ve;

import android.graphics.Path;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class p0 implements qe.a, Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final k0 f30899c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f30900d;

    /* renamed from: a, reason: collision with root package name */
    public int f30897a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f30898b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f30901e = new ArrayList();

    public p0(k0 k0Var) {
        this.f30899c = k0Var;
    }

    public final int E() throws IOException {
        if (this.f30897a == -1) {
            w wVar = (w) Z("maxp");
            if (wVar != null) {
                this.f30897a = wVar.f30950f;
            } else {
                this.f30897a = 0;
            }
        }
        return this.f30897a;
    }

    public final a0 M() throws IOException {
        return (a0) Z("OS/2");
    }

    public Path N(String str) throws IOException {
        k kVarB = h().b(g0(str));
        if (kVarB == null) {
            return new Path();
        }
        i iVar = kVarB.f30836c;
        int iA = iVar.a();
        m[] mVarArr = new m[iA];
        int i10 = 0;
        int i11 = 0;
        int iE = -1;
        while (true) {
            boolean z10 = true;
            if (i10 >= iA) {
                break;
            }
            if (iE == -1) {
                iE = iVar.e(i11);
            }
            boolean z11 = iE == i10;
            if (z11) {
                i11++;
                iE = -1;
            }
            short sB = iVar.b(i10);
            short sD = iVar.d(i10);
            if ((iVar.f(i10) & 1) == 0) {
                z10 = false;
            }
            mVarArr[i10] = new m(sB, sD, z10, z11);
            i10++;
        }
        Path path = new Path();
        int i12 = 0;
        for (int i13 = 0; i13 < iA; i13++) {
            m mVar = mVarArr[i13];
            if (mVar.f30842d) {
                m mVar2 = mVarArr[i12];
                ArrayList arrayList = new ArrayList();
                for (int i14 = i12; i14 <= i13; i14++) {
                    arrayList.add(mVarArr[i14]);
                }
                if (mVarArr[i12].f30841c) {
                    arrayList.add(mVar2);
                } else if (mVarArr[i13].f30841c) {
                    arrayList.add(0, mVar);
                } else {
                    int i15 = mVar2.f30839a;
                    int iA2 = m.b.a(mVar.f30839a, i15, 2, i15);
                    int i16 = mVar2.f30840b;
                    m mVar3 = new m(iA2, m.b.a(mVar.f30840b, i16, 2, i16), true, false);
                    arrayList.add(0, mVar3);
                    arrayList.add(mVar3);
                }
                m mVar4 = (m) arrayList.get(0);
                path.moveTo(mVar4.f30839a, mVar4.f30840b);
                int size = arrayList.size();
                int i17 = 1;
                while (i17 < size) {
                    m mVar5 = (m) arrayList.get(i17);
                    boolean z12 = mVar5.f30841c;
                    int i18 = mVar5.f30840b;
                    int i19 = mVar5.f30839a;
                    if (z12) {
                        path.lineTo(i19, i18);
                    } else {
                        int i20 = i17 + 1;
                        if (((m) arrayList.get(i20)).f30841c) {
                            m mVar6 = (m) arrayList.get(i20);
                            path.quadTo(i19, i18, mVar6.f30839a, mVar6.f30840b);
                            i17 = i20;
                        } else {
                            m mVar7 = (m) arrayList.get(i20);
                            path.quadTo(i19, i18, m.b.a(mVar7.f30839a, i19, 2, i19), m.b.a(mVar7.f30840b, i18, 2, i18));
                        }
                    }
                    i17++;
                }
                path.close();
                i12 = i13 + 1;
            }
        }
        return path;
    }

    public final synchronized n0 Z(String str) throws IOException {
        n0 n0Var;
        n0Var = (n0) this.f30898b.get(str);
        if (n0Var != null && !n0Var.f30855d) {
            i0(n0Var);
        }
        return n0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30899c.close();
    }

    public final synchronized byte[] d0(n0 n0Var) throws IOException {
        byte[] bArrZ;
        long jH = this.f30899c.h();
        this.f30899c.seek(n0Var.f30853b);
        bArrZ = this.f30899c.z((int) n0Var.f30854c);
        this.f30899c.seek(jH);
        return bArrZ;
    }

    public final d e0(boolean z10) throws IOException {
        e eVar = (e) Z("cmap");
        if (eVar == null) {
            if (!z10) {
                return null;
            }
            throw new IOException("The TrueType font " + z() + " does not contain a 'cmap' table");
        }
        d dVarB = eVar.b(0, 4);
        if (dVarB == null) {
            dVarB = eVar.b(3, 10);
        }
        if (dVarB == null) {
            dVarB = eVar.b(0, 3);
        }
        if (dVarB == null) {
            dVarB = eVar.b(3, 1);
        }
        if (dVarB == null) {
            dVarB = eVar.b(3, 0);
        }
        if (dVarB == null) {
            if (z10) {
                throw new IOException("The TrueType font does not contain a Unicode cmap");
            }
            d[] dVarArr = eVar.f30789f;
            if (dVarArr.length > 0) {
                return dVarArr[0];
            }
        }
        return dVarB;
    }

    public final c f0(boolean z10) throws IOException {
        o oVar;
        d dVarE0 = e0(z10);
        ArrayList arrayList = this.f30901e;
        return (arrayList.isEmpty() || (oVar = (o) Z("GSUB")) == null) ? dVarE0 : new i0(dVarE0, oVar, Collections.unmodifiableList(arrayList));
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g0(String str) throws NumberFormatException, IOException {
        int iCodePointAt;
        Integer num;
        synchronized (this) {
            try {
                if (this.f30900d == null && ((g0) Z("post")) != null) {
                    String[] strArr = ((g0) Z("post")).f30814o;
                    if (strArr != null) {
                        this.f30900d = new HashMap(strArr.length);
                        for (int i10 = 0; i10 < strArr.length; i10++) {
                            this.f30900d.put(strArr[i10], Integer.valueOf(i10));
                        }
                    } else {
                        this.f30900d = new HashMap();
                    }
                }
            } finally {
            }
        }
        HashMap map = this.f30900d;
        if (map != null && (num = (Integer) map.get(str)) != null && num.intValue() > 0 && num.intValue() < ((w) Z("maxp")).f30950f) {
            return num.intValue();
        }
        if (str.startsWith("uni") && str.length() == 7) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i11 = 3;
            while (true) {
                int i12 = i11 + 4;
                if (i12 > length) {
                    break;
                }
                try {
                    int i13 = Integer.parseInt(str.substring(i11, i12), 16);
                    if (i13 <= 55295 || i13 >= 57344) {
                        sb.append((char) i13);
                    }
                    i11 = i12;
                } catch (NumberFormatException unused) {
                }
                iCodePointAt = -1;
            }
            String string = sb.toString();
            if (string.length() != 0) {
                iCodePointAt = string.codePointAt(0);
            }
        } else {
            iCodePointAt = -1;
        }
        if (iCodePointAt > -1) {
            return f0(false).b(iCodePointAt);
        }
        return 0;
    }

    public p h() throws IOException {
        return (p) Z("glyf");
    }

    public final void i0(n0 n0Var) throws IOException {
        synchronized (this.f30899c) {
            long jH = this.f30899c.h();
            this.f30899c.seek(n0Var.f30853b);
            n0Var.a(this, this.f30899c);
            this.f30899c.seek(jH);
        }
    }

    public void k0(float f10) {
    }

    public final q l() throws IOException {
        return (q) Z("head");
    }

    public final s p() throws IOException {
        return (s) Z("hmtx");
    }

    public final String toString() {
        try {
            z zVar = (z) Z("name");
            return zVar != null ? zVar.f30975h : "(null)";
        } catch (IOException e10) {
            return "(null - " + e10.getMessage() + ")";
        }
    }

    public final String z() throws IOException {
        z zVar = (z) Z("name");
        if (zVar != null) {
            return zVar.f30975h;
        }
        return null;
    }
}
