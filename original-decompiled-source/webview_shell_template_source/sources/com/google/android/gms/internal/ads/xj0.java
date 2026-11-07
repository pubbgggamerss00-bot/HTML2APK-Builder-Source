package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xj0 implements zr1, r70, zb0, om0, ri0, p41, td1, i32, em1, eq0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f10617t;

    public /* synthetic */ xj0(int i6, Object obj) {
        this.s = i6;
        this.f10617t = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(@NullableDecl Object obj) {
        ((yj0) this.f10617t).s.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qh b(y0 y0Var, d0 d0Var) {
        x3 x3Var;
        ex0 ex0Var = (ex0) this.f10617t;
        int i6 = 0;
        qh qhVar = null;
        while (true) {
            try {
                y0Var.h(0, 10, ex0Var.f4416a);
                ex0Var.j(0);
                if (ex0Var.x() != 4801587) {
                    break;
                }
                ex0Var.k(3);
                int iU = ex0Var.u();
                int i7 = iU + 10;
                if (qhVar == null) {
                    byte[] bArr = new byte[i7];
                    System.arraycopy(ex0Var.f4416a, 0, bArr, 0, 10);
                    y0Var.h(10, iU, bArr);
                    ArrayList arrayList = new ArrayList();
                    ex0 ex0Var2 = new ex0(i7, bArr);
                    boolean z6 = true;
                    if (ex0Var2.o() < 10) {
                        qs0.f("Id3Decoder", "Data too short to be an ID3 tag");
                    } else {
                        int iX = ex0Var2.x();
                        if (iX != 4801587) {
                            qs0.f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iX))));
                        } else {
                            int iV = ex0Var2.v();
                            ex0Var2.k(1);
                            int iV2 = ex0Var2.v();
                            int iU2 = ex0Var2.u();
                            if (iV == 2) {
                                if ((iV2 & 64) != 0) {
                                    qs0.f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                }
                                x3Var = new x3(iV, iU2, iV >= 4 && (iV2 & 128) != 0);
                            } else {
                                if (iV == 3) {
                                    if ((iV2 & 64) != 0) {
                                        int iQ = ex0Var2.q();
                                        ex0Var2.k(iQ);
                                        iU2 -= iQ + 4;
                                    }
                                } else if (iV == 4) {
                                    if ((iV2 & 64) != 0) {
                                        int iU3 = ex0Var2.u();
                                        ex0Var2.k(iU3 - 4);
                                        iU2 -= iU3;
                                    }
                                    if ((iV2 & 16) != 0) {
                                        iU2 -= 10;
                                    }
                                } else {
                                    androidx.activity.m.g(iV, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                                }
                                if (iV >= 4) {
                                    x3Var = new x3(iV, iU2, iV >= 4 && (iV2 & 128) != 0);
                                }
                            }
                            if (x3Var != null) {
                                qhVar = null;
                            } else {
                                int i8 = x3Var.f10339a;
                                int i9 = ex0Var2.f4417b;
                                int i10 = i8 == 2 ? 6 : 10;
                                int iD = x3Var.f10341c;
                                if (x3Var.f10340b) {
                                    iD = y3.d(iD, ex0Var2);
                                }
                                ex0Var2.i(i9 + iD);
                                if (y3.i(ex0Var2, i8, i10, false)) {
                                    z6 = false;
                                } else if (i8 != 4 || !y3.i(ex0Var2, 4, i10, true)) {
                                    androidx.activity.m.g(i8, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                                    qhVar = null;
                                }
                                while (ex0Var2.o() >= i10) {
                                    z3 z3VarJ = y3.j(i8, ex0Var2, z6, d0Var);
                                    if (z3VarJ != null) {
                                        arrayList.add(z3VarJ);
                                    }
                                }
                                qhVar = new qh(arrayList);
                            }
                        }
                    }
                    x3Var = null;
                    if (x3Var != null) {
                    }
                } else {
                    y0Var.a(iU);
                }
                i6 += i7;
            } catch (EOFException unused) {
            }
        }
        y0Var.zzj();
        y0Var.a(i6);
        return qhVar;
    }

    public pa2[] c(Handler handler, db2 db2Var, db2 db2Var2) {
        ja0 ja0Var = (ja0) this.f10617t;
        Context context = ja0Var.f5988u;
        ie2 ie2Var = new ie2(context);
        y5.r(!ie2Var.f5734c);
        ie2Var.f5734c = true;
        if (ie2Var.f5735d == null) {
            we2 we2Var = new we2();
            we2Var.f10184m = 0;
            we2Var.f10186o = 0;
            we2Var.f10187p = 0;
            byte[] bArr = j31.f5919f;
            we2Var.f10185n = bArr;
            we2Var.f10188q = bArr;
            he0 he0Var = new he0();
            he0Var.f5353c = 1.0f;
            he0Var.f5354d = 1.0f;
            za0 za0Var = za0.f11240e;
            he0Var.f5355e = za0Var;
            he0Var.f5356f = za0Var;
            he0Var.f5357g = za0Var;
            he0Var.h = za0Var;
            ByteBuffer byteBuffer = jc0.f6021a;
            he0Var.f5360k = byteBuffer;
            he0Var.f5361l = byteBuffer.asShortBuffer();
            he0Var.f5362m = byteBuffer;
            he0Var.f5352b = -1;
            com.google.android.gms.ads.mediation.customevent.b bVar = new com.google.android.gms.ads.mediation.customevent.b();
            jc0[] jc0VarArr = {we2Var, he0Var};
            bVar.s = jc0VarArr;
            System.arraycopy(new jc0[0], 0, jc0VarArr, 0, 0);
            bVar.f2374t = we2Var;
            bVar.f2375u = he0Var;
            ie2Var.f5735d = bVar;
        }
        if (ie2Var.f5736e == null) {
            ie2Var.f5736e = new r0(context);
        }
        ve2 ve2Var = new ve2(context, new of2(context), handler, db2Var2, new te2(ie2Var));
        Context context2 = ja0Var.f5988u;
        return new pa2[]{ve2Var, new el2(context2, new of2(context2), handler, db2Var)};
    }

    @Override // com.google.android.gms.internal.ads.p41
    public void g(ti0 ti0Var) {
        rs0 rs0Var = (rs0) ti0Var;
        synchronized (((ob1) this.f10617t)) {
            try {
                ((ob1) this.f10617t).A = rs0Var;
                if (((Boolean) zzbe.zzc().a(zn.F3)).booleanValue()) {
                    rs0Var.s.f3515a = ((ob1) this.f10617t).f7678v;
                }
                ((ob1) this.f10617t).A.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public zzeb zza() throws gc1 {
        try {
            return ((e00) ((b01) this.f10617t).f2884b).zze();
        } catch (RemoteException e6) {
            throw new gc1(e6);
        }
    }

    public /* synthetic */ xj0(ht0 ht0Var, xa0 xa0Var) {
        this.s = 12;
        this.f10617t = xa0Var;
    }

    public /* synthetic */ xj0(xc2 xc2Var, Object obj, long j6) {
        this.s = 17;
        this.f10617t = obj;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return nk2.b((Context) this.f10617t);
    }

    public xj0(int i6) {
        this.s = i6;
        switch (i6) {
            case 3:
                this.f10617t = Collections.EMPTY_LIST;
                break;
            case 11:
                break;
            default:
                this.f10617t = new ex0(10);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        if (((Boolean) mp.f7199c.c()).booleanValue()) {
            ((de1) this.f10617t).zzi();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.i32
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            try {
                return ((l32) this.f10617t).d(str, (Provider) obj);
            } catch (Exception e6) {
                if (exc == null) {
                    exc = e6;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.p41
    /* renamed from: zza */
    public void mo1zza() {
        synchronized (((ob1) this.f10617t)) {
            ((ob1) this.f10617t).A = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 4:
                cx cxVar = (cx) this.f10617t;
                cxVar.getClass();
                if (((nw) obj).zzi()) {
                    cxVar.h = 1;
                    break;
                }
                break;
            case 5:
            case 6:
            default:
                ((yc2) obj).m();
                break;
            case 7:
                ((yl0) obj).b0((ac1) this.f10617t);
                break;
            case 8:
                ((lm0) obj).M((am) this.f10617t);
                break;
            case 9:
                ((tn0) obj).zze((zzbk) this.f10617t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        switch (this.s) {
            case 6:
                ((n70) this.f10617t).c();
                break;
            default:
                xa0 xa0Var = (xa0) this.f10617t;
                xa0Var.i0();
                xa0Var.zzN().k0();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
    }
}
