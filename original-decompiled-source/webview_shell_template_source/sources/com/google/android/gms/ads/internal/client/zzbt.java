package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.bw;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.yr;
import com.google.android.gms.internal.ads.zr;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbt extends sh implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        fs dsVar;
        zzbl zzbjVar = null;
        jw iwVar = null;
        ms ksVar = null;
        js hsVar = null;
        zzcq zzcqVar = null;
        cs zrVar = null;
        yr xrVar = null;
        wr vrVar = null;
        switch (i6) {
            case 1:
                zzbr zzbrVarZze = zze();
                parcel2.writeNoException();
                th.e(parcel2, zzbrVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                th.b(parcel);
                zzl(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    vrVar = iInterfaceQueryLocalInterface2 instanceof wr ? (wr) iInterfaceQueryLocalInterface2 : new vr(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                th.b(parcel);
                zzf(vrVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    xrVar = iInterfaceQueryLocalInterface3 instanceof yr ? (yr) iInterfaceQueryLocalInterface3 : new xr(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                th.b(parcel);
                zzg(xrVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    dsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    dsVar = iInterfaceQueryLocalInterface4 instanceof fs ? (fs) iInterfaceQueryLocalInterface4 : new ds(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    zrVar = iInterfaceQueryLocalInterface5 instanceof cs ? (cs) iInterfaceQueryLocalInterface5 : new zr(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                th.b(parcel);
                zzh(string, dsVar, zrVar);
                parcel2.writeNoException();
                return true;
            case 6:
                oq oqVar = (oq) th.a(parcel, oq.CREATOR);
                th.b(parcel);
                zzo(oqVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface6 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface6 : new zzcq(strongBinder6);
                }
                th.b(parcel);
                zzq(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    hsVar = iInterfaceQueryLocalInterface7 instanceof js ? (js) iInterfaceQueryLocalInterface7 : new hs(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzs zzsVar = (zzs) th.a(parcel, zzs.CREATOR);
                th.b(parcel);
                zzj(hsVar, zzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) th.a(parcel, PublisherAdViewOptions.CREATOR);
                th.b(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    ksVar = iInterfaceQueryLocalInterface8 instanceof ms ? (ms) iInterfaceQueryLocalInterface8 : new ks(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                th.b(parcel);
                zzk(ksVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                bw bwVar = (bw) th.a(parcel, bw.CREATOR);
                th.b(parcel);
                zzn(bwVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    iwVar = iInterfaceQueryLocalInterface9 instanceof jw ? (jw) iInterfaceQueryLocalInterface9 : new iw(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                th.b(parcel);
                zzi(iwVar);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) th.a(parcel, AdManagerAdViewOptions.CREATOR);
                th.b(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
