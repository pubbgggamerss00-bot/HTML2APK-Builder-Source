package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xj extends f3.a {
    public static final Parcelable.Creator<xj> CREATOR = new yj();
    public String A;
    public int B;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10610t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10611u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10612v;

    /* renamed from: w, reason: collision with root package name */
    public final String f10613w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f10614x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10615y;

    /* renamed from: z, reason: collision with root package name */
    public long f10616z;

    public xj(String str, long j6, String str2, String str3, String str4, Bundle bundle, boolean z6, long j7, String str5, int i6) {
        this.s = str;
        this.f10610t = j6;
        this.f10611u = str2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        this.f10612v = str3 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3;
        this.f10613w = str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4;
        this.f10614x = bundle == null ? new Bundle() : bundle;
        this.f10615y = z6;
        this.f10616z = j7;
        this.A = str5;
        this.B = i6;
    }

    public static xj l(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                zzo.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j6 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new xj(queryParameter, j6, host, str, str2, bundle, zEquals, 0L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        } catch (NullPointerException e6) {
            e = e6;
            zzo.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e7) {
            e = e7;
            zzo.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 2, this.s);
        e5.i.r(parcel, 3, 8);
        parcel.writeLong(this.f10610t);
        e5.i.m(parcel, 4, this.f10611u);
        e5.i.m(parcel, 5, this.f10612v);
        e5.i.m(parcel, 6, this.f10613w);
        e5.i.i(parcel, 7, this.f10614x);
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(this.f10615y ? 1 : 0);
        long j6 = this.f10616z;
        e5.i.r(parcel, 9, 8);
        parcel.writeLong(j6);
        e5.i.m(parcel, 10, this.A);
        int i7 = this.B;
        e5.i.r(parcel, 11, 4);
        parcel.writeInt(i7);
        e5.i.t(iS, parcel);
    }
}
