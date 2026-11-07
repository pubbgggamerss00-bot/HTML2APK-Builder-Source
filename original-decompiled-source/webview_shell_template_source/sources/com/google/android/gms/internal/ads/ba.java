package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ba implements v9 {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2999t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3000u;

    /* renamed from: v, reason: collision with root package name */
    public final Cloneable f3001v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f3002w;

    public ba(ca caVar, int i6) {
        this.f3002w = caVar;
        this.f2999t = new l42(5, new byte[5]);
        this.f3000u = new SparseArray();
        this.f3001v = new SparseIntArray();
        this.s = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f9285t) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j6, ex0 ex0Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3001v;
        PriorityQueue priorityQueue = (PriorityQueue) this.f3002w;
        int i6 = this.s;
        if (i6 != 0) {
            if (i6 != -1 && priorityQueue.size() >= this.s) {
                th1 th1Var = (th1) priorityQueue.peek();
                int i7 = j31.f5914a;
            }
            th1 th1Var2 = arrayDeque.isEmpty() ? new th1() : (th1) arrayDeque.poll();
            long andIncrement = ((AtomicLong) this.f3000u).getAndIncrement();
            ex0 ex0Var2 = th1Var2.s;
            y5.r(j6 != -9223372036854775807L);
            th1Var2.f9285t = j6;
            th1Var2.f9286u = andIncrement;
            ex0Var2.g(ex0Var.o());
            System.arraycopy(ex0Var.f4416a, ex0Var.f4417b, ex0Var2.f4416a, 0, ex0Var.o());
            priorityQueue.add(th1Var2);
            int i8 = this.s;
            if (i8 != -1) {
                d(i8);
                return;
            }
            return;
        }
        ((dh0) this.f2999t).d(j6, ex0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.w9] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.w9] */
    @Override // com.google.android.gms.internal.ads.v9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(ex0 ex0Var) {
        SparseArray sparseArray;
        l42 l42Var;
        char c7;
        q9 q9Var;
        q9 q9Var2;
        q9 q9Var3;
        int i6;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f3000u;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f3001v;
        l42 l42Var2 = (l42) this.f2999t;
        ca caVar = (ca) this.f3002w;
        SparseArray sparseArray4 = caVar.f3486f;
        SparseBooleanArray sparseBooleanArray = caVar.f3487g;
        if (ex0Var.v() == 2) {
            int i7 = 0;
            m11 m11Var = (m11) caVar.f3481a.get(0);
            if ((ex0Var.v() & 128) != 0) {
                ex0Var.k(1);
                int iZ = ex0Var.z();
                int i8 = 3;
                ex0Var.k(3);
                ex0Var.f(0, 2, (byte[]) l42Var2.f6576d);
                l42Var2.B(0);
                l42Var2.D(3);
                int i9 = 13;
                caVar.f3494o = l42Var2.w(13);
                ex0Var.f(0, 2, (byte[]) l42Var2.f6576d);
                l42Var2.B(0);
                l42Var2.D(4);
                ex0Var.k(l42Var2.w(12));
                sparseArray3.clear();
                sparseIntArray.clear();
                int iO = ex0Var.o();
                while (iO > 0) {
                    ex0Var.f(i7, 5, (byte[]) l42Var2.f6576d);
                    l42Var2.B(i7);
                    int iW = l42Var2.w(8);
                    l42Var2.D(i8);
                    int iW2 = l42Var2.w(i9);
                    l42Var2.D(4);
                    int iW3 = l42Var2.w(12);
                    int i10 = ex0Var.f4417b;
                    int i11 = i10 + iW3;
                    int i12 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iV = 0;
                    while (true) {
                        l42Var = l42Var2;
                        if (ex0Var.f4417b < i11) {
                            int iV2 = ex0Var.v();
                            int iV3 = ex0Var.f4417b + ex0Var.v();
                            if (iV3 <= i11) {
                                int i13 = iO;
                                if (iV2 == 5) {
                                    long jD = ex0Var.D();
                                    if (jD == 1094921523) {
                                        i6 = iV3;
                                        sparseArray2 = sparseArray4;
                                        i12 = 129;
                                    } else {
                                        if (jD != 1161904947) {
                                            if (jD == 1094921524) {
                                                i6 = iV3;
                                                sparseArray2 = sparseArray4;
                                                i12 = 172;
                                            } else {
                                                if (jD == 1212503619) {
                                                    i6 = iV3;
                                                    sparseArray2 = sparseArray4;
                                                    i12 = 36;
                                                }
                                                i6 = iV3;
                                                sparseArray2 = sparseArray4;
                                            }
                                        }
                                        i6 = iV3;
                                        i12 = 135;
                                        sparseArray2 = sparseArray4;
                                    }
                                } else if (iV2 != 106) {
                                    if (iV2 != 122) {
                                        if (iV2 == 127) {
                                            int iV4 = ex0Var.v();
                                            if (iV4 != 21) {
                                                if (iV4 == 14) {
                                                    i6 = iV3;
                                                    sparseArray2 = sparseArray4;
                                                    i12 = 136;
                                                } else {
                                                    if (iV4 == 33) {
                                                        i6 = iV3;
                                                        sparseArray2 = sparseArray4;
                                                        i12 = 139;
                                                    }
                                                    i6 = iV3;
                                                }
                                            }
                                        } else if (iV2 == 123) {
                                            i6 = iV3;
                                            sparseArray2 = sparseArray4;
                                            i12 = 138;
                                        } else if (iV2 == 10) {
                                            strTrim = ex0Var.b(3, StandardCharsets.UTF_8).trim();
                                            iV = ex0Var.v();
                                            i6 = iV3;
                                        } else {
                                            int i14 = 3;
                                            if (iV2 == 89) {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (ex0Var.f4417b < iV3) {
                                                    String strTrim2 = ex0Var.b(i14, StandardCharsets.UTF_8).trim();
                                                    ex0Var.v();
                                                    int i15 = iV3;
                                                    byte[] bArr = new byte[4];
                                                    ex0Var.f(0, 4, bArr);
                                                    arrayList2.add(new da(strTrim2, bArr));
                                                    iV3 = i15;
                                                    sparseArray4 = sparseArray4;
                                                    i14 = 3;
                                                }
                                                i6 = iV3;
                                                sparseArray2 = sparseArray4;
                                                arrayList = arrayList2;
                                                i12 = 89;
                                            } else {
                                                i6 = iV3;
                                                sparseArray2 = sparseArray4;
                                                if (iV2 == 111) {
                                                    i12 = 257;
                                                }
                                            }
                                        }
                                        sparseArray2 = sparseArray4;
                                    }
                                    i6 = iV3;
                                    i12 = 135;
                                    sparseArray2 = sparseArray4;
                                }
                                ex0Var.k(i6 - ex0Var.f4417b);
                                l42Var2 = l42Var;
                                sparseArray4 = sparseArray2;
                                iO = i13;
                            }
                        }
                    }
                    SparseArray sparseArray5 = sparseArray4;
                    int i16 = iO;
                    ex0Var.j(i11);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(ex0Var.f4416a, i10, i11);
                    m2 m2Var = new m2();
                    m2Var.s = iV;
                    m2Var.f6905t = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                    m2Var.f6906u = bArrCopyOfRange;
                    if (iW == 6 || iW == 5) {
                        iW = i12;
                    }
                    iO = i16 - (iW3 + 5);
                    if (sparseBooleanArray.get(iW2)) {
                        c7 = 4;
                    } else {
                        xj1 xj1Var = caVar.f3484d;
                        if (iW != 2) {
                            c7 = 4;
                            if (iW == 3 || iW == 4) {
                                q9Var2 = new q9(new l9(strTrim, m2Var.a()));
                            } else {
                                if (iW != 21) {
                                    if (iW == 27) {
                                        q9Var = new q9(new g9(new x9(xj1Var.n(m2Var))));
                                    } else if (iW == 36) {
                                        q9Var = new q9(new i9(new x9(xj1Var.n(m2Var))));
                                    } else if (iW == 45) {
                                        q9Var3 = new q9(new m9());
                                    } else if (iW == 89) {
                                        q9Var2 = new q9(new y8((List) m2Var.f6905t));
                                    } else if (iW == 172) {
                                        q9Var2 = new q9(new u8(strTrim, m2Var.a()));
                                    } else if (iW == 257) {
                                        q9Var3 = new w9(new com.google.android.gms.ads.mediation.customevent.b("application/vnd.dvb.ait"));
                                    } else if (iW != 128) {
                                        if (iW == 129) {
                                            q9Var2 = new q9(new s8(strTrim, m2Var.a()));
                                        } else if (iW == 138) {
                                            q9Var2 = new q9(new x8(strTrim, m2Var.a(), 4096));
                                        } else if (iW != 139) {
                                            switch (iW) {
                                                case 15:
                                                    q9Var2 = new q9(new w8(strTrim, m2Var.a(), false));
                                                    break;
                                                case 16:
                                                    q9Var = new q9(new e9(new ha(xj1Var.n(m2Var))));
                                                    break;
                                                case 17:
                                                    q9Var2 = new q9(new k9(strTrim, m2Var.a()));
                                                    break;
                                                default:
                                                    switch (iW) {
                                                        case 134:
                                                            q9Var3 = new w9(new com.google.android.gms.ads.mediation.customevent.b("application/x-scte35"));
                                                            break;
                                                        case 135:
                                                            break;
                                                        case 136:
                                                            break;
                                                        default:
                                                            q9Var2 = null;
                                                            break;
                                                    }
                                            }
                                        } else {
                                            q9Var2 = new q9(new x8(strTrim, m2Var.a(), 5408));
                                        }
                                    }
                                    q9Var2 = q9Var;
                                } else {
                                    q9Var3 = new q9(new j9());
                                }
                                q9Var2 = q9Var3;
                            }
                            sparseIntArray.put(iW2, iW2);
                            sparseArray3.put(iW2, q9Var2);
                        } else {
                            c7 = 4;
                        }
                        q9Var = new q9(new b9(new ha(xj1Var.n(m2Var))));
                        q9Var2 = q9Var;
                        sparseIntArray.put(iW2, iW2);
                        sparseArray3.put(iW2, q9Var2);
                    }
                    l42Var2 = l42Var;
                    sparseArray4 = sparseArray5;
                    i7 = 0;
                    i8 = 3;
                    i9 = 13;
                }
                SparseArray sparseArray6 = sparseArray4;
                int size = sparseIntArray.size();
                int i17 = 0;
                while (i17 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i17);
                    int iValueAt = sparseIntArray.valueAt(i17);
                    sparseBooleanArray.put(iKeyAt, true);
                    caVar.h.put(iValueAt, true);
                    fa faVar = (fa) sparseArray3.valueAt(i17);
                    if (faVar != null) {
                        faVar.b(m11Var, caVar.f3490k, new ea(iZ, iKeyAt, 8192));
                        sparseArray = sparseArray6;
                        sparseArray.put(iValueAt, faVar);
                    } else {
                        sparseArray = sparseArray6;
                    }
                    i17++;
                    sparseArray6 = sparseArray;
                }
                sparseArray6.remove(this.s);
                caVar.f3490k.d();
                caVar.f3491l = true;
            }
        }
    }

    public void d(int i6) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f3002w;
        while (priorityQueue.size() > i6) {
            th1 th1Var = (th1) priorityQueue.poll();
            int i7 = j31.f5914a;
            ((dh0) this.f2999t).d(th1Var.f9285t, th1Var.s);
            ((ArrayDeque) this.f3001v).push(th1Var);
        }
    }

    public ba(dh0 dh0Var) {
        this.f3000u = new AtomicLong();
        this.f2999t = dh0Var;
        this.f3001v = new ArrayDeque();
        this.f3002w = new PriorityQueue();
        this.s = -1;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public void b(m11 m11Var, z0 z0Var, ea eaVar) {
    }
}
