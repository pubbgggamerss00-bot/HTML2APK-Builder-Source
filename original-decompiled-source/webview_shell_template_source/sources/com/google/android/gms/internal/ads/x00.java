package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10323t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z00 f10324u;

    public x00(z00 z00Var, String str, String str2) {
        this.s = str;
        this.f10323t = str2;
        this.f10324u = z00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) throws JSONException {
        z00 z00Var = this.f10324u;
        DownloadManager downloadManager = (DownloadManager) z00Var.f11122v.getSystemService("download");
        try {
            String str = this.s;
            String str2 = this.f10323t;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzv.zzq();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            z00Var.m("Could not store picture.");
        }
    }
}
