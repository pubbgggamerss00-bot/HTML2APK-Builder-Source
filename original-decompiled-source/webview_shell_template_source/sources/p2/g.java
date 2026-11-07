package p2;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.a7;
import com.google.android.gms.internal.ads.ac1;
import com.google.android.gms.internal.ads.b01;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.ex0;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.m7;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.td1;
import com.google.android.gms.internal.ads.v6;
import com.google.android.gms.internal.ads.xg0;
import com.google.android.gms.internal.consent_sdk.b1;
import com.google.android.gms.internal.consent_sdk.d0;
import com.google.android.gms.internal.consent_sdk.d9;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.f2;
import com.google.android.gms.internal.consent_sdk.g0;
import com.google.android.gms.internal.consent_sdk.h;
import com.google.android.gms.internal.consent_sdk.j;
import com.google.android.gms.internal.consent_sdk.n0;
import com.google.android.gms.internal.consent_sdk.r;
import com.google.android.gms.internal.consent_sdk.s;
import com.google.android.gms.internal.consent_sdk.t3;
import com.google.android.gms.internal.consent_sdk.y8;
import com.google.android.gms.internal.consent_sdk.z8;
import com.google.android.ump.ConsentInformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements a7, td1, z8 {

    /* renamed from: w, reason: collision with root package name */
    public static g f14078w;
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f14079t;

    /* renamed from: u, reason: collision with root package name */
    public Object f14080u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14081v;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.s = obj;
        this.f14079t = obj2;
        this.f14080u = obj3;
        this.f14081v = obj4;
    }

    public static synchronized g a(Context context, u2.a aVar) {
        try {
            if (f14078w == null) {
                g gVar = new g();
                Context applicationContext = context.getApplicationContext();
                gVar.s = new a(applicationContext, aVar);
                gVar.f14079t = new b(applicationContext, aVar);
                gVar.f14080u = new e(applicationContext, aVar);
                gVar.f14081v = new f(applicationContext, aVar);
                f14078w = gVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14078w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r3.i(r0);
        r0 = true;
     */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(byte[] bArr, int i6, int i7, c7 c7Var) {
        int[] iArr;
        int i8;
        ex0 ex0Var;
        xg0 xg0VarA;
        int i9;
        int i10;
        int i11;
        int i12;
        int iX;
        boolean z6;
        m7 m7Var = (m7) this.f14080u;
        ex0 ex0Var2 = (ex0) this.f14079t;
        ex0 ex0Var3 = (ex0) this.s;
        ex0Var3.h(i6 + i7, bArr);
        ex0Var3.j(i6);
        int i13 = 255;
        int i14 = 0;
        if (ex0Var3.o() > 0 && (ex0Var3.f4416a[ex0Var3.f4417b] & 255) == 120) {
            if (((Inflater) this.f14081v) == null) {
                this.f14081v = new Inflater();
            }
            Inflater inflater = (Inflater) this.f14081v;
            int i15 = j31.f5914a;
            if (ex0Var3.o() <= 0) {
                z6 = false;
            } else {
                if (ex0Var2.f4416a.length < ex0Var3.o()) {
                    int iO = ex0Var3.o();
                    ex0Var2.e(iO + iO);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                Inflater inflater2 = inflater;
                inflater2.setInput(ex0Var3.f4416a, ex0Var3.f4417b, ex0Var3.o());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr2 = ex0Var2.f4416a;
                        iInflate += inflater2.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (inflater2.finished()) {
                            break;
                        }
                        if (inflater2.needsDictionary() || inflater2.needsInput()) {
                            break;
                        }
                        byte[] bArr3 = ex0Var2.f4416a;
                        if (iInflate == bArr3.length) {
                            int length = bArr3.length;
                            ex0Var2.e(length + length);
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater2.reset();
                        throw th;
                    }
                }
                z6 = false;
                inflater2.reset();
            }
            if (z6) {
                ex0Var3.h(ex0Var2.f4418c, ex0Var2.f4416a);
            }
        }
        m7Var.f6951d = 0;
        int[] iArr2 = m7Var.f6949b;
        ex0 ex0Var4 = m7Var.f6948a;
        m7Var.f6952e = 0;
        m7Var.f6953f = 0;
        m7Var.f6954g = 0;
        m7Var.h = 0;
        m7Var.f6955i = 0;
        ex0Var4.g(0);
        m7Var.f6950c = false;
        ArrayList arrayList = new ArrayList();
        while (ex0Var3.o() >= 3) {
            int i16 = ex0Var3.f4418c;
            int iV = ex0Var3.v();
            int iZ = ex0Var3.z();
            int i17 = ex0Var3.f4417b + iZ;
            if (i17 > i16) {
                ex0Var3.j(i16);
                iArr = iArr2;
                ex0Var = ex0Var3;
                i9 = i14;
                xg0VarA = null;
                i8 = i13;
            } else {
                if (iV != 128) {
                    switch (iV) {
                        case 20:
                            if (iZ % 5 != 2) {
                                iArr = iArr2;
                                i8 = i13;
                                ex0Var = ex0Var3;
                            } else {
                                ex0Var3.k(2);
                                Arrays.fill(iArr2, i14);
                                int i18 = iZ / 5;
                                int i19 = i14;
                                while (i19 < i18) {
                                    int iV2 = ex0Var3.v();
                                    int iV3 = ex0Var3.v();
                                    int iV4 = ex0Var3.v();
                                    double d7 = iV3;
                                    int iV5 = ex0Var3.v() - 128;
                                    int iV6 = ex0Var3.v() << 24;
                                    double d8 = iV4 - 128;
                                    int[] iArr3 = iArr2;
                                    int iMax = Math.max(0, Math.min((int) ((1.402d * d8) + d7), i13)) << 16;
                                    double d9 = iV5;
                                    iArr3[iV2] = iV6 | iMax | (Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d9 * 1.772d) + d7), 255));
                                    i19++;
                                    ex0Var3 = ex0Var3;
                                    i13 = 255;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                i8 = i13;
                                ex0Var = ex0Var3;
                                m7Var.f6950c = true;
                            }
                            i9 = 0;
                            xg0VarA = null;
                            break;
                        case dn.zzm /* 21 */:
                            if (iZ >= 4) {
                                ex0Var3.k(3);
                                int i20 = iZ - 4;
                                if ((128 & ex0Var3.v()) == 0) {
                                    i11 = ex0Var4.f4417b;
                                    i12 = ex0Var4.f4418c;
                                    if (i11 < i12 && i20 > 0) {
                                        int iMin = Math.min(i20, i12 - i11);
                                        ex0Var3.f(i11, iMin, ex0Var4.f4416a);
                                        ex0Var4.j(i11 + iMin);
                                    }
                                } else if (i20 >= 7 && (iX = ex0Var3.x()) >= 4) {
                                    m7Var.h = ex0Var3.z();
                                    m7Var.f6955i = ex0Var3.z();
                                    ex0Var4.g(iX - 4);
                                    i20 = iZ - 11;
                                    i11 = ex0Var4.f4417b;
                                    i12 = ex0Var4.f4418c;
                                    if (i11 < i12) {
                                        int iMin2 = Math.min(i20, i12 - i11);
                                        ex0Var3.f(i11, iMin2, ex0Var4.f4416a);
                                        ex0Var4.j(i11 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            ex0Var = ex0Var3;
                            i9 = i14;
                            xg0VarA = null;
                            i8 = i13;
                            break;
                        case 22:
                            if (iZ >= 19) {
                                m7Var.f6951d = ex0Var3.z();
                                m7Var.f6952e = ex0Var3.z();
                                ex0Var3.k(11);
                                m7Var.f6953f = ex0Var3.z();
                                m7Var.f6954g = ex0Var3.z();
                            }
                            iArr = iArr2;
                            ex0Var = ex0Var3;
                            i9 = i14;
                            xg0VarA = null;
                            i8 = i13;
                            break;
                        default:
                            iArr = iArr2;
                            ex0Var = ex0Var3;
                            i9 = i14;
                            xg0VarA = null;
                            i8 = i13;
                            break;
                    }
                } else {
                    iArr = iArr2;
                    i8 = i13;
                    ex0Var = ex0Var3;
                    if (m7Var.f6951d == 0 || m7Var.f6952e == 0 || m7Var.h == 0 || m7Var.f6955i == 0 || (i10 = ex0Var4.f4418c) == 0 || ex0Var4.f4417b != i10 || !m7Var.f6950c) {
                        xg0VarA = null;
                    } else {
                        ex0Var4.j(0);
                        int i21 = m7Var.h * m7Var.f6955i;
                        int[] iArr4 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int iV7 = ex0Var4.v();
                            if (iV7 != 0) {
                                iArr4[i22] = iArr[iV7];
                                i22++;
                            } else {
                                int iV8 = ex0Var4.v();
                                if (iV8 != 0) {
                                    int iV9 = iV8 & 63;
                                    if ((iV8 & 64) != 0) {
                                        iV9 = (iV9 << 8) | ex0Var4.v();
                                    }
                                    int i23 = (iV8 & 128) == 0 ? iArr[0] : iArr[ex0Var4.v()];
                                    int i24 = i22 + iV9;
                                    Arrays.fill(iArr4, i22, i24, i23);
                                    i22 = i24;
                                }
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, m7Var.h, m7Var.f6955i, Bitmap.Config.ARGB_8888);
                        mf0 mf0Var = new mf0();
                        mf0Var.f7112b = bitmapCreateBitmap;
                        float f6 = m7Var.f6953f;
                        float f7 = m7Var.f6951d;
                        mf0Var.h = f6 / f7;
                        mf0Var.f7118i = 0;
                        float f8 = m7Var.f6954g;
                        float f9 = m7Var.f6952e;
                        mf0Var.f7115e = f8 / f9;
                        mf0Var.f7116f = 0;
                        mf0Var.f7117g = 0;
                        mf0Var.f7121l = m7Var.h / f7;
                        mf0Var.f7122m = m7Var.f6955i / f9;
                        xg0VarA = mf0Var.a();
                    }
                    i9 = 0;
                    m7Var.f6951d = 0;
                    m7Var.f6952e = 0;
                    m7Var.f6953f = 0;
                    m7Var.f6954g = 0;
                    m7Var.h = 0;
                    m7Var.f6955i = 0;
                    ex0Var4.g(0);
                    m7Var.f6950c = false;
                }
                ex0Var.j(i17);
            }
            if (xg0VarA != null) {
                arrayList.add(xg0VarA);
            }
            ex0Var3 = ex0Var;
            i13 = i8;
            i14 = i9;
            iArr2 = iArr;
        }
        c7Var.mo6zza(new v6(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public com.google.android.gms.internal.consent_sdk.b c(e0 e0Var) {
        ConsentInformation.c cVar;
        String str;
        j jVar = (j) this.f14080u;
        g0 g0Var = (g0) this.f14081v;
        int i6 = e0Var.f11708g;
        jVar.f11784b.edit().putBoolean("is_pub_misconfigured", i6 == 8).commit();
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        int i8 = 3;
        switch (i7) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                i8 = 2;
                break;
            case 5:
                i8 = 1;
                break;
            case 6:
                throw new f2(1, "Invalid response from server: ".concat(String.valueOf(e0Var.f11704c)));
            case 7:
                throw new f2(3, "Publisher misconfiguration: ".concat(String.valueOf(e0Var.f11704c)));
            default:
                throw new f2(1, "Invalid response from server.");
        }
        int i9 = e0Var.h;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 1) {
            cVar = ConsentInformation.c.f12521u;
        } else {
            if (i10 != 2) {
                throw new f2(1, "Invalid response from server.");
            }
            cVar = ConsentInformation.c.f12520t;
        }
        String str2 = e0Var.f11702a;
        s sVar = str2 == null ? null : new s(e0Var.f11703b, str2);
        g0Var.f11746a.set(e0Var.f11707f);
        jVar.f11784b.edit().putStringSet("stored_info", new HashSet(e0Var.f11705d)).commit();
        for (d0 d0Var : e0Var.f11706e) {
            int i11 = d0Var.f11680b;
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == 0) {
                str = null;
            } else if (i12 == 1) {
                str = "write";
            } else {
                if (i12 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                b1 b1Var = (b1) this.s;
                String str3 = d0Var.f11679a;
                n0[] n0VarArr = {(h) this.f14079t};
                b1Var.getClass();
                b1Var.f11643a.execute(new kb0(str, str3, n0VarArr));
            }
        }
        return new com.google.android.gms.internal.consent_sdk.b(i8, cVar, sVar);
    }

    public rd0 d() {
        ih1.k((Context) this.f14079t, Context.class);
        ih1.k((String) this.f14080u, String.class);
        ih1.k((zzs) this.f14081v, zzs.class);
        return new rd0((kd0) this.s, (Context) this.f14079t, (String) this.f14080u, (zzs) this.f14081v);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        o31 o31Var = (o31) this.s;
        return o31Var.f7586b.b((ac1) this.f14079t, (tb1) this.f14080u, (b01) this.f14081v);
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public /* bridge */ /* synthetic */ Object zzb() {
        return new t3((j) ((y8) this.s).zzb(), ((d9) this.f14079t).zzb(), (r) ((y8) this.f14080u).zzb(), (g0) ((y8) this.f14081v).zzb());
    }
}
