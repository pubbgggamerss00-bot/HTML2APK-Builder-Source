package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p30 extends f3.a {
    public static final Parcelable.Creator<p30> CREATOR = new q30();
    public ParcelFileDescriptor s;

    /* renamed from: t, reason: collision with root package name */
    public Parcelable f7917t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7918u = true;

    public p30(ParcelFileDescriptor parcelFileDescriptor) {
        this.s = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) throws IOException {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.s == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f7917t.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                } catch (IOException e6) {
                    e = e6;
                    autoCloseOutputStream = null;
                }
                try {
                    i70.f5586a.execute(new o30(0, autoCloseOutputStream, bArrMarshall));
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                } catch (IOException e7) {
                    e = e7;
                    zzo.zzh("Error transporting the ad response", e);
                    zzv.zzp().h("LargeParcelTeleporter.pipeData.2", e);
                    i3.f.a(autoCloseOutputStream);
                    this.s = parcelFileDescriptor;
                    int iS = e5.i.s(20293, parcel);
                    e5.i.l(parcel, 2, this.s, i6);
                    e5.i.t(iS, parcel);
                }
                this.s = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iS2 = e5.i.s(20293, parcel);
        e5.i.l(parcel, 2, this.s, i6);
        e5.i.t(iS2, parcel);
    }
}
