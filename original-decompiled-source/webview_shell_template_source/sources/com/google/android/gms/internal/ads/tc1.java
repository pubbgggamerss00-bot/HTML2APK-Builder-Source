package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tc1 {
    public static zze a(Throwable th) {
        if (th instanceof d01) {
            d01 d01Var = (d01) th;
            return c(d01Var.s, d01Var.f3708t);
        }
        if (th instanceof gw0) {
            return th.getMessage() == null ? d(((gw0) th).s, null, null) : d(((gw0) th).s, th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return d(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        int iZza = zzbaVar.zza();
        String message = zzbaVar.getMessage();
        if (message == null) {
            message = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zze(iZza, message, MobileAds.ERROR_DOMAIN, null, null);
    }

    public static zze b(Throwable th, e01 e01Var) {
        zze zzeVar;
        zze zzeVarA = a(th);
        int i6 = zzeVarA.zza;
        if ((i6 == 3 || i6 == 0) && (zzeVar = zzeVarA.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarA.zzd = null;
        }
        if (e01Var != null) {
            zzeVarA.zze = new mk0(e01Var.f4071e, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e01Var, e01Var.f4070d, e01Var.f4069c);
        }
        return zzeVarA;
    }

    public static zze c(int i6, zze zzeVar) {
        if (i6 == 0) {
            throw null;
        }
        if (i6 == 8) {
            if (((Integer) zzbe.zzc().a(zn.f8)).intValue() > 0) {
                return zzeVar;
            }
            i6 = 8;
        }
        return d(i6, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zze d(int i6, String str, zze zzeVar) {
        String str2;
        int i7 = i6 - 1;
        if (str == null) {
            if (i6 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i7) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) zzbe.zzc().a(zn.i8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i6 == 0) {
            throw null;
        }
        int i8 = 0;
        int i9 = 2;
        switch (i7) {
            case 0:
            case 11:
            case 15:
                i9 = i8;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i9 = 1;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i9 = 3;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i8 = 8;
                i9 = i8;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i8 = 4;
                i9 = i8;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) zzbe.zzc().a(zn.i8)).intValue() <= 0) {
                    i8 = 9;
                    i9 = i8;
                    return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                i9 = 3;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i8 = 10;
                i9 = i8;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i8 = 11;
                i9 = i8;
                return new zze(i9, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i6) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
