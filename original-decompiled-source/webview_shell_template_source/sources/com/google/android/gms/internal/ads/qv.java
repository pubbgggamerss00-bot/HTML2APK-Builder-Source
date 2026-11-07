package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qv implements ib {

    /* renamed from: a, reason: collision with root package name */
    public volatile ev f8458a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8459b;

    public qv(Context context) {
        this.f8459b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ib
    public final lb zza(pb pbVar) {
        f3.c cVar;
        Map mapZzl = pbVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i6 = 0;
        int i7 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i7] = (String) entry.getKey();
            strArr2[i7] = (String) entry.getValue();
            i7++;
        }
        gv gvVar = new gv(pbVar.zzk(), strArr, strArr2);
        long jB = zzv.zzC().b();
        try {
            o70 o70Var = new o70();
            this.f8458a = new ev(z30.a(this.f8459b), zzv.zzu().zzb(), 166, new ov(this, o70Var), new pv(o70Var), null);
            this.f8458a.checkAvailabilityAndConnect();
            nv nvVar = new nv(0, gvVar);
            h70 h70Var = i70.f5586a;
            c5.a aVarQ = bs1.q(bs1.p(o70Var, nvVar, h70Var), ((Integer) zzbe.zzc().a(zn.f11513y4)).intValue(), TimeUnit.MILLISECONDS, i70.f5589d);
            aVarQ.addListener(new b(5, this), h70Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aVarQ.get();
            zze.zza("Http assets remote cache took " + (zzv.zzC().b() - jB) + "ms");
            p30 p30Var = new p30(parcelFileDescriptor);
            Parcelable.Creator<iv> creator = iv.CREATOR;
            if (p30Var.f7918u) {
                if (p30Var.s == null) {
                    zzo.zzg("File descriptor is empty, returning null.");
                } else {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(p30Var.s));
                    try {
                        try {
                            int i8 = dataInputStream.readInt();
                            byte[] bArr = new byte[i8];
                            dataInputStream.readFully(bArr, 0, i8);
                            i3.f.a(dataInputStream);
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.unmarshall(bArr, 0, i8);
                                parcelObtain.setDataPosition(0);
                                p30Var.f7917t = creator.createFromParcel(parcelObtain);
                                parcelObtain.recycle();
                                p30Var.f7918u = false;
                                cVar = (f3.c) p30Var.f7917t;
                            } catch (Throwable th) {
                                parcelObtain.recycle();
                                throw th;
                            }
                        } catch (IOException e6) {
                            zzo.zzh("Could not read from parcel file descriptor", e6);
                            i3.f.a(dataInputStream);
                        }
                    } catch (Throwable th2) {
                        i3.f.a(dataInputStream);
                        throw th2;
                    }
                }
                cVar = null;
            } else {
                cVar = (f3.c) p30Var.f7917t;
            }
            iv ivVar = (iv) cVar;
            if (ivVar == null) {
                return null;
            }
            if (ivVar.s) {
                throw new xb(ivVar.f5855t);
            }
            if (ivVar.f5858w.length != ivVar.f5859x.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = ivVar.f5858w;
                if (i6 >= strArr3.length) {
                    return new lb(ivVar.f5856u, ivVar.f5857v, map, lb.a(map), ivVar.f5860y);
                }
                map.put(strArr3[i6], ivVar.f5859x[i6]);
                i6++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzv.zzC().b() - jB) + "ms");
            return null;
        } catch (Throwable th3) {
            zze.zza("Http assets remote cache took " + (zzv.zzC().b() - jB) + "ms");
            throw th3;
        }
    }
}
