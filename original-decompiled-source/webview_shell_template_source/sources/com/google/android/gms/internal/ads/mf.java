package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mf {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7108c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f7109a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b, reason: collision with root package name */
    public final ff f7110b;

    @Deprecated
    public mf(ff ffVar) {
        this.f7110b = ffVar;
    }

    public static Uri d(Uri uri, String str) throws nf {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new nf("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i6 = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i6) + "dc_ms=" + str + ";" + string.substring(i6));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new nf("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i7 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i7) + "ms=" + str + "&" + string2.substring(i7));
        } catch (UnsupportedOperationException unused2) {
            throw new nf("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) throws nf {
        try {
            return d(uri, this.f7110b.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new nf("Provided Uri is not in a valid state");
        }
    }

    public final boolean b(Uri uri) {
        if (c(uri)) {
            for (int i6 = 0; i6 < 3; i6++) {
                if (uri.getPath().endsWith(f7108c[i6])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f7109a;
            for (int i6 = 0; i6 < 3; i6++) {
                if (host.endsWith(strArr[i6])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
