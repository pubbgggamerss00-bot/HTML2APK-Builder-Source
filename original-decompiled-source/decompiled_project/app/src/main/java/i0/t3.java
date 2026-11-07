package i0;

import i0.y4;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes.dex */
public final class t3 extends kotlin.jvm.internal.s implements eh.l<m0.s2, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f13602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3 f13603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f13604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(a2 a2Var, u3 u3Var, kotlin.jvm.internal.b0 b0Var) {
        super(1);
        this.f13602a = a2Var;
        this.f13603b = u3Var;
        this.f13604c = b0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(m0.s2 s2Var) {
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        t2.h0 h0Var;
        t2.h0 h0Var2;
        l4 l4Var;
        l4 l4Var2;
        t2.h0 h0Var3;
        t2.h0 h0Var4;
        l4 l4Var3;
        l4 l4Var4;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        y4.a aVar;
        m0.s2 s2Var2 = s2Var;
        int iOrdinal = this.f13602a.ordinal();
        y2.c0 c0Var = null;
        u3 u3Var = this.f13603b;
        switch (iOrdinal) {
            case 0:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (!t2.j0.b(s2Var2.f17383f)) {
                        if (!s2Var2.e()) {
                            int iD = t2.j0.d(s2Var2.f17383f);
                            s2Var2.l(iD, iD);
                            break;
                        } else {
                            int iE = t2.j0.e(s2Var2.f17383f);
                            s2Var2.l(iE, iE);
                            break;
                        }
                    } else {
                        l3.f13417a.invoke(s2Var2);
                        break;
                    }
                }
                break;
            case 1:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (!t2.j0.b(s2Var2.f17383f)) {
                        if (!s2Var2.e()) {
                            int iE2 = t2.j0.e(s2Var2.f17383f);
                            s2Var2.l(iE2, iE2);
                            break;
                        } else {
                            int iD2 = t2.j0.d(s2Var2.f17383f);
                            s2Var2.l(iD2, iD2);
                            break;
                        }
                    } else {
                        m3.f13435a.invoke(s2Var2);
                        break;
                    }
                }
                break;
            case 2:
                m0.p3 p3Var = s2Var2.f17382e;
                p3Var.f17457a = null;
                t2.b bVar = s2Var2.f17384g;
                String str = bVar.f27761b;
                String str2 = bVar.f27761b;
                if (str.length() > 0) {
                    if (!s2Var2.e()) {
                        p3Var.f17457a = null;
                        if (str2.length() > 0 && (numD = s2Var2.d()) != null) {
                            int iIntValue = numD.intValue();
                            s2Var2.l(iIntValue, iIntValue);
                            break;
                        }
                    } else {
                        p3Var.f17457a = null;
                        if (str2.length() > 0 && (numC = s2Var2.c()) != null) {
                            int iIntValue2 = numC.intValue();
                            s2Var2.l(iIntValue2, iIntValue2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                m0.p3 p3Var2 = s2Var2.f17382e;
                p3Var2.f17457a = null;
                t2.b bVar2 = s2Var2.f17384g;
                String str3 = bVar2.f27761b;
                String str4 = bVar2.f27761b;
                if (str3.length() > 0) {
                    if (!s2Var2.e()) {
                        p3Var2.f17457a = null;
                        if (str4.length() > 0 && (numC2 = s2Var2.c()) != null) {
                            int iIntValue3 = numC2.intValue();
                            s2Var2.l(iIntValue3, iIntValue3);
                            break;
                        }
                    } else {
                        p3Var2.f17457a = null;
                        if (str4.length() > 0 && (numD2 = s2Var2.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            s2Var2.l(iIntValue4, iIntValue4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                s2Var2.g();
                break;
            case 5:
                s2Var2.h();
                break;
            case 6:
                s2Var2.j();
                break;
            case 7:
                s2Var2.i();
                break;
            case 8:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (!s2Var2.e()) {
                        s2Var2.i();
                        break;
                    } else {
                        s2Var2.j();
                        break;
                    }
                }
                break;
            case 9:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (!s2Var2.e()) {
                        s2Var2.j();
                        break;
                    } else {
                        s2Var2.i();
                        break;
                    }
                }
                break;
            case 10:
                if (s2Var2.f17384g.f27761b.length() > 0 && (h0Var = s2Var2.f17380c) != null) {
                    int iF = s2Var2.f(h0Var, -1);
                    s2Var2.l(iF, iF);
                    break;
                }
                break;
            case 11:
                if (s2Var2.f17384g.f27761b.length() > 0 && (h0Var2 = s2Var2.f17380c) != null) {
                    int iF2 = s2Var2.f(h0Var2, 1);
                    s2Var2.l(iF2, iF2);
                    break;
                }
                break;
            case 12:
                if (s2Var2.f17384g.f27761b.length() > 0 && (l4Var = s2Var2.f17509i) != null) {
                    int iO = s2Var2.o(l4Var, -1);
                    s2Var2.l(iO, iO);
                    break;
                }
                break;
            case 13:
                if (s2Var2.f17384g.f27761b.length() > 0 && (l4Var2 = s2Var2.f17509i) != null) {
                    int iO2 = s2Var2.o(l4Var2, 1);
                    s2Var2.l(iO2, iO2);
                    break;
                }
                break;
            case 14:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    s2Var2.l(0, 0);
                    break;
                }
                break;
            case 15:
                s2Var2.f17382e.f17457a = null;
                t2.b bVar3 = s2Var2.f17384g;
                if (bVar3.f27761b.length() > 0) {
                    int length = bVar3.f27761b.length();
                    s2Var2.l(length, length);
                    break;
                }
                break;
            case 16:
                u3Var.f13620b.b(false);
                break;
            case 17:
                u3Var.f13620b.m();
                break;
            case 18:
                u3Var.f13620b.d();
                break;
            case 19:
                List<y2.i> listN = s2Var2.n(n3.f13447a);
                if (listN != null) {
                    u3Var.a(listN);
                    break;
                }
                break;
            case 20:
                List<y2.i> listN2 = s2Var2.n(o3.f13474a);
                if (listN2 != null) {
                    u3Var.a(listN2);
                    break;
                }
                break;
            case 21:
                List<y2.i> listN3 = s2Var2.n(p3.f13502a);
                if (listN3 != null) {
                    u3Var.a(listN3);
                    break;
                }
                break;
            case 22:
                List<y2.i> listN4 = s2Var2.n(q3.f13523a);
                if (listN4 != null) {
                    u3Var.a(listN4);
                    break;
                }
                break;
            case 23:
                List<y2.i> listN5 = s2Var2.n(r3.f13545a);
                if (listN5 != null) {
                    u3Var.a(listN5);
                    break;
                }
                break;
            case 24:
                List<y2.i> listN6 = s2Var2.n(s3.f13575a);
                if (listN6 != null) {
                    u3Var.a(listN6);
                    break;
                }
                break;
            case 25:
                s2Var2.f17382e.f17457a = null;
                t2.b bVar4 = s2Var2.f17384g;
                if (bVar4.f27761b.length() > 0) {
                    s2Var2.l(0, bVar4.f27761b.length());
                    break;
                }
                break;
            case 26:
                m0.p3 p3Var3 = s2Var2.f17382e;
                p3Var3.f17457a = null;
                t2.b bVar5 = s2Var2.f17384g;
                String str5 = bVar5.f27761b;
                String str6 = bVar5.f27761b;
                if (str5.length() > 0) {
                    if (s2Var2.e()) {
                        p3Var3.f17457a = null;
                        if (str6.length() > 0) {
                            long j10 = s2Var2.f17383f;
                            int i10 = t2.j0.f27838c;
                            int iB = v2.b((int) (j10 & BodyPartID.bodyIdMax), str6);
                            if (iB != -1) {
                                s2Var2.l(iB, iB);
                            }
                        }
                    } else {
                        p3Var3.f17457a = null;
                        if (str6.length() > 0) {
                            long j11 = s2Var2.f17383f;
                            int i11 = t2.j0.f27838c;
                            int iA = v2.a((int) (j11 & BodyPartID.bodyIdMax), str6);
                            if (iA != -1) {
                                s2Var2.l(iA, iA);
                            }
                        }
                    }
                }
                s2Var2.k();
                break;
            case 27:
                m0.p3 p3Var4 = s2Var2.f17382e;
                p3Var4.f17457a = null;
                t2.b bVar6 = s2Var2.f17384g;
                String str7 = bVar6.f27761b;
                String str8 = bVar6.f27761b;
                if (str7.length() > 0) {
                    if (s2Var2.e()) {
                        p3Var4.f17457a = null;
                        if (str8.length() > 0) {
                            long j12 = s2Var2.f17383f;
                            int i12 = t2.j0.f27838c;
                            int iA2 = v2.a((int) (j12 & BodyPartID.bodyIdMax), str8);
                            if (iA2 != -1) {
                                s2Var2.l(iA2, iA2);
                            }
                        }
                    } else {
                        p3Var4.f17457a = null;
                        if (str8.length() > 0) {
                            long j13 = s2Var2.f17383f;
                            int i13 = t2.j0.f27838c;
                            int iB2 = v2.b((int) (j13 & BodyPartID.bodyIdMax), str8);
                            if (iB2 != -1) {
                                s2Var2.l(iB2, iB2);
                            }
                        }
                    }
                }
                s2Var2.k();
                break;
            case 28:
                if (s2Var2.f17384g.f27761b.length() > 0 && (h0Var3 = s2Var2.f17380c) != null) {
                    int iF3 = s2Var2.f(h0Var3, -1);
                    s2Var2.l(iF3, iF3);
                }
                s2Var2.k();
                break;
            case 29:
                if (s2Var2.f17384g.f27761b.length() > 0 && (h0Var4 = s2Var2.f17380c) != null) {
                    int iF4 = s2Var2.f(h0Var4, 1);
                    s2Var2.l(iF4, iF4);
                }
                s2Var2.k();
                break;
            case 30:
                if (s2Var2.f17384g.f27761b.length() > 0 && (l4Var3 = s2Var2.f17509i) != null) {
                    int iO3 = s2Var2.o(l4Var3, -1);
                    s2Var2.l(iO3, iO3);
                }
                s2Var2.k();
                break;
            case 31:
                if (s2Var2.f17384g.f27761b.length() > 0 && (l4Var4 = s2Var2.f17509i) != null) {
                    int iO4 = s2Var2.o(l4Var4, 1);
                    s2Var2.l(iO4, iO4);
                }
                s2Var2.k();
                break;
            case 32:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    s2Var2.l(0, 0);
                }
                s2Var2.k();
                break;
            case 33:
                s2Var2.f17382e.f17457a = null;
                t2.b bVar7 = s2Var2.f17384g;
                if (bVar7.f27761b.length() > 0) {
                    int length2 = bVar7.f27761b.length();
                    s2Var2.l(length2, length2);
                }
                s2Var2.k();
                break;
            case 34:
                m0.p3 p3Var5 = s2Var2.f17382e;
                p3Var5.f17457a = null;
                t2.b bVar8 = s2Var2.f17384g;
                String str9 = bVar8.f27761b;
                String str10 = bVar8.f27761b;
                if (str9.length() > 0) {
                    if (s2Var2.e()) {
                        p3Var5.f17457a = null;
                        if (str10.length() > 0 && (numD3 = s2Var2.d()) != null) {
                            int iIntValue5 = numD3.intValue();
                            s2Var2.l(iIntValue5, iIntValue5);
                        }
                    } else {
                        p3Var5.f17457a = null;
                        if (str10.length() > 0 && (numC3 = s2Var2.c()) != null) {
                            int iIntValue6 = numC3.intValue();
                            s2Var2.l(iIntValue6, iIntValue6);
                        }
                    }
                }
                s2Var2.k();
                break;
            case 35:
                m0.p3 p3Var6 = s2Var2.f17382e;
                p3Var6.f17457a = null;
                t2.b bVar9 = s2Var2.f17384g;
                String str11 = bVar9.f27761b;
                String str12 = bVar9.f27761b;
                if (str11.length() > 0) {
                    if (s2Var2.e()) {
                        p3Var6.f17457a = null;
                        if (str12.length() > 0 && (numC4 = s2Var2.c()) != null) {
                            int iIntValue7 = numC4.intValue();
                            s2Var2.l(iIntValue7, iIntValue7);
                        }
                    } else {
                        p3Var6.f17457a = null;
                        if (str12.length() > 0 && (numD4 = s2Var2.d()) != null) {
                            int iIntValue8 = numD4.intValue();
                            s2Var2.l(iIntValue8, iIntValue8);
                        }
                    }
                }
                s2Var2.k();
                break;
            case 36:
                s2Var2.g();
                s2Var2.k();
                break;
            case 37:
                s2Var2.h();
                s2Var2.k();
                break;
            case 38:
                s2Var2.j();
                s2Var2.k();
                break;
            case 39:
                s2Var2.i();
                s2Var2.k();
                break;
            case 40:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (s2Var2.e()) {
                        s2Var2.j();
                    } else {
                        s2Var2.i();
                    }
                }
                s2Var2.k();
                break;
            case 41:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    if (s2Var2.e()) {
                        s2Var2.i();
                    } else {
                        s2Var2.j();
                    }
                }
                s2Var2.k();
                break;
            case 42:
                s2Var2.f17382e.f17457a = null;
                if (s2Var2.f17384g.f27761b.length() > 0) {
                    long j14 = s2Var2.f17383f;
                    int i14 = t2.j0.f27838c;
                    int i15 = (int) (j14 & BodyPartID.bodyIdMax);
                    s2Var2.l(i15, i15);
                    break;
                }
                break;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (!u3Var.f13623e) {
                    u3Var.a(c0.g0.c(new y2.a("\n", 1)));
                    break;
                } else {
                    u3Var.f13619a.f13359w.invoke(new y2.n(u3Var.f13630l));
                    break;
                }
            case 44:
                if (!u3Var.f13623e) {
                    u3Var.a(c0.g0.c(new y2.a("\t", 1)));
                    break;
                } else {
                    this.f13604c.f16318a = false;
                    break;
                }
            case 45:
                y4 y4Var = u3Var.f13626h;
                if (y4Var != null) {
                    y4Var.a(y2.c0.b(s2Var2.f17508h, s2Var2.f17384g, s2Var2.f17383f, 4));
                }
                y4 y4Var2 = u3Var.f13626h;
                if (y4Var2 != null) {
                    y4.a aVar2 = y4Var2.f13708b;
                    if (aVar2 != null && (aVar = aVar2.f13713a) != null) {
                        y4Var2.f13708b = aVar;
                        y4Var2.f13710d -= aVar2.f13714b.f33682a.f27761b.length();
                        y4Var2.f13709c = new y4.a(y4Var2.f13709c, aVar2.f13714b);
                        c0Var = aVar.f13714b;
                    }
                    if (c0Var != null) {
                        u3Var.f13629k.invoke(c0Var);
                        break;
                    }
                }
                break;
            case 46:
                y4 y4Var3 = u3Var.f13626h;
                if (y4Var3 != null) {
                    y4.a aVar3 = y4Var3.f13709c;
                    if (aVar3 != null) {
                        y4Var3.f13709c = aVar3.f13713a;
                        y2.c0 c0Var2 = aVar3.f13714b;
                        y4Var3.f13708b = new y4.a(y4Var3.f13708b, c0Var2);
                        y4Var3.f13710d = c0Var2.f33682a.f27761b.length() + y4Var3.f13710d;
                        c0Var = aVar3.f13714b;
                    }
                    if (c0Var != null) {
                        u3Var.f13629k.invoke(c0Var);
                        break;
                    }
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
