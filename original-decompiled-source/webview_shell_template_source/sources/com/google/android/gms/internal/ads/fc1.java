package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fc1 {

    /* renamed from: a, reason: collision with root package name */
    public final mf f4606a;

    public fc1(mf mfVar) {
        this.f4606a = mfVar;
    }

    public static final Uri b(Uri uri, String str) throws nf {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new nf("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i6 = iIndexOf + 1;
                                StringBuilder sb = new StringBuilder(string.substring(0, i6));
                                sb.append("dc_ms=");
                                sb.append(str);
                                sb.append(";");
                                sb.append((CharSequence) string, i6, string.length());
                                return Uri.parse(sb.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb2.append(";dc_ms=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb2.toString());
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new nf("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
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
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i7));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) string2, i7, string2.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws nf {
        try {
            return b(uri, this.f4606a.f7110b.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new nf("Provided Uri is not in a valid state");
        }
    }
}
