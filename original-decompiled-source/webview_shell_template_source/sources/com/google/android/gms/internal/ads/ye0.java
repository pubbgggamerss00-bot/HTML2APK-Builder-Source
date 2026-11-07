package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10935a;

    public /* synthetic */ ye0(int i6) {
        this.f10935a = i6;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws IOException {
        switch (this.f10935a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) zzbe.zzc().a(zn.na)).booleanValue()) {
                    zzv.zzp().i("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    zzv.zzp().g("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                zn1 zn1Var = bo1.f3236t;
                return bs1.m(new r1.b(cp1.f3636w));
            case 1:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                i70.f5586a.execute(new wx(10, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return bs1.m(parcelFileDescriptor);
            case 2:
                z2.b bVar = (z2.b) obj;
                return bVar == null ? bs1.m(new x51(null, -1, 0)) : bs1.m(new x51(bVar.f15428a, bVar.f15429b, 0));
            case 3:
                z2.b bVar2 = (z2.b) obj;
                return bVar2 == null ? bs1.m(new x51(null, -1, 1)) : bs1.m(new x51(bVar2.f15428a, bVar2.f15429b, 1));
            default:
                return ds1.f4001t;
        }
    }
}
