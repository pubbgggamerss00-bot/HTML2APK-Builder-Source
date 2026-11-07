package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qg extends lh {

    /* renamed from: k, reason: collision with root package name */
    public static final v31 f8376k = new v31();
    public final gd h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f8377i;

    /* renamed from: j, reason: collision with root package name */
    public final se f8378j;

    public qg(dg dgVar, kd kdVar, int i6, Context context, gd gdVar, se seVar) {
        super(dgVar, "oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", kdVar, i6, 27);
        this.f8377i = context;
        this.h = gdVar;
        this.f8378j = seVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:65:0x00ed, B:66:0x00f3, B:21:0x0041, B:23:0x0047, B:64:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:40:0x0099, B:42:0x009d, B:46:0x00a6, B:48:0x00ab, B:47:0x00a9, B:49:0x00ae, B:51:0x00b4, B:53:0x00ba, B:43:0x00a0, B:56:0x00c1, B:58:0x00d8, B:62:0x00e1), top: B:84:0x000d }] */
    @Override // com.google.android.gms.internal.ads.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ne neVarD;
        yd ydVarB;
        ne neVar;
        AtomicReference atomicReferenceN = f8376k.n(this.f8377i.getPackageName());
        synchronized (atomicReferenceN) {
            try {
                ne neVar2 = (ne) atomicReferenceN.get();
                if (neVar2 != null) {
                    String str = neVar2.f7425t;
                    char[] cArr = gg.f5032a;
                    if ((str == null || str.isEmpty()) || neVar2.f7425t.equals("E") || neVar2.f7425t.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                        char[] cArr2 = gg.f5032a;
                        if (this.f8378j != null) {
                            neVarD = d();
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!this.h.D());
                            Boolean bool = (Boolean) zzbe.zzc().a(zn.B2);
                            String strC = ((Boolean) zzbe.zzc().a(zn.A2)).booleanValue() ? c() : null;
                            if (bool.booleanValue() && this.f6724a.f3910o) {
                                if (strC == null || strC.isEmpty()) {
                                    dg dgVar = this.f6724a;
                                    try {
                                        pf pfVar = dgVar.f3907l;
                                        if ((pfVar != null ? pfVar.f8054a : dgVar.f3906k) != null) {
                                            (pfVar != null ? pfVar.f8054a : dgVar.f3906k).get();
                                        }
                                        ydVarB = dgVar.b();
                                    } catch (InterruptedException | ExecutionException unused) {
                                    }
                                    strC = (ydVarB == null || !ydVarB.l0()) ? null : ydVarB.z0();
                                }
                            }
                            ne neVar3 = new ne((String) this.f6728e.invoke(null, this.f8377i, boolValueOf, strC));
                            String str2 = neVar3.f7425t;
                            if (!(str2 == null || str2.isEmpty())) {
                                neVar3.f7425t.equals("E");
                            }
                            neVarD = neVar3;
                        }
                        atomicReferenceN.set(neVarD);
                    }
                }
                neVar = (ne) atomicReferenceN.get();
            } finally {
            }
        }
        synchronized (this.f6727d) {
            if (neVar != null) {
                try {
                    kd kdVar = this.f6727d;
                    String str3 = neVar.f7425t;
                    kdVar.i();
                    yd.G((yd) kdVar.f4126t, str3);
                    kd kdVar2 = this.f6727d;
                    long j6 = neVar.f7426u;
                    kdVar2.i();
                    yd.h0((yd) kdVar2.f4126t, j6);
                    kd kdVar3 = this.f6727d;
                    String str4 = neVar.f7427v;
                    kdVar3.i();
                    yd.j0((yd) kdVar3.f4126t, str4);
                    kd kdVar4 = this.f6727d;
                    String str5 = neVar.f7428w;
                    kdVar4.i();
                    yd.I0((yd) kdVar4.f4126t, str5);
                    kd kdVar5 = this.f6727d;
                    String str6 = neVar.f7429x;
                    kdVar5.i();
                    yd.F((yd) kdVar5.f4126t, str6);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.mh] */
    public final String c() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrB = gg.b((String) zzbe.zzc().a(zn.C2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrB)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(gg.b((String) zzbe.zzc().a(zn.D2)))));
            }
            Context context = this.f8377i;
            String packageName = context.getPackageName();
            this.f6724a.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final ps1 ps1Var = new ps1();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.mh
                public final void onChecksumsReady(List list) {
                    ps1 ps1Var2 = ps1Var;
                    if (list == null) {
                        ps1Var2.e(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ApkChecksum apkChecksumD = pe.d(list.get(i6));
                            if (apkChecksumD.getType() == 8) {
                                byte[] value = apkChecksumD.getValue();
                                char[] cArr = gg.f5032a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i7 = 0; i7 < value.length; i7++) {
                                    byte b7 = value[i7];
                                    char[] cArr3 = gg.f5032a;
                                    int i8 = i7 + i7;
                                    cArr2[i8] = cArr3[(b7 & 255) >>> 4];
                                    cArr2[i8 + 1] = cArr3[b7 & 15];
                                }
                                ps1Var2.e(new String(cArr2));
                                return;
                            }
                        }
                        ps1Var2.e(null);
                    } catch (Throwable unused) {
                        ps1Var2.e(null);
                    }
                }
            });
            return (String) ps1Var.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final ne d() {
        String str;
        vs1 vs1Var;
        int iIntValue = ((Boolean) zzbe.zzc().a(zn.N2)).booleanValue() ? ((Integer) zzbe.zzc().a(zn.S2)).intValue() : this.h.B();
        ne neVar = new ne((String) this.f6728e.invoke(null, this.f8377i, Boolean.FALSE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        se seVar = this.f8378j;
        if (seVar == null || (vs1Var = seVar.f8911a) == null) {
            str = "E";
        } else {
            try {
                str = (String) vs1Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        neVar.f7425t = str;
        return neVar;
    }
}
