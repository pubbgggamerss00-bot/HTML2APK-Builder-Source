package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x5 implements x0 {
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final w K;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public z0 F;
    public s1[] G;
    public s1[] H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final z6 f10360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10361b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10362c;
    public final byte[] h;

    /* renamed from: i, reason: collision with root package name */
    public final ex0 f10367i;

    /* renamed from: n, reason: collision with root package name */
    public final ba f10372n;

    /* renamed from: o, reason: collision with root package name */
    public cp1 f10373o;

    /* renamed from: p, reason: collision with root package name */
    public int f10374p;

    /* renamed from: q, reason: collision with root package name */
    public int f10375q;

    /* renamed from: r, reason: collision with root package name */
    public long f10376r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public ex0 f10377t;

    /* renamed from: u, reason: collision with root package name */
    public long f10378u;

    /* renamed from: v, reason: collision with root package name */
    public int f10379v;

    /* renamed from: w, reason: collision with root package name */
    public long f10380w;

    /* renamed from: x, reason: collision with root package name */
    public long f10381x;

    /* renamed from: y, reason: collision with root package name */
    public long f10382y;

    /* renamed from: z, reason: collision with root package name */
    public w5 f10383z;

    /* renamed from: j, reason: collision with root package name */
    public final r0 f10368j = new r0(1);

    /* renamed from: k, reason: collision with root package name */
    public final ex0 f10369k = new ex0(16);

    /* renamed from: e, reason: collision with root package name */
    public final ex0 f10364e = new ex0(uf1.f9551a);

    /* renamed from: f, reason: collision with root package name */
    public final ex0 f10365f = new ex0(5);

    /* renamed from: g, reason: collision with root package name */
    public final ex0 f10366g = new ex0();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f10370l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f10371m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f10363d = new SparseArray();

    static {
        tk2 tk2Var = new tk2();
        tk2Var.c("application/x-emsg");
        K = new w(tk2Var);
    }

    public x5(z6 z6Var, int i6, cp1 cp1Var) {
        this.f10360a = z6Var;
        this.f10361b = i6;
        this.f10362c = Collections.unmodifiableList(cp1Var);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f10367i = new ex0(bArr);
        zn1 zn1Var = bo1.f3236t;
        this.f10373o = cp1.f3636w;
        this.f10381x = -9223372036854775807L;
        this.f10380w = -9223372036854775807L;
        this.f10382y = -9223372036854775807L;
        this.F = z0.h;
        this.G = new s1[0];
        this.H = new s1[0];
        this.f10372n = new ba(new dh0(2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ih2 a(List list) {
        int i6;
        UUID uuid;
        v31 v31Var;
        UUID uuid2;
        int size = list.size();
        int i7 = 0;
        ArrayList arrayList = null;
        while (i7 < size) {
            j61 j61Var = (j61) list.get(i7);
            if (j61Var.f9732a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = j61Var.f5954b.f4416a;
                ex0 ex0Var = new ex0(bArr);
                if (ex0Var.f4418c < 32) {
                    i6 = i7;
                    v31Var = null;
                    uuid = null;
                    uuid2 = v31Var == null ? uuid : (UUID) v31Var.f9702t;
                    if (uuid2 == null) {
                        qs0.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    } else {
                        arrayList.add(new og2(uuid2, "video/mp4", bArr));
                    }
                } else {
                    ex0Var.j(0);
                    int iO = ex0Var.o();
                    int iQ = ex0Var.q();
                    if (iQ != iO) {
                        qs0.f("PsshAtomUtil", "Advertised atom size (" + iQ + ") does not match buffer size: " + iO);
                    } else {
                        int iQ2 = ex0Var.q();
                        if (iQ2 != 1886614376) {
                            androidx.activity.m.g(iQ2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iA = s5.a(ex0Var.q());
                            if (iA > 1) {
                                androidx.activity.m.g(iA, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid3 = new UUID(ex0Var.C(), ex0Var.C());
                                if (iA == 1) {
                                    int iY = ex0Var.y();
                                    UUID[] uuidArr = new UUID[iY];
                                    int i8 = 0;
                                    while (i8 < iY) {
                                        uuidArr[i8] = new UUID(ex0Var.C(), ex0Var.C());
                                        i8++;
                                        i7 = i7;
                                    }
                                }
                                i6 = i7;
                                uuid = null;
                                int iY2 = ex0Var.y();
                                int iO2 = ex0Var.o();
                                if (iY2 != iO2) {
                                    qs0.f("PsshAtomUtil", "Atom data size (" + iY2 + ") does not match the bytes left: " + iO2);
                                    v31Var = null;
                                } else {
                                    ex0Var.f(0, iY2, new byte[iY2]);
                                    v31Var = new v31(2, uuid3);
                                }
                                if (v31Var == null) {
                                }
                                if (uuid2 == null) {
                                }
                            }
                        }
                    }
                    i6 = i7;
                    v31Var = null;
                    uuid = null;
                    if (v31Var == null) {
                    }
                    if (uuid2 == null) {
                    }
                }
            } else {
                i6 = i7;
            }
            i7 = i6 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new ih2(null, false, (og2[]) arrayList.toArray(new og2[0]));
    }

    public static void b(ex0 ex0Var, int i6, h6 h6Var) throws rn {
        ex0Var.j(i6 + 8);
        int iQ = ex0Var.q();
        byte[] bArr = s5.f8792a;
        if ((iQ & 1) != 0) {
            throw rn.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (iQ & 2) != 0;
        int iY = ex0Var.y();
        if (iY == 0) {
            Arrays.fill(h6Var.f5277l, 0, h6Var.f5271e, false);
            return;
        }
        int i7 = h6Var.f5271e;
        ex0 ex0Var2 = h6Var.f5279n;
        if (iY != i7) {
            throw rn.a(null, "Senc sample count " + iY + " is different from fragment sample count" + i7);
        }
        Arrays.fill(h6Var.f5277l, 0, iY, z6);
        ex0Var2.g(ex0Var.o());
        h6Var.f5276k = true;
        h6Var.f5280o = true;
        ex0Var.f(0, ex0Var2.f4418c, ex0Var2.f4416a);
        ex0Var2.j(0);
        h6Var.f5280o = false;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void c(long j6, long j7) {
        SparseArray sparseArray = this.f10363d;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w5) sparseArray.valueAt(i6)).d();
        }
        this.f10371m.clear();
        this.f10379v = 0;
        this.f10372n.d(0);
        this.f10380w = j7;
        this.f10370l.clear();
        this.f10374p = 0;
        this.s = 0;
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final boolean d(y0 y0Var) {
        cp1 cp1VarN;
        q1 q1VarM = f0.m(y0Var, true, false);
        if (q1VarM != null) {
            cp1VarN = bo1.n(q1VarM);
        } else {
            zn1 zn1Var = bo1.f3236t;
            cp1VarN = cp1.f3636w;
        }
        this.f10373o = cp1VarN;
        return q1VarM == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ea, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f4, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f7, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        r17 = r4;
        r21 = r8;
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
    
        r31.E = r4;
        r31.B += 5;
        r31.A += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020f, code lost:
    
        if (r31.D != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021d, code lost:
    
        if (java.util.Objects.equals(r2.f10040d.f5568a.f4497g.f9978m, "video/avc") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0227, code lost:
    
        if (com.google.android.gms.internal.ads.uf1.g(r12[4]) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0229, code lost:
    
        r31.D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022c, code lost:
    
        r4 = r17;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0231, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023b, code lost:
    
        throw com.google.android.gms.internal.ads.rn.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023c, code lost:
    
        r17 = r4;
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0243, code lost:
    
        if (r31.E == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0245, code lost:
    
        r4 = r31.f10366g;
        r4.g(r7);
        r0.i(0, r31.C, r4.f4416a);
        r3.e(r31.C, r4);
        r7 = r31.C;
        r8 = com.google.android.gms.internal.ads.uf1.b(r4.f4418c, r4.f4416a);
        r4.j("video/hevc".equals(r5.f9978m) ? 1 : 0);
        r4.i(r8);
        r8 = r5.f9980o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0270, code lost:
    
        if (r8 == (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0274, code lost:
    
        if (r8 == r6.s) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0276, code lost:
    
        if (r8 < 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0278, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027a, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027b, code lost:
    
        com.google.android.gms.internal.ads.y5.r(r11);
        r6.s = r8;
        r6.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0283, code lost:
    
        r6.a(r9, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028d, code lost:
    
        if ((r2.a() & 5) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028f, code lost:
    
        r6.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0293, code lost:
    
        r7 = r3.d(r0, r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0298, code lost:
    
        r31.B += r7;
        r31.C -= r7;
        r4 = r17;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a8, code lost:
    
        r26 = r2.a();
        r0 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b0, code lost:
    
        if (r0 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b2, code lost:
    
        r29 = r0.f4904c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b7, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b9, code lost:
    
        r24 = r9;
        r3.a(r24, r26, r31.A, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ca, code lost:
    
        if (r15.isEmpty() != false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02cc, code lost:
    
        r0 = (com.google.android.gms.internal.ads.v5) r15.removeFirst();
        r31.f10379v -= r0.f9706c;
        r3 = r0.f9704a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02dd, code lost:
    
        if (r0.f9705b == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02df, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e1, code lost:
    
        r6 = r3;
        r3 = r31.G;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e6, code lost:
    
        if (r12 >= r4) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e8, code lost:
    
        r3[r12].a(r6, 1, r0.f9706c, r31.f10379v, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fa, code lost:
    
        if (r2.e() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02fc, code lost:
    
        r31.f10383z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0301, code lost:
    
        r31.f10374p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0305, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        r3 = r2.f10037a;
        r4 = r2.f10038b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        if (r31.f10374p != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (r2.f10047l != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        r5 = r2.f10040d.f5571d[r2.f10042f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        r5 = r4.h[r2.f10042f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        r31.A = r5;
        r31.D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r2.f10042f >= r2.f10044i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r0.b(r5);
        r0 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r3 = r4.f5279n;
        r0 = r0.f4905d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        if (r0 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        r3.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        r0 = r2.f10042f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        if (r4.f5276k == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if (r4.f5277l[r0] == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        r3.k(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        if (r2.e() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        r31.f10383z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0113, code lost:
    
        if (r2.f10040d.f5568a.h != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        r31.A = r5 - 8;
        r0.b(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if ("audio/ac4".equals(r2.f10040d.f5568a.f4497g.f9978m) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012e, code lost:
    
        r31.B = r2.b(r31.A, 7);
        r5 = r31.A;
        r9 = r31.f10367i;
        com.google.android.gms.internal.ads.f0.j(r5, r9);
        r3.e(7, r9);
        r5 = r31.B + 7;
        r31.B = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
    
        r5 = r2.b(r31.A, 0);
        r31.B = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
    
        r31.A += r5;
        r31.f10374p = 4;
        r31.C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        r5 = r2.f10040d;
        r8 = r5.f5568a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        if (r2.f10047l != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
    
        r9 = r5.f5573f[r2.f10042f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0168, code lost:
    
        r9 = r4.f5274i[r2.f10042f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
    
        r4 = r8.f4500k;
        r5 = r8.f4497g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        if (r4 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        r4 = r31.B;
        r5 = r31.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0178, code lost:
    
        if (r4 >= r5) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        r31.B += r3.d(r0, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
    
        r8 = r31.f10365f;
        r12 = r8.f4416a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r18] = 0;
        r14 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        if (r31.B >= r31.A) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r7 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
    
        if (r7 != 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a3, code lost:
    
        r0.i(r4, r14, r12);
        r8.j(r13);
        r7 = r8.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        if (r7 <= 0) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        r31.C = r7 - 1;
        r7 = r31.f10364e;
        r7.j(r13);
        r3.e(4, r7);
        r3.e(1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
    
        if (r31.H.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c9, code lost:
    
        r7 = r12[4];
        r17 = r4;
        r4 = r5.f9978m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d3, code lost:
    
        if ("video/avc".equals(r4) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        r18 = r7;
        r21 = r8;
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if ((r18 & 31) == 6) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
    
        r18 = r7;
        r21 = r8;
        r8 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y0 y0Var, b1 b1Var) throws IOException {
        char c7;
        String strG;
        String strG2;
        long jU;
        long jD;
        long j6;
        long jU2;
        long j7;
        long jE;
        long jE2;
        y0 y0Var2 = y0Var;
        while (true) {
            int i6 = this.f10374p;
            ba baVar = this.f10372n;
            ArrayDeque arrayDeque = this.f10370l;
            SparseArray sparseArray = this.f10363d;
            int i7 = 0;
            if (i6 != 0) {
                ArrayDeque arrayDeque2 = this.f10371m;
                if (i6 != 1) {
                    long j8 = Long.MAX_VALUE;
                    if (i6 != 2) {
                        w5 w5Var = this.f10383z;
                        if (w5Var != null) {
                            c7 = 2;
                            break;
                        }
                        int size = sparseArray.size();
                        c7 = 2;
                        w5 w5Var2 = null;
                        for (int i8 = 0; i8 < size; i8++) {
                            w5 w5Var3 = (w5) sparseArray.valueAt(i8);
                            boolean z6 = w5Var3.f10047l;
                            h6 h6Var = w5Var3.f10038b;
                            if ((z6 || w5Var3.f10042f != w5Var3.f10040d.f5569b) && (!z6 || w5Var3.h != h6Var.f5270d)) {
                                long j9 = !z6 ? w5Var3.f10040d.f5570c[w5Var3.f10042f] : h6Var.f5272f[w5Var3.h];
                                if (j9 < j8) {
                                    w5Var2 = w5Var3;
                                    j8 = j9;
                                }
                            }
                        }
                        if (w5Var2 == null) {
                            int iZzf = (int) (this.f10378u - y0Var2.zzf());
                            if (iZzf < 0) {
                                throw rn.a(null, "Offset to end of mdat was negative.");
                            }
                            y0Var2.b(iZzf);
                            this.f10374p = 0;
                            this.s = 0;
                        } else {
                            int iZzf2 = (int) ((!w5Var2.f10047l ? w5Var2.f10040d.f5570c[w5Var2.f10042f] : w5Var2.f10038b.f5272f[w5Var2.h]) - y0Var2.zzf());
                            if (iZzf2 < 0) {
                                qs0.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iZzf2 = 0;
                            }
                            y0Var2.b(iZzf2);
                            this.f10383z = w5Var2;
                            w5Var = w5Var2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        w5 w5Var4 = null;
                        for (int i9 = 0; i9 < size2; i9++) {
                            h6 h6Var2 = ((w5) sparseArray.valueAt(i9)).f10038b;
                            if (h6Var2.f5280o) {
                                long j10 = h6Var2.f5269c;
                                if (j10 < j8) {
                                    w5Var4 = (w5) sparseArray.valueAt(i9);
                                    j8 = j10;
                                }
                            }
                        }
                        if (w5Var4 == null) {
                            this.f10374p = 3;
                        } else {
                            int iZzf3 = (int) (j8 - y0Var2.zzf());
                            if (iZzf3 < 0) {
                                throw rn.a(null, "Offset to encryption data was negative.");
                            }
                            y0Var2.b(iZzf3);
                            h6 h6Var3 = w5Var4.f10038b;
                            ex0 ex0Var = h6Var3.f5279n;
                            y0Var2.i(0, ex0Var.f4418c, ex0Var.f4416a);
                            h6Var3.f5279n.j(0);
                            h6Var3.f5280o = false;
                        }
                    }
                } else {
                    int i10 = ((int) this.f10376r) - this.s;
                    ex0 ex0Var2 = this.f10377t;
                    if (ex0Var2 != null) {
                        y0Var2.i(8, i10, ex0Var2.f4416a);
                        int i11 = this.f10375q;
                        j61 j61Var = new j61(i11, ex0Var2);
                        long jZzf = y0Var2.zzf();
                        if (!arrayDeque.isEmpty()) {
                            ((s51) arrayDeque.peek()).f8799c.add(j61Var);
                        } else if (i11 == 1936286840) {
                            ex0Var2.j(8);
                            int iA = s5.a(ex0Var2.q());
                            ex0Var2.k(4);
                            long jD2 = ex0Var2.D();
                            if (iA == 0) {
                                jE = ex0Var2.D();
                                jE2 = ex0Var2.D();
                            } else {
                                jE = ex0Var2.E();
                                jE2 = ex0Var2.E();
                            }
                            long j11 = jE2 + jZzf;
                            long j12 = jE;
                            long jU3 = j31.u(j12, 1000000L, jD2, RoundingMode.DOWN);
                            ex0Var2.k(2);
                            int iZ = ex0Var2.z();
                            int[] iArr = new int[iZ];
                            long[] jArr = new long[iZ];
                            long[] jArr2 = new long[iZ];
                            long[] jArr3 = new long[iZ];
                            long jU4 = jU3;
                            int i12 = 0;
                            while (i12 < iZ) {
                                int iQ = ex0Var2.q();
                                if ((iQ & Integer.MIN_VALUE) != 0) {
                                    throw rn.a(null, "Unhandled indirect reference");
                                }
                                long jD3 = ex0Var2.D();
                                iArr[i12] = iQ & Integer.MAX_VALUE;
                                jArr[i12] = j11;
                                jArr3[i12] = jU4;
                                j12 += jD3;
                                jU4 = j31.u(j12, 1000000L, jD2, RoundingMode.DOWN);
                                jArr2[i12] = jU4 - jArr3[i12];
                                ex0Var2.k(4);
                                j11 += iArr[i12];
                                i12++;
                                jU3 = jU3;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jU3), new o0(iArr, jArr, jArr2, jArr3));
                            this.f10382y = ((Long) pairCreate.first).longValue();
                            this.F.f((m1) pairCreate.second);
                            this.I = true;
                        } else if (i11 != 1701671783 || this.G.length == 0) {
                            y0Var2 = y0Var;
                        } else {
                            ex0Var2.j(8);
                            int iA2 = s5.a(ex0Var2.q());
                            if (iA2 == 0) {
                                strG = ex0Var2.G();
                                strG.getClass();
                                strG2 = ex0Var2.G();
                                strG2.getClass();
                                long jD4 = ex0Var2.D();
                                long jD5 = ex0Var2.D();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jU5 = j31.u(jD5, 1000000L, jD4, roundingMode);
                                long j13 = this.f10382y;
                                jU = j13 != -9223372036854775807L ? j13 + jU5 : -9223372036854775807L;
                                long jU6 = j31.u(ex0Var2.D(), 1000L, jD4, roundingMode);
                                jD = ex0Var2.D();
                                j6 = jU5;
                                jU2 = jU6;
                                j7 = -9223372036854775807L;
                            } else if (iA2 != 1) {
                                androidx.activity.m.g(iA2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jD6 = ex0Var2.D();
                                long jE3 = ex0Var2.E();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jU = j31.u(jE3, 1000000L, jD6, roundingMode2);
                                jU2 = j31.u(ex0Var2.D(), 1000L, jD6, roundingMode2);
                                long jD7 = ex0Var2.D();
                                strG = ex0Var2.G();
                                strG.getClass();
                                strG2 = ex0Var2.G();
                                strG2.getClass();
                                j7 = -9223372036854775807L;
                                jD = jD7;
                                j6 = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[ex0Var2.o()];
                            ex0Var2.f(0, ex0Var2.o(), bArr);
                            r0 r0Var = this.f10368j;
                            DataOutputStream dataOutputStream = (DataOutputStream) r0Var.f8494t;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) r0Var.s;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strG);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strG2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jU2);
                                dataOutputStream.writeLong(jD);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                ex0 ex0Var3 = new ex0(byteArrayOutputStream.toByteArray());
                                int iO = ex0Var3.o();
                                for (s1 s1Var : this.G) {
                                    ex0Var3.j(0);
                                    s1Var.e(iO, ex0Var3);
                                }
                                if (jU == j7) {
                                    arrayDeque2.addLast(new v5(iO, j6, true));
                                    this.f10379v += iO;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (s1 s1Var2 : this.G) {
                                        s1Var2.a(jU, 1, iO, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new v5(iO, jU, false));
                                    this.f10379v += iO;
                                }
                                y0Var2 = y0Var;
                            } catch (IOException e6) {
                                throw new RuntimeException(e6);
                            }
                        }
                    } else {
                        y0Var2.b(i10);
                    }
                    g(y0Var2.zzf());
                }
            } else {
                int i13 = this.s;
                ex0 ex0Var4 = this.f10369k;
                if (i13 == 0) {
                    if (!y0Var2.f(ex0Var4.f4416a, 0, 8, true)) {
                        baVar.d(0);
                        return -1;
                    }
                    this.s = 8;
                    ex0Var4.j(0);
                    this.f10376r = ex0Var4.D();
                    this.f10375q = ex0Var4.q();
                }
                long j14 = this.f10376r;
                if (j14 == 1) {
                    y0Var2.i(8, 8, ex0Var4.f4416a);
                    this.s += 8;
                    this.f10376r = ex0Var4.E();
                } else if (j14 == 0) {
                    long jZzd = y0Var2.zzd();
                    if (jZzd == -1) {
                        jZzd = !arrayDeque.isEmpty() ? ((s51) arrayDeque.peek()).f8798b : -1L;
                    }
                    if (jZzd != -1) {
                        this.f10376r = (jZzd - y0Var2.zzf()) + this.s;
                    }
                }
                long j15 = this.f10376r;
                long j16 = this.s;
                if (j15 < j16) {
                    throw rn.b("Atom size less than header length (unsupported).");
                }
                long jZzf2 = y0Var2.zzf() - j16;
                int i14 = this.f10375q;
                if ((i14 == 1836019558 || i14 == 1835295092) && !this.I) {
                    this.F.f(new l1(this.f10381x, jZzf2));
                    this.I = true;
                }
                if (this.f10375q == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        h6 h6Var4 = ((w5) sparseArray.valueAt(i15)).f10038b;
                        h6Var4.f5269c = jZzf2;
                        h6Var4.f5268b = jZzf2;
                    }
                }
                int i16 = this.f10375q;
                if (i16 == 1835295092) {
                    this.f10383z = null;
                    this.f10378u = jZzf2 + this.f10376r;
                    this.f10374p = 2;
                } else if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                    long jZzf3 = (y0Var2.zzf() + this.f10376r) - 8;
                    arrayDeque.push(new s51(i16, jZzf3));
                    if (this.f10376r == this.s) {
                        g(jZzf3);
                    } else {
                        this.f10374p = 0;
                        this.s = 0;
                    }
                } else if (i16 == 1751411826 || i16 == 1835296868 || i16 == 1836476516 || i16 == 1936286840 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1668576371 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1937011571 || i16 == 1952867444 || i16 == 1952868452 || i16 == 1953196132 || i16 == 1953654136 || i16 == 1953658222 || i16 == 1886614376 || i16 == 1935763834 || i16 == 1935763823 || i16 == 1936027235 || i16 == 1970628964 || i16 == 1935828848 || i16 == 1936158820 || i16 == 1701606260 || i16 == 1835362404 || i16 == 1701671783) {
                    if (this.s != 8) {
                        throw rn.b("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f10376r > 2147483647L) {
                        throw rn.b("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    ex0 ex0Var5 = new ex0((int) this.f10376r);
                    System.arraycopy(ex0Var4.f4416a, 0, ex0Var5.f4416a, 0, 8);
                    this.f10377t = ex0Var5;
                    this.f10374p = 1;
                } else {
                    if (this.f10376r > 2147483647L) {
                        throw rn.b("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f10377t = null;
                    this.f10374p = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final void f(z0 z0Var) {
        if ((this.f10361b & 32) == 0) {
            z0Var = new b7(z0Var, this.f10360a);
        }
        this.F = z0Var;
        int i6 = 0;
        this.f10374p = 0;
        this.s = 0;
        s1[] s1VarArr = new s1[2];
        this.G = s1VarArr;
        s1[] s1VarArr2 = (s1[]) j31.f(s1VarArr, 0);
        this.G = s1VarArr2;
        for (s1 s1Var : s1VarArr2) {
            s1Var.b(K);
        }
        List list = this.f10362c;
        this.H = new s1[list.size()];
        int i7 = 100;
        while (i6 < this.H.length) {
            int i8 = i7 + 1;
            s1 s1VarG = this.F.g(i7, 3);
            s1VarG.b((w) list.get(i6));
            this.H[i6] = s1VarG;
            i6++;
            i7 = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x06f9, code lost:
    
        r49.f10374p = 0;
        r49.s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06fe, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0352  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j6) throws rn {
        t5 t5Var;
        t5 t5Var2;
        int i6;
        int i7;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        int i13;
        int iQ;
        int iQ2;
        t5 t5Var3;
        int iQ3;
        while (true) {
            ArrayDeque arrayDeque = this.f10370l;
            if (arrayDeque.isEmpty() || ((s51) arrayDeque.peek()).f8798b != j6) {
                break;
            }
            s51 s51Var = (s51) arrayDeque.pop();
            int i14 = s51Var.f9732a;
            ArrayList arrayList5 = s51Var.f8800d;
            ArrayList arrayList6 = s51Var.f8799c;
            int i15 = 12;
            SparseArray sparseArray = this.f10363d;
            if (i14 == 1836019574) {
                ih2 ih2VarA = a(arrayList6);
                s51 s51VarB = s51Var.b(1836475768);
                s51VarB.getClass();
                ArrayList arrayList7 = s51VarB.f8799c;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList7.size();
                long jD = -9223372036854775807L;
                int i16 = 0;
                while (i16 < size) {
                    j61 j61Var = (j61) arrayList7.get(i16);
                    int i17 = j61Var.f9732a;
                    ex0 ex0Var = j61Var.f5954b;
                    if (i17 == 1953654136) {
                        ex0Var.j(i15);
                        Pair pairCreate = Pair.create(Integer.valueOf(ex0Var.q()), new t5(ex0Var.q() - 1, ex0Var.q(), ex0Var.q(), ex0Var.q()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (t5) pairCreate.second);
                    } else if (i17 == 1835362404) {
                        ex0Var.j(8);
                        jD = s5.a(ex0Var.q()) == 0 ? ex0Var.D() : ex0Var.E();
                    }
                    i16++;
                    i15 = 12;
                }
                ArrayList arrayListD = s5.d(s51Var, new g1(), jD, ih2VarA, false, false, new u5(0));
                int size2 = arrayListD.size();
                if (sparseArray.size() == 0) {
                    for (int i18 = 0; i18 < size2; i18++) {
                        i6 i6Var = (i6) arrayListD.get(i18);
                        f6 f6Var = i6Var.f5568a;
                        z0 z0Var = this.F;
                        int i19 = f6Var.f4492b;
                        int i20 = f6Var.f4491a;
                        long j8 = f6Var.f4495e;
                        s1 s1VarG = z0Var.g(i18, i19);
                        s1VarG.getClass();
                        if (sparseArray2.size() == 1) {
                            t5Var = (t5) sparseArray2.valueAt(0);
                        } else {
                            t5Var = (t5) sparseArray2.get(i20);
                            t5Var.getClass();
                        }
                        sparseArray.put(i20, new w5(s1VarG, i6Var, t5Var));
                        this.f10381x = Math.max(this.f10381x, j8);
                    }
                    this.F.d();
                } else {
                    y5.r(sparseArray.size() == size2);
                    for (int i21 = 0; i21 < size2; i21++) {
                        i6 i6Var2 = (i6) arrayListD.get(i21);
                        f6 f6Var2 = i6Var2.f5568a;
                        w5 w5Var = (w5) sparseArray.get(f6Var2.f4491a);
                        int i22 = f6Var2.f4491a;
                        if (sparseArray2.size() == 1) {
                            t5Var2 = (t5) sparseArray2.valueAt(0);
                        } else {
                            t5Var2 = (t5) sparseArray2.get(i22);
                            t5Var2.getClass();
                        }
                        w5Var.f10040d = i6Var2;
                        w5Var.f10041e = t5Var2;
                        w5Var.f10037a.b(i6Var2.f5568a.f4497g);
                        w5Var.d();
                    }
                }
            } else {
                long j9 = -9223372036854775807L;
                if (i14 == 1836019558) {
                    int size3 = arrayList5.size();
                    int i23 = 0;
                    while (i23 < size3) {
                        s51 s51Var2 = (s51) arrayList5.get(i23);
                        int i24 = s51Var2.f9732a;
                        ArrayList arrayList8 = s51Var2.f8799c;
                        if (i24 == 1953653094) {
                            j61 j61VarC = s51Var2.c(1952868452);
                            j61VarC.getClass();
                            ex0 ex0Var2 = j61VarC.f5954b;
                            ex0Var2.j(8);
                            int iQ4 = ex0Var2.q();
                            byte[] bArr = s5.f8792a;
                            w5 w5Var2 = (w5) sparseArray.get(ex0Var2.q());
                            if (w5Var2 == null) {
                                j7 = j9;
                                w5Var2 = null;
                            } else {
                                h6 h6Var = w5Var2.f10038b;
                                j7 = j9;
                                if ((iQ4 & 1) != 0) {
                                    long jE = ex0Var2.E();
                                    h6Var.f5268b = jE;
                                    h6Var.f5269c = jE;
                                }
                                t5 t5Var4 = w5Var2.f10041e;
                                h6Var.f5267a = new t5((iQ4 & 2) != 0 ? ex0Var2.q() - 1 : t5Var4.f9104a, (iQ4 & 8) != 0 ? ex0Var2.q() : t5Var4.f9105b, (iQ4 & 16) != 0 ? ex0Var2.q() : t5Var4.f9106c, (iQ4 & 32) != 0 ? ex0Var2.q() : t5Var4.f9107d);
                            }
                            if (w5Var2 == null) {
                                i6 = size3;
                                i7 = i23;
                                arrayList = arrayList5;
                                arrayList2 = arrayList6;
                            } else {
                                h6 h6Var2 = w5Var2.f10038b;
                                long j10 = h6Var2.f5281p;
                                boolean z7 = h6Var2.f5282q;
                                w5Var2.d();
                                w5Var2.f10047l = true;
                                j61 j61VarC2 = s51Var2.c(1952867444);
                                if (j61VarC2 != null) {
                                    ex0 ex0Var3 = j61VarC2.f5954b;
                                    ex0Var3.j(8);
                                    h6Var2.f5281p = s5.a(ex0Var3.q()) == 1 ? ex0Var3.E() : ex0Var3.D();
                                    h6Var2.f5282q = true;
                                } else {
                                    h6Var2.f5281p = j10;
                                    h6Var2.f5282q = z7;
                                }
                                int size4 = arrayList8.size();
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    i8 = 1953658222;
                                    if (i25 >= size4) {
                                        break;
                                    }
                                    j61 j61Var2 = (j61) arrayList8.get(i25);
                                    int i28 = size3;
                                    if (j61Var2.f9732a == 1953658222) {
                                        ex0 ex0Var4 = j61Var2.f5954b;
                                        ex0Var4.j(12);
                                        int iY = ex0Var4.y();
                                        if (iY > 0) {
                                            i27 += iY;
                                            i26++;
                                        }
                                    }
                                    i25++;
                                    size3 = i28;
                                }
                                i6 = size3;
                                w5Var2.h = 0;
                                w5Var2.f10043g = 0;
                                w5Var2.f10042f = 0;
                                h6Var2.f5270d = i26;
                                h6Var2.f5271e = i27;
                                if (h6Var2.f5273g.length < i26) {
                                    h6Var2.f5272f = new long[i26];
                                    h6Var2.f5273g = new int[i26];
                                }
                                if (h6Var2.h.length < i27) {
                                    int i29 = (i27 * 125) / 100;
                                    h6Var2.h = new int[i29];
                                    h6Var2.f5274i = new long[i29];
                                    h6Var2.f5275j = new boolean[i29];
                                    h6Var2.f5277l = new boolean[i29];
                                }
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long j11 = 0;
                                    if (i30 < size4) {
                                        j61 j61Var3 = (j61) arrayList8.get(i30);
                                        if (j61Var3.f9732a == i8) {
                                            int i33 = i31 + 1;
                                            ex0 ex0Var5 = j61Var3.f5954b;
                                            ex0Var5.j(8);
                                            int iQ5 = ex0Var5.q();
                                            i10 = i30;
                                            f6 f6Var3 = w5Var2.f10040d.f5568a;
                                            i11 = i23;
                                            t5 t5Var5 = h6Var2.f5267a;
                                            int i34 = j31.f5914a;
                                            arrayList3 = arrayList5;
                                            h6Var2.f5273g[i31] = ex0Var5.y();
                                            long[] jArr = h6Var2.f5272f;
                                            arrayList4 = arrayList6;
                                            long j12 = h6Var2.f5268b;
                                            jArr[i31] = j12;
                                            if ((iQ5 & 1) != 0) {
                                                jArr[i31] = j12 + ex0Var5.q();
                                            }
                                            boolean z8 = (iQ5 & 4) != 0;
                                            int iQ6 = t5Var5.f9107d;
                                            if (z8) {
                                                iQ6 = ex0Var5.q();
                                            }
                                            boolean z9 = z8;
                                            int i35 = iQ5 & 256;
                                            int i36 = iQ5 & AdRequest.MAX_CONTENT_URL_LENGTH;
                                            int i37 = iQ5 & 1024;
                                            int i38 = iQ5 & 2048;
                                            long[] jArr2 = f6Var3.f4498i;
                                            int i39 = iQ6;
                                            long[] jArr3 = f6Var3.f4499j;
                                            if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                                long j13 = jArr2[0];
                                                if (j13 == 0) {
                                                    j11 = jArr3[0];
                                                } else {
                                                    long j14 = f6Var3.f4494d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (j31.u(j13, 1000000L, j14, roundingMode) + j31.u(jArr3[0], 1000000L, f6Var3.f4493c, roundingMode) >= f6Var3.f4495e) {
                                                    }
                                                }
                                            }
                                            int[] iArr = h6Var2.h;
                                            long[] jArr4 = h6Var2.f5274i;
                                            boolean[] zArr = h6Var2.f5275j;
                                            int i40 = h6Var2.f5273g[i31] + i32;
                                            i12 = size4;
                                            long j15 = f6Var3.f4493c;
                                            long j16 = h6Var2.f5281p;
                                            while (i32 < i40) {
                                                int iQ7 = i35 != 0 ? ex0Var5.q() : t5Var5.f9105b;
                                                if (iQ7 < 0) {
                                                    throw rn.a(null, "Unexpected negative value: " + iQ7);
                                                }
                                                if (i36 != 0) {
                                                    i13 = i40;
                                                    iQ = ex0Var5.q();
                                                } else {
                                                    i13 = i40;
                                                    iQ = t5Var5.f9106c;
                                                }
                                                if (iQ < 0) {
                                                    throw rn.a(null, "Unexpected negative value: " + iQ);
                                                }
                                                if (i37 != 0) {
                                                    iQ2 = ex0Var5.q();
                                                } else if (i32 != 0) {
                                                    iQ2 = t5Var5.f9107d;
                                                } else if (z9) {
                                                    iQ2 = i39;
                                                    i32 = 0;
                                                } else {
                                                    i32 = 0;
                                                    iQ2 = t5Var5.f9107d;
                                                }
                                                if (i38 != 0) {
                                                    t5Var3 = t5Var5;
                                                    iQ3 = ex0Var5.q();
                                                } else {
                                                    t5Var3 = t5Var5;
                                                    iQ3 = 0;
                                                }
                                                int i41 = i33;
                                                int i42 = i38;
                                                long jU = j31.u((iQ3 + j16) - j11, 1000000L, j15, RoundingMode.DOWN);
                                                jArr4[i32] = jU;
                                                if (!h6Var2.f5282q) {
                                                    jArr4[i32] = jU + w5Var2.f10040d.h;
                                                }
                                                iArr[i32] = iQ;
                                                zArr[i32] = ((iQ2 >> 16) & 1) == 0;
                                                j16 += iQ7;
                                                i32++;
                                                i40 = i13;
                                                t5Var5 = t5Var3;
                                                i33 = i41;
                                                i38 = i42;
                                            }
                                            h6Var2.f5281p = j16;
                                            i32 = i40;
                                            i31 = i33;
                                        } else {
                                            i10 = i30;
                                            i11 = i23;
                                            arrayList3 = arrayList5;
                                            arrayList4 = arrayList6;
                                            i12 = size4;
                                        }
                                        i30 = i10 + 1;
                                        i23 = i11;
                                        arrayList5 = arrayList3;
                                        arrayList6 = arrayList4;
                                        size4 = i12;
                                        i8 = 1953658222;
                                    } else {
                                        i7 = i23;
                                        arrayList = arrayList5;
                                        arrayList2 = arrayList6;
                                        f6 f6Var4 = w5Var2.f10040d.f5568a;
                                        t5 t5Var6 = h6Var2.f5267a;
                                        t5Var6.getClass();
                                        g6 g6Var = f6Var4.f4501l[t5Var6.f9104a];
                                        j61 j61VarC3 = s51Var2.c(1935763834);
                                        if (j61VarC3 != null) {
                                            g6Var.getClass();
                                            int i43 = g6Var.f4905d;
                                            ex0 ex0Var6 = j61VarC3.f5954b;
                                            ex0Var6.j(8);
                                            if ((ex0Var6.q() & 1) == 1) {
                                                ex0Var6.k(8);
                                            }
                                            int iV = ex0Var6.v();
                                            int iY2 = ex0Var6.y();
                                            int i44 = h6Var2.f5271e;
                                            if (iY2 > i44) {
                                                throw rn.a(null, "Saiz sample count " + iY2 + " is greater than fragment sample count" + i44);
                                            }
                                            if (iV == 0) {
                                                boolean[] zArr2 = h6Var2.f5277l;
                                                i9 = 0;
                                                for (int i45 = 0; i45 < iY2; i45++) {
                                                    int iV2 = ex0Var6.v();
                                                    i9 += iV2;
                                                    zArr2[i45] = iV2 > i43;
                                                }
                                                z6 = false;
                                            } else {
                                                boolean z10 = iV > i43;
                                                i9 = iV * iY2;
                                                z6 = false;
                                                Arrays.fill(h6Var2.f5277l, 0, iY2, z10);
                                            }
                                            Arrays.fill(h6Var2.f5277l, iY2, h6Var2.f5271e, z6);
                                            if (i9 > 0) {
                                                h6Var2.f5279n.g(i9);
                                                h6Var2.f5276k = true;
                                                h6Var2.f5280o = true;
                                            }
                                        }
                                        j61 j61VarC4 = s51Var2.c(1935763823);
                                        if (j61VarC4 != null) {
                                            ex0 ex0Var7 = j61VarC4.f5954b;
                                            ex0Var7.j(8);
                                            int iQ8 = ex0Var7.q();
                                            if ((iQ8 & 1) == 1) {
                                                ex0Var7.k(8);
                                            }
                                            int iY3 = ex0Var7.y();
                                            if (iY3 != 1) {
                                                throw rn.a(null, "Unexpected saio entry count: " + iY3);
                                            }
                                            h6Var2.f5269c += s5.a(iQ8) == 0 ? ex0Var7.D() : ex0Var7.E();
                                        }
                                        byte[] bArr2 = null;
                                        j61 j61VarC5 = s51Var2.c(1936027235);
                                        if (j61VarC5 != null) {
                                            b(j61VarC5.f5954b, 0, h6Var2);
                                        }
                                        String str = g6Var != null ? g6Var.f4903b : null;
                                        ex0 ex0Var8 = null;
                                        ex0 ex0Var9 = null;
                                        for (int i46 = 0; i46 < arrayList8.size(); i46++) {
                                            j61 j61Var4 = (j61) arrayList8.get(i46);
                                            ex0 ex0Var10 = j61Var4.f5954b;
                                            int i47 = j61Var4.f9732a;
                                            if (i47 == 1935828848) {
                                                ex0Var10.j(12);
                                                if (ex0Var10.q() == 1936025959) {
                                                    ex0Var8 = ex0Var10;
                                                }
                                            } else if (i47 == 1936158820) {
                                                ex0Var10.j(12);
                                                if (ex0Var10.q() == 1936025959) {
                                                    ex0Var9 = ex0Var10;
                                                }
                                            }
                                        }
                                        if (ex0Var8 != null && ex0Var9 != null) {
                                            ex0Var8.j(8);
                                            int iA = s5.a(ex0Var8.q());
                                            ex0Var8.k(4);
                                            if (iA == 1) {
                                                ex0Var8.k(4);
                                            }
                                            if (ex0Var8.q() != 1) {
                                                throw rn.b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            ex0Var9.j(8);
                                            int iA2 = s5.a(ex0Var9.q());
                                            ex0Var9.k(4);
                                            if (iA2 == 1) {
                                                if (ex0Var9.D() == 0) {
                                                    throw rn.b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iA2 >= 2) {
                                                ex0Var9.k(4);
                                            }
                                            if (ex0Var9.D() != 1) {
                                                throw rn.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            ex0Var9.k(1);
                                            int iV3 = ex0Var9.v();
                                            int i48 = (iV3 & 240) >> 4;
                                            int i49 = iV3 & 15;
                                            if (ex0Var9.v() == 1) {
                                                int iV4 = ex0Var9.v();
                                                byte[] bArr3 = new byte[16];
                                                ex0Var9.f(0, 16, bArr3);
                                                if (iV4 == 0) {
                                                    int iV5 = ex0Var9.v();
                                                    bArr2 = new byte[iV5];
                                                    ex0Var9.f(0, iV5, bArr2);
                                                }
                                                h6Var2.f5276k = true;
                                                h6Var2.f5278m = new g6(true, str, iV4, bArr3, i48, i49, bArr2);
                                            }
                                        }
                                        int size5 = arrayList8.size();
                                        for (int i50 = 0; i50 < size5; i50++) {
                                            j61 j61Var5 = (j61) arrayList8.get(i50);
                                            if (j61Var5.f9732a == 1970628964) {
                                                ex0 ex0Var11 = j61Var5.f5954b;
                                                ex0Var11.j(8);
                                                byte[] bArr4 = this.h;
                                                ex0Var11.f(0, 16, bArr4);
                                                if (Arrays.equals(bArr4, J)) {
                                                    b(ex0Var11, 16, h6Var2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i6 = size3;
                            i7 = i23;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            j7 = j9;
                        }
                        i23 = i7 + 1;
                        j9 = j7;
                        size3 = i6;
                        arrayList5 = arrayList;
                        arrayList6 = arrayList2;
                    }
                    long j17 = j9;
                    ih2 ih2VarA2 = a(arrayList6);
                    if (ih2VarA2 != null) {
                        int size6 = sparseArray.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            w5 w5Var3 = (w5) sparseArray.valueAt(i51);
                            f6 f6Var5 = w5Var3.f10040d.f5568a;
                            t5 t5Var7 = w5Var3.f10038b.f5267a;
                            int i52 = j31.f5914a;
                            g6 g6Var2 = f6Var5.f4501l[t5Var7.f9104a];
                            ih2 ih2VarL = ih2VarA2.l(g6Var2 != null ? g6Var2.f4903b : null);
                            w wVar = w5Var3.f10040d.f5568a.f4497g;
                            wVar.getClass();
                            tk2 tk2Var = new tk2(wVar);
                            tk2Var.f9334p = ih2VarL;
                            w5Var3.f10037a.b(new w(tk2Var));
                        }
                    }
                    if (this.f10380w != j17) {
                        int size7 = sparseArray.size();
                        for (int i53 = 0; i53 < size7; i53++) {
                            w5 w5Var4 = (w5) sparseArray.valueAt(i53);
                            long j18 = this.f10380w;
                            int i54 = w5Var4.f10042f;
                            while (true) {
                                h6 h6Var3 = w5Var4.f10038b;
                                if (i54 >= h6Var3.f5271e || h6Var3.f5274i[i54] > j18) {
                                    break;
                                }
                                if (h6Var3.f5275j[i54]) {
                                    w5Var4.f10044i = i54;
                                }
                                i54++;
                            }
                        }
                        this.f10380w = j17;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((s51) arrayDeque.peek()).f8800d.add(s51Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x0
    public final /* synthetic */ List zzd() {
        return this.f10373o;
    }
}
