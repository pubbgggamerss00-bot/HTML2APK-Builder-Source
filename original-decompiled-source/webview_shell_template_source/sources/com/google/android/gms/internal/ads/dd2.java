package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dd2 {
    public static final Random h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public fd2 f3861d;

    /* renamed from: f, reason: collision with root package name */
    public String f3863f;

    /* renamed from: a, reason: collision with root package name */
    public final cy f3858a = new cy();

    /* renamed from: b, reason: collision with root package name */
    public final jx f3859b = new jx();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3860c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public zy f3862e = zy.f11601a;

    /* renamed from: g, reason: collision with root package name */
    public long f3864g = -1;

    public final synchronized String a(zy zyVar, oh2 oh2Var) {
        return c(zyVar.n(oh2Var.f7769a, this.f3859b).f6182c, oh2Var).f3529a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x0061, B:31:0x0065, B:33:0x006a, B:35:0x0070, B:37:0x0085, B:38:0x00a5, B:40:0x00a9, B:41:0x00ab, B:43:0x00b5, B:45:0x00b9, B:47:0x00c6, B:50:0x00cd, B:56:0x00ec), top: B:59:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x0061, B:31:0x0065, B:33:0x006a, B:35:0x0070, B:37:0x0085, B:38:0x00a5, B:40:0x00a9, B:41:0x00ab, B:43:0x00b5, B:45:0x00b9, B:47:0x00c6, B:50:0x00cd, B:56:0x00ec), top: B:59:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(xc2 xc2Var) {
        cd2 cd2Var;
        long jV = j31.v(0L);
        synchronized (this) {
            try {
                if (this.f3861d == null) {
                    throw null;
                }
                if (!xc2Var.f10498b.o()) {
                    oh2 oh2Var = xc2Var.f10500d;
                    if (oh2Var == null) {
                        cd2 cd2VarC = c(xc2Var.f10499c, xc2Var.f10500d);
                        if (this.f3863f == null) {
                            this.f3863f = cd2VarC.f3529a;
                        }
                        oh2 oh2Var2 = xc2Var.f10500d;
                        if (oh2Var2 != null && oh2Var2.b()) {
                            cd2 cd2VarC2 = c(xc2Var.f10499c, new oh2(oh2Var2.f7769a, oh2Var2.f7772d, oh2Var2.f7770b));
                            if (!cd2VarC2.f3533e) {
                                cd2VarC2.f3533e = true;
                                xc2Var.f10498b.n(xc2Var.f10500d.f7769a, this.f3859b);
                                this.f3859b.f6185f.a(xc2Var.f10500d.f7770b).getClass();
                                Math.max(0L, jV + jV);
                            }
                        }
                        if (!cd2VarC.f3533e) {
                            cd2VarC.f3533e = true;
                        }
                        if (cd2VarC.f3529a.equals(this.f3863f) && !cd2VarC.f3534f) {
                            cd2VarC.f3534f = true;
                            fd2 fd2Var = this.f3861d;
                            String str = cd2VarC.f3529a;
                            fd2Var.getClass();
                            oh2 oh2Var3 = xc2Var.f10500d;
                            if (oh2Var3 == null || !oh2Var3.b()) {
                                fd2Var.f();
                                fd2Var.A = str;
                                fd2Var.B = pe.g().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
                                fd2Var.o(xc2Var.f10498b, xc2Var.f10500d);
                            }
                        }
                    } else {
                        cd2 cd2Var2 = (cd2) this.f3860c.get(this.f3863f);
                        if (cd2Var2 != null) {
                            long j6 = cd2Var2.f3531c;
                            if (j6 == -1) {
                                j6 = this.f3864g + 1;
                            }
                            if (oh2Var.f7772d >= j6 && ((cd2Var = (cd2) this.f3860c.get(this.f3863f)) == null || cd2Var.f3531c != -1 || cd2Var.f3530b == xc2Var.f10499c)) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd2 c(int i6, oh2 oh2Var) {
        long j6;
        long j7;
        HashMap map = this.f3860c;
        long j8 = Long.MAX_VALUE;
        cd2 cd2Var = null;
        for (cd2 cd2Var2 : map.values()) {
            long j9 = cd2Var2.f3531c;
            oh2 oh2Var2 = cd2Var2.f3532d;
            if (j9 == -1 && i6 == cd2Var2.f3530b && oh2Var != null) {
                dd2 dd2Var = cd2Var2.f3535g;
                long j10 = oh2Var.f7772d;
                j6 = -1;
                cd2 cd2Var3 = (cd2) dd2Var.f3860c.get(dd2Var.f3863f);
                if (cd2Var3 != null) {
                    long j11 = cd2Var3.f3531c;
                    if (j11 == -1) {
                        j11 = 1 + dd2Var.f3864g;
                    }
                    if (j10 >= j11) {
                        cd2Var2.f3531c = j10;
                    }
                }
            } else {
                j6 = -1;
            }
            if (oh2Var != null) {
                long j12 = oh2Var.f7772d;
                if (oh2Var2 == null) {
                    if (!oh2Var.b() && j12 == cd2Var2.f3531c) {
                        j7 = cd2Var2.f3531c;
                        if (j7 == j6) {
                        }
                        cd2Var = cd2Var2;
                        j8 = j7;
                    }
                } else if (j12 == oh2Var2.f7772d && oh2Var.f7770b == oh2Var2.f7770b && oh2Var.f7771c == oh2Var2.f7771c) {
                    j7 = cd2Var2.f3531c;
                    if (j7 == j6) {
                    }
                    cd2Var = cd2Var2;
                    j8 = j7;
                }
            } else if (i6 == cd2Var2.f3530b) {
                j7 = cd2Var2.f3531c;
                if (j7 == j6 || j7 < j8) {
                    cd2Var = cd2Var2;
                    j8 = j7;
                } else if (j7 == j8) {
                    int i7 = j31.f5914a;
                    if (cd2Var.f3532d != null && oh2Var2 != null) {
                        cd2Var = cd2Var2;
                    }
                }
            }
        }
        if (cd2Var != null) {
            return cd2Var;
        }
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        cd2 cd2Var4 = new cd2(this, strEncodeToString, i6, oh2Var);
        map.put(strEncodeToString, cd2Var4);
        return cd2Var4;
    }

    public final void d(cd2 cd2Var) {
        long j6 = cd2Var.f3531c;
        if (j6 != -1) {
            this.f3864g = j6;
        }
        this.f3863f = null;
    }

    public final void e(xc2 xc2Var) {
        oh2 oh2Var;
        zy zyVar = xc2Var.f10498b;
        int i6 = xc2Var.f10499c;
        oh2 oh2Var2 = xc2Var.f10500d;
        boolean zO = zyVar.o();
        HashMap map = this.f3860c;
        if (zO) {
            String str = this.f3863f;
            if (str != null) {
                cd2 cd2Var = (cd2) map.get(str);
                cd2Var.getClass();
                d(cd2Var);
                return;
            }
            return;
        }
        cd2 cd2Var2 = (cd2) map.get(this.f3863f);
        this.f3863f = c(i6, oh2Var2).f3529a;
        b(xc2Var);
        if (oh2Var2 != null) {
            long j6 = oh2Var2.f7772d;
            if (oh2Var2.b()) {
                if (cd2Var2 != null && cd2Var2.f3531c == j6 && (oh2Var = cd2Var2.f3532d) != null && oh2Var.f7770b == oh2Var2.f7770b && oh2Var.f7771c == oh2Var2.f7771c) {
                    return;
                }
                c(i6, new oh2(j6, oh2Var2.f7769a));
            }
        }
    }
}
