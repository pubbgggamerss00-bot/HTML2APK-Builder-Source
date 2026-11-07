package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w2 implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public z0 f10014b;

    /* renamed from: c, reason: collision with root package name */
    public int f10015c;

    /* renamed from: d, reason: collision with root package name */
    public int f10016d;

    /* renamed from: e, reason: collision with root package name */
    public int f10017e;

    /* renamed from: g, reason: collision with root package name */
    public m4 f10019g;
    public y0 h;

    /* renamed from: i, reason: collision with root package name */
    public z2 f10020i;

    /* renamed from: j, reason: collision with root package name */
    public c6 f10021j;

    /* renamed from: a, reason: collision with root package name */
    public final ex0 f10013a = new ex0(6);

    /* renamed from: f, reason: collision with root package name */
    public long f10018f = -1;

    public final int a(p0 p0Var) {
        ex0 ex0Var = this.f10013a;
        ex0Var.g(2);
        p0Var.g(ex0Var.f4416a, 0, 2, false);
        return ex0Var.z();
    }

    public final void b() {
        z0 z0Var = this.f10014b;
        z0Var.getClass();
        z0Var.d();
        this.f10014b.f(new l1(-9223372036854775807L, 0L));
        this.f10015c = 6;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        if (j6 == 0) {
            this.f10015c = 0;
            this.f10021j = null;
        } else if (this.f10015c == 5) {
            c6 c6Var = this.f10021j;
            c6Var.getClass();
            c6Var.c(j6, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) throws EOFException, InterruptedIOException {
        p0 p0Var = (p0) y0Var;
        if (a(p0Var) == 65496) {
            int iA = a(p0Var);
            this.f10016d = iA;
            ex0 ex0Var = this.f10013a;
            if (iA == 65504) {
                ex0Var.g(2);
                p0Var.g(ex0Var.f4416a, 0, 2, false);
                p0Var.k(ex0Var.z() - 2, false);
                iA = a(p0Var);
                this.f10016d = iA;
            }
            if (iA == 65505) {
                p0Var.k(2, false);
                ex0Var.g(6);
                p0Var.g(ex0Var.f4416a, 0, 6, false);
                if (ex0Var.D() == 1165519206 && ex0Var.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0261  */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws XmlPullParserException, IOException, NumberFormatException {
        String strG;
        long j6;
        y2 y2Var;
        cp1 cp1Var;
        int i6;
        int i7;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        XmlPullParser xmlPullParserNewPullParser;
        int i8 = this.f10015c;
        ex0 ex0Var = this.f10013a;
        if (i8 == 0) {
            ex0Var.g(2);
            y0Var.i(0, 2, ex0Var.f4416a);
            int iZ = ex0Var.z();
            this.f10016d = iZ;
            if (iZ == 65498) {
                if (this.f10018f != -1) {
                    this.f10015c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((iZ < 65488 || iZ > 65497) && iZ != 65281) {
                this.f10015c = 1;
            }
            return 0;
        }
        if (i8 == 1) {
            ex0Var.g(2);
            y0Var.i(0, 2, ex0Var.f4416a);
            this.f10017e = ex0Var.z() - 2;
            this.f10015c = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f10020i == null || y0Var != this.h) {
                    this.h = y0Var;
                    this.f10020i = new z2(y0Var, this.f10018f);
                }
                c6 c6Var = this.f10021j;
                c6Var.getClass();
                int iE = c6Var.e(this.f10020i, b1Var);
                if (iE == 1) {
                    b1Var.f2886a += this.f10018f;
                }
                return iE;
            }
            long jZzf = y0Var.zzf();
            long j12 = this.f10018f;
            if (jZzf != j12) {
                b1Var.f2886a = j12;
                return 1;
            }
            if (!y0Var.g(ex0Var.f4416a, 0, 1, true)) {
                b();
                return 0;
            }
            y0Var.zzj();
            if (this.f10021j == null) {
                this.f10021j = new c6(z6.f11190i, 8);
            }
            z2 z2Var = new z2(y0Var, this.f10018f);
            this.f10020i = z2Var;
            if (!this.f10021j.d(z2Var)) {
                b();
                return 0;
            }
            c6 c6Var2 = this.f10021j;
            long j13 = this.f10018f;
            z0 z0Var = this.f10014b;
            z0Var.getClass();
            c6Var2.f(new b3(j13, z0Var));
            m4 m4Var = this.f10019g;
            m4Var.getClass();
            z0 z0Var2 = this.f10014b;
            z0Var2.getClass();
            s1 s1VarG = z0Var2.g(1024, 4);
            tk2 tk2Var = new tk2();
            tk2Var.f9329k = bk.e("image/jpeg");
            tk2Var.f9328j = new qh(-9223372036854775807L, m4Var);
            s1VarG.b(new w(tk2Var));
            this.f10015c = 5;
            return 0;
        }
        if (this.f10016d == 65505) {
            ex0 ex0Var2 = new ex0(this.f10017e);
            y0Var.i(0, this.f10017e, ex0Var2.f4416a);
            if (this.f10019g == null && "http://ns.adobe.com/xap/1.0/".equals(ex0Var2.G()) && (strG = ex0Var2.G()) != null) {
                long jZzd = y0Var.zzd();
                m4 m4Var2 = null;
                if (jZzd != -1) {
                    try {
                        xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        j6 = -1;
                        try {
                            xmlPullParserNewPullParser.setInput(new StringReader(strG));
                            xmlPullParserNewPullParser.next();
                        } catch (rn | NumberFormatException | XmlPullParserException unused) {
                            qs0.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            y2Var = null;
                            if (y2Var != null) {
                                boolean zEquals = false;
                                j7 = j6;
                                j8 = j7;
                                j9 = j8;
                                j10 = j9;
                                while (i7 >= 0) {
                                }
                                if (j9 != j6) {
                                    m4Var2 = new m4(j7, j8, y2Var.f10780a, j9, j10);
                                }
                            }
                            this.f10019g = m4Var2;
                            if (m4Var2 != null) {
                            }
                            this.f10015c = 0;
                            return 0;
                        }
                    } catch (rn | NumberFormatException | XmlPullParserException unused2) {
                        j6 = -1;
                    }
                    if (!y5.m(xmlPullParserNewPullParser, "x:xmpmeta")) {
                        throw rn.a(null, "Couldn't find xmp metadata");
                    }
                    zn1 zn1Var = bo1.f3236t;
                    cp1 cp1VarO = cp1.f3636w;
                    long j14 = -9223372036854775807L;
                    loop0: while (true) {
                        xmlPullParserNewPullParser.next();
                        if (y5.m(xmlPullParserNewPullParser, "rdf:Description")) {
                            String[] strArr = c3.f3385a;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= 4) {
                                    break loop0;
                                }
                                String strE = y5.e(xmlPullParserNewPullParser, strArr[i9]);
                                if (strE == null) {
                                    i9++;
                                } else {
                                    if (Integer.parseInt(strE) != 1) {
                                        break;
                                    }
                                    String[] strArr2 = c3.f3386b;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= 4) {
                                            break;
                                        }
                                        String strE2 = y5.e(xmlPullParserNewPullParser, strArr2[i10]);
                                        if (strE2 != null) {
                                            j14 = Long.parseLong(strE2);
                                            if (j14 == -1) {
                                                break;
                                            }
                                        } else {
                                            i10++;
                                        }
                                    }
                                    String[] strArr3 = c3.f3387c;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= 2) {
                                            cp1VarO = cp1.f3636w;
                                            break;
                                        }
                                        String strE3 = y5.e(xmlPullParserNewPullParser, strArr3[i11]);
                                        if (strE3 != null) {
                                            cp1VarO = bo1.o(new x2("image/jpeg", 0L, 0L), new x2("video/mp4", Long.parseLong(strE3), 0L));
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            }
                        } else if (y5.m(xmlPullParserNewPullParser, "Container:Directory")) {
                            cp1VarO = c3.a(xmlPullParserNewPullParser, "Container", "Item");
                        } else if (y5.m(xmlPullParserNewPullParser, "GContainer:Directory")) {
                            cp1VarO = c3.a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                        }
                        if (y5.i(xmlPullParserNewPullParser, "x:xmpmeta")) {
                            if (cp1VarO.isEmpty()) {
                                break loop0;
                            }
                            y2Var = new y2(j14, cp1VarO);
                        }
                    }
                    if (y2Var != null && (i6 = (cp1Var = (cp1) y2Var.f10781b).f3638v) >= 2) {
                        boolean zEquals2 = false;
                        j7 = j6;
                        j8 = j7;
                        j9 = j8;
                        j10 = j9;
                        for (i7 = i6 - 1; i7 >= 0; i7--) {
                            x2 x2Var = (x2) cp1Var.get(i7);
                            zEquals2 |= "video/mp4".equals(x2Var.f10334a);
                            if (i7 == 0) {
                                jZzd -= x2Var.f10336c;
                                j11 = 0;
                            } else {
                                j11 = jZzd - x2Var.f10335b;
                            }
                            long j15 = jZzd;
                            jZzd = j11;
                            if (zEquals2 && jZzd != j15) {
                                j10 = j15 - jZzd;
                                zEquals2 = false;
                                j9 = jZzd;
                            }
                            if (i7 == 0) {
                                j8 = j15;
                            }
                            if (i7 == 0) {
                                j7 = jZzd;
                            }
                        }
                        if (j9 != j6 && j10 != j6 && j7 != j6 && j8 != j6) {
                            m4Var2 = new m4(j7, j8, y2Var.f10780a, j9, j10);
                        }
                    }
                }
                this.f10019g = m4Var2;
                if (m4Var2 != null) {
                    this.f10018f = m4Var2.f6925v;
                }
            }
        } else {
            y0Var.b(this.f10017e);
        }
        this.f10015c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        this.f10014b = z0Var;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final List zzd() {
        zn1 zn1Var = bo1.f3236t;
        return cp1.f3636w;
    }
}
